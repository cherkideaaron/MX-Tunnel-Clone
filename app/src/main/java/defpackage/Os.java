package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class Os extends Qv implements Ks {
    public final Ls n;
    public Or o;
    public Ps p;
    public final int l = 0;
    public final Bundle m = null;
    public Ls q = null;

    public Os(Ls ls) {
        this.n = ls;
        ls.registerListener(0, this);
    }

    @Override // defpackage.Is
    public final void e() {
        this.n.startLoading();
    }

    @Override // defpackage.Is
    public final void f() {
        this.n.stopLoading();
    }

    @Override // defpackage.Is
    public final void g(Tw tw) {
        super.g(tw);
        this.o = null;
        this.p = null;
    }

    @Override // defpackage.Qv, defpackage.Is
    public final void h(Object obj) {
        super.h(obj);
        Ls ls = this.q;
        if (ls != null) {
            ls.reset();
            this.q = null;
        }
    }

    public final void j() {
        Or or = this.o;
        Ps ps = this.p;
        if (or == null || ps == null) {
            return;
        }
        super.g(ps);
        d(or, ps);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.l);
        sb.append(" : ");
        AbstractC0115Ga.f(this.n, sb);
        sb.append("}}");
        return sb.toString();
    }
}
