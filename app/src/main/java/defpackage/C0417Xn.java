package defpackage;

/* renamed from: Xn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0417Xn {
    public final String a;
    public final boolean b;

    public C0417Xn(String str, boolean z) {
        AbstractC0500aq.m(str, "adsSdkName");
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0417Xn)) {
            return false;
        }
        C0417Xn c0417Xn = (C0417Xn) obj;
        return AbstractC0500aq.b(this.a, c0417Xn.a) && this.b == c0417Xn.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.a + ", shouldRecordObservation=" + this.b;
    }
}
