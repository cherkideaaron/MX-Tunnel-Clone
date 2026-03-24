package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.AC;
import defpackage.AbstractC0432Yl;
import defpackage.C0557bs;
import defpackage.C3090n7;
import defpackage.Cu;
import defpackage.MO;
import defpackage.Ru;
import defpackage.UL;

/* loaded from: classes2.dex */
public class NavigationMenuItemView extends AbstractC0432Yl implements Ru {
    public static final int[] M = {R.attr.state_checked};
    public int B;
    public boolean C;
    public boolean D;
    public final boolean E;
    public final CheckedTextView F;
    public FrameLayout G;
    public Cu H;
    public ColorStateList I;
    public boolean J;
    public Drawable K;
    public final C3090n7 L;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.E = true;
        C3090n7 c3090n7 = new C3090n7(this, 4);
        this.L = c3090n7;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.mxtunnel.pro.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.mxtunnel.pro.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.mxtunnel.pro.R.id.design_menu_item_text);
        this.F = checkedTextView;
        UL.l(checkedTextView, c3090n7);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.G == null) {
                this.G = (FrameLayout) ((ViewStub) findViewById(com.mxtunnel.pro.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.G.removeAllViews();
            this.G.addView(view);
        }
    }

    @Override // defpackage.Ru
    public final void c(Cu cu) throws Resources.NotFoundException {
        C0557bs c0557bs;
        int i;
        StateListDrawable stateListDrawable;
        this.H = cu;
        int i2 = cu.a;
        if (i2 > 0) {
            setId(i2);
        }
        setVisibility(cu.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.mxtunnel.pro.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(M, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(cu.isCheckable());
        setChecked(cu.isChecked());
        setEnabled(cu.isEnabled());
        setTitle(cu.e);
        setIcon(cu.getIcon());
        setActionView(cu.getActionView());
        setContentDescription(cu.q);
        MO.I(this, cu.r);
        Cu cu2 = this.H;
        CharSequence charSequence = cu2.e;
        CheckedTextView checkedTextView = this.F;
        if (charSequence == null && cu2.getIcon() == null && this.H.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.G;
            if (frameLayout == null) {
                return;
            }
            c0557bs = (C0557bs) frameLayout.getLayoutParams();
            i = -1;
        } else {
            checkedTextView.setVisibility(0);
            FrameLayout frameLayout2 = this.G;
            if (frameLayout2 == null) {
                return;
            }
            c0557bs = (C0557bs) frameLayout2.getLayoutParams();
            i = -2;
        }
        ((LinearLayout.LayoutParams) c0557bs).width = i;
        this.G.setLayoutParams(c0557bs);
    }

    @Override // defpackage.Ru
    public Cu getItemData() {
        return this.H;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        Cu cu = this.H;
        if (cu != null && cu.isCheckable() && this.H.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, M);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.D != z) {
            this.D = z;
            this.L.h(this.F, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.F;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.E) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) throws Resources.NotFoundException {
        if (drawable != null) {
            if (this.J) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.I);
            }
            int i = this.B;
            drawable.setBounds(0, 0, i, i);
        } else if (this.C) {
            if (this.K == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = AC.a;
                Drawable drawable2 = resources.getDrawable(com.mxtunnel.pro.R.drawable.navigation_empty_icon, theme);
                this.K = drawable2;
                if (drawable2 != null) {
                    int i2 = this.B;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.K;
        }
        this.F.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.F.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.B = i;
    }

    public void setIconTintList(ColorStateList colorStateList) throws Resources.NotFoundException {
        this.I = colorStateList;
        this.J = colorStateList != null;
        Cu cu = this.H;
        if (cu != null) {
            setIcon(cu.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.F.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.C = z;
    }

    public void setTextAppearance(int i) {
        this.F.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.F.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.F.setText(charSequence);
    }
}
