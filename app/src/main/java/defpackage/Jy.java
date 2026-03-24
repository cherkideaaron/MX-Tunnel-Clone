package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class Jy implements Serializable {
    public final Object a;
    public final Object b;

    public Jy(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Jy)) {
            return false;
        }
        Jy jy = (Jy) obj;
        return AbstractC0500aq.b(this.a, jy.a) && AbstractC0500aq.b(this.b, jy.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.a + ", " + this.b + ')';
    }
}
