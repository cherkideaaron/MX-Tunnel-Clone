package defpackage;

/* loaded from: classes2.dex */
public final class Uv implements InterfaceC3742z8, IM {
    public final B8 a;
    public final Object b = null;
    public final /* synthetic */ Vv c;

    public Uv(Vv vv, B8 b8) {
        this.c = vv;
        this.a = b8;
    }

    @Override // defpackage.InterfaceC3742z8
    public final void a(AbstractC0219Mc abstractC0219Mc) {
        this.a.a(abstractC0219Mc);
    }

    @Override // defpackage.IM
    public final void b(ZD zd, int i) {
        this.a.b(zd, i);
    }

    @Override // defpackage.InterfaceC3742z8
    public final C3337ri c(Object obj, InterfaceC3504un interfaceC3504un) {
        Vv vv = this.c;
        O7 o7 = new O7(1, vv, this);
        C3337ri c3337riD = this.a.D((DK) obj, o7);
        if (c3337riD != null) {
            Vv.h.set(vv, this.b);
        }
        return c3337riD;
    }

    @Override // defpackage.InterfaceC3742z8
    public final boolean cancel(Throwable th) {
        return this.a.cancel(th);
    }

    @Override // defpackage.InterfaceC3742z8
    public final C3337ri e(Throwable th) {
        return this.a.e(th);
    }

    @Override // defpackage.InterfaceC3493uc
    public final InterfaceC0168Jc getContext() {
        return this.a.e;
    }

    @Override // defpackage.InterfaceC3742z8
    public final void i(Object obj) {
        this.a.i(obj);
    }

    @Override // defpackage.InterfaceC3493uc
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
