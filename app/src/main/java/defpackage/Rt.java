package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class Rt extends LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ Ut F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rt(Ut ut, int i, int i2) {
        super(i);
        this.F = ut;
        this.E = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void C0(GB gb, int[] iArr) {
        int i = this.E;
        Ut ut = this.F;
        if (i == 0) {
            iArr[0] = ut.n.getWidth();
            iArr[1] = ut.n.getWidth();
        } else {
            iArr[0] = ut.n.getHeight();
            iArr[1] = ut.n.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.AbstractC3529vB
    public final void z0(RecyclerView recyclerView, int i) {
        C2716gG c2716gG = new C2716gG(recyclerView.getContext());
        c2716gG.a = i;
        A0(c2716gG);
    }
}
