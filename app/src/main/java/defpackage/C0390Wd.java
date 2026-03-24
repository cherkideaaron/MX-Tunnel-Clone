package defpackage;

import android.content.Context;

/* renamed from: Wd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0390Wd implements InterfaceC0209Lj, InterfaceC0192Kj {
    public final /* synthetic */ int a;
    public final InterfaceC3203pA b;
    public final InterfaceC3203pA c;
    public final InterfaceC3203pA d;

    public C0390Wd(C0565c0 c0565c0) {
        this.a = 0;
        C0108Fk c0108Fk = AbstractC0069Df.i;
        C3397so c3397so = AbstractC0500aq.i;
        this.b = c0565c0;
        this.c = c0108Fk;
        this.d = c3397so;
    }

    @Override // defpackage.InterfaceC3203pA
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C0373Vd((Context) this.b.get(), (VK) this.c.get(), (VK) this.d.get());
            case 1:
                Context context = (Context) this.b.get();
                InterfaceC0168Jc interfaceC0168Jc = (InterfaceC0168Jc) this.c.get();
                CE ce = (CE) this.d.get();
                AbstractC0500aq.m(context, "appContext");
                AbstractC0500aq.m(interfaceC0168Jc, "blockingDispatcher");
                AbstractC0500aq.m(ce, "sessionDataSerializer");
                return C3397so.e(ce, new C2827iH(new C2809i(ce, 1), 26), AbstractC0136He.a(interfaceC0168Jc), new C0414Xk(context, 1));
            case 2:
                return new RD((Context) this.b.get(), (String) this.c.get(), ((Integer) this.d.get()).intValue());
            default:
                return new C2551dF((InterfaceC0168Jc) this.b.get(), (YI) this.c.get(), (InterfaceC0272Pe) this.d.get());
        }
    }

    public /* synthetic */ C0390Wd(InterfaceC3148oA interfaceC3148oA, InterfaceC3148oA interfaceC3148oA2, InterfaceC3148oA interfaceC3148oA3, int i) {
        this.a = i;
        this.b = interfaceC3148oA;
        this.c = interfaceC3148oA2;
        this.d = interfaceC3148oA3;
    }

    public C0390Wd(InterfaceC3203pA interfaceC3203pA) {
        this.a = 2;
        C3397so c3397so = AbstractC0115Ga.e;
        C0360Uh c0360Uh = AbstractC3279qd.m;
        this.b = interfaceC3203pA;
        this.c = c3397so;
        this.d = c0360Uh;
    }
}
