package com.facebook.ads;

import android.content.res.Configuration;
import com.facebook.ads.internal.api.AdViewParentApi;

/* loaded from: classes.dex */
public final class a implements AdViewParentApi {
    public final /* synthetic */ AdView a;

    public a(AdView adView) {
        this.a = adView;
    }

    @Override // com.facebook.ads.internal.api.AdViewParentApi
    public final void onConfigurationChanged(Configuration configuration) {
        super/*android.widget.RelativeLayout*/.onConfigurationChanged(configuration);
    }
}
