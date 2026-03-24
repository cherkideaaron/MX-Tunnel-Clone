package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import defpackage.AbstractC0069Df;
import defpackage.AbstractC0115Ga;
import defpackage.AbstractC0500aq;
import defpackage.AbstractC2883jK;
import defpackage.AbstractC3279qd;
import defpackage.AbstractC3296qu;
import defpackage.C0473aH;
import defpackage.C0582cH;
import defpackage.C2638eu;
import defpackage.C2754h;
import defpackage.C2757h2;
import defpackage.C2825iF;
import defpackage.C2827iH;
import defpackage.C2878jF;
import defpackage.C3642xG;
import defpackage.C3696yG;
import defpackage.InterfaceC3533vF;
import defpackage.Kt;
import defpackage.Lt;
import defpackage.Mt;
import defpackage.Ot;
import defpackage.Pt;
import defpackage.QC;
import defpackage.RA;
import defpackage.Vs;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public class MaterialButton extends C2757h2 implements Checkable, InterfaceC3533vF {
    public static final int[] L = {R.attr.state_checkable};
    public static final int[] M = {R.attr.state_checked};
    public static final Kt N = new Kt();
    public int A;
    public LinearLayout.LayoutParams B;
    public boolean C;
    public int D;
    public boolean E;
    public int F;
    public C0582cH G;
    public int H;
    public float I;
    public float J;
    public C3642xG K;
    public final Pt d;
    public final LinkedHashSet e;
    public Lt f;
    public PorterDuff.Mode m;
    public ColorStateList n;
    public Drawable o;
    public String p;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public boolean v;
    public int w;
    public int x;
    public float y;
    public int z;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(AbstractC3279qd.m0(com.mxtunnel.pro.R.attr.materialButtonStyle, com.mxtunnel.pro.R.style.Widget_MaterialComponents_Button, context, attributeSet, new int[]{com.mxtunnel.pro.R.attr.materialSizeOverlay}), attributeSet, com.mxtunnel.pro.R.attr.materialButtonStyle);
        this.e = new LinkedHashSet();
        this.u = false;
        this.v = false;
        this.x = -1;
        this.y = -1.0f;
        this.z = -1;
        this.A = -1;
        this.F = -1;
        Context context2 = getContext();
        TypedArray typedArrayS = AbstractC3279qd.S(context2, attributeSet, RA.l, com.mxtunnel.pro.R.attr.materialButtonStyle, com.mxtunnel.pro.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.t = typedArrayS.getDimensionPixelSize(13, 0);
        int i = typedArrayS.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.m = AbstractC2883jK.H(i, mode);
        this.n = AbstractC3296qu.x(getContext(), typedArrayS, 15);
        this.o = AbstractC3296qu.z(getContext(), typedArrayS, 11);
        this.w = typedArrayS.getInteger(12, 1);
        this.q = typedArrayS.getDimensionPixelSize(14, 0);
        C0473aH c0473aHB = C0473aH.b(context2, typedArrayS, 19);
        C2878jF c2878jFC = c0473aHB != null ? c0473aHB.c() : C2878jF.b(context2, attributeSet, com.mxtunnel.pro.R.attr.materialButtonStyle, com.mxtunnel.pro.R.style.Widget_MaterialComponents_Button).a();
        boolean z = typedArrayS.getBoolean(17, false);
        Pt pt = new Pt(this, c2878jFC);
        this.d = pt;
        pt.f = typedArrayS.getDimensionPixelOffset(2, 0);
        pt.g = typedArrayS.getDimensionPixelOffset(3, 0);
        pt.h = typedArrayS.getDimensionPixelOffset(4, 0);
        pt.i = typedArrayS.getDimensionPixelOffset(5, 0);
        if (typedArrayS.hasValue(9)) {
            int dimensionPixelSize = typedArrayS.getDimensionPixelSize(9, -1);
            pt.j = dimensionPixelSize;
            float f = dimensionPixelSize;
            C2825iF c2825iFF = pt.b.f();
            c2825iFF.e = new C2754h(f);
            c2825iFF.f = new C2754h(f);
            c2825iFF.g = new C2754h(f);
            c2825iFF.h = new C2754h(f);
            pt.b = c2825iFF.a();
            pt.c = null;
            pt.d();
            pt.s = true;
        }
        pt.k = typedArrayS.getDimensionPixelSize(22, 0);
        pt.l = AbstractC2883jK.H(typedArrayS.getInt(8, -1), mode);
        pt.m = AbstractC3296qu.x(getContext(), typedArrayS, 7);
        pt.n = AbstractC3296qu.x(getContext(), typedArrayS, 21);
        pt.o = AbstractC3296qu.x(getContext(), typedArrayS, 18);
        pt.t = typedArrayS.getBoolean(6, false);
        pt.w = typedArrayS.getDimensionPixelSize(10, 0);
        pt.u = typedArrayS.getBoolean(23, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayS.hasValue(0)) {
            pt.r = true;
            setSupportBackgroundTintList(pt.m);
            setSupportBackgroundTintMode(pt.l);
        } else {
            pt.c();
        }
        setPaddingRelative(paddingStart + pt.f, paddingTop + pt.h, paddingEnd + pt.g, paddingBottom + pt.i);
        setCheckedInternal(typedArrayS.getBoolean(1, false));
        if (c0473aHB != null) {
            pt.d = d();
            if (pt.c != null) {
                pt.d();
            }
            pt.c = c0473aHB;
            pt.d();
        }
        setOpticalCenterEnabled(z);
        typedArrayS.recycle();
        setCompoundDrawablePadding(this.t);
        i(this.o != null);
    }

    public static /* synthetic */ void a(MaterialButton materialButton) {
        materialButton.D = materialButton.getOpticalCenterShift();
        materialButton.k();
        materialButton.invalidate();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.I;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        C2638eu c2638euA;
        if (this.C && this.E && (c2638euA = this.d.a(false)) != null) {
            return (int) (c2638euA.i() * 0.11f);
        }
        return 0;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    private void setCheckedInternal(boolean z) {
        if (!e() || this.u == z) {
            return;
        }
        this.u = z;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z2 = this.u;
            if (!materialButtonToggleGroup.r) {
                materialButtonToggleGroup.f(getId(), z2);
            }
        }
        if (this.v) {
            return;
        }
        this.v = true;
        Iterator it = this.e.iterator();
        if (it.hasNext()) {
            Vs.u(it.next());
            throw null;
        }
        this.v = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f) {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        if (this.I != f) {
            this.I = f;
            k();
            invalidate();
            if (getParent() instanceof Ot) {
                Ot ot = (Ot) getParent();
                int i = (int) this.I;
                int iIndexOfChild = ot.indexOfChild(this);
                if (iIndexOfChild < 0) {
                    return;
                }
                int i2 = iIndexOfChild - 1;
                while (true) {
                    materialButton = null;
                    if (i2 < 0) {
                        materialButton2 = null;
                        break;
                    } else {
                        if (ot.c(i2)) {
                            materialButton2 = (MaterialButton) ot.getChildAt(i2);
                            break;
                        }
                        i2--;
                    }
                }
                int childCount = ot.getChildCount();
                while (true) {
                    iIndexOfChild++;
                    if (iIndexOfChild >= childCount) {
                        break;
                    } else if (ot.c(iIndexOfChild)) {
                        materialButton = (MaterialButton) ot.getChildAt(iIndexOfChild);
                        break;
                    }
                }
                if (materialButton2 == null && materialButton == null) {
                    return;
                }
                if (materialButton2 == null) {
                    materialButton.setDisplayedWidthDecrease(i);
                }
                if (materialButton == null) {
                    materialButton2.setDisplayedWidthDecrease(i);
                }
                if (materialButton2 == null || materialButton == null) {
                    return;
                }
                materialButton2.setDisplayedWidthDecrease(i / 2);
                materialButton.setDisplayedWidthDecrease((i + 1) / 2);
            }
        }
    }

    public final C3696yG d() {
        Context context = getContext();
        TypedValue typedValueS = AbstractC0069Df.S(context, com.mxtunnel.pro.R.attr.motionSpringFastSpatial);
        int[] iArr = RA.u;
        TypedArray typedArrayObtainStyledAttributes = typedValueS == null ? context.obtainStyledAttributes(null, iArr, 0, com.mxtunnel.pro.R.style.Motion_Material3_Spring_Standard_Fast_Spatial) : context.obtainStyledAttributes(typedValueS.resourceId, iArr);
        C3696yG c3696yG = new C3696yG();
        try {
            float f = typedArrayObtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f2 = typedArrayObtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f2 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            if (f <= 0.0f) {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
            c3696yG.a = Math.sqrt(f);
            c3696yG.c = false;
            if (f2 < 0.0f) {
                throw new IllegalArgumentException("Damping ratio must be non-negative");
            }
            c3696yG.b = f2;
            c3696yG.c = false;
            typedArrayObtainStyledAttributes.recycle();
            return c3696yG;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final boolean e() {
        Pt pt = this.d;
        return pt != null && pt.t;
    }

    public final boolean f() {
        Pt pt = this.d;
        return (pt == null || pt.r) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(boolean r9) {
        /*
            r8 = this;
            cH r0 = r8.G
            if (r0 != 0) goto L5
            return
        L5:
            xG r0 = r8.K
            if (r0 != 0) goto L18
            xG r0 = new xG
            Kt r1 = com.google.android.material.button.MaterialButton.N
            r0.<init>(r8, r1)
            r8.K = r0
            yG r1 = r8.d()
            r0.j = r1
        L18:
            boolean r0 = r8.E
            if (r0 == 0) goto L84
            int r0 = r8.H
            cH r1 = r8.G
            int[] r2 = r8.getDrawableState()
            int[][] r3 = r1.c
            r4 = 0
            r5 = r4
        L28:
            int r6 = r1.a
            r7 = -1
            if (r5 >= r6) goto L39
            r6 = r3[r5]
            boolean r6 = android.util.StateSet.stateSetMatches(r6, r2)
            if (r6 == 0) goto L36
            goto L3a
        L36:
            int r5 = r5 + 1
            goto L28
        L39:
            r5 = r7
        L3a:
            if (r5 >= 0) goto L53
            int[] r2 = android.util.StateSet.WILD_CARD
            int[][] r3 = r1.c
            r5 = r4
        L41:
            int r6 = r1.a
            if (r5 >= r6) goto L52
            r6 = r3[r5]
            boolean r6 = android.util.StateSet.stateSetMatches(r6, r2)
            if (r6 == 0) goto L4f
            r7 = r5
            goto L52
        L4f:
            int r5 = r5 + 1
            goto L41
        L52:
            r5 = r7
        L53:
            if (r5 >= 0) goto L58
            co r1 = r1.b
            goto L5c
        L58:
            co[] r1 = r1.d
            r1 = r1[r5]
        L5c:
            java.lang.Object r1 = r1.a
            bH r1 = (defpackage.C0528bH) r1
            int r2 = r8.getWidth()
            float r3 = r1.b
            int r1 = r1.a
            r5 = 1
            if (r1 != r5) goto L6f
            float r1 = (float) r2
            float r3 = r3 * r1
        L6d:
            int r4 = (int) r3
            goto L73
        L6f:
            r2 = 2
            if (r1 != r2) goto L73
            goto L6d
        L73:
            int r0 = java.lang.Math.min(r0, r4)
            xG r1 = r8.K
            float r0 = (float) r0
            r1.a(r0)
            if (r9 == 0) goto L84
            xG r9 = r8.K
            r9.d()
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.g(boolean):void");
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.p)) {
            return (e() ? CompoundButton.class : Button.class).getName();
        }
        return this.p;
    }

    public int getAllowedWidthDecrease() {
        return this.F;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (f()) {
            return this.d.j;
        }
        return 0;
    }

    public C3696yG getCornerSpringForce() {
        return this.d.d;
    }

    public Drawable getIcon() {
        return this.o;
    }

    public int getIconGravity() {
        return this.w;
    }

    public int getIconPadding() {
        return this.t;
    }

    public int getIconSize() {
        return this.q;
    }

    public ColorStateList getIconTint() {
        return this.n;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.m;
    }

    public int getInsetBottom() {
        return this.d.i;
    }

    public int getInsetTop() {
        return this.d.h;
    }

    public ColorStateList getRippleColor() {
        if (f()) {
            return this.d.o;
        }
        return null;
    }

    public C2878jF getShapeAppearanceModel() {
        if (f()) {
            return this.d.b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public C0473aH getStateListShapeAppearanceModel() {
        if (f()) {
            return this.d.c;
        }
        throw new IllegalStateException("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (f()) {
            return this.d.n;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (f()) {
            return this.d.k;
        }
        return 0;
    }

    @Override // defpackage.C2757h2
    public ColorStateList getSupportBackgroundTintList() {
        return f() ? this.d.m : super.getSupportBackgroundTintList();
    }

    @Override // defpackage.C2757h2
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return f() ? this.d.l : super.getSupportBackgroundTintMode();
    }

    public final void h() {
        int i = this.w;
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        if (z) {
            setCompoundDrawablesRelative(this.o, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.o, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.o, null, null);
        }
    }

    public final void i(boolean z) {
        Drawable drawable = this.o;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.o = drawableMutate;
            drawableMutate.setTintList(this.n);
            PorterDuff.Mode mode = this.m;
            if (mode != null) {
                this.o.setTintMode(mode);
            }
            int intrinsicWidth = this.q;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.o.getIntrinsicWidth();
            }
            int intrinsicHeight = this.q;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.o.getIntrinsicHeight();
            }
            Drawable drawable2 = this.o;
            int i = this.r;
            int i2 = this.s;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.o.setVisible(true, z);
        }
        if (z) {
            h();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i3 = this.w;
        if (((i3 == 1 || i3 == 2) && drawable3 != this.o) || (((i3 == 3 || i3 == 4) && drawable5 != this.o) || ((i3 == 16 || i3 == 32) && drawable4 != this.o))) {
            h();
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.u;
    }

    public final void j(int i, int i2) {
        if (this.o == null || getLayout() == null) {
            return;
        }
        int i3 = this.w;
        if (!(i3 == 1 || i3 == 2) && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.r = 0;
                if (i3 == 16) {
                    this.s = 0;
                    i(false);
                    return;
                }
                int intrinsicHeight = this.q;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.o.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.t) - getPaddingBottom()) / 2);
                if (this.s != iMax) {
                    this.s = iMax;
                    i(false);
                }
                return;
            }
            return;
        }
        this.s = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i4 = this.w;
        if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.r = 0;
            i(false);
            return;
        }
        int intrinsicWidth = this.q;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.o.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - this.t) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.w == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.r != textLayoutWidth) {
            this.r = textLayoutWidth;
            i(false);
        }
    }

    public final void k() {
        int i = (int) (this.I - this.J);
        int i2 = (i / 2) + this.D;
        getLayoutParams().width = (int) (this.y + i);
        setPaddingRelative(this.z + i2, getPaddingTop(), (this.A + i) - i2, getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (f()) {
            AbstractC2883jK.K(this, this.d.a(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (e()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, L);
        }
        if (this.u) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, M);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // defpackage.C2757h2, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.u);
    }

    @Override // defpackage.C2757h2, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(e());
        accessibilityNodeInfo.setChecked(this.u);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // defpackage.C2757h2, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        j(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.x != i6) {
            this.x = i6;
            this.y = -1.0f;
        }
        if (this.y == -1.0f) {
            this.y = getMeasuredWidth();
            if (this.B == null && (getParent() instanceof Ot) && ((Ot) getParent()).getButtonSizeChange() != null) {
                this.B = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.B);
                layoutParams.width = (int) this.y;
                setLayoutParams(layoutParams);
            }
        }
        boolean z2 = false;
        if (this.F == -1) {
            if (this.o == null) {
                i5 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.q;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.o.getIntrinsicWidth();
                }
                i5 = iconPadding + intrinsicWidth;
            }
            this.F = (getMeasuredWidth() - getTextLayoutWidth()) - i5;
        }
        if (this.z == -1) {
            this.z = getPaddingStart();
        }
        if (this.A == -1) {
            this.A = getPaddingEnd();
        }
        if ((getParent() instanceof Ot) && ((Ot) getParent()).getOrientation() == 0) {
            z2 = true;
        }
        this.E = z2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Mt)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Mt mt = (Mt) parcelable;
        super.onRestoreInstanceState(mt.a);
        setChecked(mt.c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        Mt mt = new Mt(super.onSaveInstanceState());
        mt.c = this.u;
        return mt;
    }

    @Override // defpackage.C2757h2, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        j(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (isEnabled() && this.d.u) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.o != null) {
            if (this.o.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.p = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!f()) {
            super.setBackgroundColor(i);
            return;
        }
        Pt pt = this.d;
        if (pt.a(false) != null) {
            pt.a(false).setTint(i);
        }
    }

    @Override // defpackage.C2757h2, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (f()) {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            Pt pt = this.d;
            pt.r = true;
            ColorStateList colorStateList = pt.m;
            MaterialButton materialButton = pt.a;
            materialButton.setSupportBackgroundTintList(colorStateList);
            materialButton.setSupportBackgroundTintMode(pt.l);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.C2757h2, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? AbstractC0500aq.F(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (f()) {
            this.d.t = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedInternal(z);
    }

    public void setCornerRadius(int i) {
        if (f()) {
            Pt pt = this.d;
            if (pt.s && pt.j == i) {
                return;
            }
            pt.j = i;
            pt.s = true;
            float f = i;
            C2825iF c2825iFF = pt.b.f();
            c2825iFF.e = new C2754h(f);
            c2825iFF.f = new C2754h(f);
            c2825iFF.g = new C2754h(f);
            c2825iFF.h = new C2754h(f);
            pt.b = c2825iFF.a();
            pt.c = null;
            pt.d();
        }
    }

    public void setCornerRadiusResource(int i) {
        if (f()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCornerSpringForce(C3696yG c3696yG) {
        Pt pt = this.d;
        pt.d = c3696yG;
        if (pt.c != null) {
            pt.d();
        }
    }

    public void setDisplayedWidthDecrease(int i) {
        this.J = Math.min(i, this.F);
        k();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (f()) {
            this.d.a(false).n(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.o != drawable) {
            this.o = drawable;
            i(true);
            j(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.w != i) {
            this.w = i;
            j(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.t != i) {
            this.t = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? AbstractC0500aq.F(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.q != i) {
            this.q = i;
            i(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.n != colorStateList) {
            this.n = colorStateList;
            i(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.m != mode) {
            this.m = mode;
            i(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(AbstractC0115Ga.u(getContext(), i));
    }

    public void setInsetBottom(int i) {
        Pt pt = this.d;
        pt.b(pt.h, i);
    }

    public void setInsetTop(int i) {
        Pt pt = this.d;
        pt.b(i, pt.i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(Lt lt) {
        this.f = lt;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a A[PHI: r0 r4
      0x001a: PHI (r0v4 eu) = (r0v2 eu), (r0v5 eu) binds: [B:10:0x0024, B:7:0x0018] A[DONT_GENERATE, DONT_INLINE]
      0x001a: PHI (r4v3 Qa) = (r4v1 Qa), (r4v4 Qa) binds: [B:10:0x0024, B:7:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setOpticalCenterEnabled(boolean r4) {
        /*
            r3 = this;
            boolean r0 = r3.C
            if (r0 == r4) goto L31
            r3.C = r4
            r0 = 0
            Pt r1 = r3.d
            if (r4 == 0) goto L1d
            Qa r4 = new Qa
            r2 = 8
            r4.<init>(r3, r2)
            r1.e = r4
            eu r0 = r1.a(r0)
            if (r0 == 0) goto L27
        L1a:
            r0.K = r4
            goto L27
        L1d:
            r4 = 0
            r1.e = r4
            eu r0 = r1.a(r0)
            if (r0 == 0) goto L27
            goto L1a
        L27:
            H0 r4 = new H0
            r0 = 10
            r4.<init>(r3, r0)
            r3.post(r4)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.setOpticalCenterEnabled(boolean):void");
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        Lt lt = this.f;
        if (lt != null) {
            ((Ot) ((C2827iH) lt).b).invalidate();
        }
        super.setPressed(z);
        g(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (f()) {
            Pt pt = this.d;
            if (pt.o != colorStateList) {
                pt.o = colorStateList;
                MaterialButton materialButton = pt.a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(QC.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (f()) {
            setRippleColor(AbstractC0115Ga.u(getContext(), i));
        }
    }

    @Override // defpackage.InterfaceC3533vF
    public void setShapeAppearanceModel(C2878jF c2878jF) {
        if (!f()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        Pt pt = this.d;
        pt.b = c2878jF;
        pt.c = null;
        pt.d();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (f()) {
            Pt pt = this.d;
            pt.q = z;
            pt.e();
        }
    }

    public void setSizeChange(C0582cH c0582cH) {
        if (this.G != c0582cH) {
            this.G = c0582cH;
            g(true);
        }
    }

    public void setStateListShapeAppearanceModel(C0473aH c0473aH) {
        if (!f()) {
            throw new IllegalStateException("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        Pt pt = this.d;
        if (pt.d == null && c0473aH.d()) {
            pt.d = d();
            if (pt.c != null) {
                pt.d();
            }
        }
        pt.c = c0473aH;
        pt.d();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (f()) {
            Pt pt = this.d;
            if (pt.n != colorStateList) {
                pt.n = colorStateList;
                pt.e();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (f()) {
            setStrokeColor(AbstractC0115Ga.u(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (f()) {
            Pt pt = this.d;
            if (pt.k != i) {
                pt.k = i;
                pt.e();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (f()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // defpackage.C2757h2
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!f()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        Pt pt = this.d;
        if (pt.m != colorStateList) {
            pt.m = colorStateList;
            if (pt.a(false) != null) {
                pt.a(false).setTintList(pt.m);
            }
        }
    }

    @Override // defpackage.C2757h2
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!f()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        Pt pt = this.d;
        if (pt.l != mode) {
            pt.l = mode;
            if (pt.a(false) == null || pt.l == null) {
                return;
            }
            pt.a(false).setTintMode(pt.l);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        j(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.d.u = z;
    }

    @Override // android.widget.TextView
    public void setWidth(int i) {
        this.y = -1.0f;
        super.setWidth(i);
    }

    public void setWidthChangeMax(int i) {
        if (this.H != i) {
            this.H = i;
            g(true);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.u);
    }
}
