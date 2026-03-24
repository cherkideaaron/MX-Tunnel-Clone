package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class B6 {
    public final VK a;
    public final Map b;

    public B6(VK vk, Map map) {
        if (vk == null) {
            throw new NullPointerException("Null clock");
        }
        this.a = vk;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.b = map;
    }

    public final long a(Bz bz, long j, int i) {
        long jA = j - this.a.a();
        C6 c6 = (C6) this.b.get(bz);
        long j2 = c6.a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i - 1) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * r12))), jA), c6.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B6)) {
            return false;
        }
        B6 b6 = (B6) obj;
        return this.a.equals(b6.a) && this.b.equals(b6.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
