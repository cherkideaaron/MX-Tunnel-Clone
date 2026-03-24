package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import org.achartengine.renderer.DefaultRenderer;

/* loaded from: classes.dex */
public final class IO extends Q6 {
    public final HO h;
    public final Path i;
    public final RectF j;
    public float[] k;
    public final Path l;
    public final float[] m;
    public final RectF n;

    public IO(C2832iM c2832iM, HO ho, C3121nk c3121nk) {
        super(c2832iM, c3121nk, ho);
        this.i = new Path();
        this.j = new RectF();
        this.k = new float[2];
        new Path();
        new RectF();
        this.l = new Path();
        this.m = new float[2];
        this.n = new RectF();
        this.h = ho;
        if (c2832iM != null) {
            this.e.setColor(DefaultRenderer.BACKGROUND_COLOR);
            this.e.setTextSize(AbstractC2831iL.c(10.0f));
            Paint paint = new Paint(1);
            paint.setColor(-7829368);
            paint.setStrokeWidth(1.0f);
            paint.setStyle(Paint.Style.STROKE);
        }
    }

    public final float[] f() {
        int length = this.k.length;
        HO ho = this.h;
        int i = ho.j;
        if (length != i * 2) {
            this.k = new float[i * 2];
        }
        float[] fArr = this.k;
        for (int i2 = 0; i2 < fArr.length; i2 += 2) {
            fArr[i2 + 1] = ho.i[i2 / 2];
        }
        this.c.f(fArr);
        return fArr;
    }

    public final void g(Canvas canvas) {
        float f;
        float f2;
        float f3;
        HO ho = this.h;
        if (ho.a && ho.p) {
            float[] fArrF = f();
            Paint paint = this.e;
            paint.setTypeface(ho.d);
            paint.setTextSize(ho.e);
            paint.setColor(ho.f);
            float f4 = ho.b;
            float fA = (AbstractC2831iL.a(paint, "A") / 2.5f) + ho.c;
            int i = ho.C;
            int i2 = ho.B;
            C2832iM c2832iM = (C2832iM) this.a;
            if (i == 1) {
                if (i2 == 1) {
                    paint.setTextAlign(Paint.Align.RIGHT);
                    f = c2832iM.b.left;
                    f3 = f - f4;
                } else {
                    paint.setTextAlign(Paint.Align.LEFT);
                    f2 = c2832iM.b.left;
                    f3 = f2 + f4;
                }
            } else if (i2 == 1) {
                paint.setTextAlign(Paint.Align.LEFT);
                f2 = c2832iM.b.right;
                f3 = f2 + f4;
            } else {
                paint.setTextAlign(Paint.Align.RIGHT);
                f = c2832iM.b.right;
                f3 = f - f4;
            }
            for (int i3 = 0; i3 < ho.j; i3++) {
                String str = (i3 < 0 || i3 >= ho.i.length) ? "" : ho.d().a.format(ho.i[i3]);
                if (!ho.y && i3 >= ho.j - 1) {
                    return;
                }
                canvas.drawText(str, f3, fArrF[(i3 * 2) + 1] + fA, paint);
            }
        }
    }

    public final void h(Canvas canvas) {
        RectF rectF;
        float f;
        float f2;
        HO ho = this.h;
        if (ho.a && ho.o) {
            Paint paint = this.f;
            paint.setColor(ho.h);
            paint.setStrokeWidth(1.0f);
            int i = ho.C;
            C2832iM c2832iM = (C2832iM) this.a;
            if (i == 1) {
                rectF = c2832iM.b;
                f = rectF.left;
                f2 = rectF.top;
            } else {
                rectF = c2832iM.b;
                f = rectF.right;
                f2 = rectF.top;
            }
            canvas.drawLine(f, f2, f, rectF.bottom, paint);
        }
    }

    public final void i(Canvas canvas) {
        HO ho = this.h;
        if (ho.a && ho.n) {
            int iSave = canvas.save();
            RectF rectF = this.j;
            C2832iM c2832iM = (C2832iM) this.a;
            rectF.set(c2832iM.b);
            this.b.getClass();
            rectF.inset(0.0f, -0.5f);
            canvas.clipRect(rectF);
            float[] fArrF = f();
            Paint paint = this.d;
            paint.setColor(-7829368);
            paint.setStrokeWidth(1.0f);
            paint.setPathEffect(ho.q);
            Path path = this.i;
            path.reset();
            for (int i = 0; i < fArrF.length; i += 2) {
                int i2 = i + 1;
                path.moveTo(c2832iM.b.left, fArrF[i2]);
                path.lineTo(c2832iM.b.right, fArrF[i2]);
                canvas.drawPath(path, paint);
                path.reset();
            }
            canvas.restoreToCount(iSave);
        }
    }

    public final void j(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        ArrayList arrayList = this.h.r;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        float[] fArr = this.m;
        int i = 0;
        float f5 = 0.0f;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        Path path = this.l;
        path.reset();
        while (i < arrayList.size()) {
            Ur ur = (Ur) arrayList.get(i);
            if (ur.a) {
                int iSave = canvas.save();
                RectF rectF = this.n;
                C2832iM c2832iM = (C2832iM) this.a;
                rectF.set(c2832iM.b);
                rectF.inset(f5, (-ur.h) / 2.0f);
                canvas.clipRect(rectF);
                Paint paint = this.g;
                paint.setStyle(Paint.Style.STROKE);
                paint.setColor(ur.i);
                paint.setStrokeWidth(ur.h);
                paint.setPathEffect(ur.l);
                fArr[1] = ur.g;
                this.c.f(fArr);
                path.moveTo(c2832iM.b.left, fArr[1]);
                path.lineTo(c2832iM.b.right, fArr[1]);
                canvas.drawPath(path, paint);
                path.reset();
                String str = ur.k;
                if (str != null && !str.equals("")) {
                    paint.setStyle(ur.j);
                    paint.setPathEffect(null);
                    paint.setColor(ur.f);
                    paint.setTypeface(ur.d);
                    paint.setStrokeWidth(0.5f);
                    paint.setTextSize(ur.e);
                    float fA = AbstractC2831iL.a(paint, str);
                    float fC = AbstractC2831iL.c(4.0f) + ur.b;
                    float f6 = ur.h + fA + ur.c;
                    int i2 = ur.m;
                    if (i2 == 3) {
                        paint.setTextAlign(Paint.Align.RIGHT);
                        f = c2832iM.b.right - fC;
                        f3 = fArr[1];
                    } else {
                        if (i2 == 4) {
                            paint.setTextAlign(Paint.Align.RIGHT);
                            f = c2832iM.b.right - fC;
                            f2 = fArr[1];
                        } else if (i2 == 1) {
                            paint.setTextAlign(Paint.Align.LEFT);
                            f = c2832iM.b.left + fC;
                            f3 = fArr[1];
                        } else {
                            paint.setTextAlign(Paint.Align.LEFT);
                            f = c2832iM.b.left + fC;
                            f2 = fArr[1];
                        }
                        f4 = f2 + f6;
                        canvas.drawText(str, f, f4, paint);
                    }
                    f4 = (f3 - f6) + fA;
                    canvas.drawText(str, f, f4, paint);
                }
                canvas.restoreToCount(iSave);
            }
            i++;
            f5 = 0.0f;
        }
    }
}
