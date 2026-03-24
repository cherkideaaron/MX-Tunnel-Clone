package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class Qr extends Jr {
    public final boolean a;
    public C0311Rj b;
    public Ir c;
    public final WeakReference d;
    public int e;
    public boolean f;
    public boolean g;
    public final ArrayList h;
    public final WG i;

    public Qr(Or or) {
        AbstractC0500aq.m(or, "provider");
        new AtomicReference(null);
        this.a = true;
        this.b = new C0311Rj();
        Ir ir = Ir.b;
        this.c = ir;
        this.h = new ArrayList();
        this.d = new WeakReference(or);
        this.i = new WG(ir);
    }

    @Override // defpackage.Jr
    public final void a(Nr nr) {
        Mr c0443Zf;
        Or or;
        ArrayList arrayList = this.h;
        int i = 1;
        AbstractC0500aq.m(nr, "observer");
        d("addObserver");
        Ir ir = this.c;
        Ir ir2 = Ir.a;
        if (ir != ir2) {
            ir2 = Ir.b;
        }
        Pr pr = new Pr();
        HashMap map = Sr.a;
        boolean z = nr instanceof Mr;
        boolean z2 = nr instanceof InterfaceC0409Xf;
        if (z && z2) {
            c0443Zf = new C0443Zf((InterfaceC0409Xf) nr, (Mr) nr);
        } else if (z2) {
            c0443Zf = new C0443Zf((InterfaceC0409Xf) nr, (Mr) null);
        } else if (z) {
            c0443Zf = (Mr) nr;
        } else {
            Class<?> cls = nr.getClass();
            if (Sr.b(cls) == 2) {
                Object obj = Sr.b.get(cls);
                AbstractC0500aq.j(obj);
                List list = (List) obj;
                if (list.size() == 1) {
                    c0443Zf = new C2984lB(Sr.a((Constructor) list.get(0), nr), 4);
                } else {
                    int size = list.size();
                    InterfaceC0179Jn[] interfaceC0179JnArr = new InterfaceC0179Jn[size];
                    for (int i2 = 0; i2 < size; i2++) {
                        interfaceC0179JnArr[i2] = Sr.a((Constructor) list.get(i2), nr);
                    }
                    c0443Zf = new C2984lB(interfaceC0179JnArr, i);
                }
            } else {
                c0443Zf = new C0443Zf(nr);
            }
        }
        pr.b = c0443Zf;
        pr.a = ir2;
        if (((Pr) this.b.c(nr, pr)) == null && (or = (Or) this.d.get()) != null) {
            boolean z3 = this.e != 0 || this.f;
            Ir irC = c(nr);
            this.e++;
            while (pr.a.compareTo(irC) < 0 && this.b.e.containsKey(nr)) {
                arrayList.add(pr.a);
                Fr fr = Hr.Companion;
                Ir ir3 = pr.a;
                fr.getClass();
                Hr hrB = Fr.b(ir3);
                if (hrB == null) {
                    throw new IllegalStateException("no event up from " + pr.a);
                }
                pr.a(or, hrB);
                arrayList.remove(arrayList.size() - 1);
                irC = c(nr);
            }
            if (!z3) {
                h();
            }
            this.e--;
        }
    }

    @Override // defpackage.Jr
    public final void b(Nr nr) {
        AbstractC0500aq.m(nr, "observer");
        d("removeObserver");
        this.b.b(nr);
    }

    public final Ir c(Nr nr) {
        Pr pr;
        HashMap map = this.b.e;
        C3261qD c3261qD = map.containsKey(nr) ? ((C3261qD) map.get(nr)).d : null;
        Ir ir = (c3261qD == null || (pr = (Pr) c3261qD.b) == null) ? null : pr.a;
        ArrayList arrayList = this.h;
        Ir ir2 = arrayList.isEmpty() ^ true ? (Ir) arrayList.get(arrayList.size() - 1) : null;
        Ir ir3 = this.c;
        AbstractC0500aq.m(ir3, "state1");
        if (ir == null || ir.compareTo(ir3) >= 0) {
            ir = ir3;
        }
        return (ir2 == null || ir2.compareTo(ir) >= 0) ? ir : ir2;
    }

    public final void d(String str) {
        if (this.a) {
            Q3.X().s.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(AbstractC3264qG.x("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void e(Hr hr) {
        AbstractC0500aq.m(hr, "event");
        d("handleLifecycleEvent");
        f(hr.a());
    }

    public final void f(Ir ir) {
        if (this.c == ir) {
            return;
        }
        Or or = (Or) this.d.get();
        Ir ir2 = this.c;
        AbstractC0500aq.m(ir2, "current");
        if (ir2 == Ir.b && ir == Ir.a) {
            throw new IllegalStateException(("State must be at least '" + Ir.c + "' to be moved to '" + ir + "' in component " + or).toString());
        }
        Ir ir3 = Ir.a;
        if (ir2 == ir3 && ir2 != ir) {
            throw new IllegalStateException(("State is '" + ir3 + "' and cannot be moved to `" + ir + "` in component " + or).toString());
        }
        this.c = ir;
        if (this.f || this.e != 0) {
            this.g = true;
            return;
        }
        this.f = true;
        h();
        this.f = false;
        if (this.c == ir3) {
            this.b = new C0311Rj();
        }
    }

    public final void g() {
        Ir ir = Ir.c;
        d("setCurrentState");
        f(ir);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r7.g = false;
        r7.i.c(r7.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Qr.h():void");
    }
}
