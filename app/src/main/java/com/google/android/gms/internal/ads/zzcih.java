package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
final class zzcih implements zzhb {
    private final zzhb zza;
    private final long zzb;
    private final zzhb zzc;
    private long zzd;
    private Uri zze;

    public zzcih(zzhb zzhbVar, int i, zzhb zzhbVar2) {
        this.zza = zzhbVar;
        this.zzb = i;
        this.zzc = zzhbVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i, int i2) {
        int i3;
        long j = this.zzd;
        long j2 = this.zzb;
        if (j < j2) {
            int iZza = this.zza.zza(bArr, i, (int) Math.min(i2, j2 - j));
            long j3 = this.zzd + iZza;
            this.zzd = j3;
            i3 = iZza;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j < j2) {
            return i3;
        }
        int iZza2 = this.zzc.zza(bArr, i + i3, i2 - i3);
        int i4 = i3 + iZza2;
        this.zzd += iZza2;
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhf zzhfVar) {
        zzhf zzhfVar2;
        Uri uri = zzhfVar.zza;
        this.zze = uri;
        long j = zzhfVar.zze;
        long j2 = this.zzb;
        zzhf zzhfVar3 = null;
        if (j >= j2) {
            zzhfVar2 = null;
        } else {
            long j3 = zzhfVar.zzf;
            long j4 = j2 - j;
            zzhfVar2 = new zzhf(uri, j, j3 != -1 ? Math.min(j3, j4) : j4, null);
        }
        long j5 = zzhfVar.zzf;
        if (j5 == -1 || j + j5 > j2) {
            zzhfVar3 = new zzhf(uri, Math.max(j2, j), j5 != -1 ? Math.min(j5, (j + j5) - j2) : -1L, null);
        }
        long jZzb = zzhfVar2 != null ? this.zza.zzb(zzhfVar2) : 0L;
        long jZzb2 = zzhfVar3 != null ? this.zzc.zzb(zzhfVar3) : 0L;
        this.zzd = j;
        if (jZzb == -1 || jZzb2 == -1) {
            return -1L;
        }
        return jZzb + jZzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zze(zzhz zzhzVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Map zzj() {
        return zzgui.zza();
    }
}
