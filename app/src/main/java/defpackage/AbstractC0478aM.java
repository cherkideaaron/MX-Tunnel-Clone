package defpackage;

import java.util.Iterator;

/* renamed from: aM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0478aM {
    public final C0533bM a = new C0533bM();

    public final void a() {
        C0533bM c0533bM = this.a;
        if (c0533bM != null && !c0533bM.d) {
            c0533bM.d = true;
            synchronized (c0533bM.a) {
                try {
                    Iterator it = c0533bM.b.values().iterator();
                    while (it.hasNext()) {
                        C0533bM.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = c0533bM.c.iterator();
                    while (it2.hasNext()) {
                        C0533bM.a((AutoCloseable) it2.next());
                    }
                    c0533bM.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        b();
    }

    public void b() {
    }
}
