package defpackage;

/* renamed from: uD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC3477uD implements Runnable {
    public final /* synthetic */ int a;
    public final Runnable b;

    public /* synthetic */ RunnableC3477uD(Runnable runnable, int i) {
        this.a = i;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                try {
                    this.b.run();
                    break;
                } catch (Exception e) {
                    AbstractC3279qd.t(e, "Executor", "Background execution failure.");
                    return;
                }
            default:
                this.b.run();
                break;
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return this.b.toString();
            default:
                return super.toString();
        }
    }
}
