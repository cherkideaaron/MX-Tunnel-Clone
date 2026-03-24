package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes2.dex */
public final /* synthetic */ class X9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractC0276Pi b;

    public /* synthetic */ X9(AbstractC0276Pi abstractC0276Pi, int i) {
        this.a = i;
        this.b = abstractC0276Pi;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                Z9 z9 = (Z9) this.b;
                z9.getClass();
                z9.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                Z9 z92 = (Z9) this.b;
                z92.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = z92.d;
                checkableImageButton.setScaleX(fFloatValue);
                checkableImageButton.setScaleY(fFloatValue);
                break;
            default:
                C0122Gh c0122Gh = (C0122Gh) this.b;
                c0122Gh.getClass();
                c0122Gh.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
