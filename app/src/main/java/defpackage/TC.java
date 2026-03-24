package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public abstract class TC {
    public volatile C0399Wm a;
    public Executor b;
    public UH c;
    public final C2962kq d;
    public boolean e;
    public boolean f;
    public List g;
    public final ReentrantReadWriteLock h = new ReentrantReadWriteLock();
    public final ThreadLocal i = new ThreadLocal();

    public TC() {
        new ConcurrentHashMap();
        this.d = d();
    }

    public final void a() {
        if (!this.e && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!((SQLiteDatabase) this.c.d().b).inTransaction() && this.i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        a();
        C0399Wm c0399WmD = this.c.d();
        this.d.c(c0399WmD);
        c0399WmD.a();
    }

    public abstract C2962kq d();

    public abstract UH e(C3766zf c3766zf);

    public final void f() {
        this.c.d().h();
        if (((SQLiteDatabase) this.c.d().b).inTransaction()) {
            return;
        }
        C2962kq c2962kq = this.d;
        if (c2962kq.d.compareAndSet(false, true)) {
            c2962kq.c.b.execute(c2962kq.i);
        }
    }

    public final Cursor g(VH vh) {
        a();
        b();
        return this.c.d().j(vh);
    }

    public final void h() {
        this.c.d().l();
    }
}
