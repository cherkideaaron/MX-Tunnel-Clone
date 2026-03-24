package defpackage;

import android.content.Context;
import android.database.SQLException;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: rO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC3326rO implements Runnable {
    public static final String z = C3130nt.f("WorkerWrapper");
    public Context a;
    public String b;
    public List c;
    public D3 d;
    public C2834iO e;
    public ListenableWorker f;
    public InterfaceC3482uI m;
    public Es n;
    public C2770hF o;
    public InterfaceC0449Zl p;
    public WorkDatabase q;
    public C3308r6 r;
    public R2 s;
    public C3178om t;
    public ArrayList u;
    public String v;
    public VE w;
    public As x;
    public volatile boolean y;

    public final void a(Es es) {
        boolean z2 = es instanceof Ds;
        String str = z;
        if (z2) {
            C3130nt.d().e(str, AbstractC3264qG.w("Worker result SUCCESS for ", this.v), new Throwable[0]);
            if (!this.e.c()) {
                R2 r2 = this.s;
                String str2 = this.b;
                C3308r6 c3308r6 = this.r;
                WorkDatabase workDatabase = this.q;
                workDatabase.c();
                try {
                    c3308r6.q(new String[]{str2}, 3);
                    c3308r6.o(str2, ((Ds) this.n).a);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Iterator it = r2.p(str2).iterator();
                    while (it.hasNext()) {
                        String str3 = (String) it.next();
                        if (c3308r6.g(str3) == 5 && r2.t(str3)) {
                            C3130nt.d().e(str, "Setting status to enqueued for " + str3, new Throwable[0]);
                            c3308r6.q(new String[]{str3}, 1);
                            c3308r6.p(jCurrentTimeMillis, str3);
                        }
                    }
                    workDatabase.h();
                    workDatabase.f();
                    f(false);
                    return;
                } catch (Throwable th) {
                    workDatabase.f();
                    f(false);
                    throw th;
                }
            }
        } else if (es instanceof Cs) {
            C3130nt.d().e(str, AbstractC3264qG.w("Worker result RETRY for ", this.v), new Throwable[0]);
            d();
            return;
        } else {
            C3130nt.d().e(str, AbstractC3264qG.w("Worker result FAILURE for ", this.v), new Throwable[0]);
            if (!this.e.c()) {
                h();
                return;
            }
        }
        e();
    }

    public final void b(String str) throws SQLException {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            C3308r6 c3308r6 = this.r;
            if (c3308r6.g(str2) != 6) {
                c3308r6.q(new String[]{str2}, 4);
            }
            linkedList.addAll(this.s.p(str2));
        }
    }

    public final void c() {
        boolean zI = i();
        String str = this.b;
        WorkDatabase workDatabase = this.q;
        if (!zI) {
            workDatabase.c();
            try {
                int iG = this.r.g(str);
                C3532vE c3532vEM = workDatabase.m();
                TC tc = (TC) c3532vEM.a;
                tc.b();
                C2881jI c2881jI = (C2881jI) c3532vEM.c;
                C0497an c0497anA = c2881jI.a();
                if (str == null) {
                    c0497anA.f(1);
                } else {
                    c0497anA.g(1, str);
                }
                tc.c();
                try {
                    c0497anA.m();
                    tc.h();
                    if (iG == 0) {
                        f(false);
                    } else if (iG == 2) {
                        a(this.n);
                    } else if (!Vs.d(iG)) {
                        d();
                    }
                    workDatabase.h();
                    workDatabase.f();
                } finally {
                    tc.f();
                    c2881jI.c(c0497anA);
                }
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
        List list = this.c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((LD) it.next()).c(str);
            }
            OD.a(this.o, workDatabase, list);
        }
    }

    public final void d() {
        String str = this.b;
        C3308r6 c3308r6 = this.r;
        WorkDatabase workDatabase = this.q;
        workDatabase.c();
        try {
            c3308r6.q(new String[]{str}, 1);
            c3308r6.p(System.currentTimeMillis(), str);
            c3308r6.m(-1L, str);
            workDatabase.h();
        } finally {
            workDatabase.f();
            f(true);
        }
    }

    public final void e() {
        String str = this.b;
        C3308r6 c3308r6 = this.r;
        WorkDatabase workDatabase = this.q;
        workDatabase.c();
        try {
            c3308r6.p(System.currentTimeMillis(), str);
            c3308r6.q(new String[]{str}, 1);
            c3308r6.n(str);
            c3308r6.m(-1L, str);
            workDatabase.h();
        } finally {
            workDatabase.f();
            f(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(boolean r6) {
        /*
            r5 = this;
            androidx.work.impl.WorkDatabase r0 = r5.q
            r0.c()
            androidx.work.impl.WorkDatabase r0 = r5.q     // Catch: java.lang.Throwable -> L42
            r6 r0 = r0.n()     // Catch: java.lang.Throwable -> L42
            r0.getClass()     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"
            r2 = 0
            UC r1 = defpackage.UC.c(r2, r1)     // Catch: java.lang.Throwable -> L42
            java.lang.Object r0 = r0.a     // Catch: java.lang.Throwable -> L42
            TC r0 = (defpackage.TC) r0     // Catch: java.lang.Throwable -> L42
            r0.b()     // Catch: java.lang.Throwable -> L42
            android.database.Cursor r0 = r0.g(r1)     // Catch: java.lang.Throwable -> L42
            boolean r3 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L2f
            r4 = 1
            if (r3 == 0) goto L31
            int r3 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L31
            r3 = r4
            goto L32
        L2f:
            r6 = move-exception
            goto L92
        L31:
            r3 = r2
        L32:
            r0.close()     // Catch: java.lang.Throwable -> L42
            r1.release()     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto L44
            android.content.Context r0 = r5.a     // Catch: java.lang.Throwable -> L42
            java.lang.Class<androidx.work.impl.background.systemalarm.RescheduleReceiver> r1 = androidx.work.impl.background.systemalarm.RescheduleReceiver.class
            defpackage.Fy.a(r0, r1, r2)     // Catch: java.lang.Throwable -> L42
            goto L44
        L42:
            r6 = move-exception
            goto L99
        L44:
            if (r6 == 0) goto L5a
            r6 r0 = r5.r     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r5.b     // Catch: java.lang.Throwable -> L42
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L42
            r0.q(r1, r4)     // Catch: java.lang.Throwable -> L42
            r6 r0 = r5.r     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r5.b     // Catch: java.lang.Throwable -> L42
            r2 = -1
            r0.m(r2, r1)     // Catch: java.lang.Throwable -> L42
        L5a:
            iO r0 = r5.e     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L7e
            androidx.work.ListenableWorker r0 = r5.f     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L7e
            boolean r0 = r0.isRunInForeground()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L7e
            Zl r0 = r5.p     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r5.b     // Catch: java.lang.Throwable -> L42
            Oz r0 = (defpackage.Oz) r0     // Catch: java.lang.Throwable -> L42
            java.lang.Object r2 = r0.q     // Catch: java.lang.Throwable -> L42
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L42
            java.util.HashMap r3 = r0.f     // Catch: java.lang.Throwable -> L7b
            r3.remove(r1)     // Catch: java.lang.Throwable -> L7b
            r0.i()     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7b
            goto L7e
        L7b:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7b
            throw r6     // Catch: java.lang.Throwable -> L42
        L7e:
            androidx.work.impl.WorkDatabase r0 = r5.q     // Catch: java.lang.Throwable -> L42
            r0.h()     // Catch: java.lang.Throwable -> L42
            androidx.work.impl.WorkDatabase r0 = r5.q
            r0.f()
            VE r0 = r5.w
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r0.i(r6)
            return
        L92:
            r0.close()     // Catch: java.lang.Throwable -> L42
            r1.release()     // Catch: java.lang.Throwable -> L42
            throw r6     // Catch: java.lang.Throwable -> L42
        L99:
            androidx.work.impl.WorkDatabase r0 = r5.q
            r0.f()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC3326rO.f(boolean):void");
    }

    public final void g() {
        C3308r6 c3308r6 = this.r;
        String str = this.b;
        int iG = c3308r6.g(str);
        String str2 = z;
        if (iG == 2) {
            C3130nt.d().a(str2, AbstractC3264qG.x("Status for ", str, " is RUNNING;not doing any work and rescheduling for later execution"), new Throwable[0]);
            f(true);
            return;
        }
        C3130nt c3130ntD = C3130nt.d();
        StringBuilder sbO = AbstractC3264qG.o("Status for ", str, " is ");
        sbO.append(Vs.I(iG));
        sbO.append("; not doing any work");
        c3130ntD.a(str2, sbO.toString(), new Throwable[0]);
        f(false);
    }

    public final void h() {
        String str = this.b;
        WorkDatabase workDatabase = this.q;
        workDatabase.c();
        try {
            b(str);
            this.r.o(str, ((Bs) this.n).a);
            workDatabase.h();
        } finally {
            workDatabase.f();
            f(false);
        }
    }

    public final boolean i() {
        if (!this.y) {
            return false;
        }
        C3130nt.d().a(z, AbstractC3264qG.w("Work interrupted for ", this.v), new Throwable[0]);
        if (this.r.g(this.b) == 0) {
            f(false);
        } else {
            f(!Vs.d(r0));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8 A[Catch: all -> 0x007c, TryCatch #2 {all -> 0x007c, blocks: (B:14:0x0052, B:17:0x005c, B:18:0x0074, B:22:0x007f, B:24:0x0083, B:25:0x00a8, B:27:0x00ae, B:29:0x00b4, B:37:0x00f1, B:31:0x00b8, B:34:0x00c7, B:36:0x00cf), top: B:97:0x0052 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 700
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC3326rO.run():void");
    }
}
