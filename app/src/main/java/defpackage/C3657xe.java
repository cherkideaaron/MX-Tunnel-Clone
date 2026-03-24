package defpackage;

/* renamed from: xe, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3657xe {
    public final KA a;
    public final boolean b;

    public C3657xe(KA ka, boolean z) {
        this.a = ka;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3657xe)) {
            return false;
        }
        C3657xe c3657xe = (C3657xe) obj;
        return c3657xe.a.equals(this.a) && c3657xe.b == this.b;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.b).hashCode();
    }
}
