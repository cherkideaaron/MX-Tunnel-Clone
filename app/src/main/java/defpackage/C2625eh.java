package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;

/* renamed from: eh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2625eh implements InterfaceC2680fh {
    public final Future a;

    public C2625eh(ScheduledFuture scheduledFuture) {
        this.a = scheduledFuture;
    }

    @Override // defpackage.InterfaceC2680fh
    public final void c() {
        this.a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.a + ']';
    }
}
