package defpackage;

/* renamed from: hz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2808hz {
    public final String a;
    public final Long b;

    public C2808hz(String str, long j) {
        this.a = str;
        this.b = Long.valueOf(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2808hz)) {
            return false;
        }
        C2808hz c2808hz = (C2808hz) obj;
        if (!this.a.equals(c2808hz.a)) {
            return false;
        }
        Long l = c2808hz.b;
        Long l2 = this.b;
        return l2 != null ? l2.equals(l) : l == null;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }
}
