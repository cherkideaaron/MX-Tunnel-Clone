package defpackage;

/* renamed from: h1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2756h1 {
    public int a;
    public int b;
    public Object c;
    public int d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2756h1)) {
            return false;
        }
        C2756h1 c2756h1 = (C2756h1) obj;
        int i = this.a;
        if (i != c2756h1.a) {
            return false;
        }
        if (i == 8 && Math.abs(this.d - this.b) == 1 && this.d == c2756h1.b && this.b == c2756h1.d) {
            return true;
        }
        if (this.d != c2756h1.d || this.b != c2756h1.b) {
            return false;
        }
        Object obj2 = this.c;
        Object obj3 = c2756h1.c;
        if (obj2 != null) {
            if (!obj2.equals(obj3)) {
                return false;
            }
        } else if (obj3 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.b);
        sb.append("c:");
        sb.append(this.d);
        sb.append(",p:");
        sb.append(this.c);
        sb.append("]");
        return sb.toString();
    }
}
