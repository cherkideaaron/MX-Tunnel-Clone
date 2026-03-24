package eu.dkaratzas.android.inapp.update;

import defpackage.C0034Be;
import defpackage.C3236pp;
import defpackage.Hr;
import defpackage.InterfaceC0179Jn;

/* loaded from: classes2.dex */
public class InAppUpdateManager_LifecycleAdapter implements InterfaceC0179Jn {
    public final C3236pp a;

    public InAppUpdateManager_LifecycleAdapter(C3236pp c3236pp) {
        this.a = c3236pp;
    }

    @Override // defpackage.InterfaceC0179Jn
    public final void a(Hr hr, boolean z, C0034Be c0034Be) {
        boolean z2 = c0034Be != null;
        if (z) {
            return;
        }
        Hr hr2 = Hr.ON_RESUME;
        C3236pp c3236pp = this.a;
        if (hr == hr2) {
            if (!z2 || c0034Be.a("onResume")) {
                c3236pp.onResume();
                return;
            }
            return;
        }
        if (hr == Hr.ON_DESTROY) {
            if (!z2 || c0034Be.a("onDestroy")) {
                c3236pp.onDestroy();
            }
        }
    }
}
