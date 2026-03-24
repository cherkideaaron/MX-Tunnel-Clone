package com.google.ads.mediation.facebook;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.FrameLayout;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.BidderTokenProvider;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.internal.settings.AdSdkVersion;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdConfiguration;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import defpackage.AbstractC0500aq;
import defpackage.C0039Bj;
import defpackage.C0056Cj;
import defpackage.C0073Dj;
import defpackage.C0090Ej;
import defpackage.C0107Fj;
import defpackage.C0124Gj;
import defpackage.C0158Ij;
import defpackage.C0175Jj;
import defpackage.C2749gv;
import defpackage.C3397so;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class FacebookMediationAdapter extends RtbAdapter {
    public static final int ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION = 111;
    public static final int ERROR_BANNER_SIZE_MISMATCH = 102;
    public static final int ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD = 109;
    public static final String ERROR_DOMAIN = "com.google.ads.mediation.facebook";
    public static final int ERROR_FACEBOOK_INITIALIZATION = 104;
    public static final int ERROR_FAILED_TO_PRESENT_AD = 110;
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    public static final int ERROR_MAPPING_NATIVE_ASSETS = 108;
    public static final int ERROR_NULL_CONTEXT = 107;
    public static final int ERROR_REQUIRES_ACTIVITY_CONTEXT = 103;
    public static final int ERROR_REQUIRES_UNIFIED_NATIVE_ADS = 105;
    public static final int ERROR_WRONG_NATIVE_TYPE = 106;
    public static final String FACEBOOK_SDK_ERROR_DOMAIN = "com.facebook.ads";
    public static final String KEY_ID = "id";
    public static final String KEY_SOCIAL_CONTEXT_ASSET = "social_context";
    public static final String PLACEMENT_PARAMETER = "pubid";
    public static final String RTB_PLACEMENT_PARAMETER = "placement_id";
    public static final String TAG = "FacebookMediationAdapter";
    public final C3397so a = new C3397so(20);

    public static AdError getAdError(com.facebook.ads.AdError adError) {
        return new AdError(adError.getErrorCode(), adError.getErrorMessage(), "com.facebook.ads");
    }

    public static String getPlacementID(Bundle bundle) {
        String string = bundle.getString(RTB_PLACEMENT_PARAMETER);
        return string == null ? bundle.getString("pubid") : string;
    }

    public static void setMixedAudience(MediationAdConfiguration mediationAdConfiguration) {
        if (mediationAdConfiguration.taggedForChildDirectedTreatment() == 1 || mediationAdConfiguration.taggedForUnderAgeTreatment() == 1) {
            AdSettings.setMixedAudience(true);
        } else if (mediationAdConfiguration.taggedForChildDirectedTreatment() == 0 || mediationAdConfiguration.taggedForUnderAgeTreatment() == 0) {
            AdSettings.setMixedAudience(false);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(RtbSignalData rtbSignalData, SignalCallbacks signalCallbacks) {
        signalCallbacks.onSuccess(BidderTokenProvider.getBidderToken(rtbSignalData.getContext()));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getSDKVersionInfo() {
        String[] strArrSplit = AdSdkVersion.BUILD.split("\\.");
        if (strArrSplit.length >= 3) {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]));
        }
        Log.w(TAG, "Unexpected SDK version format: 6.21.0.Returning 0.0.0 for SDK version.");
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getVersionInfo() throws NumberFormatException {
        String[] strArrSplit = "6.21.0.1".split("\\.");
        if (strArrSplit.length < 4) {
            Log.w(TAG, "Unexpected adapter version format: 6.21.0.1.Returning 0.0.0 for adapter version.");
            return new VersionInfo(0, 0, 0);
        }
        return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[3]) + (Integer.parseInt(strArrSplit[2]) * 100));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(Context context, InitializationCompleteCallback initializationCompleteCallback, List<MediationConfiguration> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            String placementID = getPlacementID(it.next().getServerParameters());
            if (!TextUtils.isEmpty(placementID)) {
                arrayList.add(placementID);
            }
        }
        if (C0039Bj.d == null) {
            C0039Bj.d = new C0039Bj();
        }
        C0039Bj c0039Bj = C0039Bj.d;
        C0056Cj c0056Cj = new C0056Cj(initializationCompleteCallback);
        if (c0039Bj.a) {
            c0039Bj.c.add(c0056Cj);
            return;
        }
        if (c0039Bj.b) {
            initializationCompleteCallback.onInitializationSucceeded();
            return;
        }
        c0039Bj.a = true;
        if (c0039Bj == null) {
            C0039Bj.d = new C0039Bj();
        }
        C0039Bj.d.c.add(c0056Cj);
        AudienceNetworkAds.buildInitSettings(context).withMediationService("GOOGLE:6.21.0.1").withPlacementIds(arrayList).withInitListener(c0039Bj).initialize();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbAppOpenAd(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        InterstitialAd.InterstitialAdLoadConfigBuilder interstitialAdLoadConfigBuilderWithBid;
        InterstitialAd.InterstitialAdLoadConfigBuilder interstitialAdLoadConfigBuilderWithAdListener;
        InterstitialAd interstitialAd;
        C3397so c3397so = this.a;
        C2749gv c2749gv = new C2749gv(mediationAdLoadCallback, c3397so);
        AbstractC0500aq.m(mediationAppOpenAdConfiguration, "adConfiguration");
        Bundle serverParameters = mediationAppOpenAdConfiguration.getServerParameters();
        AbstractC0500aq.l(serverParameters, "getServerParameters(...)");
        String placementID = getPlacementID(serverParameters);
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(ERROR_INVALID_SERVER_PARAMETERS, "Failed to request ad. PlacementID is null or empty. ", ERROR_DOMAIN);
            Log.e(TAG, adError.getMessage());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        setMixedAudience(mediationAppOpenAdConfiguration);
        Context context = mediationAppOpenAdConfiguration.getContext();
        c3397so.getClass();
        c2749gv.b = new InterstitialAd(context, placementID);
        if (!TextUtils.isEmpty(mediationAppOpenAdConfiguration.getWatermark()) && (interstitialAd = c2749gv.b) != null) {
            interstitialAd.setExtraHints(new ExtraHints.Builder().mediationData(mediationAppOpenAdConfiguration.getWatermark()).build());
        }
        InterstitialAd interstitialAd2 = c2749gv.b;
        if (interstitialAd2 != null) {
            InterstitialAd.InterstitialAdLoadConfigBuilder interstitialAdLoadConfigBuilderBuildLoadAdConfig = interstitialAd2.buildLoadAdConfig();
            interstitialAd2.loadAd((interstitialAdLoadConfigBuilderBuildLoadAdConfig == null || (interstitialAdLoadConfigBuilderWithBid = interstitialAdLoadConfigBuilderBuildLoadAdConfig.withBid(mediationAppOpenAdConfiguration.getBidResponse())) == null || (interstitialAdLoadConfigBuilderWithAdListener = interstitialAdLoadConfigBuilderWithBid.withAdListener(c2749gv)) == null) ? null : interstitialAdLoadConfigBuilderWithAdListener.build());
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        C3397so c3397so = this.a;
        C0107Fj c0107Fj = new C0107Fj(mediationAdLoadCallback, c3397so);
        String placementID = getPlacementID(mediationBannerAdConfiguration.getServerParameters());
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(ERROR_INVALID_SERVER_PARAMETERS, "Failed to request ad. PlacementID is null or empty.", ERROR_DOMAIN);
            Log.e(TAG, adError.getMessage());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        setMixedAudience(mediationBannerAdConfiguration);
        try {
            Context context = mediationBannerAdConfiguration.getContext();
            String bidResponse = mediationBannerAdConfiguration.getBidResponse();
            c3397so.getClass();
            c0107Fj.b = new AdView(context, placementID, bidResponse);
            if (!TextUtils.isEmpty(mediationBannerAdConfiguration.getWatermark())) {
                c0107Fj.b.setExtraHints(new ExtraHints.Builder().mediationData(mediationBannerAdConfiguration.getWatermark()).build());
            }
            Context context2 = mediationBannerAdConfiguration.getContext();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(mediationBannerAdConfiguration.getAdSize().getWidthInPixels(context2), -2);
            c0107Fj.c = new FrameLayout(context2);
            c0107Fj.b.setLayoutParams(layoutParams);
            c0107Fj.c.addView(c0107Fj.b);
            AdView adView = c0107Fj.b;
            adView.loadAd(adView.buildLoadAdConfig().withAdListener(c0107Fj).withBid(mediationBannerAdConfiguration.getBidResponse()).build());
        } catch (Exception e) {
            AdError adError2 = new AdError(ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION, "Failed to create banner ad: " + e.getMessage(), ERROR_DOMAIN);
            Log.e(TAG, adError2.getMessage());
            mediationAdLoadCallback.onFailure(adError2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        C0124Gj c0124Gj = new C0124Gj(mediationAdLoadCallback, this.a);
        String placementID = getPlacementID(mediationInterstitialAdConfiguration.getServerParameters());
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(ERROR_INVALID_SERVER_PARAMETERS, "Failed to request ad. PlacementID is null or empty. ", ERROR_DOMAIN);
            Log.e(TAG, adError.getMessage());
            c0124Gj.a.onFailure(adError);
            return;
        }
        setMixedAudience(mediationInterstitialAdConfiguration);
        Context context = mediationInterstitialAdConfiguration.getContext();
        c0124Gj.f.getClass();
        c0124Gj.b = new InterstitialAd(context, placementID);
        if (!TextUtils.isEmpty(mediationInterstitialAdConfiguration.getWatermark())) {
            c0124Gj.b.setExtraHints(new ExtraHints.Builder().mediationData(mediationInterstitialAdConfiguration.getWatermark()).build());
        }
        InterstitialAd interstitialAd = c0124Gj.b;
        interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withBid(mediationInterstitialAdConfiguration.getBidResponse()).withAdListener(c0124Gj).build());
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        C0175Jj c0175Jj = new C0175Jj(mediationAdLoadCallback, this.a);
        String placementID = getPlacementID(mediationNativeAdConfiguration.getServerParameters());
        boolean zIsEmpty = TextUtils.isEmpty(placementID);
        MediationAdLoadCallback mediationAdLoadCallback2 = c0175Jj.a;
        if (zIsEmpty) {
            AdError adError = new AdError(ERROR_INVALID_SERVER_PARAMETERS, "Failed to request ad. PlacementID is null or empty.", ERROR_DOMAIN);
            Log.e(TAG, adError.getMessage());
            mediationAdLoadCallback2.onFailure(adError);
            return;
        }
        setMixedAudience(mediationNativeAdConfiguration);
        Context context = mediationNativeAdConfiguration.getContext();
        c0175Jj.e.getClass();
        c0175Jj.d = new MediaView(context);
        try {
            c0175Jj.b = NativeAdBase.fromBidPayload(mediationNativeAdConfiguration.getContext(), placementID, mediationNativeAdConfiguration.getBidResponse());
            if (!TextUtils.isEmpty(mediationNativeAdConfiguration.getWatermark())) {
                c0175Jj.b.setExtraHints(new ExtraHints.Builder().mediationData(mediationNativeAdConfiguration.getWatermark()).build());
            }
            NativeAdBase nativeAdBase = c0175Jj.b;
            nativeAdBase.loadAd(nativeAdBase.buildLoadAdConfig().withAdListener(new C0158Ij(c0175Jj, mediationNativeAdConfiguration.getContext(), c0175Jj.b)).withBid(mediationNativeAdConfiguration.getBidResponse()).withMediaCacheFlag(NativeAdBase.MediaCacheFlag.ALL).withPreloadedIconView(-1, -1).build());
        } catch (Exception e) {
            AdError adError2 = new AdError(ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD, "Failed to create native ad from bid payload: " + e.getMessage(), ERROR_DOMAIN);
            Log.w(TAG, adError2.getMessage());
            mediationAdLoadCallback2.onFailure(adError2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        new C0073Dj(mediationAdLoadCallback, this.a).b(mediationRewardedAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedInterstitialAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        new C0090Ej(mediationAdLoadCallback, this.a).b(mediationRewardedAdConfiguration);
    }
}
