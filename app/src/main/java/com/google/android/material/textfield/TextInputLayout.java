package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import defpackage.A7;
import defpackage.AbstractC0013Aa;
import defpackage.AbstractC0069Df;
import defpackage.AbstractC0115Ga;
import defpackage.AbstractC0138Hg;
import defpackage.AbstractC0500aq;
import defpackage.AbstractC2883jK;
import defpackage.AbstractC3228ph;
import defpackage.AbstractC3279qd;
import defpackage.AbstractC3296qu;
import defpackage.C0242Ni;
import defpackage.C0243Nj;
import defpackage.C0259Oi;
import defpackage.C0285Qa;
import defpackage.C0360Uh;
import defpackage.C2529cu;
import defpackage.C2638eu;
import defpackage.C2662fH;
import defpackage.C2754h;
import defpackage.C2825iF;
import defpackage.C2827iH;
import defpackage.C2878jF;
import defpackage.C3329ra;
import defpackage.C3390sh;
import defpackage.C3413t3;
import defpackage.C3506up;
import defpackage.C3549ve;
import defpackage.C3560vp;
import defpackage.C3584wC;
import defpackage.C3634x8;
import defpackage.D3;
import defpackage.EI;
import defpackage.G7;
import defpackage.H0;
import defpackage.I2;
import defpackage.II;
import defpackage.InterfaceC0100Fc;
import defpackage.JI;
import defpackage.Jt;
import defpackage.KI;
import defpackage.LH;
import defpackage.LI;
import defpackage.MO;
import defpackage.RA;
import defpackage.RunnableC2705g5;
import defpackage.S1;
import defpackage.SG;
import defpackage.TJ;
import defpackage.UL;
import defpackage.XC;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;

/* loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] J0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public C3413t3 A;
    public int A0;
    public ColorStateList B;
    public boolean B0;
    public int C;
    public final C3329ra C0;
    public C0243Nj D;
    public boolean D0;
    public C0243Nj E;
    public boolean E0;
    public ColorStateList F;
    public ValueAnimator F0;
    public ColorStateList G;
    public boolean G0;
    public ColorStateList H;
    public boolean H0;
    public ColorStateList I;
    public boolean I0;
    public boolean J;
    public CharSequence K;
    public boolean L;
    public C2638eu M;
    public C2638eu N;
    public StateListDrawable O;
    public boolean P;
    public C2638eu Q;
    public C2638eu R;
    public C2878jF S;
    public boolean T;
    public final int U;
    public int V;
    public int W;
    public final FrameLayout a;
    public int a0;
    public final SG b;
    public int b0;
    public final C0259Oi c;
    public int c0;
    public final int d;
    public int d0;
    public EditText e;
    public int e0;
    public CharSequence f;
    public final Rect f0;
    public final Rect g0;
    public final RectF h0;
    public Typeface i0;
    public ColorDrawable j0;
    public int k0;
    public final LinkedHashSet l0;
    public int m;
    public ColorDrawable m0;
    public int n;
    public int n0;
    public int o;
    public Drawable o0;
    public int p;
    public ColorStateList p0;
    public final C3560vp q;
    public ColorStateList q0;
    public boolean r;
    public int r0;
    public int s;
    public int s0;
    public boolean t;
    public int t0;
    public KI u;
    public ColorStateList u0;
    public C3413t3 v;
    public int v0;
    public int w;
    public int w0;
    public int x;
    public int x0;
    public CharSequence y;
    public int y0;
    public boolean z;
    public int z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int colorForState;
        super(AbstractC3279qd.n0(context, attributeSet, com.mxtunnel.pro.R.attr.textInputStyle, com.mxtunnel.pro.R.style.Widget_Design_TextInputLayout), attributeSet, com.mxtunnel.pro.R.attr.textInputStyle);
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = new C3560vp(this);
        this.u = new LH(1);
        this.f0 = new Rect();
        this.g0 = new Rect();
        this.h0 = new RectF();
        this.l0 = new LinkedHashSet();
        C3329ra c3329ra = new C3329ra(this);
        this.C0 = c3329ra;
        this.I0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = S1.a;
        c3329ra.R = linearInterpolator;
        c3329ra.j(false);
        c3329ra.Q = linearInterpolator;
        c3329ra.j(false);
        if (c3329ra.g != 8388659) {
            c3329ra.g = 8388659;
            c3329ra.j(false);
        }
        int[] iArr = RA.F;
        AbstractC3279qd.k(context2, attributeSet, com.mxtunnel.pro.R.attr.textInputStyle, com.mxtunnel.pro.R.style.Widget_Design_TextInputLayout);
        AbstractC3279qd.m(context2, attributeSet, iArr, com.mxtunnel.pro.R.attr.textInputStyle, com.mxtunnel.pro.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 50);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.mxtunnel.pro.R.attr.textInputStyle, com.mxtunnel.pro.R.style.Widget_Design_TextInputLayout);
        D3 d3 = new D3(context2, typedArrayObtainStyledAttributes);
        SG sg = new SG(this, d3);
        this.b = sg;
        this.J = typedArrayObtainStyledAttributes.getBoolean(48, true);
        setHint(typedArrayObtainStyledAttributes.getText(4));
        this.E0 = typedArrayObtainStyledAttributes.getBoolean(47, true);
        this.D0 = typedArrayObtainStyledAttributes.getBoolean(42, true);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setMinEms(typedArrayObtainStyledAttributes.getInt(6, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(3)) {
            setMinWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setMaxEms(typedArrayObtainStyledAttributes.getInt(5, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(2)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.S = C2878jF.b(context2, attributeSet, com.mxtunnel.pro.R.attr.textInputStyle, com.mxtunnel.pro.R.style.Widget_Design_TextInputLayout).a();
        this.U = context2.getResources().getDimensionPixelOffset(com.mxtunnel.pro.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.W = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.d = getResources().getDimensionPixelSize(com.mxtunnel.pro.R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.mxtunnel.pro.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.mxtunnel.pro.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.a0 = this.b0;
        float dimension = typedArrayObtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(11, -1.0f);
        C2825iF c2825iFF = this.S.f();
        if (dimension >= 0.0f) {
            c2825iFF.e = new C2754h(dimension);
        }
        if (dimension2 >= 0.0f) {
            c2825iFF.f = new C2754h(dimension2);
        }
        if (dimension3 >= 0.0f) {
            c2825iFF.g = new C2754h(dimension3);
        }
        if (dimension4 >= 0.0f) {
            c2825iFF.h = new C2754h(dimension4);
        }
        this.S = c2825iFF.a();
        ColorStateList colorStateListW = AbstractC3296qu.w(context2, d3, 7);
        if (colorStateListW != null) {
            int defaultColor = colorStateListW.getDefaultColor();
            this.v0 = defaultColor;
            this.e0 = defaultColor;
            if (colorStateListW.isStateful()) {
                this.w0 = colorStateListW.getColorForState(new int[]{-16842910}, -1);
                this.x0 = colorStateListW.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                colorForState = colorStateListW.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.x0 = this.v0;
                ColorStateList colorStateListU = AbstractC0115Ga.u(context2, com.mxtunnel.pro.R.color.mtrl_filled_background_color);
                this.w0 = colorStateListU.getColorForState(new int[]{-16842910}, -1);
                colorForState = colorStateListU.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
            this.y0 = colorForState;
        } else {
            this.e0 = 0;
            this.v0 = 0;
            this.w0 = 0;
            this.x0 = 0;
            this.y0 = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ColorStateList colorStateListW2 = d3.w(1);
            this.q0 = colorStateListW2;
            this.p0 = colorStateListW2;
        }
        ColorStateList colorStateListW3 = AbstractC3296qu.w(context2, d3, 14);
        this.t0 = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.r0 = context2.getColor(com.mxtunnel.pro.R.color.mtrl_textinput_default_box_stroke_color);
        this.z0 = context2.getColor(com.mxtunnel.pro.R.color.mtrl_textinput_disabled_color);
        this.s0 = context2.getColor(com.mxtunnel.pro.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListW3 != null) {
            setBoxStrokeColorStateList(colorStateListW3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(AbstractC3296qu.w(context2, d3, 15));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(50, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(50, 0));
        }
        this.H = d3.w(24);
        this.I = d3.w(25);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(35);
        int i = typedArrayObtainStyledAttributes.getInt(34, 1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(45, 0);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(43);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(58, 0);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(57);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(typedArrayObtainStyledAttributes.getInt(19, -1));
        this.x = typedArrayObtainStyledAttributes.getResourceId(22, 0);
        this.w = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.w);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.x);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArrayObtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(d3.w(41));
        }
        if (typedArrayObtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(d3.w(46));
        }
        if (typedArrayObtainStyledAttributes.hasValue(51)) {
            setHintTextColor(d3.w(51));
        }
        if (typedArrayObtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(d3.w(23));
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(d3.w(21));
        }
        if (typedArrayObtainStyledAttributes.hasValue(59)) {
            setPlaceholderTextColor(d3.w(59));
        }
        C0259Oi c0259Oi = new C0259Oi(this, d3);
        this.c = c0259Oi;
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        setHintMaxLines(typedArrayObtainStyledAttributes.getInt(49, 1));
        d3.P();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
        frameLayout.addView(sg);
        frameLayout.addView(c0259Oi);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.e;
        if (!(editText instanceof AutoCompleteTextView) || AbstractC3279qd.M(editText)) {
            return this.M;
        }
        int iC = AbstractC0500aq.C(this.e, com.mxtunnel.pro.R.attr.colorControlHighlight);
        int i = this.V;
        int[][] iArr = J0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            C2638eu c2638eu = this.M;
            int i2 = this.e0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{AbstractC0500aq.P(iC, i2, 0.1f), i2}), c2638eu, c2638eu);
        }
        Context context = getContext();
        C2638eu c2638eu2 = this.M;
        TypedValue typedValueW = AbstractC0069Df.W(context, com.mxtunnel.pro.R.attr.colorSurface, "TextInputLayout");
        int i3 = typedValueW.resourceId;
        int color = i3 != 0 ? context.getColor(i3) : typedValueW.data;
        C2638eu c2638eu3 = new C2638eu(c2638eu2.b.a);
        int iP = AbstractC0500aq.P(iC, color, 0.1f);
        c2638eu3.o(new ColorStateList(iArr, new int[]{iP, 0}));
        c2638eu3.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iP, color});
        C2638eu c2638eu4 = new C2638eu(c2638eu2.b.a);
        c2638eu4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c2638eu3, c2638eu4), c2638eu2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.O == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.O = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.O.addState(new int[0], h(false));
        }
        return this.O;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.N == null) {
            this.N = h(true);
        }
        return this.N;
    }

    public static void m(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m((ViewGroup) childAt, z);
            }
        }
    }

    private void setEditText(EditText editText) throws Resources.NotFoundException {
        if (this.e != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.e = editText;
        int i = this.m;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.o);
        }
        int i2 = this.n;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.p);
        }
        this.P = false;
        k();
        setTextInputAccessibilityDelegate(new JI(this));
        Typeface typeface = this.e.getTypeface();
        C3329ra c3329ra = this.C0;
        c3329ra.n(typeface);
        float textSize = this.e.getTextSize();
        if (c3329ra.h != textSize) {
            c3329ra.h = textSize;
            c3329ra.j(false);
        }
        float letterSpacing = this.e.getLetterSpacing();
        if (c3329ra.X != letterSpacing) {
            c3329ra.X = letterSpacing;
            c3329ra.j(false);
        }
        int gravity = this.e.getGravity();
        int i3 = (gravity & (-113)) | 48;
        if (c3329ra.g != i3) {
            c3329ra.g = i3;
            c3329ra.j(false);
        }
        if (c3329ra.f != gravity) {
            c3329ra.f = gravity;
            c3329ra.j(false);
        }
        this.A0 = editText.getMinimumHeight();
        this.e.addTextChangedListener(new II(this, editText));
        if (this.p0 == null) {
            this.p0 = this.e.getHintTextColors();
        }
        if (this.J) {
            if (TextUtils.isEmpty(this.K)) {
                CharSequence hint = this.e.getHint();
                this.f = hint;
                setHint(hint);
                this.e.setHint((CharSequence) null);
            }
            this.L = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        if (this.v != null) {
            p(this.e.getText());
        }
        t();
        this.q.b();
        this.b.bringToFront();
        C0259Oi c0259Oi = this.c;
        c0259Oi.bringToFront();
        Iterator it = this.l0.iterator();
        while (it.hasNext()) {
            ((C0242Ni) it.next()).a(this);
        }
        c0259Oi.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        w(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.K)) {
            return;
        }
        this.K = charSequence;
        C3329ra c3329ra = this.C0;
        if (charSequence == null || !TextUtils.equals(c3329ra.B, charSequence)) {
            c3329ra.B = charSequence;
            c3329ra.C = null;
            c3329ra.j(false);
        }
        if (this.B0) {
            return;
        }
        l();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.z == z) {
            return;
        }
        if (z) {
            C3413t3 c3413t3 = this.A;
            if (c3413t3 != null) {
                this.a.addView(c3413t3);
                this.A.setVisibility(0);
            }
        } else {
            C3413t3 c3413t32 = this.A;
            if (c3413t32 != null) {
                c3413t32.setVisibility(8);
            }
            this.A = null;
        }
        this.z = z;
    }

    public final void a() throws Resources.NotFoundException {
        EditText editText;
        int paddingStart;
        int dimensionPixelSize;
        if (this.e != null) {
            if (this.V != 1) {
                return;
            }
            if (!(getHintMaxLines() == 1)) {
                editText = this.e;
                paddingStart = editText.getPaddingStart();
                dimensionPixelSize = (int) (this.C0.f() + this.d);
            } else if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText2 = this.e;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.mxtunnel.pro.R.dimen.material_filled_edittext_font_2_0_padding_top), this.e.getPaddingEnd(), getResources().getDimensionPixelSize(com.mxtunnel.pro.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
                return;
            } else {
                if (!AbstractC3296qu.H(getContext())) {
                    return;
                }
                editText = this.e;
                paddingStart = editText.getPaddingStart();
                dimensionPixelSize = getResources().getDimensionPixelSize(com.mxtunnel.pro.R.dimen.material_filled_edittext_font_1_3_padding_top);
            }
            editText.setPaddingRelative(paddingStart, dimensionPixelSize, this.e.getPaddingEnd(), getResources().getDimensionPixelSize(com.mxtunnel.pro.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) throws Resources.NotFoundException {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        v();
        setEditText((EditText) view);
    }

    public final void b(float f) {
        int i = 2;
        C3329ra c3329ra = this.C0;
        if (c3329ra.b == f) {
            return;
        }
        if (this.F0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.F0 = valueAnimator;
            valueAnimator.setInterpolator(AbstractC0069Df.V(getContext(), com.mxtunnel.pro.R.attr.motionEasingEmphasizedInterpolator, S1.b));
            this.F0.setDuration(AbstractC0069Df.U(getContext(), com.mxtunnel.pro.R.attr.motionDurationMedium4, 167));
            this.F0.addUpdateListener(new G7(this, i));
        }
        this.F0.setFloatValues(c3329ra.b, f);
        this.F0.start();
    }

    public final void c() {
        int i;
        int i2;
        C2638eu c2638eu = this.M;
        if (c2638eu == null) {
            return;
        }
        C2878jF c2878jF = c2638eu.b.a;
        C2878jF c2878jF2 = this.S;
        if (c2878jF != c2878jF2) {
            c2638eu.setShapeAppearanceModel(c2878jF2);
        }
        if (this.V == 2 && (i = this.a0) > -1 && (i2 = this.d0) != 0) {
            C2638eu c2638eu2 = this.M;
            c2638eu2.b.l = i;
            c2638eu2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i2);
            C2529cu c2529cu = c2638eu2.b;
            if (c2529cu.e != colorStateListValueOf) {
                c2529cu.e = colorStateListValueOf;
                c2638eu2.onStateChange(c2638eu2.getState());
            }
        }
        int iB = this.e0;
        if (this.V == 1) {
            iB = AbstractC0013Aa.b(this.e0, AbstractC0500aq.B(getContext(), com.mxtunnel.pro.R.attr.colorSurface, 0));
        }
        this.e0 = iB;
        this.M.o(ColorStateList.valueOf(iB));
        C2638eu c2638eu3 = this.Q;
        if (c2638eu3 != null && this.R != null) {
            if (this.a0 > -1 && this.d0 != 0) {
                c2638eu3.o(ColorStateList.valueOf(this.e.isFocused() ? this.r0 : this.d0));
                this.R.o(ColorStateList.valueOf(this.d0));
            }
            invalidate();
        }
        u();
    }

    public final Rect d(Rect rect) {
        int paddingTop;
        int iJ;
        if (this.e == null) {
            throw new IllegalStateException();
        }
        boolean z = getLayoutDirection() == 1;
        int i = rect.bottom;
        Rect rect2 = this.g0;
        rect2.bottom = i;
        int i2 = this.V;
        if (i2 == 1) {
            rect2.left = i(rect.left, z);
            paddingTop = rect.top + this.W;
        } else {
            if (i2 == 2) {
                rect2.left = this.e.getPaddingLeft() + rect.left;
                rect2.top = rect.top - e();
                iJ = rect.right - this.e.getPaddingRight();
                rect2.right = iJ;
                return rect2;
            }
            rect2.left = i(rect.left, z);
            paddingTop = getPaddingTop();
        }
        rect2.top = paddingTop;
        iJ = j(rect.right, z);
        rect2.right = iJ;
        return rect2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f != null) {
            boolean z = this.L;
            this.L = false;
            CharSequence hint = editText.getHint();
            this.e.setHint(this.f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.e.setHint(hint);
                this.L = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.e) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.H0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.H0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C2638eu c2638eu;
        int i;
        super.draw(canvas);
        boolean z = this.J;
        C3329ra c3329ra = this.C0;
        if (z) {
            c3329ra.getClass();
            int iSave = canvas.save();
            if (c3329ra.C != null) {
                RectF rectF = c3329ra.e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = c3329ra.O;
                    textPaint.setTextSize(c3329ra.G);
                    float f = c3329ra.q;
                    float f2 = c3329ra.r;
                    float f3 = c3329ra.F;
                    if (f3 != 1.0f) {
                        canvas.scale(f3, f3, f, f2);
                    }
                    if ((c3329ra.e0 > 1 || c3329ra.f0 > 1) && !c3329ra.D && c3329ra.o()) {
                        float lineStart = c3329ra.q - c3329ra.Z.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f2);
                        float f4 = alpha;
                        textPaint.setAlpha((int) (c3329ra.c0 * f4));
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 31) {
                            float f5 = c3329ra.H;
                            float f6 = c3329ra.I;
                            float f7 = c3329ra.J;
                            int i3 = c3329ra.K;
                            textPaint.setShadowLayer(f5, f6, f7, AbstractC0013Aa.d(i3, (textPaint.getAlpha() * Color.alpha(i3)) / 255));
                        }
                        c3329ra.Z.draw(canvas);
                        textPaint.setAlpha((int) (c3329ra.b0 * f4));
                        if (i2 >= 31) {
                            float f8 = c3329ra.H;
                            float f9 = c3329ra.I;
                            float f10 = c3329ra.J;
                            int i4 = c3329ra.K;
                            textPaint.setShadowLayer(f8, f9, f10, AbstractC0013Aa.d(i4, (Color.alpha(i4) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = c3329ra.Z.getLineBaseline(0);
                        CharSequence charSequence = c3329ra.d0;
                        float f11 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f11, textPaint);
                        if (i2 >= 31) {
                            textPaint.setShadowLayer(c3329ra.H, c3329ra.I, c3329ra.J, c3329ra.K);
                        }
                        String strTrim = c3329ra.d0.toString().trim();
                        if (strTrim.endsWith("…")) {
                            i = 0;
                            strTrim = strTrim.substring(0, strTrim.length() - 1);
                        } else {
                            i = 0;
                        }
                        String str = strTrim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(c3329ra.Z.getLineEnd(i), str.length()), 0.0f, f11, (Paint) textPaint);
                    } else {
                        canvas.translate(f, f2);
                        c3329ra.Z.draw(canvas);
                    }
                    canvas.restoreToCount(iSave);
                }
            }
        }
        if (this.R == null || (c2638eu = this.Q) == null) {
            return;
        }
        c2638eu.draw(canvas);
        if (this.e.isFocused()) {
            Rect bounds = this.R.getBounds();
            Rect bounds2 = this.Q.getBounds();
            float f12 = c3329ra.b;
            int iCenterX = bounds2.centerX();
            bounds.left = S1.c(iCenterX, bounds2.left, f12);
            bounds.right = S1.c(iCenterX, bounds2.right, f12);
            this.R.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void drawableStateChanged() throws android.content.res.Resources.NotFoundException {
        /*
            r4 = this;
            boolean r0 = r4.G0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.G0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            ra r3 = r4.C0
            if (r3 == 0) goto L2f
            r3.M = r1
            android.content.res.ColorStateList r1 = r3.k
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.j
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.j(r2)
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.e
            if (r3 == 0) goto L45
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L41
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L41
            goto L42
        L41:
            r0 = r2
        L42:
            r4.w(r0, r2)
        L45:
            r4.t()
            r4.z()
            if (r1 == 0) goto L50
            r4.invalidate()
        L50:
            r4.G0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final int e() {
        if (!this.J) {
            return 0;
        }
        int i = this.V;
        C3329ra c3329ra = this.C0;
        if (i == 0) {
            return (int) c3329ra.f();
        }
        if (i != 2) {
            return 0;
        }
        if (getHintMaxLines() == 1) {
            return (int) (c3329ra.f() / 2.0f);
        }
        float f = c3329ra.f();
        TextPaint textPaint = c3329ra.P;
        textPaint.setTextSize(c3329ra.i);
        textPaint.setTypeface(c3329ra.s);
        textPaint.setLetterSpacing(c3329ra.W);
        return Math.max(0, (int) (f - ((-textPaint.ascent()) / 2.0f)));
    }

    public final C0243Nj f() {
        C0243Nj c0243Nj = new C0243Nj();
        c0243Nj.c = AbstractC0069Df.U(getContext(), com.mxtunnel.pro.R.attr.motionDurationShort2, 87);
        c0243Nj.d = AbstractC0069Df.V(getContext(), com.mxtunnel.pro.R.attr.motionEasingLinearInterpolator, S1.a);
        return c0243Nj;
    }

    public final boolean g() {
        return this.J && !TextUtils.isEmpty(this.K) && (this.M instanceof C3549ve);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.e;
        if (editText == null) {
            return super.getBaseline();
        }
        return e() + getPaddingTop() + editText.getBaseline();
    }

    public C2638eu getBoxBackground() {
        int i = this.V;
        if (i == 1 || i == 2) {
            return this.M;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.e0;
    }

    public int getBoxBackgroundMode() {
        return this.V;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.W;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        return (layoutDirection == 1 ? this.S.h : this.S.g).a(this.h0);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        return (layoutDirection == 1 ? this.S.g : this.S.h).a(this.h0);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        return (layoutDirection == 1 ? this.S.e : this.S.f).a(this.h0);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        return (layoutDirection == 1 ? this.S.f : this.S.e).a(this.h0);
    }

    public int getBoxStrokeColor() {
        return this.t0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.u0;
    }

    public int getBoxStrokeWidth() {
        return this.b0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.c0;
    }

    public int getCounterMaxLength() {
        return this.s;
    }

    public CharSequence getCounterOverflowDescription() {
        C3413t3 c3413t3;
        if (this.r && this.t && (c3413t3 = this.v) != null) {
            return c3413t3.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.G;
    }

    public ColorStateList getCounterTextColor() {
        return this.F;
    }

    public ColorStateList getCursorColor() {
        return this.H;
    }

    public ColorStateList getCursorErrorColor() {
        return this.I;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.p0;
    }

    public EditText getEditText() {
        return this.e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.c.m.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.c.m.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.c.s;
    }

    public int getEndIconMode() {
        return this.c.o;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.c.t;
    }

    public CheckableImageButton getEndIconView() {
        return this.c.m;
    }

    public CharSequence getError() {
        C3560vp c3560vp = this.q;
        if (c3560vp.q) {
            return c3560vp.p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.q.t;
    }

    public CharSequence getErrorContentDescription() {
        return this.q.s;
    }

    public int getErrorCurrentTextColors() {
        C3413t3 c3413t3 = this.q.r;
        if (c3413t3 != null) {
            return c3413t3.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.c.c.getDrawable();
    }

    public CharSequence getHelperText() {
        C3560vp c3560vp = this.q;
        if (c3560vp.x) {
            return c3560vp.w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C3413t3 c3413t3 = this.q.y;
        if (c3413t3 != null) {
            return c3413t3.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.J) {
            return this.K;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.C0.f();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C3329ra c3329ra = this.C0;
        return c3329ra.g(c3329ra.k);
    }

    public int getHintMaxLines() {
        return this.C0.e0;
    }

    public ColorStateList getHintTextColor() {
        return this.q0;
    }

    public KI getLengthCounter() {
        return this.u;
    }

    public int getMaxEms() {
        return this.n;
    }

    public int getMaxWidth() {
        return this.p;
    }

    public int getMinEms() {
        return this.m;
    }

    public int getMinWidth() {
        return this.o;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.c.m.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.c.m.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.z) {
            return this.y;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.C;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.B;
    }

    public CharSequence getPrefixText() {
        return this.b.c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.b.b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.b.b;
    }

    public C2878jF getShapeAppearanceModel() {
        return this.S;
    }

    public CharSequence getStartIconContentDescription() {
        return this.b.d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.b.d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.b.m;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.b.n;
    }

    public CharSequence getSuffixText() {
        return this.c.v;
    }

    public ColorStateList getSuffixTextColor() {
        return this.c.w.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.c.w;
    }

    public Typeface getTypeface() {
        return this.i0;
    }

    public final C2638eu h(boolean z) throws Resources.NotFoundException {
        int i = 0;
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.mxtunnel.pro.R.dimen.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.e;
        float popupElevation = editText instanceof Jt ? ((Jt) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.mxtunnel.pro.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.mxtunnel.pro.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        XC xc = new XC();
        XC xc2 = new XC();
        XC xc3 = new XC();
        XC xc4 = new XC();
        C0360Uh c0360Uh = new C0360Uh(i);
        C0360Uh c0360Uh2 = new C0360Uh(i);
        C0360Uh c0360Uh3 = new C0360Uh(i);
        C0360Uh c0360Uh4 = new C0360Uh(i);
        C2754h c2754h = new C2754h(f);
        C2754h c2754h2 = new C2754h(f);
        C2754h c2754h3 = new C2754h(dimensionPixelOffset);
        C2754h c2754h4 = new C2754h(dimensionPixelOffset);
        C2878jF c2878jF = new C2878jF();
        c2878jF.a = xc;
        c2878jF.b = xc2;
        c2878jF.c = xc3;
        c2878jF.d = xc4;
        c2878jF.e = c2754h;
        c2878jF.f = c2754h2;
        c2878jF.g = c2754h4;
        c2878jF.h = c2754h3;
        c2878jF.i = c0360Uh;
        c2878jF.j = c0360Uh2;
        c2878jF.k = c0360Uh3;
        c2878jF.l = c0360Uh4;
        EditText editText2 = this.e;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof Jt ? ((Jt) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = C2638eu.L;
            TypedValue typedValueW = AbstractC0069Df.W(context, com.mxtunnel.pro.R.attr.colorSurface, C2638eu.class.getSimpleName());
            int i2 = typedValueW.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i2 != 0 ? context.getColor(i2) : typedValueW.data);
        }
        C2638eu c2638eu = new C2638eu();
        c2638eu.l(context);
        c2638eu.o(dropDownBackgroundTintList);
        c2638eu.n(popupElevation);
        c2638eu.setShapeAppearanceModel(c2878jF);
        C2529cu c2529cu = c2638eu.b;
        if (c2529cu.i == null) {
            c2529cu.i = new Rect();
        }
        c2638eu.b.i.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        c2638eu.invalidateSelf();
        return c2638eu;
    }

    public final int i(int i, boolean z) {
        return ((z || getPrefixText() == null) ? (!z || getSuffixText() == null) ? this.e.getCompoundPaddingLeft() : this.c.c() : this.b.a()) + i;
    }

    public final int j(int i, boolean z) {
        return i - ((z || getSuffixText() == null) ? (!z || getPrefixText() == null) ? this.e.getCompoundPaddingRight() : this.b.a() : this.c.c());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k() throws android.content.res.Resources.NotFoundException {
        /*
            r6 = this;
            int r0 = r6.V
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L6d
            if (r0 == r2) goto L55
            if (r0 != r1) goto L42
            boolean r0 = r6.J
            if (r0 == 0) goto L35
            eu r0 = r6.M
            boolean r0 = r0 instanceof defpackage.C3549ve
            if (r0 != 0) goto L35
            jF r0 = r6.S
            int r4 = defpackage.C3549ve.O
            ue r4 = new ue
            if (r0 == 0) goto L1e
            goto L23
        L1e:
            jF r0 = new jF
            r0.<init>()
        L23:
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>()
            r4.<init>(r0, r5)
            ve r0 = new ve
            r0.<init>(r4)
            r0.N = r4
        L32:
            r6.M = r0
            goto L3d
        L35:
            eu r0 = new eu
            jF r4 = r6.S
            r0.<init>(r4)
            goto L32
        L3d:
            r6.Q = r3
            r6.R = r3
            goto L70
        L42:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r6.V
            java.lang.String r3 = " is illegal; only @BoxBackgroundMode constants are supported."
            java.lang.String r1 = defpackage.AbstractC3264qG.j(r1, r2, r3)
            r0.<init>(r1)
            throw r0
        L55:
            eu r0 = new eu
            jF r3 = r6.S
            r0.<init>(r3)
            r6.M = r0
            eu r0 = new eu
            r0.<init>()
            r6.Q = r0
            eu r0 = new eu
            r0.<init>()
            r6.R = r0
            goto L70
        L6d:
            r6.M = r3
            goto L3d
        L70:
            r6.u()
            r6.z()
            int r0 = r6.V
            if (r0 != r2) goto Lae
            android.content.Context r0 = r6.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            float r0 = r0.fontScale
            r3 = 1073741824(0x40000000, float:2.0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L9c
            android.content.res.Resources r0 = r6.getResources()
            r3 = 2131165993(0x7f070329, float:1.7946219E38)
        L95:
            int r0 = r0.getDimensionPixelSize(r3)
            r6.W = r0
            goto Lae
        L9c:
            android.content.Context r0 = r6.getContext()
            boolean r0 = defpackage.AbstractC3296qu.H(r0)
            if (r0 == 0) goto Lae
            android.content.res.Resources r0 = r6.getResources()
            r3 = 2131165992(0x7f070328, float:1.7946217E38)
            goto L95
        Lae:
            r6.a()
            int r0 = r6.V
            if (r0 == 0) goto Lb8
            r6.v()
        Lb8:
            android.widget.EditText r0 = r6.e
            boolean r3 = r0 instanceof android.widget.AutoCompleteTextView
            if (r3 != 0) goto Lbf
            goto Lda
        Lbf:
            android.widget.AutoCompleteTextView r0 = (android.widget.AutoCompleteTextView) r0
            android.graphics.drawable.Drawable r3 = r0.getDropDownBackground()
            if (r3 != 0) goto Lda
            int r3 = r6.V
            if (r3 != r1) goto Ld3
            android.graphics.drawable.Drawable r1 = r6.getOrCreateOutlinedDropDownMenuBackground()
        Lcf:
            r0.setDropDownBackgroundDrawable(r1)
            goto Lda
        Ld3:
            if (r3 != r2) goto Lda
            android.graphics.drawable.Drawable r1 = r6.getOrCreateFilledDropDownMenuBackground()
            goto Lcf
        Lda:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.k():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l() {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.l():void");
    }

    public final void n(TextView textView, int i) {
        try {
            textView.setTextAppearance(i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        textView.setTextAppearance(com.mxtunnel.pro.R.style.TextAppearance_AppCompat_Caption);
        textView.setTextColor(getContext().getColor(com.mxtunnel.pro.R.color.design_error));
    }

    public final boolean o() {
        C3560vp c3560vp = this.q;
        return (c3560vp.o != 1 || c3560vp.r == null || TextUtils.isEmpty(c3560vp.p)) ? false : true;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.C0.i(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        C0259Oi c0259Oi = this.c;
        c0259Oi.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.I0 = false;
        if (this.e != null && this.e.getMeasuredHeight() < (iMax = Math.max(c0259Oi.getMeasuredHeight(), this.b.getMeasuredHeight()))) {
            this.e.setMinimumHeight(iMax);
            z = true;
        }
        boolean zS = s();
        if (z || zS) {
            this.e.post(new H0(this, 16));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float fDescent;
        int i5;
        int compoundPaddingTop;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.e;
        if (editText != null) {
            Rect rect = this.f0;
            AbstractC0138Hg.a(this, editText, rect);
            C2638eu c2638eu = this.Q;
            if (c2638eu != null) {
                int i6 = rect.bottom;
                c2638eu.setBounds(rect.left, i6 - this.b0, rect.right, i6);
            }
            C2638eu c2638eu2 = this.R;
            if (c2638eu2 != null) {
                int i7 = rect.bottom;
                c2638eu2.setBounds(rect.left, i7 - this.c0, rect.right, i7);
            }
            if (this.J) {
                float textSize = this.e.getTextSize();
                C3329ra c3329ra = this.C0;
                if (c3329ra.h != textSize) {
                    c3329ra.h = textSize;
                    c3329ra.j(false);
                }
                int gravity = this.e.getGravity();
                int i8 = (gravity & (-113)) | 48;
                if (c3329ra.g != i8) {
                    c3329ra.g = i8;
                    c3329ra.j(false);
                }
                if (c3329ra.f != gravity) {
                    c3329ra.f = gravity;
                    c3329ra.j(false);
                }
                Rect rectD = d(rect);
                int i9 = rectD.left;
                int i10 = rectD.top;
                int i11 = rectD.right;
                int i12 = rectD.bottom;
                Rect rect2 = c3329ra.d;
                if (rect2.left != i9 || rect2.top != i10 || rect2.right != i11 || rect2.bottom != i12) {
                    rect2.set(i9, i10, i11, i12);
                    c3329ra.N = true;
                }
                if (this.e == null) {
                    throw new IllegalStateException();
                }
                int hintMaxLines = getHintMaxLines();
                TextPaint textPaint = c3329ra.P;
                if (hintMaxLines == 1) {
                    textPaint.setTextSize(c3329ra.h);
                    textPaint.setTypeface(c3329ra.v);
                    textPaint.setLetterSpacing(c3329ra.X);
                    fDescent = -textPaint.ascent();
                } else {
                    textPaint.setTextSize(c3329ra.h);
                    textPaint.setTypeface(c3329ra.v);
                    textPaint.setLetterSpacing(c3329ra.X);
                    fDescent = c3329ra.l * (textPaint.descent() + (-textPaint.ascent()));
                }
                int compoundPaddingLeft = this.e.getCompoundPaddingLeft() + rect.left;
                Rect rect3 = this.g0;
                rect3.left = compoundPaddingLeft;
                if (this.V == 1 && this.e.getMinLines() <= 1) {
                    compoundPaddingTop = (int) (rect.centerY() - (fDescent / 2.0f));
                } else {
                    if (this.V != 0 || getHintMaxLines() == 1) {
                        i5 = 0;
                    } else {
                        textPaint.setTextSize(c3329ra.h);
                        textPaint.setTypeface(c3329ra.v);
                        textPaint.setLetterSpacing(c3329ra.X);
                        i5 = (int) ((-textPaint.ascent()) / 2.0f);
                    }
                    compoundPaddingTop = (this.e.getCompoundPaddingTop() + rect.top) - i5;
                }
                rect3.top = compoundPaddingTop;
                rect3.right = rect.right - this.e.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.V != 1 || this.e.getMinLines() > 1) ? rect.bottom - this.e.getCompoundPaddingBottom() : (int) (rect3.top + fDescent);
                rect3.bottom = compoundPaddingBottom;
                int i13 = rect3.left;
                int i14 = rect3.top;
                int i15 = rect3.right;
                Rect rect4 = c3329ra.c;
                if (!(rect4.left == i13 && rect4.top == i14 && rect4.right == i15 && rect4.bottom == compoundPaddingBottom) || true != c3329ra.k0) {
                    rect4.set(i13, i14, i15, compoundPaddingBottom);
                    c3329ra.N = true;
                    c3329ra.k0 = true;
                }
                c3329ra.j(false);
                if (!g() || this.B0) {
                    return;
                }
                l();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) throws Resources.NotFoundException {
        float f;
        EditText editText;
        super.onMeasure(i, i2);
        boolean z = this.I0;
        C0259Oi c0259Oi = this.c;
        if (!z) {
            c0259Oi.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.I0 = true;
        }
        if (this.A != null && (editText = this.e) != null) {
            this.A.setGravity(editText.getGravity());
            this.A.setPadding(this.e.getCompoundPaddingLeft(), this.e.getCompoundPaddingTop(), this.e.getCompoundPaddingRight(), this.e.getCompoundPaddingBottom());
        }
        c0259Oi.m();
        if (getHintMaxLines() == 1) {
            return;
        }
        int measuredWidth = (this.e.getMeasuredWidth() - this.e.getCompoundPaddingLeft()) - this.e.getCompoundPaddingRight();
        C3329ra c3329ra = this.C0;
        TextPaint textPaint = c3329ra.P;
        textPaint.setTextSize(c3329ra.i);
        textPaint.setTypeface(c3329ra.s);
        textPaint.setLetterSpacing(c3329ra.W);
        float f2 = measuredWidth;
        c3329ra.i0 = c3329ra.e(c3329ra.f0, textPaint, c3329ra.B, (c3329ra.i / c3329ra.h) * f2, c3329ra.D).getHeight();
        textPaint.setTextSize(c3329ra.h);
        textPaint.setTypeface(c3329ra.v);
        textPaint.setLetterSpacing(c3329ra.X);
        c3329ra.j0 = c3329ra.e(c3329ra.e0, textPaint, c3329ra.B, f2, c3329ra.D).getHeight();
        EditText editText2 = this.e;
        Rect rect = this.f0;
        AbstractC0138Hg.a(this, editText2, rect);
        Rect rectD = d(rect);
        int i3 = rectD.left;
        int i4 = rectD.top;
        int i5 = rectD.right;
        int i6 = rectD.bottom;
        Rect rect2 = c3329ra.d;
        if (rect2.left != i3 || rect2.top != i4 || rect2.right != i5 || rect2.bottom != i6) {
            rect2.set(i3, i4, i5, i6);
            c3329ra.N = true;
        }
        v();
        a();
        if (this.e == null) {
            return;
        }
        int i7 = c3329ra.j0;
        if (i7 != -1) {
            f = i7;
        } else {
            TextPaint textPaint2 = c3329ra.P;
            textPaint2.setTextSize(c3329ra.h);
            textPaint2.setTypeface(c3329ra.v);
            textPaint2.setLetterSpacing(c3329ra.X);
            f = -textPaint2.ascent();
        }
        if (this.y != null) {
            TextPaint textPaint3 = new TextPaint(129);
            textPaint3.set(this.A.getPaint());
            textPaint3.setTextSize(this.A.getTextSize());
            textPaint3.setTypeface(this.A.getTypeface());
            textPaint3.setLetterSpacing(this.A.getLetterSpacing());
            C2662fH c2662fH = new C2662fH(this.y, textPaint3, measuredWidth);
            c2662fH.k = getLayoutDirection() == 1;
            c2662fH.j = true;
            float lineSpacingExtra = this.A.getLineSpacingExtra();
            float lineSpacingMultiplier = this.A.getLineSpacingMultiplier();
            c2662fH.g = lineSpacingExtra;
            c2662fH.h = lineSpacingMultiplier;
            c2662fH.m = new C0285Qa(this, 12);
            f = (this.V == 1 ? c3329ra.f() + this.W + this.d : 0.0f) + c2662fH.a().getHeight();
        }
        float fMax = Math.max(f, f);
        if (this.e.getMeasuredHeight() < fMax) {
            this.e.setMinimumHeight(Math.round(fMax));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        if (!(parcelable instanceof LI)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        LI li = (LI) parcelable;
        super.onRestoreInstanceState(li.a);
        setError(li.c);
        if (li.d) {
            post(new RunnableC2705g5(this, 27));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.T) {
            InterfaceC0100Fc interfaceC0100Fc = this.S.e;
            RectF rectF = this.h0;
            float fA = interfaceC0100Fc.a(rectF);
            float fA2 = this.S.f.a(rectF);
            float fA3 = this.S.h.a(rectF);
            float fA4 = this.S.g.a(rectF);
            C2878jF c2878jF = this.S;
            AbstractC0500aq abstractC0500aq = c2878jF.a;
            AbstractC0500aq abstractC0500aq2 = c2878jF.b;
            AbstractC0500aq abstractC0500aq3 = c2878jF.d;
            AbstractC0500aq abstractC0500aq4 = c2878jF.c;
            C0360Uh c0360Uh = new C0360Uh(0);
            C0360Uh c0360Uh2 = new C0360Uh(0);
            C0360Uh c0360Uh3 = new C0360Uh(0);
            C0360Uh c0360Uh4 = new C0360Uh(0);
            C2825iF.b(abstractC0500aq2);
            C2825iF.b(abstractC0500aq);
            C2825iF.b(abstractC0500aq4);
            C2825iF.b(abstractC0500aq3);
            C2754h c2754h = new C2754h(fA2);
            C2754h c2754h2 = new C2754h(fA);
            C2754h c2754h3 = new C2754h(fA4);
            C2754h c2754h4 = new C2754h(fA3);
            C2878jF c2878jF2 = new C2878jF();
            c2878jF2.a = abstractC0500aq2;
            c2878jF2.b = abstractC0500aq;
            c2878jF2.c = abstractC0500aq3;
            c2878jF2.d = abstractC0500aq4;
            c2878jF2.e = c2754h;
            c2878jF2.f = c2754h2;
            c2878jF2.g = c2754h4;
            c2878jF2.h = c2754h3;
            c2878jF2.i = c0360Uh;
            c2878jF2.j = c0360Uh2;
            c2878jF2.k = c0360Uh3;
            c2878jF2.l = c0360Uh4;
            this.T = z;
            setShapeAppearanceModel(c2878jF2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        LI li = new LI(super.onSaveInstanceState());
        if (o()) {
            li.c = getError();
        }
        C0259Oi c0259Oi = this.c;
        li.d = c0259Oi.o != 0 && c0259Oi.m.d;
        return li;
    }

    public final void p(Editable editable) throws Resources.NotFoundException {
        ((LH) this.u).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.t;
        int i = this.s;
        String string = null;
        if (i == -1) {
            this.v.setText(String.valueOf(length));
            this.v.setContentDescription(null);
            this.t = false;
        } else {
            this.t = length > i;
            Context context = getContext();
            this.v.setContentDescription(context.getString(this.t ? com.mxtunnel.pro.R.string.character_counter_overflowed_content_description : com.mxtunnel.pro.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.s)));
            if (z != this.t) {
                q();
            }
            String str = A7.d;
            A7 a7 = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? A7.g : A7.f;
            C3413t3 c3413t3 = this.v;
            String string2 = getContext().getString(com.mxtunnel.pro.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.s));
            if (string2 == null) {
                a7.getClass();
            } else {
                string = a7.c(string2, a7.c).toString();
            }
            c3413t3.setText(string);
        }
        if (this.e == null || z == this.t) {
            return;
        }
        w(false, false);
        z();
        t();
    }

    public final void q() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C3413t3 c3413t3 = this.v;
        if (c3413t3 != null) {
            n(c3413t3, this.t ? this.w : this.x);
            if (!this.t && (colorStateList2 = this.F) != null) {
                this.v.setTextColor(colorStateList2);
            }
            if (!this.t || (colorStateList = this.G) == null) {
                return;
            }
            this.v.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r() throws android.content.res.Resources.NotFoundException {
        /*
            r4 = this;
            android.content.res.ColorStateList r0 = r4.H
            if (r0 == 0) goto L5
            goto L26
        L5:
            android.content.Context r0 = r4.getContext()
            r1 = 2130968843(0x7f04010b, float:1.7546351E38)
            android.util.TypedValue r1 = defpackage.AbstractC0069Df.S(r0, r1)
            r2 = 0
            if (r1 != 0) goto L15
        L13:
            r0 = r2
            goto L26
        L15:
            int r3 = r1.resourceId
            if (r3 == 0) goto L1e
            android.content.res.ColorStateList r0 = defpackage.AbstractC0115Ga.u(r0, r3)
            goto L26
        L1e:
            int r0 = r1.data
            if (r0 == 0) goto L13
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
        L26:
            android.widget.EditText r1 = r4.e
            if (r1 == 0) goto L51
            android.graphics.drawable.Drawable r1 = defpackage.Q.f(r1)
            if (r1 != 0) goto L31
            goto L51
        L31:
            android.widget.EditText r1 = r4.e
            android.graphics.drawable.Drawable r1 = defpackage.Q.f(r1)
            android.graphics.drawable.Drawable r1 = r1.mutate()
            boolean r2 = r4.o()
            if (r2 != 0) goto L49
            t3 r2 = r4.v
            if (r2 == 0) goto L4e
            boolean r2 = r4.t
            if (r2 == 0) goto L4e
        L49:
            android.content.res.ColorStateList r2 = r4.I
            if (r2 == 0) goto L4e
            r0 = r2
        L4e:
            r1.setTintList(r0)
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.r():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean s() {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.s():boolean");
    }

    public void setBoxBackgroundColor(int i) {
        if (this.e0 != i) {
            this.e0 = i;
            this.v0 = i;
            this.x0 = i;
            this.y0 = i;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.v0 = defaultColor;
        this.e0 = defaultColor;
        this.w0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.x0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.y0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i) throws Resources.NotFoundException {
        if (i == this.V) {
            return;
        }
        this.V = i;
        if (this.e != null) {
            k();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.W = i;
    }

    public void setBoxCornerFamily(int i) {
        C2825iF c2825iFF = this.S.f();
        InterfaceC0100Fc interfaceC0100Fc = this.S.e;
        AbstractC0500aq abstractC0500aqQ = AbstractC2883jK.q(i);
        c2825iFF.a = abstractC0500aqQ;
        C2825iF.b(abstractC0500aqQ);
        c2825iFF.e = interfaceC0100Fc;
        InterfaceC0100Fc interfaceC0100Fc2 = this.S.f;
        AbstractC0500aq abstractC0500aqQ2 = AbstractC2883jK.q(i);
        c2825iFF.b = abstractC0500aqQ2;
        C2825iF.b(abstractC0500aqQ2);
        c2825iFF.f = interfaceC0100Fc2;
        InterfaceC0100Fc interfaceC0100Fc3 = this.S.h;
        AbstractC0500aq abstractC0500aqQ3 = AbstractC2883jK.q(i);
        c2825iFF.d = abstractC0500aqQ3;
        C2825iF.b(abstractC0500aqQ3);
        c2825iFF.h = interfaceC0100Fc3;
        InterfaceC0100Fc interfaceC0100Fc4 = this.S.g;
        AbstractC0500aq abstractC0500aqQ4 = AbstractC2883jK.q(i);
        c2825iFF.c = abstractC0500aqQ4;
        C2825iF.b(abstractC0500aqQ4);
        c2825iFF.g = interfaceC0100Fc4;
        this.S = c2825iFF.a();
        c();
    }

    public void setBoxStrokeColor(int i) throws Resources.NotFoundException {
        if (this.t0 != i) {
            this.t0 = i;
            z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) throws Resources.NotFoundException {
        int defaultColor;
        if (!colorStateList.isStateful()) {
            if (this.t0 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            z();
        } else {
            this.r0 = colorStateList.getDefaultColor();
            this.z0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.s0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            defaultColor = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        }
        this.t0 = defaultColor;
        z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (this.u0 != colorStateList) {
            this.u0 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i) throws Resources.NotFoundException {
        this.b0 = i;
        z();
    }

    public void setBoxStrokeWidthFocused(int i) throws Resources.NotFoundException {
        this.c0 = i;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i) throws Resources.NotFoundException {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) throws Resources.NotFoundException {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) throws Resources.NotFoundException {
        if (this.r != z) {
            C3560vp c3560vp = this.q;
            if (z) {
                C3413t3 c3413t3 = new C3413t3(getContext(), null);
                this.v = c3413t3;
                c3413t3.setId(com.mxtunnel.pro.R.id.textinput_counter);
                Typeface typeface = this.i0;
                if (typeface != null) {
                    this.v.setTypeface(typeface);
                }
                this.v.setMaxLines(1);
                c3560vp.a(this.v, 2);
                ((ViewGroup.MarginLayoutParams) this.v.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.mxtunnel.pro.R.dimen.mtrl_textinput_counter_margin_start));
                q();
                if (this.v != null) {
                    EditText editText = this.e;
                    p(editText != null ? editText.getText() : null);
                }
            } else {
                c3560vp.g(this.v, 2);
                this.v = null;
            }
            this.r = z;
        }
    }

    public void setCounterMaxLength(int i) throws Resources.NotFoundException {
        if (this.s != i) {
            if (i <= 0) {
                i = -1;
            }
            this.s = i;
            if (!this.r || this.v == null) {
                return;
            }
            EditText editText = this.e;
            p(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.w != i) {
            this.w = i;
            q();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.G != colorStateList) {
            this.G = colorStateList;
            q();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.x != i) {
            this.x = i;
            q();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            q();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (this.H != colorStateList) {
            this.H = colorStateList;
            r();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) throws Resources.NotFoundException {
        if (this.I != colorStateList) {
            this.I = colorStateList;
            if (o() || (this.v != null && this.t)) {
                r();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.p0 = colorStateList;
        this.q0 = colorStateList;
        if (this.e != null) {
            w(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.c.m.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.c.m.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        C0259Oi c0259Oi = this.c;
        CharSequence text = i != 0 ? c0259Oi.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = c0259Oi.m;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        C0259Oi c0259Oi = this.c;
        Drawable drawableF = i != 0 ? AbstractC0500aq.F(c0259Oi.getContext(), i) : null;
        CheckableImageButton checkableImageButton = c0259Oi.m;
        checkableImageButton.setImageDrawable(drawableF);
        if (drawableF != null) {
            ColorStateList colorStateList = c0259Oi.q;
            PorterDuff.Mode mode = c0259Oi.r;
            TextInputLayout textInputLayout = c0259Oi.a;
            MO.b(textInputLayout, checkableImageButton, colorStateList, mode);
            MO.D(textInputLayout, checkableImageButton, c0259Oi.q);
        }
    }

    public void setEndIconMinSize(int i) {
        C0259Oi c0259Oi = this.c;
        if (i < 0) {
            c0259Oi.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != c0259Oi.s) {
            c0259Oi.s = i;
            CheckableImageButton checkableImageButton = c0259Oi.m;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = c0259Oi.c;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.c.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        C0259Oi c0259Oi = this.c;
        View.OnLongClickListener onLongClickListener = c0259Oi.u;
        CheckableImageButton checkableImageButton = c0259Oi.m;
        checkableImageButton.setOnClickListener(onClickListener);
        MO.H(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0259Oi c0259Oi = this.c;
        c0259Oi.u = onLongClickListener;
        CheckableImageButton checkableImageButton = c0259Oi.m;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        MO.H(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        C0259Oi c0259Oi = this.c;
        c0259Oi.t = scaleType;
        c0259Oi.m.setScaleType(scaleType);
        c0259Oi.c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        C0259Oi c0259Oi = this.c;
        if (c0259Oi.q != colorStateList) {
            c0259Oi.q = colorStateList;
            MO.b(c0259Oi.a, c0259Oi.m, colorStateList, c0259Oi.r);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        C0259Oi c0259Oi = this.c;
        if (c0259Oi.r != mode) {
            c0259Oi.r = mode;
            MO.b(c0259Oi.a, c0259Oi.m, c0259Oi.q, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.c.h(z);
    }

    public void setError(CharSequence charSequence) throws Resources.NotFoundException {
        C3560vp c3560vp = this.q;
        if (!c3560vp.q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            c3560vp.f();
            return;
        }
        c3560vp.c();
        c3560vp.p = charSequence;
        c3560vp.r.setText(charSequence);
        int i = c3560vp.n;
        if (i != 1) {
            c3560vp.o = 1;
        }
        c3560vp.i(i, c3560vp.o, c3560vp.h(c3560vp.r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        C3560vp c3560vp = this.q;
        c3560vp.t = i;
        C3413t3 c3413t3 = c3560vp.r;
        if (c3413t3 != null) {
            c3413t3.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C3560vp c3560vp = this.q;
        c3560vp.s = charSequence;
        C3413t3 c3413t3 = c3560vp.r;
        if (c3413t3 != null) {
            c3413t3.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) throws Resources.NotFoundException {
        C3560vp c3560vp = this.q;
        if (c3560vp.q == z) {
            return;
        }
        c3560vp.c();
        TextInputLayout textInputLayout = c3560vp.h;
        if (z) {
            C3413t3 c3413t3 = new C3413t3(c3560vp.g, null);
            c3560vp.r = c3413t3;
            c3413t3.setId(com.mxtunnel.pro.R.id.textinput_error);
            c3560vp.r.setTextAlignment(5);
            Typeface typeface = c3560vp.B;
            if (typeface != null) {
                c3560vp.r.setTypeface(typeface);
            }
            int i = c3560vp.u;
            c3560vp.u = i;
            C3413t3 c3413t32 = c3560vp.r;
            if (c3413t32 != null) {
                textInputLayout.n(c3413t32, i);
            }
            ColorStateList colorStateList = c3560vp.v;
            c3560vp.v = colorStateList;
            C3413t3 c3413t33 = c3560vp.r;
            if (c3413t33 != null && colorStateList != null) {
                c3413t33.setTextColor(colorStateList);
            }
            CharSequence charSequence = c3560vp.s;
            c3560vp.s = charSequence;
            C3413t3 c3413t34 = c3560vp.r;
            if (c3413t34 != null) {
                c3413t34.setContentDescription(charSequence);
            }
            int i2 = c3560vp.t;
            c3560vp.t = i2;
            C3413t3 c3413t35 = c3560vp.r;
            if (c3413t35 != null) {
                c3413t35.setAccessibilityLiveRegion(i2);
            }
            c3560vp.r.setVisibility(4);
            c3560vp.a(c3560vp.r, 0);
        } else {
            c3560vp.f();
            c3560vp.g(c3560vp.r, 0);
            c3560vp.r = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        c3560vp.q = z;
    }

    public void setErrorIconDrawable(int i) {
        C0259Oi c0259Oi = this.c;
        c0259Oi.i(i != 0 ? AbstractC0500aq.F(c0259Oi.getContext(), i) : null);
        MO.D(c0259Oi.a, c0259Oi.c, c0259Oi.d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        C0259Oi c0259Oi = this.c;
        CheckableImageButton checkableImageButton = c0259Oi.c;
        View.OnLongClickListener onLongClickListener = c0259Oi.f;
        checkableImageButton.setOnClickListener(onClickListener);
        MO.H(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0259Oi c0259Oi = this.c;
        c0259Oi.f = onLongClickListener;
        CheckableImageButton checkableImageButton = c0259Oi.c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        MO.H(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        C0259Oi c0259Oi = this.c;
        if (c0259Oi.d != colorStateList) {
            c0259Oi.d = colorStateList;
            MO.b(c0259Oi.a, c0259Oi.c, colorStateList, c0259Oi.e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        C0259Oi c0259Oi = this.c;
        if (c0259Oi.e != mode) {
            c0259Oi.e = mode;
            MO.b(c0259Oi.a, c0259Oi.c, c0259Oi.d, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        C3560vp c3560vp = this.q;
        c3560vp.u = i;
        C3413t3 c3413t3 = c3560vp.r;
        if (c3413t3 != null) {
            c3560vp.h.n(c3413t3, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C3560vp c3560vp = this.q;
        c3560vp.v = colorStateList;
        C3413t3 c3413t3 = c3560vp.r;
        if (c3413t3 == null || colorStateList == null) {
            return;
        }
        c3413t3.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.D0 != z) {
            this.D0 = z;
            w(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) throws Resources.NotFoundException {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        C3560vp c3560vp = this.q;
        if (zIsEmpty) {
            if (c3560vp.x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!c3560vp.x) {
            setHelperTextEnabled(true);
        }
        c3560vp.c();
        c3560vp.w = charSequence;
        c3560vp.y.setText(charSequence);
        int i = c3560vp.n;
        if (i != 2) {
            c3560vp.o = 2;
        }
        c3560vp.i(i, c3560vp.o, c3560vp.h(c3560vp.y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C3560vp c3560vp = this.q;
        c3560vp.A = colorStateList;
        C3413t3 c3413t3 = c3560vp.y;
        if (c3413t3 == null || colorStateList == null) {
            return;
        }
        c3413t3.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) throws Resources.NotFoundException {
        C3560vp c3560vp = this.q;
        if (c3560vp.x == z) {
            return;
        }
        c3560vp.c();
        if (z) {
            C3413t3 c3413t3 = new C3413t3(c3560vp.g, null);
            c3560vp.y = c3413t3;
            c3413t3.setId(com.mxtunnel.pro.R.id.textinput_helper_text);
            c3560vp.y.setTextAlignment(5);
            Typeface typeface = c3560vp.B;
            if (typeface != null) {
                c3560vp.y.setTypeface(typeface);
            }
            c3560vp.y.setVisibility(4);
            c3560vp.y.setAccessibilityLiveRegion(1);
            int i = c3560vp.z;
            c3560vp.z = i;
            C3413t3 c3413t32 = c3560vp.y;
            if (c3413t32 != null) {
                c3413t32.setTextAppearance(i);
            }
            ColorStateList colorStateList = c3560vp.A;
            c3560vp.A = colorStateList;
            C3413t3 c3413t33 = c3560vp.y;
            if (c3413t33 != null && colorStateList != null) {
                c3413t33.setTextColor(colorStateList);
            }
            c3560vp.a(c3560vp.y, 1);
            c3560vp.y.setAccessibilityDelegate(new C3506up(c3560vp));
        } else {
            c3560vp.c();
            int i2 = c3560vp.n;
            if (i2 == 2) {
                c3560vp.o = 0;
            }
            c3560vp.i(i2, c3560vp.o, c3560vp.h(c3560vp.y, ""));
            c3560vp.g(c3560vp.y, 1);
            c3560vp.y = null;
            TextInputLayout textInputLayout = c3560vp.h;
            textInputLayout.t();
            textInputLayout.z();
        }
        c3560vp.x = z;
    }

    public void setHelperTextTextAppearance(int i) {
        C3560vp c3560vp = this.q;
        c3560vp.z = i;
        C3413t3 c3413t3 = c3560vp.y;
        if (c3413t3 != null) {
            c3413t3.setTextAppearance(i);
        }
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setHintAnimationEnabled(boolean z) {
        this.E0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.J) {
            this.J = z;
            if (z) {
                CharSequence hint = this.e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.K)) {
                        setHint(hint);
                    }
                    this.e.setHint((CharSequence) null);
                }
                this.L = true;
            } else {
                this.L = false;
                if (!TextUtils.isEmpty(this.K) && TextUtils.isEmpty(this.e.getHint())) {
                    this.e.setHint(this.K);
                }
                setHintInternal(null);
            }
            if (this.e != null) {
                v();
            }
        }
    }

    public void setHintMaxLines(int i) {
        C3329ra c3329ra = this.C0;
        if (i != c3329ra.f0) {
            c3329ra.f0 = i;
            c3329ra.j(false);
        }
        if (i != c3329ra.e0) {
            c3329ra.e0 = i;
            c3329ra.j(false);
        }
        requestLayout();
    }

    public void setHintTextAppearance(int i) {
        C3329ra c3329ra = this.C0;
        View view = c3329ra.a;
        EI ei = new EI(view.getContext(), i);
        ColorStateList colorStateList = ei.k;
        if (colorStateList != null) {
            c3329ra.k = colorStateList;
        }
        float f = ei.l;
        if (f != 0.0f) {
            c3329ra.i = f;
        }
        ColorStateList colorStateList2 = ei.a;
        if (colorStateList2 != null) {
            c3329ra.V = colorStateList2;
        }
        c3329ra.T = ei.f;
        c3329ra.U = ei.g;
        c3329ra.S = ei.h;
        c3329ra.W = ei.j;
        C3634x8 c3634x8 = c3329ra.z;
        if (c3634x8 != null) {
            c3634x8.m = true;
        }
        C2827iH c2827iH = new C2827iH(c3329ra, 6);
        ei.a();
        c3329ra.z = new C3634x8(c2827iH, ei.p);
        ei.b(view.getContext(), c3329ra.z);
        c3329ra.j(false);
        this.q0 = c3329ra.k;
        if (this.e != null) {
            w(false, false);
            v();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.q0 != colorStateList) {
            if (this.p0 == null) {
                C3329ra c3329ra = this.C0;
                if (c3329ra.k != colorStateList) {
                    c3329ra.k = colorStateList;
                    c3329ra.j(false);
                }
            }
            this.q0 = colorStateList;
            if (this.e != null) {
                w(false, false);
            }
        }
    }

    public void setLengthCounter(KI ki) {
        this.u = ki;
    }

    public void setMaxEms(int i) {
        this.n = i;
        EditText editText = this.e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.p = i;
        EditText editText = this.e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.m = i;
        EditText editText = this.e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.o = i;
        EditText editText = this.e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        C0259Oi c0259Oi = this.c;
        c0259Oi.m.setContentDescription(i != 0 ? c0259Oi.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        C0259Oi c0259Oi = this.c;
        c0259Oi.m.setImageDrawable(i != 0 ? AbstractC0500aq.F(c0259Oi.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        C0259Oi c0259Oi = this.c;
        if (z && c0259Oi.o != 1) {
            c0259Oi.g(1);
        } else if (z) {
            c0259Oi.getClass();
        } else {
            c0259Oi.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        C0259Oi c0259Oi = this.c;
        c0259Oi.q = colorStateList;
        MO.b(c0259Oi.a, c0259Oi.m, colorStateList, c0259Oi.r);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        C0259Oi c0259Oi = this.c;
        c0259Oi.r = mode;
        MO.b(c0259Oi.a, c0259Oi.m, c0259Oi.q, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.A == null) {
            C3413t3 c3413t3 = new C3413t3(getContext(), null);
            this.A = c3413t3;
            c3413t3.setId(com.mxtunnel.pro.R.id.textinput_placeholder);
            this.A.setImportantForAccessibility(1);
            this.A.setAccessibilityLiveRegion(1);
            C0243Nj c0243NjF = f();
            this.D = c0243NjF;
            c0243NjF.b = 67L;
            this.E = f();
            setPlaceholderTextAppearance(this.C);
            setPlaceholderTextColor(this.B);
            UL.l(this.A, new C3390sh(5));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.z) {
                setPlaceholderTextEnabled(true);
            }
            this.y = charSequence;
        }
        EditText editText = this.e;
        x(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.C = i;
        C3413t3 c3413t3 = this.A;
        if (c3413t3 != null) {
            c3413t3.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            C3413t3 c3413t3 = this.A;
            if (c3413t3 == null || colorStateList == null) {
                return;
            }
            c3413t3.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        SG sg = this.b;
        sg.getClass();
        sg.c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        sg.b.setText(charSequence);
        sg.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.b.b.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.b.b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(C2878jF c2878jF) {
        C2638eu c2638eu = this.M;
        if (c2638eu == null || c2638eu.b.a == c2878jF) {
            return;
        }
        this.S = c2878jF;
        c();
    }

    public void setStartIconCheckable(boolean z) {
        this.b.d.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? AbstractC0500aq.F(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        SG sg = this.b;
        if (i < 0) {
            sg.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != sg.m) {
            sg.m = i;
            CheckableImageButton checkableImageButton = sg.d;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        SG sg = this.b;
        View.OnLongClickListener onLongClickListener = sg.o;
        CheckableImageButton checkableImageButton = sg.d;
        checkableImageButton.setOnClickListener(onClickListener);
        MO.H(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        SG sg = this.b;
        sg.o = onLongClickListener;
        CheckableImageButton checkableImageButton = sg.d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        MO.H(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        SG sg = this.b;
        sg.n = scaleType;
        sg.d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        SG sg = this.b;
        if (sg.e != colorStateList) {
            sg.e = colorStateList;
            MO.b(sg.a, sg.d, colorStateList, sg.f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        SG sg = this.b;
        if (sg.f != mode) {
            sg.f = mode;
            MO.b(sg.a, sg.d, sg.e, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.b.c(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        C0259Oi c0259Oi = this.c;
        c0259Oi.getClass();
        c0259Oi.v = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c0259Oi.w.setText(charSequence);
        c0259Oi.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.c.w.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.c.w.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(JI ji) {
        EditText editText = this.e;
        if (editText != null) {
            UL.l(editText, ji);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.i0) {
            this.i0 = typeface;
            this.C0.n(typeface);
            C3560vp c3560vp = this.q;
            if (typeface != c3560vp.B) {
                c3560vp.B = typeface;
                C3413t3 c3413t3 = c3560vp.r;
                if (c3413t3 != null) {
                    c3413t3.setTypeface(typeface);
                }
                C3413t3 c3413t32 = c3560vp.y;
                if (c3413t32 != null) {
                    c3413t32.setTypeface(typeface);
                }
            }
            C3413t3 c3413t33 = this.v;
            if (c3413t33 != null) {
                c3413t33.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        Drawable background;
        C3413t3 c3413t3;
        PorterDuffColorFilter porterDuffColorFilterC;
        EditText editText = this.e;
        if (editText == null || this.V != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC3228ph.a;
        Drawable drawableMutate = background.mutate();
        if (o()) {
            int errorCurrentTextColors = getErrorCurrentTextColors();
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            PorterDuff.Mode mode2 = I2.b;
            synchronized (I2.class) {
                porterDuffColorFilterC = C3584wC.h(errorCurrentTextColors, mode);
            }
        } else {
            if (!this.t || (c3413t3 = this.v) == null) {
                drawableMutate.clearColorFilter();
                this.e.refreshDrawableState();
                return;
            }
            porterDuffColorFilterC = I2.c(c3413t3.getCurrentTextColor(), PorterDuff.Mode.SRC_IN);
        }
        drawableMutate.setColorFilter(porterDuffColorFilterC);
    }

    public final void u() {
        EditText editText = this.e;
        if (editText == null || this.M == null) {
            return;
        }
        if ((this.P || editText.getBackground() == null) && this.V != 0) {
            this.e.setBackground(getEditTextBoxBackground());
            this.P = true;
        }
    }

    public final void v() {
        if (this.V != 1) {
            FrameLayout frameLayout = this.a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iE = e();
            if (iE != layoutParams.topMargin) {
                layoutParams.topMargin = iE;
                frameLayout.requestLayout();
            }
        }
    }

    public final void w(boolean z, boolean z2) {
        ColorStateList colorStateList;
        C3413t3 c3413t3;
        ColorStateList textColors;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.e;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.e;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.p0;
        C3329ra c3329ra = this.C0;
        if (colorStateList2 != null) {
            c3329ra.k(colorStateList2);
        }
        if (zIsEnabled) {
            if (o()) {
                C3413t3 c3413t32 = this.q.r;
                textColors = c3413t32 != null ? c3413t32.getTextColors() : null;
            } else if (this.t && (c3413t3 = this.v) != null) {
                textColors = c3413t3.getTextColors();
            } else if (z4 && (colorStateList = this.q0) != null && c3329ra.k != colorStateList) {
                c3329ra.k = colorStateList;
                c3329ra.j(false);
            }
            c3329ra.k(textColors);
        } else {
            ColorStateList colorStateList3 = this.p0;
            c3329ra.k(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.z0) : this.z0));
        }
        C0259Oi c0259Oi = this.c;
        SG sg = this.b;
        if (z3 || !this.D0 || (isEnabled() && z4)) {
            if (z2 || this.B0) {
                ValueAnimator valueAnimator = this.F0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.F0.cancel();
                }
                if (z && this.E0) {
                    b(1.0f);
                } else {
                    c3329ra.m(1.0f);
                }
                this.B0 = false;
                if (g()) {
                    l();
                }
                EditText editText3 = this.e;
                x(editText3 != null ? editText3.getText() : null);
                sg.p = false;
                sg.e();
                c0259Oi.x = false;
                c0259Oi.n();
                return;
            }
            return;
        }
        if (z2 || !this.B0) {
            ValueAnimator valueAnimator2 = this.F0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.F0.cancel();
            }
            if (z && this.E0) {
                b(0.0f);
            } else {
                c3329ra.m(0.0f);
            }
            if (g() && (!((C3549ve) this.M).N.w.isEmpty()) && g()) {
                ((C3549ve) this.M).u(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.B0 = true;
            C3413t3 c3413t33 = this.A;
            if (c3413t33 != null && this.z) {
                c3413t33.setText((CharSequence) null);
                TJ.a(this.a, this.E);
                this.A.setVisibility(4);
            }
            sg.p = true;
            sg.e();
            c0259Oi.x = true;
            c0259Oi.n();
        }
    }

    public final void x(Editable editable) {
        ((LH) this.u).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.a;
        if (length != 0 || this.B0) {
            C3413t3 c3413t3 = this.A;
            if (c3413t3 == null || !this.z) {
                return;
            }
            c3413t3.setText((CharSequence) null);
            TJ.a(frameLayout, this.E);
            this.A.setVisibility(4);
            return;
        }
        if (this.A == null || !this.z || TextUtils.isEmpty(this.y)) {
            return;
        }
        this.A.setText(this.y);
        TJ.a(frameLayout, this.D);
        this.A.setVisibility(0);
        this.A.bringToFront();
    }

    public final void y(boolean z, boolean z2) {
        int defaultColor = this.u0.getDefaultColor();
        int colorForState = this.u0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.u0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.d0 = colorForState2;
        } else if (z2) {
            this.d0 = colorForState;
        } else {
            this.d0 = defaultColor;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z() throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.z():void");
    }

    public void setHint(CharSequence charSequence) {
        if (this.J) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.b.d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.b.b(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.c.m.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.c.m.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.c.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.c.m;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        C0259Oi c0259Oi = this.c;
        CheckableImageButton checkableImageButton = c0259Oi.m;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = c0259Oi.q;
            PorterDuff.Mode mode = c0259Oi.r;
            TextInputLayout textInputLayout = c0259Oi.a;
            MO.b(textInputLayout, checkableImageButton, colorStateList, mode);
            MO.D(textInputLayout, checkableImageButton, c0259Oi.q);
        }
    }
}
