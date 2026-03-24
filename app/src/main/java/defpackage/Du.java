package defpackage;

import android.view.ActionProvider;

/* loaded from: classes.dex */
public final class Du implements ActionProvider.VisibilityListener {
    public C0607co a;
    public final ActionProvider b;
    public final /* synthetic */ Gu c;

    public Du(Gu gu, ActionProvider actionProvider) {
        this.c = gu;
        this.b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        C0607co c0607co = this.a;
        if (c0607co != null) {
            MenuC3511uu menuC3511uu = ((Cu) c0607co.a).n;
            menuC3511uu.h = true;
            menuC3511uu.p(true);
        }
    }
}
