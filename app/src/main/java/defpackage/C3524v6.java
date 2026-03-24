package defpackage;

/* renamed from: v6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3524v6 extends AbstractC2858iw {
    public final EnumC2805hw a;
    public final EnumC2750gw b;

    public C3524v6(EnumC2805hw enumC2805hw, EnumC2750gw enumC2750gw) {
        this.a = enumC2805hw;
        this.b = enumC2750gw;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2858iw)) {
            return false;
        }
        AbstractC2858iw abstractC2858iw = (AbstractC2858iw) obj;
        EnumC2805hw enumC2805hw = this.a;
        if (enumC2805hw != null ? enumC2805hw.equals(((C3524v6) abstractC2858iw).a) : ((C3524v6) abstractC2858iw).a == null) {
            EnumC2750gw enumC2750gw = this.b;
            C3524v6 c3524v6 = (C3524v6) abstractC2858iw;
            if (enumC2750gw == null) {
                if (c3524v6.b == null) {
                    return true;
                }
            } else if (enumC2750gw.equals(c3524v6.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        EnumC2805hw enumC2805hw = this.a;
        int iHashCode = ((enumC2805hw == null ? 0 : enumC2805hw.hashCode()) ^ 1000003) * 1000003;
        EnumC2750gw enumC2750gw = this.b;
        return (enumC2750gw != null ? enumC2750gw.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
