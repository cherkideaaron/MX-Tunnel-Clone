package defpackage;

/* loaded from: classes2.dex */
public final class Z5 extends AbstractC0067Dd {
    public final String a;
    public final String b;

    public Z5(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0067Dd)) {
            return false;
        }
        AbstractC0067Dd abstractC0067Dd = (AbstractC0067Dd) obj;
        return this.a.equals(((Z5) abstractC0067Dd).a) && this.b.equals(((Z5) abstractC0067Dd).b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutVariant{rolloutId=");
        sb.append(this.a);
        sb.append(", variantId=");
        return AbstractC3264qG.l(sb, this.b, "}");
    }
}
