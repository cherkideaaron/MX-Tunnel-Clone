package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class I implements As {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(I.class.getName());
    public static final AbstractC0500aq f;
    public static final Object m;
    public volatile Object a;
    public volatile E b;
    public volatile H c;

    static {
        AbstractC0500aq g;
        try {
            g = new F(AtomicReferenceFieldUpdater.newUpdater(H.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(H.class, H.class, "b"), AtomicReferenceFieldUpdater.newUpdater(I.class, H.class, "c"), AtomicReferenceFieldUpdater.newUpdater(I.class, E.class, "b"), AtomicReferenceFieldUpdater.newUpdater(I.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            g = new G();
        }
        f = g;
        if (th != null) {
            e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        m = new Object();
    }

    public static void c(I i) {
        H h;
        E e2;
        E e3;
        E e4;
        do {
            h = i.c;
        } while (!f.h(i, h, H.c));
        while (true) {
            e2 = null;
            if (h == null) {
                break;
            }
            Thread thread = h.a;
            if (thread != null) {
                h.a = null;
                LockSupport.unpark(thread);
            }
            h = h.b;
        }
        i.b();
        do {
            e3 = i.b;
        } while (!f.f(i, e3, E.d));
        while (true) {
            e4 = e2;
            e2 = e3;
            if (e2 == null) {
                break;
            }
            e3 = e2.c;
            e2.c = e4;
        }
        while (e4 != null) {
            E e5 = e4.c;
            d(e4.a, e4.b);
            e4 = e5;
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object e(Object obj) throws ExecutionException {
        if (obj instanceof C) {
            Throwable th = ((C) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof D) {
            throw new ExecutionException(((D) obj).a);
        }
        if (obj == m) {
            return null;
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        Object obj;
        String str = "]";
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (CancellationException unused) {
                    str = "CANCELLED";
                    sb.append(str);
                    return;
                } catch (RuntimeException e2) {
                    sb.append("UNKNOWN, cause=[");
                    sb.append(e2.getClass());
                    str = " thrown from get()]";
                    sb.append(str);
                    return;
                } catch (ExecutionException e3) {
                    sb.append("FAILURE, cause=[");
                    sb.append(e3.getCause());
                    sb.append(str);
                    return;
                }
            } catch (InterruptedException unused2) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    @Override // defpackage.As
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        E e2 = this.b;
        E e3 = E.d;
        if (e2 != e3) {
            E e4 = new E(runnable, executor);
            do {
                e4.c = e2;
                if (f.f(this, e2, e4)) {
                    return;
                } else {
                    e2 = this.b;
                }
            } while (e2 != e3);
        }
        d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.a;
        if (obj == null) {
            if (f.g(this, obj, d ? new C(z, new CancellationException("Future.cancel() was called.")) : z ? C.c : C.d)) {
                c(this);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String f() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void g(H h) {
        h.a = null;
        while (true) {
            H h2 = this.c;
            if (h2 == H.c) {
                return;
            }
            H h3 = null;
            while (h2 != null) {
                H h4 = h2.b;
                if (h2.a != null) {
                    h3 = h2;
                } else if (h3 != null) {
                    h3.b = h4;
                    if (h3.a == null) {
                        break;
                    }
                } else if (!f.h(this, h2, h4)) {
                    break;
                }
                h2 = h4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.a;
        if ((obj2 != null) && true) {
            return e(obj2);
        }
        H h = this.c;
        H h2 = H.c;
        if (h != h2) {
            H h3 = new H();
            do {
                AbstractC0500aq abstractC0500aq = f;
                abstractC0500aq.T(h3, h);
                if (abstractC0500aq.h(this, h, h3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            g(h3);
                            throw new InterruptedException();
                        }
                        obj = this.a;
                    } while (!((obj != null) & true));
                    return e(obj);
                }
                h = this.c;
            } while (h != h2);
        }
        return e(this.a);
    }

    public boolean h(Object obj) {
        if (obj == null) {
            obj = m;
        }
        if (!f.g(this, null, obj)) {
            return false;
        }
        c(this);
        return true;
    }

    public boolean i(Throwable th) {
        th.getClass();
        if (!f.g(this, null, new D(th))) {
            return false;
        }
        c(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof C;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.a != null) & true;
    }

    public final String toString() {
        String strF;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (!(this.a instanceof C)) {
            if (isDone()) {
                a(sb);
            } else {
                try {
                    strF = f();
                } catch (RuntimeException e2) {
                    strF = "Exception thrown from implementation: " + e2.getClass();
                }
                if (strF == null || strF.isEmpty()) {
                    str = isDone() ? "CANCELLED" : "PENDING";
                    a(sb);
                } else {
                    sb.append("PENDING, info=[");
                    sb.append(strF);
                    sb.append("]");
                }
            }
            sb.append("]");
            return sb.toString();
        }
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x009f -> B:36:0x006e). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(long r20, java.util.concurrent.TimeUnit r22) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.I.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public void b() {
    }
}
