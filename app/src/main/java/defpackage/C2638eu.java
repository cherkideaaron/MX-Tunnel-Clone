package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import java.util.BitSet;
import java.util.Objects;

/* renamed from: eu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2638eu extends Drawable implements InterfaceC3533vF {
    public static final Paint L;
    public static final C2583du[] M;
    public PorterDuffColorFilter A;
    public int B;
    public final RectF C;
    public final boolean D;
    public boolean E;
    public C2878jF F;
    public C3696yG G;
    public final C3642xG[] H;
    public float[] I;
    public float[] J;
    public C0285Qa K;
    public final C2524cp a;
    public C2529cu b;
    public final AbstractC3371sF[] c;
    public final AbstractC3371sF[] d;
    public final BitSet e;
    public boolean f;
    public boolean m;
    public final Matrix n;
    public final Path o;
    public final Path p;
    public final RectF q;
    public final RectF r;
    public final Region s;
    public final Region t;
    public final Paint u;
    public final Paint v;
    public final C2770hF w;
    public final C2827iH x;
    public final C2988lF y;
    public PorterDuffColorFilter z;

    static {
        C0360Uh c0360Uh = new C0360Uh(0);
        C0360Uh c0360Uh2 = new C0360Uh(0);
        C0360Uh c0360Uh3 = new C0360Uh(0);
        C0360Uh c0360Uh4 = new C0360Uh(0);
        int i = 0;
        AbstractC0500aq abstractC0500aqQ = AbstractC2883jK.q(0);
        C2825iF.b(abstractC0500aqQ);
        C2825iF.b(abstractC0500aqQ);
        C2825iF.b(abstractC0500aqQ);
        C2825iF.b(abstractC0500aqQ);
        C2754h c2754h = new C2754h(0.0f);
        C2754h c2754h2 = new C2754h(0.0f);
        C2754h c2754h3 = new C2754h(0.0f);
        C2754h c2754h4 = new C2754h(0.0f);
        C2878jF c2878jF = new C2878jF();
        c2878jF.a = abstractC0500aqQ;
        c2878jF.b = abstractC0500aqQ;
        c2878jF.c = abstractC0500aqQ;
        c2878jF.d = abstractC0500aqQ;
        c2878jF.e = c2754h;
        c2878jF.f = c2754h2;
        c2878jF.g = c2754h3;
        c2878jF.h = c2754h4;
        c2878jF.i = c0360Uh;
        c2878jF.j = c0360Uh2;
        c2878jF.k = c0360Uh3;
        c2878jF.l = c0360Uh4;
        Paint paint = new Paint(1);
        L = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        M = new C2583du[4];
        while (true) {
            C2583du[] c2583duArr = M;
            if (i >= c2583duArr.length) {
                return;
            }
            c2583duArr[i] = new C2583du(i);
            i++;
        }
    }

    public C2638eu() {
        this(new C2878jF());
    }

    public static float b(RectF rectF, C2878jF c2878jF, float[] fArr) {
        if (fArr == null) {
            if (c2878jF.e(rectF)) {
                return c2878jF.e.a(rectF);
            }
            return -1.0f;
        }
        if (fArr.length > 1) {
            float f = fArr[0];
            for (int i = 1; i < fArr.length; i++) {
                if (fArr[i] != f) {
                    return -1.0f;
                }
            }
        }
        if (c2878jF.d()) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final void a(RectF rectF, Path path) {
        C2529cu c2529cu = this.b;
        this.y.a(c2529cu.a, this.I, c2529cu.k, rectF, this.x, path);
        if (this.b.j != 1.0f) {
            Matrix matrix = this.n;
            matrix.reset();
            float f = this.b.j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.C, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.PorterDuffColorFilter c(android.content.res.ColorStateList r2, android.graphics.PorterDuff.Mode r3, android.graphics.Paint r4, boolean r5) {
        /*
            r1 = this;
            if (r2 == 0) goto L1c
            if (r3 != 0) goto L5
            goto L1c
        L5:
            int[] r4 = r1.getState()
            r0 = 0
            int r2 = r2.getColorForState(r4, r0)
            if (r5 == 0) goto L14
            int r2 = r1.d(r2)
        L14:
            r1.B = r2
            android.graphics.PorterDuffColorFilter r4 = new android.graphics.PorterDuffColorFilter
            r4.<init>(r2, r3)
            goto L35
        L1c:
            if (r5 == 0) goto L33
            int r2 = r4.getColor()
            int r3 = r1.d(r2)
            r1.B = r3
            if (r3 == r2) goto L33
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.<init>(r3, r4)
        L31:
            r4 = r2
            goto L35
        L33:
            r2 = 0
            goto L31
        L35:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2638eu.c(android.content.res.ColorStateList, android.graphics.PorterDuff$Mode, android.graphics.Paint, boolean):android.graphics.PorterDuffColorFilter");
    }

    public final int d(int i) {
        int i2;
        C2529cu c2529cu = this.b;
        float f = c2529cu.o + c2529cu.p + c2529cu.n;
        C0411Xh c0411Xh = c2529cu.c;
        if (c0411Xh == null || !c0411Xh.a || AbstractC0013Aa.d(i, 255) != c0411Xh.d) {
            return i;
        }
        float fMin = (c0411Xh.e <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / r3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iP = AbstractC0500aq.P(AbstractC0013Aa.d(i, 255), c0411Xh.b, fMin);
        if (fMin > 0.0f && (i2 = c0411Xh.c) != 0) {
            iP = AbstractC0013Aa.b(AbstractC0013Aa.d(i2, C0411Xh.f), iP);
        }
        return AbstractC0013Aa.d(iP, iAlpha);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095 A[EDGE_INSN: B:67:0x0095->B:32:0x0095 BREAK  A[LOOP:1: B:23:0x007c->B:28:0x0086]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r22) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2638eu.draw(android.graphics.Canvas):void");
    }

    public final void e(Canvas canvas) {
        if (this.e.cardinality() > 0) {
            Log.w("eu", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.b.s;
        Path path = this.o;
        C2770hF c2770hF = this.w;
        if (i != 0) {
            canvas.drawPath(path, (Paint) c2770hF.d);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            AbstractC3371sF abstractC3371sF = this.c[i2];
            int i3 = this.b.r;
            Matrix matrix = AbstractC3371sF.b;
            abstractC3371sF.a(matrix, c2770hF, i3, canvas);
            this.d[i2].a(matrix, c2770hF, this.b.r, canvas);
        }
        if (this.D) {
            C2529cu c2529cu = this.b;
            int iSin = (int) (Math.sin(Math.toRadians(c2529cu.t)) * c2529cu.s);
            C2529cu c2529cu2 = this.b;
            int iCos = (int) (Math.cos(Math.toRadians(c2529cu2.t)) * c2529cu2.s);
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, L);
            canvas.translate(iSin, iCos);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, C2878jF c2878jF, float[] fArr, RectF rectF) {
        float fB = b(rectF, c2878jF, fArr);
        if (fB < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f = fB * this.b.k;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    public void g(Canvas canvas) {
        Paint paint = this.v;
        Path path = this.p;
        C2878jF c2878jF = this.F;
        float[] fArr = this.J;
        RectF rectF = this.r;
        rectF.set(h());
        float fJ = j();
        rectF.inset(fJ, fJ);
        f(canvas, paint, path, c2878jF, fArr, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.b.m;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.b.q == 2) {
            return;
        }
        RectF rectFH = h();
        if (rectFH.isEmpty()) {
            return;
        }
        float fB = b(rectFH, this.b.a, this.I);
        if (fB >= 0.0f) {
            outline.setRoundRect(getBounds(), fB * this.b.k);
            return;
        }
        boolean z = this.f;
        Path path = this.o;
        if (z) {
            a(rectFH, path);
            this.f = false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            AbstractC3173oh.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                AbstractC3118nh.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            AbstractC3118nh.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.b.i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.s;
        region.set(bounds);
        RectF rectFH = h();
        Path path = this.o;
        a(rectFH, path);
        Region region2 = this.t;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final RectF h() {
        RectF rectF = this.q;
        rectF.set(getBounds());
        return rectF;
    }

    public final float i() {
        float[] fArr = this.I;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF rectFH = h();
        C2878jF c2878jF = this.b.a;
        this.y.getClass();
        return (((C2988lF.b(2, this.b.a).a(rectFH) + C2988lF.b(3, c2878jF).a(rectFH)) - C2988lF.b(1, this.b.a).a(rectFH)) - C2988lF.b(0, this.b.a).a(rectFH)) / 2.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f = true;
        this.m = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        C0473aH c0473aH;
        return super.isStateful() || ((colorStateList = this.b.g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.b.f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.b.e) != null && colorStateList3.isStateful()) || (((colorStateList4 = this.b.d) != null && colorStateList4.isStateful()) || ((c0473aH = this.b.b) != null && c0473aH.d()))));
    }

    public final float j() {
        if (k()) {
            return this.v.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final boolean k() {
        Paint.Style style = this.b.v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.v.getStrokeWidth() > 0.0f;
    }

    public final void l(Context context) {
        this.b.c = new C0411Xh(context);
        t();
    }

    public final void m(C3696yG c3696yG) {
        if (this.G == c3696yG) {
            return;
        }
        this.G = c3696yG;
        int i = 0;
        while (true) {
            C3642xG[] c3642xGArr = this.H;
            if (i >= c3642xGArr.length) {
                r(getState(), true);
                invalidateSelf();
                return;
            }
            if (c3642xGArr[i] == null) {
                c3642xGArr[i] = new C3642xG(this, M[i]);
            }
            C3642xG c3642xG = c3642xGArr[i];
            C3696yG c3696yG2 = new C3696yG();
            float f = (float) c3696yG.b;
            if (f < 0.0f) {
                throw new IllegalArgumentException("Damping ratio must be non-negative");
            }
            c3696yG2.b = f;
            c3696yG2.c = false;
            double d = c3696yG.a;
            float f2 = (float) (d * d);
            if (f2 <= 0.0f) {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
            c3696yG2.a = Math.sqrt(f2);
            c3696yG2.c = false;
            c3642xG.j = c3696yG2;
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.b = new C2529cu(this.b);
        return this;
    }

    public final void n(float f) {
        C2529cu c2529cu = this.b;
        if (c2529cu.o != f) {
            c2529cu.o = f;
            t();
        }
    }

    public final void o(ColorStateList colorStateList) {
        C2529cu c2529cu = this.b;
        if (c2529cu.d != colorStateList) {
            c2529cu.d = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f = true;
        this.m = true;
        super.onBoundsChange(rect);
        if (this.b.b != null && !rect.isEmpty()) {
            r(getState(), this.E);
        }
        this.E = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.b.b != null) {
            r(iArr, false);
        }
        boolean z = q(iArr) || s();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final void p(C0473aH c0473aH) {
        C2529cu c2529cu = this.b;
        if (c2529cu.b != c0473aH) {
            c2529cu.b = c0473aH;
            r(getState(), true);
            invalidateSelf();
        }
    }

    public final boolean q(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.b.d == null || color2 == (colorForState2 = this.b.d.getColorForState(iArr, (color2 = (paint2 = this.u).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.b.e == null || color == (colorForState = this.b.e.getColorForState(iArr, (color = (paint = this.v).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final void r(int[] iArr, boolean z) {
        int i;
        int[][] iArr2;
        C2878jF c2878jFA;
        RectF rectFH = h();
        if (this.b.b == null || rectFH.isEmpty()) {
            return;
        }
        boolean z2 = z | (this.G == null);
        if (this.I == null) {
            this.I = new float[4];
        }
        C0473aH c0473aH = this.b.b;
        int i2 = 0;
        while (true) {
            int i3 = c0473aH.a;
            i = -1;
            iArr2 = c0473aH.c;
            if (i2 >= i3) {
                i2 = -1;
                break;
            } else if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int i4 = 0;
            while (true) {
                if (i4 >= c0473aH.a) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr2[i4], iArr3)) {
                    i = i4;
                    break;
                }
                i4++;
            }
            i2 = i;
        }
        C2878jF[] c2878jFArr = c0473aH.d;
        YG yg = c0473aH.h;
        YG yg2 = c0473aH.g;
        YG yg3 = c0473aH.f;
        YG yg4 = c0473aH.e;
        if (yg4 == null && yg3 == null && yg2 == null && yg == null) {
            c2878jFA = c2878jFArr[i2];
        } else {
            C2825iF c2825iFF = c2878jFArr[i2].f();
            if (yg4 != null) {
                c2825iFF.e = yg4.c(iArr);
            }
            if (yg3 != null) {
                c2825iFF.f = yg3.c(iArr);
            }
            if (yg2 != null) {
                c2825iFF.h = yg2.c(iArr);
            }
            if (yg != null) {
                c2825iFF.g = yg.c(iArr);
            }
            c2878jFA = c2825iFF.a();
        }
        for (int i5 = 0; i5 < 4; i5++) {
            this.y.getClass();
            float fA = C2988lF.b(i5, c2878jFA).a(rectFH);
            if (z2) {
                this.I[i5] = fA;
            }
            C3642xG[] c3642xGArr = this.H;
            C3642xG c3642xG = c3642xGArr[i5];
            if (c3642xG != null) {
                c3642xG.a(fA);
                if (z2) {
                    c3642xGArr[i5].d();
                }
            }
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public final boolean s() {
        PorterDuffColorFilter porterDuffColorFilter = this.z;
        PorterDuffColorFilter porterDuffColorFilter2 = this.A;
        C2529cu c2529cu = this.b;
        this.z = c(c2529cu.g, c2529cu.h, this.u, true);
        C2529cu c2529cu2 = this.b;
        this.A = c(c2529cu2.f, c2529cu2.h, this.v, false);
        C2529cu c2529cu3 = this.b;
        if (c2529cu3.u) {
            int colorForState = c2529cu3.g.getColorForState(getState(), 0);
            C2770hF c2770hF = this.w;
            c2770hF.getClass();
            c2770hF.a = AbstractC0013Aa.d(colorForState, 68);
            c2770hF.b = AbstractC0013Aa.d(colorForState, 20);
            c2770hF.c = AbstractC0013Aa.d(colorForState, 0);
            ((Paint) c2770hF.d).setColor(c2770hF.a);
        }
        return (Objects.equals(porterDuffColorFilter, this.z) && Objects.equals(porterDuffColorFilter2, this.A)) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        C2529cu c2529cu = this.b;
        if (c2529cu.m != i) {
            c2529cu.m = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.b.getClass();
        super.invalidateSelf();
    }

    @Override // defpackage.InterfaceC3533vF
    public final void setShapeAppearanceModel(C2878jF c2878jF) {
        C2529cu c2529cu = this.b;
        c2529cu.a = c2878jF;
        c2529cu.b = null;
        this.I = null;
        this.J = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.b.g = colorStateList;
        s();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        C2529cu c2529cu = this.b;
        if (c2529cu.h != mode) {
            c2529cu.h = mode;
            s();
            super.invalidateSelf();
        }
    }

    public final void t() {
        C2529cu c2529cu = this.b;
        float f = c2529cu.o + c2529cu.p;
        c2529cu.r = (int) Math.ceil(0.75f * f);
        this.b.s = (int) Math.ceil(f * 0.25f);
        s();
        super.invalidateSelf();
    }

    public C2638eu(C2529cu c2529cu) {
        this.a = new C2524cp(this, 17);
        this.c = new AbstractC3371sF[4];
        this.d = new AbstractC3371sF[4];
        this.e = new BitSet(8);
        this.n = new Matrix();
        this.o = new Path();
        this.p = new Path();
        this.q = new RectF();
        this.r = new RectF();
        this.s = new Region();
        this.t = new Region();
        Paint paint = new Paint(1);
        this.u = paint;
        Paint paint2 = new Paint(1);
        this.v = paint2;
        this.w = new C2770hF();
        this.y = Looper.getMainLooper().getThread() == Thread.currentThread() ? AbstractC2933kF.a : new C2988lF();
        this.C = new RectF();
        this.D = true;
        this.E = true;
        this.H = new C3642xG[4];
        this.b = c2529cu;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        s();
        q(getState());
        this.x = new C2827iH(this, 20);
    }

    public C2638eu(C2878jF c2878jF) {
        this(new C2529cu(c2878jF));
    }

    public C2638eu(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C2878jF.b(context, attributeSet, i, i2).a());
    }
}
