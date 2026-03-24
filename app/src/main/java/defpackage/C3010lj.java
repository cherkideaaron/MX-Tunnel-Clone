package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: lj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3010lj extends AbstractC2955kj implements InterfaceC3227pg {
    public final Executor c;

    public C3010lj(Executor executor) {
        this.c = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // defpackage.InterfaceC3227pg
    public final InterfaceC2680fh a(long j, RunnableC0584cJ runnableC0584cJ, InterfaceC0168Jc interfaceC0168Jc) {
        Executor executor = this.c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnableC0584cJ, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                InterfaceC0029Aq interfaceC0029Aq = (InterfaceC0029Aq) interfaceC0168Jc.get(C0108Fk.e);
                if (interfaceC0029Aq != null) {
                    interfaceC0029Aq.cancel(cancellationException);
                }
            }
        }
        return scheduledFutureSchedule != null ? new C2625eh(scheduledFutureSchedule) : RunnableC0171Jf.p.a(j, runnableC0584cJ, interfaceC0168Jc);
    }

    @Override // defpackage.InterfaceC3227pg
    public final void b(long j, B8 b8) {
        Executor executor = this.c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(new RunnableC3680y0(this, b8, 17, false), j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                InterfaceC0029Aq interfaceC0029Aq = (InterfaceC0029Aq) b8.e.get(C0108Fk.e);
                if (interfaceC0029Aq != null) {
                    interfaceC0029Aq.cancel(cancellationException);
                }
            }
        }
        if (scheduledFutureSchedule != null) {
            AbstractC3279qd.K(b8, new C3364s8(scheduledFutureSchedule, 0));
        } else {
            RunnableC0171Jf.p.b(j, b8);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // defpackage.AbstractC0219Mc
    public final void e(InterfaceC0168Jc interfaceC0168Jc, Runnable runnable) {
        try {
            this.c.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            InterfaceC0029Aq interfaceC0029Aq = (InterfaceC0029Aq) interfaceC0168Jc.get(C0108Fk.e);
            if (interfaceC0029Aq != null) {
                interfaceC0029Aq.cancel(cancellationException);
            }
            C0545bg c0545bg = AbstractC0600ch.a;
            ExecutorC0273Pf.c.e(interfaceC0168Jc, runnable);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C3010lj) && ((C3010lj) obj).c == this.c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.c);
    }

    @Override // defpackage.AbstractC0219Mc
    public final String toString() {
        return this.c.toString();
    }
}
