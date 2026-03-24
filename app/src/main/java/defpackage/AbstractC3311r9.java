package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: r9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3311r9 extends ViewGroup implements InterfaceC3527v9 {
    public float A;
    public float B;
    public float C;
    public boolean D;
    public C0112Fo[] E;
    public float F;
    public ArrayList G;
    public boolean H;
    public boolean a;
    public AbstractC3419t9 b;
    public boolean c;
    public boolean d;
    public float e;
    public C2827iH f;
    public Paint m;
    public Paint n;
    public C3704yO o;
    public boolean p;
    public C0155Ig q;
    public Br r;
    public AbstractViewOnTouchListenerC3581w9 s;
    public String t;
    public Dr u;
    public AbstractC0255Oe v;
    public C3473u9 w;
    public C2832iM x;
    public C3365s9 y;
    public float z;

    public static void e(View view) {
        if (view.getBackground() != null) {
            view.getBackground().setCallback(null);
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        int i = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i >= viewGroup.getChildCount()) {
                viewGroup.removeAllViews();
                return;
            } else {
                e(viewGroup.getChildAt(i));
                i++;
            }
        }
    }

    public abstract void a();

    public final C0112Fo b(float f, float f2) {
        float f3;
        Y6 y6;
        C0327Si c0327SiC;
        if (this.b == null) {
            Log.e("MPAndroidChart", "Can't select by touch. No data set.");
            return null;
        }
        C3473u9 c3473u9 = (C3473u9) getHighlighter();
        Z6 z6 = c3473u9.a;
        C3121nk c3121nkF = ((W6) z6).f(1);
        c3121nkF.getClass();
        C3456tt c3456tt = (C3456tt) C3456tt.d.b();
        c3456tt.b = 0.0d;
        c3456tt.c = 0.0d;
        c3121nkF.c(f, f2, c3456tt);
        float f4 = (float) c3456tt.b;
        C3456tt.d.c(c3456tt);
        ArrayList arrayList = c3473u9.b;
        arrayList.clear();
        Y6 data = z6.getData();
        if (data != null) {
            List list = data.i;
            int size = list == null ? 0 : list.size();
            int i = 0;
            while (i < size) {
                InterfaceC0265Oo interfaceC0265OoC = data.c(i);
                if (((C0502as) interfaceC0265OoC).e) {
                    ArrayList arrayList2 = new ArrayList();
                    C0502as c0502as = (C0502as) interfaceC0265OoC;
                    ArrayList arrayListA = c0502as.a(f4);
                    if (arrayListA.size() == 0 && (c0327SiC = c0502as.c(f4, Float.NaN, 3)) != null) {
                        arrayListA = c0502as.a(c0327SiC.c);
                    }
                    if (arrayListA.size() != 0) {
                        Iterator it = arrayListA.iterator();
                        while (it.hasNext()) {
                            C0327Si c0327Si = (C0327Si) it.next();
                            int i2 = c0502as.d;
                            C3121nk c3121nkF2 = ((W6) z6).f(i2);
                            float f5 = c0327Si.c;
                            float f6 = c0327Si.a;
                            Iterator it2 = it;
                            float[] fArr = (float[]) c3121nkF2.f;
                            fArr[0] = f5;
                            fArr[1] = f6;
                            c3121nkF2.f(fArr);
                            double d = fArr[0];
                            Y6 y62 = data;
                            double d2 = fArr[1];
                            C3456tt c3456tt2 = (C3456tt) C3456tt.d.b();
                            c3456tt2.b = d;
                            c3456tt2.c = d2;
                            float f7 = f4;
                            float f8 = c0327Si.a;
                            C0112Fo c0112Fo = new C0112Fo();
                            c0112Fo.a = c0327Si.c;
                            c0112Fo.b = f8;
                            c0112Fo.c = (float) d;
                            c0112Fo.d = (float) d2;
                            c0112Fo.e = i;
                            c0112Fo.f = i2;
                            arrayList2.add(c0112Fo);
                            data = y62;
                            it = it2;
                            f4 = f7;
                        }
                    }
                    f3 = f4;
                    y6 = data;
                    arrayList.addAll(arrayList2);
                } else {
                    f3 = f4;
                    y6 = data;
                }
                i++;
                data = y6;
                f4 = f3;
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        int i3 = C3473u9.a(arrayList, f2, 1) < C3473u9.a(arrayList, f2, 2) ? 1 : 2;
        float maxHighlightDistance = z6.getMaxHighlightDistance();
        C0112Fo c0112Fo2 = null;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            C0112Fo c0112Fo3 = (C0112Fo) arrayList.get(i4);
            if (c0112Fo3.f == i3) {
                float fHypot = (float) Math.hypot(f - c0112Fo3.c, f2 - c0112Fo3.d);
                if (fHypot < maxHighlightDistance) {
                    c0112Fo2 = c0112Fo3;
                    maxHighlightDistance = fHypot;
                }
            }
        }
        return c0112Fo2;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.C0112Fo r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L6
        L3:
            r5.E = r0
            goto L50
        L6:
            boolean r1 = r5.a
            if (r1 == 0) goto L21
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Highlighted: "
            r1.<init>(r2)
            java.lang.String r2 = r6.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MPAndroidChart"
            android.util.Log.i(r2, r1)
        L21:
            t9 r1 = r5.b
            r1.getClass()
            int r2 = r6.e
            java.util.List r1 = r1.i
            int r3 = r1.size()
            if (r2 < r3) goto L32
            r1 = r0
            goto L45
        L32:
            int r2 = r6.e
            java.lang.Object r1 = r1.get(r2)
            Oo r1 = (defpackage.InterfaceC0265Oo) r1
            as r1 = (defpackage.C0502as) r1
            float r2 = r6.a
            float r3 = r6.b
            r4 = 3
            Si r1 = r1.c(r2, r3, r4)
        L45:
            if (r1 != 0) goto L48
            goto L3
        L48:
            r0 = 1
            Fo[] r0 = new defpackage.C0112Fo[r0]
            r1 = 0
            r0[r1] = r6
            r5.E = r0
        L50:
            Fo[] r6 = r5.E
            r5.setLastHighlighted(r6)
            r5.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC3311r9.c(Fo):void");
    }

    public abstract void d();

    public C3365s9 getAnimator() {
        return this.y;
    }

    public C3510ut getCenter() {
        return C3510ut.b(getWidth() / 2.0f, getHeight() / 2.0f);
    }

    public C3510ut getCenterOfView() {
        return getCenter();
    }

    public C3510ut getCenterOffsets() {
        RectF rectF = this.x.b;
        return C3510ut.b(rectF.centerX(), rectF.centerY());
    }

    public Bitmap getChartBitmap() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Drawable background = getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(-1);
        }
        draw(canvas);
        return bitmapCreateBitmap;
    }

    public RectF getContentRect() {
        return this.x.b;
    }

    public AbstractC3419t9 getData() {
        return this.b;
    }

    public InterfaceC0554bp getDefaultValueFormatter() {
        return this.f;
    }

    public C0155Ig getDescription() {
        return this.q;
    }

    public float getDragDecelerationFrictionCoef() {
        return this.e;
    }

    public float getExtraBottomOffset() {
        return this.B;
    }

    public float getExtraLeftOffset() {
        return this.C;
    }

    public float getExtraRightOffset() {
        return this.A;
    }

    public float getExtraTopOffset() {
        return this.z;
    }

    public C0112Fo[] getHighlighted() {
        return this.E;
    }

    public InterfaceC0282Po getHighlighter() {
        return this.w;
    }

    public ArrayList<Runnable> getJobs() {
        return this.G;
    }

    public Br getLegend() {
        return this.r;
    }

    public Dr getLegendRenderer() {
        return this.u;
    }

    public InterfaceC0299Qo getMarker() {
        return null;
    }

    @Deprecated
    public InterfaceC0299Qo getMarkerView() {
        getMarker();
        return null;
    }

    @Override // defpackage.InterfaceC3527v9
    public float getMaxHighlightDistance() {
        return this.F;
    }

    public abstract /* synthetic */ int getMaxVisibleCount();

    public InterfaceC2641ex getOnChartGestureListener() {
        return null;
    }

    public AbstractViewOnTouchListenerC3581w9 getOnTouchListener() {
        return this.s;
    }

    public AbstractC0255Oe getRenderer() {
        return this.v;
    }

    public C2832iM getViewPortHandler() {
        return this.x;
    }

    public C3704yO getXAxis() {
        return this.o;
    }

    public float getXChartMax() {
        return this.o.v;
    }

    public float getXChartMin() {
        return this.o.w;
    }

    public float getXRange() {
        return this.o.x;
    }

    public abstract /* synthetic */ float getYChartMax();

    public abstract /* synthetic */ float getYChartMin();

    public float getYMax() {
        return this.b.a;
    }

    public float getYMin() {
        return this.b.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.H) {
            e(this);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.b == null) {
            if (!TextUtils.isEmpty(this.t)) {
                C3510ut center = getCenter();
                canvas.drawText(this.t, center.b, center.c, this.n);
                return;
            }
            return;
        }
        if (this.D) {
            return;
        }
        a();
        this.D = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            getChildAt(i5).layout(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int iC = (int) AbstractC2831iL.c(50.0f);
        setMeasuredDimension(Math.max(getSuggestedMinimumWidth(), View.resolveSize(iC, i)), Math.max(getSuggestedMinimumHeight(), View.resolveSize(iC, i2)));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (this.a) {
            Log.i("MPAndroidChart", "OnSizeChanged()");
        }
        if (i > 0 && i2 > 0 && i < 10000 && i2 < 10000) {
            float f = i;
            float f2 = i2;
            C2832iM c2832iM = this.x;
            RectF rectF = c2832iM.b;
            float f3 = rectF.left;
            float f4 = rectF.top;
            float f5 = c2832iM.c - rectF.right;
            float f6 = c2832iM.d - rectF.bottom;
            c2832iM.d = f2;
            c2832iM.c = f;
            rectF.set(f3, f4, f - f5, f2 - f6);
            if (this.a) {
                Log.i("MPAndroidChart", "Setting chart dimens, width: " + i + ", height: " + i2);
            }
            ArrayList arrayList = this.G;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                post((Runnable) it.next());
            }
            arrayList.clear();
        }
        d();
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void setData(AbstractC3419t9 abstractC3419t9) {
        this.b = abstractC3419t9;
        this.D = false;
        if (abstractC3419t9 == null) {
            return;
        }
        float f = abstractC3419t9.b;
        float f2 = abstractC3419t9.a;
        float fD = AbstractC2831iL.d(abstractC3419t9.d() < 2 ? Math.max(Math.abs(f), Math.abs(f2)) : Math.abs(f2 - f));
        int iCeil = Float.isInfinite(fD) ? 0 : ((int) Math.ceil(-Math.log10(fD))) + 2;
        C2827iH c2827iH = this.f;
        c2827iH.G(iCeil);
        Iterator it = this.b.i.iterator();
        while (it.hasNext()) {
            C0502as c0502as = (C0502as) ((InterfaceC0265Oo) it.next());
            Object obj = c0502as.f;
            if (obj != null) {
                if (obj == null) {
                    obj = AbstractC2831iL.g;
                }
                if (obj == c2827iH) {
                }
            }
            c0502as.f = c2827iH;
        }
        d();
        if (this.a) {
            Log.i("MPAndroidChart", "Data is set.");
        }
    }

    public void setDescription(C0155Ig c0155Ig) {
        this.q = c0155Ig;
    }

    public void setDragDecelerationEnabled(boolean z) {
        this.d = z;
    }

    public void setDragDecelerationFrictionCoef(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f >= 1.0f) {
            f = 0.999f;
        }
        this.e = f;
    }

    @Deprecated
    public void setDrawMarkerViews(boolean z) {
        setDrawMarkers(z);
    }

    public void setExtraBottomOffset(float f) {
        this.B = AbstractC2831iL.c(f);
    }

    public void setExtraLeftOffset(float f) {
        this.C = AbstractC2831iL.c(f);
    }

    public void setExtraRightOffset(float f) {
        this.A = AbstractC2831iL.c(f);
    }

    public void setExtraTopOffset(float f) {
        this.z = AbstractC2831iL.c(f);
    }

    public void setHardwareAccelerationEnabled(boolean z) {
        setLayerType(z ? 2 : 1, null);
    }

    public void setHighlightPerTapEnabled(boolean z) {
        this.c = z;
    }

    public void setHighlighter(C3473u9 c3473u9) {
        this.w = c3473u9;
    }

    public void setLastHighlighted(C0112Fo[] c0112FoArr) {
        C0112Fo c0112Fo;
        if (c0112FoArr == null || c0112FoArr.length <= 0 || (c0112Fo = c0112FoArr[0]) == null) {
            this.s.b = null;
        } else {
            this.s.b = c0112Fo;
        }
    }

    public void setLogEnabled(boolean z) {
        this.a = z;
    }

    @Deprecated
    public void setMarkerView(InterfaceC0299Qo interfaceC0299Qo) {
        setMarker(interfaceC0299Qo);
    }

    public void setMaxHighlightDistance(float f) {
        this.F = AbstractC2831iL.c(f);
    }

    public void setNoDataText(String str) {
        this.t = str;
    }

    public void setNoDataTextColor(int i) {
        this.n.setColor(i);
    }

    public void setNoDataTextTypeface(Typeface typeface) {
        this.n.setTypeface(typeface);
    }

    public void setOnTouchListener(AbstractViewOnTouchListenerC3581w9 abstractViewOnTouchListenerC3581w9) {
        this.s = abstractViewOnTouchListenerC3581w9;
    }

    public void setRenderer(AbstractC0255Oe abstractC0255Oe) {
        if (abstractC0255Oe != null) {
            this.v = abstractC0255Oe;
        }
    }

    public void setTouchEnabled(boolean z) {
        this.p = z;
    }

    public void setUnbindEnabled(boolean z) {
        this.H = z;
    }

    public void setDrawMarkers(boolean z) {
    }

    public void setMarker(InterfaceC0299Qo interfaceC0299Qo) {
    }

    public void setOnChartGestureListener(InterfaceC2641ex interfaceC2641ex) {
    }

    public void setOnChartValueSelectedListener(InterfaceC2696fx interfaceC2696fx) {
    }
}
