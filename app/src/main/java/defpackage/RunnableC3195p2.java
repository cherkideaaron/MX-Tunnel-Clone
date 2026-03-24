package defpackage;

import android.app.job.JobParameters;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/* renamed from: p2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC3195p2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ RunnableC3195p2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        Set set;
        Object obj;
        C3616wr c3616wr = (C3616wr) this.b;
        InterfaceC3258qA interfaceC3258qA = (InterfaceC3258qA) this.c;
        synchronized (c3616wr) {
            try {
                if (c3616wr.b == null) {
                    set = c3616wr.a;
                    obj = interfaceC3258qA;
                } else {
                    set = c3616wr.b;
                    obj = interfaceC3258qA.get();
                }
                set.add(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        InterfaceC3062mg interfaceC3062mg;
        switch (this.a) {
            case 0:
                Runnable runnable = (Runnable) this.c;
                ExecutorC3250q2 executorC3250q2 = (ExecutorC3250q2) this.b;
                executorC3250q2.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    executorC3250q2.a();
                }
            case 1:
                Dy dy = (Dy) this.b;
                InterfaceC3258qA interfaceC3258qA = (InterfaceC3258qA) this.c;
                if (dy.b != Dy.d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (dy) {
                    interfaceC3062mg = dy.a;
                    dy.a = null;
                    dy.b = interfaceC3258qA;
                }
                interfaceC3062mg.b(interfaceC3258qA);
                return;
            case 2:
                a();
                return;
            case 3:
                ((C2567dd) this.b).c((String) this.c, Boolean.FALSE);
                return;
            case 4:
                ThreadFactoryC3387se threadFactoryC3387se = (ThreadFactoryC3387se) this.b;
                Process.setThreadPriority(threadFactoryC3387se.c);
                StrictMode.ThreadPolicy threadPolicy = threadFactoryC3387se.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                ((Runnable) this.c).run();
                return;
            case 5:
                Callable callable = (Callable) this.b;
                C0607co c0607co = (C0607co) this.c;
                try {
                    ((ScheduledFutureC3713yg) c0607co.a).h(callable.call());
                    return;
                } catch (Exception e) {
                    ((ScheduledFutureC3713yg) c0607co.a).i(e);
                    return;
                }
            case 6:
                ((C0413Xj) this.b).a((Intent) this.c);
                return;
            case 7:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                C2688fp c2688fp = (C2688fp) this.b;
                c2688fp.getClass();
                try {
                    taskCompletionSource.setResult(c2688fp.a());
                    return;
                } catch (Exception e2) {
                    taskCompletionSource.setException(e2);
                    return;
                }
            case 8:
                int i = JobInfoSchedulerService.a;
                ((JobInfoSchedulerService) this.b).jobFinished((JobParameters) this.c, false);
                return;
            case 9:
                C3040mC c3040mC = (C3040mC) this.b;
                c3040mC.getClass();
                try {
                    C2556dK c2556dK = c3040mC.h;
                    Bz bz = Bz.c;
                    if (c2556dK instanceof C2556dK) {
                        C2610eK.a().d.a(c2556dK.a.b(bz), 1);
                    } else {
                        String strI = AbstractC3279qd.I("ForcedSender");
                        if (Log.isLoggable(strI, 5)) {
                            Log.w(strI, "Expected instance of `TransportImpl`, got `" + c2556dK + "`.");
                        }
                    }
                } catch (Exception unused) {
                }
                ((CountDownLatch) this.c).countDown();
                return;
            default:
                ((AbstractC3296qu) this.b).L((Typeface) this.c);
                return;
        }
    }
}
