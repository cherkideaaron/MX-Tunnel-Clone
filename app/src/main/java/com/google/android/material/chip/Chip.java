package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import defpackage.A7;
import defpackage.AbstractC0115Ga;
import defpackage.AbstractC0500aq;
import defpackage.AbstractC2883jK;
import defpackage.AbstractC3434tO;
import defpackage.C2865j2;
import defpackage.C2878jF;
import defpackage.C3728yv;
import defpackage.EI;
import defpackage.G9;
import defpackage.HI;
import defpackage.I9;
import defpackage.InterfaceC3380sO;
import defpackage.InterfaceC3533vF;
import defpackage.J9;
import defpackage.K9;
import defpackage.QC;
import defpackage.UL;
import defpackage.Yt;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* loaded from: classes2.dex */
public class Chip extends C2865j2 implements J9, InterfaceC3533vF, Checkable {
    public static final Rect C = new Rect();
    public static final int[] D = {R.attr.state_selected};
    public static final int[] E = {R.attr.state_checkable};
    public final RectF A;
    public final G9 B;
    public K9 e;
    public InsetDrawable f;
    public RippleDrawable m;
    public View.OnClickListener n;
    public CompoundButton.OnCheckedChangeListener o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public CharSequence w;
    public final I9 x;
    public boolean y;
    public final Rect z;

    /* JADX WARN: Removed duplicated region for block: B:102:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0261  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Chip(android.content.Context r17, android.util.AttributeSet r18) {
        /*
            Method dump skipped, instructions count: 989
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.A;
        rectF.setEmpty();
        if (c() && this.n != null) {
            K9 k9 = this.e;
            Rect bounds = k9.getBounds();
            rectF.setEmpty();
            if (k9.b0()) {
                float f = k9.t0 + k9.s0 + k9.e0 + k9.r0 + k9.q0;
                if (k9.getLayoutDirection() == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.z;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private EI getTextAppearance() {
        K9 k9 = this.e;
        if (k9 != null) {
            return k9.A0.f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.r != z) {
            this.r = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.q != z) {
            this.q = z;
            refreshDrawableState();
        }
    }

    public final void b(int i) {
        this.v = i;
        if (!this.t) {
            InsetDrawable insetDrawable = this.f;
            if (insetDrawable == null) {
                f();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    f();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.e.P));
        int iMax2 = Math.max(0, i - this.e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f;
            if (insetDrawable2 == null) {
                f();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    f();
                    return;
                }
                return;
            }
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.f != null) {
            Rect rect = new Rect();
            this.f.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                f();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f = new InsetDrawable((Drawable) this.e, i2, i3, i2, i3);
        f();
    }

    public final boolean c() {
        K9 k9 = this.e;
        if (k9 != null) {
            Object obj = k9.b0;
            if (obj == null) {
                obj = null;
            } else if (obj instanceof InterfaceC3380sO) {
                ((AbstractC3434tO) ((InterfaceC3380sO) obj)).getClass();
                obj = null;
            }
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean d() {
        K9 k9 = this.e;
        return k9 != null && k9.g0;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.y) {
            return super.dispatchHoverEvent(motionEvent);
        }
        I9 i9 = this.x;
        AccessibilityManager accessibilityManager = i9.h;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Chip chip = i9.n;
                int i2 = (chip.c() && chip.getCloseIconTouchBounds().contains(x, y)) ? 1 : 0;
                int i3 = i9.m;
                if (i3 != i2) {
                    i9.m = i2;
                    i9.r(i2, UserVerificationMethods.USER_VERIFY_PATTERN);
                    i9.r(i3, UserVerificationMethods.USER_VERIFY_HANDPRINT);
                }
                if (i2 != Integer.MIN_VALUE) {
                    return true;
                }
            } else if (action == 10 && (i = i9.m) != Integer.MIN_VALUE) {
                if (i == Integer.MIN_VALUE) {
                    return true;
                }
                i9.m = Integer.MIN_VALUE;
                i9.r(Integer.MIN_VALUE, UserVerificationMethods.USER_VERIFY_PATTERN);
                i9.r(i, UserVerificationMethods.USER_VERIFY_HANDPRINT);
                return true;
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.y
            if (r0 != 0) goto L9
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        L9:
            I9 r0 = r9.x
            r0.getClass()
            int r1 = r10.getAction()
            r2 = 0
            r3 = 1
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r3) goto L9f
            int r1 = r10.getKeyCode()
            r5 = 61
            r6 = 0
            if (r1 == r5) goto L89
            r5 = 66
            if (r1 == r5) goto L58
            switch(r1) {
                case 19: goto L2a;
                case 20: goto L2a;
                case 21: goto L2a;
                case 22: goto L2a;
                case 23: goto L58;
                default: goto L28;
            }
        L28:
            goto L9f
        L2a:
            boolean r7 = r10.hasNoModifiers()
            if (r7 == 0) goto L9f
            r7 = 19
            if (r1 == r7) goto L42
            r7 = 21
            if (r1 == r7) goto L3f
            r7 = 22
            if (r1 == r7) goto L44
            r5 = 130(0x82, float:1.82E-43)
            goto L44
        L3f:
            r5 = 17
            goto L44
        L42:
            r5 = 33
        L44:
            int r1 = r10.getRepeatCount()
            int r1 = r1 + r3
            r7 = r2
        L4a:
            if (r2 >= r1) goto L56
            boolean r8 = r0.m(r5, r6)
            if (r8 == 0) goto L56
            int r2 = r2 + 1
            r7 = r3
            goto L4a
        L56:
            r2 = r7
            goto L9f
        L58:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L9f
            int r1 = r10.getRepeatCount()
            if (r1 != 0) goto L9f
            int r1 = r0.l
            if (r1 == r4) goto L87
            com.google.android.material.chip.Chip r5 = r0.n
            if (r1 != 0) goto L71
            boolean r2 = r5.performClick()
            goto L87
        L71:
            if (r1 != r3) goto L87
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r1 = r5.n
            if (r1 == 0) goto L7e
            r1.onClick(r5)
            r2 = r3
        L7e:
            boolean r1 = r5.y
            if (r1 == 0) goto L87
            I9 r1 = r5.x
            r1.r(r3, r3)
        L87:
            r2 = r3
            goto L9f
        L89:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L95
            r1 = 2
            boolean r2 = r0.m(r1, r6)
            goto L9f
        L95:
            boolean r1 = r10.hasModifiers(r3)
            if (r1 == 0) goto L9f
            boolean r2 = r0.m(r3, r6)
        L9f:
            if (r2 == 0) goto La6
            int r0 = r0.l
            if (r0 == r4) goto La6
            return r3
        La6:
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // defpackage.C2865j2, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        K9 k9 = this.e;
        boolean zS = false;
        int i = 0;
        zS = false;
        if (k9 != null && K9.A(k9.b0)) {
            K9 k92 = this.e;
            ?? IsEnabled = isEnabled();
            int i2 = IsEnabled;
            if (this.s) {
                i2 = IsEnabled + 1;
            }
            int i3 = i2;
            if (this.r) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.q) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            }
            if (this.s) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.r) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.q) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            zS = k92.S(iArr);
        }
        if (zS) {
            invalidate();
        }
    }

    public final void e() {
        boolean z;
        K9 k9;
        if (!c() || (k9 = this.e) == null || !k9.a0 || this.n == null) {
            UL.l(this, null);
            z = false;
        } else {
            UL.l(this, this.x);
            z = true;
        }
        this.y = z;
    }

    public final void f() {
        this.m = new RippleDrawable(QC.a(this.e.T), getBackgroundDrawable(), null);
        K9 k9 = this.e;
        if (k9.P0) {
            k9.P0 = false;
            k9.Q0 = null;
            k9.onStateChange(k9.getState());
        }
        setBackground(this.m);
        g();
    }

    public final void g() {
        K9 k9;
        if (TextUtils.isEmpty(getText()) || (k9 = this.e) == null) {
            return;
        }
        int iX = (int) (k9.x() + k9.t0 + k9.q0);
        K9 k92 = this.e;
        int iW = (int) (k92.w() + k92.m0 + k92.p0);
        if (this.f != null) {
            Rect rect = new Rect();
            this.f.getPadding(rect);
            iW += rect.left;
            iX += rect.right;
        }
        setPaddingRelative(iW, getPaddingTop(), iX, getPaddingBottom());
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.w)) {
            return this.w;
        }
        if (!d()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f;
        return insetDrawable == null ? this.e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        K9 k9 = this.e;
        if (k9 != null) {
            return k9.i0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        K9 k9 = this.e;
        if (k9 != null) {
            return k9.j0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        K9 k9 = this.e;
        if (k9 != null) {
            return k9.O;
        }
        return null;
    }

    public float getChipCornerRadius() {
        K9 k9 = this.e;
        if (k9 != null) {
            return Math.max(0.0f, k9.y());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.e;
    }

    public float getChipEndPadding() {
        K9 k9 = this.e;
        if (k9 != null) {
            return k9.t0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        K9 k9 = this.e;
        if (k9 == null || (drawable = k9.W) == 0) {
            return null;
        }
        if (!(drawable instanceof InterfaceC3380sO)) {
            return drawable;
        }
        ((AbstractC3434tO) ((InterfaceC3380sO) drawable)).getClass();
        return null;
    }

    public float getChipIconSize() {
        K9 k9 = this.e;
        if (k9 != null) {
            return k9.Y;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        K9 k9 = this.e;
        if (k9 != null) {
            return k9.X;
        }
        return null;
    }

    public float getChipMinHeight() {
        K9 k9 = this.e;
        if (k9 != null) {
            return k9.P;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        K9 k9 = this.e;
        if (k9 != null) {
            return k9.m0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        K9 k9 = this.e;
        if (k9 != null) {
            return k9.R;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        K9 k9 = this.e;
        if (k9 != null) {
            return k9.S;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        K9 k9 = this.e;
        if (k9 == null || (drawable = k9.b0) == 0) {
            return null;
        }
        if (!(drawable instanceof InterfaceC3380sO)) {
            return drawable;
        }
        ((AbstractC3434tO) ((InterfaceC3380sO) drawable)).getClass();
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        K9 k9 = this.e;
        if (k9 != null) {
            return k9.f0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        K9 k9 = this.e;
        if (k9 != null) {
            return k9.s0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        K9 k9 = this.e;
        if (k9 != null) {
            return k9.e0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        K9 k9 = this.e;
        if (k9 != null) {
            return k9.r0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        K9 k9 = this.e;
        if (k9 != null) {
            return k9.d0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        K9 k9 = this.e;
        if (k9 != null) {
            return k9.S0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.y) {
            I9 i9 = this.x;
            if (i9.l == 1 || i9.k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public C3728yv getHideMotionSpec() {
        K9 k9 = this.e;
        if (k9 != null) {
            return k9.l0;
        }
        return null;
    }

    public float getIconEndPadding() {
        K9 k9 = this.e;
        if (k9 != null) {
            return k9.o0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        K9 k9 = this.e;
        if (k9 != null) {
            return k9.n0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        K9 k9 = this.e;
        if (k9 != null) {
            return k9.T;
        }
        return null;
    }

    public C2878jF getShapeAppearanceModel() {
        return this.e.b.a;
    }

    public C3728yv getShowMotionSpec() {
        K9 k9 = this.e;
        if (k9 != null) {
            return k9.k0;
        }
        return null;
    }

    public float getTextEndPadding() {
        K9 k9 = this.e;
        if (k9 != null) {
            return k9.q0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        K9 k9 = this.e;
        if (k9 != null) {
            return k9.p0;
        }
        return 0.0f;
    }

    public final void h() {
        TextPaint paint = getPaint();
        K9 k9 = this.e;
        if (k9 != null) {
            paint.drawableState = k9.getState();
        }
        EI textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.d(getContext(), paint, this.B);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC2883jK.K(this, this.e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, D);
        }
        if (d()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, E);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.y) {
            I9 i9 = this.x;
            int i2 = i9.l;
            if (i2 != Integer.MIN_VALUE) {
                i9.j(i2);
            }
            if (z) {
                i9.m(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        boolean zContains;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                zContains = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(zContains);
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(d());
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.u != i) {
            this.u = i;
            g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L4a
            if (r0 == r3) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L45
            goto L50
        L21:
            boolean r0 = r5.q
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r2)
        L2a:
            r0 = r3
            goto L51
        L2c:
            boolean r0 = r5.q
            if (r0 == 0) goto L45
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.n
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.y
            if (r0 == 0) goto L43
            I9 r0 = r5.x
            r0.r(r3, r3)
        L43:
            r0 = r3
            goto L46
        L45:
            r0 = r2
        L46:
            r5.setCloseIconPressed(r2)
            goto L51
        L4a:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r3)
            goto L2a
        L50:
            r0 = r2
        L51:
            if (r0 != 0) goto L59
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L5a
        L59:
            r2 = r3
        L5a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.w = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.m) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // defpackage.C2865j2, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.m) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // defpackage.C2865j2, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        K9 k9 = this.e;
        if (k9 != null) {
            k9.D(z);
        }
    }

    public void setCheckableResource(int i) {
        K9 k9 = this.e;
        if (k9 != null) {
            k9.D(k9.u0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        K9 k9 = this.e;
        if (k9 == null) {
            this.p = z;
        } else if (k9.g0) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        K9 k9 = this.e;
        if (k9 != null) {
            k9.E(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        K9 k9 = this.e;
        if (k9 != null) {
            k9.E(AbstractC0500aq.F(k9.u0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        K9 k9 = this.e;
        if (k9 != null) {
            k9.F(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        K9 k9 = this.e;
        if (k9 != null) {
            k9.F(AbstractC0115Ga.u(k9.u0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        K9 k9 = this.e;
        if (k9 != null) {
            k9.G(k9.u0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        K9 k9 = this.e;
        if (k9 == null || k9.O == colorStateList) {
            return;
        }
        k9.O = colorStateList;
        k9.onStateChange(k9.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateListU;
        K9 k9 = this.e;
        if (k9 == null || k9.O == (colorStateListU = AbstractC0115Ga.u(k9.u0, i))) {
            return;
        }
        k9.O = colorStateListU;
        k9.onStateChange(k9.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        K9 k9 = this.e;
        if (k9 != null) {
            k9.H(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        K9 k9 = this.e;
        if (k9 != null) {
            k9.H(k9.u0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(K9 k9) {
        K9 k92 = this.e;
        if (k92 != k9) {
            if (k92 != null) {
                k92.R0 = new WeakReference(null);
            }
            this.e = k9;
            k9.T0 = false;
            k9.R0 = new WeakReference(this);
            b(this.v);
        }
    }

    public void setChipEndPadding(float f) {
        K9 k9 = this.e;
        if (k9 == null || k9.t0 == f) {
            return;
        }
        k9.t0 = f;
        k9.invalidateSelf();
        k9.B();
    }

    public void setChipEndPaddingResource(int i) throws Resources.NotFoundException {
        K9 k9 = this.e;
        if (k9 != null) {
            float dimension = k9.u0.getResources().getDimension(i);
            if (k9.t0 != dimension) {
                k9.t0 = dimension;
                k9.invalidateSelf();
                k9.B();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        K9 k9 = this.e;
        if (k9 != null) {
            k9.I(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        K9 k9 = this.e;
        if (k9 != null) {
            k9.I(AbstractC0500aq.F(k9.u0, i));
        }
    }

    public void setChipIconSize(float f) {
        K9 k9 = this.e;
        if (k9 != null) {
            k9.J(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        K9 k9 = this.e;
        if (k9 != null) {
            k9.J(k9.u0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        K9 k9 = this.e;
        if (k9 != null) {
            k9.K(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        K9 k9 = this.e;
        if (k9 != null) {
            k9.K(AbstractC0115Ga.u(k9.u0, i));
        }
    }

    public void setChipIconVisible(int i) {
        K9 k9 = this.e;
        if (k9 != null) {
            k9.L(k9.u0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        K9 k9 = this.e;
        if (k9 == null || k9.P == f) {
            return;
        }
        k9.P = f;
        k9.invalidateSelf();
        k9.B();
    }

    public void setChipMinHeightResource(int i) throws Resources.NotFoundException {
        K9 k9 = this.e;
        if (k9 != null) {
            float dimension = k9.u0.getResources().getDimension(i);
            if (k9.P != dimension) {
                k9.P = dimension;
                k9.invalidateSelf();
                k9.B();
            }
        }
    }

    public void setChipStartPadding(float f) {
        K9 k9 = this.e;
        if (k9 == null || k9.m0 == f) {
            return;
        }
        k9.m0 = f;
        k9.invalidateSelf();
        k9.B();
    }

    public void setChipStartPaddingResource(int i) throws Resources.NotFoundException {
        K9 k9 = this.e;
        if (k9 != null) {
            float dimension = k9.u0.getResources().getDimension(i);
            if (k9.m0 != dimension) {
                k9.m0 = dimension;
                k9.invalidateSelf();
                k9.B();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        K9 k9 = this.e;
        if (k9 != null) {
            k9.M(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        K9 k9 = this.e;
        if (k9 != null) {
            k9.M(AbstractC0115Ga.u(k9.u0, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        K9 k9 = this.e;
        if (k9 != null) {
            k9.N(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        K9 k9 = this.e;
        if (k9 != null) {
            k9.N(k9.u0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        K9 k9 = this.e;
        if (k9 != null) {
            k9.O(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        K9 k9 = this.e;
        if (k9 == null || k9.f0 == charSequence) {
            return;
        }
        String str = A7.d;
        A7 a7 = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? A7.g : A7.f;
        k9.f0 = a7.c(charSequence, a7.c);
        k9.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        K9 k9 = this.e;
        if (k9 != null) {
            k9.P(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        K9 k9 = this.e;
        if (k9 != null) {
            k9.P(k9.u0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        K9 k9 = this.e;
        if (k9 != null) {
            k9.O(AbstractC0500aq.F(k9.u0, i));
        }
        e();
    }

    public void setCloseIconSize(float f) {
        K9 k9 = this.e;
        if (k9 != null) {
            k9.Q(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        K9 k9 = this.e;
        if (k9 != null) {
            k9.Q(k9.u0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        K9 k9 = this.e;
        if (k9 != null) {
            k9.R(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        K9 k9 = this.e;
        if (k9 != null) {
            k9.R(k9.u0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        K9 k9 = this.e;
        if (k9 != null) {
            k9.T(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        K9 k9 = this.e;
        if (k9 != null) {
            k9.T(AbstractC0115Ga.u(k9.u0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // defpackage.C2865j2, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // defpackage.C2865j2, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        K9 k9 = this.e;
        if (k9 != null) {
            k9.n(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        K9 k9 = this.e;
        if (k9 != null) {
            k9.S0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.t = z;
        b(this.v);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C3728yv c3728yv) {
        K9 k9 = this.e;
        if (k9 != null) {
            k9.l0 = c3728yv;
        }
    }

    public void setHideMotionSpecResource(int i) {
        K9 k9 = this.e;
        if (k9 != null) {
            k9.l0 = C3728yv.a(k9.u0, i);
        }
    }

    public void setIconEndPadding(float f) {
        K9 k9 = this.e;
        if (k9 != null) {
            k9.V(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        K9 k9 = this.e;
        if (k9 != null) {
            k9.V(k9.u0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        K9 k9 = this.e;
        if (k9 != null) {
            k9.W(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        K9 k9 = this.e;
        if (k9 != null) {
            k9.W(k9.u0.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.e == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        K9 k9 = this.e;
        if (k9 != null) {
            k9.U0 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.o = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.n = onClickListener;
        e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        K9 k9 = this.e;
        if (k9 != null) {
            k9.X(colorStateList);
        }
        if (this.e.P0) {
            return;
        }
        f();
    }

    public void setRippleColorResource(int i) {
        K9 k9 = this.e;
        if (k9 != null) {
            k9.X(AbstractC0115Ga.u(k9.u0, i));
            if (this.e.P0) {
                return;
            }
            f();
        }
    }

    @Override // defpackage.InterfaceC3533vF
    public void setShapeAppearanceModel(C2878jF c2878jF) {
        this.e.setShapeAppearanceModel(c2878jF);
    }

    public void setShowMotionSpec(C3728yv c3728yv) {
        K9 k9 = this.e;
        if (k9 != null) {
            k9.k0 = c3728yv;
        }
    }

    public void setShowMotionSpecResource(int i) {
        K9 k9 = this.e;
        if (k9 != null) {
            k9.k0 = C3728yv.a(k9.u0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        K9 k9 = this.e;
        if (k9 == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(k9.T0 ? null : charSequence, bufferType);
        K9 k92 = this.e;
        if (k92 == null || TextUtils.equals(k92.U, charSequence)) {
            return;
        }
        k92.U = charSequence;
        k92.A0.d = true;
        k92.invalidateSelf();
        k92.B();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        K9 k9 = this.e;
        if (k9 != null) {
            k9.Y(new EI(k9.u0, i));
        }
        h();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        K9 k9 = this.e;
        if (k9 == null || k9.q0 == f) {
            return;
        }
        k9.q0 = f;
        k9.invalidateSelf();
        k9.B();
    }

    public void setTextEndPaddingResource(int i) throws Resources.NotFoundException {
        K9 k9 = this.e;
        if (k9 != null) {
            float dimension = k9.u0.getResources().getDimension(i);
            if (k9.q0 != dimension) {
                k9.q0 = dimension;
                k9.invalidateSelf();
                k9.B();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        K9 k9 = this.e;
        if (k9 != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            HI hi = k9.A0;
            EI ei = hi.f;
            if (ei != null) {
                ei.l = fApplyDimension;
                hi.a.setTextSize(fApplyDimension);
                k9.B();
                k9.invalidateSelf();
            }
        }
        h();
    }

    public void setTextStartPadding(float f) {
        K9 k9 = this.e;
        if (k9 == null || k9.p0 == f) {
            return;
        }
        k9.p0 = f;
        k9.invalidateSelf();
        k9.B();
    }

    public void setTextStartPaddingResource(int i) throws Resources.NotFoundException {
        K9 k9 = this.e;
        if (k9 != null) {
            float dimension = k9.u0.getResources().getDimension(i);
            if (k9.p0 != dimension) {
                k9.p0 = dimension;
                k9.invalidateSelf();
                k9.B();
            }
        }
    }

    public void setCloseIconVisible(boolean z) {
        K9 k9 = this.e;
        if (k9 != null) {
            k9.U(z);
        }
        e();
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public void setCheckedIconVisible(boolean z) {
        K9 k9 = this.e;
        if (k9 != null) {
            k9.G(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        K9 k9 = this.e;
        if (k9 != null) {
            k9.L(z);
        }
    }

    public void setTextAppearance(EI ei) {
        K9 k9 = this.e;
        if (k9 != null) {
            k9.Y(ei);
        }
        h();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        K9 k9 = this.e;
        if (k9 != null) {
            k9.Y(new EI(k9.u0, i));
        }
        h();
    }

    public void setInternalOnCheckedChangeListener(Yt yt) {
    }
}
