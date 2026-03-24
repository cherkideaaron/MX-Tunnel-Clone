package defpackage;

/* loaded from: classes.dex */
public final class Gs extends Hs implements Mr {
    public final Or e;
    public final /* synthetic */ Is f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gs(Is is, Or or, Ps ps) {
        super(is, ps);
        this.f = is;
        this.e = or;
    }

    @Override // defpackage.Mr
    public final void c(Or or, Hr hr) {
        Or or2 = this.e;
        Ir ir = ((Qr) or2.getLifecycle()).c;
        if (ir == Ir.a) {
            this.f.g(this.a);
            return;
        }
        Ir ir2 = null;
        while (ir2 != ir) {
            d(k());
            ir2 = ir;
            ir = ((Qr) or2.getLifecycle()).c;
        }
    }

    @Override // defpackage.Hs
    public final void i() {
        this.e.getLifecycle().b(this);
    }

    @Override // defpackage.Hs
    public final boolean j(Or or) {
        return this.e == or;
    }

    @Override // defpackage.Hs
    public final boolean k() {
        return ((Qr) this.e.getLifecycle()).c.a(Ir.d);
    }
}
