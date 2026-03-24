package androidx.fragment.app;

import defpackage.InterfaceC0043Bn;
import defpackage.W0;

/* loaded from: classes.dex */
public final class k implements InterfaceC0043Bn {
    public final /* synthetic */ l a;

    public k(l lVar) {
        this.a = lVar;
    }

    @Override // defpackage.InterfaceC0043Bn
    public final Object apply() {
        l lVar = this.a;
        Object obj = lVar.mHost;
        return obj instanceof W0 ? ((W0) obj).getActivityResultRegistry() : lVar.requireActivity().getActivityResultRegistry();
    }
}
