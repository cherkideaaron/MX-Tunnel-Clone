package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.C3397so;
import defpackage.R2;
import defpackage.VA;
import defpackage.VC;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {
    public static final int[] f = {R.attr.colorBackground};
    public static final C3397so m = new C3397so(9);
    public boolean a;
    public boolean b;
    public final Rect c;
    public final Rect d;
    public final R2 e;

    public CardView(Context context, AttributeSet attributeSet) {
        Resources resources;
        int i;
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, com.mxtunnel.pro.R.attr.cardViewStyle);
        Rect rect = new Rect();
        this.c = rect;
        this.d = new Rect();
        R2 r2 = new R2(this, 12);
        this.e = r2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, VA.a, com.mxtunnel.pro.R.attr.cardViewStyle, com.mxtunnel.pro.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                resources = getResources();
                i = com.mxtunnel.pro.R.color.cardview_light_background;
            } else {
                resources = getResources();
                i = com.mxtunnel.pro.R.color.cardview_dark_background;
            }
            colorStateListValueOf = ColorStateList.valueOf(resources.getColor(i));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.a = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.b = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        C3397so c3397so = m;
        VC vc = new VC(colorStateListValueOf, dimension);
        r2.b = vc;
        setBackgroundDrawable(vc);
        setClipToOutline(true);
        setElevation(dimension2);
        c3397so.l(r2, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((VC) ((Drawable) this.e.b)).h;
    }

    public float getCardElevation() {
        return ((CardView) this.e.c).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.c.left;
    }

    public int getContentPaddingRight() {
        return this.c.right;
    }

    public int getContentPaddingTop() {
        return this.c.top;
    }

    public float getMaxCardElevation() {
        return ((VC) ((Drawable) this.e.b)).e;
    }

    public boolean getPreventCornerOverlap() {
        return this.b;
    }

    public float getRadius() {
        return ((VC) ((Drawable) this.e.b)).a;
    }

    public boolean getUseCompatPadding() {
        return this.a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        VC vc = (VC) ((Drawable) this.e.b);
        if (colorStateListValueOf == null) {
            vc.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        vc.h = colorStateListValueOf;
        vc.b.setColor(colorStateListValueOf.getColorForState(vc.getState(), vc.h.getDefaultColor()));
        vc.invalidateSelf();
    }

    public void setCardElevation(float f2) {
        ((CardView) this.e.c).setElevation(f2);
    }

    public void setMaxCardElevation(float f2) {
        m.l(this.e, f2);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.b) {
            this.b = z;
            C3397so c3397so = m;
            R2 r2 = this.e;
            c3397so.l(r2, ((VC) ((Drawable) r2.b)).e);
        }
    }

    public void setRadius(float f2) {
        VC vc = (VC) ((Drawable) this.e.b);
        if (f2 == vc.a) {
            return;
        }
        vc.a = f2;
        vc.b(null);
        vc.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.a != z) {
            this.a = z;
            C3397so c3397so = m;
            R2 r2 = this.e;
            c3397so.l(r2, ((VC) ((Drawable) r2.b)).e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        VC vc = (VC) ((Drawable) this.e.b);
        if (colorStateList == null) {
            vc.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        vc.h = colorStateList;
        vc.b.setColor(colorStateList.getColorForState(vc.getState(), vc.h.getDefaultColor()));
        vc.invalidateSelf();
    }
}
