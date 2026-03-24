package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import defpackage.As;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zzfon {
    public static boolean zza(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzke), str);
    }

    public static void zzb(As as, zzfoe zzfoeVar) {
        if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
            zzgzo.zzr(zzgzg.zzw(as), new zzfoj(zzfoeVar), zzcei.zzg);
        }
    }

    public static zzfmu zzc(final zzfoe zzfoeVar) {
        return new zzfmu() { // from class: com.google.android.gms.internal.ads.zzfom
            @Override // com.google.android.gms.internal.ads.zzfmu
            public final /* synthetic */ Object zza(Object obj) {
                if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
                    zzfoeVar.zza();
                }
                return obj;
            }
        };
    }

    public static void zzd(As as, zzfoo zzfooVar, zzfoe zzfoeVar) {
        zzh(as, zzfooVar, zzfoeVar, false);
    }

    public static void zze(As as, zzfoo zzfooVar, zzfoe zzfoeVar) {
        zzh(as, zzfooVar, zzfoeVar, true);
    }

    public static void zzf(As as, zzfoo zzfooVar, zzfoe zzfoeVar) {
        if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
            zzgzo.zzr(zzgzg.zzw(as), new zzfol(zzfooVar, zzfoeVar), zzcei.zzg);
        }
    }

    public static int zzg(zzfjk zzfjkVar) {
        int iZzg = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzg(zzfjkVar) - 1;
        return (iZzg == 0 || iZzg == 1) ? 7 : 23;
    }

    private static void zzh(As as, zzfoo zzfooVar, zzfoe zzfoeVar, boolean z) {
        if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
            zzgzo.zzr(zzgzg.zzw(as), new zzfok(zzfooVar, zzfoeVar, z), zzcei.zzg);
        }
    }
}
