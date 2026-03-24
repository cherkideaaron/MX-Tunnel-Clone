package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.mxtunnel.pro.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* renamed from: t2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3412t2 implements Uw, Ou {
    public final /* synthetic */ F2 a;

    public /* synthetic */ C3412t2(F2 f2) {
        this.a = f2;
    }

    @Override // defpackage.Ou
    public void a(MenuC3511uu menuC3511uu, boolean z) {
        E2 e2;
        MenuC3511uu menuC3511uuK = menuC3511uu.k();
        int i = 0;
        boolean z2 = menuC3511uuK != menuC3511uu;
        if (z2) {
            menuC3511uu = menuC3511uuK;
        }
        F2 f2 = this.a;
        E2[] e2Arr = f2.R;
        int length = e2Arr != null ? e2Arr.length : 0;
        while (true) {
            if (i < length) {
                e2 = e2Arr[i];
                if (e2 != null && e2.h == menuC3511uu) {
                    break;
                } else {
                    i++;
                }
            } else {
                e2 = null;
                break;
            }
        }
        if (e2 != null) {
            if (!z2) {
                f2.s(e2, z);
            } else {
                f2.q(e2.a, e2, menuC3511uuK);
                f2.s(e2, true);
            }
        }
    }

    @Override // defpackage.Uw
    public AN j(View view, AN an) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i;
        int i2;
        boolean z;
        AN anB;
        boolean z2;
        boolean z3;
        int iD = an.d();
        F2 f2 = this.a;
        f2.getClass();
        int iD2 = an.d();
        ActionBarContextView actionBarContextView = f2.B;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
            i2 = 8;
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) f2.B.getLayoutParams();
            if (f2.B.isShown()) {
                if (f2.i0 == null) {
                    f2.i0 = new Rect();
                    f2.j0 = new Rect();
                }
                Rect rect = f2.i0;
                Rect rect2 = f2.j0;
                rect.set(an.b(), an.d(), an.c(), an.a());
                ViewGroup viewGroup = f2.G;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z4 = AbstractC3270qM.a;
                    AbstractC3105nM.a(viewGroup, rect, rect2);
                } else {
                    if (!AbstractC3270qM.a) {
                        AbstractC3270qM.a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            AbstractC3270qM.b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                AbstractC3270qM.b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = AbstractC3270qM.b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                        }
                    }
                }
                int i3 = rect.top;
                int i4 = rect.left;
                int i5 = rect.right;
                ViewGroup viewGroup2 = f2.G;
                WeakHashMap weakHashMap = UL.a;
                AN anA = NL.a(viewGroup2);
                int iB = anA == null ? 0 : anA.b();
                int iC = anA == null ? 0 : anA.c();
                if (marginLayoutParams.topMargin == i3 && marginLayoutParams.leftMargin == i4 && marginLayoutParams.rightMargin == i5) {
                    z3 = false;
                } else {
                    marginLayoutParams.topMargin = i3;
                    marginLayoutParams.leftMargin = i4;
                    marginLayoutParams.rightMargin = i5;
                    z3 = true;
                }
                Context context = f2.q;
                if (i3 <= 0 || f2.I != null) {
                    i2 = 8;
                    View view2 = f2.I;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i6 = marginLayoutParams2.height;
                        int i7 = marginLayoutParams.topMargin;
                        if (i6 != i7 || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                            marginLayoutParams2.height = i7;
                            marginLayoutParams2.leftMargin = iB;
                            marginLayoutParams2.rightMargin = iC;
                            f2.I.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    f2.I = view3;
                    i2 = 8;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iB;
                    layoutParams.rightMargin = iC;
                    f2.G.addView(f2.I, -1, layoutParams);
                }
                View view4 = f2.I;
                boolean z5 = view4 != null;
                if (z5 && view4.getVisibility() != 0) {
                    View view5 = f2.I;
                    view5.setBackgroundColor(context.getColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? R.color.abc_decor_view_status_guard_light : R.color.abc_decor_view_status_guard));
                }
                if (!f2.N && z5) {
                    iD2 = 0;
                }
                z = z5;
                z2 = z3;
                i = 0;
            } else {
                i2 = 8;
                i = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z = false;
                    z2 = true;
                } else {
                    z2 = false;
                    z = false;
                }
            }
            if (z2) {
                f2.B.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = f2.I;
        if (view6 != null) {
            view6.setVisibility(z ? i : i2);
        }
        if (iD != iD2) {
            int iB2 = an.b();
            int iC2 = an.c();
            int iA = an.a();
            int i8 = Build.VERSION.SDK_INT;
            AbstractC3325rN c3271qN = i8 >= 30 ? new C3271qN(an) : i8 >= 29 ? new C3216pN(an) : new C3161oN(an);
            c3271qN.g(C0130Gp.b(iB2, iD2, iC2, iA));
            anB = c3271qN.b();
        } else {
            anB = an;
        }
        WeakHashMap weakHashMap2 = UL.a;
        WindowInsets windowInsetsF = anB.f();
        if (windowInsetsF == null) {
            return anB;
        }
        WindowInsets windowInsetsB = KL.b(view, windowInsetsF);
        return !windowInsetsB.equals(windowInsetsF) ? AN.g(view, windowInsetsB) : anB;
    }

    @Override // defpackage.Ou
    public boolean q(MenuC3511uu menuC3511uu) {
        Window.Callback callback;
        if (menuC3511uu != menuC3511uu.k()) {
            return true;
        }
        F2 f2 = this.a;
        if (!f2.L || (callback = f2.r.getCallback()) == null || f2.W) {
            return true;
        }
        callback.onMenuOpened(FacebookMediationAdapter.ERROR_MAPPING_NATIVE_ASSETS, menuC3511uu);
        return true;
    }
}
