package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class D5 extends AbstractC0169Jd {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final Long e;
    public final boolean f;
    public final AbstractC3332rd g;
    public final AbstractC0152Id h;
    public final AbstractC0135Hd i;
    public final AbstractC3386sd j;
    public final List k;
    public final int l;

    public D5(String str, String str2, String str3, long j, Long l, boolean z, AbstractC3332rd abstractC3332rd, AbstractC0152Id abstractC0152Id, AbstractC0135Hd abstractC0135Hd, AbstractC3386sd abstractC3386sd, List list, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = l;
        this.f = z;
        this.g = abstractC3332rd;
        this.h = abstractC0152Id;
        this.i = abstractC0135Hd;
        this.j = abstractC3386sd;
        this.k = list;
        this.l = i;
    }

    @Override // defpackage.AbstractC0169Jd
    public final C5 a() {
        C5 c5 = new C5();
        c5.a = this.a;
        c5.b = this.b;
        c5.c = this.c;
        c5.d = this.d;
        c5.e = this.e;
        c5.f = this.f;
        c5.g = this.g;
        c5.h = this.h;
        c5.i = this.i;
        c5.j = this.j;
        c5.k = this.k;
        c5.l = this.l;
        c5.m = (byte) 7;
        return c5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0169Jd)) {
            return false;
        }
        AbstractC0169Jd abstractC0169Jd = (AbstractC0169Jd) obj;
        if (this.a.equals(((D5) abstractC0169Jd).a)) {
            D5 d5 = (D5) abstractC0169Jd;
            if (this.b.equals(d5.b)) {
                String str = d5.c;
                String str2 = this.c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.d == d5.d) {
                        Long l = d5.e;
                        Long l2 = this.e;
                        if (l2 != null ? l2.equals(l) : l == null) {
                            if (this.f == d5.f && this.g.equals(d5.g)) {
                                AbstractC0152Id abstractC0152Id = d5.h;
                                AbstractC0152Id abstractC0152Id2 = this.h;
                                if (abstractC0152Id2 != null ? abstractC0152Id2.equals(abstractC0152Id) : abstractC0152Id == null) {
                                    AbstractC0135Hd abstractC0135Hd = d5.i;
                                    AbstractC0135Hd abstractC0135Hd2 = this.i;
                                    if (abstractC0135Hd2 != null ? abstractC0135Hd2.equals(abstractC0135Hd) : abstractC0135Hd == null) {
                                        AbstractC3386sd abstractC3386sd = d5.j;
                                        AbstractC3386sd abstractC3386sd2 = this.j;
                                        if (abstractC3386sd2 != null ? abstractC3386sd2.equals(abstractC3386sd) : abstractC3386sd == null) {
                                            List list = d5.k;
                                            List list2 = this.k;
                                            if (list2 != null ? list2.equals(list) : list == null) {
                                                if (this.l == d5.l) {
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j = this.d;
        int i = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        Long l = this.e;
        int iHashCode3 = (((((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g.hashCode()) * 1000003;
        AbstractC0152Id abstractC0152Id = this.h;
        int iHashCode4 = (iHashCode3 ^ (abstractC0152Id == null ? 0 : abstractC0152Id.hashCode())) * 1000003;
        AbstractC0135Hd abstractC0135Hd = this.i;
        int iHashCode5 = (iHashCode4 ^ (abstractC0135Hd == null ? 0 : abstractC0135Hd.hashCode())) * 1000003;
        AbstractC3386sd abstractC3386sd = this.j;
        int iHashCode6 = (iHashCode5 ^ (abstractC3386sd == null ? 0 : abstractC3386sd.hashCode())) * 1000003;
        List list = this.k;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.a);
        sb.append(", identifier=");
        sb.append(this.b);
        sb.append(", appQualitySessionId=");
        sb.append(this.c);
        sb.append(", startedAt=");
        sb.append(this.d);
        sb.append(", endedAt=");
        sb.append(this.e);
        sb.append(", crashed=");
        sb.append(this.f);
        sb.append(", app=");
        sb.append(this.g);
        sb.append(", user=");
        sb.append(this.h);
        sb.append(", os=");
        sb.append(this.i);
        sb.append(", device=");
        sb.append(this.j);
        sb.append(", events=");
        sb.append(this.k);
        sb.append(", generatorType=");
        return AbstractC3264qG.j(sb, this.l, "}");
    }
}
