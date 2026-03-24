package defpackage;

/* renamed from: Pp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0283Pp extends C0249Np {
    public static final C0283Pp d = new C0283Pp(1, 0, 1);

    @Override // defpackage.C0249Np
    public final boolean equals(Object obj) {
        if (obj instanceof C0283Pp) {
            if (!isEmpty() || !((C0283Pp) obj).isEmpty()) {
                C0283Pp c0283Pp = (C0283Pp) obj;
                if (this.a == c0283Pp.a) {
                    if (this.b == c0283Pp.b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.C0249Np
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // defpackage.C0249Np
    public final boolean isEmpty() {
        return this.a > this.b;
    }

    @Override // defpackage.C0249Np
    public final String toString() {
        return this.a + ".." + this.b;
    }
}
