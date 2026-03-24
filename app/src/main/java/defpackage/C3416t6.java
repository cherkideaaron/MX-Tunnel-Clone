package defpackage;

import java.util.List;

/* renamed from: t6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3416t6 extends AbstractC2965kt {
    public final long a;
    public final long b;
    public final AbstractC0593ca c;
    public final Integer d;
    public final String e;
    public final List f;
    public final IA g;

    public C3416t6(long j, long j2, AbstractC0593ca abstractC0593ca, Integer num, String str, List list, IA ia) {
        this.a = j;
        this.b = j2;
        this.c = abstractC0593ca;
        this.d = num;
        this.e = str;
        this.f = list;
        this.g = ia;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2965kt)) {
            return false;
        }
        AbstractC2965kt abstractC2965kt = (AbstractC2965kt) obj;
        if (this.a == ((C3416t6) abstractC2965kt).a) {
            C3416t6 c3416t6 = (C3416t6) abstractC2965kt;
            if (this.b == c3416t6.b) {
                AbstractC0593ca abstractC0593ca = c3416t6.c;
                AbstractC0593ca abstractC0593ca2 = this.c;
                if (abstractC0593ca2 != null ? abstractC0593ca2.equals(abstractC0593ca) : abstractC0593ca == null) {
                    Integer num = c3416t6.d;
                    Integer num2 = this.d;
                    if (num2 != null ? num2.equals(num) : num == null) {
                        String str = c3416t6.e;
                        String str2 = this.e;
                        if (str2 != null ? str2.equals(str) : str == null) {
                            List list = c3416t6.f;
                            List list2 = this.f;
                            if (list2 != null ? list2.equals(list) : list == null) {
                                IA ia = c3416t6.g;
                                IA ia2 = this.g;
                                if (ia2 == null) {
                                    if (ia == null) {
                                        return true;
                                    }
                                } else if (ia2.equals(ia)) {
                                    return true;
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
        long j = this.a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        AbstractC0593ca abstractC0593ca = this.c;
        int iHashCode = (i ^ (abstractC0593ca == null ? 0 : abstractC0593ca.hashCode())) * 1000003;
        Integer num = this.d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        IA ia = this.g;
        return iHashCode4 ^ (ia != null ? ia.hashCode() : 0);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + this.g + "}";
    }
}
