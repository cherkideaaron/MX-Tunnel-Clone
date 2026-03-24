package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class W6 extends AbstractC3311r9 implements Z6 {
    public int I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public Paint Q;
    public Paint R;
    public boolean S;
    public boolean T;
    public float U;
    public boolean V;
    public HO W;
    public HO a0;
    public IO b0;
    public IO c0;
    public C3121nk d0;
    public C3121nk e0;
    public C3758zO f0;
    public long g0;
    public long h0;
    public RectF i0;
    public Matrix j0;
    public C3456tt k0;
    public C3456tt l0;
    public float[] m0;

    /* JADX WARN: Removed duplicated region for block: B:41:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0126  */
    @Override // defpackage.AbstractC3311r9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 622
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.W6.a():void");
    }

    @Override // android.view.View
    public final void computeScroll() {
        AbstractViewOnTouchListenerC3581w9 abstractViewOnTouchListenerC3581w9 = this.s;
        if (abstractViewOnTouchListenerC3581w9 instanceof X6) {
            X6 x6 = (X6) abstractViewOnTouchListenerC3581w9;
            C3510ut c3510ut = x6.v;
            if (c3510ut.b == 0.0f && c3510ut.c == 0.0f) {
                return;
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float f = c3510ut.b;
            AbstractC3311r9 abstractC3311r9 = x6.d;
            W6 w6 = (W6) abstractC3311r9;
            c3510ut.b = w6.getDragDecelerationFrictionCoef() * f;
            float dragDecelerationFrictionCoef = w6.getDragDecelerationFrictionCoef() * c3510ut.c;
            c3510ut.c = dragDecelerationFrictionCoef;
            float f2 = (jCurrentAnimationTimeMillis - x6.t) / 1000.0f;
            float f3 = c3510ut.b * f2;
            float f4 = dragDecelerationFrictionCoef * f2;
            C3510ut c3510ut2 = x6.u;
            float f5 = c3510ut2.b + f3;
            c3510ut2.b = f5;
            float f6 = c3510ut2.c + f4;
            c3510ut2.c = f6;
            MotionEvent motionEventObtain = MotionEvent.obtain(jCurrentAnimationTimeMillis, jCurrentAnimationTimeMillis, 2, f5, f6, 0);
            x6.c(motionEventObtain);
            motionEventObtain.recycle();
            C2832iM viewPortHandler = w6.getViewPortHandler();
            Matrix matrix = x6.e;
            viewPortHandler.d(matrix, abstractC3311r9, false);
            x6.e = matrix;
            x6.t = jCurrentAnimationTimeMillis;
            if (Math.abs(c3510ut.b) >= 0.01d || Math.abs(c3510ut.c) >= 0.01d) {
                DisplayMetrics displayMetrics = AbstractC2831iL.a;
                abstractC3311r9.postInvalidateOnAnimation();
                return;
            }
            w6.a();
            w6.postInvalidate();
            C3510ut c3510ut3 = x6.v;
            c3510ut3.b = 0.0f;
            c3510ut3.c = 0.0f;
        }
    }

    @Override // defpackage.AbstractC3311r9
    public final void d() {
        float size;
        float fC;
        Br br;
        ArrayList arrayList;
        int i;
        float f;
        if (this.b == null) {
            if (this.a) {
                Log.i("MPAndroidChart", "Preparing... DATA NOT SET.");
                return;
            }
            return;
        }
        if (this.a) {
            Log.i("MPAndroidChart", "Preparing...");
        }
        C3704yO c3704yO = this.o;
        Y6 y6 = (Y6) this.b;
        c3704yO.b(y6.d, y6.c);
        this.W.b(((Y6) this.b).f(1), ((Y6) this.b).e(1));
        this.a0.b(((Y6) this.b).f(2), ((Y6) this.b).e(2));
        IO io = this.b0;
        HO ho = this.W;
        io.d(ho.w, ho.v);
        IO io2 = this.c0;
        HO ho2 = this.a0;
        io2.d(ho2.w, ho2.v);
        C3758zO c3758zO = this.f0;
        C3704yO c3704yO2 = this.o;
        c3758zO.d(c3704yO2.w, c3704yO2.v);
        if (this.r != null) {
            Dr dr = this.u;
            AbstractC3419t9 abstractC3419t9 = this.b;
            Br br2 = dr.d;
            br2.getClass();
            ArrayList arrayList2 = dr.e;
            arrayList2.clear();
            int i2 = 0;
            while (true) {
                List list = abstractC3419t9.i;
                if (i2 >= (list == null ? 0 : list.size())) {
                    break;
                }
                InterfaceC0265Oo interfaceC0265OoC = abstractC3419t9.c(i2);
                C0502as c0502as = (C0502as) interfaceC0265OoC;
                ArrayList arrayList3 = c0502as.a;
                int size2 = ((C0502as) interfaceC0265OoC).m.size();
                int i3 = 0;
                while (i3 < arrayList3.size() && i3 < size2) {
                    arrayList2.add(new Cr((i3 >= arrayList3.size() - 1 || i3 >= size2 + (-1)) ? ((C0502as) abstractC3419t9.c(i2)).c : null, c0502as.g, c0502as.h, c0502as.i, ((Integer) arrayList3.get(i3)).intValue()));
                    i3++;
                }
                i2++;
            }
            br2.g = (Cr[]) arrayList2.toArray(new Cr[arrayList2.size()]);
            Typeface typeface = br2.d;
            Paint paint = dr.b;
            if (typeface != null) {
                paint.setTypeface(typeface);
            }
            paint.setTextSize(br2.e);
            paint.setColor(br2.f);
            float fC2 = AbstractC2831iL.c(8.0f);
            float fC3 = AbstractC2831iL.c(3.0f);
            float fC4 = AbstractC2831iL.c(5.0f);
            float fC5 = AbstractC2831iL.c(6.0f);
            float fC6 = AbstractC2831iL.c(0.0f);
            Cr[] crArr = br2.g;
            int length = crArr.length;
            AbstractC2831iL.c(5.0f);
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (Cr cr : br2.g) {
                float fC7 = AbstractC2831iL.c(Float.isNaN(cr.c) ? 8.0f : cr.c);
                if (fC7 > f3) {
                    f3 = fC7;
                }
                String str = cr.a;
                if (str != null) {
                    float fMeasureText = (int) paint.measureText(str);
                    if (fMeasureText > f2) {
                        f2 = fMeasureText;
                    }
                }
            }
            float f4 = 0.0f;
            for (Cr cr2 : br2.g) {
                String str2 = cr2.a;
                if (str2 != null) {
                    float fA = AbstractC2831iL.a(paint, str2);
                    if (fA > f4) {
                        f4 = fA;
                    }
                }
            }
            int iA = AbstractC3264qG.A(br2.j);
            if (iA != 0) {
                if (iA == 1) {
                    Paint.FontMetrics fontMetrics = AbstractC2831iL.e;
                    paint.getFontMetrics(fontMetrics);
                    float f5 = fontMetrics.descent - fontMetrics.ascent;
                    float fMax = 0.0f;
                    size = 0.0f;
                    float f6 = 0.0f;
                    int i4 = 0;
                    boolean z = false;
                    while (i4 < length) {
                        Cr cr3 = crArr[i4];
                        float f7 = fC2;
                        boolean z2 = cr3.b != 1;
                        float f8 = cr3.c;
                        float fC8 = Float.isNaN(f8) ? f7 : AbstractC2831iL.c(f8);
                        if (!z) {
                            f6 = 0.0f;
                        }
                        if (z2) {
                            if (z) {
                                f6 += fC3;
                            }
                            f6 += fC8;
                        }
                        if (cr3.a != null) {
                            if (z2 && !z) {
                                f = f6 + fC4;
                            } else if (z) {
                                fMax = Math.max(fMax, f6);
                                size += f5 + fC6;
                                f = 0.0f;
                                z = false;
                            } else {
                                f = f6;
                            }
                            float fMeasureText2 = f + ((int) paint.measureText(r15));
                            if (i4 < length - 1) {
                                f6 = fMeasureText2;
                                size = f5 + fC6 + size;
                            } else {
                                f6 = fMeasureText2;
                            }
                        } else {
                            f6 += fC8;
                            if (i4 < length - 1) {
                                f6 += fC3;
                            }
                            z = true;
                        }
                        fMax = Math.max(fMax, f6);
                        i4++;
                        fC2 = f7;
                    }
                    br2.l = fMax;
                }
                br2.m += br2.c;
                br2.l += br2.b;
            } else {
                Paint.FontMetrics fontMetrics2 = AbstractC2831iL.e;
                paint.getFontMetrics(fontMetrics2);
                float f9 = fontMetrics2.descent - fontMetrics2.ascent;
                paint.getFontMetrics(fontMetrics2);
                float f10 = (fontMetrics2.ascent - fontMetrics2.top) + fontMetrics2.bottom + fC6;
                ((C2832iM) dr.a).b.width();
                ArrayList arrayList4 = br2.o;
                arrayList4.clear();
                ArrayList arrayList5 = br2.n;
                arrayList5.clear();
                ArrayList arrayList6 = br2.p;
                arrayList6.clear();
                int i5 = -1;
                float f11 = 0.0f;
                int i6 = 0;
                float fMax2 = 0.0f;
                float f12 = 0.0f;
                while (i6 < length) {
                    Cr cr4 = crArr[i6];
                    Cr[] crArr2 = crArr;
                    float f13 = f10;
                    boolean z3 = cr4.b != 1;
                    float f14 = cr4.c;
                    if (Float.isNaN(f14)) {
                        br = br2;
                        fC = fC2;
                    } else {
                        fC = AbstractC2831iL.c(f14);
                        br = br2;
                    }
                    arrayList4.add(Boolean.FALSE);
                    float f15 = i5 == -1 ? 0.0f : f11 + fC3;
                    String str3 = cr4.a;
                    if (str3 != null) {
                        arrayList5.add(AbstractC2831iL.b(paint, str3));
                        arrayList = arrayList4;
                        f11 = f15 + (z3 ? fC4 + fC : 0.0f) + ((C3770zj) arrayList5.get(i6)).b;
                        i = -1;
                    } else {
                        C3770zj c3770zj = (C3770zj) C3770zj.d.b();
                        arrayList = arrayList4;
                        c3770zj.b = 0.0f;
                        c3770zj.c = 0.0f;
                        arrayList5.add(c3770zj);
                        if (!z3) {
                            fC = 0.0f;
                        }
                        i = -1;
                        f11 = f15 + fC;
                        if (i5 == -1) {
                            i5 = i6;
                        }
                    }
                    if (str3 != null || i6 == length - 1) {
                        float f16 = (f12 == 0.0f ? 0.0f : fC5) + f11 + f12;
                        if (i6 == length - 1) {
                            C3770zj c3770zj2 = (C3770zj) C3770zj.d.b();
                            c3770zj2.b = f16;
                            c3770zj2.c = f9;
                            arrayList6.add(c3770zj2);
                            fMax2 = Math.max(fMax2, f16);
                        }
                        f12 = f16;
                    }
                    if (str3 != null) {
                        i5 = i;
                    }
                    i6++;
                    crArr = crArr2;
                    f10 = f13;
                    br2 = br;
                    arrayList4 = arrayList;
                }
                float f17 = f10;
                br2.l = fMax2;
                size = (f17 * (arrayList6.size() == 0 ? 0 : arrayList6.size() - 1)) + (f9 * arrayList6.size());
            }
            br2.m = size;
            br2.m += br2.c;
            br2.l += br2.b;
        }
        a();
    }

    public final C3121nk f(int i) {
        return i == 1 ? this.d0 : this.e0;
    }

    public HO getAxisLeft() {
        return this.W;
    }

    public HO getAxisRight() {
        return this.a0;
    }

    @Override // defpackage.AbstractC3311r9, defpackage.InterfaceC3527v9, defpackage.Z6
    public /* bridge */ /* synthetic */ Y6 getData() {
        return (Y6) super.getData();
    }

    public InterfaceC2914jx getDrawListener() {
        return null;
    }

    @Override // defpackage.Z6
    public float getHighestVisibleX() {
        C3121nk c3121nkF = f(1);
        RectF rectF = this.x.b;
        float f = rectF.right;
        float f2 = rectF.bottom;
        C3456tt c3456tt = this.l0;
        c3121nkF.c(f, f2, c3456tt);
        return (float) Math.min(this.o.v, c3456tt.b);
    }

    @Override // defpackage.Z6
    public float getLowestVisibleX() {
        C3121nk c3121nkF = f(1);
        RectF rectF = this.x.b;
        float f = rectF.left;
        float f2 = rectF.bottom;
        C3456tt c3456tt = this.k0;
        c3121nkF.c(f, f2, c3456tt);
        return (float) Math.max(this.o.w, c3456tt.b);
    }

    @Override // defpackage.AbstractC3311r9, defpackage.InterfaceC3527v9
    public int getMaxVisibleCount() {
        return this.I;
    }

    public float getMinOffset() {
        return this.U;
    }

    public IO getRendererLeftYAxis() {
        return this.b0;
    }

    public IO getRendererRightYAxis() {
        return this.c0;
    }

    public C3758zO getRendererXAxis() {
        return this.f0;
    }

    @Override // android.view.View
    public float getScaleX() {
        C2832iM c2832iM = this.x;
        if (c2832iM == null) {
            return 1.0f;
        }
        return c2832iM.i;
    }

    @Override // android.view.View
    public float getScaleY() {
        C2832iM c2832iM = this.x;
        if (c2832iM == null) {
            return 1.0f;
        }
        return c2832iM.j;
    }

    public float getVisibleXRange() {
        return Math.abs(getHighestVisibleX() - getLowestVisibleX());
    }

    @Override // defpackage.AbstractC3311r9, defpackage.InterfaceC3527v9
    public float getYChartMax() {
        return Math.max(this.W.v, this.a0.v);
    }

    @Override // defpackage.AbstractC3311r9, defpackage.InterfaceC3527v9
    public float getYChartMin() {
        return Math.min(this.W.w, this.a0.w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0961  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x09c4  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0be4  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x073f A[EDGE_INSN: B:432:0x073f->B:243:0x073f BREAK  A[LOOP:4: B:94:0x0290->B:242:0x072a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0298  */
    /* JADX WARN: Type inference failed for: r13v16, types: [a7] */
    /* JADX WARN: Type inference failed for: r1v97, types: [Zr] */
    /* JADX WARN: Type inference failed for: r41v8 */
    /* JADX WARN: Type inference failed for: r4v29, types: [Zr] */
    /* JADX WARN: Type inference failed for: r6v18, types: [float[], java.io.Serializable] */
    @Override // defpackage.AbstractC3311r9, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDraw(android.graphics.Canvas r46) {
        /*
            Method dump skipped, instructions count: 3225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.W6.onDraw(android.graphics.Canvas):void");
    }

    @Override // defpackage.AbstractC3311r9, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        float[] fArr = this.m0;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        boolean z = this.V;
        C2832iM c2832iM = this.x;
        if (z) {
            RectF rectF = c2832iM.b;
            fArr[0] = rectF.left;
            fArr[1] = rectF.top;
            f(1).e(fArr);
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (!this.V) {
            c2832iM.d(c2832iM.a, this, true);
            return;
        }
        f(1).f(fArr);
        Matrix matrix = c2832iM.n;
        matrix.reset();
        matrix.set(c2832iM.a);
        float f = fArr[0];
        RectF rectF2 = c2832iM.b;
        matrix.postTranslate(-(f - rectF2.left), -(fArr[1] - rectF2.top));
        c2832iM.d(matrix, this, true);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        AbstractViewOnTouchListenerC3581w9 abstractViewOnTouchListenerC3581w9 = this.s;
        if (abstractViewOnTouchListenerC3581w9 == null || this.b == null || !this.p) {
            return false;
        }
        return ((X6) abstractViewOnTouchListenerC3581w9).onTouch(this, motionEvent);
    }

    public void setAutoScaleMinMaxEnabled(boolean z) {
        this.J = z;
    }

    public void setBorderColor(int i) {
        this.R.setColor(i);
    }

    public void setBorderWidth(float f) {
        this.R.setStrokeWidth(AbstractC2831iL.c(f));
    }

    public void setDoubleTapToZoomEnabled(boolean z) {
        this.L = z;
    }

    public void setDragEnabled(boolean z) {
        this.N = z;
    }

    public void setDragOffsetX(float f) {
        C2832iM c2832iM = this.x;
        c2832iM.getClass();
        c2832iM.l = AbstractC2831iL.c(f);
    }

    public void setDragOffsetY(float f) {
        C2832iM c2832iM = this.x;
        c2832iM.getClass();
        c2832iM.m = AbstractC2831iL.c(f);
    }

    public void setDrawBorders(boolean z) {
        this.T = z;
    }

    public void setDrawGridBackground(boolean z) {
        this.S = z;
    }

    public void setGridBackgroundColor(int i) {
        this.Q.setColor(i);
    }

    public void setHighlightPerDragEnabled(boolean z) {
        this.M = z;
    }

    public void setKeepPositionOnRotation(boolean z) {
        this.V = z;
    }

    public void setMaxVisibleValueCount(int i) {
        this.I = i;
    }

    public void setMinOffset(float f) {
        this.U = f;
    }

    public void setPinchZoom(boolean z) {
        this.K = z;
    }

    public void setRendererLeftYAxis(IO io) {
        this.b0 = io;
    }

    public void setRendererRightYAxis(IO io) {
        this.c0 = io;
    }

    public void setScaleEnabled(boolean z) {
        this.O = z;
        this.P = z;
    }

    public void setScaleXEnabled(boolean z) {
        this.O = z;
    }

    public void setScaleYEnabled(boolean z) {
        this.P = z;
    }

    public void setVisibleXRangeMaximum(float f) {
        float f2 = this.o.x / f;
        C2832iM c2832iM = this.x;
        c2832iM.getClass();
        if (f2 < 1.0f) {
            f2 = 1.0f;
        }
        c2832iM.g = f2;
        c2832iM.c(c2832iM.a, c2832iM.b);
    }

    public void setVisibleXRangeMinimum(float f) {
        this.x.e(this.o.x / f);
    }

    public void setXAxisRenderer(C3758zO c3758zO) {
        this.f0 = c3758zO;
    }

    public void setOnDrawListener(InterfaceC2914jx interfaceC2914jx) {
    }
}
