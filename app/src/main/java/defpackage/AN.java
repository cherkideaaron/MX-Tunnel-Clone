package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class AN {
    public static final AN b;
    public final C3703yN a;

    static {
        b = Build.VERSION.SDK_INT >= 30 ? C3649xN.q : C3703yN.b;
    }

    public AN() {
        this.a = new C3703yN(this);
    }

    public static C0130Gp e(C0130Gp c0130Gp, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, c0130Gp.a - i);
        int iMax2 = Math.max(0, c0130Gp.b - i2);
        int iMax3 = Math.max(0, c0130Gp.c - i3);
        int iMax4 = Math.max(0, c0130Gp.d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? c0130Gp : C0130Gp.b(iMax, iMax2, iMax3, iMax4);
    }

    public static AN g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        AN an = new AN(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = UL.a;
            AN anA = NL.a(view);
            C3703yN c3703yN = an.a;
            c3703yN.p(anA);
            c3703yN.d(view.getRootView());
        }
        return an;
    }

    public final int a() {
        return this.a.j().d;
    }

    public final int b() {
        return this.a.j().a;
    }

    public final int c() {
        return this.a.j().c;
    }

    public final int d() {
        return this.a.j().b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AN)) {
            return false;
        }
        return Objects.equals(this.a, ((AN) obj).a);
    }

    public final WindowInsets f() {
        C3703yN c3703yN = this.a;
        if (c3703yN instanceof AbstractC3379sN) {
            return ((AbstractC3379sN) c3703yN).c;
        }
        return null;
    }

    public final int hashCode() {
        C3703yN c3703yN = this.a;
        if (c3703yN == null) {
            return 0;
        }
        return c3703yN.hashCode();
    }

    public AN(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        this.a = i >= 30 ? new C3649xN(this, windowInsets) : i >= 29 ? new C3595wN(this, windowInsets) : i >= 28 ? new C3541vN(this, windowInsets) : new C3433tN(this, windowInsets);
    }
}
