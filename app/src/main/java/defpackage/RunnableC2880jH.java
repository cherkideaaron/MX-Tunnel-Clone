package defpackage;

import androidx.work.impl.WorkDatabase;

/* renamed from: jH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2880jH implements Runnable {
    public static final String d = C3130nt.f("StopWorkRunnable");
    public final C0589cO a;
    public final String b;
    public final boolean c;

    public RunnableC2880jH(C0589cO c0589cO, String str, boolean z) {
        this.a = c0589cO;
        this.b = str;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zContainsKey;
        boolean zK;
        C0589cO c0589cO = this.a;
        WorkDatabase workDatabase = c0589cO.y;
        Oz oz = c0589cO.B;
        C3308r6 c3308r6N = workDatabase.n();
        workDatabase.c();
        try {
            String str = this.b;
            synchronized (oz.q) {
                zContainsKey = oz.f.containsKey(str);
            }
            if (this.c) {
                zK = this.a.B.j(this.b);
            } else {
                if (!zContainsKey && c3308r6N.g(this.b) == 2) {
                    c3308r6N.q(new String[]{this.b}, 1);
                }
                zK = this.a.B.k(this.b);
            }
            C3130nt.d().a(d, "StopWorkRunnable for " + this.b + "; Processor.stopWork = " + zK, new Throwable[0]);
            workDatabase.h();
            workDatabase.f();
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
