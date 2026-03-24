package defpackage;

/* loaded from: classes2.dex */
public final class A6 extends RC {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;

    public A6(String str, String str2, String str3, String str4, long j) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.b = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.d = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.e = str4;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RC)) {
            return false;
        }
        RC rc = (RC) obj;
        if (this.b.equals(((A6) rc).b)) {
            A6 a6 = (A6) rc;
            if (this.c.equals(a6.c) && this.d.equals(a6.d) && this.e.equals(a6.e) && this.f == a6.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        long j = this.f;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        return "RolloutAssignment{rolloutId=" + this.b + ", parameterKey=" + this.c + ", parameterValue=" + this.d + ", variantId=" + this.e + ", templateVersion=" + this.f + "}";
    }
}
