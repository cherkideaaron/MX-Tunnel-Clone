package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
public final class QN implements InterfaceC0201Lb {
    public static final String d = C3130nt.f("WorkConstraintsTracker");
    public final PN a;
    public final AbstractC0218Mb[] b;
    public final Object c;

    public QN(Context context, InterfaceC3482uI interfaceC3482uI, PN pn) {
        Context applicationContext = context.getApplicationContext();
        this.a = pn;
        this.b = new AbstractC0218Mb[]{new C3579w7((C3633x7) KJ.i(applicationContext, interfaceC3482uI).a, 0), new C3579w7((C3687y7) KJ.i(applicationContext, interfaceC3482uI).b, 1), new C3579w7((C3045mH) KJ.i(applicationContext, interfaceC3482uI).d, 4), new C3579w7((C3298qw) KJ.i(applicationContext, interfaceC3482uI).c, 2), new C3579w7((C3298qw) KJ.i(applicationContext, interfaceC3482uI).c, 3), new C3023lw((C3298qw) KJ.i(applicationContext, interfaceC3482uI).c), new C2968kw((C3298qw) KJ.i(applicationContext, interfaceC3482uI).c)};
        this.c = new Object();
    }

    public final boolean a(String str) {
        synchronized (this.c) {
            try {
                for (AbstractC0218Mb abstractC0218Mb : this.b) {
                    Object obj = abstractC0218Mb.b;
                    if (obj != null && abstractC0218Mb.b(obj) && abstractC0218Mb.a.contains(str)) {
                        C3130nt.d().a(d, "Work " + str + " constrained by " + abstractC0218Mb.getClass().getSimpleName(), new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(ArrayList arrayList) {
        synchronized (this.c) {
            PN pn = this.a;
            if (pn != null) {
                pn.d(arrayList);
            }
        }
    }

    public final void c(Collection collection) {
        synchronized (this.c) {
            try {
                for (AbstractC0218Mb abstractC0218Mb : this.b) {
                    if (abstractC0218Mb.d != null) {
                        abstractC0218Mb.d = null;
                        abstractC0218Mb.d(null, abstractC0218Mb.b);
                    }
                }
                for (AbstractC0218Mb abstractC0218Mb2 : this.b) {
                    abstractC0218Mb2.c(collection);
                }
                for (AbstractC0218Mb abstractC0218Mb3 : this.b) {
                    if (abstractC0218Mb3.d != this) {
                        abstractC0218Mb3.d = this;
                        abstractC0218Mb3.d(this, abstractC0218Mb3.b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.c) {
            try {
                for (AbstractC0218Mb abstractC0218Mb : this.b) {
                    ArrayList arrayList = abstractC0218Mb.a;
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        abstractC0218Mb.c.b(abstractC0218Mb);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
