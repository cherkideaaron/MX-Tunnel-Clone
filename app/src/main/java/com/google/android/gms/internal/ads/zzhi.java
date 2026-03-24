package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzhi implements zzha {
    private zzhz zzb;
    private String zzc;
    private boolean zzf;
    private final zzht zza = new zzht();
    private int zzd = 8000;
    private int zze = 8000;

    public final zzhi zzb(String str) {
        this.zzc = str;
        return this;
    }

    public final zzhi zzc(int i) {
        this.zzd = i;
        return this;
    }

    public final zzhi zzd(int i) {
        this.zze = i;
        return this;
    }

    public final zzhi zze(boolean z) {
        this.zzf = true;
        return this;
    }

    public final zzhi zzf(zzhz zzhzVar) {
        this.zzb = zzhzVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzha
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzhm zza() {
        zzhm zzhmVar = new zzhm(this.zzc, this.zzd, this.zze, this.zzf, false, this.zza, null, false, null);
        zzhz zzhzVar = this.zzb;
        if (zzhzVar != null) {
            zzhmVar.zze(zzhzVar);
        }
        return zzhmVar;
    }
}
