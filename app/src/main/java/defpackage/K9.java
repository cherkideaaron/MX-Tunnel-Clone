package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class K9 extends C2638eu implements Drawable.Callback, GI {
    public static final int[] W0 = {R.attr.state_enabled};
    public static final ShapeDrawable X0 = new ShapeDrawable(new OvalShape());
    public final HI A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public boolean H0;
    public int I0;
    public int J0;
    public ColorFilter K0;
    public PorterDuffColorFilter L0;
    public ColorStateList M0;
    public ColorStateList N;
    public PorterDuff.Mode N0;
    public ColorStateList O;
    public int[] O0;
    public float P;
    public boolean P0;
    public float Q;
    public ColorStateList Q0;
    public ColorStateList R;
    public WeakReference R0;
    public float S;
    public TextUtils.TruncateAt S0;
    public ColorStateList T;
    public boolean T0;
    public CharSequence U;
    public int U0;
    public boolean V;
    public boolean V0;
    public Drawable W;
    public ColorStateList X;
    public float Y;
    public boolean Z;
    public boolean a0;
    public Drawable b0;
    public RippleDrawable c0;
    public ColorStateList d0;
    public float e0;
    public SpannableStringBuilder f0;
    public boolean g0;
    public boolean h0;
    public Drawable i0;
    public ColorStateList j0;
    public C3728yv k0;
    public C3728yv l0;
    public float m0;
    public float n0;
    public float o0;
    public float p0;
    public float q0;
    public float r0;
    public float s0;
    public float t0;
    public final Context u0;
    public final Paint v0;
    public final Paint.FontMetrics w0;
    public final RectF x0;
    public final PointF y0;
    public final Path z0;

    public K9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.mxtunnel.pro.R.attr.chipStyle, com.mxtunnel.pro.R.style.Widget_MaterialComponents_Chip_Action);
        this.Q = -1.0f;
        this.v0 = new Paint(1);
        this.w0 = new Paint.FontMetrics();
        this.x0 = new RectF();
        this.y0 = new PointF();
        this.z0 = new Path();
        this.J0 = 255;
        this.N0 = PorterDuff.Mode.SRC_IN;
        this.R0 = new WeakReference(null);
        l(context);
        this.u0 = context;
        HI hi = new HI(this);
        this.A0 = hi;
        this.U = "";
        hi.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = W0;
        setState(iArr);
        S(iArr);
        this.T0 = true;
        X0.setTint(-1);
    }

    public static boolean A(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static void c0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean z(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public final void B() {
        J9 j9 = (J9) this.R0.get();
        if (j9 != null) {
            Chip chip = (Chip) j9;
            chip.b(chip.v);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean C(int[] r10, int[] r11) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.K9.C(int[], int[]):boolean");
    }

    public final void D(boolean z) {
        if (this.g0 != z) {
            this.g0 = z;
            float fW = w();
            if (!z && this.H0) {
                this.H0 = false;
            }
            float fW2 = w();
            invalidateSelf();
            if (fW != fW2) {
                B();
            }
        }
    }

    public final void E(Drawable drawable) {
        if (this.i0 != drawable) {
            float fW = w();
            this.i0 = drawable;
            float fW2 = w();
            c0(this.i0);
            u(this.i0);
            invalidateSelf();
            if (fW != fW2) {
                B();
            }
        }
    }

    public final void F(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.j0 != colorStateList) {
            this.j0 = colorStateList;
            if (this.h0 && (drawable = this.i0) != null && this.g0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void G(boolean z) {
        if (this.h0 != z) {
            boolean Z = Z();
            this.h0 = z;
            boolean Z2 = Z();
            if (Z != Z2) {
                if (Z2) {
                    u(this.i0);
                } else {
                    c0(this.i0);
                }
                invalidateSelf();
                B();
            }
        }
    }

    public final void H(float f) {
        if (this.Q != f) {
            this.Q = f;
            C2825iF c2825iFF = this.b.a.f();
            c2825iFF.e = new C2754h(f);
            c2825iFF.f = new C2754h(f);
            c2825iFF.g = new C2754h(f);
            c2825iFF.h = new C2754h(f);
            setShapeAppearanceModel(c2825iFF.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.W;
        if (drawable3 != 0) {
            boolean z = drawable3 instanceof InterfaceC3380sO;
            drawable2 = drawable3;
            if (z) {
                ((AbstractC3434tO) ((InterfaceC3380sO) drawable3)).getClass();
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fW = w();
            this.W = drawable != null ? drawable.mutate() : null;
            float fW2 = w();
            c0(drawable2);
            if (a0()) {
                u(this.W);
            }
            invalidateSelf();
            if (fW != fW2) {
                B();
            }
        }
    }

    public final void J(float f) {
        if (this.Y != f) {
            float fW = w();
            this.Y = f;
            float fW2 = w();
            invalidateSelf();
            if (fW != fW2) {
                B();
            }
        }
    }

    public final void K(ColorStateList colorStateList) {
        this.Z = true;
        if (this.X != colorStateList) {
            this.X = colorStateList;
            if (a0()) {
                this.W.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void L(boolean z) {
        if (this.V != z) {
            boolean zA0 = a0();
            this.V = z;
            boolean zA02 = a0();
            if (zA0 != zA02) {
                if (zA02) {
                    u(this.W);
                } else {
                    c0(this.W);
                }
                invalidateSelf();
                B();
            }
        }
    }

    public final void M(ColorStateList colorStateList) {
        if (this.R != colorStateList) {
            this.R = colorStateList;
            if (this.V0) {
                C2529cu c2529cu = this.b;
                if (c2529cu.e != colorStateList) {
                    c2529cu.e = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void N(float f) {
        if (this.S != f) {
            this.S = f;
            this.v0.setStrokeWidth(f);
            if (this.V0) {
                this.b.l = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.b0;
        if (drawable3 != 0) {
            boolean z = drawable3 instanceof InterfaceC3380sO;
            drawable2 = drawable3;
            if (z) {
                ((AbstractC3434tO) ((InterfaceC3380sO) drawable3)).getClass();
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fX = x();
            this.b0 = drawable != null ? drawable.mutate() : null;
            this.c0 = new RippleDrawable(QC.a(this.T), this.b0, X0);
            float fX2 = x();
            c0(drawable2);
            if (b0()) {
                u(this.b0);
            }
            invalidateSelf();
            if (fX != fX2) {
                B();
            }
        }
    }

    public final void P(float f) {
        if (this.s0 != f) {
            this.s0 = f;
            invalidateSelf();
            if (b0()) {
                B();
            }
        }
    }

    public final void Q(float f) {
        if (this.e0 != f) {
            this.e0 = f;
            invalidateSelf();
            if (b0()) {
                B();
            }
        }
    }

    public final void R(float f) {
        if (this.r0 != f) {
            this.r0 = f;
            invalidateSelf();
            if (b0()) {
                B();
            }
        }
    }

    public final boolean S(int[] iArr) {
        if (Arrays.equals(this.O0, iArr)) {
            return false;
        }
        this.O0 = iArr;
        if (b0()) {
            return C(getState(), iArr);
        }
        return false;
    }

    public final void T(ColorStateList colorStateList) {
        if (this.d0 != colorStateList) {
            this.d0 = colorStateList;
            if (b0()) {
                this.b0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void U(boolean z) {
        if (this.a0 != z) {
            boolean zB0 = b0();
            this.a0 = z;
            boolean zB02 = b0();
            if (zB0 != zB02) {
                if (zB02) {
                    u(this.b0);
                } else {
                    c0(this.b0);
                }
                invalidateSelf();
                B();
            }
        }
    }

    public final void V(float f) {
        if (this.o0 != f) {
            float fW = w();
            this.o0 = f;
            float fW2 = w();
            invalidateSelf();
            if (fW != fW2) {
                B();
            }
        }
    }

    public final void W(float f) {
        if (this.n0 != f) {
            float fW = w();
            this.n0 = f;
            float fW2 = w();
            invalidateSelf();
            if (fW != fW2) {
                B();
            }
        }
    }

    public final void X(ColorStateList colorStateList) {
        if (this.T != colorStateList) {
            this.T = colorStateList;
            this.Q0 = this.P0 ? QC.a(colorStateList) : null;
            onStateChange(getState());
        }
    }

    public final void Y(EI ei) {
        HI hi = this.A0;
        if (hi.f != ei) {
            hi.f = ei;
            if (ei != null) {
                TextPaint textPaint = hi.a;
                Context context = this.u0;
                G9 g9 = hi.b;
                ei.e(context, textPaint, g9);
                GI gi = (GI) hi.e.get();
                if (gi != null) {
                    textPaint.drawableState = gi.getState();
                }
                ei.d(context, textPaint, g9);
                hi.d = true;
            }
            GI gi2 = (GI) hi.e.get();
            if (gi2 != null) {
                K9 k9 = (K9) gi2;
                k9.B();
                k9.invalidateSelf();
                k9.onStateChange(gi2.getState());
            }
        }
    }

    public final boolean Z() {
        return this.h0 && this.i0 != null && this.H0;
    }

    public final boolean a0() {
        return this.V && this.W != null;
    }

    public final boolean b0() {
        return this.a0 && this.b0 != null;
    }

    @Override // defpackage.C2638eu, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        float f;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.J0) == 0) {
            return;
        }
        int iSaveLayerAlpha = i < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i) : 0;
        boolean z = this.V0;
        Paint paint = this.v0;
        RectF rectF = this.x0;
        if (!z) {
            paint.setColor(this.B0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas.drawRoundRect(rectF, y(), y(), paint);
        }
        if (!this.V0) {
            paint.setColor(this.C0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.K0;
            if (colorFilter == null) {
                colorFilter = this.L0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas.drawRoundRect(rectF, y(), y(), paint);
        }
        if (this.V0) {
            super.draw(canvas);
        }
        if (this.S > 0.0f && !this.V0) {
            paint.setColor(this.E0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.V0) {
                ColorFilter colorFilter2 = this.K0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.L0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f2 = bounds.left;
            float f3 = this.S / 2.0f;
            rectF.set(f2 + f3, bounds.top + f3, bounds.right - f3, bounds.bottom - f3);
            float f4 = this.Q - (this.S / 2.0f);
            canvas.drawRoundRect(rectF, f4, f4, paint);
        }
        paint.setColor(this.F0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.V0) {
            RectF rectF2 = new RectF(bounds);
            Path path = this.z0;
            C2529cu c2529cu = this.b;
            this.y.a(c2529cu.a, this.I, c2529cu.k, rectF2, this.x, path);
            f(canvas, paint, path, this.b.a, this.I, h());
        } else {
            canvas.drawRoundRect(rectF, y(), y(), paint);
        }
        if (a0()) {
            v(bounds, rectF);
            float f5 = rectF.left;
            float f6 = rectF.top;
            canvas.translate(f5, f6);
            this.W.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.W.draw(canvas);
            canvas.translate(-f5, -f6);
        }
        if (Z()) {
            v(bounds, rectF);
            float f7 = rectF.left;
            float f8 = rectF.top;
            canvas.translate(f7, f8);
            this.i0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.i0.draw(canvas);
            canvas.translate(-f7, -f8);
        }
        if (this.T0 && this.U != null) {
            PointF pointF = this.y0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.U;
            HI hi = this.A0;
            if (charSequence != null) {
                float fW = w() + this.m0 + this.p0;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + fW;
                } else {
                    pointF.x = bounds.right - fW;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = hi.a;
                Paint.FontMetrics fontMetrics = this.w0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.U != null) {
                float fW2 = w() + this.m0 + this.p0;
                float fX = x() + this.t0 + this.q0;
                if (getLayoutDirection() == 0) {
                    rectF.left = bounds.left + fW2;
                    f = bounds.right - fX;
                } else {
                    rectF.left = bounds.left + fX;
                    f = bounds.right - fW2;
                }
                rectF.right = f;
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            EI ei = hi.f;
            TextPaint textPaint2 = hi.a;
            if (ei != null) {
                textPaint2.drawableState = getState();
                hi.f.d(this.u0, textPaint2, hi.b);
            }
            textPaint2.setTextAlign(align);
            boolean z2 = Math.round(hi.a(this.U.toString())) > Math.round(rectF.width());
            if (z2) {
                int iSave = canvas.save();
                canvas.clipRect(rectF);
                i2 = iSave;
            } else {
                i2 = 0;
            }
            CharSequence charSequenceEllipsize = this.U;
            if (z2 && this.S0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.S0);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            if (z2) {
                canvas.restoreToCount(i2);
            }
        }
        if (b0()) {
            rectF.setEmpty();
            if (b0()) {
                float f9 = this.t0 + this.s0;
                if (getLayoutDirection() == 0) {
                    float f10 = bounds.right - f9;
                    rectF.right = f10;
                    rectF.left = f10 - this.e0;
                } else {
                    float f11 = bounds.left + f9;
                    rectF.left = f11;
                    rectF.right = f11 + this.e0;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f12 = this.e0;
                float f13 = fExactCenterY - (f12 / 2.0f);
                rectF.top = f13;
                rectF.bottom = f13 + f12;
            }
            float f14 = rectF.left;
            float f15 = rectF.top;
            canvas.translate(f14, f15);
            this.b0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.c0.setBounds(this.b0.getBounds());
            this.c0.jumpToCurrentState();
            this.c0.draw(canvas);
            canvas.translate(-f14, -f15);
        }
        if (this.J0 < 255) {
            canvas.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // defpackage.C2638eu, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.J0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.K0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.P;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(x() + this.A0.a(this.U.toString()) + w() + this.m0 + this.p0 + this.q0 + this.t0), this.U0);
    }

    @Override // defpackage.C2638eu, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.C2638eu, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.V0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.P, this.Q);
        } else {
            outline.setRoundRect(bounds, this.Q);
        }
        outline.setAlpha(this.J0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // defpackage.C2638eu, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        EI ei;
        ColorStateList colorStateList;
        return z(this.N) || z(this.O) || z(this.R) || (this.P0 && z(this.Q0)) || (!((ei = this.A0.f) == null || (colorStateList = ei.k) == null || !colorStateList.isStateful()) || ((this.h0 && this.i0 != null && this.g0) || A(this.W) || A(this.i0) || z(this.M0)));
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (a0()) {
            zOnLayoutDirectionChanged |= this.W.setLayoutDirection(i);
        }
        if (Z()) {
            zOnLayoutDirectionChanged |= this.i0.setLayoutDirection(i);
        }
        if (b0()) {
            zOnLayoutDirectionChanged |= this.b0.setLayoutDirection(i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (a0()) {
            zOnLevelChange |= this.W.setLevel(i);
        }
        if (Z()) {
            zOnLevelChange |= this.i0.setLevel(i);
        }
        if (b0()) {
            zOnLevelChange |= this.b0.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // defpackage.C2638eu, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.V0) {
            super.onStateChange(iArr);
        }
        return C(iArr, this.O0);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // defpackage.C2638eu, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.J0 != i) {
            this.J0 = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.C2638eu, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.K0 != colorFilter) {
            this.K0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // defpackage.C2638eu, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.M0 != colorStateList) {
            this.M0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // defpackage.C2638eu, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.N0 != mode) {
            this.N0 = mode;
            ColorStateList colorStateList = this.M0;
            this.L0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (a0()) {
            visible |= this.W.setVisible(z, z2);
        }
        if (Z()) {
            visible |= this.i0.setVisible(z, z2);
        }
        if (b0()) {
            visible |= this.b0.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void u(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.b0) {
            if (drawable.isStateful()) {
                drawable.setState(this.O0);
            }
            drawable.setTintList(this.d0);
            return;
        }
        Drawable drawable2 = this.W;
        if (drawable == drawable2 && this.Z) {
            drawable2.setTintList(this.X);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void v(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (a0() || Z()) {
            float f = this.m0 + this.n0;
            Drawable drawable = this.H0 ? this.i0 : this.W;
            float intrinsicWidth = this.Y;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + intrinsicWidth;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - intrinsicWidth;
            }
            Drawable drawable2 = this.H0 ? this.i0 : this.W;
            float fCeil = this.Y;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.u0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    public final float w() {
        if (!a0() && !Z()) {
            return 0.0f;
        }
        float f = this.n0;
        Drawable drawable = this.H0 ? this.i0 : this.W;
        float intrinsicWidth = this.Y;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.o0;
    }

    public final float x() {
        if (b0()) {
            return this.r0 + this.e0 + this.s0;
        }
        return 0.0f;
    }

    public final float y() {
        if (!this.V0) {
            return this.Q;
        }
        float[] fArr = this.I;
        return fArr != null ? fArr[3] : this.b.a.e.a(h());
    }
}
