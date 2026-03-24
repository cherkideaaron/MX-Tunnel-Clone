package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final /* synthetic */ class O7 implements InterfaceC3504un {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ O7(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.InterfaceC3504un
    public final Object b(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                AbstractC3279qd.f((InterfaceC2631en) this.b, this.c, (InterfaceC0168Jc) obj3);
                break;
            default:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Vv.h;
                Uv uv = (Uv) this.c;
                Object obj4 = uv.b;
                Vv vv = (Vv) this.b;
                atomicReferenceFieldUpdater.set(vv, obj4);
                vv.f(uv.b);
                break;
        }
        return DK.a;
    }
}
