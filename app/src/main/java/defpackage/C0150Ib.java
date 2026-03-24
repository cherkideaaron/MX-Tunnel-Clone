package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Ib, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0150Ib implements InterfaceC2877jE {
    public final AtomicReference a;

    public C0150Ib(C3042mE c3042mE) {
        this.a = new AtomicReference(c3042mE);
    }

    @Override // defpackage.InterfaceC2877jE
    public final Iterator iterator() {
        InterfaceC2877jE interfaceC2877jE = (InterfaceC2877jE) this.a.getAndSet(null);
        if (interfaceC2877jE != null) {
            return interfaceC2877jE.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
