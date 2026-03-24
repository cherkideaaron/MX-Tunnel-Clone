package defpackage;

/* renamed from: hd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2786hd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C2841id b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String d;

    public /* synthetic */ RunnableC2786hd(C2841id c2841id, long j, String str, int i) {
        this.a = i;
        this.b = c2841id;
        this.c = j;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C2841id c2841id = this.b;
                ((ExecutorC0305Rd) c2841id.o.c).a(new RunnableC2786hd(c2841id, this.c, this.d, 1));
                break;
            default:
                C2567dd c2567dd = this.b.g;
                C0288Qd c0288Qd = c2567dd.n;
                if (c0288Qd == null || !c0288Qd.e.get()) {
                    ((InterfaceC2574dk) c2567dd.i.c).n(this.c, this.d);
                    break;
                }
                break;
        }
    }
}
