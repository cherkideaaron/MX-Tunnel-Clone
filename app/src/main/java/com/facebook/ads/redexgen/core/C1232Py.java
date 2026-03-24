package com.facebook.ads.redexgen.core;

import android.view.WindowInsets;

/* renamed from: com.facebook.ads.redexgen.X.Py, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1232Py {
    public final Object A00;

    public C1232Py(Object obj) {
        this.A00 = obj;
    }

    public static C1232Py A00(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C1232Py(obj);
    }

    public static Object A01(C1232Py c1232Py) {
        if (c1232Py == null) {
            return null;
        }
        return c1232Py.A00;
    }

    public final int A02() {
        return ((WindowInsets) this.A00).getSystemWindowInsetBottom();
    }

    public final int A03() {
        return ((WindowInsets) this.A00).getSystemWindowInsetLeft();
    }

    public final int A04() {
        return ((WindowInsets) this.A00).getSystemWindowInsetRight();
    }

    public final int A05() {
        return ((WindowInsets) this.A00).getSystemWindowInsetTop();
    }

    public final C1232Py A06(int i, int i2, int i3, int i4) {
        return new C1232Py(((WindowInsets) this.A00).replaceSystemWindowInsets(i, i2, i3, i4));
    }

    public final boolean A07() {
        return ((WindowInsets) this.A00).isConsumed();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1232Py c1232Py = (C1232Py) obj;
        return this.A00 == null ? c1232Py.A00 == null : this.A00.equals(c1232Py.A00);
    }

    public final int hashCode() {
        if (this.A00 == null) {
            return 0;
        }
        return this.A00.hashCode();
    }
}
