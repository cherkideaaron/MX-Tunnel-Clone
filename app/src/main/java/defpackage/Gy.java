package defpackage;

/* loaded from: classes2.dex */
public final class Gy implements P9 {
    public final Class a;

    public Gy(Class cls) {
        AbstractC0500aq.m(cls, "jClass");
        this.a = cls;
    }

    @Override // defpackage.P9
    public final Class a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Gy) {
            if (AbstractC0500aq.b(this.a, ((Gy) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a + " (Kotlin reflection is not available)";
    }
}
