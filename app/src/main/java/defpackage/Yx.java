package defpackage;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.activities.OpenVPNClient;

/* loaded from: classes2.dex */
public final class Yx extends InterstitialAdLoadCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ OpenVPNClient b;

    public /* synthetic */ Yx(OpenVPNClient openVPNClient, int i) {
        this.a = i;
        this.b = openVPNClient;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        switch (this.a) {
            case 0:
                OpenVPNClient openVPNClient = this.b;
                openVPNClient.u0 = null;
                openVPNClient.z0 = false;
                break;
            default:
                this.b.u0 = null;
                break;
        }
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(InterstitialAd interstitialAd) {
        InterstitialAd interstitialAd2 = interstitialAd;
        switch (this.a) {
            case 0:
                OpenVPNClient openVPNClient = this.b;
                openVPNClient.u0 = interstitialAd2;
                if (openVPNClient.B0 && !openVPNClient.z0 && openVPNClient.A0) {
                    long j = openVPNClient.S0.getLong(Deobfuscator$MHRTUNNELVPN$app.getString(-30128547787706L), 0L);
                    if (j == 0) {
                        openVPNClient.u0.show(openVPNClient);
                    } else if (j != 0 && System.currentTimeMillis() >= j + 60000) {
                        openVPNClient.u0.show(openVPNClient);
                    }
                    openVPNClient.z0 = true;
                    openVPNClient.A0 = false;
                }
                interstitialAd2.setFullScreenContentCallback(new Xx(this));
                break;
            default:
                OpenVPNClient openVPNClient2 = this.b;
                openVPNClient2.u0 = interstitialAd2;
                interstitialAd2.show(openVPNClient2);
                XD xd = (XD) openVPNClient2.S0.edit();
                xd.putLong(Deobfuscator$MHRTUNNELVPN$app.getString(-30188677329850L), System.currentTimeMillis());
                xd.apply();
                break;
        }
    }
}
