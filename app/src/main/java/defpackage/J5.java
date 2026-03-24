package defpackage;

/* loaded from: classes2.dex */
public final class J5 extends AbstractC0118Gd {
    public final long a;
    public final String b;
    public final AbstractC0016Ad c;
    public final AbstractC0033Bd d;
    public final AbstractC0050Cd e;
    public final AbstractC0101Fd f;

    public J5(long j, String str, AbstractC0016Ad abstractC0016Ad, AbstractC0033Bd abstractC0033Bd, AbstractC0050Cd abstractC0050Cd, AbstractC0101Fd abstractC0101Fd) {
        this.a = j;
        this.b = str;
        this.c = abstractC0016Ad;
        this.d = abstractC0033Bd;
        this.e = abstractC0050Cd;
        this.f = abstractC0101Fd;
    }

    public final I5 a() {
        I5 i5 = new I5();
        i5.a = this.a;
        i5.b = this.b;
        i5.c = this.c;
        i5.d = this.d;
        i5.e = this.e;
        i5.f = this.f;
        i5.g = (byte) 1;
        return i5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0118Gd)) {
            return false;
        }
        AbstractC0118Gd abstractC0118Gd = (AbstractC0118Gd) obj;
        if (this.a == ((J5) abstractC0118Gd).a) {
            J5 j5 = (J5) abstractC0118Gd;
            if (this.b.equals(j5.b) && this.c.equals(j5.c) && this.d.equals(j5.d)) {
                AbstractC0050Cd abstractC0050Cd = j5.e;
                AbstractC0050Cd abstractC0050Cd2 = this.e;
                if (abstractC0050Cd2 != null ? abstractC0050Cd2.equals(abstractC0050Cd) : abstractC0050Cd == null) {
                    AbstractC0101Fd abstractC0101Fd = j5.f;
                    AbstractC0101Fd abstractC0101Fd2 = this.f;
                    if (abstractC0101Fd2 == null) {
                        if (abstractC0101Fd == null) {
                            return true;
                        }
                    } else if (abstractC0101Fd2.equals(abstractC0101Fd)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int iHashCode = (((((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        AbstractC0050Cd abstractC0050Cd = this.e;
        int iHashCode2 = (iHashCode ^ (abstractC0050Cd == null ? 0 : abstractC0050Cd.hashCode())) * 1000003;
        AbstractC0101Fd abstractC0101Fd = this.f;
        return iHashCode2 ^ (abstractC0101Fd != null ? abstractC0101Fd.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.b + ", app=" + this.c + ", device=" + this.d + ", log=" + this.e + ", rollouts=" + this.f + "}";
    }
}
