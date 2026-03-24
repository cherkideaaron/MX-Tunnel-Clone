package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public class zzcky extends zzcjw {
    public zzcky(zzcjl zzcjlVar, zzbgd zzbgdVar, boolean z, zzejf zzejfVar) {
        super(zzcjlVar, zzbgdVar, z, new zzbww(zzcjlVar, zzcjlVar.zzK(), new zzbgl(zzcjlVar.getContext())), null, zzejfVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebResourceResponse zzac(WebView webView, String str, Map map) {
        if (!(webView instanceof zzcjl)) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzcjl zzcjlVar = (zzcjl) webView;
        zzcce zzcceVar = this.zzb;
        if (zzcceVar != null) {
            zzcceVar.zze(str, map, 1);
        }
        zzfxl.zza();
        zzfxq zzfxqVar = zzfxq.zza;
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return zzL(str, map);
        }
        if (zzcjlVar.zzP() != null) {
            zzcjlVar.zzP().zzN();
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzcjlVar.zzN().zzg() ? zzbhe.zzax : zzcjlVar.zzW() ? zzbhe.zzaw : zzbhe.zzav);
        com.google.android.gms.ads.internal.zzt.zzc();
        return com.google.android.gms.ads.internal.util.zzs.zzB(zzcjlVar.getContext(), zzcjlVar.zzs().afmaVersion, str2);
    }
}
