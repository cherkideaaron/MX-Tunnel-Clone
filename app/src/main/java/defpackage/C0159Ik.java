package defpackage;

/* renamed from: Ik, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0159Ik {
    public final String a;
    public final String b;

    public C0159Ik(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0159Ik)) {
            return false;
        }
        C0159Ik c0159Ik = (C0159Ik) obj;
        return AbstractC0500aq.b(this.a, c0159Ik.a) && AbstractC0500aq.b(this.b, c0159Ik.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "FirebaseInstallationId(fid=" + this.a + ", authToken=" + this.b + ')';
    }
}
