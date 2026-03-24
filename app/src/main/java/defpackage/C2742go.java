package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: go, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2742go implements LD, PN, InterfaceC2900jj {
    public static final String o = C3130nt.f("GreedyScheduler");
    public final Context a;
    public final C0589cO b;
    public final QN c;
    public final C3335rg e;
    public boolean f;
    public Boolean n;
    public final HashSet d = new HashSet();
    public final Object m = new Object();

    public C2742go(Context context, C2770hF c2770hF, D3 d3, C0589cO c0589cO) {
        this.a = context;
        this.b = c0589cO;
        this.c = new QN(context, d3, this);
        this.e = new C3335rg(this, (C2524cp) c2770hF.h);
    }

    @Override // defpackage.LD
    public final boolean a() {
        return false;
    }

    @Override // defpackage.InterfaceC2900jj
    public final void b(String str, boolean z) {
        synchronized (this.m) {
            try {
                Iterator it = this.d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C2834iO c2834iO = (C2834iO) it.next();
                    if (c2834iO.a.equals(str)) {
                        C3130nt.d().a(o, "Stopping tracking for " + str, new Throwable[0]);
                        this.d.remove(c2834iO);
                        this.c.c(this.d);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.LD
    public final void c(String str) {
        Runnable runnable;
        Boolean bool = this.n;
        C0589cO c0589cO = this.b;
        if (bool == null) {
            this.n = Boolean.valueOf(Nz.a(this.a, c0589cO.x));
        }
        boolean zBooleanValue = this.n.booleanValue();
        String str2 = o;
        if (!zBooleanValue) {
            C3130nt.d().e(str2, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.f) {
            c0589cO.B.a(this);
            this.f = true;
        }
        C3130nt.d().a(str2, AbstractC3264qG.w("Cancelling work ID ", str), new Throwable[0]);
        C3335rg c3335rg = this.e;
        if (c3335rg != null && (runnable = (Runnable) c3335rg.c.remove(str)) != null) {
            ((Handler) c3335rg.b.b).removeCallbacks(runnable);
        }
        c0589cO.X(str);
    }

    @Override // defpackage.PN
    public final void d(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C3130nt.d().a(o, AbstractC3264qG.w("Constraints not met: Cancelling work ID ", str), new Throwable[0]);
            this.b.X(str);
        }
    }

    @Override // defpackage.LD
    public final void e(C2834iO... c2834iOArr) {
        if (this.n == null) {
            this.n = Boolean.valueOf(Nz.a(this.a, this.b.x));
        }
        if (!this.n.booleanValue()) {
            C3130nt.d().e(o, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.f) {
            this.b.B.a(this);
            this.f = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C2834iO c2834iO : c2834iOArr) {
            long jA = c2834iO.a();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (c2834iO.b == 1) {
                if (jCurrentTimeMillis < jA) {
                    C3335rg c3335rg = this.e;
                    if (c3335rg != null) {
                        HashMap map = c3335rg.c;
                        Runnable runnable = (Runnable) map.remove(c2834iO.a);
                        C2524cp c2524cp = c3335rg.b;
                        if (runnable != null) {
                            ((Handler) c2524cp.b).removeCallbacks(runnable);
                        }
                        RunnableC3680y0 runnableC3680y0 = new RunnableC3680y0(9, c3335rg, c2834iO);
                        map.put(c2834iO.a, runnableC3680y0);
                        ((Handler) c2524cp.b).postDelayed(runnableC3680y0, c2834iO.a() - System.currentTimeMillis());
                    }
                } else if (c2834iO.b()) {
                    int i = Build.VERSION.SDK_INT;
                    C2675fc c2675fc = c2834iO.j;
                    if (c2675fc.c) {
                        C3130nt.d().a(o, "Ignoring WorkSpec " + c2834iO + ", Requires device idle.", new Throwable[0]);
                    } else if (i < 24 || c2675fc.h.a.size() <= 0) {
                        hashSet.add(c2834iO);
                        hashSet2.add(c2834iO.a);
                    } else {
                        C3130nt.d().a(o, "Ignoring WorkSpec " + c2834iO + ", Requires ContentUri triggers.", new Throwable[0]);
                    }
                } else {
                    C3130nt.d().a(o, AbstractC3264qG.w("Starting work for ", c2834iO.a), new Throwable[0]);
                    this.b.W(c2834iO.a, null);
                }
            }
        }
        synchronized (this.m) {
            try {
                if (!hashSet.isEmpty()) {
                    C3130nt.d().a(o, "Starting tracking for [" + TextUtils.join(",", hashSet2) + "]", new Throwable[0]);
                    this.d.addAll(hashSet);
                    this.c.c(this.d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.PN
    public final void f(List list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C3130nt.d().a(o, AbstractC3264qG.w("Constraints met: Scheduling work ID ", str), new Throwable[0]);
            this.b.W(str, null);
        }
    }
}
