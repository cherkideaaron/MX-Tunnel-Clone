package defpackage;

/* loaded from: classes2.dex */
public final class O3 {
    public final String a;
    public final String b;
    public final String c;
    public final A1 d;

    public O3(String str, String str2, String str3, A1 a1) {
        EnumC2692ft enumC2692ft = EnumC2692ft.b;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = a1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O3)) {
            return false;
        }
        O3 o3 = (O3) obj;
        if (!AbstractC0500aq.b(this.a, o3.a) || !AbstractC0500aq.b(this.b, o3.b) || !AbstractC0500aq.b("3.0.4", "3.0.4") || !AbstractC0500aq.b(this.c, o3.c)) {
            return false;
        }
        EnumC2692ft enumC2692ft = EnumC2692ft.b;
        return AbstractC0500aq.b(this.d, o3.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((EnumC2692ft.b.hashCode() + ((this.c.hashCode() + ((((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + 48517563) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.a + ", deviceModel=" + this.b + ", sessionSdkVersion=3.0.4, osVersion=" + this.c + ", logEnvironment=" + EnumC2692ft.b + ", androidAppInfo=" + this.d + ')';
    }
}
