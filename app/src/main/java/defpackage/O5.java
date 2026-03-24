package defpackage;

/* loaded from: classes2.dex */
public final class O5 extends AbstractC3548vd {
    public final String a;
    public final String b;
    public final long c;

    public O5(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3548vd)) {
            return false;
        }
        AbstractC3548vd abstractC3548vd = (AbstractC3548vd) obj;
        if (this.a.equals(((O5) abstractC3548vd).a)) {
            O5 o5 = (O5) abstractC3548vd;
            if (this.b.equals(o5.b) && this.c == o5.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        long j = this.c;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        return "Signal{name=" + this.a + ", code=" + this.b + ", address=" + this.c + "}";
    }
}
