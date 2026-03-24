package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.mxtunnel.pro.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: Oi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0259Oi extends LinearLayout {
    public AccessibilityManager.TouchExplorationStateChangeListener A;
    public final C0225Mi B;
    public final TextInputLayout a;
    public final FrameLayout b;
    public final CheckableImageButton c;
    public ColorStateList d;
    public PorterDuff.Mode e;
    public View.OnLongClickListener f;
    public final CheckableImageButton m;
    public final W7 n;
    public int o;
    public final LinkedHashSet p;
    public ColorStateList q;
    public PorterDuff.Mode r;
    public int s;
    public ImageView.ScaleType t;
    public View.OnLongClickListener u;
    public CharSequence v;
    public final C3413t3 w;
    public boolean x;
    public EditText y;
    public final AccessibilityManager z;

    public C0259Oi(TextInputLayout textInputLayout, D3 d3) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.o = 0;
        this.p = new LinkedHashSet();
        this.B = new C0225Mi(this);
        C0242Ni c0242Ni = new C0242Ni(this);
        this.z = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.c = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.m = checkableImageButtonA2;
        this.n = new W7(this, d3);
        C3413t3 c3413t3 = new C3413t3(getContext(), null);
        this.w = c3413t3;
        TypedArray typedArray = (TypedArray) d3.b;
        if (typedArray.hasValue(38)) {
            this.d = AbstractC3296qu.w(getContext(), d3, 38);
        }
        if (typedArray.hasValue(39)) {
            this.e = AbstractC2883jK.H(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(d3.x(37));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        checkableImageButtonA.setImportantForAccessibility(2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setCheckable(false);
        checkableImageButtonA.setFocusable(false);
        if (!typedArray.hasValue(54)) {
            if (typedArray.hasValue(32)) {
                this.q = AbstractC3296qu.w(getContext(), d3, 32);
            }
            if (typedArray.hasValue(33)) {
                this.r = AbstractC2883jK.H(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && checkableImageButtonA2.getContentDescription() != (text = typedArray.getText(27))) {
                checkableImageButtonA2.setContentDescription(text);
            }
            checkableImageButtonA2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(54)) {
            if (typedArray.hasValue(55)) {
                this.q = AbstractC3296qu.w(getContext(), d3, 55);
            }
            if (typedArray.hasValue(56)) {
                this.r = AbstractC2883jK.H(typedArray.getInt(56, -1), null);
            }
            g(typedArray.getBoolean(54, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(52);
            if (checkableImageButtonA2.getContentDescription() != text2) {
                checkableImageButtonA2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.s) {
            this.s = dimensionPixelSize;
            checkableImageButtonA2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonA.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType scaleTypeJ = MO.j(typedArray.getInt(31, -1));
            this.t = scaleTypeJ;
            checkableImageButtonA2.setScaleType(scaleTypeJ);
            checkableImageButtonA.setScaleType(scaleTypeJ);
        }
        c3413t3.setVisibility(8);
        c3413t3.setId(R.id.textinput_suffix_text);
        c3413t3.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        c3413t3.setAccessibilityLiveRegion(1);
        c3413t3.setTextAppearance(typedArray.getResourceId(73, 0));
        if (typedArray.hasValue(74)) {
            c3413t3.setTextColor(d3.w(74));
        }
        CharSequence text3 = typedArray.getText(72);
        this.v = TextUtils.isEmpty(text3) ? null : text3;
        c3413t3.setText(text3);
        n();
        frameLayout.addView(checkableImageButtonA2);
        addView(c3413t3);
        addView(frameLayout);
        addView(checkableImageButtonA);
        textInputLayout.l0.add(c0242Ni);
        if (textInputLayout.e != null) {
            c0242Ni.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new J8(this, 1));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (AbstractC3296qu.H(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final AbstractC0276Pi b() {
        AbstractC0276Pi c0597ce;
        int i = this.o;
        W7 w7 = this.n;
        SparseArray sparseArray = (SparseArray) w7.c;
        AbstractC0276Pi ny = (AbstractC0276Pi) sparseArray.get(i);
        if (ny == null) {
            C0259Oi c0259Oi = (C0259Oi) w7.d;
            if (i == -1) {
                c0597ce = new C0597ce(c0259Oi, 0);
            } else if (i == 0) {
                c0597ce = new C0597ce(c0259Oi, 1);
            } else if (i == 1) {
                ny = new Ny(c0259Oi, w7.b);
                sparseArray.append(i, ny);
            } else if (i == 2) {
                c0597ce = new Z9(c0259Oi);
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException(Vs.k(i, "Invalid end icon mode: "));
                }
                c0597ce = new C0122Gh(c0259Oi);
            }
            ny = c0597ce;
            sparseArray.append(i, ny);
        }
        return ny;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.m;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.w.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.b.getVisibility() == 0 && this.m.getVisibility() == 0;
    }

    public final boolean e() {
        return this.c.getVisibility() == 0;
    }

    public final void f(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean z3;
        AbstractC0276Pi abstractC0276PiB = b();
        boolean zK = abstractC0276PiB.k();
        CheckableImageButton checkableImageButton = this.m;
        boolean z4 = true;
        if (!zK || (z3 = checkableImageButton.d) == abstractC0276PiB.l()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(abstractC0276PiB instanceof C0122Gh) || (zIsActivated = checkableImageButton.isActivated()) == abstractC0276PiB.j()) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            MO.D(this.a, checkableImageButton, this.q);
        }
    }

    public final void g(int i) {
        if (this.o == i) {
            return;
        }
        AbstractC0276Pi abstractC0276PiB = b();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.A;
        AccessibilityManager accessibilityManager = this.z;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.A = null;
        abstractC0276PiB.s();
        this.o = i;
        Iterator it = this.p.iterator();
        if (it.hasNext()) {
            Vs.u(it.next());
            throw null;
        }
        h(i != 0);
        AbstractC0276Pi abstractC0276PiB2 = b();
        int iD = this.n.a;
        if (iD == 0) {
            iD = abstractC0276PiB2.d();
        }
        Drawable drawableF = iD != 0 ? AbstractC0500aq.F(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.m;
        checkableImageButton.setImageDrawable(drawableF);
        TextInputLayout textInputLayout = this.a;
        if (drawableF != null) {
            MO.b(textInputLayout, checkableImageButton, this.q, this.r);
            MO.D(textInputLayout, checkableImageButton, this.q);
        }
        int iC = abstractC0276PiB2.c();
        CharSequence text = iC != 0 ? getResources().getText(iC) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(abstractC0276PiB2.k());
        if (!abstractC0276PiB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        abstractC0276PiB2.r();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListenerH = abstractC0276PiB2.h();
        this.A = touchExplorationStateChangeListenerH;
        if (touchExplorationStateChangeListenerH != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.A);
        }
        View.OnClickListener onClickListenerF = abstractC0276PiB2.f();
        View.OnLongClickListener onLongClickListener = this.u;
        checkableImageButton.setOnClickListener(onClickListenerF);
        MO.H(checkableImageButton, onLongClickListener);
        EditText editText = this.y;
        if (editText != null) {
            abstractC0276PiB2.m(editText);
            j(abstractC0276PiB2);
        }
        MO.b(textInputLayout, checkableImageButton, this.q, this.r);
        f(true);
    }

    public final void h(boolean z) {
        if (d() != z) {
            this.m.setVisibility(z ? 0 : 8);
            k();
            m();
            this.a.s();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.c;
        checkableImageButton.setImageDrawable(drawable);
        l();
        MO.b(this.a, checkableImageButton, this.d, this.e);
    }

    public final void j(AbstractC0276Pi abstractC0276Pi) {
        if (this.y == null) {
            return;
        }
        if (abstractC0276Pi.e() != null) {
            this.y.setOnFocusChangeListener(abstractC0276Pi.e());
        }
        if (abstractC0276Pi.g() != null) {
            this.m.setOnFocusChangeListener(abstractC0276Pi.g());
        }
    }

    public final void k() {
        this.b.setVisibility((this.m.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.v == null || this.x) ? 8 : false)) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.q.q && textInputLayout.o()) ? 0 : 8);
        k();
        m();
        if (this.o != 0) {
            return;
        }
        textInputLayout.s();
    }

    public final void m() {
        TextInputLayout textInputLayout = this.a;
        if (textInputLayout.e == null) {
            return;
        }
        this.w.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.e.getPaddingTop(), (d() || e()) ? 0 : textInputLayout.e.getPaddingEnd(), textInputLayout.e.getPaddingBottom());
    }

    public final void n() {
        C3413t3 c3413t3 = this.w;
        int visibility = c3413t3.getVisibility();
        int i = (this.v == null || this.x) ? 8 : 0;
        if (visibility != i) {
            b().p(i == 0);
        }
        k();
        c3413t3.setVisibility(i);
        this.a.s();
    }
}
