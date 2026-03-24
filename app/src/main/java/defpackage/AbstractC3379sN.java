package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

/* renamed from: sN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3379sN extends C3703yN {
    public static boolean h = false;
    public static Method i;
    public static Class j;
    public static Field k;
    public static Field l;
    public final WindowInsets c;
    public C0130Gp[] d;
    public C0130Gp e;
    public AN f;
    public C0130Gp g;

    public AbstractC3379sN(AN an, WindowInsets windowInsets) {
        super(an);
        this.e = null;
        this.c = windowInsets;
    }

    private C0130Gp r(int i2, boolean z) {
        C0130Gp c0130GpA = C0130Gp.e;
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                c0130GpA = C0130Gp.a(c0130GpA, s(i3, z));
            }
        }
        return c0130GpA;
    }

    private C0130Gp t() {
        AN an = this.f;
        return an != null ? an.a.h() : C0130Gp.e;
    }

    private C0130Gp u(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!h) {
            v();
        }
        Method method = i;
        if (method != null && j != null && k != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) k.get(l.get(objInvoke));
                if (rect != null) {
                    return C0130Gp.b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    private static void v() throws ClassNotFoundException, SecurityException {
        try {
            i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            j = cls;
            k = cls.getDeclaredField("mVisibleInsets");
            l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            k.setAccessible(true);
            l.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        h = true;
    }

    @Override // defpackage.C3703yN
    public void d(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C0130Gp c0130GpU = u(view);
        if (c0130GpU == null) {
            c0130GpU = C0130Gp.e;
        }
        w(c0130GpU);
    }

    @Override // defpackage.C3703yN
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.g, ((AbstractC3379sN) obj).g);
        }
        return false;
    }

    @Override // defpackage.C3703yN
    public C0130Gp f(int i2) {
        return r(i2, false);
    }

    @Override // defpackage.C3703yN
    public final C0130Gp j() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = C0130Gp.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // defpackage.C3703yN
    public AN l(int i2, int i3, int i4, int i5) {
        AN anG = AN.g(null, this.c);
        int i6 = Build.VERSION.SDK_INT;
        AbstractC3325rN c3271qN = i6 >= 30 ? new C3271qN(anG) : i6 >= 29 ? new C3216pN(anG) : new C3161oN(anG);
        c3271qN.g(AN.e(j(), i2, i3, i4, i5));
        c3271qN.e(AN.e(h(), i2, i3, i4, i5));
        return c3271qN.b();
    }

    @Override // defpackage.C3703yN
    public boolean n() {
        return this.c.isRound();
    }

    @Override // defpackage.C3703yN
    public void o(C0130Gp[] c0130GpArr) {
        this.d = c0130GpArr;
    }

    @Override // defpackage.C3703yN
    public void p(AN an) {
        this.f = an;
    }

    public C0130Gp s(int i2, boolean z) {
        C0130Gp c0130GpH;
        int i3;
        if (i2 == 1) {
            return z ? C0130Gp.b(0, Math.max(t().b, j().b), 0, 0) : C0130Gp.b(0, j().b, 0, 0);
        }
        if (i2 == 2) {
            if (z) {
                C0130Gp c0130GpT = t();
                C0130Gp c0130GpH2 = h();
                return C0130Gp.b(Math.max(c0130GpT.a, c0130GpH2.a), 0, Math.max(c0130GpT.c, c0130GpH2.c), Math.max(c0130GpT.d, c0130GpH2.d));
            }
            C0130Gp c0130GpJ = j();
            AN an = this.f;
            c0130GpH = an != null ? an.a.h() : null;
            int iMin = c0130GpJ.d;
            if (c0130GpH != null) {
                iMin = Math.min(iMin, c0130GpH.d);
            }
            return C0130Gp.b(c0130GpJ.a, 0, c0130GpJ.c, iMin);
        }
        C0130Gp c0130Gp = C0130Gp.e;
        if (i2 == 8) {
            C0130Gp[] c0130GpArr = this.d;
            c0130GpH = c0130GpArr != null ? c0130GpArr[TP.a(8)] : null;
            if (c0130GpH != null) {
                return c0130GpH;
            }
            C0130Gp c0130GpJ2 = j();
            C0130Gp c0130GpT2 = t();
            int i4 = c0130GpJ2.d;
            if (i4 > c0130GpT2.d) {
                return C0130Gp.b(0, 0, 0, i4);
            }
            C0130Gp c0130Gp2 = this.g;
            return (c0130Gp2 == null || c0130Gp2.equals(c0130Gp) || (i3 = this.g.d) <= c0130GpT2.d) ? c0130Gp : C0130Gp.b(0, 0, 0, i3);
        }
        if (i2 == 16) {
            return i();
        }
        if (i2 == 32) {
            return g();
        }
        if (i2 == 64) {
            return k();
        }
        if (i2 != 128) {
            return c0130Gp;
        }
        AN an2 = this.f;
        C2571dh c2571dhE = an2 != null ? an2.a.e() : e();
        if (c2571dhE == null) {
            return c0130Gp;
        }
        int i5 = Build.VERSION.SDK_INT;
        return C0130Gp.b(i5 >= 28 ? AbstractC2897jg.g(c2571dhE.a) : 0, i5 >= 28 ? AbstractC2897jg.i(c2571dhE.a) : 0, i5 >= 28 ? AbstractC2897jg.h(c2571dhE.a) : 0, i5 >= 28 ? AbstractC2897jg.f(c2571dhE.a) : 0);
    }

    public void w(C0130Gp c0130Gp) {
        this.g = c0130Gp;
    }
}
