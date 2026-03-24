package defpackage;

import android.content.Context;

/* renamed from: al, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0495al implements InterfaceC0192Kj, InterfaceC0209Lj {
    public final /* synthetic */ int a;
    public final InterfaceC3203pA b;
    public final InterfaceC3203pA c;

    public /* synthetic */ C0495al(InterfaceC3203pA interfaceC3203pA, InterfaceC3203pA interfaceC3203pA2, int i) {
        this.a = i;
        this.b = interfaceC3203pA;
        this.c = interfaceC3203pA2;
    }

    @Override // defpackage.InterfaceC3203pA
    public final Object get() {
        switch (this.a) {
            case 0:
                Context context = (Context) this.b.get();
                InterfaceC0168Jc interfaceC0168Jc = (InterfaceC0168Jc) this.c.get();
                AbstractC0500aq.m(context, "appContext");
                AbstractC0500aq.m(interfaceC0168Jc, "blockingDispatcher");
                return C3397so.e(C0108Fk.m, new C2827iH(new C0185Kc(1), 26), AbstractC0136He.a(interfaceC0168Jc), new C0414Xk(context, 0));
            case 1:
                return new C2912jv((Context) this.b.get(), (C0373Vd) this.c.get());
            case 2:
                return new Iz((Context) this.b.get(), (C2884jL) this.c.get());
            case 3:
                return new C2712gC((O3) this.b.get(), (InterfaceC0168Jc) this.c.get());
            case 4:
                return new ME((YI) this.b.get(), (C2884jL) this.c.get());
            default:
                return new SE((InterfaceC2660fF) this.b.get(), (InterfaceC2660fF) this.c.get());
        }
    }
}
