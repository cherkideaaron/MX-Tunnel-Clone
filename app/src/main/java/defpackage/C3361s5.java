package defpackage;

/* renamed from: s5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3361s5 extends AbstractC0268Pa {
    public final AbstractC3716yj a;
    public final EnumC0251Oa b;

    public C3361s5(AbstractC3716yj abstractC3716yj, EnumC0251Oa enumC0251Oa) {
        this.a = abstractC3716yj;
        this.b = enumC0251Oa;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0268Pa)) {
            return false;
        }
        AbstractC0268Pa abstractC0268Pa = (AbstractC0268Pa) obj;
        AbstractC3716yj abstractC3716yj = this.a;
        if (abstractC3716yj != null ? abstractC3716yj.equals(((C3361s5) abstractC0268Pa).a) : ((C3361s5) abstractC0268Pa).a == null) {
            EnumC0251Oa enumC0251Oa = this.b;
            C3361s5 c3361s5 = (C3361s5) abstractC0268Pa;
            if (enumC0251Oa == null) {
                if (c3361s5.b == null) {
                    return true;
                }
            } else if (enumC0251Oa.equals(c3361s5.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        AbstractC3716yj abstractC3716yj = this.a;
        int iHashCode = ((abstractC3716yj == null ? 0 : abstractC3716yj.hashCode()) ^ 1000003) * 1000003;
        EnumC0251Oa enumC0251Oa = this.b;
        return (enumC0251Oa != null ? enumC0251Oa.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.a + ", productIdOrigin=" + this.b + "}";
    }
}
