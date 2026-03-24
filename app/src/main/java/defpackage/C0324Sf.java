package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: Sf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0324Sf extends AnimatorListenerAdapter {
    public final /* synthetic */ JB a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ViewPropertyAnimator e;
    public final /* synthetic */ C0392Wf f;

    public C0324Sf(C0392Wf c0392Wf, JB jb, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f = c0392Wf;
        this.a = jb;
        this.b = i;
        this.c = view;
        this.d = i2;
        this.e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.b;
        View view = this.c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.e.setListener(null);
        C0392Wf c0392Wf = this.f;
        JB jb = this.a;
        c0392Wf.c(jb);
        c0392Wf.p.remove(jb);
        c0392Wf.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f.getClass();
    }
}
