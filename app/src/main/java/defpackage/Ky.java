package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class Ky {
    public final Object a;
    public final Object b;

    public Ky(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Ky)) {
            return false;
        }
        Ky ky = (Ky) obj;
        return Objects.equals(ky.a, this.a) && Objects.equals(ky.b, this.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "Pair{" + this.a + " " + this.b + "}";
    }
}
