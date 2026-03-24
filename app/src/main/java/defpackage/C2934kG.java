package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: kG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2934kG extends AbstractC3691yB {
    public boolean a = false;
    public final /* synthetic */ Hy b;

    public C2934kG(Hy hy) {
        this.b = hy;
    }

    @Override // defpackage.AbstractC3691yB
    public final void a(int i) {
        if (i == 0 && this.a) {
            this.a = false;
            this.b.f();
        }
    }

    @Override // defpackage.AbstractC3691yB
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.a = true;
    }
}
