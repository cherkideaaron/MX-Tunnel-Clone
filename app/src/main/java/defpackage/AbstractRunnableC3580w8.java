package defpackage;

import android.database.SQLException;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: w8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC3580w8 implements Runnable {
    public final R2 a = new R2(3);

    public static void a(C0589cO c0589cO, String str) throws SQLException {
        WorkDatabase workDatabase = c0589cO.y;
        C3308r6 c3308r6N = workDatabase.n();
        R2 r2I = workDatabase.i();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            int iG = c3308r6N.g(str2);
            if (iG != 3 && iG != 4) {
                c3308r6N.q(new String[]{str2}, 6);
            }
            linkedList.addAll(r2I.p(str2));
        }
        Oz oz = c0589cO.B;
        synchronized (oz.q) {
            try {
                C3130nt.d().a(Oz.r, "Processor cancelling " + str, new Throwable[0]);
                oz.o.add(str);
                RunnableC3326rO runnableC3326rO = (RunnableC3326rO) oz.f.remove(str);
                boolean z = runnableC3326rO != null;
                if (runnableC3326rO == null) {
                    runnableC3326rO = (RunnableC3326rO) oz.m.remove(str);
                }
                Oz.c(str, runnableC3326rO);
                if (z) {
                    oz.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = c0589cO.A.iterator();
        while (it.hasNext()) {
            ((LD) it.next()).c(str);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        R2 r2 = this.a;
        try {
            b();
            r2.F(R2.n);
        } catch (Throwable th) {
            r2.F(new C3785zy(th));
        }
    }
}
