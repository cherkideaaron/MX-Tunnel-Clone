package defpackage;

import android.animation.ValueAnimator;

/* renamed from: k7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2925k7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractC3309r7 b;

    public /* synthetic */ C2925k7(AbstractC3309r7 abstractC3309r7, int i) {
        this.a = i;
        this.b = abstractC3309r7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                AbstractC3309r7 abstractC3309r7 = this.b;
                abstractC3309r7.i.setScaleX(fFloatValue);
                abstractC3309r7.i.setScaleY(fFloatValue);
                break;
            case 2:
                this.b.i.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            default:
                this.b.i.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }
}
