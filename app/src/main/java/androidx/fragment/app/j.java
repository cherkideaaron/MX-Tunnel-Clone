package androidx.fragment.app;

import android.view.View;
import defpackage.Hr;
import defpackage.Mr;
import defpackage.Or;

/* loaded from: classes.dex */
public final class j implements Mr {
    public final /* synthetic */ l a;

    public j(l lVar) {
        this.a = lVar;
    }

    @Override // defpackage.Mr
    public final void c(Or or, Hr hr) {
        View view;
        if (hr != Hr.ON_STOP || (view = this.a.mView) == null) {
            return;
        }
        view.cancelPendingInputEvents();
    }
}
