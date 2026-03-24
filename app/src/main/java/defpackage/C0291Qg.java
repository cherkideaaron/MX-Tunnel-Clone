package defpackage;

import android.view.View;
import androidx.fragment.app.g;

/* renamed from: Qg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0291Qg extends AbstractC3013lm {
    public final /* synthetic */ AbstractC3013lm a;
    public final /* synthetic */ g b;

    public C0291Qg(g gVar, AbstractC3013lm abstractC3013lm) {
        this.b = gVar;
        this.a = abstractC3013lm;
    }

    @Override // defpackage.AbstractC3013lm
    public final View b(int i) {
        AbstractC3013lm abstractC3013lm = this.a;
        return abstractC3013lm.c() ? abstractC3013lm.b(i) : this.b.onFindViewById(i);
    }

    @Override // defpackage.AbstractC3013lm
    public final boolean c() {
        return this.a.c() || this.b.onHasView();
    }
}
