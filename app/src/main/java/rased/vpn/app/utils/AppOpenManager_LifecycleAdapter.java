package rased.vpn.app.utils;

import defpackage.C0034Be;
import defpackage.Hr;
import defpackage.InterfaceC0179Jn;
import defpackage.M3;

/* loaded from: classes2.dex */
public class AppOpenManager_LifecycleAdapter implements InterfaceC0179Jn {
    public AppOpenManager_LifecycleAdapter(M3 m3) {
    }

    @Override // defpackage.InterfaceC0179Jn
    public final void a(Hr hr, boolean z, C0034Be c0034Be) {
        boolean z2 = c0034Be != null;
        if (!z && hr == Hr.ON_START) {
            if (!z2 || c0034Be.a("onStart")) {
                throw null;
            }
        }
    }
}
