package defpackage;

/* renamed from: y6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3686y6 {
    public static final /* synthetic */ int h = 0;
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;

    static {
        C3632x6 c3632x6 = new C3632x6();
        c3632x6.f = 0L;
        c3632x6.h = (byte) (c3632x6.h | 2);
        c3632x6.b(1);
        c3632x6.e = 0L;
        c3632x6.h = (byte) (c3632x6.h | 1);
        c3632x6.a();
    }

    public C3686y6(String str, int i, String str2, String str3, long j, long j2, String str4) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = j;
        this.f = j2;
        this.g = str4;
    }

    public final C3632x6 a() {
        C3632x6 c3632x6 = new C3632x6();
        c3632x6.a = this.a;
        c3632x6.b = this.b;
        c3632x6.c = this.c;
        c3632x6.d = this.d;
        c3632x6.e = this.e;
        c3632x6.f = this.f;
        c3632x6.g = this.g;
        c3632x6.h = (byte) 3;
        return c3632x6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3686y6)) {
            return false;
        }
        C3686y6 c3686y6 = (C3686y6) obj;
        String str = this.a;
        if (str != null ? str.equals(c3686y6.a) : c3686y6.a == null) {
            if (AbstractC3264qG.a(this.b, c3686y6.b)) {
                String str2 = c3686y6.c;
                String str3 = this.c;
                if (str3 != null ? str3.equals(str2) : str2 == null) {
                    String str4 = c3686y6.d;
                    String str5 = this.d;
                    if (str5 != null ? str5.equals(str4) : str4 == null) {
                        if (this.e == c3686y6.e && this.f == c3686y6.f) {
                            String str6 = c3686y6.g;
                            String str7 = this.g;
                            if (str7 == null) {
                                if (str6 == null) {
                                    return true;
                                }
                            } else if (str7.equals(str6)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ AbstractC3264qG.A(this.b)) * 1000003;
        String str2 = this.c;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.e;
        int i = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.g;
        return (str4 != null ? str4.hashCode() : 0) ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.a);
        sb.append(", registrationStatus=");
        sb.append(Vs.C(this.b));
        sb.append(", authToken=");
        sb.append(this.c);
        sb.append(", refreshToken=");
        sb.append(this.d);
        sb.append(", expiresInSecs=");
        sb.append(this.e);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f);
        sb.append(", fisError=");
        return AbstractC3264qG.l(sb, this.g, "}");
    }
}
