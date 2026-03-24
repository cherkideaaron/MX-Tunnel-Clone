package defpackage;

/* loaded from: classes2.dex */
public final class E6 {
    public final F6 a;
    public final H6 b;
    public final G6 c;

    public E6(F6 f6, H6 h6, G6 g6) {
        this.a = f6;
        this.b = h6;
        this.c = g6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof E6)) {
            return false;
        }
        E6 e6 = (E6) obj;
        return this.a.equals(e6.a) && this.b.equals(e6.b) && this.c.equals(e6.c);
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.a + ", osData=" + this.b + ", deviceData=" + this.c + "}";
    }
}
