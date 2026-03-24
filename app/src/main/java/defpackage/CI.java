package defpackage;

import android.graphics.Typeface;

/* loaded from: classes2.dex */
public final class CI extends AbstractC3296qu {
    public final /* synthetic */ AbstractC0069Df j;
    public final /* synthetic */ EI k;

    public CI(EI ei, AbstractC0069Df abstractC0069Df) {
        this.k = ei;
        this.j = abstractC0069Df;
    }

    @Override // defpackage.AbstractC3296qu
    public final void K(int i) {
        this.k.n = true;
        this.j.M(i);
    }

    @Override // defpackage.AbstractC3296qu
    public final void L(Typeface typeface) {
        EI ei = this.k;
        ei.p = Typeface.create(typeface, ei.d);
        ei.n = true;
        this.j.N(ei.p, false);
    }
}
