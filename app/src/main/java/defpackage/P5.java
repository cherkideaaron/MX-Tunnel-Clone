package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class P5 extends AbstractC3656xd {
    public final String a;
    public final int b;
    public final List c;

    public P5(String str, int i, List list) {
        this.a = str;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3656xd)) {
            return false;
        }
        AbstractC3656xd abstractC3656xd = (AbstractC3656xd) obj;
        if (this.a.equals(((P5) abstractC3656xd).a)) {
            P5 p5 = (P5) abstractC3656xd;
            if (this.b == p5.b && this.c.equals(p5.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.a + ", importance=" + this.b + ", frames=" + this.c + "}";
    }
}
