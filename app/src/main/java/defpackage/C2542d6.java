package defpackage;

/* renamed from: d6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2542d6 extends AbstractC0152Id {
    public final String a;

    public C2542d6(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0152Id)) {
            return false;
        }
        return this.a.equals(((C2542d6) ((AbstractC0152Id) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC3264qG.l(new StringBuilder("User{identifier="), this.a, "}");
    }
}
