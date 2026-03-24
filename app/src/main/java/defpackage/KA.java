package defpackage;

/* loaded from: classes2.dex */
public final class KA {
    public final Class a;
    public final Class b;

    public KA(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public static KA a(Class cls) {
        return new KA(JA.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || KA.class != obj.getClass()) {
            return false;
        }
        KA ka = (KA) obj;
        if (this.b.equals(ka.b)) {
            return this.a.equals(ka.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.b;
        Class cls2 = this.a;
        if (cls2 == JA.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
