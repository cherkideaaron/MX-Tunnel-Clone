package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzhbd {
    private boolean zza;
    private final zzhbp zzc;
    private final zzhbb zzb = zzhbb.zza;
    private zzhbe zzd = null;
    private zzhbf zze = null;

    public /* synthetic */ zzhbd(zzhbp zzhbpVar, byte[] bArr) {
        this.zzc = zzhbpVar;
    }

    public final zzhbd zza() {
        zzhbf zzhbfVar = this.zze;
        if (zzhbfVar != null) {
            zzhbfVar.zzc();
        }
        this.zza = true;
        return this;
    }

    public final zzhbd zzb() {
        this.zzd = zzhbe.zza;
        return this;
    }

    public final /* synthetic */ boolean zzc() {
        return this.zza;
    }

    public final /* synthetic */ void zzd(boolean z) {
        this.zza = false;
    }

    public final /* synthetic */ zzhbb zze() {
        return this.zzb;
    }

    public final /* synthetic */ zzhbp zzf() {
        return this.zzc;
    }

    public final /* synthetic */ zzhbe zzg() {
        return this.zzd;
    }

    public final /* synthetic */ zzhbf zzh() {
        return this.zze;
    }

    public final /* synthetic */ void zzi(zzhbf zzhbfVar) {
        this.zze = zzhbfVar;
    }
}
