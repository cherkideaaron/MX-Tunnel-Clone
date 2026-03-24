package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzapr implements zzaef {
    private final zzfg zza;
    private final zzer zzb = new zzer();
    private final int zzc;

    public zzapr(int i, zzfg zzfgVar, int i2) {
        this.zzc = i;
        this.zza = zzfgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final zzaee zza(zzaev zzaevVar, long j) {
        int iZza;
        int iZza2;
        long jZzn = zzaevVar.zzn();
        int iMin = (int) Math.min(112800L, zzaevVar.zzo() - jZzn);
        zzer zzerVar = this.zzb;
        zzerVar.zza(iMin);
        zzaevVar.zzi(zzerVar.zzi(), 0, iMin);
        int iZze = zzerVar.zze();
        long j2 = -1;
        long j3 = -9223372036854775807L;
        long j4 = -1;
        while (zzerVar.zzd() >= 188 && (iZza2 = (iZza = zzaqd.zza(zzerVar.zzi(), zzerVar.zzg(), iZze)) + 188) <= iZze) {
            long jZzb = zzaqd.zzb(zzerVar, iZza, this.zzc);
            if (jZzb != -9223372036854775807L) {
                long jZze = this.zza.zze(jZzb);
                if (jZze <= j) {
                    j4 = iZza;
                    if (100000 + jZze <= j) {
                        j3 = jZze;
                    }
                } else if (j3 == -9223372036854775807L) {
                    return zzaee.zza(jZze, jZzn);
                }
                return zzaee.zzc(jZzn + j4);
            }
            zzerVar.zzh(iZza2);
            j2 = iZza2;
        }
        return j3 != -9223372036854775807L ? zzaee.zzb(j3, jZzn + j2) : zzaee.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final void zzb() {
        byte[] bArr = zzfj.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
    }
}
