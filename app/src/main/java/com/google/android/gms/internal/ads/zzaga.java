package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import defpackage.AP;
import java.util.List;

/* loaded from: classes.dex */
public final class zzaga implements zzaeu {
    private final int zza;
    private final int zzb;
    private final String zzc;
    private int zzd;
    private int zze;
    private zzaex zzf;
    private zzagh zzg;

    public zzaga(int i, int i2, String str) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) {
        int i = this.zza;
        zzgrc.zzi((i == -1 || this.zzb == -1) ? false : true);
        int i2 = this.zzb;
        zzer zzerVar = new zzer(i2);
        ((zzael) zzaevVar).zzh(zzerVar.zzi(), 0, i2, false);
        return zzerVar.zzt() == i;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final /* synthetic */ List zzb() {
        return AP.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zzf = zzaexVar;
        zzagh zzaghVarZzu = zzaexVar.zzu(UserVerificationMethods.USER_VERIFY_ALL, 4);
        this.zzg = zzaghVarZzu;
        zzt zztVar = new zzt();
        String str = this.zzc;
        zztVar.zzl(str);
        zztVar.zzm(str);
        zzaghVarZzu.zzz(zztVar.zzM());
        this.zzf.zzv();
        this.zzf.zzw(new zzagb(-9223372036854775807L));
        this.zze = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) {
        int i = this.zze;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        zzagh zzaghVar = this.zzg;
        zzaghVar.getClass();
        int iZza = zzaghVar.zza(zzaevVar, UserVerificationMethods.USER_VERIFY_ALL, true);
        if (iZza == -1) {
            this.zze = 2;
            this.zzg.zze(0L, 1, this.zzd, 0, null);
            this.zzd = 0;
        } else {
            this.zzd += iZza;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j, long j2) {
        if (j == 0 || this.zze == 1) {
            this.zze = 1;
            this.zzd = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final /* synthetic */ zzaeu zzg() {
        return AP.b(this);
    }
}
