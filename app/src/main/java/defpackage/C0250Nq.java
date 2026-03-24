package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: Nq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0250Nq extends AbstractC0094En implements InterfaceC3504un {
    public static final C0250Nq a = new C0250Nq(3, C0267Oq.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // defpackage.InterfaceC3504un
    public final Object b(Object obj, Object obj2, Object obj3) {
        boolean z;
        C0267Oq c0267Oq = (C0267Oq) obj;
        Vs.u(obj2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0267Oq.a;
        c0267Oq.getClass();
        while (true) {
            Object obj4 = C0267Oq.a.get(c0267Oq);
            if (!(obj4 instanceof InterfaceC3344rp)) {
                z = false;
                break;
            }
            if (c0267Oq.N(obj4) >= 0) {
                z = true;
                break;
            }
        }
        if (!z) {
            throw null;
        }
        AbstractC3296qu.F(c0267Oq, true, new C0182Jq());
        throw null;
    }
}
