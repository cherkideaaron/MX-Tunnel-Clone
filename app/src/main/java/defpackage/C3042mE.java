package defpackage;

import java.util.Iterator;

/* renamed from: mE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3042mE implements InterfaceC2877jE {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C3042mE(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC2877jE
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                InterfaceC3396sn interfaceC3396sn = (InterfaceC3396sn) this.b;
                AbstractC0500aq.m(interfaceC3396sn, "block");
                C2932kE c2932kE = new C2932kE();
                c2932kE.c = AbstractC0069Df.i(c2932kE, interfaceC3396sn, c2932kE);
                return c2932kE;
            case 1:
                return (Iterator) this.b;
            default:
                return new C2909js((CharSequence) this.b);
        }
    }
}
