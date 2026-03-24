package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: Tj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0345Tj extends AnimatorListenerAdapter {
    public boolean a = false;
    public final /* synthetic */ C0362Uj b;

    public C0345Tj(C0362Uj c0362Uj) {
        this.b = c0362Uj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            this.a = false;
            return;
        }
        C0362Uj c0362Uj = this.b;
        if (((Float) c0362Uj.z.getAnimatedValue()).floatValue() == 0.0f) {
            c0362Uj.A = 0;
            c0362Uj.f(0);
        } else {
            c0362Uj.A = 2;
            c0362Uj.s.invalidate();
        }
    }
}
