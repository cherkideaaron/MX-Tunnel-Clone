package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: tg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3443tg implements InterfaceC3659xg {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScheduledExecutorServiceC3605wg b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TimeUnit f;

    public /* synthetic */ C3443tg(ScheduledExecutorServiceC3605wg scheduledExecutorServiceC3605wg, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.a = i;
        this.b = scheduledExecutorServiceC3605wg;
        this.c = runnable;
        this.d = j;
        this.e = j2;
        this.f = timeUnit;
    }

    @Override // defpackage.InterfaceC3659xg
    public final ScheduledFuture a(C0607co c0607co) {
        switch (this.a) {
            case 0:
                ScheduledExecutorServiceC3605wg scheduledExecutorServiceC3605wg = this.b;
                scheduledExecutorServiceC3605wg.getClass();
                return scheduledExecutorServiceC3605wg.b.scheduleAtFixedRate(new RunnableC3497ug(scheduledExecutorServiceC3605wg, this.c, c0607co, 0), this.d, this.e, this.f);
            default:
                ScheduledExecutorServiceC3605wg scheduledExecutorServiceC3605wg2 = this.b;
                scheduledExecutorServiceC3605wg2.getClass();
                return scheduledExecutorServiceC3605wg2.b.scheduleWithFixedDelay(new RunnableC3497ug(scheduledExecutorServiceC3605wg2, this.c, c0607co, 2), this.d, this.e, this.f);
        }
    }
}
