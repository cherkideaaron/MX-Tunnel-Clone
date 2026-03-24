package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class K1 extends Drawable implements Drawable.Callback {
    public static final /* synthetic */ int z = 0;
    public H1 a;
    public Rect b;
    public Drawable c;
    public Drawable d;
    public boolean f;
    public boolean n;
    public RunnableC2705g5 o;
    public long p;
    public long q;
    public L1 r;
    public H1 s;
    public boolean t;
    public H1 u;
    public MO v;
    public boolean y;
    public int e = 255;
    public int m = -1;
    public int w = -1;
    public int x = -1;

    public K1(H1 h1, Resources resources) {
        i(new H1(h1, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x026f, code lost:
    
        r5.onStateChange(r5.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0276, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.K1 c(android.content.Context r20, android.content.res.Resources r21, android.content.res.XmlResourceParser r22, android.util.AttributeSet r23, android.content.res.Resources.Theme r24) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 661
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.K1.c(android.content.Context, android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):K1");
    }

    public final void a(boolean z2) {
        boolean z3;
        boolean z4 = true;
        this.f = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable = this.c;
        if (drawable != null) {
            long j = this.p;
            if (j == 0) {
                z3 = false;
            } else if (j <= jUptimeMillis) {
                drawable.setAlpha(this.e);
                this.p = 0L;
                z3 = false;
            } else {
                drawable.setAlpha(((255 - (((int) ((j - jUptimeMillis) * 255)) / this.a.y)) * this.e) / 255);
                z3 = true;
            }
        } else {
            this.p = 0L;
            z3 = false;
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            long j2 = this.q;
            if (j2 == 0) {
                z4 = z3;
            } else if (j2 <= jUptimeMillis) {
                drawable2.setVisible(false, false);
                this.d = null;
                this.q = 0L;
                z4 = z3;
            } else {
                drawable2.setAlpha(((((int) ((j2 - jUptimeMillis) * 255)) / this.a.z) * this.e) / 255);
            }
        } else {
            this.q = 0L;
            z4 = z3;
        }
        if (z2 && z4) {
            scheduleSelf(this.o, jUptimeMillis + 16);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        b(theme);
        onStateChange(getState());
    }

    public final void b(Resources.Theme theme) {
        H1 h1 = this.a;
        if (theme == null) {
            h1.getClass();
            return;
        }
        h1.c();
        int i = h1.h;
        Drawable[] drawableArr = h1.g;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable != null && drawable.canApplyTheme()) {
                drawableArr[i2].applyTheme(theme);
                h1.e |= drawableArr[i2].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            h1.b = resources;
            int i3 = resources.getDisplayMetrics().densityDpi;
            if (i3 == 0) {
                i3 = 160;
            }
            int i4 = h1.c;
            h1.c = i3;
            if (i4 != i3) {
                h1.m = false;
                h1.j = false;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    public final void d(Drawable drawable) {
        if (this.r == null) {
            this.r = new L1();
        }
        L1 l1 = this.r;
        l1.b = drawable.getCallback();
        drawable.setCallback(l1);
        try {
            if (this.a.y <= 0 && this.f) {
                drawable.setAlpha(this.e);
            }
            H1 h1 = this.a;
            if (h1.C) {
                drawable.setColorFilter(h1.B);
            } else {
                if (h1.F) {
                    drawable.setTintList(h1.D);
                }
                H1 h12 = this.a;
                if (h12.G) {
                    drawable.setTintMode(h12.E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.a.w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setAutoMirrored(this.a.A);
            Rect rect = this.b;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
            L1 l12 = this.r;
            Drawable.Callback callback = (Drawable.Callback) l12.b;
            l12.b = null;
            drawable.setCallback(callback);
        } catch (Throwable th) {
            L1 l13 = this.r;
            Drawable.Callback callback2 = (Drawable.Callback) l13.b;
            l13.b = null;
            drawable.setCallback(callback2);
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final void e() {
        boolean z2;
        Drawable drawable = this.d;
        boolean z3 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.d = null;
            z2 = true;
        } else {
            z2 = false;
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f) {
                this.c.setAlpha(this.e);
            }
        }
        if (this.q != 0) {
            this.q = 0L;
            z2 = true;
        }
        if (this.p != 0) {
            this.p = 0L;
        } else {
            z3 = z2;
        }
        if (z3) {
            invalidateSelf();
        }
    }

    public final Drawable f() {
        if (!this.t) {
            g();
            H1 h1 = this.s;
            h1.I = h1.I.clone();
            h1.J = h1.J.clone();
            this.t = true;
        }
        return this;
    }

    public final Drawable g() {
        if (!this.n && super.mutate() == this) {
            H1 h1 = new H1(this.u, this, null);
            h1.I = h1.I.clone();
            h1.J = h1.J.clone();
            i(h1);
            this.n = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z2;
        H1 h1 = this.a;
        if (!h1.u) {
            h1.c();
            h1.u = true;
            int i = h1.h;
            Drawable[] drawableArr = h1.g;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    h1.v = true;
                    z2 = true;
                    break;
                }
                if (drawableArr[i2].getConstantState() == null) {
                    h1.v = false;
                    z2 = false;
                    break;
                }
                i2++;
            }
        } else {
            z2 = h1.v;
        }
        if (!z2) {
            return null;
        }
        this.a.d = getChangingConfigurations();
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        H1 h1 = this.a;
        if (h1.l) {
            if (!h1.m) {
                h1.b();
            }
            return h1.o;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        H1 h1 = this.a;
        if (h1.l) {
            if (!h1.m) {
                h1.b();
            }
            return h1.n;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        H1 h1 = this.a;
        if (h1.l) {
            if (!h1.m) {
                h1.b();
            }
            return h1.q;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        H1 h1 = this.a;
        if (h1.l) {
            if (!h1.m) {
                h1.b();
            }
            return h1.p;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.c;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        H1 h1 = this.a;
        if (h1.r) {
            return h1.s;
        }
        h1.c();
        int i = h1.h;
        Drawable[] drawableArr = h1.g;
        int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
        for (int i2 = 1; i2 < i; i2++) {
            opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
        }
        h1.s = opacity;
        h1.r = true;
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        H1 h1 = this.a;
        boolean padding = false;
        Rect rect2 = null;
        if (!h1.i) {
            Rect rect3 = h1.k;
            if (rect3 != null || h1.j) {
                rect2 = rect3;
            } else {
                h1.c();
                Rect rect4 = new Rect();
                int i = h1.h;
                Drawable[] drawableArr = h1.g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i3 = rect4.left;
                        if (i3 > rect2.left) {
                            rect2.left = i3;
                        }
                        int i4 = rect4.top;
                        if (i4 > rect2.top) {
                            rect2.top = i4;
                        }
                        int i5 = rect4.right;
                        if (i5 > rect2.right) {
                            rect2.right = i5;
                        }
                        int i6 = rect4.bottom;
                        if (i6 > rect2.bottom) {
                            rect2.bottom = i6;
                        }
                    }
                }
                h1.j = true;
                h1.k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                padding = true;
            }
        } else {
            Drawable drawable = this.c;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.a.A && getLayoutDirection() == 1) {
            int i7 = rect.left;
            rect.left = rect.right;
            rect.right = i7;
        }
        return padding;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(int r10) {
        /*
            r9 = this;
            int r0 = r9.m
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            H1 r0 = r9.a
            int r0 = r0.z
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.d
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.c
            if (r0 == 0) goto L29
            r9.d = r0
            H1 r0 = r9.a
            int r0 = r0.z
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.q = r0
            goto L35
        L29:
            r9.d = r4
            r9.q = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.c
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            H1 r0 = r9.a
            int r1 = r0.h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.d(r10)
            r9.c = r0
            r9.m = r10
            if (r0 == 0) goto L5a
            H1 r10 = r9.a
            int r10 = r10.y
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.p = r2
        L51:
            r9.d(r0)
            goto L5a
        L55:
            r9.c = r4
            r10 = -1
            r9.m = r10
        L5a:
            long r0 = r9.p
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.q
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L7a
        L67:
            g5 r10 = r9.o
            if (r10 != 0) goto L74
            g5 r10 = new g5
            r1 = 7
            r10.<init>(r9, r1)
            r9.o = r10
            goto L77
        L74:
            r9.unscheduleSelf(r10)
        L77:
            r9.a(r0)
        L7a:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.K1.h(int):boolean");
    }

    public final void i(H1 h1) {
        this.a = h1;
        int i = this.m;
        if (i >= 0) {
            Drawable drawableD = h1.d(i);
            this.c = drawableD;
            if (drawableD != null) {
                d(drawableD);
            }
        }
        this.d = null;
        this.s = h1;
        this.u = h1;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        H1 h1 = this.a;
        if (h1 != null) {
            h1.r = false;
            h1.t = false;
        }
        if (drawable != this.c || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.a.A;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    public final boolean j(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setVisible(z2, z3);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setVisible(z2, z3);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        e();
        MO mo = this.v;
        if (mo != null) {
            mo.N();
            this.v = null;
            h(this.w);
            this.w = -1;
            this.x = -1;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.y) {
            f();
            H1 h1 = this.u;
            h1.I = h1.I.clone();
            h1.J = h1.J.clone();
            this.y = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        H1 h1 = this.a;
        int i2 = this.m;
        int i3 = h1.h;
        Drawable[] drawableArr = h1.g;
        boolean z2 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            Drawable drawable = drawableArr[i4];
            if (drawable != null) {
                boolean layoutDirection = drawable.setLayoutDirection(i);
                if (i4 == i2) {
                    z2 = layoutDirection;
                }
            }
        }
        h1.x = i;
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.d;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d3  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onStateChange(int[] r15) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.K1.onStateChange(int[]):boolean");
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.c || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f && this.e == i) {
            return;
        }
        this.f = true;
        this.e = i;
        Drawable drawable = this.c;
        if (drawable != null) {
            if (this.p == 0) {
                drawable.setAlpha(i);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        H1 h1 = this.a;
        if (h1.A != z2) {
            h1.A = z2;
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setAutoMirrored(z2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        H1 h1 = this.a;
        h1.C = true;
        if (h1.B != colorFilter) {
            h1.B = colorFilter;
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z2) {
        H1 h1 = this.a;
        if (h1.w != z2) {
            h1.w = z2;
            Drawable drawable = this.c;
            if (drawable != null) {
                drawable.setDither(z2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.b;
        if (rect == null) {
            this.b = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        H1 h1 = this.a;
        h1.F = true;
        if (h1.D != colorStateList) {
            h1.D = colorStateList;
            AbstractC0500aq.a0(this.c, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        H1 h1 = this.a;
        h1.G = true;
        if (h1.E != mode) {
            h1.E = mode;
            AbstractC0500aq.b0(this.c, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        boolean zJ = j(z2, z3);
        MO mo = this.v;
        if (mo != null && (zJ || z3)) {
            if (z2) {
                mo.M();
            } else {
                jumpToCurrentState();
            }
        }
        return zJ;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.c || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
