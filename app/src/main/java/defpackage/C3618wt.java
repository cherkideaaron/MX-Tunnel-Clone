package defpackage;

/* renamed from: wt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3618wt implements Vu {
    public Vu[] a;

    @Override // defpackage.Vu
    public final C2821iB a(Class cls) {
        for (Vu vu : this.a) {
            if (vu.b(cls)) {
                return vu.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // defpackage.Vu
    public final boolean b(Class cls) {
        for (Vu vu : this.a) {
            if (vu.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
