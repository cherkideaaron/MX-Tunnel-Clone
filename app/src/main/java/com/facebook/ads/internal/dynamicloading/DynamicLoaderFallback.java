package com.facebook.ads.internal.dynamicloading;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import com.facebook.ads.Ad;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import com.facebook.infer.annotation.Nullsafe;
import defpackage.RunnableC3680y0;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

@Keep
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes.dex */
class DynamicLoaderFallback {
    private static final WeakHashMap<Object, AdListener> sApiProxyToAdListenersMap = new WeakHashMap<>();

    private static boolean equalsMethodParams(Method method, Method method2) {
        return Arrays.equals(method.getParameterTypes(), method2.getParameterTypes());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean equalsMethods(Method method, Method method2) {
        return method != null && method2 != null && method.getDeclaringClass().equals(method2.getDeclaringClass()) && method.getName().equals(method2.getName()) && equalsMethodParams(method, method2);
    }

    public static DynamicLoader makeFallbackLoader() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        b bVar = new b();
        DynamicLoader dynamicLoader = (DynamicLoader) bVar.a(DynamicLoader.class);
        dynamicLoader.createInterstitialAd(null, null, null);
        arrayList5.add(bVar.a);
        dynamicLoader.createRewardedVideoAd(null, null, null);
        arrayList5.add(bVar.a);
        dynamicLoader.createAdViewApi((Context) null, (String) null, (AdSize) null, (AdViewParentApi) null, (AdView) null);
        arrayList5.add(bVar.a);
        try {
            dynamicLoader.createAdViewApi((Context) null, (String) null, (String) null, (AdViewParentApi) null, (AdView) null);
        } catch (Exception unused) {
        }
        arrayList5.add(bVar.a);
        dynamicLoader.createNativeAdApi(null, null);
        Method method = bVar.a;
        dynamicLoader.createNativeBannerAdApi(null, null);
        Method method2 = bVar.a;
        NativeAdBaseApi nativeAdBaseApi = (NativeAdBaseApi) bVar.a(NativeAdBaseApi.class);
        nativeAdBaseApi.loadAd();
        arrayList.add(bVar.a);
        nativeAdBaseApi.loadAd(null);
        arrayList2.add(bVar.a);
        nativeAdBaseApi.buildLoadAdConfig(null);
        arrayList4.add(bVar.a);
        InterstitialAdApi interstitialAdApi = (InterstitialAdApi) bVar.a(InterstitialAdApi.class);
        interstitialAdApi.loadAd();
        arrayList.add(bVar.a);
        interstitialAdApi.loadAd(null);
        arrayList2.add(bVar.a);
        interstitialAdApi.buildLoadAdConfig();
        arrayList4.add(bVar.a);
        RewardedVideoAdApi rewardedVideoAdApi = (RewardedVideoAdApi) bVar.a(RewardedVideoAdApi.class);
        rewardedVideoAdApi.loadAd();
        arrayList.add(bVar.a);
        rewardedVideoAdApi.loadAd(null);
        arrayList2.add(bVar.a);
        rewardedVideoAdApi.buildLoadAdConfig();
        arrayList4.add(bVar.a);
        AdViewApi adViewApi = (AdViewApi) bVar.a(AdViewApi.class);
        adViewApi.loadAd();
        arrayList.add(bVar.a);
        adViewApi.loadAd(null);
        arrayList2.add(bVar.a);
        adViewApi.buildLoadAdConfig();
        arrayList4.add(bVar.a);
        ((AdView.AdViewLoadConfigBuilder) bVar.a(AdView.AdViewLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(bVar.a);
        ((NativeAdBase.NativeAdLoadConfigBuilder) bVar.a(NativeAdBase.NativeAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(bVar.a);
        ((InterstitialAd.InterstitialAdLoadConfigBuilder) bVar.a(InterstitialAd.InterstitialAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(bVar.a);
        ((RewardedVideoAd.RewardedVideoAdLoadConfigBuilder) bVar.a(RewardedVideoAd.RewardedVideoAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(bVar.a);
        return (DynamicLoader) Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{DynamicLoader.class}, new a(arrayList, map, arrayList2, arrayList3, map2, arrayList4, arrayList5, method, method2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean reportError(Object obj, Map<Object, Ad> map) {
        if (obj == null) {
            return false;
        }
        AdListener adListener = sApiProxyToAdListenersMap.get(obj);
        Ad ad = map.get(obj);
        if (adListener == null) {
            return false;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC3680y0(adListener, ad, 10, false), 500L);
        return true;
    }
}
