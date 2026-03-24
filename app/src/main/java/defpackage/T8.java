package defpackage;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class T8 extends QJ {
    public boolean a = false;
    public final ViewGroup b;

    public T8(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // defpackage.QJ, defpackage.OJ
    public final void b() {
        AbstractC0500aq.c0(this.b, false);
    }

    @Override // defpackage.OJ
    public final void c(PJ pj) {
        if (!this.a) {
            AbstractC0500aq.c0(this.b, false);
        }
        pj.y(this);
    }

    @Override // defpackage.QJ, defpackage.OJ
    public final void f() {
        AbstractC0500aq.c0(this.b, true);
    }

    @Override // defpackage.QJ, defpackage.OJ
    public final void g(PJ pj) {
        AbstractC0500aq.c0(this.b, false);
        this.a = true;
    }
}
