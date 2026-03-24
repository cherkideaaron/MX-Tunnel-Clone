package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
final class zzaqf {
    private final List zza;
    private final String zzb = "video/mp2t";
    private final zzagh[] zzc;
    private final zzgq zzd;

    public zzaqf(List list, String str) {
        this.zza = list;
        this.zzc = new zzagh[list.size()];
        zzgq zzgqVar = new zzgq(new zzgp() { // from class: com.google.android.gms.internal.ads.zzaqe
            @Override // com.google.android.gms.internal.ads.zzgp
            public final /* synthetic */ void zza(long j, zzer zzerVar) {
                this.zza.zzc(j, zzerVar);
            }
        });
        this.zzd = zzgqVar;
        zzgqVar.zza(3);
    }

    public final void zza(zzaex zzaexVar, zzaqb zzaqbVar) {
        int i = 0;
        while (true) {
            zzagh[] zzaghVarArr = this.zzc;
            if (i >= zzaghVarArr.length) {
                return;
            }
            zzaqbVar.zza();
            zzagh zzaghVarZzu = zzaexVar.zzu(zzaqbVar.zzb(), 3);
            zzv zzvVar = (zzv) this.zza.get(i);
            String str = zzvVar.zzo;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            zzgrc.zzf(z, "Invalid closed caption MIME type provided: %s", str);
            zzt zztVar = new zzt();
            zztVar.zza(zzaqbVar.zzc());
            zztVar.zzl(this.zzb);
            zztVar.zzm(str);
            zztVar.zzf(zzvVar.zze);
            zztVar.zze(zzvVar.zzd);
            zztVar.zzJ(zzvVar.zzL);
            zztVar.zzp(zzvVar.zzr);
            zzaghVarZzu.zzz(zztVar.zzM());
            zzaghVarArr[i] = zzaghVarZzu;
            i++;
        }
    }

    public final void zzb(long j, zzer zzerVar) {
        if (zzerVar.zzd() < 9) {
            return;
        }
        int iZzB = zzerVar.zzB();
        int iZzB2 = zzerVar.zzB();
        int iZzs = zzerVar.zzs();
        if (iZzB == 434 && iZzB2 == 1195456820 && iZzs == 3) {
            this.zzd.zzc(j, zzerVar);
        }
    }

    public final /* synthetic */ void zzc(long j, zzer zzerVar) {
        zzaeh.zzb(j, zzerVar, this.zzc);
    }
}
