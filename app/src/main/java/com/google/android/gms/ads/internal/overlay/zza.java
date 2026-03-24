package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzdxz;

/* loaded from: classes.dex */
public final class zza {
    public static final boolean zza(Context context, Intent intent, zzad zzadVar, zzaa zzaaVar, boolean z, zzdxz zzdxzVar, String str, Bundle bundle) {
        if (z) {
            return zzc(context, intent.getData(), zzadVar, zzaaVar, bundle);
        }
        try {
            String uri = intent.toURI();
            StringBuilder sb = new StringBuilder(String.valueOf(uri).length() + 21);
            sb.append("Launching an intent: ");
            sb.append(uri);
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
            if (((Boolean) zzbd.zzc().zzd(zzbhe.zzoC)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzae(context, intent, zzdxzVar, str);
            } else {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzaa(context, intent);
            }
            if (zzadVar != null) {
                zzadVar.zzl();
            }
            if (zzaaVar != null) {
                zzaaVar.zza(true);
            }
            return true;
        } catch (ActivityNotFoundException e) {
            String message = e.getMessage();
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(message);
            if (zzaaVar != null) {
                zzaaVar.zza(false);
            }
            return false;
        }
    }

    public static final boolean zzb(Context context, zzc zzcVar, zzad zzadVar, zzaa zzaaVar, zzdxz zzdxzVar, String str) throws NumberFormatException {
        String strConcat;
        int i = 0;
        if (zzcVar == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            strConcat = "No intent data for launcher overlay.";
        } else {
            zzbhe.zza(context);
            Intent intent = zzcVar.zzh;
            if (intent != null) {
                return zza(context, intent, zzadVar, zzaaVar, zzcVar.zzj, zzdxzVar, str, zzcVar.zzk);
            }
            Intent intent2 = new Intent();
            String str2 = zzcVar.zzb;
            if (!TextUtils.isEmpty(str2)) {
                String str3 = zzcVar.zzc;
                boolean zIsEmpty = TextUtils.isEmpty(str3);
                Uri uri = Uri.parse(str2);
                if (zIsEmpty) {
                    intent2.setData(uri);
                } else {
                    intent2.setDataAndType(uri, str3);
                }
                intent2.setAction("android.intent.action.VIEW");
                String str4 = zzcVar.zzd;
                if (!TextUtils.isEmpty(str4)) {
                    intent2.setPackage(str4);
                }
                String str5 = zzcVar.zze;
                if (!TextUtils.isEmpty(str5)) {
                    String[] strArrSplit = str5.split("/", 2);
                    if (strArrSplit.length < 2) {
                        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                        strConcat = "Could not parse component name from open GMSG: ".concat(str5);
                    } else {
                        intent2.setClassName(strArrSplit[0], strArrSplit[1]);
                    }
                }
                String str6 = zzcVar.zzf;
                if (!TextUtils.isEmpty(str6)) {
                    try {
                        i = Integer.parseInt(str6);
                    } catch (NumberFormatException unused) {
                        int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not parse intent flags.");
                    }
                    intent2.addFlags(i);
                }
                if (((Boolean) zzbd.zzc().zzd(zzbhe.zzfw)).booleanValue()) {
                    intent2.addFlags(268435456);
                    intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
                } else {
                    if (((Boolean) zzbd.zzc().zzd(zzbhe.zzfv)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzt.zzc();
                        com.google.android.gms.ads.internal.util.zzs.zzs(context, intent2);
                    }
                }
                return zza(context, intent2, zzadVar, zzaaVar, zzcVar.zzj, zzdxzVar, str, zzcVar.zzk);
            }
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            strConcat = "Open GMSG did not contain a URL.";
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
        return false;
    }

    private static final boolean zzc(Context context, Uri uri, zzad zzadVar, zzaa zzaaVar, Bundle bundle) {
        int iZzp;
        try {
            iZzp = com.google.android.gms.ads.internal.zzt.zzc().zzp(context, uri, bundle);
            if (zzadVar != null) {
                zzadVar.zzl();
            }
        } catch (ActivityNotFoundException e) {
            String message = e.getMessage();
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(message);
            iZzp = 6;
        }
        if (zzaaVar != null) {
            zzaaVar.zzb(iZzp);
        }
        return iZzp == 5;
    }
}
