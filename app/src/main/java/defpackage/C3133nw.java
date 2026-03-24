package defpackage;

import java.math.BigInteger;
import java.util.Locale;

/* renamed from: nw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3133nw implements Comparable {
    public final BigInteger a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public BigInteger e;
    public BigInteger f;

    public C3133nw(C2544d8 c2544d8, boolean z) {
        this.c = z;
        this.a = BigInteger.valueOf((Long.parseLong(c2544d8.c.split("\\.")[0]) << 24) + (Integer.parseInt(r7[1]) << 16) + (Integer.parseInt(r7[2]) << 8) + Integer.parseInt(r7[3]));
        this.b = c2544d8.b;
        this.d = true;
    }

    public final BigInteger a() {
        if (this.e == null) {
            this.e = d(false);
        }
        return this.e;
    }

    public final String b() {
        long jLongValue = this.a.longValue();
        Locale locale = Locale.US;
        StringBuilder sb = new StringBuilder();
        sb.append((jLongValue >> 24) % 256);
        sb.append(".");
        sb.append((jLongValue >> 16) % 256);
        Vs.y(sb, ".", (jLongValue >> 8) % 256, ".");
        sb.append(jLongValue % 256);
        return sb.toString();
    }

    public final BigInteger c() {
        if (this.f == null) {
            this.f = d(true);
        }
        return this.f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C3133nw c3133nw = (C3133nw) obj;
        int iCompareTo = a().compareTo(c3133nw.a());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int i = this.b;
        int i2 = c3133nw.b;
        if (i > i2) {
            return -1;
        }
        return i2 == i ? 0 : 1;
    }

    public final BigInteger d(boolean z) {
        boolean z2 = this.d;
        int i = this.b;
        int i2 = z2 ? 32 - i : 128 - i;
        BigInteger bit = this.a;
        for (int i3 = 0; i3 < i2; i3++) {
            bit = z ? bit.setBit(i3) : bit.clearBit(i3);
        }
        return bit;
    }

    public final C3133nw[] e() {
        BigInteger bigIntegerA = a();
        int i = this.b;
        boolean z = this.c;
        boolean z2 = this.d;
        C3133nw c3133nw = new C3133nw(bigIntegerA, i + 1, z, z2);
        return new C3133nw[]{c3133nw, new C3133nw(c3133nw.c().add(BigInteger.ONE), i + 1, z, z2)};
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3133nw)) {
            return super.equals(obj);
        }
        C3133nw c3133nw = (C3133nw) obj;
        return this.b == c3133nw.b && c3133nw.a().equals(a());
    }

    public final String toString() {
        boolean z = this.d;
        int i = this.b;
        if (z) {
            Locale locale = Locale.US;
            return b() + "/" + i;
        }
        Locale locale2 = Locale.US;
        BigInteger bigIntegerShiftRight = this.a;
        String str = null;
        boolean z2 = true;
        while (bigIntegerShiftRight.compareTo(BigInteger.ZERO) == 1) {
            long jLongValue = bigIntegerShiftRight.mod(BigInteger.valueOf(65536L)).longValue();
            if (str != null || jLongValue != 0) {
                if (str == null && !z2) {
                    str = ":";
                }
                str = z2 ? String.format(Locale.US, "%x", Long.valueOf(jLongValue), str) : String.format(Locale.US, "%x:%s", Long.valueOf(jLongValue), str);
            }
            bigIntegerShiftRight = bigIntegerShiftRight.shiftRight(16);
            z2 = false;
        }
        if (str == null) {
            str = "::";
        }
        return str + "/" + i;
    }

    public C3133nw(BigInteger bigInteger, int i, boolean z, boolean z2) {
        this.a = bigInteger;
        this.b = i;
        this.c = z;
        this.d = z2;
    }
}
