package defpackage;

/* renamed from: Gq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0131Gq extends B8 {
    public final C0267Oq o;

    public C0131Gq(InterfaceC3493uc interfaceC3493uc, C0267Oq c0267Oq) {
        super(1, interfaceC3493uc);
        this.o = c0267Oq;
    }

    @Override // defpackage.B8
    public final Throwable q(C0267Oq c0267Oq) {
        Throwable thC;
        C0267Oq c0267Oq2 = this.o;
        c0267Oq2.getClass();
        Object obj = C0267Oq.a.get(c0267Oq2);
        return (!(obj instanceof C0165Iq) || (thC = ((C0165Iq) obj).c()) == null) ? obj instanceof C0217Ma ? ((C0217Ma) obj).a : c0267Oq.getCancellationException() : thC;
    }

    @Override // defpackage.B8
    public final String y() {
        return "AwaitContinuation";
    }
}
