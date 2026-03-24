package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzfrf {
    private final zzdxz zza;

    public zzfrf(zzdxz zzdxzVar, Context context) {
        this.zza = zzdxzVar;
    }

    private final void zzt(String str, long j, String str2, String str3, AdFormat adFormat, int i, int i2, int i3, String str4) {
        zzdxy zzdxyVarZza = this.zza.zza();
        zzdxyVarZza.zzc("action", str);
        zzdxyVarZza.zzc("pat", Long.toString(j));
        zzdxyVarZza.zzc("ad_format", adFormat.name().toLowerCase(Locale.ENGLISH));
        zzdxyVarZza.zzc("max_ads", Integer.toString(i));
        zzdxyVarZza.zzc("cache_size", Integer.toString(i2));
        zzdxyVarZza.zzc("pas", Integer.toString(i3));
        zzdxyVarZza.zzc("pv", "2");
        zzdxyVarZza.zzc("ad_unit_id", str3);
        zzdxyVarZza.zzc("pid", str2);
        zzdxyVarZza.zzd();
    }

    private final void zzu(String str, String str2, long j, int i, int i2, String str3, zzfrm zzfrmVar, String str4) {
        zzdxy zzdxyVarZza = this.zza.zza();
        zzdxyVarZza.zzc(str2, Long.toString(j));
        if (zzfrmVar != null) {
            zzdxyVarZza.zzc("ad_unit_id", zzfrmVar.zza());
            zzdxyVarZza.zzc("ad_format", zzfrmVar.zzb());
            zzdxyVarZza.zzc("pid", zzfrmVar.zzc());
        }
        zzdxyVarZza.zzc("action", str);
        if (str3 != null) {
            zzdxyVarZza.zzc("gqi", str3);
        }
        if (i >= 0) {
            zzdxyVarZza.zzc("max_ads", Integer.toString(i));
        }
        if (i2 >= 0) {
            zzdxyVarZza.zzc("cache_size", Integer.toString(i2));
        }
        zzdxyVarZza.zzc("pv", str4);
        zzdxyVarZza.zzd();
    }

    private final void zzv(String str, long j, String str2, String str3, AdFormat adFormat, int i, int i2, int i3, int i4, int i5) {
        zzdxy zzdxyVarZza = this.zza.zza();
        zzdxyVarZza.zzc("action", str);
        zzdxyVarZza.zzc("pat", Long.toString(j));
        zzdxyVarZza.zzc("pid", str2);
        zzdxyVarZza.zzc("ad_unit_id", str3);
        zzdxyVarZza.zzc("max_ads", Integer.toString(i));
        zzdxyVarZza.zzc("cache_size", Integer.toString(i2));
        zzdxyVarZza.zzc("tpcnt", Integer.toString(i4));
        zzdxyVarZza.zzc("mpl", Integer.toString(i5));
        if (adFormat != null) {
            zzdxyVarZza.zzc("ad_format", adFormat.name().toLowerCase(Locale.ENGLISH));
        }
        if (i3 > 0) {
            zzdxyVarZza.zzc("nptr", Integer.toString(i3));
        }
        zzdxyVarZza.zzd();
    }

    public final void zza(int i, long j, zzfrm zzfrmVar, String str) {
        zzdxy zzdxyVarZza = this.zza.zza();
        zzdxyVarZza.zzc("action", "start_preload");
        zzdxyVarZza.zzc("sp_ts", Long.toString(j));
        zzdxyVarZza.zzc("ad_format", zzfrmVar.zzb());
        zzdxyVarZza.zzc("ad_unit_id", zzfrmVar.zza());
        zzdxyVarZza.zzc("pid", zzfrmVar.zzc());
        zzdxyVarZza.zzc("max_ads", Integer.toString(i));
        zzdxyVarZza.zzc("pv", str);
        zzdxyVarZza.zzd();
    }

    public final void zzb(Map map, long j, String str) {
        zzdxy zzdxyVarZza = this.zza.zza();
        zzdxyVarZza.zzc("action", "start_preload");
        zzdxyVarZza.zzc("sp_ts", Long.toString(j));
        zzdxyVarZza.zzc("pv", "1");
        for (AdFormat adFormat : map.keySet()) {
            String strValueOf = String.valueOf(adFormat.name().toLowerCase(Locale.ENGLISH));
            zzdxyVarZza.zzc(strValueOf.concat("_count"), Integer.toString(((Integer) map.get(adFormat)).intValue()));
        }
        zzdxyVarZza.zzd();
    }

    public final void zzc(int i, int i2, long j, zzfrm zzfrmVar) {
        zzdxy zzdxyVarZza = this.zza.zza();
        zzdxyVarZza.zzc("action", "cache_resize");
        zzdxyVarZza.zzc("cs_ts", Long.toString(j));
        zzdxyVarZza.zzc("orig_ma", Integer.toString(i));
        zzdxyVarZza.zzc("max_ads", Integer.toString(i2));
        zzdxyVarZza.zzc("ad_format", zzfrmVar.zzb());
        zzdxyVarZza.zzc("ad_unit_id", zzfrmVar.zza());
        zzdxyVarZza.zzc("pid", zzfrmVar.zzc());
        zzdxyVarZza.zzc("pv", "1");
        zzdxyVarZza.zzd();
    }

    public final void zzd(int i, int i2, long j, Long l, String str, zzfrm zzfrmVar, String str2) {
        zzdxy zzdxyVarZza = this.zza.zza();
        zzdxyVarZza.zzc("plaac_ts", Long.toString(j));
        zzdxyVarZza.zzc("max_ads", Integer.toString(i));
        zzdxyVarZza.zzc("cache_size", Integer.toString(i2));
        zzdxyVarZza.zzc("action", "is_ad_available");
        if (zzfrmVar != null) {
            zzdxyVarZza.zzc("ad_unit_id", zzfrmVar.zza());
            zzdxyVarZza.zzc("pid", zzfrmVar.zzc());
            zzdxyVarZza.zzc("ad_format", zzfrmVar.zzb());
        }
        if (l != null) {
            zzdxyVarZza.zzc("plaay_ts", Long.toString(l.longValue()));
        }
        if (str != null) {
            zzdxyVarZza.zzc("gqi", str);
        }
        zzdxyVarZza.zzc("pv", str2);
        zzdxyVarZza.zzd();
    }

    public final void zze(long j, String str) {
        zzu("poll_ad", "ppacwe_ts", j, -1, -1, null, null, "2");
    }

    public final void zzf(long j, zzfrm zzfrmVar, int i, int i2, String str) {
        zzu("poll_ad", "ppac_ts", j, i, i2, null, zzfrmVar, str);
    }

    public final void zzg(long j, int i, int i2, String str, zzfrm zzfrmVar, String str2) {
        zzu("poll_ad", "psvroc_ts", j, i, i2, str, zzfrmVar, str2);
    }

    public final void zzh(long j, int i, int i2, String str, zzfrm zzfrmVar, String str2) {
        zzdxy zzdxyVarZza = this.zza.zza();
        zzdxyVarZza.zzc("ppla_ts", Long.toString(j));
        zzdxyVarZza.zzc("ad_format", zzfrmVar.zzb());
        zzdxyVarZza.zzc("ad_unit_id", zzfrmVar.zza());
        zzdxyVarZza.zzc("pid", zzfrmVar.zzc());
        zzdxyVarZza.zzc("max_ads", Integer.toString(i));
        zzdxyVarZza.zzc("cache_size", Integer.toString(i2));
        zzdxyVarZza.zzc("action", "poll_ad");
        if (str != null) {
            zzdxyVarZza.zzc("gqi", str);
        }
        zzdxyVarZza.zzc("pv", str2);
        zzdxyVarZza.zzd();
    }

    public final void zzi(long j, String str, zzfrm zzfrmVar, int i, int i2, String str2) {
        zzu("paa", "pano_ts", j, i, i2, str, zzfrmVar, str2);
    }

    public final void zzj(long j, zzfrm zzfrmVar, int i, String str) {
        zzu("pae", "paeo_ts", j, i, 0, null, zzfrmVar, str);
    }

    public final void zzk(long j, zzfrm zzfrmVar, com.google.android.gms.ads.internal.client.zze zzeVar, int i, int i2, String str) {
        zzdxy zzdxyVarZza = this.zza.zza();
        zzdxyVarZza.zzc("action", "pftla");
        zzdxyVarZza.zzc("pftlat_ts", Long.toString(j));
        zzdxyVarZza.zzc("pftlaec", Integer.toString(zzeVar.zza));
        zzdxyVarZza.zzc("ad_format", zzfrmVar.zzb());
        zzdxyVarZza.zzc("max_ads", Integer.toString(i));
        zzdxyVarZza.zzc("cache_size", Integer.toString(i2));
        zzdxyVarZza.zzc("ad_unit_id", zzfrmVar.zza());
        zzdxyVarZza.zzc("pid", zzfrmVar.zzc());
        zzdxyVarZza.zzc("pv", str);
        zzdxyVarZza.zzd();
    }

    public final void zzl(long j, AdFormat adFormat, int i) {
        zzt("pda", j, null, null, adFormat, -1, -1, i, "2");
    }

    public final void zzm(long j, String str, String str2, AdFormat adFormat, int i, int i2) {
        zzt("pd", j, str, str2, adFormat, i, i2, 1, "2");
    }

    public final void zzn(AdFormat adFormat, long j, int i) {
        zzt("pgcs", j, null, null, adFormat, -1, -1, i, "2");
    }

    public final void zzo(long j, String str, String str2, AdFormat adFormat, int i, int i2) {
        zzt("pgc", j, str, str2, adFormat, i, i2, 1, "2");
    }

    public final void zzp(int i, long j, String str, String str2, AdFormat adFormat, int i2) {
        zzt("pnav", j, str, str2, adFormat, i2, i, 1, "2");
    }

    public final void zzq(long j, String str, String str2, AdFormat adFormat, int i, int i2, int i3, int i4) {
        zzv("acmpa", j, str, str2, adFormat, i, i2, 0, i3, i4);
    }

    public final void zzr(long j, String str, String str2, AdFormat adFormat, int i, int i2, int i3, int i4, int i5) {
        zzv("acmpr", j, str, str2, adFormat, i, i2, i3, i4, i5);
    }

    public final void zzs(long j, int i, int i2) {
        zzdxy zzdxyVarZza = this.zza.zza();
        zzdxyVarZza.zzc("action", "acmlr");
        zzdxyVarZza.zzc("pat", Long.toString(j));
        zzdxyVarZza.zzc("mpl", Integer.toString(i));
        zzdxyVarZza.zzc("pas", Integer.toString(i2));
        zzdxyVarZza.zzd();
    }
}
