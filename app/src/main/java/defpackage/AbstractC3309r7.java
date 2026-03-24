package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.mxtunnel.pro.R;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: r7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3309r7 {
    public final int a;
    public final int b;
    public final int c;
    public final TimeInterpolator d;
    public final TimeInterpolator e;
    public final TimeInterpolator f;
    public final ViewGroup g;
    public final Context h;
    public final AbstractC3255q7 i;
    public final InterfaceC3278qc j;
    public int k;
    public final RunnableC3035m7 l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public final AccessibilityManager s;
    public final C3145o7 t = new C3145o7(this);
    public static final C0294Qj u = S1.b;
    public static final LinearInterpolator v = S1.a;
    public static final C0294Qj w = S1.d;
    public static final int[] y = {R.attr.snackbarStyle};
    public static final String z = AbstractC3309r7.class.getSimpleName();
    public static final Handler x = new Handler(Looper.getMainLooper(), new C2980l7());

    public AbstractC3309r7(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        int i = 0;
        this.l = new RunnableC3035m7(this, i);
        if (snackbarContentLayout == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (snackbarContentLayout2 == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.g = viewGroup;
        this.j = snackbarContentLayout2;
        this.h = context;
        AbstractC3279qd.n(context, AbstractC3279qd.r, "Theme.AppCompat");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(y);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        AbstractC3255q7 abstractC3255q7 = (AbstractC3255q7) layoutInflaterFrom.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
        this.i = abstractC3255q7;
        abstractC3255q7.setBaseTransientBottomBar(this);
        float actionTextColorAlpha = abstractC3255q7.getActionTextColorAlpha();
        if (actionTextColorAlpha != 1.0f) {
            snackbarContentLayout.b.setTextColor(AbstractC0500aq.P(AbstractC0500aq.C(snackbarContentLayout, R.attr.colorSurface), snackbarContentLayout.b.getCurrentTextColor(), actionTextColorAlpha));
        }
        snackbarContentLayout.setMaxInlineActionWidth(abstractC3255q7.getMaxInlineActionWidth());
        abstractC3255q7.addView(snackbarContentLayout);
        abstractC3255q7.setAccessibilityLiveRegion(1);
        abstractC3255q7.setImportantForAccessibility(1);
        abstractC3255q7.setFitsSystemWindows(true);
        C2524cp c2524cp = new C2524cp(this, 6);
        WeakHashMap weakHashMap = UL.a;
        ML.k(abstractC3255q7, c2524cp);
        UL.l(abstractC3255q7, new C3090n7(this, i));
        this.s = (AccessibilityManager) context.getSystemService("accessibility");
        this.c = AbstractC0069Df.U(context, R.attr.motionDurationLong2, 250);
        this.a = AbstractC0069Df.U(context, R.attr.motionDurationLong2, 150);
        this.b = AbstractC0069Df.U(context, R.attr.motionDurationMedium1, 75);
        this.d = AbstractC0069Df.V(context, R.attr.motionEasingEmphasizedInterpolator, v);
        this.f = AbstractC0069Df.V(context, R.attr.motionEasingEmphasizedInterpolator, w);
        this.e = AbstractC0069Df.V(context, R.attr.motionEasingEmphasizedInterpolator, u);
    }

    public final void a(int i) {
        C2879jG c2879jG;
        C3532vE c3532vED = C3532vE.d();
        C3145o7 c3145o7 = this.t;
        synchronized (c3532vED.a) {
            try {
                if (c3532vED.i(c3145o7)) {
                    c2879jG = (C2879jG) c3532vED.c;
                } else {
                    C2879jG c2879jG2 = (C2879jG) c3532vED.d;
                    if (c2879jG2 != null && c3145o7 != null && c2879jG2.a.get() == c3145o7) {
                        c2879jG = (C2879jG) c3532vED.d;
                    }
                }
                c3532vED.a(c2879jG, i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z2;
        C2879jG c2879jG;
        C3532vE c3532vED = C3532vE.d();
        C3145o7 c3145o7 = this.t;
        synchronized (c3532vED.a) {
            z2 = c3532vED.i(c3145o7) || !((c2879jG = (C2879jG) c3532vED.d) == null || c3145o7 == null || c2879jG.a.get() != c3145o7);
        }
        return z2;
    }

    public final void c() {
        C3532vE c3532vED = C3532vE.d();
        C3145o7 c3145o7 = this.t;
        synchronized (c3532vED.a) {
            try {
                if (c3532vED.i(c3145o7)) {
                    c3532vED.c = null;
                    if (((C2879jG) c3532vED.d) != null) {
                        c3532vED.n();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ViewParent parent = this.i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.i);
        }
    }

    public final void d() {
        C3532vE c3532vED = C3532vE.d();
        C3145o7 c3145o7 = this.t;
        synchronized (c3532vED.a) {
            try {
                if (c3532vED.i(c3145o7)) {
                    c3532vED.l((C2879jG) c3532vED.c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z2 = true;
        AccessibilityManager accessibilityManager = this.s;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z2 = false;
        }
        AbstractC3255q7 abstractC3255q7 = this.i;
        if (z2) {
            abstractC3255q7.post(new RunnableC3035m7(this, 2));
            return;
        }
        if (abstractC3255q7.getParent() != null) {
            abstractC3255q7.setVisibility(0);
        }
        d();
    }

    public final void f() {
        AbstractC3255q7 abstractC3255q7 = this.i;
        ViewGroup.LayoutParams layoutParams = abstractC3255q7.getLayoutParams();
        boolean z2 = layoutParams instanceof ViewGroup.MarginLayoutParams;
        String str = z;
        if (!z2) {
            Log.w(str, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (abstractC3255q7.p == null) {
            Log.w(str, "Unable to update margins because original view margins are not set");
            return;
        }
        if (abstractC3255q7.getParent() == null) {
            return;
        }
        int i = this.m;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = abstractC3255q7.p;
        int i2 = rect.bottom + i;
        int i3 = rect.left + this.n;
        int i4 = rect.right + this.o;
        int i5 = rect.top;
        boolean z3 = (marginLayoutParams.bottomMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4 && marginLayoutParams.topMargin == i5) ? false : true;
        if (z3) {
            marginLayoutParams.bottomMargin = i2;
            marginLayoutParams.leftMargin = i3;
            marginLayoutParams.rightMargin = i4;
            marginLayoutParams.topMargin = i5;
            abstractC3255q7.requestLayout();
        }
        if ((z3 || this.q != this.p) && Build.VERSION.SDK_INT >= 29 && this.p > 0) {
            ViewGroup.LayoutParams layoutParams2 = abstractC3255q7.getLayoutParams();
            if ((layoutParams2 instanceof C0049Cc) && (((C0049Cc) layoutParams2).a instanceof SwipeDismissBehavior)) {
                RunnableC3035m7 runnableC3035m7 = this.l;
                abstractC3255q7.removeCallbacks(runnableC3035m7);
                abstractC3255q7.post(runnableC3035m7);
            }
        }
    }
}
