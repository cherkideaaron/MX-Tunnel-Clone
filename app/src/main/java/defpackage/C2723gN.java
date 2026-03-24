package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* renamed from: gN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2723gN implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C3106nN a;
    public final /* synthetic */ AN b;
    public final /* synthetic */ AN c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public C2723gN(C3106nN c3106nN, AN an, AN an2, int i, View view) {
        this.a = c3106nN;
        this.b = an;
        this.c = an2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        C3106nN c3106nN;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C3106nN c3106nN2 = this.a;
        c3106nN2.a.d(animatedFraction);
        float fB = c3106nN2.a.b();
        PathInterpolator pathInterpolator = C2833iN.e;
        int i = Build.VERSION.SDK_INT;
        AN an = this.b;
        AbstractC3325rN c3271qN = i >= 30 ? new C3271qN(an) : i >= 29 ? new C3216pN(an) : new C3161oN(an);
        int i2 = 1;
        while (i2 <= 256) {
            if ((this.d & i2) == 0) {
                c3271qN.c(i2, an.a.f(i2));
                f = fB;
                c3106nN = c3106nN2;
            } else {
                C0130Gp c0130GpF = an.a.f(i2);
                C0130Gp c0130GpF2 = this.c.a.f(i2);
                int i3 = (int) (((c0130GpF.a - c0130GpF2.a) * r10) + 0.5d);
                int i4 = (int) (((c0130GpF.b - c0130GpF2.b) * r10) + 0.5d);
                f = fB;
                int i5 = (int) (((c0130GpF.c - c0130GpF2.c) * r10) + 0.5d);
                float f2 = (c0130GpF.d - c0130GpF2.d) * (1.0f - fB);
                c3106nN = c3106nN2;
                c3271qN.c(i2, AN.e(c0130GpF, i3, i4, i5, (int) (f2 + 0.5d)));
            }
            i2 <<= 1;
            fB = f;
            c3106nN2 = c3106nN;
        }
        C2833iN.g(this.e, c3271qN.b(), Collections.singletonList(c3106nN2));
    }
}
