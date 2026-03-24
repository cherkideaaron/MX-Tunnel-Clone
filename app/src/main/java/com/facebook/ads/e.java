package com.facebook.ads;

import android.window.OnBackInvokedCallback;

/* loaded from: classes.dex */
public final class e implements OnBackInvokedCallback {
    public final /* synthetic */ AudienceNetworkActivity a;

    public e(AudienceNetworkActivity audienceNetworkActivity) {
        this.a = audienceNetworkActivity;
    }

    public final void onBackInvoked() {
        this.a.onBackPressed();
    }
}
