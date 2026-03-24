package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: qg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3282qg implements PN, InterfaceC2900jj, InterfaceC2997lO {
    public static final String p = C3130nt.f("DelayMetCommandHandler");
    public final Context a;
    public final int b;
    public final String c;
    public final C2663fI d;
    public final QN e;
    public PowerManager.WakeLock n;
    public boolean o = false;
    public int m = 0;
    public final Object f = new Object();

    public C3282qg(Context context, int i, String str, C2663fI c2663fI) {
        this.a = context;
        this.b = i;
        this.d = c2663fI;
        this.c = str;
        this.e = new QN(context, c2663fI.b, this);
    }

    public final void a() {
        synchronized (this.f) {
            try {
                this.e.d();
                this.d.c.b(this.c);
                PowerManager.WakeLock wakeLock = this.n;
                if (wakeLock != null && wakeLock.isHeld()) {
                    C3130nt.d().a(p, "Releasing wakelock " + this.n + " for WorkSpec " + this.c, new Throwable[0]);
                    this.n.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC2900jj
    public final void b(String str, boolean z) {
        C3130nt.d().a(p, "onExecuted " + str + ", " + z, new Throwable[0]);
        a();
        int i = this.b;
        C2663fI c2663fI = this.d;
        Context context = this.a;
        if (z) {
            c2663fI.f(new RunnableC2921k3(c2663fI, C0064Da.c(context, this.c), i, 5));
        }
        if (this.o) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            c2663fI.f(new RunnableC2921k3(c2663fI, intent, i, 5));
        }
    }

    public final void c() {
        StringBuilder sb = new StringBuilder();
        String str = this.c;
        sb.append(str);
        sb.append(" (");
        this.n = LM.a(this.a, AbstractC3264qG.j(sb, this.b, ")"));
        C3130nt c3130ntD = C3130nt.d();
        PowerManager.WakeLock wakeLock = this.n;
        String str2 = p;
        c3130ntD.a(str2, "Acquiring wakelock " + wakeLock + " for WorkSpec " + str, new Throwable[0]);
        this.n.acquire();
        C2834iO c2834iOJ = this.d.e.y.n().j(str);
        if (c2834iOJ == null) {
            e();
            return;
        }
        boolean zB = c2834iOJ.b();
        this.o = zB;
        if (zB) {
            this.e.c(Collections.singletonList(c2834iOJ));
        } else {
            C3130nt.d().a(str2, AbstractC3264qG.w("No constraints for ", str), new Throwable[0]);
            f(Collections.singletonList(str));
        }
    }

    @Override // defpackage.PN
    public final void d(ArrayList arrayList) {
        e();
    }

    public final void e() {
        synchronized (this.f) {
            try {
                if (this.m < 2) {
                    this.m = 2;
                    C3130nt c3130ntD = C3130nt.d();
                    String str = p;
                    c3130ntD.a(str, "Stopping work for WorkSpec " + this.c, new Throwable[0]);
                    Context context = this.a;
                    String str2 = this.c;
                    Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                    intent.setAction("ACTION_STOP_WORK");
                    intent.putExtra("KEY_WORKSPEC_ID", str2);
                    C2663fI c2663fI = this.d;
                    c2663fI.f(new RunnableC2921k3(c2663fI, intent, this.b, 5));
                    if (this.d.d.e(this.c)) {
                        C3130nt.d().a(str, "WorkSpec " + this.c + " needs to be rescheduled", new Throwable[0]);
                        Intent intentC = C0064Da.c(this.a, this.c);
                        C2663fI c2663fI2 = this.d;
                        c2663fI2.f(new RunnableC2921k3(c2663fI2, intentC, this.b, 5));
                    } else {
                        C3130nt.d().a(str, "Processor does not have WorkSpec " + this.c + ". No need to reschedule ", new Throwable[0]);
                    }
                } else {
                    C3130nt.d().a(p, "Already stopped work for " + this.c, new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.PN
    public final void f(List list) {
        if (list.contains(this.c)) {
            synchronized (this.f) {
                try {
                    if (this.m == 0) {
                        this.m = 1;
                        C3130nt.d().a(p, "onAllConstraintsMet for " + this.c, new Throwable[0]);
                        if (this.d.d.h(this.c, null)) {
                            this.d.c.a(this.c, this);
                        } else {
                            a();
                        }
                    } else {
                        C3130nt.d().a(p, "Already started work for " + this.c, new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
