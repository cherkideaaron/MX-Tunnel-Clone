package defpackage;

/* renamed from: bl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0550bl {
    public final Tv a;
    public C0487ad b = null;

    public C0550bl(Vv vv) {
        this.a = vv;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0550bl)) {
            return false;
        }
        C0550bl c0550bl = (C0550bl) obj;
        return AbstractC0500aq.b(this.a, c0550bl.a) && AbstractC0500aq.b(this.b, c0550bl.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        C0487ad c0487ad = this.b;
        return iHashCode + (c0487ad == null ? 0 : c0487ad.hashCode());
    }

    public final String toString() {
        return "Dependency(mutex=" + this.a + ", subscriber=" + this.b + ')';
    }
}
