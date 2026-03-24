package defpackage;

/* loaded from: classes.dex */
public final class UJ extends QJ {
    public final /* synthetic */ int a = 1;
    public PJ b;

    public /* synthetic */ UJ() {
    }

    @Override // defpackage.QJ, defpackage.OJ
    public void a(PJ pj) {
        switch (this.a) {
            case 1:
                VJ vj = (VJ) this.b;
                if (!vj.K) {
                    vj.I();
                    vj.K = true;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.OJ
    public final void c(PJ pj) {
        switch (this.a) {
            case 0:
                this.b.B();
                pj.y(this);
                break;
            default:
                VJ vj = (VJ) this.b;
                int i = vj.J - 1;
                vj.J = i;
                if (i == 0) {
                    vj.K = false;
                    vj.n();
                }
                pj.y(this);
                break;
        }
    }

    public UJ(PJ pj) {
        this.b = pj;
    }
}
