package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: h6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2761h6 {
    public final String a;
    public final Integer b;
    public final C0123Gi c;
    public final long d;
    public final long e;
    public final Map f;
    public final Integer g;
    public final String h;
    public final byte[] i;
    public final byte[] j;

    public C2761h6(String str, Integer num, C0123Gi c0123Gi, long j, long j2, Map map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.a = str;
        this.b = num;
        this.c = c0123Gi;
        this.d = j;
        this.e = j2;
        this.f = map;
        this.g = num2;
        this.h = str2;
        this.i = bArr;
        this.j = bArr2;
    }

    public final String a(String str) {
        String str2 = (String) this.f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final C2706g6 c() {
        C2706g6 c2706g6 = new C2706g6();
        String str = this.a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        c2706g6.a = str;
        c2706g6.b = this.b;
        c2706g6.g = this.g;
        c2706g6.h = this.h;
        c2706g6.i = this.i;
        c2706g6.j = this.j;
        c2706g6.c(this.c);
        c2706g6.d = Long.valueOf(this.d);
        c2706g6.e = Long.valueOf(this.e);
        c2706g6.f = new HashMap(this.f);
        return c2706g6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2761h6)) {
            return false;
        }
        C2761h6 c2761h6 = (C2761h6) obj;
        if (this.a.equals(c2761h6.a)) {
            Integer num = c2761h6.b;
            Integer num2 = this.b;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.c.equals(c2761h6.c) && this.d == c2761h6.d && this.e == c2761h6.e && this.f.equals(c2761h6.f)) {
                    Integer num3 = c2761h6.g;
                    Integer num4 = this.g;
                    if (num4 != null ? num4.equals(num3) : num3 == null) {
                        String str = c2761h6.h;
                        String str2 = this.h;
                        if (str2 != null ? str2.equals(str) : str == null) {
                            if (Arrays.equals(this.i, c2761h6.i) && Arrays.equals(this.j, c2761h6.j)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        int iHashCode3 = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f.hashCode()) * 1000003;
        Integer num2 = this.g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.h;
        return ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.i)) * 1000003) ^ Arrays.hashCode(this.j);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + ", productId=" + this.g + ", pseudonymousId=" + this.h + ", experimentIdsClear=" + Arrays.toString(this.i) + ", experimentIdsEncrypted=" + Arrays.toString(this.j) + "}";
    }
}
