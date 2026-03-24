package defpackage;

import android.os.Build;

/* renamed from: fc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2675fc {
    public static final C2675fc i;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int a = 1;
    public long f = -1;
    public long g = -1;
    public C3223pc h = new C3223pc();

    static {
        C3223pc c3223pc = new C3223pc();
        C2675fc c2675fc = new C2675fc();
        c2675fc.a = 1;
        c2675fc.f = -1L;
        c2675fc.g = -1L;
        c2675fc.h = new C3223pc();
        c2675fc.b = false;
        int i2 = Build.VERSION.SDK_INT;
        c2675fc.c = false;
        c2675fc.a = 1;
        c2675fc.d = false;
        c2675fc.e = false;
        if (i2 >= 24) {
            c2675fc.h = c3223pc;
            c2675fc.f = -1L;
            c2675fc.g = -1L;
        }
        i = c2675fc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2675fc.class != obj.getClass()) {
            return false;
        }
        C2675fc c2675fc = (C2675fc) obj;
        if (this.b == c2675fc.b && this.c == c2675fc.c && this.d == c2675fc.d && this.e == c2675fc.e && this.f == c2675fc.f && this.g == c2675fc.g && this.a == c2675fc.a) {
            return this.h.equals(c2675fc.h);
        }
        return false;
    }

    public final int hashCode() {
        int iA = ((((((((AbstractC3264qG.A(this.a) * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31;
        long j = this.f;
        int i2 = (iA + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.g;
        return this.h.a.hashCode() + ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }
}
