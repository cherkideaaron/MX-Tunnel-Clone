package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.mxtunnel.pro.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public final class Xt extends C2865j2 {
    public static final int[] E = {R.attr.state_indeterminate};
    public static final int[] F = {R.attr.state_error};
    public static final int[][] G = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public static final int H = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public CharSequence A;
    public CompoundButton.OnCheckedChangeListener B;
    public final O1 C;
    public final Vt D;
    public final LinkedHashSet e;
    public final LinkedHashSet f;
    public ColorStateList m;
    public boolean n;
    public boolean o;
    public boolean p;
    public CharSequence q;
    public Drawable r;
    public Drawable s;
    public boolean t;
    public ColorStateList u;
    public ColorStateList v;
    public PorterDuff.Mode w;
    public int x;
    public int[] y;
    public boolean z;

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Xt(android.content.Context r14, android.util.AttributeSet r15) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Xt.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private String getButtonStateDescription() {
        Resources resources;
        int i;
        int i2 = this.x;
        if (i2 == 1) {
            resources = getResources();
            i = R.string.mtrl_checkbox_state_description_checked;
        } else if (i2 == 0) {
            resources = getResources();
            i = R.string.mtrl_checkbox_state_description_unchecked;
        } else {
            resources = getResources();
            i = R.string.mtrl_checkbox_state_description_indeterminate;
        }
        return resources.getString(i);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.m == null) {
            int iC = AbstractC0500aq.C(this, R.attr.colorControlActivated);
            int iC2 = AbstractC0500aq.C(this, R.attr.colorError);
            int iC3 = AbstractC0500aq.C(this, R.attr.colorSurface);
            int iC4 = AbstractC0500aq.C(this, R.attr.colorOnSurface);
            this.m = new ColorStateList(G, new int[]{AbstractC0500aq.P(iC3, iC2, 1.0f), AbstractC0500aq.P(iC3, iC, 1.0f), AbstractC0500aq.P(iC3, iC4, 0.54f), AbstractC0500aq.P(iC3, iC4, 0.38f), AbstractC0500aq.P(iC3, iC4, 0.38f)});
        }
        return this.m;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.u;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C3028m0 c3028m0;
        Drawable drawableMutate = this.r;
        ColorStateList colorStateList3 = this.u;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (buttonTintMode != null) {
                drawableMutate.setTintMode(buttonTintMode);
            }
        }
        this.r = drawableMutate;
        Drawable drawableMutate2 = this.s;
        ColorStateList colorStateList4 = this.v;
        PorterDuff.Mode mode = this.w;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                drawableMutate2.setTintMode(mode);
            }
        }
        this.s = drawableMutate2;
        if (this.t) {
            O1 o1 = this.C;
            if (o1 != null) {
                Drawable drawable = o1.a;
                Vt vt = this.D;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (vt.a == null) {
                        vt.a = new F1(vt);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(vt.a);
                }
                ArrayList arrayList = o1.e;
                M1 m1 = o1.b;
                if (arrayList != null && vt != null) {
                    arrayList.remove(vt);
                    if (o1.e.size() == 0 && (c3028m0 = o1.d) != null) {
                        m1.b.removeListener(c3028m0);
                        o1.d = null;
                    }
                }
                Drawable drawable2 = o1.a;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (vt.a == null) {
                        vt.a = new F1(vt);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(vt.a);
                } else if (vt != null) {
                    if (o1.e == null) {
                        o1.e = new ArrayList();
                    }
                    if (!o1.e.contains(vt)) {
                        o1.e.add(vt);
                        if (o1.d == null) {
                            o1.d = new C3028m0(o1, 1);
                        }
                        m1.b.addListener(o1.d);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable3 = this.r;
                if ((drawable3 instanceof AnimatedStateListDrawable) && o1 != null) {
                    ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, o1, false);
                    ((AnimatedStateListDrawable) this.r).addTransition(R.id.indeterminate, R.id.unchecked, o1, false);
                }
            }
        }
        Drawable drawable4 = this.r;
        if (drawable4 != null && (colorStateList2 = this.u) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.s;
        if (drawable5 != null && (colorStateList = this.v) != null) {
            drawable5.setTintList(colorStateList);
        }
        Drawable drawable6 = this.r;
        Drawable drawable7 = this.s;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f = intrinsicWidth / intrinsicHeight;
                if (f >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.r;
    }

    public Drawable getButtonIconDrawable() {
        return this.s;
    }

    public ColorStateList getButtonIconTintList() {
        return this.v;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.w;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.u;
    }

    public int getCheckedState() {
        return this.x;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.q;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.x == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.n && this.u == null && this.v == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, E);
        }
        if (this.p) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, F);
        }
        int i2 = 0;
        while (true) {
            if (i2 >= iArrOnCreateDrawableState.length) {
                iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
                iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
                break;
            }
            int i3 = iArrOnCreateDrawableState[i2];
            if (i3 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
                break;
            }
            if (i3 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i2] = 16842912;
                break;
            }
            i2++;
        }
        this.y = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.o || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (getLayoutDirection() == 1 ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.p) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.q));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Wt)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Wt wt = (Wt) parcelable;
        super.onRestoreInstanceState(wt.getSuperState());
        setCheckedState(wt.a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        Wt wt = new Wt(super.onSaveInstanceState());
        wt.a = getCheckedState();
        return wt;
    }

    @Override // defpackage.C2865j2, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC0500aq.F(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.s = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(AbstractC0500aq.F(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.v == colorStateList) {
            return;
        }
        this.v = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.w == mode) {
            return;
        }
        this.w = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.u == colorStateList) {
            return;
        }
        this.u = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.o = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.x != i) {
            this.x = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && this.A == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.z) {
                return;
            }
            this.z = true;
            LinkedHashSet linkedHashSet = this.f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    Vs.u(it.next());
                    throw null;
                }
            }
            if (this.x != 2 && (onCheckedChangeListener = this.B) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i2 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.z = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.q = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.p == z) {
            return;
        }
        this.p = z;
        refreshDrawableState();
        Iterator it = this.e.iterator();
        if (it.hasNext()) {
            Vs.u(it.next());
            throw null;
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.B = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.A = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.n = z;
        setButtonTintList(z ? getMaterialThemeColorsTintList() : null);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // defpackage.C2865j2, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.r = drawable;
        this.t = false;
        a();
    }
}
