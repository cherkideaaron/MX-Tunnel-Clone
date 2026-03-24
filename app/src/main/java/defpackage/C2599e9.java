package defpackage;

/* renamed from: e9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2599e9 extends C2654f9 {
    public final Throwable a;

    public C2599e9(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2599e9) {
            if (AbstractC0500aq.b(this.a, ((C2599e9) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // defpackage.C2654f9
    public final String toString() {
        return "Closed(" + this.a + ')';
    }
}
