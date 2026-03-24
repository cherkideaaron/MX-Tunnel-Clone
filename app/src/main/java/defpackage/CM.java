package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.mxtunnel.pro.R;

/* loaded from: classes.dex */
public final class CM extends AnimatorListenerAdapter implements OJ {
    public final ViewGroup a;
    public final View b;
    public final View c;
    public boolean d = true;
    public final /* synthetic */ C0243Nj e;

    public CM(C0243Nj c0243Nj, ViewGroup viewGroup, View view, View view2) {
        this.e = c0243Nj;
        this.a = viewGroup;
        this.b = view;
        this.c = view2;
    }

    @Override // defpackage.OJ
    public final void a(PJ pj) {
        throw null;
    }

    @Override // defpackage.OJ
    public final void c(PJ pj) {
        pj.y(this);
    }

    @Override // defpackage.OJ
    public final void d(PJ pj) {
    }

    @Override // defpackage.OJ
    public final void e(PJ pj) {
        pj.y(this);
    }

    @Override // defpackage.OJ
    public final void g(PJ pj) {
        if (this.d) {
            h();
        }
    }

    public final void h() {
        this.c.setTag(R.id.save_overlay_view, null);
        this.a.getOverlay().remove(this.b);
        this.d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.a.getOverlay().remove(this.b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.b;
        if (view.getParent() == null) {
            this.a.getOverlay().add(view);
        } else {
            this.e.d();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.c;
            View view2 = this.b;
            view.setTag(R.id.save_overlay_view, view2);
            this.a.getOverlay().add(view2);
            this.d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        h();
    }

    @Override // defpackage.OJ
    public final void b() {
    }

    @Override // defpackage.OJ
    public final void f() {
    }
}
