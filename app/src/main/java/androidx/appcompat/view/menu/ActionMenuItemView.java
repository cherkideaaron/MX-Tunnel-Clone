package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import defpackage.AbstractC2547dB;
import defpackage.AbstractC3518v0;
import defpackage.B0;
import defpackage.C3413t3;
import defpackage.C3464u0;
import defpackage.Cu;
import defpackage.InterfaceC3457tu;
import defpackage.MO;
import defpackage.MenuC3511uu;
import defpackage.Ru;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C3413t3 implements Ru, View.OnClickListener, B0 {
    public Cu n;
    public CharSequence o;
    public Drawable p;
    public InterfaceC3457tu q;
    public C3464u0 r;
    public AbstractC3518v0 s;
    public boolean t;
    public boolean u;
    public final int v;
    public int w;
    public final int x;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.t = n();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2547dB.c, 0, 0);
        this.v = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.x = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.w = -1;
        setSaveEnabled(false);
    }

    @Override // defpackage.B0
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // defpackage.B0
    public final boolean b() {
        return (TextUtils.isEmpty(getText()) ^ true) && this.n.getIcon() == null;
    }

    @Override // defpackage.Ru
    public final void c(Cu cu) {
        this.n = cu;
        setIcon(cu.getIcon());
        setTitle(cu.getTitleCondensed());
        setId(cu.a);
        setVisibility(cu.isVisible() ? 0 : 8);
        setEnabled(cu.isEnabled());
        if (cu.hasSubMenu() && this.r == null) {
            this.r = new C3464u0(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // defpackage.Ru
    public Cu getItemData() {
        return this.n;
    }

    public final boolean n() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void o() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.o);
        if (this.p != null && ((this.n.y & 4) != 4 || (!this.t && !this.u))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.o : null);
        CharSequence charSequence = this.n.q;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = z3 ? null : this.n.e;
        }
        setContentDescription(charSequence);
        CharSequence charSequence2 = this.n.r;
        if (TextUtils.isEmpty(charSequence2)) {
            MO.I(this, z3 ? null : this.n.e);
        } else {
            MO.I(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC3457tu interfaceC3457tu = this.q;
        if (interfaceC3457tu != null) {
            interfaceC3457tu.a(this.n);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.t = n();
        o();
    }

    @Override // defpackage.C3413t3, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean z = !TextUtils.isEmpty(getText());
        if (z && (i3 = this.w) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.v;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (z || this.p == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.p.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C3464u0 c3464u0;
        if (this.n.hasSubMenu() && (c3464u0 = this.r) != null && c3464u0.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.u != z) {
            this.u = z;
            Cu cu = this.n;
            if (cu != null) {
                MenuC3511uu menuC3511uu = cu.n;
                menuC3511uu.k = true;
                menuC3511uu.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.p = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.x;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        o();
    }

    public void setItemInvoker(InterfaceC3457tu interfaceC3457tu) {
        this.q = interfaceC3457tu;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.w = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC3518v0 abstractC3518v0) {
        this.s = abstractC3518v0;
    }

    public void setTitle(CharSequence charSequence) {
        this.o = charSequence;
        o();
    }
}
