package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.mxtunnel.pro.R;

/* renamed from: q7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3255q7 extends FrameLayout {
    public static final ViewOnTouchListenerC3200p7 r = new ViewOnTouchListenerC3200p7();
    public AbstractC3309r7 a;
    public final C2878jF b;
    public int c;
    public final float d;
    public final float e;
    public final int f;
    public final int m;
    public ColorStateList n;
    public PorterDuff.Mode o;
    public Rect p;
    public boolean q;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC3255q7(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        GradientDrawable gradientDrawable;
        super(AbstractC3279qd.n0(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, RA.C);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setElevation(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.c = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.b = C2878jF.b(context2, attributeSet, 0, 0).a();
        }
        this.d = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(AbstractC3296qu.x(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(AbstractC2883jK.H(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.e = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(r);
        setFocusable(true);
        if (getBackground() == null) {
            int iP = AbstractC0500aq.P(AbstractC0500aq.C(this, R.attr.colorSurface), AbstractC0500aq.C(this, R.attr.colorOnSurface), getBackgroundOverlayColorAlpha());
            C2878jF c2878jF = this.b;
            if (c2878jF != null) {
                C0294Qj c0294Qj = AbstractC3309r7.u;
                C2638eu c2638eu = new C2638eu(c2878jF);
                c2638eu.o(ColorStateList.valueOf(iP));
                gradientDrawable = c2638eu;
            } else {
                Resources resources = getResources();
                C0294Qj c0294Qj2 = AbstractC3309r7.u;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(iP);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.n;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            setBackground(gradientDrawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBaseTransientBottomBar(AbstractC3309r7 abstractC3309r7) {
        this.a = abstractC3309r7;
    }

    public float getActionTextColorAlpha() {
        return this.e;
    }

    public int getAnimationMode() {
        return this.c;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.d;
    }

    public int getMaxInlineActionWidth() {
        return this.m;
    }

    public int getMaxWidth() {
        return this.f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC3309r7 abstractC3309r7 = this.a;
        if (abstractC3309r7 != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                WindowInsets rootWindowInsets = abstractC3309r7.i.getRootWindowInsets();
                if (rootWindowInsets != null) {
                    abstractC3309r7.p = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                    abstractC3309r7.f();
                }
            } else {
                abstractC3309r7.getClass();
            }
        }
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractC3309r7 abstractC3309r7 = this.a;
        if (abstractC3309r7 == null || !abstractC3309r7.b()) {
            return;
        }
        AbstractC3309r7.x.post(new RunnableC3035m7(abstractC3309r7, 1));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        AbstractC3309r7 abstractC3309r7 = this.a;
        if (abstractC3309r7 == null || !abstractC3309r7.r) {
            return;
        }
        abstractC3309r7.e();
        abstractC3309r7.r = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.f;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    public void setAnimationMode(int i) {
        this.c = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.n != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.n);
            drawable.setTintMode(this.o);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.n = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintList(colorStateList);
            drawableMutate.setTintMode(this.o);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.o = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintMode(mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (this.q || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        this.p = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        AbstractC3309r7 abstractC3309r7 = this.a;
        if (abstractC3309r7 != null) {
            C0294Qj c0294Qj = AbstractC3309r7.u;
            abstractC3309r7.f();
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : r);
        super.setOnClickListener(onClickListener);
    }
}
