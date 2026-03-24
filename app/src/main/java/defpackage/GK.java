package defpackage;

/* loaded from: classes2.dex */
public final class GK extends AbstractC0219Mc {
    public static final GK c = new GK();

    @Override // defpackage.AbstractC0219Mc
    public final void e(InterfaceC0168Jc interfaceC0168Jc, Runnable runnable) {
        C0545bg.d.c.b(runnable, true, false);
    }

    @Override // defpackage.AbstractC0219Mc
    public final AbstractC0219Mc g(int i, String str) {
        AbstractC2883jK.l(i);
        return i >= AbstractC3590wI.d ? str != null ? new Xv(this, str) : this : super.g(i, str);
    }

    @Override // defpackage.AbstractC0219Mc
    public final String toString() {
        return "Dispatchers.IO";
    }
}
