package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* renamed from: j7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2870j7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractC3309r7 b;

    public /* synthetic */ C2870j7(AbstractC3309r7 abstractC3309r7, int i) {
        this.a = i;
        this.b = abstractC3309r7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.c();
                break;
            case 1:
                this.b.d();
                break;
            case 2:
                this.b.c();
                break;
            default:
                this.b.d();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                AbstractC3309r7 abstractC3309r7 = this.b;
                InterfaceC3278qc interfaceC3278qc = abstractC3309r7.j;
                int i = abstractC3309r7.c;
                int i2 = abstractC3309r7.a;
                int i3 = i - i2;
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) interfaceC3278qc;
                snackbarContentLayout.a.setAlpha(0.0f);
                long j = i2;
                ViewPropertyAnimator duration = snackbarContentLayout.a.animate().alpha(1.0f).setDuration(j);
                TimeInterpolator timeInterpolator = snackbarContentLayout.c;
                long j2 = i3;
                duration.setInterpolator(timeInterpolator).setStartDelay(j2).start();
                if (snackbarContentLayout.b.getVisibility() == 0) {
                    snackbarContentLayout.b.setAlpha(0.0f);
                    snackbarContentLayout.b.animate().alpha(1.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j2).start();
                    break;
                }
                break;
            case 2:
                AbstractC3309r7 abstractC3309r72 = this.b;
                InterfaceC3278qc interfaceC3278qc2 = abstractC3309r72.j;
                int i4 = abstractC3309r72.b;
                SnackbarContentLayout snackbarContentLayout2 = (SnackbarContentLayout) interfaceC3278qc2;
                snackbarContentLayout2.a.setAlpha(1.0f);
                long j3 = i4;
                ViewPropertyAnimator duration2 = snackbarContentLayout2.a.animate().alpha(0.0f).setDuration(j3);
                TimeInterpolator timeInterpolator2 = snackbarContentLayout2.c;
                long j4 = 0;
                duration2.setInterpolator(timeInterpolator2).setStartDelay(j4).start();
                if (snackbarContentLayout2.b.getVisibility() == 0) {
                    snackbarContentLayout2.b.setAlpha(1.0f);
                    snackbarContentLayout2.b.animate().alpha(0.0f).setDuration(j3).setInterpolator(timeInterpolator2).setStartDelay(j4).start();
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ C2870j7(AbstractC3309r7 abstractC3309r7, int i, int i2) {
        this.a = i2;
        this.b = abstractC3309r7;
    }
}
