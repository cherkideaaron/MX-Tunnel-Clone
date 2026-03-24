package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: jd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2894jd implements InterfaceC3062mg, InterfaceC3659xg, InterfaceC0474aI {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C2894jd(UK uk, Iterable iterable, J6 j6, long j) {
        this.a = 3;
        this.c = uk;
        this.d = iterable;
        this.e = j6;
        this.b = j;
    }

    @Override // defpackage.InterfaceC3659xg
    public ScheduledFuture a(final C0607co c0607co) {
        switch (this.a) {
            case 1:
                ScheduledExecutorServiceC3605wg scheduledExecutorServiceC3605wg = (ScheduledExecutorServiceC3605wg) this.c;
                scheduledExecutorServiceC3605wg.getClass();
                return scheduledExecutorServiceC3605wg.b.schedule(new RunnableC3497ug(scheduledExecutorServiceC3605wg, (Runnable) this.d, c0607co, 1), this.b, (TimeUnit) this.e);
            default:
                final ScheduledExecutorServiceC3605wg scheduledExecutorServiceC3605wg2 = (ScheduledExecutorServiceC3605wg) this.c;
                scheduledExecutorServiceC3605wg2.getClass();
                final Callable callable = (Callable) this.d;
                return scheduledExecutorServiceC3605wg2.b.schedule(new Callable() { // from class: vg
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ScheduledExecutorServiceC3605wg scheduledExecutorServiceC3605wg3 = scheduledExecutorServiceC3605wg2;
                        scheduledExecutorServiceC3605wg3.getClass();
                        return scheduledExecutorServiceC3605wg3.a.submit(new RunnableC3195p2(5, callable, c0607co));
                    }
                }, this.b, (TimeUnit) this.e);
        }
    }

    @Override // defpackage.InterfaceC3062mg
    public void b(InterfaceC3258qA interfaceC3258qA) {
        ((C2949kd) interfaceC3258qA.get()).d((String) this.c, (String) this.d, this.b, (E6) this.e);
    }

    @Override // defpackage.InterfaceC0474aI
    public Object e() {
        UK uk = (UK) this.c;
        C2768hD c2768hD = (C2768hD) uk.c;
        c2768hD.getClass();
        Iterable iterable = (Iterable) this.d;
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + C2768hD.h(iterable);
            SQLiteDatabase sQLiteDatabaseA = c2768hD.a();
            sQLiteDatabaseA.beginTransaction();
            try {
                sQLiteDatabaseA.compileStatement(str).execute();
                Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        c2768hD.f(cursorRawQuery.getInt(0), EnumC2802ht.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseA.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseA.setTransactionSuccessful();
            } finally {
                sQLiteDatabaseA.endTransaction();
            }
        }
        c2768hD.c(new C0578cD(uk.g.a() + this.b, (J6) this.e));
        return null;
    }

    public /* synthetic */ C2894jd(Object obj, Object obj2, long j, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = j;
        this.e = obj3;
    }
}
