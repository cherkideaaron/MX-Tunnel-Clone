package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: lq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3017lq extends AbstractC0114Fq {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(C3017lq.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;
    public final InterfaceC2631en e;

    public C3017lq(InterfaceC2631en interfaceC2631en) {
        this.e = interfaceC2631en;
    }

    @Override // defpackage.AbstractC0114Fq
    public final boolean j() {
        return true;
    }

    @Override // defpackage.AbstractC0114Fq
    public final void k(Throwable th) {
        if (f.compareAndSet(this, 0, 1)) {
            this.e.invoke(th);
        }
    }
}
