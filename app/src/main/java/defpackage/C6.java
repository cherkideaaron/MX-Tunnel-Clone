package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public final class C6 {
    public final long a;
    public final long b;
    public final Set c;

    public C6(long j, long j2, Set set) {
        this.a = j;
        this.b = j2;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6)) {
            return false;
        }
        C6 c6 = (C6) obj;
        return this.a == c6.a && this.b == c6.b && this.c.equals(c6.c);
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.b;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.a + ", maxAllowedDelay=" + this.b + ", flags=" + this.c + "}";
    }
}
