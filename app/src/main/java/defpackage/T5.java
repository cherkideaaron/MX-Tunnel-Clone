package defpackage;

/* loaded from: classes2.dex */
public final class T5 extends AbstractC3764zd {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    public T5(String str, int i, int i2, boolean z) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3764zd)) {
            return false;
        }
        AbstractC3764zd abstractC3764zd = (AbstractC3764zd) obj;
        if (this.a.equals(((T5) abstractC3764zd).a)) {
            T5 t5 = (T5) abstractC3764zd;
            if (this.b == t5.b && this.c == t5.c && this.d == t5.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.a + ", pid=" + this.b + ", importance=" + this.c + ", defaultProcess=" + this.d + "}";
    }
}
