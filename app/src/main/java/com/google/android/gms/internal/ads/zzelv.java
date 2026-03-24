package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzelv extends zzbty implements zzdcp {
    private zzbtz zza;
    private zzdco zzb;

    @Override // com.google.android.gms.internal.ads.zzdcp
    public final synchronized void zza(zzdco zzdcoVar) {
        this.zzb = zzdcoVar;
    }

    public final synchronized void zzc(zzbtz zzbtzVar) {
        this.zza = zzbtzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final synchronized void zze() {
        zzbtz zzbtzVar = this.zza;
        if (zzbtzVar != null) {
            zzbtzVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final synchronized void zzf() {
        zzbtz zzbtzVar = this.zza;
        if (zzbtzVar != null) {
            zzbtzVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final synchronized void zzg(int i) {
        zzdco zzdcoVar = this.zzb;
        if (zzdcoVar != null) {
            zzdcoVar.zzb(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final synchronized void zzh() {
        zzbtz zzbtzVar = this.zza;
        if (zzbtzVar != null) {
            zzbtzVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final synchronized void zzi() {
        zzbtz zzbtzVar = this.zza;
        if (zzbtzVar != null) {
            zzbtzVar.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final synchronized void zzj() {
        try {
            zzbtz zzbtzVar = this.zza;
            if (zzbtzVar != null) {
                zzbtzVar.zzj();
            }
            zzdco zzdcoVar = this.zzb;
            if (zzdcoVar != null) {
                zzdcoVar.zza();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final synchronized void zzk() {
        zzbtz zzbtzVar = this.zza;
        if (zzbtzVar != null) {
            zzbtzVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final synchronized void zzl(String str, String str2) {
        zzbtz zzbtzVar = this.zza;
        if (zzbtzVar != null) {
            zzbtzVar.zzl(str, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final synchronized void zzm(zzblm zzblmVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final synchronized void zzn() {
        zzbtz zzbtzVar = this.zza;
        if (zzbtzVar != null) {
            zzbtzVar.zzn();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final synchronized void zzo() {
        zzbtz zzbtzVar = this.zza;
        if (zzbtzVar != null) {
            zzbtzVar.zzo();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final synchronized void zzp(zzcas zzcasVar) {
        zzbtz zzbtzVar = this.zza;
        if (zzbtzVar != null) {
            zzbtzVar.zzp(zzcasVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final synchronized void zzq() {
        zzbtz zzbtzVar = this.zza;
        if (zzbtzVar != null) {
            zzbtzVar.zzq();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final synchronized void zzr(zzcaw zzcawVar) {
        zzbtz zzbtzVar = this.zza;
        if (zzbtzVar != null) {
            zzbtzVar.zzr(zzcawVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final synchronized void zzs(int i) {
        zzbtz zzbtzVar = this.zza;
        if (zzbtzVar != null) {
            zzbtzVar.zzs(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final synchronized void zzt() {
        zzbtz zzbtzVar = this.zza;
        if (zzbtzVar != null) {
            zzbtzVar.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final synchronized void zzu() {
        zzbtz zzbtzVar = this.zza;
        if (zzbtzVar != null) {
            zzbtzVar.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final synchronized void zzv(String str) {
        zzbtz zzbtzVar = this.zza;
        if (zzbtzVar != null) {
            zzbtzVar.zzv(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final synchronized void zzw(int i, String str) {
        zzdco zzdcoVar = this.zzb;
        if (zzdcoVar != null) {
            zzdcoVar.zzc(i, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final synchronized void zzx(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzdco zzdcoVar = this.zzb;
        if (zzdcoVar != null) {
            zzdcoVar.zzd(zzeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final synchronized void zzy(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzbtz zzbtzVar = this.zza;
        if (zzbtzVar != null) {
            zzbtzVar.zzy(zzeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final synchronized void zzz() {
        zzbtz zzbtzVar = this.zza;
        if (zzbtzVar != null) {
            zzbtzVar.zzz();
        }
    }
}
