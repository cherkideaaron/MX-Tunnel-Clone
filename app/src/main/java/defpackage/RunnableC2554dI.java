package defpackage;

import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* renamed from: dI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2554dI implements Runnable {
    public final /* synthetic */ int a;
    public final C2663fI b;

    public /* synthetic */ RunnableC2554dI(C2663fI c2663fI, int i) {
        this.a = i;
        this.b = c2663fI;
    }

    private final void a() {
        C2663fI c2663fI;
        RunnableC2554dI runnableC2554dI;
        int i = 1;
        synchronized (this.b.n) {
            C2663fI c2663fI2 = this.b;
            c2663fI2.o = (Intent) c2663fI2.n.get(0);
        }
        Intent intent = this.b.o;
        if (intent != null) {
            String action = intent.getAction();
            int intExtra = this.b.o.getIntExtra("KEY_START_ID", 0);
            C3130nt c3130ntD = C3130nt.d();
            String str = C2663fI.q;
            c3130ntD.a(str, String.format("Processing command %s, %s", this.b.o, Integer.valueOf(intExtra)), new Throwable[0]);
            PowerManager.WakeLock wakeLockA = LM.a(this.b.a, action + " (" + intExtra + ")");
            try {
                C3130nt.d().a(str, "Acquiring operation wake lock (" + action + ") " + wakeLockA, new Throwable[0]);
                wakeLockA.acquire();
                C2663fI c2663fI3 = this.b;
                c2663fI3.f.e(c2663fI3.o, intExtra, c2663fI3);
                C3130nt.d().a(str, "Releasing operation wake lock (" + action + ") " + wakeLockA, new Throwable[0]);
                wakeLockA.release();
                c2663fI = this.b;
                runnableC2554dI = new RunnableC2554dI(c2663fI, i);
            } catch (Throwable th) {
                try {
                    C3130nt c3130ntD2 = C3130nt.d();
                    String str2 = C2663fI.q;
                    c3130ntD2.b(str2, "Unexpected error in onHandleIntent", th);
                    C3130nt.d().a(str2, "Releasing operation wake lock (" + action + ") " + wakeLockA, new Throwable[0]);
                    wakeLockA.release();
                    c2663fI = this.b;
                    runnableC2554dI = new RunnableC2554dI(c2663fI, i);
                } catch (Throwable th2) {
                    C3130nt.d().a(C2663fI.q, "Releasing operation wake lock (" + action + ") " + wakeLockA, new Throwable[0]);
                    wakeLockA.release();
                    C2663fI c2663fI4 = this.b;
                    c2663fI4.f(new RunnableC2554dI(c2663fI4, i));
                    throw th2;
                }
            }
            c2663fI.f(runnableC2554dI);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a();
                return;
            default:
                C2663fI c2663fI = this.b;
                c2663fI.getClass();
                C3130nt c3130ntD = C3130nt.d();
                String str = C2663fI.q;
                c3130ntD.a(str, "Checking if commands are complete.", new Throwable[0]);
                c2663fI.c();
                synchronized (c2663fI.n) {
                    try {
                        if (c2663fI.o != null) {
                            C3130nt.d().a(str, String.format("Removing command %s", c2663fI.o), new Throwable[0]);
                            if (!((Intent) c2663fI.n.remove(0)).equals(c2663fI.o)) {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                            c2663fI.o = null;
                        }
                        ExecutorC3316rE executorC3316rE = (ExecutorC3316rE) ((D3) c2663fI.b).b;
                        if (!c2663fI.f.d() && c2663fI.n.isEmpty() && !executorC3316rE.a()) {
                            C3130nt.d().a(str, "No more commands & intents.", new Throwable[0]);
                            InterfaceC2608eI interfaceC2608eI = c2663fI.p;
                            if (interfaceC2608eI != null) {
                                ((SystemAlarmService) interfaceC2608eI).a();
                            }
                        } else if (!c2663fI.n.isEmpty()) {
                            c2663fI.g();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
