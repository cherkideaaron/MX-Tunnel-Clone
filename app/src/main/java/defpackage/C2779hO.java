package defpackage;

/* renamed from: hO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2779hO {
    public String a;
    public int b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2779hO)) {
            return false;
        }
        C2779hO c2779hO = (C2779hO) obj;
        if (this.b != c2779hO.b) {
            return false;
        }
        return this.a.equals(c2779hO.a);
    }

    public final int hashCode() {
        return AbstractC3264qG.A(this.b) + (this.a.hashCode() * 31);
    }
}
