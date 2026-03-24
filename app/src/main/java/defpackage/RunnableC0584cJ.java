package defpackage;

/* renamed from: cJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC0584cJ extends TD implements Runnable {
    public final long e;

    public RunnableC0584cJ(long j, InterfaceC3493uc interfaceC3493uc) {
        super(interfaceC3493uc, interfaceC3493uc.getContext());
        this.e = j;
    }

    @Override // defpackage.AbstractC2862j, defpackage.C0267Oq
    public final String G() {
        return super.G() + "(timeMillis=" + this.e + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC0136He.q(this.c);
        m(new C0530bJ("Timed out waiting for " + this.e + " ms", this));
    }
}
