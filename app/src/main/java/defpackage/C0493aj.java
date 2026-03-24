package defpackage;

/* renamed from: aj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0493aj extends AbstractRunnableC0548bj {
    public final Runnable c;

    public C0493aj(long j, RunnableC0584cJ runnableC0584cJ) {
        super(j);
        this.c = runnableC0584cJ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    @Override // defpackage.AbstractRunnableC0548bj
    public final String toString() {
        return super.toString() + this.c;
    }
}
