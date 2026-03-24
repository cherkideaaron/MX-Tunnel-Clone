package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.AbstractC3264qG;
import defpackage.Vs;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzchf implements zzboh {
    private boolean zza;

    private static int zzb(Context context, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                com.google.android.gms.ads.internal.client.zzbb.zza();
                i = com.google.android.gms.ads.internal.util.client.zzf.zzC(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                String strM = AbstractC3264qG.m(new StringBuilder(str.length() + 34 + str2.length()), "Could not parse ", str, " in a video GMSG: ", str2);
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(strM);
            }
        }
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            int length = str.length();
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + length + 30 + String.valueOf(str2).length() + 6 + 1);
            AbstractC3264qG.v(sb, "Parse pixels for ", str, ", got string ", str2);
            sb.append(", int ");
            sb.append(i);
            sb.append(".");
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        return i;
    }

    private static void zzc(zzcfs zzcfsVar, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzcfsVar.zzx(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                String strM = Vs.m("Could not parse buffer parameters in loadControl video GMSG: (", str, ", ", str2, ")");
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(strM);
                return;
            }
        }
        if (str2 != null) {
            zzcfsVar.zzy(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzcfsVar.zzz(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzcfsVar.zzA(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzcfsVar.zzB(Integer.parseInt(str5));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:200|(1:(1:203)(1:204))(3:205|(1:207)|208)|209|(1:(6:212|242|219|220|222|(2:230|231)(2:226|(2:228|229)(1:250)))(1:213))(3:215|(1:217)|218)|214|242|219|220|222|(1:224)|230|231) */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0519, code lost:
    
        r18 = 0;
     */
    @Override // com.google.android.gms.internal.ads.zzboh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object r22, java.util.Map r23) throws org.json.JSONException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzchf.zza(java.lang.Object, java.util.Map):void");
    }
}
