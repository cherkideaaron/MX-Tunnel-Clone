package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class HC implements Serializable {
    public final Throwable a;

    public HC(Throwable th) {
        AbstractC0500aq.m(th, "exception");
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof HC) {
            if (AbstractC0500aq.b(this.a, ((HC) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.a + ')';
    }
}
