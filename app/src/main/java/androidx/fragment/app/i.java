package androidx.fragment.app;

import android.view.View;
import defpackage.AbstractC3013lm;
import defpackage.AbstractC3264qG;

/* loaded from: classes.dex */
public final class i extends AbstractC3013lm {
    public final /* synthetic */ l a;

    public i(l lVar) {
        this.a = lVar;
    }

    @Override // defpackage.AbstractC3013lm
    public final View b(int i) {
        l lVar = this.a;
        View view = lVar.mView;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException(AbstractC3264qG.f("Fragment ", lVar, " does not have a view"));
    }

    @Override // defpackage.AbstractC3013lm
    public final boolean c() {
        return this.a.mView != null;
    }
}
