package defpackage;

/* renamed from: Mc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0219Mc extends AbstractC2917k implements InterfaceC3601wc {
    public static final C0202Lc b = new C0202Lc(C3397so.b, new C0185Kc(0));

    public AbstractC0219Mc() {
        super(C3397so.b);
    }

    public abstract void e(InterfaceC0168Jc interfaceC0168Jc, Runnable runnable);

    public boolean f(InterfaceC0168Jc interfaceC0168Jc) {
        return !(this instanceof C3700yK);
    }

    public AbstractC0219Mc g(int i, String str) {
        AbstractC2883jK.l(i);
        return new Vr(this, i, str);
    }

    @Override // defpackage.AbstractC2917k, defpackage.InterfaceC0168Jc
    public final InterfaceC0134Hc get(InterfaceC0151Ic interfaceC0151Ic) {
        AbstractC0500aq.m(interfaceC0151Ic, "key");
        if (!(interfaceC0151Ic instanceof C0202Lc)) {
            if (C3397so.b == interfaceC0151Ic) {
                return this;
            }
            return null;
        }
        C0202Lc c0202Lc = (C0202Lc) interfaceC0151Ic;
        InterfaceC0151Ic interfaceC0151Ic2 = this.a;
        AbstractC0500aq.m(interfaceC0151Ic2, "key");
        if (interfaceC0151Ic2 != c0202Lc && c0202Lc.b != interfaceC0151Ic2) {
            return null;
        }
        InterfaceC0134Hc interfaceC0134Hc = (InterfaceC0134Hc) c0202Lc.a.invoke(this);
        if (interfaceC0134Hc instanceof InterfaceC0134Hc) {
            return interfaceC0134Hc;
        }
        return null;
    }

    @Override // defpackage.AbstractC2917k, defpackage.InterfaceC0168Jc
    public final InterfaceC0168Jc minusKey(InterfaceC0151Ic interfaceC0151Ic) {
        AbstractC0500aq.m(interfaceC0151Ic, "key");
        boolean z = interfaceC0151Ic instanceof C0202Lc;
        C0021Ai c0021Ai = C0021Ai.a;
        if (z) {
            C0202Lc c0202Lc = (C0202Lc) interfaceC0151Ic;
            InterfaceC0151Ic interfaceC0151Ic2 = this.a;
            AbstractC0500aq.m(interfaceC0151Ic2, "key");
            if ((interfaceC0151Ic2 == c0202Lc || c0202Lc.b == interfaceC0151Ic2) && ((InterfaceC0134Hc) c0202Lc.a.invoke(this)) != null) {
                return c0021Ai;
            }
        } else if (C3397so.b == interfaceC0151Ic) {
            return c0021Ai;
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0069Df.u(this);
    }
}
