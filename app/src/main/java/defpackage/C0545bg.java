package defpackage;

/* renamed from: bg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0545bg extends ND {
    public static final C0545bg d = new C0545bg(AbstractC3590wI.c, AbstractC3590wI.d, AbstractC3590wI.a, AbstractC3590wI.e);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.AbstractC0219Mc
    public final String toString() {
        return "Dispatchers.Default";
    }
}
