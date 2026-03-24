package defpackage;

/* loaded from: classes2.dex */
public final class R5 extends AbstractC3602wd {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final int e;

    public R5(long j, String str, String str2, long j2, int i) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3602wd)) {
            return false;
        }
        AbstractC3602wd abstractC3602wd = (AbstractC3602wd) obj;
        if (this.a == ((R5) abstractC3602wd).a) {
            R5 r5 = (R5) abstractC3602wd;
            if (this.b.equals(r5.b)) {
                String str = r5.c;
                String str2 = this.c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.d == r5.d && this.e == r5.e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int iHashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j2 = this.d;
        return ((iHashCode2 ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.a);
        sb.append(", symbol=");
        sb.append(this.b);
        sb.append(", file=");
        sb.append(this.c);
        sb.append(", offset=");
        sb.append(this.d);
        sb.append(", importance=");
        return AbstractC3264qG.j(sb, this.e, "}");
    }
}
