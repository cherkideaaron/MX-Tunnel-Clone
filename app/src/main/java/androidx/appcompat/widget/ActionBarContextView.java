package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.mxtunnel.pro.R;
import defpackage.A0;
import defpackage.AbstractC0500aq;
import defpackage.AbstractC2547dB;
import defpackage.AbstractC3270qM;
import defpackage.C0564c;
import defpackage.C2885jM;
import defpackage.C3572w0;
import defpackage.MenuC3511uu;
import defpackage.UL;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {
    public final C0564c a;
    public final Context b;
    public ActionMenuView c;
    public A0 d;
    public int e;
    public C2885jM f;
    public boolean m;
    public boolean n;
    public CharSequence o;
    public CharSequence p;
    public View q;
    public View r;
    public View s;
    public LinearLayout t;
    public TextView u;
    public TextView v;
    public final int w;
    public final int x;
    public boolean y;
    public final int z;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        this.a = new C0564c(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.b = context;
        } else {
            this.b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2547dB.d, R.attr.actionModeStyle, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : AbstractC0500aq.F(context, resourceId));
        this.w = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.x = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.e = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.z = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int f(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int g(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.F0 r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.q
            r1 = 0
            if (r0 != 0) goto L19
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r2 = r5.z
            android.view.View r0 = r0.inflate(r2, r5, r1)
            r5.q = r0
        L15:
            r5.addView(r0)
            goto L22
        L19:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L22
            android.view.View r0 = r5.q
            goto L15
        L22:
            android.view.View r0 = r5.q
            r2 = 2131361885(0x7f0a005d, float:1.8343535E38)
            android.view.View r0 = r0.findViewById(r2)
            r5.r = r0
            b r2 = new b
            r3 = 1
            r2.<init>(r6, r3)
            r0.setOnClickListener(r2)
            uu r6 = r6.d()
            A0 r0 = r5.d
            if (r0 == 0) goto L50
            r0.i()
            w0 r0 = r0.z
            if (r0 == 0) goto L50
            boolean r2 = r0.b()
            if (r2 == 0) goto L50
            Hu r0 = r0.j
            r0.dismiss()
        L50:
            A0 r0 = new A0
            android.content.Context r2 = r5.getContext()
            r0.<init>(r2)
            r5.d = r0
            r2 = 1
            r0.r = r2
            r0.s = r2
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r2 = -2
            r3 = -1
            r0.<init>(r2, r3)
            A0 r2 = r5.d
            android.content.Context r3 = r5.b
            r6.b(r2, r3)
            A0 r6 = r5.d
            Su r2 = r6.n
            if (r2 != 0) goto L88
            android.view.LayoutInflater r3 = r6.d
            int r4 = r6.f
            android.view.View r1 = r3.inflate(r4, r5, r1)
            Su r1 = (defpackage.Su) r1
            r6.n = r1
            uu r3 = r6.c
            r1.b(r3)
            r6.h()
        L88:
            Su r1 = r6.n
            if (r2 == r1) goto L92
            r2 = r1
            androidx.appcompat.widget.ActionMenuView r2 = (androidx.appcompat.widget.ActionMenuView) r2
            r2.setPresenter(r6)
        L92:
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            r5.c = r1
            r6 = 0
            r1.setBackground(r6)
            androidx.appcompat.widget.ActionMenuView r6 = r5.c
            r5.addView(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.c(F0):void");
    }

    public final void d() {
        if (this.t == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.t = linearLayout;
            this.u = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.v = (TextView) this.t.findViewById(R.id.action_bar_subtitle);
            int i = this.w;
            if (i != 0) {
                this.u.setTextAppearance(getContext(), i);
            }
            int i2 = this.x;
            if (i2 != 0) {
                this.v.setTextAppearance(getContext(), i2);
            }
        }
        this.u.setText(this.o);
        this.v.setText(this.p);
        boolean z = !TextUtils.isEmpty(this.o);
        boolean z2 = !TextUtils.isEmpty(this.p);
        this.v.setVisibility(z2 ? 0 : 8);
        this.t.setVisibility((z || z2) ? 0 : 8);
        if (this.t.getParent() == null) {
            addView(this.t);
        }
    }

    public final void e() {
        removeAllViews();
        this.s = null;
        this.c = null;
        this.d = null;
        View view = this.r;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f != null ? this.a.b : getVisibility();
    }

    public int getContentHeight() {
        return this.e;
    }

    public CharSequence getSubtitle() {
        return this.p;
    }

    public CharSequence getTitle() {
        return this.o;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            C2885jM c2885jM = this.f;
            if (c2885jM != null) {
                c2885jM.b();
            }
            super.setVisibility(i);
        }
    }

    public final C2885jM i(int i, long j) {
        C2885jM c2885jM = this.f;
        if (c2885jM != null) {
            c2885jM.b();
        }
        C0564c c0564c = this.a;
        if (i != 0) {
            C2885jM c2885jMA = UL.a(this);
            c2885jMA.a(0.0f);
            c2885jMA.c(j);
            c0564c.c.f = c2885jMA;
            c0564c.b = i;
            c2885jMA.d(c0564c);
            return c2885jMA;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C2885jM c2885jMA2 = UL.a(this);
        c2885jMA2.a(1.0f);
        c2885jMA2.c(j);
        c0564c.c.f = c2885jMA2;
        c0564c.b = i;
        c2885jMA2.d(c0564c);
        return c2885jMA2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC2547dB.a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        A0 a0 = this.d;
        if (a0 != null) {
            Configuration configuration2 = a0.b.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            a0.v = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            MenuC3511uu menuC3511uu = a0.c;
            if (menuC3511uu != null) {
                menuC3511uu.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A0 a0 = this.d;
        if (a0 != null) {
            a0.i();
            C3572w0 c3572w0 = this.d.z;
            if (c3572w0 == null || !c3572w0.b()) {
                return;
            }
            c3572w0.j.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.n = false;
        }
        if (!this.n) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.n = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.n = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = AbstractC3270qM.a;
        boolean z3 = getLayoutDirection() == 1;
        int paddingRight = z3 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.q;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.q.getLayoutParams();
            int i5 = z3 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z3 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z3 ? paddingRight - i5 : paddingRight + i5;
            int iG = g(this.q, i7, paddingTop, paddingTop2, z3) + i7;
            paddingRight = z3 ? iG - i6 : iG + i6;
        }
        LinearLayout linearLayout = this.t;
        if (linearLayout != null && this.s == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.t, paddingRight, paddingTop, paddingTop2, z3);
        }
        View view2 = this.s;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, z3);
        }
        int paddingLeft = z3 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null) {
            g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z3);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.q;
        if (view != null) {
            int iF = f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.q.getLayoutParams();
            paddingLeft = iF - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.c, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.t;
        if (linearLayout != null && this.s == null) {
            if (this.y) {
                this.t.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.t.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.t.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.s;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.s.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.e <= 0) {
            int childCount = getChildCount();
            size2 = 0;
            for (int i7 = 0; i7 < childCount; i7++) {
                int measuredHeight = getChildAt(i7).getMeasuredHeight() + paddingBottom;
                if (measuredHeight > size2) {
                    size2 = measuredHeight;
                }
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.m = false;
        }
        if (!this.m) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.m = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.m = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.e = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.s;
        if (view2 != null) {
            removeView(view2);
        }
        this.s = view;
        if (view != null && (linearLayout = this.t) != null) {
            removeView(linearLayout);
            this.t = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.p = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.o = charSequence;
        d();
        UL.m(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.y) {
            requestLayout();
        }
        this.y = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
