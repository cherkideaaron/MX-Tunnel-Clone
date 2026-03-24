package defpackage;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* renamed from: jw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2913jw extends Thread {
    public final BlockingQueue a;
    public final InterfaceC2695fw b;
    public final C0427Yg c;
    public final C2827iH d;
    public volatile boolean e = false;

    public C2913jw(PriorityBlockingQueue priorityBlockingQueue, InterfaceC2695fw interfaceC2695fw, C0427Yg c0427Yg, C2827iH c2827iH) {
        this.a = priorityBlockingQueue;
        this.b = interfaceC2695fw;
        this.c = c0427Yg;
        this.d = c2827iH;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        C3373sH c3373sH;
        C3078mw c3078mwF;
        int i = 2;
        Process.setThreadPriority(10);
        while (true) {
            SystemClock.elapsedRealtime();
            try {
                c3373sH = (C3373sH) this.a.take();
                Object obj = null;
                try {
                    c3373sH.a("network-queue-take");
                    TrafficStats.setThreadStatsTag(c3373sH.d);
                    c3078mwF = ((C3471u7) this.b).f(c3373sH);
                    c3373sH.a("network-http-complete");
                } catch (EM e) {
                    SystemClock.elapsedRealtime();
                    c3373sH.getClass();
                    C2827iH c2827iH = this.d;
                    c2827iH.getClass();
                    c3373sH.a("post-error");
                    ((ExecutorC3065mj) c2827iH.b).execute(new RunnableC0354Ub(c3373sH, new C0312Rk(e), obj, i));
                } catch (Exception e2) {
                    Log.e("Volley", HM.a("Unhandled exception %s", e2.toString()), e2);
                    EM em = new EM(e2);
                    SystemClock.elapsedRealtime();
                    C2827iH c2827iH2 = this.d;
                    c2827iH2.getClass();
                    c3373sH.a("post-error");
                    ((ExecutorC3065mj) c2827iH2.b).execute(new RunnableC0354Ub(c3373sH, new C0312Rk(em), obj, i));
                }
            } catch (InterruptedException unused) {
                if (this.e) {
                    return;
                }
            }
            if (c3078mwF.c && c3373sH.o) {
                c3373sH.c("not-modified");
            } else {
                C0312Rk c0312RkJ = C3373sH.j(c3078mwF);
                c3373sH.a("network-parse-complete");
                if (c3373sH.n && ((C2653f8) c0312RkJ.c) != null) {
                    this.c.d(c3373sH.e(), (C2653f8) c0312RkJ.c);
                    c3373sH.a("network-cache-written");
                }
                c3373sH.o = true;
                this.d.A(c3373sH, c0312RkJ, null);
            }
        }
    }
}
