package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes.dex */
public interface zzejw {
    boolean zza(Context context);

    String zzb(Context context);

    zzekb zzc(String str, WebView webView, String str2, String str3, String str4, zzejy zzejyVar, zzejx zzejxVar, String str5);

    zzekb zzd(String str, WebView webView, String str2, String str3, String str4, String str5, zzejy zzejyVar, zzejx zzejxVar, String str6);

    void zze(zzfsj zzfsjVar);

    void zzf(zzfsj zzfsjVar);

    void zzg(zzfsj zzfsjVar, View view);

    void zzh(zzfsj zzfsjVar, View view);

    zzfsv zzi(VersionInfoParcel versionInfoParcel, WebView webView, boolean z);

    void zzj(zzfsv zzfsvVar, zzfsu zzfsuVar);

    void zzk(zzfsv zzfsvVar, View view);
}
