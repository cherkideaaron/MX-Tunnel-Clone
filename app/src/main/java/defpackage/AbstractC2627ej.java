package defpackage;

/* renamed from: ej, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2627ej extends AbstractC0219Mc {
    public static final /* synthetic */ int f = 0;
    public long c;
    public boolean d;
    public T3 e;

    public final void h(boolean z) {
        long j = this.c - (z ? 4294967296L : 1L);
        this.c = j;
        if (j <= 0 && this.d) {
            shutdown();
        }
    }

    public abstract Thread i();

    public final void j(boolean z) {
        this.c = (z ? 4294967296L : 1L) + this.c;
        if (z) {
            return;
        }
        this.d = true;
    }

    public abstract long k();

    public final boolean l() {
        T3 t3 = this.e;
        if (t3 == null) {
            return false;
        }
        AbstractC0546bh abstractC0546bh = (AbstractC0546bh) (t3.isEmpty() ? null : t3.removeFirst());
        if (abstractC0546bh == null) {
            return false;
        }
        abstractC0546bh.run();
        return true;
    }

    public void m(long j, AbstractRunnableC0548bj abstractRunnableC0548bj) {
        RunnableC0171Jf.p.r(j, abstractRunnableC0548bj);
    }

    public abstract void shutdown();
}
