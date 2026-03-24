package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;

/* renamed from: zO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3758zO extends Q6 {
    public C3704yO h;
    public Path i;
    public float[] j;
    public RectF k;
    public float[] l;
    public RectF m;
    public float[] n;
    public Path o;

    @Override // defpackage.Q6
    public final void d(float f, float f2) {
        C2832iM c2832iM = (C2832iM) this.a;
        if (c2832iM.b.width() > 10.0f) {
            float f3 = c2832iM.i;
            float f4 = c2832iM.g;
            if (!(f3 <= f4 && f4 <= 1.0f)) {
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
                float f7 = rectF2.right;
                float f8 = rectF2.top;
                C3456tt c3456tt2 = (C3456tt) C3456tt.d.b();
                c3456tt2.b = 0.0d;
                c3456tt2.c = 0.0d;
                c3121nk.c(f7, f8, c3456tt2);
                f = (float) c3456tt.b;
                f2 = (float) c3456tt2.b;
                C3456tt.d.c(c3456tt);
                C3456tt.d.c(c3456tt2);
            }
        }
        e(f, f2);
    }

    @Override // defpackage.Q6
    public final void e(float f, float f2) {
        super.e(f, f2);
        C3704yO c3704yO = this.h;
        String strC = c3704yO.c();
        Paint paint = this.e;
        paint.setTypeface(c3704yO.d);
        paint.setTextSize(c3704yO.e);
        C3770zj c3770zjB = AbstractC2831iL.b(paint, strC);
        float f3 = c3770zjB.b;
        float fA = AbstractC2831iL.a(paint, "Q");
        double d = 0.0f;
        float fAbs = Math.abs(((float) Math.sin(d)) * fA) + Math.abs(((float) Math.cos(d)) * f3);
        float fAbs2 = Math.abs(((float) Math.cos(d)) * fA) + Math.abs(((float) Math.sin(d)) * f3);
        C3770zj c3770zj = (C3770zj) C3770zj.d.b();
        c3770zj.b = fAbs;
        c3770zj.c = fAbs2;
        Math.round(f3);
        Math.round(fA);
        Math.round(c3770zj.b);
        c3704yO.y = Math.round(c3770zj.c);
        C3770zj.d.c(c3770zj);
        C3770zj.d.c(c3770zjB);
    }

    public final void f(Canvas canvas, float f, C3510ut c3510ut) {
        C3704yO c3704yO = this.h;
        c3704yO.getClass();
        int i = c3704yO.j * 2;
        float[] fArr = new float[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3 += 2) {
            fArr[i3] = c3704yO.i[i3 / 2];
        }
        this.c.f(fArr);
        int i4 = 0;
        while (i4 < i) {
            float f2 = fArr[i4];
            C2832iM c2832iM = (C2832iM) this.a;
            if (c2832iM.a(f2) && c2832iM.b(f2)) {
                String str = c3704yO.d().a.format(c3704yO.i[i4 / 2]);
                Paint paint = this.e;
                Paint.FontMetrics fontMetrics = AbstractC2831iL.i;
                float fontMetrics2 = paint.getFontMetrics(fontMetrics);
                paint.getTextBounds(str, i2, str.length(), AbstractC2831iL.h);
                float fWidth = 0.0f - r13.left;
                float f3 = (-fontMetrics.ascent) + 0.0f;
                Paint.Align textAlign = paint.getTextAlign();
                paint.setTextAlign(Paint.Align.LEFT);
                if (c3510ut.b != 0.0f || c3510ut.c != 0.0f) {
                    fWidth -= r13.width() * c3510ut.b;
                    f3 -= fontMetrics2 * c3510ut.c;
                }
                canvas.drawText(str, fWidth + f2, f3 + f, paint);
                paint.setTextAlign(textAlign);
            }
            i4 += 2;
            i2 = 0;
        }
    }

    public final void g(Canvas canvas) {
        char c;
        float fA;
        float f;
        ArrayList arrayList = this.h.r;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        float[] fArr = this.l;
        char c2 = 0;
        float f2 = 0.0f;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        int i = 0;
        while (i < arrayList.size()) {
            Ur ur = (Ur) arrayList.get(i);
            if (ur.a) {
                int iSave = canvas.save();
                RectF rectF = this.m;
                C2832iM c2832iM = (C2832iM) this.a;
                rectF.set(c2832iM.b);
                rectF.inset((-ur.h) / 2.0f, f2);
                canvas.clipRect(rectF);
                fArr[c2] = ur.g;
                fArr[1] = f2;
                this.c.f(fArr);
                float f3 = fArr[c2];
                float[] fArr2 = this.n;
                fArr2[c2] = f3;
                RectF rectF2 = c2832iM.b;
                fArr2[1] = rectF2.top;
                fArr2[2] = fArr[c2];
                fArr2[3] = rectF2.bottom;
                Path path = this.o;
                path.reset();
                path.moveTo(fArr2[c2], fArr2[1]);
                path.lineTo(fArr2[2], fArr2[3]);
                Paint paint = this.g;
                paint.setStyle(Paint.Style.STROKE);
                paint.setColor(ur.i);
                paint.setStrokeWidth(ur.h);
                paint.setPathEffect(ur.l);
                canvas.drawPath(path, paint);
                float f4 = ur.c + 2.0f;
                String str = ur.k;
                if (str == null || str.equals("")) {
                    c = 0;
                    canvas.restoreToCount(iSave);
                } else {
                    paint.setStyle(ur.j);
                    paint.setPathEffect(null);
                    paint.setColor(ur.f);
                    paint.setStrokeWidth(0.5f);
                    paint.setTextSize(ur.e);
                    float f5 = ur.h + ur.b;
                    int i2 = ur.m;
                    if (i2 == 3) {
                        fA = AbstractC2831iL.a(paint, str);
                        paint.setTextAlign(Paint.Align.LEFT);
                        f = fArr[0] + f5;
                    } else if (i2 == 4) {
                        paint.setTextAlign(Paint.Align.LEFT);
                        canvas.drawText(str, fArr[0] + f5, c2832iM.b.bottom - f4, paint);
                        c = 0;
                        canvas.restoreToCount(iSave);
                    } else if (i2 == 1) {
                        paint.setTextAlign(Paint.Align.RIGHT);
                        fA = AbstractC2831iL.a(paint, str);
                        f = fArr[0] - f5;
                    } else {
                        paint.setTextAlign(Paint.Align.RIGHT);
                        c = 0;
                        canvas.drawText(str, fArr[0] - f5, c2832iM.b.bottom - f4, paint);
                        canvas.restoreToCount(iSave);
                    }
                    canvas.drawText(str, f, c2832iM.b.top + f4 + fA, paint);
                    c = 0;
                    canvas.restoreToCount(iSave);
                }
            } else {
                c = c2;
            }
            i++;
            c2 = c;
            f2 = 0.0f;
        }
    }
}
