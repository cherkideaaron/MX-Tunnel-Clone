package com.facebook.ads;

import com.facebook.ads.internal.api.AdNativeComponentView;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* loaded from: classes.dex */
public final class i implements Runnable {
    public final /* synthetic */ MediaView a;

    public i(MediaView mediaView) {
        this.a = mediaView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaView mediaView = this.a;
        mediaView.removeAllViews();
        ((AdNativeComponentView) mediaView).mAdComponentViewApi = null;
        mediaView.mMediaViewApi = DynamicLoaderFactory.makeLoader(mediaView.mConstructorParams.getContext()).createMediaViewApi();
        mediaView.attachAdComponentViewApi(mediaView.mMediaViewApi);
        mediaView.mMediaViewApi.initialize(mediaView.mConstructorParams, mediaView);
    }
}
