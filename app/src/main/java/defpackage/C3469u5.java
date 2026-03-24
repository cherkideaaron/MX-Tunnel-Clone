package defpackage;

/* renamed from: u5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3469u5 extends AbstractC0186Kd {
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final AbstractC0169Jd k;
    public final AbstractC3224pd l;
    public final AbstractC3059md m;

    public C3469u5(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, AbstractC0169Jd abstractC0169Jd, AbstractC3224pd abstractC3224pd, AbstractC3059md abstractC3059md) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = abstractC0169Jd;
        this.l = abstractC3224pd;
        this.m = abstractC3059md;
    }

    @Override // defpackage.AbstractC0186Kd
    public final C3415t5 a() {
        C3415t5 c3415t5 = new C3415t5();
        c3415t5.a = this.b;
        c3415t5.b = this.c;
        c3415t5.c = this.d;
        c3415t5.d = this.e;
        c3415t5.e = this.f;
        c3415t5.f = this.g;
        c3415t5.g = this.h;
        c3415t5.h = this.i;
        c3415t5.i = this.j;
        c3415t5.j = this.k;
        c3415t5.k = this.l;
        c3415t5.l = this.m;
        c3415t5.m = (byte) 1;
        return c3415t5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0186Kd)) {
            return false;
        }
        AbstractC0186Kd abstractC0186Kd = (AbstractC0186Kd) obj;
        if (this.b.equals(((C3469u5) abstractC0186Kd).b)) {
            C3469u5 c3469u5 = (C3469u5) abstractC0186Kd;
            if (this.c.equals(c3469u5.c) && this.d == c3469u5.d && this.e.equals(c3469u5.e)) {
                String str = c3469u5.f;
                String str2 = this.f;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = c3469u5.g;
                    String str4 = this.g;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = c3469u5.h;
                        String str6 = this.h;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            if (this.i.equals(c3469u5.i) && this.j.equals(c3469u5.j)) {
                                AbstractC0169Jd abstractC0169Jd = c3469u5.k;
                                AbstractC0169Jd abstractC0169Jd2 = this.k;
                                if (abstractC0169Jd2 != null ? abstractC0169Jd2.equals(abstractC0169Jd) : abstractC0169Jd == null) {
                                    AbstractC3224pd abstractC3224pd = c3469u5.l;
                                    AbstractC3224pd abstractC3224pd2 = this.l;
                                    if (abstractC3224pd2 != null ? abstractC3224pd2.equals(abstractC3224pd) : abstractC3224pd == null) {
                                        AbstractC3059md abstractC3059md = c3469u5.m;
                                        AbstractC3059md abstractC3059md2 = this.m;
                                        if (abstractC3059md2 == null) {
                                            if (abstractC3059md == null) {
                                                return true;
                                            }
                                        } else if (abstractC3059md2.equals(abstractC3059md)) {
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
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        String str = this.f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
        AbstractC0169Jd abstractC0169Jd = this.k;
        int iHashCode5 = (iHashCode4 ^ (abstractC0169Jd == null ? 0 : abstractC0169Jd.hashCode())) * 1000003;
        AbstractC3224pd abstractC3224pd = this.l;
        int iHashCode6 = (iHashCode5 ^ (abstractC3224pd == null ? 0 : abstractC3224pd.hashCode())) * 1000003;
        AbstractC3059md abstractC3059md = this.m;
        return iHashCode6 ^ (abstractC3059md != null ? abstractC3059md.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f + ", firebaseAuthenticationToken=" + this.g + ", appQualitySessionId=" + this.h + ", buildVersion=" + this.i + ", displayVersion=" + this.j + ", session=" + this.k + ", ndkPayload=" + this.l + ", appExitInfo=" + this.m + "}";
    }
}
