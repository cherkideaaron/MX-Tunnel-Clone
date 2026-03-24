package defpackage;

/* renamed from: aP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0481aP {
    public final int a;
    public final long b;

    public C0481aP(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0481aP) {
            C0481aP c0481aP = (C0481aP) obj;
            if (this.a == c0481aP.a && this.b == c0481aP.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        return ((int) ((j >>> 32) ^ j)) ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.a + ", eventTimestamp=" + this.b + "}";
    }
}
