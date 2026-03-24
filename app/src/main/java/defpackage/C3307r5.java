package defpackage;

/* renamed from: r5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3307r5 extends AbstractC0593ca {
    public final EnumC0539ba a;
    public final B1 b;

    public C3307r5(EnumC0539ba enumC0539ba, B1 b1) {
        this.a = enumC0539ba;
        this.b = b1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0593ca)) {
            return false;
        }
        AbstractC0593ca abstractC0593ca = (AbstractC0593ca) obj;
        EnumC0539ba enumC0539ba = this.a;
        if (enumC0539ba != null ? enumC0539ba.equals(((C3307r5) abstractC0593ca).a) : ((C3307r5) abstractC0593ca).a == null) {
            B1 b1 = this.b;
            C3307r5 c3307r5 = (C3307r5) abstractC0593ca;
            if (b1 == null) {
                if (c3307r5.b == null) {
                    return true;
                }
            } else if (b1.equals(c3307r5.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        EnumC0539ba enumC0539ba = this.a;
        int iHashCode = ((enumC0539ba == null ? 0 : enumC0539ba.hashCode()) ^ 1000003) * 1000003;
        B1 b1 = this.b;
        return (b1 != null ? b1.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.a + ", androidClientInfo=" + this.b + "}";
    }
}
