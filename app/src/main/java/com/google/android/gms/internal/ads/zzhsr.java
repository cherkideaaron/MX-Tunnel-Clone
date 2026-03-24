package com.google.android.gms.internal.ads;

import defpackage.AbstractC3264qG;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzhsr extends zzhuv {
    private final zzhsx zza;
    private final zzhyg zzb;

    private zzhsr(zzhsx zzhsxVar, zzhyg zzhygVar) {
        this.zza = zzhsxVar;
        this.zzb = zzhygVar;
    }

    public static zzhsr zzc(zzhsx zzhsxVar, zzhyg zzhygVar) throws GeneralSecurityException {
        if (zzhygVar.zzd() != 32) {
            int iZzd = zzhygVar.zzd();
            throw new GeneralSecurityException(AbstractC3264qG.k(new StringBuilder(String.valueOf(iZzd).length() + 65), "Ed25519 key must be constructed with key of length 32 bytes, not ", iZzd));
        }
        if (Arrays.equals(zzhsxVar.zzd().zzc(), zzhio.zza(zzhio.zzb(zzhygVar.zzc(zzhax.zza()))))) {
            return new zzhsr(zzhsxVar, zzhygVar);
        }
        throw new GeneralSecurityException("Ed25519 keys mismatch");
    }

    @Override // com.google.android.gms.internal.ads.zzhuv, com.google.android.gms.internal.ads.zzhaz
    public final /* synthetic */ zzhbp zza() {
        return this.zza.zzf();
    }

    public final zzhsq zzd() {
        return this.zza.zzf();
    }

    public final zzhsx zze() {
        return this.zza;
    }

    public final zzhyg zzf() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhuv
    public final /* synthetic */ zzhuw zzg() {
        return this.zza;
    }
}
