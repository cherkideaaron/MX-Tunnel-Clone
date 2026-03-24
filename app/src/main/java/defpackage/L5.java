package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class L5 extends AbstractC3710yd {
    public final List a;
    public final AbstractC3494ud b;
    public final AbstractC3059md c;
    public final AbstractC3548vd d;
    public final List e;

    public L5(List list, AbstractC3494ud abstractC3494ud, AbstractC3059md abstractC3059md, AbstractC3548vd abstractC3548vd, List list2) {
        this.a = list;
        this.b = abstractC3494ud;
        this.c = abstractC3059md;
        this.d = abstractC3548vd;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3710yd)) {
            return false;
        }
        AbstractC3710yd abstractC3710yd = (AbstractC3710yd) obj;
        List list = this.a;
        if (list != null ? list.equals(((L5) abstractC3710yd).a) : ((L5) abstractC3710yd).a == null) {
            AbstractC3494ud abstractC3494ud = this.b;
            if (abstractC3494ud != null ? abstractC3494ud.equals(((L5) abstractC3710yd).b) : ((L5) abstractC3710yd).b == null) {
                AbstractC3059md abstractC3059md = this.c;
                if (abstractC3059md != null ? abstractC3059md.equals(((L5) abstractC3710yd).c) : ((L5) abstractC3710yd).c == null) {
                    if (this.d.equals(((L5) abstractC3710yd).d) && this.e.equals(((L5) abstractC3710yd).e)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        List list = this.a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        AbstractC3494ud abstractC3494ud = this.b;
        int iHashCode2 = (iHashCode ^ (abstractC3494ud == null ? 0 : abstractC3494ud.hashCode())) * 1000003;
        AbstractC3059md abstractC3059md = this.c;
        return (((((abstractC3059md != null ? abstractC3059md.hashCode() : 0) ^ iHashCode2) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.a + ", exception=" + this.b + ", appExitInfo=" + this.c + ", signal=" + this.d + ", binaries=" + this.e + "}";
    }
}
