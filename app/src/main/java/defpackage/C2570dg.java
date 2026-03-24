package defpackage;

import java.util.concurrent.Executor;

/* renamed from: dg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2570dg implements InterfaceC0209Lj, InterfaceC0192Kj {
    public final /* synthetic */ int a;
    public final InterfaceC3203pA b;
    public final InterfaceC3203pA c;
    public final InterfaceC3203pA d;
    public final InterfaceC3203pA e;
    public final InterfaceC3203pA f;

    public C2570dg(C2570dg c2570dg, C3308r6 c3308r6, KJ kj) {
        this.a = 4;
        C0108Fk c0108Fk = AbstractC0069Df.i;
        C3397so c3397so = AbstractC0500aq.i;
        this.b = c0108Fk;
        this.c = c3397so;
        this.d = c2570dg;
        this.e = c3308r6;
        this.f = kj;
    }

    @Override // defpackage.InterfaceC3203pA
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C0599cg((Executor) this.b.get(), (C2912jv) this.c.get(), (C0080Dq) this.d.get(), (InterfaceC2682fj) this.e.get(), (InterfaceC0529bI) this.f.get());
            case 1:
                return new C2602eC((YI) this.b.get(), (InterfaceC0227Mk) this.c.get(), (O3) this.d.get(), (C2712gC) this.e.get(), (C2551dF) this.f.get());
            case 2:
                return new C2768hD((VK) this.b.get(), (VK) this.c.get(), (C2816i6) this.d.get(), (RD) this.e.get(), this.f);
            case 3:
                return new LE((C3663xk) this.b.get(), (InterfaceC0227Mk) this.c.get(), (SE) this.d.get(), (C0395Wi) this.e.get(), (InterfaceC0168Jc) this.f.get());
            default:
                return new C2610eK((VK) this.b.get(), (VK) this.c.get(), (KD) this.d.get(), (UK) this.e.get(), (C0535bO) this.f.get());
        }
    }

    public C2570dg(InterfaceC3203pA interfaceC3203pA, InterfaceC3203pA interfaceC3203pA2) {
        this.a = 2;
        C0108Fk c0108Fk = AbstractC0069Df.i;
        C3397so c3397so = AbstractC0500aq.i;
        C0108Fk c0108Fk2 = AbstractC0136He.c;
        this.b = c0108Fk;
        this.c = c3397so;
        this.d = c0108Fk2;
        this.e = interfaceC3203pA;
        this.f = interfaceC3203pA2;
    }

    public /* synthetic */ C2570dg(InterfaceC3203pA interfaceC3203pA, InterfaceC3203pA interfaceC3203pA2, InterfaceC3203pA interfaceC3203pA3, InterfaceC3203pA interfaceC3203pA4, InterfaceC3203pA interfaceC3203pA5, int i) {
        this.a = i;
        this.b = interfaceC3203pA;
        this.c = interfaceC3203pA2;
        this.d = interfaceC3203pA3;
        this.e = interfaceC3203pA4;
        this.f = interfaceC3203pA5;
    }
}
