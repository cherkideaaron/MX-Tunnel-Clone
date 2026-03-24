package defpackage;

/* renamed from: p6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3199p6 {
    public final String a;
    public final long b;
    public final long c;

    public C3199p6(String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3199p6)) {
            return false;
        }
        C3199p6 c3199p6 = (C3199p6) obj;
        return this.a.equals(c3199p6.a) && this.b == c3199p6.b && this.c == c3199p6.c;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        long j2 = this.c;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "InstallationTokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.b + ", tokenCreationTimestamp=" + this.c + "}";
    }
}
