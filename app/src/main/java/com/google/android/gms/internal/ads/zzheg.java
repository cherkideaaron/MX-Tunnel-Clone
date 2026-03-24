package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final /* synthetic */ class zzheg implements zzhkt {
    static final /* synthetic */ zzheg zza = new zzheg();

    private /* synthetic */ zzheg() {
    }

    @Override // com.google.android.gms.internal.ads.zzhkt
    public final /* synthetic */ Object zza(zzhaz zzhazVar) throws GeneralSecurityException {
        zzher zzherVar = (zzher) zzhazVar;
        int i = zzhei.zza;
        String strZzb = zzherVar.zze().zzb();
        zzhch zzhchVarZzd = zzherVar.zze().zzd();
        zzhas zzhasVarZzb = zzhbn.zza(strZzb).zzb();
        int i2 = zzhef.zza;
        try {
            return zzhhj.zzc(new zzhef(zzhqf.zzd(zzhbv.zza(zzhchVarZzd), zzibb.zza()), zzhasVarZzb), zzherVar.zzc());
        } catch (zzicg e) {
            throw new GeneralSecurityException(e);
        }
    }
}
