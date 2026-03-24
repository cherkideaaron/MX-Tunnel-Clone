package defpackage;

/* loaded from: classes2.dex */
public final class NE {
    public final String a;
    public final String b;
    public final int c;
    public final long d;
    public final C0170Je e;
    public final String f;
    public final String g;

    public NE(String str, String str2, int i, long j, C0170Je c0170Je, String str3, String str4) {
        AbstractC0500aq.m(str, "sessionId");
        AbstractC0500aq.m(str2, "firstSessionId");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
        this.e = c0170Je;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NE)) {
            return false;
        }
        NE ne = (NE) obj;
        return AbstractC0500aq.b(this.a, ne.a) && AbstractC0500aq.b(this.b, ne.b) && this.c == ne.c && this.d == ne.d && AbstractC0500aq.b(this.e, ne.e) && AbstractC0500aq.b(this.f, ne.f) && AbstractC0500aq.b(this.g, ne.g);
    }

    public final int hashCode() {
        int iHashCode = (((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + this.c) * 31;
        long j = this.d;
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.a + ", firstSessionId=" + this.b + ", sessionIndex=" + this.c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.e + ", firebaseInstallationId=" + this.f + ", firebaseAuthenticationToken=" + this.g + ')';
    }
}
