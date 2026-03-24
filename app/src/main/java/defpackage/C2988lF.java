package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* renamed from: lF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2988lF {
    public final C3425tF[] a = new C3425tF[4];
    public final Matrix[] b = new Matrix[4];
    public final Matrix[] c = new Matrix[4];
    public final PointF d = new PointF();
    public final Path e = new Path();
    public final Path f = new Path();
    public final C3425tF g = new C3425tF();
    public final float[] h = new float[2];
    public final float[] i = new float[2];
    public final Path j = new Path();
    public final Path k = new Path();
    public final boolean l = true;

    public C2988lF() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new C3425tF();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    public static InterfaceC0100Fc b(int i, C2878jF c2878jF) {
        return i != 1 ? i != 2 ? i != 3 ? c2878jF.f : c2878jF.e : c2878jF.h : c2878jF.g;
    }

    public final void a(C2878jF c2878jF, float[] fArr, float f, RectF rectF, C2827iH c2827iH, Path path) {
        int i;
        Matrix[] matrixArr;
        float[] fArr2;
        Matrix[] matrixArr2;
        C3425tF[] c3425tFArr;
        float fCenterX;
        float f2;
        int i2;
        float f3;
        float f4;
        C2988lF c2988lF = this;
        path.rewind();
        Path path2 = c2988lF.e;
        path2.rewind();
        Path path3 = c2988lF.f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            i = 4;
            matrixArr = c2988lF.c;
            fArr2 = c2988lF.h;
            matrixArr2 = c2988lF.b;
            c3425tFArr = c2988lF.a;
            if (i3 >= 4) {
                break;
            }
            InterfaceC0100Fc interfaceC0100FcB = fArr == null ? b(i3, c2878jF) : new O9(fArr[i3]);
            AbstractC0500aq abstractC0500aq = i3 != 1 ? i3 != 2 ? i3 != 3 ? c2878jF.b : c2878jF.a : c2878jF.d : c2878jF.c;
            C3425tF c3425tF = c3425tFArr[i3];
            abstractC0500aq.getClass();
            abstractC0500aq.E(c3425tF, f, interfaceC0100FcB.a(rectF));
            int i4 = i3 + 1;
            float f5 = (i4 % 4) * 90;
            matrixArr2[i3].reset();
            PointF pointF = c2988lF.d;
            if (i3 == 1) {
                i2 = i4;
                f3 = rectF.right;
            } else if (i3 != 2) {
                if (i3 != 3) {
                    f3 = rectF.right;
                    i2 = i4;
                } else {
                    i2 = i4;
                    f3 = rectF.left;
                }
                f4 = rectF.top;
                pointF.set(f3, f4);
                matrixArr2[i3].setTranslate(pointF.x, pointF.y);
                matrixArr2[i3].preRotate(f5);
                C3425tF c3425tF2 = c3425tFArr[i3];
                fArr2[0] = c3425tF2.c;
                fArr2[1] = c3425tF2.d;
                matrixArr2[i3].mapPoints(fArr2);
                matrixArr[i3].reset();
                matrixArr[i3].setTranslate(fArr2[0], fArr2[1]);
                matrixArr[i3].preRotate(f5);
                i3 = i2;
            } else {
                i2 = i4;
                f3 = rectF.left;
            }
            f4 = rectF.bottom;
            pointF.set(f3, f4);
            matrixArr2[i3].setTranslate(pointF.x, pointF.y);
            matrixArr2[i3].preRotate(f5);
            C3425tF c3425tF22 = c3425tFArr[i3];
            fArr2[0] = c3425tF22.c;
            fArr2[1] = c3425tF22.d;
            matrixArr2[i3].mapPoints(fArr2);
            matrixArr[i3].reset();
            matrixArr[i3].setTranslate(fArr2[0], fArr2[1]);
            matrixArr[i3].preRotate(f5);
            i3 = i2;
        }
        int i5 = 0;
        while (i5 < i) {
            C3425tF c3425tF3 = c3425tFArr[i5];
            fArr2[0] = c3425tF3.a;
            fArr2[1] = c3425tF3.b;
            matrixArr2[i5].mapPoints(fArr2);
            if (i5 == 0) {
                path.moveTo(fArr2[0], fArr2[1]);
            } else {
                path.lineTo(fArr2[0], fArr2[1]);
            }
            c3425tFArr[i5].b(matrixArr2[i5], path);
            if (c2827iH != null) {
                C3425tF c3425tF4 = c3425tFArr[i5];
                Matrix matrix = matrixArr2[i5];
                C2638eu c2638eu = (C2638eu) c2827iH.b;
                BitSet bitSet = c2638eu.e;
                c3425tF4.getClass();
                bitSet.set(i5, false);
                c3425tF4.a(c3425tF4.f);
                c2638eu.c[i5] = new C3043mF(new ArrayList(c3425tF4.h), new Matrix(matrix));
            }
            int i6 = i5 + 1;
            int i7 = i6 % 4;
            C3425tF c3425tF5 = c3425tFArr[i5];
            fArr2[0] = c3425tF5.c;
            fArr2[1] = c3425tF5.d;
            matrixArr2[i5].mapPoints(fArr2);
            C3425tF c3425tF6 = c3425tFArr[i7];
            float f6 = c3425tF6.a;
            float[] fArr3 = c2988lF.i;
            fArr3[0] = f6;
            fArr3[1] = c3425tF6.b;
            matrixArr2[i7].mapPoints(fArr3);
            float fMax = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, 0.0f);
            C3425tF c3425tF7 = c3425tFArr[i5];
            fArr2[0] = c3425tF7.c;
            fArr2[1] = c3425tF7.d;
            matrixArr2[i5].mapPoints(fArr2);
            if (i5 == 1 || i5 == 3) {
                fCenterX = rectF.centerX();
                f2 = fArr2[0];
            } else {
                fCenterX = rectF.centerY();
                f2 = fArr2[1];
            }
            Math.abs(fCenterX - f2);
            C3425tF c3425tF8 = c2988lF.g;
            c3425tF8.d(0.0f, 270.0f, 0.0f);
            (i5 != 1 ? i5 != 2 ? i5 != 3 ? c2878jF.j : c2878jF.i : c2878jF.l : c2878jF.k).getClass();
            c3425tF8.c(fMax, 0.0f);
            Path path4 = c2988lF.j;
            path4.reset();
            c3425tF8.b(matrixArr[i5], path4);
            if (c2988lF.l && (c2988lF.c(path4, i5) || c2988lF.c(path4, i7))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr2[0] = c3425tF8.a;
                fArr2[1] = c3425tF8.b;
                matrixArr[i5].mapPoints(fArr2);
                path2.moveTo(fArr2[0], fArr2[1]);
                c3425tF8.b(matrixArr[i5], path2);
            } else {
                c3425tF8.b(matrixArr[i5], path);
            }
            if (c2827iH != null) {
                Matrix matrix2 = matrixArr[i5];
                C2638eu c2638eu2 = (C2638eu) c2827iH.b;
                c2638eu2.e.set(i5 + 4, false);
                c3425tF8.a(c3425tF8.f);
                c2638eu2.d[i5] = new C3043mF(new ArrayList(c3425tF8.h), new Matrix(matrix2));
            }
            i = 4;
            c2988lF = this;
            i5 = i6;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public final boolean c(Path path, int i) {
        Path path2 = this.k;
        path2.reset();
        this.a[i].b(this.b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
