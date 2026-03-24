package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public final class E8 extends C0217Ma {
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(E8.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public E8(InterfaceC3493uc interfaceC3493uc, Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + interfaceC3493uc + " was cancelled normally");
        }
        super(z, th);
        this._resumed$volatile = 0;
    }
}
