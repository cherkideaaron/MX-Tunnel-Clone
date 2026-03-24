package defpackage;

/* renamed from: o9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3147o9 extends AbstractC3037m9 {
    static {
        new C3147o9((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3147o9) {
            char c = this.a;
            char c2 = this.b;
            if (AbstractC0500aq.o(c, c2) > 0) {
                C3147o9 c3147o9 = (C3147o9) obj;
                if (AbstractC0500aq.o(c3147o9.a, c3147o9.b) <= 0) {
                }
                return true;
            }
            C3147o9 c3147o92 = (C3147o9) obj;
            if (c == c3147o92.a && c2 == c3147o92.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        char c = this.a;
        char c2 = this.b;
        if (AbstractC0500aq.o(c, c2) > 0) {
            return -1;
        }
        return (c * 31) + c2;
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
