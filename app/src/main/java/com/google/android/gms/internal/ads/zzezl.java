package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzezl implements zzfav {
    private final String zza;
    private final Integer zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;

    public zzezl(String str, Integer num, String str2, String str3, String str4, String str5) {
        this.zza = str;
        this.zzb = num;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = str5;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzdah) obj).zza;
        zzfjz.zze(bundle, "pn", this.zza);
        zzfjz.zzh(bundle, "vc", this.zzb);
        zzfjz.zze(bundle, "vnm", this.zzc);
        zzfjz.zze(bundle, "dl", this.zzd);
        zzfjz.zze(bundle, "ins_pn", this.zze);
        zzfjz.zze(bundle, "ini_pn", this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzdah) obj).zzb;
        zzfjz.zze(bundle, "pn", this.zza);
        zzfjz.zze(bundle, "dl", this.zzd);
    }
}
