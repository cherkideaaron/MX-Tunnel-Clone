package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class A1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Jz e;
    public final List f;

    public A1(String str, String str2, String str3, String str4, Jz jz, ArrayList arrayList) {
        AbstractC0500aq.m(str2, "versionName");
        AbstractC0500aq.m(str3, "appBuildVersion");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = jz;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A1)) {
            return false;
        }
        A1 a1 = (A1) obj;
        return AbstractC0500aq.b(this.a, a1.a) && AbstractC0500aq.b(this.b, a1.b) && AbstractC0500aq.b(this.c, a1.c) && AbstractC0500aq.b(this.d, a1.d) && AbstractC0500aq.b(this.e, a1.e) && AbstractC0500aq.b(this.f, a1.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.a + ", versionName=" + this.b + ", appBuildVersion=" + this.c + ", deviceManufacturer=" + this.d + ", currentProcessDetails=" + this.e + ", appProcessDetails=" + this.f + ')';
    }
}
