package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
final class zzbnf implements zzboh {
    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        String str;
        zzcjl zzcjlVar = (zzcjl) obj;
        if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
            str = "Missing App Id, cannot show LMD Overlay without it";
        } else {
            zzgpp zzgppVarZzl = zzgpq.zzl();
            zzgppVarZzl.zzb((String) map.get("appId"));
            zzgppVarZzl.zzg(zzcjlVar.getWidth());
            zzgppVarZzl.zza(zzcjlVar.zzE().getWindowToken());
            zzgppVarZzl.zzc((map.containsKey("gravityX") && map.containsKey("gravityY")) ? Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")) : 81);
            zzgppVarZzl.zzd(map.containsKey("verticalMargin") ? Float.parseFloat((String) map.get("verticalMargin")) : 0.02f);
            if (map.containsKey("enifd")) {
                zzgppVarZzl.zzh((String) map.get("enifd"));
            }
            try {
                com.google.android.gms.ads.internal.zzt.zzt().zzc(zzcjlVar, zzgppVarZzl.zzi());
                return;
            } catch (NullPointerException e) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "DefaultGmsgHandlers.ShowLMDOverlay");
                str = "Missing parameters for LMD Overlay show request";
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza(str);
    }
}
