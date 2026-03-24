package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzhjo extends zzhaz {
    private final zzhlb zza;

    public zzhjo(zzhlb zzhlbVar, zzhbt zzhbtVar) {
        zze(zzhlbVar, zzhbtVar);
        this.zza = zzhlbVar;
    }

    private static void zze(zzhlb zzhlbVar, zzhbt zzhbtVar) {
        int i = zzhjm.zzb[zzhlbVar.zzc().ordinal()];
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final zzhbp zza() {
        zzhlb zzhlbVar = this.zza;
        return new zzhjn(zzhlbVar.zzg(), zzhlbVar.zzd(), null);
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final Integer zzb() {
        return this.zza.zze();
    }

    public final zzhlb zzc(zzhbt zzhbtVar) {
        zzhlb zzhlbVar = this.zza;
        zze(zzhlbVar, zzhbtVar);
        return zzhlbVar;
    }

    public final zzhye zzd() {
        zzhlb zzhlbVar = this.zza;
        if (zzhlbVar.zzd().equals(zzhqy.RAW)) {
            return zzhye.zza(new byte[0]);
        }
        if (zzhlbVar.zzd().equals(zzhqy.TINK)) {
            return zzhkh.zzb(zzhlbVar.zze().intValue());
        }
        if (zzhlbVar.zzd().equals(zzhqy.LEGACY) || zzhlbVar.zzd().equals(zzhqy.CRUNCHY)) {
            return zzhkh.zza(zzhlbVar.zze().intValue());
        }
        throw new GeneralSecurityException("Unknown output prefix type");
    }
}
