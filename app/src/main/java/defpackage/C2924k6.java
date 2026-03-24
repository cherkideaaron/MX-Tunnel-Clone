package defpackage;

/* renamed from: k6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2924k6 extends AbstractC3662xj {
    public final Integer a;

    public C2924k6(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3662xj)) {
            return false;
        }
        AbstractC3662xj abstractC3662xj = (AbstractC3662xj) obj;
        Integer num = this.a;
        return num == null ? ((C2924k6) abstractC3662xj).a == null : num.equals(((C2924k6) abstractC3662xj).a);
    }

    public final int hashCode() {
        Integer num = this.a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.a + "}";
    }
}
