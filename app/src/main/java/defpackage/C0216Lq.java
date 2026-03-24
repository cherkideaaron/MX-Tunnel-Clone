package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: Lq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0216Lq extends AbstractC0094En implements InterfaceC3504un {
    public static final C0216Lq a = new C0216Lq(3, C0267Oq.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // defpackage.InterfaceC3504un
    public final Object b(Object obj, Object obj2, Object obj3) {
        Object obj4;
        C0267Oq c0267Oq = (C0267Oq) obj;
        Vs.u(obj2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0267Oq.a;
        c0267Oq.getClass();
        do {
            obj4 = C0267Oq.a.get(c0267Oq);
            if (!(obj4 instanceof InterfaceC3344rp)) {
                if (obj4 instanceof C0217Ma) {
                    throw null;
                }
                AbstractC2883jK.S(obj4);
                throw null;
            }
        } while (c0267Oq.N(obj4) < 0);
        AbstractC3296qu.F(c0267Oq, true, new C2735gh(c0267Oq));
        throw null;
    }
}
