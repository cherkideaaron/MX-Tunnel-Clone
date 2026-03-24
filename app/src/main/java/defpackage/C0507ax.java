package defpackage;

/* renamed from: ax, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0507ax implements Mr, InterfaceC3688y8 {
    public final Jr a;
    public final C3288qm b;
    public C0562bx c;
    public final /* synthetic */ C2532cx d;

    public C0507ax(C2532cx c2532cx, Jr jr, C3288qm c3288qm) {
        AbstractC0500aq.m(jr, "lifecycle");
        this.d = c2532cx;
        this.a = jr;
        this.b = c3288qm;
        jr.a(this);
    }

    @Override // defpackage.Mr
    public final void c(Or or, Hr hr) {
        if (hr != Hr.ON_START) {
            if (hr != Hr.ON_STOP) {
                if (hr == Hr.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                C0562bx c0562bx = this.c;
                if (c0562bx != null) {
                    c0562bx.cancel();
                    return;
                }
                return;
            }
        }
        C2532cx c2532cx = this.d;
        c2532cx.getClass();
        C3288qm c3288qm = this.b;
        AbstractC0500aq.m(c3288qm, "onBackPressedCallback");
        c2532cx.b.addLast(c3288qm);
        C0562bx c0562bx2 = new C0562bx(c2532cx, c3288qm);
        c3288qm.b.add(c0562bx2);
        c2532cx.c();
        c3288qm.c = new C0322Sd(0, c2532cx, C2532cx.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 4);
        this.c = c0562bx2;
    }

    @Override // defpackage.InterfaceC3688y8
    public final void cancel() {
        this.a.b(this);
        C3288qm c3288qm = this.b;
        c3288qm.getClass();
        c3288qm.b.remove(this);
        C0562bx c0562bx = this.c;
        if (c0562bx != null) {
            c0562bx.cancel();
        }
        this.c = null;
    }
}
