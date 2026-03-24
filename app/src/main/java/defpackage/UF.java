package defpackage;

/* loaded from: classes.dex */
public final class UF extends AbstractC3400sr implements InterfaceC2631en {
    public final /* synthetic */ InterfaceC2631en a;
    public final /* synthetic */ KJ b;
    public final /* synthetic */ InterfaceC3396sn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UF(C3388sf c3388sf, KJ kj) {
        super(1);
        C3442tf c3442tf = C3442tf.a;
        this.a = c3388sf;
        this.b = kj;
        this.c = c3442tf;
    }

    @Override // defpackage.InterfaceC2631en
    public final Object invoke(Object obj) {
        DK dk;
        DK dk2;
        Throwable th = (Throwable) obj;
        this.a.invoke(th);
        KJ kj = this.b;
        ((R7) kj.c).j(false, th);
        do {
            Object objB = ((R7) kj.c).B();
            dk = null;
            if (objB instanceof C2654f9) {
                objB = null;
            }
            dk2 = DK.a;
            if (objB != null) {
                this.c.invoke(objB, th);
                dk = dk2;
            }
        } while (dk != null);
        return dk2;
    }
}
