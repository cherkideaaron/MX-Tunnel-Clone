package defpackage;

/* renamed from: l6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2979l6 extends AbstractC3716yj {
    public final AbstractC3662xj a;

    public C2979l6(AbstractC3662xj abstractC3662xj) {
        this.a = abstractC3662xj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3716yj)) {
            return false;
        }
        AbstractC3716yj abstractC3716yj = (AbstractC3716yj) obj;
        AbstractC3662xj abstractC3662xj = this.a;
        return abstractC3662xj == null ? ((C2979l6) abstractC3716yj).a == null : abstractC3662xj.equals(((C2979l6) abstractC3716yj).a);
    }

    public final int hashCode() {
        AbstractC3662xj abstractC3662xj = this.a;
        return (abstractC3662xj == null ? 0 : abstractC3662xj.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.a + "}";
    }
}
