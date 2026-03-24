package defpackage;

import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: xc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3655xc extends AtomicBoolean implements OutcomeReceiver {
    public final InterfaceC3493uc a;

    public C3655xc(B8 b8) {
        super(false);
        this.a = b8;
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.a.resumeWith(AbstractC0115Ga.n(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.a.resumeWith(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
