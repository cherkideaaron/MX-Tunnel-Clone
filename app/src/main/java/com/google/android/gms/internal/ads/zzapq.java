package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class zzapq {
    private final List zza;
    private final zzagh[] zzc;
    private final String zzb = "video/mp2t";
    private final zzgq zzd = new zzgq(new zzgp() { // from class: com.google.android.gms.internal.ads.zzapp
        @Override // com.google.android.gms.internal.ads.zzgp
        public final /* synthetic */ void zza(long j, zzer zzerVar) {
            this.zza.zzf(j, zzerVar);
        }
    });

    public zzapq(List list, String str) {
        this.zza = list;
        this.zzc = new zzagh[list.size()];
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
            String strZzc = zzvVar.zza;
            if (strZzc == null) {
                strZzc = zzaqbVar.zzc();
            }
            zzt zztVar = new zzt();
            zztVar.zza(strZzc);
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

    public final void zzb(int i) {
        this.zzd.zza(i);
    }

    public final void zzc(long j, zzer zzerVar) {
        this.zzd.zzc(j, zzerVar);
    }

    public final void zzd() {
        this.zzd.zze();
    }

    public final void zze() {
        this.zzd.zze();
    }

    public final /* synthetic */ void zzf(long j, zzer zzerVar) {
        zzaeh.zza(j, zzerVar, this.zzc);
    }
}
