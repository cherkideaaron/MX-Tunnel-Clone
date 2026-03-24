package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: Tf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0341Tf extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0358Uf b;
    public final /* synthetic */ ViewPropertyAnimator c;
    public final /* synthetic */ View d;
    public final /* synthetic */ C0392Wf e;

    public /* synthetic */ C0341Tf(C0392Wf c0392Wf, C0358Uf c0358Uf, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.a = i;
        this.e = c0392Wf;
        this.b = c0358Uf;
        this.c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C0358Uf c0358Uf = this.b;
                JB jb = c0358Uf.a;
                C0392Wf c0392Wf = this.e;
                c0392Wf.c(jb);
                c0392Wf.r.remove(c0358Uf.a);
                c0392Wf.i();
                break;
            default:
                this.c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C0358Uf c0358Uf2 = this.b;
                JB jb2 = c0358Uf2.b;
                C0392Wf c0392Wf2 = this.e;
                c0392Wf2.c(jb2);
                c0392Wf2.r.remove(c0358Uf2.b);
                c0392Wf2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                JB jb = this.b.a;
                this.e.getClass();
                break;
            default:
                JB jb2 = this.b.b;
                this.e.getClass();
                break;
        }
    }
}
