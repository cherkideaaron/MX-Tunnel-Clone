package defpackage;

/* renamed from: gh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2735gh extends AbstractC0114Fq {
    public final /* synthetic */ int e;
    public final Object f;

    public C2735gh(C0267Oq c0267Oq) {
        this.e = 2;
        this.f = c0267Oq;
    }

    @Override // defpackage.AbstractC0114Fq
    public final boolean j() {
        switch (this.e) {
        }
        return false;
    }

    @Override // defpackage.AbstractC0114Fq
    public final void k(Throwable th) {
        switch (this.e) {
            case 0:
                ((InterfaceC2680fh) this.f).c();
                return;
            case 1:
                ((InterfaceC2631en) this.f).invoke(th);
                return;
            case 2:
                C0267Oq c0267Oq = (C0267Oq) this.f;
                c0267Oq.getClass();
                Object obj = C0267Oq.a.get(c0267Oq);
                if (!(obj instanceof C0217Ma)) {
                    AbstractC2883jK.S(obj);
                }
                throw null;
            default:
                ((InterfaceC3493uc) this.f).resumeWith(DK.a);
                return;
        }
    }

    public /* synthetic */ C2735gh(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }
}
