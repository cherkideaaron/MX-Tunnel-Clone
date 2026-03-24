package defpackage;

/* renamed from: f6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2651f6 {
    public final Object a;
    public final Bz b;
    public final C3740z6 c;

    public C2651f6(Object obj, Bz bz, C3740z6 c3740z6) {
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.a = obj;
        this.b = bz;
        this.c = c3740z6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2651f6)) {
            return false;
        }
        C2651f6 c2651f6 = (C2651f6) obj;
        c2651f6.getClass();
        if (this.a.equals(c2651f6.a) && this.b.equals(c2651f6.b)) {
            C3740z6 c3740z6 = c2651f6.c;
            C3740z6 c3740z62 = this.c;
            if (c3740z62 == null) {
                if (c3740z6 == null) {
                    return true;
                }
            } else if (c3740z62.equals(c3740z6)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((1000003 * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003;
        C3740z6 c3740z6 = this.c;
        return (iHashCode ^ (c3740z6 == null ? 0 : c3740z6.hashCode())) * 1000003;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.a + ", priority=" + this.b + ", productData=" + this.c + ", eventContext=null}";
    }
}
