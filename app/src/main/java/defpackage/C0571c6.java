package defpackage;

/* renamed from: c6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0571c6 extends AbstractC0135Hd {
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;

    public C0571c6(String str, int i, String str2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0135Hd)) {
            return false;
        }
        AbstractC0135Hd abstractC0135Hd = (AbstractC0135Hd) obj;
        if (this.a == ((C0571c6) abstractC0135Hd).a) {
            C0571c6 c0571c6 = (C0571c6) abstractC0135Hd;
            if (this.b.equals(c0571c6.b) && this.c.equals(c0571c6.c) && this.d == c0571c6.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.a + ", version=" + this.b + ", buildVersion=" + this.c + ", jailbroken=" + this.d + "}";
    }
}
