package defpackage;

/* renamed from: g9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2709g9 {
    public static final C2654f9 b = new C2654f9();
    public final Object a;

    public final boolean equals(Object obj) {
        if (obj instanceof C2709g9) {
            return AbstractC0500aq.b(this.a, ((C2709g9) obj).a);
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
        if (obj instanceof C2599e9) {
            return ((C2599e9) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
