package defpackage;

import android.animation.TimeInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: or, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class InterpolatorC3183or implements Interpolator {
    public final TimeInterpolator a;
    public float[] b;

    public InterpolatorC3183or(PathInterpolator pathInterpolator, float... fArr) {
        this.a = pathInterpolator;
        this.b = fArr;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        int length = this.b.length;
        TimeInterpolator timeInterpolator = this.a;
        if (length > 1) {
            int i = 0;
            while (true) {
                float[] fArr = this.b;
                if (i >= fArr.length - 1) {
                    break;
                }
                float f2 = fArr[i];
                i++;
                float f3 = fArr[i];
                float f4 = f3 - f2;
                if (f >= f2 && f <= f3) {
                    return (timeInterpolator.getInterpolation((f - f2) / f4) * f4) + f2;
                }
            }
        }
        return timeInterpolator.getInterpolation(f);
    }
}
