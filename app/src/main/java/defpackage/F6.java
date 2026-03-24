package defpackage;

/* loaded from: classes2.dex */
public final class F6 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final R2 f;

    public F6(String str, String str2, String str3, String str4, int i, R2 r2) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.d = str4;
        this.e = i;
        if (r2 == null) {
            throw new NullPointerException("Null developmentPlatformProvider");
        }
        this.f = r2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F6)) {
            return false;
        }
        F6 f6 = (F6) obj;
        return this.a.equals(f6.a) && this.b.equals(f6.b) && this.c.equals(f6.c) && this.d.equals(f6.d) && this.e == f6.e && this.f.equals(f6.f);
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.a + ", versionCode=" + this.b + ", versionName=" + this.c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f + "}";
    }
}
