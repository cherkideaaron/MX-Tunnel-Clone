package defpackage;

/* renamed from: yK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3700yK extends AbstractC0219Mc {
    public static final /* synthetic */ int c = 0;

    static {
        new C3700yK();
    }

    @Override // defpackage.AbstractC0219Mc
    public final void e(InterfaceC0168Jc interfaceC0168Jc, Runnable runnable) {
        Vs.r(interfaceC0168Jc.get(LO.b));
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // defpackage.AbstractC0219Mc
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
