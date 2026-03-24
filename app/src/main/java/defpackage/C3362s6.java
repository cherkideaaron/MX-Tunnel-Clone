package defpackage;

import java.util.Arrays;

/* renamed from: s6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3362s6 extends AbstractC2747gt {
    public final long a;
    public final Integer b;
    public final AbstractC0268Pa c;
    public final long d;
    public final byte[] e;
    public final String f;
    public final long g;
    public final AbstractC2858iw h;
    public final AbstractC3285qj i;

    public C3362s6(long j, Integer num, AbstractC0268Pa abstractC0268Pa, long j2, byte[] bArr, String str, long j3, AbstractC2858iw abstractC2858iw, AbstractC3285qj abstractC3285qj) {
        this.a = j;
        this.b = num;
        this.c = abstractC0268Pa;
        this.d = j2;
        this.e = bArr;
        this.f = str;
        this.g = j3;
        this.h = abstractC2858iw;
        this.i = abstractC3285qj;
    }

    public final boolean equals(Object obj) {
        Integer num;
        AbstractC0268Pa abstractC0268Pa;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2747gt)) {
            return false;
        }
        AbstractC2747gt abstractC2747gt = (AbstractC2747gt) obj;
        if (this.a == ((C3362s6) abstractC2747gt).a && ((num = this.b) != null ? num.equals(((C3362s6) abstractC2747gt).b) : ((C3362s6) abstractC2747gt).b == null) && ((abstractC0268Pa = this.c) != null ? abstractC0268Pa.equals(((C3362s6) abstractC2747gt).c) : ((C3362s6) abstractC2747gt).c == null)) {
            C3362s6 c3362s6 = (C3362s6) abstractC2747gt;
            if (this.d == c3362s6.d) {
                if (Arrays.equals(this.e, abstractC2747gt instanceof C3362s6 ? ((C3362s6) abstractC2747gt).e : c3362s6.e)) {
                    String str = c3362s6.f;
                    String str2 = this.f;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        if (this.g == c3362s6.g) {
                            AbstractC2858iw abstractC2858iw = c3362s6.h;
                            AbstractC2858iw abstractC2858iw2 = this.h;
                            if (abstractC2858iw2 != null ? abstractC2858iw2.equals(abstractC2858iw) : abstractC2858iw == null) {
                                AbstractC3285qj abstractC3285qj = c3362s6.i;
                                AbstractC3285qj abstractC3285qj2 = this.i;
                                if (abstractC3285qj2 == null) {
                                    if (abstractC3285qj == null) {
                                        return true;
                                    }
                                } else if (abstractC3285qj2.equals(abstractC3285qj)) {
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
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        AbstractC0268Pa abstractC0268Pa = this.c;
        int iHashCode2 = (iHashCode ^ (abstractC0268Pa == null ? 0 : abstractC0268Pa.hashCode())) * 1000003;
        long j2 = this.d;
        int iHashCode3 = (((iHashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.e)) * 1000003;
        String str = this.f;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.g;
        int i2 = (iHashCode4 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        AbstractC2858iw abstractC2858iw = this.h;
        int iHashCode5 = (i2 ^ (abstractC2858iw == null ? 0 : abstractC2858iw.hashCode())) * 1000003;
        AbstractC3285qj abstractC3285qj = this.i;
        return iHashCode5 ^ (abstractC3285qj != null ? abstractC3285qj.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", complianceData=" + this.c + ", eventUptimeMs=" + this.d + ", sourceExtension=" + Arrays.toString(this.e) + ", sourceExtensionJsonProto3=" + this.f + ", timezoneOffsetSeconds=" + this.g + ", networkConnectionInfo=" + this.h + ", experimentIds=" + this.i + "}";
    }
}
