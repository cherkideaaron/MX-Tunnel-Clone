package defpackage;

/* loaded from: classes2.dex */
public final class Xv extends AbstractC0219Mc implements InterfaceC3227pg {
    public final /* synthetic */ InterfaceC3227pg c;
    public final AbstractC0219Mc d;
    public final String e;

    /* JADX WARN: Multi-variable type inference failed */
    public Xv(AbstractC0219Mc abstractC0219Mc, String str) {
        InterfaceC3227pg interfaceC3227pg = abstractC0219Mc instanceof InterfaceC3227pg ? (InterfaceC3227pg) abstractC0219Mc : null;
        this.c = interfaceC3227pg == null ? AbstractC0188Kf.a : interfaceC3227pg;
        this.d = abstractC0219Mc;
        this.e = str;
    }

    @Override // defpackage.InterfaceC3227pg
    public final InterfaceC2680fh a(long j, RunnableC0584cJ runnableC0584cJ, InterfaceC0168Jc interfaceC0168Jc) {
        return this.c.a(j, runnableC0584cJ, interfaceC0168Jc);
    }

    @Override // defpackage.InterfaceC3227pg
    public final void b(long j, B8 b8) {
        this.c.b(j, b8);
    }

    @Override // defpackage.AbstractC0219Mc
    public final void e(InterfaceC0168Jc interfaceC0168Jc, Runnable runnable) {
        this.d.e(interfaceC0168Jc, runnable);
    }

    @Override // defpackage.AbstractC0219Mc
    public final boolean f(InterfaceC0168Jc interfaceC0168Jc) {
        return this.d.f(interfaceC0168Jc);
    }

    @Override // defpackage.AbstractC0219Mc
    public final String toString() {
        return this.e;
    }
}
