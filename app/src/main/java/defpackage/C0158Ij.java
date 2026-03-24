package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.facebook.ads.Ad;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: Ij, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0158Ij implements AdListener, NativeAdListener {
    public final WeakReference a;
    public final NativeAdBase b;
    public final /* synthetic */ C0175Jj c;

    public C0158Ij(C0175Jj c0175Jj, Context context, NativeAdBase nativeAdBase) {
        this.c = c0175Jj;
        this.b = nativeAdBase;
        this.a = new WeakReference(context);
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad) {
        C0175Jj c0175Jj = this.c;
        c0175Jj.c.reportAdClicked();
        c0175Jj.c.onAdOpened();
        c0175Jj.c.onAdLeftApplication();
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad) {
        NativeAdBase nativeAdBase = this.b;
        C0175Jj c0175Jj = this.c;
        if (ad != nativeAdBase) {
            AdError adError = new AdError(FacebookMediationAdapter.ERROR_WRONG_NATIVE_TYPE, "Ad Loaded is not a Native Ad.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, adError.getMessage());
            c0175Jj.a.onFailure(adError);
            return;
        }
        Context context = (Context) this.a.get();
        if (context == null) {
            AdError adError2 = new AdError(FacebookMediationAdapter.ERROR_NULL_CONTEXT, "Context is null.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, adError2.getMessage());
            c0175Jj.a.onFailure(adError2);
            return;
        }
        NativeAdBase nativeAdBase2 = c0175Jj.b;
        boolean z = false;
        boolean z2 = (nativeAdBase2.getAdHeadline() == null || nativeAdBase2.getAdBodyText() == null || nativeAdBase2.getAdIcon() == null || nativeAdBase2.getAdCallToAction() == null) ? false : true;
        if (!(nativeAdBase2 instanceof NativeBannerAd)) {
            if (z2 && nativeAdBase2.getAdCoverImage() != null && c0175Jj.d != null) {
                z = true;
            }
            z2 = z;
        }
        MediationAdLoadCallback mediationAdLoadCallback = c0175Jj.a;
        if (!z2) {
            AdError adError3 = new AdError(FacebookMediationAdapter.ERROR_MAPPING_NATIVE_ASSETS, "Ad from Meta Audience Network doesn't have all required assets.", FacebookMediationAdapter.ERROR_DOMAIN);
            String str = FacebookMediationAdapter.TAG;
            Log.w(str, adError3.getMessage());
            Log.w(str, adError3.getMessage());
            mediationAdLoadCallback.onFailure(adError3);
            return;
        }
        c0175Jj.setHeadline(c0175Jj.b.getAdHeadline());
        if (c0175Jj.b.getAdCoverImage() != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C0141Hj(Uri.parse(c0175Jj.b.getAdCoverImage().getUrl())));
            c0175Jj.setImages(arrayList);
        }
        c0175Jj.setBody(c0175Jj.b.getAdBodyText());
        if (c0175Jj.b.getPreloadedIconViewDrawable() == null) {
            c0175Jj.setIcon(c0175Jj.b.getAdIcon() == null ? new C0141Hj() : new C0141Hj(Uri.parse(c0175Jj.b.getAdIcon().getUrl())));
        } else {
            Drawable preloadedIconViewDrawable = c0175Jj.b.getPreloadedIconViewDrawable();
            C0141Hj c0141Hj = new C0141Hj();
            c0141Hj.a = preloadedIconViewDrawable;
            c0175Jj.setIcon(c0141Hj);
        }
        c0175Jj.setCallToAction(c0175Jj.b.getAdCallToAction());
        c0175Jj.setAdvertiser(c0175Jj.b.getAdvertiserName());
        c0175Jj.d.setListener(new C0607co(c0175Jj));
        c0175Jj.setHasVideoContent(true);
        c0175Jj.setMediaView(c0175Jj.d);
        Bundle bundle = new Bundle();
        bundle.putCharSequence(FacebookMediationAdapter.KEY_ID, c0175Jj.b.getId());
        bundle.putCharSequence(FacebookMediationAdapter.KEY_SOCIAL_CONTEXT_ASSET, c0175Jj.b.getAdSocialContext());
        c0175Jj.setExtras(bundle);
        c0175Jj.setAdChoicesContent(new AdOptionsView(context, c0175Jj.b, null));
        c0175Jj.c = (MediationNativeAdCallback) mediationAdLoadCallback.onSuccess(c0175Jj);
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad, com.facebook.ads.AdError adError) {
        AdError adError2 = FacebookMediationAdapter.getAdError(adError);
        Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
        this.c.a.onFailure(adError2);
    }

    @Override // com.facebook.ads.NativeAdListener
    public final void onMediaDownloaded(Ad ad) {
        Log.d(FacebookMediationAdapter.TAG, "onMediaDownloaded");
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad) {
    }
}
