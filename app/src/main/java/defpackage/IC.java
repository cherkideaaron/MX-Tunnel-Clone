package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class IC implements Serializable {
    public final Object a;

    public static final Throwable a(Object obj) {
        if (obj instanceof HC) {
            return ((HC) obj).a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof IC) {
            return AbstractC0500aq.b(this.a, ((IC) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof HC) {
            return ((HC) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
