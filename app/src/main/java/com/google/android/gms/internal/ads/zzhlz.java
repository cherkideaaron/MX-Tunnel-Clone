package com.google.android.gms.internal.ads;

import defpackage.AbstractC3264qG;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzhlz implements zzhla {
    private static final zzhlz zza = new zzhlz();

    private zzhlz() {
    }

    public static void zzc() {
        zzhkd.zza().zzc(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhla
    public final Class zza() {
        return zzhlx.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhla
    public final Class zzb() {
        return zzhlx.class;
    }

    @Override // com.google.android.gms.internal.ads.zzhla
    public final /* bridge */ /* synthetic */ Object zze(zzhjj zzhjjVar, zzhjr zzhjrVar, zzhkz zzhkzVar) throws GeneralSecurityException {
        zzhye zzhyeVarZzd;
        zzhbi zzhbiVarZzc = ((zzhbk) zzhjjVar).zzc();
        zzhkp zzhkpVar = new zzhkp();
        for (int i = 0; i < zzhjjVar.zzd(); i++) {
            zzhbi zzhbiVarZze = ((zzhbk) zzhjjVar).zze(i);
            if (zzhbiVarZze.zzb().equals(zzhbb.zza)) {
                zzhlx zzhlxVar = (zzhlx) zzhkzVar.zza(zzhbiVarZze);
                zzhaz zzhazVarZza = zzhbiVarZze.zza();
                if (zzhazVarZza instanceof zzhmm) {
                    zzhyeVarZzd = ((zzhmm) zzhazVarZza).zze();
                } else {
                    if (!(zzhazVarZza instanceof zzhjo)) {
                        String name = zzhazVarZza.getClass().getName();
                        String strValueOf = String.valueOf(zzhazVarZza.zza());
                        throw new GeneralSecurityException(AbstractC3264qG.m(new StringBuilder(name.length() + 59 + strValueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", strValueOf));
                    }
                    zzhyeVarZzd = ((zzhjo) zzhazVarZza).zzd();
                }
                zzhkpVar.zza(zzhyeVarZzd, zzhlxVar);
            }
        }
        return new zzhly(zzhkpVar.zzb(), (zzhlx) zzhkzVar.zza(zzhbiVarZzc), null);
    }
}
