package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class N5 extends AbstractC3494ud {
    public final String a;
    public final String b;
    public final List c;
    public final AbstractC3494ud d;
    public final int e;

    public N5(String str, String str2, List list, AbstractC3494ud abstractC3494ud, int i) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = abstractC3494ud;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3494ud)) {
            return false;
        }
        AbstractC3494ud abstractC3494ud = (AbstractC3494ud) obj;
        if (this.a.equals(((N5) abstractC3494ud).a) && ((str = this.b) != null ? str.equals(((N5) abstractC3494ud).b) : ((N5) abstractC3494ud).b == null)) {
            N5 n5 = (N5) abstractC3494ud;
            if (this.c.equals(n5.c)) {
                AbstractC3494ud abstractC3494ud2 = n5.d;
                AbstractC3494ud abstractC3494ud3 = this.d;
                if (abstractC3494ud3 != null ? abstractC3494ud3.equals(abstractC3494ud2) : abstractC3494ud2 == null) {
                    if (this.e == n5.e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        AbstractC3494ud abstractC3494ud = this.d;
        return ((iHashCode2 ^ (abstractC3494ud != null ? abstractC3494ud.hashCode() : 0)) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.a);
        sb.append(", reason=");
        sb.append(this.b);
        sb.append(", frames=");
        sb.append(this.c);
        sb.append(", causedBy=");
        sb.append(this.d);
        sb.append(", overflowCount=");
        return AbstractC3264qG.j(sb, this.e, "}");
    }
}
