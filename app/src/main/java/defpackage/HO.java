package defpackage;

import android.graphics.Paint;
import android.util.DisplayMetrics;

/* loaded from: classes.dex */
public final class HO extends P6 {
    public final int C;
    public final boolean y = true;
    public final float z = 10.0f;
    public final float A = 10.0f;
    public final int B = 1;
    public final float D = Float.POSITIVE_INFINITY;

    public HO(int i) {
        this.C = i;
        this.c = 0.0f;
    }

    @Override // defpackage.P6
    public final void b(float f, float f2) {
        if (this.t) {
            f = this.w;
        }
        if (this.u) {
            f2 = this.v;
        }
        float fAbs = Math.abs(f2 - f);
        if (fAbs == 0.0f) {
            f2 += 1.0f;
            f -= 1.0f;
        }
        if (!this.t) {
            this.w = f - ((fAbs / 100.0f) * this.A);
        }
        if (!this.u) {
            this.v = ((fAbs / 100.0f) * this.z) + f2;
        }
        this.x = Math.abs(this.v - this.w);
    }

    public final float e(Paint paint) {
        paint.setTextSize(this.e);
        String strC = c();
        DisplayMetrics displayMetrics = AbstractC2831iL.a;
        float fMeasureText = (this.b * 2.0f) + ((int) paint.measureText(strC));
        float fC = this.D;
        if (fC > 0.0f && fC != Float.POSITIVE_INFINITY) {
            fC = AbstractC2831iL.c(fC);
        }
        if (fC <= 0.0d) {
            fC = fMeasureText;
        }
        return Math.max(0.0f, Math.min(fMeasureText, fC));
    }
}
