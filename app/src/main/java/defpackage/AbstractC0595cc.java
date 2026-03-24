package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: cc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0595cc {
    public static final String f = C3130nt.f("ConstraintTracker");
    public final InterfaceC3482uI a;
    public final Context b;
    public final Object c = new Object();
    public final LinkedHashSet d = new LinkedHashSet();
    public Object e;

    public AbstractC0595cc(Context context, InterfaceC3482uI interfaceC3482uI) {
        this.b = context.getApplicationContext();
        this.a = interfaceC3482uI;
    }

    public abstract Object a();

    public final void b(AbstractC0218Mb abstractC0218Mb) {
        synchronized (this.c) {
            try {
                if (this.d.remove(abstractC0218Mb) && this.d.isEmpty()) {
                    e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Object obj) {
        synchronized (this.c) {
            try {
                Object obj2 = this.e;
                if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                    this.e = obj;
                    ((ExecutorC3531vD) ((D3) this.a).d).execute(new RunnableC3680y0(6, this, new ArrayList(this.d)));
                }
            } finally {
            }
        }
    }

    public abstract void d();

    public abstract void e();
}
