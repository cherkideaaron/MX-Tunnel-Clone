package defpackage;

/* loaded from: classes2.dex */
public final class GE {
    public final NE a;
    public final O3 b;

    public GE(NE ne, O3 o3) {
        EnumC2792hj enumC2792hj = EnumC2792hj.b;
        this.a = ne;
        this.b = o3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GE)) {
            return false;
        }
        GE ge = (GE) obj;
        ge.getClass();
        EnumC2792hj enumC2792hj = EnumC2792hj.b;
        return AbstractC0500aq.b(this.a, ge.a) && AbstractC0500aq.b(this.b, ge.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + (EnumC2792hj.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + EnumC2792hj.b + ", sessionData=" + this.a + ", applicationInfo=" + this.b + ')';
    }
}
