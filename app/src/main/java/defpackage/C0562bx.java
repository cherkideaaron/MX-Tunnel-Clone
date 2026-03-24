package defpackage;

/* renamed from: bx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0562bx implements InterfaceC3688y8 {
    public final C3288qm a;
    public final /* synthetic */ C2532cx b;

    public C0562bx(C2532cx c2532cx, C3288qm c3288qm) {
        this.b = c2532cx;
        this.a = c3288qm;
    }

    @Override // defpackage.InterfaceC3688y8
    public final void cancel() {
        C2532cx c2532cx = this.b;
        T3 t3 = c2532cx.b;
        C3288qm c3288qm = this.a;
        t3.remove(c3288qm);
        if (AbstractC0500aq.b(c2532cx.c, c3288qm)) {
            c3288qm.getClass();
            c2532cx.c = null;
        }
        c3288qm.getClass();
        c3288qm.b.remove(this);
        InterfaceC0606cn interfaceC0606cn = c3288qm.c;
        if (interfaceC0606cn != null) {
            interfaceC0606cn.invoke();
        }
        c3288qm.c = null;
    }
}
