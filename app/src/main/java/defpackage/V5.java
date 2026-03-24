package defpackage;

/* loaded from: classes2.dex */
public final class V5 extends AbstractC0033Bd {
    public final Double a;
    public final int b;
    public final boolean c;
    public final int d;
    public final long e;
    public final long f;

    public V5(Double d, int i, boolean z, int i2, long j, long j2) {
        this.a = d;
        this.b = i;
        this.c = z;
        this.d = i2;
        this.e = j;
        this.f = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0033Bd)) {
            return false;
        }
        AbstractC0033Bd abstractC0033Bd = (AbstractC0033Bd) obj;
        Double d = this.a;
        if (d != null ? d.equals(((V5) abstractC0033Bd).a) : ((V5) abstractC0033Bd).a == null) {
            if (this.b == ((V5) abstractC0033Bd).b) {
                V5 v5 = (V5) abstractC0033Bd;
                if (this.c == v5.c && this.d == v5.d && this.e == v5.e && this.f == v5.f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Double d = this.a;
        int iHashCode = ((((((((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ this.d) * 1000003;
        long j = this.e;
        long j2 = this.f;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "Device{batteryLevel=" + this.a + ", batteryVelocity=" + this.b + ", proximityOn=" + this.c + ", orientation=" + this.d + ", ramUsed=" + this.e + ", diskUsed=" + this.f + "}";
    }
}
