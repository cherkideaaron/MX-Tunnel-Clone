package defpackage;

/* loaded from: classes2.dex */
public final class M5 extends AbstractC3440td {
    public final long a;
    public final long b;
    public final String c;
    public final String d;

    public M5(String str, String str2, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3440td)) {
            return false;
        }
        AbstractC3440td abstractC3440td = (AbstractC3440td) obj;
        if (this.a == ((M5) abstractC3440td).a) {
            M5 m5 = (M5) abstractC3440td;
            if (this.b == m5.b && this.c.equals(m5.c)) {
                String str = m5.d;
                String str2 = this.d;
                if (str2 == null) {
                    if (str == null) {
                        return true;
                    }
                } else if (str2.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BinaryImage{baseAddress=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", uuid=");
        return AbstractC3264qG.l(sb, this.d, "}");
    }
}
