package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: yg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ScheduledFutureC3713yg extends I implements ScheduledFuture {
    public final ScheduledFuture n;

    public ScheduledFutureC3713yg(InterfaceC3659xg interfaceC3659xg) {
        this.n = interfaceC3659xg.a(new C0607co(this));
    }

    @Override // defpackage.I
    public final void b() {
        ScheduledFuture scheduledFuture = this.n;
        Object obj = this.a;
        scheduledFuture.cancel((obj instanceof C) && ((C) obj).a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.n.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.n.getDelay(timeUnit);
    }
}
