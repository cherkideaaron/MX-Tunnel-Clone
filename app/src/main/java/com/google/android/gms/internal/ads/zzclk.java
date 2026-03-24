package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import androidx.webkit.ProfileStore;
import defpackage.AbstractC3650xO;
import defpackage.SM;
import defpackage.Tz;
import defpackage.VM;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.util.Features;

/* loaded from: classes.dex */
public final class zzclk {
    private Tz zza = null;

    public final void zza(WebView webView) {
        if (this.zza != null) {
            try {
                int i = SM.a;
                if (!VM.g.b()) {
                    throw VM.a();
                }
                ((WebViewProviderBoundaryInterface) SM.b(webView).a).setProfile("GMA_WEBVIEW_PROFILE");
                com.google.android.gms.ads.internal.util.zze.zza("WebViewCompat Profile is defined");
            } catch (IllegalStateException e) {
                String strConcat = "WebViewCompat error: ".concat(e.toString());
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpx)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "WebViewCompat.setProfile");
                }
            }
        }
    }

    public final void zzb(zzclo zzcloVar) {
        ProfileStore profileStore;
        if (!AbstractC3650xO.b(Features.MULTI_PROFILE)) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("WebViewFeature.MULTI_PROFILE is not supported");
            return;
        }
        try {
            profileStore = (ProfileStore) zzfys.zza("androidx.webkit.ProfileStore", "getInstance", new zzfyr[0]);
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e) {
            String strValueOf = String.valueOf(e.getMessage());
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Unable to get ProfileStore instance: ".concat(strValueOf));
            try {
                profileStore = (ProfileStore) zzfys.zza("androidx.webkit.ProfileStore$-CC", "getInstance", new zzfyr[0]);
            } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Unable to get ProfileStore instance: ".concat(String.valueOf(e2.getMessage())));
                profileStore = null;
            }
        }
        if (profileStore != null) {
            this.zza = profileStore.getOrCreateProfile("GMA_WEBVIEW_PROFILE");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpw)).booleanValue()) {
                long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzcloVar.zza;
                zzdxy zzdxyVarZza = zzcloVar.zzb.zzd().zza();
                zzdxyVarZza.zzc("action", "webview_p_l");
                zzdxyVarZza.zzc("webview_p_l", Long.toString(jElapsedRealtime));
                zzdxyVarZza.zzd();
                return;
            }
            return;
        }
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("WebViewCompat failure: No instance");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpw)).booleanValue()) {
            zzdxy zzdxyVarZza2 = zzcloVar.zzb.zzd().zza();
            zzdxyVarZza2.zzc("action", "webview_p_f");
            zzdxyVarZza2.zzc("webview_p_f", "No instance");
            zzdxyVarZza2.zzd();
        }
    }
}
