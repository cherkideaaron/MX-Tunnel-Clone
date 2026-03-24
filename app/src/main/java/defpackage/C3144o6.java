package defpackage;

/* renamed from: o6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3144o6 {
    public final String a;
    public final String b;
    public final String c;
    public final I6 d;
    public final int e;

    public C3144o6(String str, String str2, String str3, I6 i6, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i6;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3144o6)) {
            return false;
        }
        C3144o6 c3144o6 = (C3144o6) obj;
        String str = this.a;
        if (str != null ? str.equals(c3144o6.a) : c3144o6.a == null) {
            String str2 = this.b;
            if (str2 != null ? str2.equals(c3144o6.b) : c3144o6.b == null) {
                String str3 = this.c;
                if (str3 != null ? str3.equals(c3144o6.c) : c3144o6.c == null) {
                    I6 i6 = this.d;
                    if (i6 != null ? i6.equals(c3144o6.d) : c3144o6.d == null) {
                        int i = this.e;
                        if (i == 0) {
                            if (c3144o6.e == 0) {
                                return true;
                            }
                        } else if (AbstractC3264qG.a(i, c3144o6.e)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        I6 i6 = this.d;
        int iHashCode4 = (iHashCode3 ^ (i6 == null ? 0 : i6.hashCode())) * 1000003;
        int i = this.e;
        return (i != 0 ? AbstractC3264qG.A(i) : 0) ^ iHashCode4;
    }

    public final String toString() {
        return "InstallationResponse{uri=" + this.a + ", fid=" + this.b + ", refreshToken=" + this.c + ", authToken=" + this.d + ", responseCode=" + AbstractC3264qG.E(this.e) + "}";
    }
}
