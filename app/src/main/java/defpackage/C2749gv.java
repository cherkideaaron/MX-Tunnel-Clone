package defpackage;

import android.content.Context;
import android.util.Log;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: gv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2749gv implements MediationAppOpenAd, InterstitialAdExtendedListener {
    public final MediationAdLoadCallback a;
    public InterstitialAd b;
    public MediationAppOpenAdCallback c;
    public final AtomicBoolean d;
    public final AtomicBoolean e;

    public C2749gv(MediationAdLoadCallback mediationAdLoadCallback, C3397so c3397so) {
        AbstractC0500aq.m(mediationAdLoadCallback, "loadCallback");
        AbstractC0500aq.m(c3397so, "metaFactory");
        this.a = mediationAdLoadCallback;
        this.d = new AtomicBoolean();
        this.e = new AtomicBoolean();
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad) {
        AbstractC0500aq.m(ad, "ad");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.c;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.reportAdClicked();
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad) {
        AbstractC0500aq.m(ad, "ad");
        this.c = (MediationAppOpenAdCallback) this.a.onSuccess(this);
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad, AdError adError) {
        AbstractC0500aq.m(ad, "ad");
        AbstractC0500aq.m(adError, "adError");
        com.google.android.gms.ads.AdError adError2 = FacebookMediationAdapter.getAdError(adError);
        AbstractC0500aq.l(adError2, "getAdError(...)");
        Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
        if (!this.d.get()) {
            this.a.onFailure(adError2);
            return;
        }
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.c;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdFailedToShow(adError2);
        }
    }

    @Override // com.facebook.ads.InterstitialAdExtendedListener
    public final void onInterstitialActivityDestroyed() {
        MediationAppOpenAdCallback mediationAppOpenAdCallback;
        if (this.e.getAndSet(true) || (mediationAppOpenAdCallback = this.c) == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdClosed();
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDismissed(Ad ad) {
        MediationAppOpenAdCallback mediationAppOpenAdCallback;
        AbstractC0500aq.m(ad, "ad");
        if (this.e.getAndSet(true) || (mediationAppOpenAdCallback = this.c) == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdClosed();
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDisplayed(Ad ad) {
        AbstractC0500aq.m(ad, "ad");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.c;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdOpened();
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad) {
        AbstractC0500aq.m(ad, "ad");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.c;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.reportAdImpression();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public final void showAd(Context context) {
        AbstractC0500aq.m(context, "context");
        this.d.set(true);
        InterstitialAd interstitialAd = this.b;
        if (interstitialAd == null || interstitialAd.show()) {
            return;
        }
        com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD, "Failed to present app open ad.", FacebookMediationAdapter.ERROR_DOMAIN);
        Log.w(FacebookMediationAdapter.TAG, adError.toString());
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.c;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.facebook.ads.RewardedAdListener
    public final void onRewardedAdCompleted() {
    }

    @Override // com.facebook.ads.RewardedAdListener
    public final void onRewardedAdServerFailed() {
    }

    @Override // com.facebook.ads.RewardedAdListener
    public final void onRewardedAdServerSucceeded() {
    }
}
