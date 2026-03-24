package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzpe {
    final /* synthetic */ zzpf zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzwk zze;
    private boolean zzf;
    private boolean zzg;

    public zzpe(zzpf zzpfVar, String str, int i, zzwk zzwkVar) {
        Objects.requireNonNull(zzpfVar);
        this.zza = zzpfVar;
        this.zzb = str;
        this.zzc = i;
        this.zzd = zzwkVar == null ? -1L : zzwkVar.zzd;
        if (zzwkVar == null || !zzwkVar.zzb()) {
            return;
        }
        this.zze = zzwkVar;
    }

    public final boolean zza(zzbf zzbfVar, zzbf zzbfVar2) {
        int i = this.zzc;
        if (i < zzbfVar.zza()) {
            zzpf zzpfVar = this.zza;
            zzbfVar.zzb(i, zzpfVar.zzj(), 0L);
            for (int i2 = zzpfVar.zzj().zzn; i2 <= zzpfVar.zzj().zzo; i2++) {
                int iZze = zzbfVar2.zze(zzbfVar.zzf(i2));
                if (iZze != -1) {
                    i = zzbfVar2.zzd(iZze, zzpfVar.zzk(), false).zzc;
                    break;
                }
            }
            i = -1;
        } else if (i >= zzbfVar2.zza()) {
            i = -1;
        }
        this.zzc = i;
        if (i == -1) {
            return false;
        }
        zzwk zzwkVar = this.zze;
        return zzwkVar == null || zzbfVar2.zze(zzwkVar.zza) != -1;
    }

    public final boolean zzb(int i, zzwk zzwkVar) {
        if (zzwkVar != null) {
            long j = zzwkVar.zzd;
            if (j != -1) {
                zzwk zzwkVar2 = this.zze;
                return zzwkVar2 == null ? !zzwkVar.zzb() && j == this.zzd : j == zzwkVar2.zzd && zzwkVar.zzb == zzwkVar2.zzb && zzwkVar.zzc == zzwkVar2.zzc;
            }
        }
        return i == this.zzc;
    }

    public final void zzc(int i, zzwk zzwkVar) {
        if (this.zzd == -1 && i == this.zzc && zzwkVar != null) {
            zzpf zzpfVar = this.zza;
            long j = zzwkVar.zzd;
            if (j >= zzpfVar.zzi()) {
                this.zzd = j;
            }
        }
    }

    public final boolean zzd(zzmy zzmyVar) {
        zzwk zzwkVar = zzmyVar.zzd;
        if (zzwkVar == null) {
            return this.zzc != zzmyVar.zzc;
        }
        long j = this.zzd;
        if (j == -1) {
            return false;
        }
        long j2 = zzwkVar.zzd;
        if (j2 > j) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        zzbf zzbfVar = zzmyVar.zzb;
        int iZze = zzbfVar.zze(zzwkVar.zza);
        int iZze2 = zzbfVar.zze(this.zze.zza);
        zzwk zzwkVar2 = this.zze;
        if (j2 < zzwkVar2.zzd || iZze < iZze2) {
            return false;
        }
        if (iZze > iZze2) {
            return true;
        }
        if (!zzwkVar.zzb()) {
            int i = zzwkVar.zze;
            return i == -1 || i > zzwkVar2.zzb;
        }
        int i2 = zzwkVar.zzb;
        int i3 = zzwkVar.zzc;
        int i4 = zzwkVar2.zzb;
        if (i2 <= i4) {
            return i2 == i4 && i3 > zzwkVar2.zzc;
        }
        return true;
    }

    public final /* synthetic */ String zze() {
        return this.zzb;
    }

    public final /* synthetic */ int zzf() {
        return this.zzc;
    }

    public final /* synthetic */ long zzg() {
        return this.zzd;
    }

    public final /* synthetic */ zzwk zzh() {
        return this.zze;
    }

    public final /* synthetic */ boolean zzi() {
        return this.zzf;
    }

    public final /* synthetic */ void zzj(boolean z) {
        this.zzf = true;
    }

    public final /* synthetic */ boolean zzk() {
        return this.zzg;
    }

    public final /* synthetic */ void zzl(boolean z) {
        this.zzg = true;
    }
}
