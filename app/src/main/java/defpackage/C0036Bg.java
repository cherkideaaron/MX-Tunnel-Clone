package defpackage;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;

/* renamed from: Bg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0036Bg {
    public final KA a;
    public final int b;
    public final int c;

    public C0036Bg(int i, int i2, Class cls) {
        this(KA.a(cls), i, i2);
    }

    public static C0036Bg a(Class cls) {
        return new C0036Bg(0, 1, cls);
    }

    public static C0036Bg b(KA ka) {
        return new C0036Bg(ka, 1, 0);
    }

    public static C0036Bg c(Class cls) {
        return new C0036Bg(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0036Bg)) {
            return false;
        }
        C0036Bg c0036Bg = (C0036Bg) obj;
        return this.a.equals(c0036Bg.a) && this.b == c0036Bg.b && this.c == c0036Bg.c;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i2 = this.c;
        if (i2 == 0) {
            str = DevicePublicKeyStringDef.DIRECT;
        } else if (i2 == 1) {
            str = "provider";
        } else {
            if (i2 != 2) {
                throw new AssertionError(Vs.k(i2, "Unsupported injection: "));
            }
            str = "deferred";
        }
        return AbstractC3264qG.l(sb, str, "}");
    }

    public C0036Bg(KA ka, int i, int i2) {
        AbstractC3279qd.l(ka, "Null dependency anInterface.");
        this.a = ka;
        this.b = i;
        this.c = i2;
    }
}
