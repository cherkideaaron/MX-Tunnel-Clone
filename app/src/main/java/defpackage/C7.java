package defpackage;

import java.util.concurrent.locks.LockSupport;

/* loaded from: classes2.dex */
public final class C7 extends AbstractC2862j {
    public final Thread d;
    public final AbstractC2627ej e;

    public C7(InterfaceC0168Jc interfaceC0168Jc, Thread thread, AbstractC2627ej abstractC2627ej) {
        super(interfaceC0168Jc, true);
        this.d = thread;
        this.e = abstractC2627ej;
    }

    @Override // defpackage.C0267Oq
    public final void j(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.d;
        if (AbstractC0500aq.b(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
