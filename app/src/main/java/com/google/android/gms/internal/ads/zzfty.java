package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* loaded from: classes.dex */
public final class zzfty extends zzftx {
    public zzfty(String str, WebView webView) {
        super(str);
        if (!webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        zzc(webView);
    }
}
