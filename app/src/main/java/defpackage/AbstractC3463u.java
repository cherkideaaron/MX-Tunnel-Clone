package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3463u implements As {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(AbstractC3463u.class.getName());
    public static final AbstractC3279qd f;
    public static final Object m;
    public volatile Object a;
    public volatile C3192p b;
    public volatile C3409t c;

    static {
        AbstractC3279qd c3355s;
        try {
            c3355s = new C3247q(AtomicReferenceFieldUpdater.newUpdater(C3409t.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C3409t.class, C3409t.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC3463u.class, C3409t.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC3463u.class, C3192p.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC3463u.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c3355s = new C3355s();
        }
        f = c3355s;
        if (th != null) {
            e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        m = new Object();
    }

    public static void b(AbstractC3463u abstractC3463u) {
        C3192p c3192p;
        C3192p c3192p2;
        C3192p c3192p3 = null;
        while (true) {
            C3409t c3409t = abstractC3463u.c;
            if (f.j(abstractC3463u, c3409t, C3409t.c)) {
                while (c3409t != null) {
                    Thread thread = c3409t.a;
                    if (thread != null) {
                        c3409t.a = null;
                        LockSupport.unpark(thread);
                    }
                    c3409t = c3409t.b;
                }
                do {
                    c3192p = abstractC3463u.b;
                } while (!f.h(abstractC3463u, c3192p, C3192p.d));
                while (true) {
                    c3192p2 = c3192p3;
                    c3192p3 = c3192p;
                    if (c3192p3 == null) {
                        break;
                    }
                    c3192p = c3192p3.c;
                    c3192p3.c = c3192p2;
                }
                while (c3192p2 != null) {
                    c3192p3 = c3192p2.c;
                    Runnable runnable = c3192p2.a;
                    if (runnable instanceof r) {
                        r rVar = (r) runnable;
                        abstractC3463u = rVar.a;
                        if (abstractC3463u.a == rVar) {
                            if (f.i(abstractC3463u, rVar, e(rVar.b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        c(runnable, c3192p2.b);
                    }
                    c3192p2 = c3192p3;
                }
                return;
            }
        }
    }

    public static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object d(Object obj) throws ExecutionException {
        if (obj instanceof C3027m) {
            Throwable th = ((C3027m) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C3137o) {
            throw new ExecutionException(((C3137o) obj).a);
        }
        if (obj == m) {
            return null;
        }
        return obj;
    }

    public static Object e(As as) {
        if (as instanceof AbstractC3463u) {
            Object obj = ((AbstractC3463u) as).a;
            if (!(obj instanceof C3027m)) {
                return obj;
            }
            C3027m c3027m = (C3027m) obj;
            return c3027m.a ? c3027m.b != null ? new C3027m(false, c3027m.b) : C3027m.d : obj;
        }
        boolean zIsCancelled = as.isCancelled();
        if ((!d) && zIsCancelled) {
            return C3027m.d;
        }
        try {
            Object objF = f(as);
            return objF == null ? m : objF;
        } catch (CancellationException e2) {
            if (zIsCancelled) {
                return new C3027m(false, e2);
            }
            return new C3137o(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + as, e2));
        } catch (ExecutionException e3) {
            return new C3137o(e3.getCause());
        } catch (Throwable th) {
            return new C3137o(th);
        }
    }

    public static Object f(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
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
        return obj;
    }

    public final void a(StringBuilder sb) {
        String str = "]";
        try {
            Object objF = f(this);
            sb.append("SUCCESS, result=[");
            sb.append(objF == this ? "this future" : String.valueOf(objF));
            sb.append("]");
        } catch (CancellationException unused) {
            str = "CANCELLED";
            sb.append(str);
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            str = " thrown from get()]";
            sb.append(str);
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append(str);
        }
    }

    @Override // defpackage.As
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        C3192p c3192p = this.b;
        C3192p c3192p2 = C3192p.d;
        if (c3192p != c3192p2) {
            C3192p c3192p3 = new C3192p(runnable, executor);
            do {
                c3192p3.c = c3192p;
                if (f.h(this, c3192p, c3192p3)) {
                    return;
                } else {
                    c3192p = this.b;
                }
            } while (c3192p != c3192p2);
        }
        c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.a;
        if (!(obj == null) && !(obj instanceof r)) {
            return false;
        }
        C3027m c3027m = d ? new C3027m(z, new CancellationException("Future.cancel() was called.")) : z ? C3027m.c : C3027m.d;
        AbstractC3463u abstractC3463u = this;
        boolean z2 = false;
        while (true) {
            if (f.i(abstractC3463u, obj, c3027m)) {
                b(abstractC3463u);
                if (!(obj instanceof r)) {
                    return true;
                }
                As as = ((r) obj).b;
                if (!(as instanceof AbstractC3463u)) {
                    as.cancel(z);
                    return true;
                }
                abstractC3463u = (AbstractC3463u) as;
                obj = abstractC3463u.a;
                if (!(obj == null) && !(obj instanceof r)) {
                    return true;
                }
                z2 = true;
            } else {
                obj = abstractC3463u.a;
                if (!(obj instanceof r)) {
                    return z2;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String g() {
        Object obj = this.a;
        if (obj instanceof r) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            As as = ((r) obj).b;
            return AbstractC3264qG.l(sb, as == this ? "this future" : String.valueOf(as), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.a;
        if ((obj2 != null) && (!(obj2 instanceof r))) {
            return d(obj2);
        }
        C3409t c3409t = this.c;
        C3409t c3409t2 = C3409t.c;
        if (c3409t != c3409t2) {
            C3409t c3409t3 = new C3409t();
            do {
                AbstractC3279qd abstractC3279qd = f;
                abstractC3279qd.U(c3409t3, c3409t);
                if (abstractC3279qd.j(this, c3409t, c3409t3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            h(c3409t3);
                            throw new InterruptedException();
                        }
                        obj = this.a;
                    } while (!((obj != null) & (!(obj instanceof r))));
                    return d(obj);
                }
                c3409t = this.c;
            } while (c3409t != c3409t2);
        }
        return d(this.a);
    }

    public final void h(C3409t c3409t) {
        c3409t.a = null;
        while (true) {
            C3409t c3409t2 = this.c;
            if (c3409t2 == C3409t.c) {
                return;
            }
            C3409t c3409t3 = null;
            while (c3409t2 != null) {
                C3409t c3409t4 = c3409t2.b;
                if (c3409t2.a != null) {
                    c3409t3 = c3409t2;
                } else if (c3409t3 != null) {
                    c3409t3.b = c3409t4;
                    if (c3409t3.a == null) {
                        break;
                    }
                } else if (!f.j(this, c3409t2, c3409t4)) {
                    break;
                }
                c3409t2 = c3409t4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof C3027m;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof r)) & (this.a != null);
    }

    public final String toString() {
        String strG;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (!(this.a instanceof C3027m)) {
            if (isDone()) {
                a(sb);
            } else {
                try {
                    strG = g();
                } catch (RuntimeException e2) {
                    strG = "Exception thrown from implementation: " + e2.getClass();
                }
                if (strG == null || strG.isEmpty()) {
                    str = isDone() ? "CANCELLED" : "PENDING";
                    a(sb);
                } else {
                    sb.append("PENDING, info=[");
                    sb.append(strG);
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

    /* JADX WARN: Removed duplicated region for block: B:46:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00a8 -> B:36:0x0074). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(long r20, java.util.concurrent.TimeUnit r22) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC3463u.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }
}
