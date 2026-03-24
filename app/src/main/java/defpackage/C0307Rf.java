package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: Rf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0307Rf extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ JB b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ C0392Wf e;

    public C0307Rf(C0392Wf c0392Wf, JB jb, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = c0392Wf;
        this.b = jb;
        this.c = view;
        this.d = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.d.setListener(null);
                this.c.setAlpha(1.0f);
                C0392Wf c0392Wf = this.e;
                JB jb = this.b;
                c0392Wf.c(jb);
                c0392Wf.q.remove(jb);
                c0392Wf.i();
                break;
            default:
                this.d.setListener(null);
                C0392Wf c0392Wf2 = this.e;
                JB jb2 = this.b;
                c0392Wf2.c(jb2);
                c0392Wf2.o.remove(jb2);
                c0392Wf2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.e.getClass();
                break;
            default:
                this.e.getClass();
                break;
        }
    }

    public C0307Rf(C0392Wf c0392Wf, JB jb, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = c0392Wf;
        this.b = jb;
        this.d = viewPropertyAnimator;
        this.c = view;
    }
}
