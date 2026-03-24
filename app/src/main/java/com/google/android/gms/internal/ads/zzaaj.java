package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class zzaaj {
    private zzaai zza;
    private zzaas zzb;

    public void zzb() {
        this.zza = null;
        this.zzb = null;
    }

    public boolean zzd() {
        throw null;
    }

    public void zze(zzd zzdVar) {
        throw null;
    }

    public zzmm zzg() {
        throw null;
    }

    public abstract void zzp(Object obj);

    public abstract zzaak zzq(zzmn[] zzmnVarArr, zzyn zzynVar, zzwk zzwkVar, zzbf zzbfVar);

    public final void zzr(zzaai zzaaiVar, zzaas zzaasVar) {
        zzgrc.zzi(this.zza == null);
        this.zza = zzaaiVar;
        this.zzb = zzaasVar;
    }

    public final void zzs() {
        zzaai zzaaiVar = this.zza;
        if (zzaaiVar != null) {
            zzaaiVar.zzq();
        }
    }

    public final zzaas zzt() {
        zzaas zzaasVar = this.zzb;
        zzaasVar.getClass();
        return zzaasVar;
    }
}
