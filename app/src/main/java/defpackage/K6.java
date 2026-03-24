package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class K6 extends AbstractC0114Fq {
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(K6.class, Object.class, "_disposer$volatile");
    private volatile /* synthetic */ Object _disposer$volatile;
    public final InterfaceC3742z8 e;
    public InterfaceC2680fh f;
    public final /* synthetic */ M6 m;

    public K6(M6 m6, B8 b8) {
        this.m = m6;
        this.e = b8;
    }

    @Override // defpackage.AbstractC0114Fq
    public final boolean j() {
        return false;
    }

    @Override // defpackage.AbstractC0114Fq
    public final void k(Throwable th) {
        InterfaceC3742z8 interfaceC3742z8 = this.e;
        if (th != null) {
            C3337ri c3337riE = interfaceC3742z8.e(th);
            if (c3337riE != null) {
                interfaceC3742z8.i(c3337riE);
                L6 l6 = (L6) n.get(this);
                if (l6 != null) {
                    l6.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = M6.b;
        M6 m6 = this.m;
        if (atomicIntegerFieldUpdater.decrementAndGet(m6) == 0) {
            InterfaceC3117ng[] interfaceC3117ngArr = m6.a;
            ArrayList arrayList = new ArrayList(interfaceC3117ngArr.length);
            for (InterfaceC3117ng interfaceC3117ng : interfaceC3117ngArr) {
                arrayList.add(interfaceC3117ng.getCompleted());
            }
            interfaceC3742z8.resumeWith(arrayList);
        }
    }
}
