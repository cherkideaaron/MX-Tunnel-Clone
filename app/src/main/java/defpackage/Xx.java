package defpackage;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.activities.OpenVPNClient;

/* loaded from: classes2.dex */
public final class Xx extends FullScreenContentCallback {
    public final /* synthetic */ Yx a;

    public Xx(Yx yx) {
        this.a = yx;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        OpenVPNClient openVPNClient = this.a.b;
        openVPNClient.u0 = null;
        openVPNClient.z0 = false;
        XD xd = (XD) openVPNClient.S0.edit();
        xd.putLong(Deobfuscator$MHRTUNNELVPN$app.getString(-30068418245562L), System.currentTimeMillis());
        xd.apply();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdFailedToShowFullScreenContent(AdError adError) {
        OpenVPNClient openVPNClient = this.a.b;
        openVPNClient.u0 = null;
        openVPNClient.z0 = false;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
    }
}
