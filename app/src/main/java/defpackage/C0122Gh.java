package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import com.mxtunnel.pro.R;

/* renamed from: Gh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0122Gh extends AbstractC0276Pi {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public AutoCompleteTextView h;
    public final V9 i;
    public final W9 j;
    public final AccessibilityManagerTouchExplorationStateChangeListenerC0105Fh k;
    public boolean l;
    public boolean m;
    public boolean n;
    public long o;
    public AccessibilityManager p;
    public ValueAnimator q;
    public ValueAnimator r;

    /* JADX WARN: Type inference failed for: r0v2, types: [Fh] */
    public C0122Gh(C0259Oi c0259Oi) {
        super(c0259Oi);
        int i = 1;
        this.i = new V9(this, i);
        this.j = new W9(this, i);
        this.k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: Fh
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                C0122Gh c0122Gh = this.a;
                AutoCompleteTextView autoCompleteTextView = c0122Gh.h;
                if (autoCompleteTextView == null || AbstractC3279qd.M(autoCompleteTextView)) {
                    return;
                }
                c0122Gh.d.setImportantForAccessibility(z ? 2 : 1);
            }
        };
        this.o = Long.MAX_VALUE;
        this.f = AbstractC0069Df.U(c0259Oi.getContext(), R.attr.motionDurationShort3, 67);
        this.e = AbstractC0069Df.U(c0259Oi.getContext(), R.attr.motionDurationShort3, 50);
        this.g = AbstractC0069Df.V(c0259Oi.getContext(), R.attr.motionEasingLinearInterpolator, S1.a);
    }

    @Override // defpackage.AbstractC0276Pi
    public final void a() {
        if (this.p.isTouchExplorationEnabled() && AbstractC3279qd.M(this.h) && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new H0(this, 7));
    }

    @Override // defpackage.AbstractC0276Pi
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // defpackage.AbstractC0276Pi
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // defpackage.AbstractC0276Pi
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // defpackage.AbstractC0276Pi
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // defpackage.AbstractC0276Pi
    public final AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.k;
    }

    @Override // defpackage.AbstractC0276Pi
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // defpackage.AbstractC0276Pi
    public final boolean j() {
        return this.l;
    }

    @Override // defpackage.AbstractC0276Pi
    public final boolean l() {
        return this.n;
    }

    @Override // defpackage.AbstractC0276Pi
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new ViewOnTouchListenerC0071Dh(this, 0));
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: Eh
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                C0122Gh c0122Gh = this.a;
                c0122Gh.m = true;
                c0122Gh.o = SystemClock.uptimeMillis();
                c0122Gh.t(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!AbstractC3279qd.M(editText) && this.p.isTouchExplorationEnabled()) {
            this.d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // defpackage.AbstractC0276Pi
    public final void n(Z z) {
        if (!AbstractC3279qd.M(this.h)) {
            z.i(Spinner.class.getName());
        }
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = z.a;
        if (i >= 26 ? accessibilityNodeInfo.isShowingHintText() : z.e(4)) {
            if (i >= 26) {
                accessibilityNodeInfo.setHintText(null);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", null);
            }
        }
    }

    @Override // defpackage.AbstractC0276Pi
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (!this.p.isEnabled() || AbstractC3279qd.M(this.h)) {
            return;
        }
        boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.n && !this.h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z) {
            u();
            this.m = true;
            this.o = SystemClock.uptimeMillis();
        }
    }

    @Override // defpackage.AbstractC0276Pi
    public final void r() {
        int i = 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f);
        valueAnimatorOfFloat.addUpdateListener(new X9(this, i));
        this.r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.e);
        valueAnimatorOfFloat2.addUpdateListener(new X9(this, i));
        this.q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new C3028m0(this, i));
        this.p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    @Override // defpackage.AbstractC0276Pi
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z) {
        if (this.n != z) {
            this.n = z;
            this.r.cancel();
            this.q.start();
        }
    }

    public final void u() {
        if (this.h == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - this.o;
        if (jUptimeMillis < 0 || jUptimeMillis > 300) {
            this.m = false;
        }
        if (this.m) {
            this.m = false;
            return;
        }
        t(!this.n);
        if (!this.n) {
            this.h.dismissDropDown();
        } else {
            this.h.requestFocus();
            this.h.showDropDown();
        }
    }
}
