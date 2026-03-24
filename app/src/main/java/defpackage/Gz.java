package defpackage;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class Gz {

    @NotNull
    public static final Fz Companion = new Fz();
    public final int a;
    public final String b;

    public /* synthetic */ Gz(int i, int i2, String str) {
        if (3 != (i & 3)) {
            AbstractC2883jK.O(i, 3, Ez.a.d());
            throw null;
        }
        this.a = i2;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Gz)) {
            return false;
        }
        Gz gz = (Gz) obj;
        return this.a == gz.a && AbstractC0500aq.b(this.b, gz.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a * 31);
    }

    public final String toString() {
        return "ProcessData(pid=" + this.a + ", uuid=" + this.b + ')';
    }

    public Gz(int i, String str) {
        AbstractC0500aq.m(str, "uuid");
        this.a = i;
        this.b = str;
    }
}
