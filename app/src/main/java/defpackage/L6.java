package defpackage;

/* loaded from: classes2.dex */
public final class L6 implements InterfaceC3418t8 {
    public final K6[] a;

    public L6(K6[] k6Arr) {
        this.a = k6Arr;
    }

    @Override // defpackage.InterfaceC3418t8
    public final void a(Throwable th) {
        b();
    }

    public final void b() {
        for (K6 k6 : this.a) {
            InterfaceC2680fh interfaceC2680fh = k6.f;
            if (interfaceC2680fh == null) {
                AbstractC0500aq.d0("handle");
                throw null;
            }
            interfaceC2680fh.c();
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.a + ']';
    }
}
