package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class K5 extends AbstractC0016Ad {
    public final AbstractC3710yd a;
    public final List b;
    public final List c;
    public final Boolean d;
    public final AbstractC3764zd e;
    public final List f;
    public final int g;

    public K5(AbstractC3710yd abstractC3710yd, List list, List list2, Boolean bool, AbstractC3764zd abstractC3764zd, List list3, int i) {
        this.a = abstractC3710yd;
        this.b = list;
        this.c = list2;
        this.d = bool;
        this.e = abstractC3764zd;
        this.f = list3;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        Boolean bool;
        AbstractC3764zd abstractC3764zd;
        List list3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0016Ad)) {
            return false;
        }
        AbstractC0016Ad abstractC0016Ad = (AbstractC0016Ad) obj;
        return this.a.equals(((K5) abstractC0016Ad).a) && ((list = this.b) != null ? list.equals(((K5) abstractC0016Ad).b) : ((K5) abstractC0016Ad).b == null) && ((list2 = this.c) != null ? list2.equals(((K5) abstractC0016Ad).c) : ((K5) abstractC0016Ad).c == null) && ((bool = this.d) != null ? bool.equals(((K5) abstractC0016Ad).d) : ((K5) abstractC0016Ad).d == null) && ((abstractC3764zd = this.e) != null ? abstractC3764zd.equals(((K5) abstractC0016Ad).e) : ((K5) abstractC0016Ad).e == null) && ((list3 = this.f) != null ? list3.equals(((K5) abstractC0016Ad).f) : ((K5) abstractC0016Ad).f == null) && this.g == ((K5) abstractC0016Ad).g;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        List list = this.b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        AbstractC3764zd abstractC3764zd = this.e;
        int iHashCode5 = (iHashCode4 ^ (abstractC3764zd == null ? 0 : abstractC3764zd.hashCode())) * 1000003;
        List list3 = this.f;
        return ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.a);
        sb.append(", customAttributes=");
        sb.append(this.b);
        sb.append(", internalKeys=");
        sb.append(this.c);
        sb.append(", background=");
        sb.append(this.d);
        sb.append(", currentProcessDetails=");
        sb.append(this.e);
        sb.append(", appProcessDetails=");
        sb.append(this.f);
        sb.append(", uiOrientation=");
        return AbstractC3264qG.j(sb, this.g, "}");
    }
}
