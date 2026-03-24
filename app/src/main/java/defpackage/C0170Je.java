package defpackage;

/* renamed from: Je, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0170Je {
    public final EnumC0153Ie a;
    public final EnumC0153Ie b;
    public final double c;

    public C0170Je(EnumC0153Ie enumC0153Ie, EnumC0153Ie enumC0153Ie2, double d) {
        this.a = enumC0153Ie;
        this.b = enumC0153Ie2;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0170Je)) {
            return false;
        }
        C0170Je c0170Je = (C0170Je) obj;
        return this.a == c0170Je.a && this.b == c0170Je.b && Double.compare(this.c, c0170Je.c) == 0;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.c);
        return iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.a + ", crashlytics=" + this.b + ", sessionSamplingRate=" + this.c + ')';
    }
}
