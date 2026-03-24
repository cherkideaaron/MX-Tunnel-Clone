package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: Cq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0063Cq extends C0267Oq {
    public final boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0063Cq(InterfaceC0029Aq interfaceC0029Aq) {
        super(true);
        boolean z = true;
        B(interfaceC0029Aq);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0267Oq.b;
        B9 b9 = (B9) atomicReferenceFieldUpdater.get(this);
        C9 c9 = b9 instanceof C9 ? (C9) b9 : null;
        if (c9 != null) {
            do {
                C0267Oq c0267OqI = c9.i();
                if (c0267OqI.w()) {
                    break;
                }
                B9 b92 = (B9) atomicReferenceFieldUpdater.get(c0267OqI);
                c9 = b92 instanceof C9 ? (C9) b92 : null;
            } while (c9 != null);
            z = false;
        } else {
            z = false;
        }
        this.c = z;
    }

    @Override // defpackage.C0267Oq
    public final boolean w() {
        return this.c;
    }

    @Override // defpackage.C0267Oq
    public final boolean x() {
        return true;
    }
}
