package com.google.android.gms.internal.ads;

import defpackage.AbstractC3264qG;
import defpackage.Vs;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzhsx extends zzhuw {
    private final zzhsq zza;
    private final zzhye zzb;
    private final zzhye zzc;
    private final Integer zzd;

    private zzhsx(zzhsq zzhsqVar, zzhye zzhyeVar, zzhye zzhyeVar2, Integer num) {
        this.zza = zzhsqVar;
        this.zzb = zzhyeVar;
        this.zzc = zzhyeVar2;
        this.zzd = num;
    }

    public static zzhsx zzc(zzhsp zzhspVar, zzhye zzhyeVar, Integer num) throws GeneralSecurityException {
        zzhye zzhyeVarZza;
        zzhsq zzhsqVarZzb = zzhsq.zzb(zzhspVar);
        zzhsp zzhspVar2 = zzhsp.zzd;
        if (!zzhspVar.equals(zzhspVar2) && num == null) {
            String string = zzhspVar.toString();
            throw new GeneralSecurityException(Vs.o(new StringBuilder(string.length() + 62), "For given Variant ", string, " the value of idRequirement must be non-null"));
        }
        if (zzhspVar.equals(zzhspVar2) && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzhyeVar.zzd() != 32) {
            int iZzd = zzhyeVar.zzd();
            throw new GeneralSecurityException(AbstractC3264qG.k(new StringBuilder(String.valueOf(iZzd).length() + 65), "Ed25519 key must be constructed with key of length 32 bytes, not ", iZzd));
        }
        if (zzhsqVarZzb.zzc() == zzhspVar2) {
            zzhyeVarZza = zzhkh.zza;
        } else if (zzhsqVarZzb.zzc() == zzhsp.zzb || zzhsqVarZzb.zzc() == zzhsp.zzc) {
            zzhyeVarZza = zzhkh.zza(num.intValue());
        } else {
            if (zzhsqVarZzb.zzc() != zzhsp.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzhsqVarZzb.zzc().toString()));
            }
            zzhyeVarZza = zzhkh.zzb(num.intValue());
        }
        return new zzhsx(zzhsqVarZzb, zzhyeVar, zzhyeVarZza, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhuw, com.google.android.gms.internal.ads.zzhaz
    public final /* synthetic */ zzhbp zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final Integer zzb() {
        return this.zzd;
    }

    public final zzhye zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhuw
    public final zzhye zze() {
        return this.zzc;
    }

    public final zzhsq zzf() {
        return this.zza;
    }
}
