package defpackage;

import android.content.Context;

/* renamed from: fl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2684fl implements InterfaceC0192Kj, InterfaceC0209Lj {
    public final /* synthetic */ int a = 0;
    public final InterfaceC3203pA b;
    public final InterfaceC3203pA c;
    public final InterfaceC3203pA d;
    public final InterfaceC3203pA e;

    public C2684fl(InterfaceC3148oA interfaceC3148oA, InterfaceC3148oA interfaceC3148oA2, InterfaceC3148oA interfaceC3148oA3, InterfaceC3148oA interfaceC3148oA4) {
        this.b = interfaceC3148oA;
        this.c = interfaceC3148oA2;
        this.d = interfaceC3148oA3;
        this.e = interfaceC3148oA4;
    }

    @Override // defpackage.InterfaceC3203pA
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C0397Wk((C3663xk) this.b.get(), (SE) this.c.get(), (InterfaceC0168Jc) this.d.get(), (QE) this.e.get());
            default:
                Context context = (Context) this.b.get();
                InterfaceC2682fj interfaceC2682fj = (InterfaceC2682fj) this.c.get();
                B6 b6 = (B6) this.d.get();
                return new C0080Dq(context, interfaceC2682fj, b6);
        }
    }

    public C2684fl(InterfaceC3203pA interfaceC3203pA, InterfaceC3203pA interfaceC3203pA2, C0412Xi c0412Xi) {
        C3397so c3397so = AbstractC0500aq.i;
        this.b = interfaceC3203pA;
        this.c = interfaceC3203pA2;
        this.d = c0412Xi;
        this.e = c3397so;
    }
}
