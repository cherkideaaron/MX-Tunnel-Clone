package defpackage;

import android.graphics.Paint;
import android.graphics.RectF;
import org.achartengine.renderer.DefaultRenderer;

/* loaded from: classes.dex */
public abstract class Q6 extends Ew {
    public final P6 b;
    public final C3121nk c;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public final Paint g;

    public Q6(C2832iM c2832iM, C3121nk c3121nk, P6 p6) {
        super(c2832iM);
        this.c = c3121nk;
        this.b = p6;
        if (c2832iM != null) {
            this.e = new Paint(1);
            Paint paint = new Paint();
            this.d = paint;
            paint.setColor(-7829368);
            paint.setStrokeWidth(1.0f);
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            paint.setAlpha(90);
            Paint paint2 = new Paint();
            this.f = paint2;
            paint2.setColor(DefaultRenderer.BACKGROUND_COLOR);
            paint2.setStrokeWidth(1.0f);
            paint2.setStyle(style);
            Paint paint3 = new Paint(1);
            this.g = paint3;
            paint3.setStyle(style);
        }
    }

    public void d(float f, float f2) {
        C2832iM c2832iM = (C2832iM) this.a;
        if (c2832iM != null && c2832iM.b.width() > 10.0f) {
            float f3 = c2832iM.j;
            float f4 = c2832iM.e;
            if (f3 > f4 || f4 > 1.0f) {
                RectF rectF = c2832iM.b;
                float f5 = rectF.left;
                float f6 = rectF.top;
                C3121nk c3121nk = this.c;
                c3121nk.getClass();
                C3456tt c3456tt = (C3456tt) C3456tt.d.b();
                c3456tt.b = 0.0d;
                c3456tt.c = 0.0d;
                c3121nk.c(f5, f6, c3456tt);
                RectF rectF2 = c2832iM.b;
                float f7 = rectF2.left;
                float f8 = rectF2.bottom;
                C3456tt c3456tt2 = (C3456tt) C3456tt.d.b();
                c3456tt2.b = 0.0d;
                c3456tt2.c = 0.0d;
                c3121nk.c(f7, f8, c3456tt2);
                f = (float) c3456tt2.c;
                f2 = (float) c3456tt.c;
                C3456tt.d.c(c3456tt);
                C3456tt.d.c(c3456tt2);
            }
        }
        e(f, f2);
    }

    public void e(float f, float f2) {
        double dFloor;
        int i;
        float f3 = f;
        P6 p6 = this.b;
        int i2 = p6.l;
        double dAbs = Math.abs(f2 - f3);
        if (i2 == 0 || dAbs <= 0.0d || Double.isInfinite(dAbs)) {
            p6.i = new float[0];
            p6.j = 0;
            return;
        }
        double d = AbstractC2831iL.d(dAbs / i2);
        double d2 = AbstractC2831iL.d(Math.pow(10.0d, (int) Math.log10(d)));
        if (((int) (d / d2)) > 5) {
            d = Math.floor(d2 * 10.0d);
        }
        if (p6.m) {
            d = ((float) dAbs) / (i2 - 1);
            p6.j = i2;
            if (p6.i.length < i2) {
                p6.i = new float[i2];
            }
            for (int i3 = 0; i3 < i2; i3++) {
                p6.i[i3] = f3;
                f3 = (float) (f3 + d);
            }
        } else {
            double dCeil = d == 0.0d ? 0.0d : Math.ceil(f3 / d) * d;
            if (d == 0.0d) {
                dFloor = 0.0d;
            } else {
                dFloor = Math.floor(f2 / d) * d;
                if (dFloor != Double.POSITIVE_INFINITY) {
                    double d3 = dFloor + 0.0d;
                    dFloor = Double.longBitsToDouble(Double.doubleToRawLongBits(d3) + (d3 >= 0.0d ? 1L : -1L));
                }
            }
            if (d != 0.0d) {
                i = 0;
                for (double d4 = dCeil; d4 <= dFloor; d4 += d) {
                    i++;
                }
            } else {
                i = 0;
            }
            p6.j = i;
            if (p6.i.length < i) {
                p6.i = new float[i];
            }
            for (int i4 = 0; i4 < i; i4++) {
                if (dCeil == 0.0d) {
                    dCeil = 0.0d;
                }
                p6.i[i4] = (float) dCeil;
                dCeil += d;
            }
        }
        p6.k = d < 1.0d ? (int) Math.ceil(-Math.log10(d)) : 0;
    }
}
