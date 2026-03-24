package defpackage;

/* loaded from: classes2.dex */
public final class Y5 extends AbstractC0084Ed {
    public final AbstractC0067Dd a;
    public final String b;
    public final String c;
    public final long d;

    public Y5(AbstractC0067Dd abstractC0067Dd, String str, String str2, long j) {
        this.a = abstractC0067Dd;
        this.b = str;
        this.c = str2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0084Ed)) {
            return false;
        }
        AbstractC0084Ed abstractC0084Ed = (AbstractC0084Ed) obj;
        if (this.a.equals(((Y5) abstractC0084Ed).a)) {
            Y5 y5 = (Y5) abstractC0084Ed;
            if (this.b.equals(y5.b) && this.c.equals(y5.c) && this.d == y5.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.a + ", parameterKey=" + this.b + ", parameterValue=" + this.c + ", templateVersion=" + this.d + "}";
    }
}
