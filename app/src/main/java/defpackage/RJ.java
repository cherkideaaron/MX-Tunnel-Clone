package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class RJ extends QJ {
    public final /* synthetic */ Z3 a;
    public final /* synthetic */ SJ b;

    public RJ(SJ sj, Z3 z3) {
        this.b = sj;
        this.a = z3;
    }

    @Override // defpackage.OJ
    public final void c(PJ pj) {
        ((ArrayList) this.a.get(this.b.b)).remove(pj);
        pj.y(this);
    }
}
