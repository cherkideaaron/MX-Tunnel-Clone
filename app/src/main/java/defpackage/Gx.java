package defpackage;

import rased.vpn.app.activities.OpenVPNClient;

/* loaded from: classes2.dex */
public final class Gx implements XK, InterfaceC0065Db {
    public final /* synthetic */ OpenVPNClient a;

    public /* synthetic */ Gx(OpenVPNClient openVPNClient) {
        this.a = openVPNClient;
    }

    @Override // defpackage.XK
    public void onConsentFormLoadFailure(C0551bm c0551bm) {
        this.a.L();
    }

    @Override // defpackage.InterfaceC0065Db
    public void onConsentInfoUpdateSuccess() {
        OpenVPNClient openVPNClient = this.a;
        if (openVPNClient.W0.isConsentFormAvailable()) {
            openVPNClient.L();
        }
    }
}
