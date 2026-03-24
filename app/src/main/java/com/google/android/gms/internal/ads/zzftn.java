package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzftn implements Runnable {
    final /* synthetic */ WebView zza;
    final /* synthetic */ String zzb;

    public zzftn(zzfto zzftoVar, WebView webView, String str) {
        this.zza = webView;
        this.zzb = str;
        Objects.requireNonNull(zzftoVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfto.zzk(this.zza, this.zzb);
    }
}
