package defpackage;

/* loaded from: classes2.dex */
public abstract class J {
    public XG[] a;
    public int b;
    public int c;

    public final void a(XG xg) {
        synchronized (this) {
            try {
                int i = this.b - 1;
                this.b = i;
                if (i == 0) {
                    this.c = 0;
                }
                AbstractC0500aq.k(xg, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                xg.a.set(null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
