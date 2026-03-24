package defpackage;

import android.widget.RelativeLayout;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.zzd;
import com.google.android.gms.ads.formats.zze;
import com.google.android.gms.ads.formats.zzg;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.internal.ads.zzbln;
import rased.vpn.app.activities.OpenVPNClient;

/* loaded from: classes2.dex */
public final class Hx extends AdListener implements zzg, zze, zzd {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;

    public Hx(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
        this.b = abstractAdViewAdapter;
        this.c = mediationNativeListener;
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClicked() {
        switch (this.a) {
            case 1:
                ((MediationNativeListener) this.c).onAdClicked((AbstractAdViewAdapter) this.b);
                break;
            default:
                super.onAdClicked();
                break;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClosed() {
        switch (this.a) {
            case 1:
                ((MediationNativeListener) this.c).onAdClosed((AbstractAdViewAdapter) this.b);
                break;
            default:
                super.onAdClosed();
                break;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        switch (this.a) {
            case 1:
                ((MediationNativeListener) this.c).onAdFailedToLoad((AbstractAdViewAdapter) this.b, loadAdError);
                break;
            default:
                super.onAdFailedToLoad(loadAdError);
                break;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdImpression() {
        switch (this.a) {
            case 1:
                ((MediationNativeListener) this.c).onAdImpression((AbstractAdViewAdapter) this.b);
                break;
            default:
                super.onAdImpression();
                break;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        switch (this.a) {
            case 0:
                AdView adView = ((OpenVPNClient) this.c).t0;
                if (adView != null) {
                    ((RelativeLayout) this.b).addView(adView);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdOpened() {
        switch (this.a) {
            case 1:
                ((MediationNativeListener) this.c).onAdOpened((AbstractAdViewAdapter) this.b);
                break;
            default:
                super.onAdOpened();
                break;
        }
    }

    @Override // com.google.android.gms.ads.formats.zzg
    public void zza(UnifiedNativeAd unifiedNativeAd) {
        C3381sP c3381sP = new C3381sP();
        c3381sP.setHeadline(unifiedNativeAd.zza());
        c3381sP.setImages(unifiedNativeAd.zzb());
        c3381sP.setBody(unifiedNativeAd.zzc());
        c3381sP.setIcon(unifiedNativeAd.zzd());
        c3381sP.setCallToAction(unifiedNativeAd.zze());
        c3381sP.setAdvertiser(unifiedNativeAd.zzf());
        c3381sP.setStarRating(unifiedNativeAd.zzg());
        c3381sP.setStore(unifiedNativeAd.zzh());
        c3381sP.setPrice(unifiedNativeAd.zzi());
        c3381sP.zzb(unifiedNativeAd.zzk());
        c3381sP.setOverrideImpressionRecording(true);
        c3381sP.setOverrideClickHandling(true);
        c3381sP.zza(unifiedNativeAd.zzj());
        ((MediationNativeListener) this.c).onAdLoaded((AbstractAdViewAdapter) this.b, c3381sP);
    }

    @Override // com.google.android.gms.ads.formats.zze
    public void zzb(zzbln zzblnVar) {
        ((MediationNativeListener) this.c).zzc((AbstractAdViewAdapter) this.b, zzblnVar);
    }

    @Override // com.google.android.gms.ads.formats.zzd
    public void zzc(zzbln zzblnVar, String str) {
        ((MediationNativeListener) this.c).zzd((AbstractAdViewAdapter) this.b, zzblnVar, str);
    }

    public Hx(OpenVPNClient openVPNClient, RelativeLayout relativeLayout) {
        this.c = openVPNClient;
        this.b = relativeLayout;
    }

    private final void a() {
    }
}
