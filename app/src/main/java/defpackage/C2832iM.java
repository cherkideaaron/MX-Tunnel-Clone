package defpackage;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;

/* renamed from: iM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2832iM {
    public final Matrix a = new Matrix();
    public final RectF b = new RectF();
    public float c = 0.0f;
    public float d = 0.0f;
    public final float e = 1.0f;
    public float f = Float.MAX_VALUE;
    public float g = 1.0f;
    public float h = Float.MAX_VALUE;
    public float i = 1.0f;
    public float j = 1.0f;
    public float k = 0.0f;
    public float l = 0.0f;
    public float m = 0.0f;
    public final Matrix n = new Matrix();
    public final float[] o = new float[9];

    public final boolean a(float f) {
        return this.b.left <= f + 1.0f;
    }

    public final boolean b(float f) {
        return this.b.right >= (((float) ((int) (f * 100.0f))) / 100.0f) - 1.0f;
    }

    public final void c(Matrix matrix, RectF rectF) {
        float fWidth;
        float fHeight;
        float[] fArr = this.o;
        matrix.getValues(fArr);
        float f = fArr[2];
        float f2 = fArr[0];
        float f3 = fArr[5];
        float f4 = fArr[4];
        this.i = Math.min(Math.max(this.g, f2), this.h);
        this.j = Math.min(Math.max(this.e, f4), this.f);
        if (rectF != null) {
            fWidth = rectF.width();
            fHeight = rectF.height();
        } else {
            fWidth = 0.0f;
            fHeight = 0.0f;
        }
        this.k = Math.min(Math.max(f, ((this.i - 1.0f) * (-fWidth)) - this.l), this.l);
        float fMax = Math.max(Math.min(f3, ((this.j - 1.0f) * fHeight) + this.m), -this.m);
        fArr[2] = this.k;
        fArr[0] = this.i;
        fArr[5] = fMax;
        fArr[4] = this.j;
        matrix.setValues(fArr);
    }

    public final void d(Matrix matrix, View view, boolean z) {
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        c(matrix2, this.b);
        if (z) {
            view.invalidate();
        }
        matrix.set(matrix2);
    }

    public final void e(float f) {
        if (f == 0.0f) {
            f = Float.MAX_VALUE;
        }
        this.h = f;
        c(this.a, this.b);
    }
}
