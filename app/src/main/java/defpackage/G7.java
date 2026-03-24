package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes2.dex */
public final class G7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ G7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C2638eu c2638eu = ((BottomSheetBehavior) this.b).i;
                if (c2638eu != null) {
                    C2529cu c2529cu = c2638eu.b;
                    if (c2529cu.k != fFloatValue) {
                        c2529cu.k = fFloatValue;
                        c2638eu.f = true;
                        c2638eu.m = true;
                        c2638eu.invalidateSelf();
                        break;
                    }
                }
                break;
            case 1:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C0362Uj c0362Uj = (C0362Uj) this.b;
                c0362Uj.c.setAlpha(iFloatValue);
                c0362Uj.d.setAlpha(iFloatValue);
                c0362Uj.s.invalidate();
                break;
            default:
                ((TextInputLayout) this.b).C0.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
