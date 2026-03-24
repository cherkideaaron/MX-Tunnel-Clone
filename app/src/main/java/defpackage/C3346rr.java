package defpackage;

/* renamed from: rr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3346rr implements Comparable {
    public static final C3346rr b = new C3346rr();
    public final int a = 131338;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C3346rr c3346rr = (C3346rr) obj;
        AbstractC0500aq.m(c3346rr, "other");
        return this.a - c3346rr.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C3346rr c3346rr = obj instanceof C3346rr ? (C3346rr) obj : null;
        return c3346rr != null && this.a == c3346rr.a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "2.1.10";
    }
}
