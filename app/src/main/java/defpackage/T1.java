package defpackage;

import android.animation.TypeEvaluator;

/* loaded from: classes.dex */
public final class T1 implements TypeEvaluator {
    public Oy[] a;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        Oy[] oyArr = (Oy[]) obj;
        Oy[] oyArr2 = (Oy[]) obj2;
        if (!AbstractC0500aq.e(oyArr, oyArr2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (!AbstractC0500aq.e(this.a, oyArr)) {
            this.a = AbstractC0500aq.x(oyArr);
        }
        for (int i = 0; i < oyArr.length; i++) {
            Oy oy = this.a[i];
            Oy oy2 = oyArr[i];
            Oy oy3 = oyArr2[i];
            oy.getClass();
            oy.a = oy2.a;
            int i2 = 0;
            while (true) {
                float[] fArr = oy2.b;
                if (i2 < fArr.length) {
                    oy.b[i2] = (oy3.b[i2] * f) + ((1.0f - f) * fArr[i2]);
                    i2++;
                }
            }
        }
        return this.a;
    }
}
