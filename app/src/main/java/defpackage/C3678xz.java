package defpackage;

/* renamed from: xz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3678xz extends Cy {
    public final Object a;

    public C3678xz(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.Cy
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.Cy
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3678xz) {
            return this.a.equals(((C3678xz) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.a + ")";
    }
}
