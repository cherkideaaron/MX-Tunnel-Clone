package defpackage;

/* renamed from: Hq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0148Hq extends AbstractC0114Fq {
    public final C0267Oq e;
    public final C0165Iq f;
    public final C9 m;
    public final Object n;

    public C0148Hq(C0267Oq c0267Oq, C0165Iq c0165Iq, C9 c9, Object obj) {
        this.e = c0267Oq;
        this.f = c0165Iq;
        this.m = c9;
        this.n = obj;
    }

    @Override // defpackage.AbstractC0114Fq
    public final boolean j() {
        return false;
    }

    @Override // defpackage.AbstractC0114Fq
    public final void k(Throwable th) {
        C0267Oq c0267Oq = this.e;
        c0267Oq.getClass();
        C9 c9 = this.m;
        C9 c9H = C0267Oq.H(c9);
        C0165Iq c0165Iq = this.f;
        Object obj = this.n;
        if (c9H == null || !c0267Oq.R(c0165Iq, c9H, obj)) {
            C3513uw c3513uw = c0165Iq.a;
            c3513uw.getClass();
            c3513uw.d(new C3074ms(2), 2);
            C9 c9H2 = C0267Oq.H(c9);
            if (c9H2 == null || !c0267Oq.R(c0165Iq, c9H2, obj)) {
                c0267Oq.j(c0267Oq.t(c0165Iq, obj));
            }
        }
    }
}
