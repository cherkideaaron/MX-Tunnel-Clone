package defpackage;

/* loaded from: classes2.dex */
public final class Jz {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    public Jz(String str, int i, int i2, boolean z) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Jz)) {
            return false;
        }
        Jz jz = (Jz) obj;
        return AbstractC0500aq.b(this.a, jz.a) && this.b == jz.b && this.c == jz.c && this.d == jz.d;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + (this.d ? 1231 : 1237);
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.a + ", pid=" + this.b + ", importance=" + this.c + ", isDefaultProcess=" + this.d + ')';
    }
}
