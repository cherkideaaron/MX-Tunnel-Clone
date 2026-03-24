package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.mxtunnel.pro.R;

/* renamed from: Mj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0226Mj extends AnimatorListenerAdapter implements OJ {
    public final View a;
    public boolean b = false;

    public C0226Mj(View view) {
        this.a = view;
    }

    @Override // defpackage.OJ
    public final void a(PJ pj) {
        throw null;
    }

    @Override // defpackage.OJ
    public final void b() {
        View view = this.a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? AbstractC3215pM.a.t(view) : 0.0f));
    }

    @Override // defpackage.OJ
    public final void c(PJ pj) {
        throw null;
    }

    @Override // defpackage.OJ
    public final void e(PJ pj) {
    }

    @Override // defpackage.OJ
    public final void f() {
        this.a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        AbstractC3215pM.a.J(this.a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.b;
        View view = this.a;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        C3594wM c3594wM = AbstractC3215pM.a;
        c3594wM.J(view, 1.0f);
        c3594wM.getClass();
    }

    @Override // defpackage.OJ
    public final void d(PJ pj) {
    }

    @Override // defpackage.OJ
    public final void g(PJ pj) {
    }
}
