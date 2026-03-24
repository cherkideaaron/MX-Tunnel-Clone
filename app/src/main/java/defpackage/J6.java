package defpackage;

import android.util.Base64;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class J6 {
    public final String a;
    public final byte[] b;
    public final Bz c;

    public J6(String str, byte[] bArr, Bz bz) {
        this.a = str;
        this.b = bArr;
        this.c = bz;
    }

    public static D3 a() {
        D3 d3 = new D3(3);
        d3.T(Bz.a);
        return d3;
    }

    public final J6 b(Bz bz) {
        D3 d3A = a();
        d3A.S(this.a);
        d3A.T(bz);
        d3A.c = this.b;
        return d3A.h();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof J6)) {
            return false;
        }
        J6 j6 = (J6) obj;
        return this.a.equals(j6.a) && Arrays.equals(this.b, j6.b) && this.c.equals(j6.c);
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.b;
        return "TransportContext(" + this.a + ", " + this.c + ", " + (bArr == null ? "" : Base64.encodeToString(bArr, 2)) + ")";
    }
}
