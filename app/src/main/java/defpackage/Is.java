package defpackage;

import android.os.Looper;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class Is {
    public static final Object k = new Object();
    public final Object a = new Object();
    public final C3423tD b = new C3423tD();
    public int c = 0;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final RunnableC2705g5 j;

    public Is() {
        Object obj = k;
        this.f = obj;
        this.j = new RunnableC2705g5(this, 17);
        this.e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        Q3.X().s.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(AbstractC3264qG.x("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(Hs hs) {
        if (hs.b) {
            if (!hs.k()) {
                hs.d(false);
                return;
            }
            int i = hs.c;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            hs.c = i2;
            hs.a.d(this.e);
        }
    }

    public final void c(Hs hs) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (hs != null) {
                b(hs);
                hs = null;
            } else {
                C3423tD c3423tD = this.b;
                c3423tD.getClass();
                C3315rD c3315rD = new C3315rD(c3423tD);
                c3423tD.c.put(c3315rD, Boolean.FALSE);
                while (c3315rD.hasNext()) {
                    b((Hs) ((Map.Entry) c3315rD.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public final void d(Or or, Ps ps) {
        Object obj;
        a("observe");
        if (((Qr) or.getLifecycle()).c == Ir.a) {
            return;
        }
        Gs gs = new Gs(this, or, ps);
        C3423tD c3423tD = this.b;
        C3261qD c3261qDA = c3423tD.a(ps);
        if (c3261qDA != null) {
            obj = c3261qDA.b;
        } else {
            C3261qD c3261qD = new C3261qD(ps, gs);
            c3423tD.d++;
            C3261qD c3261qD2 = c3423tD.b;
            if (c3261qD2 == null) {
                c3423tD.a = c3261qD;
            } else {
                c3261qD2.c = c3261qD;
                c3261qD.d = c3261qD2;
            }
            c3423tD.b = c3261qD;
            obj = null;
        }
        Hs hs = (Hs) obj;
        if (hs != null && !hs.j(or)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (hs != null) {
            return;
        }
        or.getLifecycle().a(gs);
    }

    public void g(Tw tw) {
        a("removeObserver");
        Hs hs = (Hs) this.b.b(tw);
        if (hs == null) {
            return;
        }
        hs.i();
        hs.d(false);
    }

    public abstract void h(Object obj);

    public void e() {
    }

    public void f() {
    }
}
