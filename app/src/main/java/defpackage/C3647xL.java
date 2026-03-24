package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: xL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3647xL extends AbstractC3159oL {
    public static final PorterDuff.Mode p = PorterDuff.Mode.SRC_IN;
    public C3539vL b;
    public PorterDuffColorFilter c;
    public ColorFilter d;
    public boolean e;
    public boolean f;
    public final float[] m;
    public final Matrix n;
    public final Rect o;

    public C3647xL() {
        this.f = true;
        this.m = new float[9];
        this.n = new Matrix();
        this.o = new Rect();
        C3539vL c3539vL = new C3539vL();
        c3539vL.c = null;
        c3539vL.d = p;
        c3539vL.b = new C3485uL();
        this.b = c3539vL;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.o;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.d;
        if (colorFilter == null) {
            colorFilter = this.c;
        }
        Matrix matrix = this.n;
        canvas.getMatrix(matrix);
        float[] fArr = this.m;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, (int) (rect.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        C3539vL c3539vL = this.b;
        Bitmap bitmap = c3539vL.f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != c3539vL.f.getHeight()) {
            c3539vL.f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            c3539vL.k = true;
        }
        if (this.f) {
            C3539vL c3539vL2 = this.b;
            if (c3539vL2.k || c3539vL2.g != c3539vL2.c || c3539vL2.h != c3539vL2.d || c3539vL2.j != c3539vL2.e || c3539vL2.i != c3539vL2.b.getRootAlpha()) {
                C3539vL c3539vL3 = this.b;
                c3539vL3.f.eraseColor(0);
                Canvas canvas2 = new Canvas(c3539vL3.f);
                C3485uL c3485uL = c3539vL3.b;
                c3485uL.a(c3485uL.g, C3485uL.p, canvas2, iMin, iMin2);
                C3539vL c3539vL4 = this.b;
                c3539vL4.g = c3539vL4.c;
                c3539vL4.h = c3539vL4.d;
                c3539vL4.i = c3539vL4.b.getRootAlpha();
                c3539vL4.j = c3539vL4.e;
                c3539vL4.k = false;
            }
        } else {
            C3539vL c3539vL5 = this.b;
            c3539vL5.f.eraseColor(0);
            Canvas canvas3 = new Canvas(c3539vL5.f);
            C3485uL c3485uL2 = c3539vL5.b;
            c3485uL2.a(c3485uL2.g, C3485uL.p, canvas3, iMin, iMin2);
        }
        C3539vL c3539vL6 = this.b;
        if (c3539vL6.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c3539vL6.l == null) {
                Paint paint2 = new Paint();
                c3539vL6.l = paint2;
                paint2.setFilterBitmap(true);
            }
            c3539vL6.l.setAlpha(c3539vL6.b.getRootAlpha());
            c3539vL6.l.setColorFilter(colorFilter);
            paint = c3539vL6.l;
        }
        canvas.drawBitmap(c3539vL6.f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getAlpha() : this.b.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getColorFilter() : this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.a != null && Build.VERSION.SDK_INT >= 24) {
            return new C3593wL(this.a.getConstantState());
        }
        this.b.a = getChangingConfigurations();
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.b.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.b.b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.isAutoMirrored() : this.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            C3539vL c3539vL = this.b;
            if (c3539vL != null) {
                C3485uL c3485uL = c3539vL.b;
                if (c3485uL.n == null) {
                    c3485uL.n = Boolean.valueOf(c3485uL.g.a());
                }
                if (c3485uL.n.booleanValue() || ((colorStateList = this.b.c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.e && super.mutate() == this) {
            C3539vL c3539vL = this.b;
            C3539vL c3539vL2 = new C3539vL();
            c3539vL2.c = null;
            c3539vL2.d = p;
            if (c3539vL != null) {
                c3539vL2.a = c3539vL.a;
                C3485uL c3485uL = new C3485uL(c3539vL.b);
                c3539vL2.b = c3485uL;
                if (c3539vL.b.e != null) {
                    c3485uL.e = new Paint(c3539vL.b.e);
                }
                if (c3539vL.b.d != null) {
                    c3539vL2.b.d = new Paint(c3539vL.b.d);
                }
                c3539vL2.c = c3539vL.c;
                c3539vL2.d = c3539vL.d;
                c3539vL2.e = c3539vL.e;
            }
            this.b = c3539vL2;
            this.e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C3539vL c3539vL = this.b;
        ColorStateList colorStateList = c3539vL.c;
        if (colorStateList == null || (mode = c3539vL.d) == null) {
            z = false;
        } else {
            this.c = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        C3485uL c3485uL = c3539vL.b;
        if (c3485uL.n == null) {
            c3485uL.n = Boolean.valueOf(c3485uL.g.a());
        }
        if (c3485uL.n.booleanValue()) {
            boolean zB = c3539vL.b.g.b(iArr);
            c3539vL.k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.b.b.getRootAlpha() != i) {
            this.b.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.b.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            AbstractC0500aq.Z(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        C3539vL c3539vL = this.b;
        if (c3539vL.c != colorStateList) {
            c3539vL.c = colorStateList;
            this.c = a(colorStateList, c3539vL.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        C3539vL c3539vL = this.b;
        if (c3539vL.d != mode) {
            c3539vL.d = mode;
            this.c = a(c3539vL.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.a;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C3485uL c3485uL;
        int i;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C3539vL c3539vL = this.b;
        c3539vL.b = new C3485uL();
        TypedArray typedArrayA = AbstractC0136He.A(resources, theme, attributeSet, AbstractC3279qd.a);
        C3539vL c3539vL2 = this.b;
        C3485uL c3485uL2 = c3539vL2.b;
        int i4 = !AbstractC0136He.v(xmlPullParser, "tintMode") ? -1 : typedArrayA.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i5 = 3;
        if (i4 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i4 != 5) {
            if (i4 != 9) {
                switch (i4) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        c3539vL2.d = mode;
        int i6 = 1;
        ColorStateList colorStateListA = null;
        boolean z3 = false;
        if (AbstractC0136He.v(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            typedArrayA.getValue(1, typedValue);
            int i7 = typedValue.type;
            if (i7 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i7 < 28 || i7 > 31) {
                Resources resources2 = typedArrayA.getResources();
                int resourceId = typedArrayA.getResourceId(1, 0);
                ThreadLocal threadLocal = AbstractC3761za.a;
                try {
                    colorStateListA = AbstractC3761za.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                }
            } else {
                colorStateListA = ColorStateList.valueOf(typedValue.data);
            }
        }
        ColorStateList colorStateList = colorStateListA;
        if (colorStateList != null) {
            c3539vL2.c = colorStateList;
        }
        boolean z4 = c3539vL2.e;
        if (AbstractC0136He.v(xmlPullParser, "autoMirrored")) {
            z4 = typedArrayA.getBoolean(5, z4);
        }
        c3539vL2.e = z4;
        float f = c3485uL2.j;
        if (AbstractC0136He.v(xmlPullParser, "viewportWidth")) {
            f = typedArrayA.getFloat(7, f);
        }
        c3485uL2.j = f;
        float f2 = c3485uL2.k;
        if (AbstractC0136He.v(xmlPullParser, "viewportHeight")) {
            f2 = typedArrayA.getFloat(8, f2);
        }
        c3485uL2.k = f2;
        if (c3485uL2.j <= 0.0f) {
            throw new XmlPullParserException(typedArrayA.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 <= 0.0f) {
            throw new XmlPullParserException(typedArrayA.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        c3485uL2.h = typedArrayA.getDimension(3, c3485uL2.h);
        float dimension = typedArrayA.getDimension(2, c3485uL2.i);
        c3485uL2.i = dimension;
        if (c3485uL2.h <= 0.0f) {
            throw new XmlPullParserException(typedArrayA.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArrayA.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = c3485uL2.getAlpha();
        if (AbstractC0136He.v(xmlPullParser, "alpha")) {
            alpha = typedArrayA.getFloat(4, alpha);
        }
        c3485uL2.setAlpha(alpha);
        String string = typedArrayA.getString(0);
        if (string != null) {
            c3485uL2.m = string;
            c3485uL2.o.put(string, c3485uL2);
        }
        typedArrayA.recycle();
        c3539vL.a = getChangingConfigurations();
        c3539vL.k = true;
        C3539vL c3539vL3 = this.b;
        C3485uL c3485uL3 = c3539vL3.b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c3485uL3.g);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z5 = true;
        while (eventType != i6 && (xmlPullParser.getDepth() >= depth || eventType != i5)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C3323rL c3323rL = (C3323rL) arrayDeque.peek();
                boolean zEquals = "path".equals(name);
                i = depth;
                Z3 z32 = c3485uL3.o;
                if (zEquals) {
                    C3269qL c3269qL = new C3269qL();
                    c3269qL.f = 0.0f;
                    c3269qL.h = 1.0f;
                    c3269qL.i = 1.0f;
                    c3269qL.j = 0.0f;
                    c3269qL.k = 1.0f;
                    c3269qL.l = 0.0f;
                    Paint.Cap cap = Paint.Cap.BUTT;
                    c3269qL.m = cap;
                    Paint.Join join = Paint.Join.MITER;
                    c3269qL.n = join;
                    c3485uL = c3485uL3;
                    c3269qL.o = 4.0f;
                    TypedArray typedArrayA2 = AbstractC0136He.A(resources, theme, attributeSet, AbstractC3279qd.c);
                    if (AbstractC0136He.v(xmlPullParser, "pathData")) {
                        String string2 = typedArrayA2.getString(0);
                        if (string2 != null) {
                            c3269qL.b = string2;
                        }
                        String string3 = typedArrayA2.getString(2);
                        if (string3 != null) {
                            c3269qL.a = AbstractC0500aq.v(string3);
                        }
                        c3269qL.g = AbstractC0136He.r(typedArrayA2, xmlPullParser, theme, "fillColor", 1);
                        float f3 = c3269qL.i;
                        if (AbstractC0136He.v(xmlPullParser, "fillAlpha")) {
                            f3 = typedArrayA2.getFloat(12, f3);
                        }
                        c3269qL.i = f3;
                        int i8 = !AbstractC0136He.v(xmlPullParser, "strokeLineCap") ? -1 : typedArrayA2.getInt(8, -1);
                        c3269qL.m = i8 != 0 ? i8 != 1 ? i8 != 2 ? c3269qL.m : Paint.Cap.SQUARE : Paint.Cap.ROUND : cap;
                        int i9 = !AbstractC0136He.v(xmlPullParser, "strokeLineJoin") ? -1 : typedArrayA2.getInt(9, -1);
                        c3269qL.n = i9 != 0 ? i9 != 1 ? i9 != 2 ? c3269qL.n : Paint.Join.BEVEL : Paint.Join.ROUND : join;
                        float f4 = c3269qL.o;
                        if (AbstractC0136He.v(xmlPullParser, "strokeMiterLimit")) {
                            f4 = typedArrayA2.getFloat(10, f4);
                        }
                        c3269qL.o = f4;
                        c3269qL.e = AbstractC0136He.r(typedArrayA2, xmlPullParser, theme, "strokeColor", 3);
                        float f5 = c3269qL.h;
                        if (AbstractC0136He.v(xmlPullParser, "strokeAlpha")) {
                            f5 = typedArrayA2.getFloat(11, f5);
                        }
                        c3269qL.h = f5;
                        float f6 = c3269qL.f;
                        if (AbstractC0136He.v(xmlPullParser, "strokeWidth")) {
                            f6 = typedArrayA2.getFloat(4, f6);
                        }
                        c3269qL.f = f6;
                        float f7 = c3269qL.k;
                        if (AbstractC0136He.v(xmlPullParser, "trimPathEnd")) {
                            f7 = typedArrayA2.getFloat(6, f7);
                        }
                        c3269qL.k = f7;
                        float f8 = c3269qL.l;
                        if (AbstractC0136He.v(xmlPullParser, "trimPathOffset")) {
                            f8 = typedArrayA2.getFloat(7, f8);
                        }
                        c3269qL.l = f8;
                        float f9 = c3269qL.j;
                        if (AbstractC0136He.v(xmlPullParser, "trimPathStart")) {
                            f9 = typedArrayA2.getFloat(5, f9);
                        }
                        c3269qL.j = f9;
                        int i10 = c3269qL.c;
                        if (AbstractC0136He.v(xmlPullParser, "fillType")) {
                            i10 = typedArrayA2.getInt(13, i10);
                        }
                        c3269qL.c = i10;
                    }
                    typedArrayA2.recycle();
                    c3323rL.b.add(c3269qL);
                    if (c3269qL.getPathName() != null) {
                        z32.put(c3269qL.getPathName(), c3269qL);
                    }
                    c3539vL3.a |= c3269qL.d;
                    z2 = false;
                    i2 = 1;
                    z5 = false;
                } else {
                    c3485uL = c3485uL3;
                    if ("clip-path".equals(name)) {
                        C3214pL c3214pL = new C3214pL();
                        if (AbstractC0136He.v(xmlPullParser, "pathData")) {
                            TypedArray typedArrayA3 = AbstractC0136He.A(resources, theme, attributeSet, AbstractC3279qd.d);
                            String string4 = typedArrayA3.getString(0);
                            if (string4 != null) {
                                c3214pL.b = string4;
                            }
                            String string5 = typedArrayA3.getString(1);
                            if (string5 != null) {
                                c3214pL.a = AbstractC0500aq.v(string5);
                            }
                            c3214pL.c = !AbstractC0136He.v(xmlPullParser, "fillType") ? 0 : typedArrayA3.getInt(2, 0);
                            typedArrayA3.recycle();
                        }
                        c3323rL.b.add(c3214pL);
                        if (c3214pL.getPathName() != null) {
                            z32.put(c3214pL.getPathName(), c3214pL);
                        }
                        c3539vL3.a = c3214pL.d | c3539vL3.a;
                    } else if ("group".equals(name)) {
                        C3323rL c3323rL2 = new C3323rL();
                        TypedArray typedArrayA4 = AbstractC0136He.A(resources, theme, attributeSet, AbstractC3279qd.b);
                        float f10 = c3323rL2.c;
                        if (AbstractC0136He.v(xmlPullParser, "rotation")) {
                            f10 = typedArrayA4.getFloat(5, f10);
                        }
                        c3323rL2.c = f10;
                        i2 = 1;
                        c3323rL2.d = typedArrayA4.getFloat(1, c3323rL2.d);
                        c3323rL2.e = typedArrayA4.getFloat(2, c3323rL2.e);
                        float f11 = c3323rL2.f;
                        if (AbstractC0136He.v(xmlPullParser, "scaleX")) {
                            f11 = typedArrayA4.getFloat(3, f11);
                        }
                        c3323rL2.f = f11;
                        float f12 = c3323rL2.g;
                        if (AbstractC0136He.v(xmlPullParser, "scaleY")) {
                            f12 = typedArrayA4.getFloat(4, f12);
                        }
                        c3323rL2.g = f12;
                        float f13 = c3323rL2.h;
                        if (AbstractC0136He.v(xmlPullParser, "translateX")) {
                            f13 = typedArrayA4.getFloat(6, f13);
                        }
                        c3323rL2.h = f13;
                        float f14 = c3323rL2.i;
                        if (AbstractC0136He.v(xmlPullParser, "translateY")) {
                            f14 = typedArrayA4.getFloat(7, f14);
                        }
                        c3323rL2.i = f14;
                        z2 = false;
                        String string6 = typedArrayA4.getString(0);
                        if (string6 != null) {
                            c3323rL2.l = string6;
                        }
                        c3323rL2.c();
                        typedArrayA4.recycle();
                        c3323rL.b.add(c3323rL2);
                        arrayDeque.push(c3323rL2);
                        if (c3323rL2.getGroupName() != null) {
                            z32.put(c3323rL2.getGroupName(), c3323rL2);
                        }
                        c3539vL3.a = c3323rL2.k | c3539vL3.a;
                    }
                    z2 = false;
                    i2 = 1;
                }
                z = z2;
                i3 = 3;
            } else {
                c3485uL = c3485uL3;
                i = depth;
                i2 = i6;
                z = z3;
                i3 = 3;
                if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            i5 = i3;
            z3 = z;
            i6 = i2;
            depth = i;
            c3485uL3 = c3485uL;
        }
        if (z5) {
            throw new XmlPullParserException("no path defined");
        }
        this.c = a(c3539vL.c, c3539vL.d);
    }

    public C3647xL(C3539vL c3539vL) {
        this.f = true;
        this.m = new float[9];
        this.n = new Matrix();
        this.o = new Rect();
        this.b = c3539vL;
        this.c = a(c3539vL.c, c3539vL.d);
    }
}
