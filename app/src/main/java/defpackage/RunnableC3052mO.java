package defpackage;

/* renamed from: mO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC3052mO implements Runnable {
    public final C3107nO a;
    public final String b;

    public RunnableC3052mO(C3107nO c3107nO, String str) {
        this.a = c3107nO;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a.d) {
            try {
                if (((RunnableC3052mO) this.a.b.remove(this.b)) != null) {
                    InterfaceC2997lO interfaceC2997lO = (InterfaceC2997lO) this.a.c.remove(this.b);
                    if (interfaceC2997lO != null) {
                        String str = this.b;
                        C3130nt.d().a(C3282qg.p, "Exceeded time limits on execution for " + str, new Throwable[0]);
                        ((C3282qg) interfaceC2997lO).e();
                    }
                } else {
                    C3130nt.d().a("WrkTimerRunnable", "Timer with " + this.b + " is already marked as complete.", new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
