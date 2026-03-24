package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: ah, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0491ah extends TD {
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(C0491ah.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // defpackage.TD, defpackage.C0267Oq
    public final void j(Object obj) {
        k(obj);
    }

    @Override // defpackage.TD, defpackage.C0267Oq
    public final void k(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = e;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
                AbstractC0500aq.V(AbstractC0069Df.C(this.d), AbstractC0136He.G(obj));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
