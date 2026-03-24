package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzapt {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfg zza = new zzfg(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzer zzb = new zzer();

    public zzapt(int i) {
    }

    private final int zze(zzaev zzaevVar) {
        byte[] bArr = zzfj.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
        this.zzc = true;
        zzaevVar.zzl();
        return 0;
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final int zzb(zzaev zzaevVar, zzafv zzafvVar, int i) {
        long j;
        if (i <= 0) {
            zze(zzaevVar);
            return 0;
        }
        long j2 = -9223372036854775807L;
        if (!this.zze) {
            long jZzo = zzaevVar.zzo();
            int iMin = (int) Math.min(112800L, jZzo);
            j = jZzo - iMin;
            if (zzaevVar.zzn() == j) {
                zzer zzerVar = this.zzb;
                zzerVar.zza(iMin);
                zzaevVar.zzl();
                zzaevVar.zzi(zzerVar.zzi(), 0, iMin);
                int iZzg = zzerVar.zzg();
                int iZze = zzerVar.zze();
                int i2 = iZze - 188;
                while (true) {
                    if (i2 < iZzg) {
                        break;
                    }
                    byte[] bArrZzi = zzerVar.zzi();
                    int i3 = -4;
                    int i4 = 0;
                    while (true) {
                        if (i3 > 4) {
                            break;
                        }
                        int i5 = (i3 * 188) + i2;
                        if (i5 < iZzg || i5 >= iZze || bArrZzi[i5] != 71) {
                            i4 = 0;
                        } else {
                            i4++;
                            if (i4 == 5) {
                                long jZzb = zzaqd.zzb(zzerVar, i2, i);
                                if (jZzb != -9223372036854775807L) {
                                    j2 = jZzb;
                                    break;
                                }
                            }
                        }
                        i3++;
                    }
                    i2--;
                }
                this.zzg = j2;
                this.zze = true;
                return 0;
            }
        } else {
            if (this.zzg == -9223372036854775807L) {
                zze(zzaevVar);
                return 0;
            }
            if (this.zzd) {
                long j3 = this.zzf;
                if (j3 == -9223372036854775807L) {
                    zze(zzaevVar);
                    return 0;
                }
                zzfg zzfgVar = this.zza;
                this.zzh = zzfgVar.zzf(this.zzg) - zzfgVar.zze(j3);
                zze(zzaevVar);
                return 0;
            }
            int iMin2 = (int) Math.min(112800L, zzaevVar.zzo());
            j = 0;
            if (zzaevVar.zzn() == 0) {
                zzer zzerVar2 = this.zzb;
                zzerVar2.zza(iMin2);
                zzaevVar.zzl();
                zzaevVar.zzi(zzerVar2.zzi(), 0, iMin2);
                int iZzg2 = zzerVar2.zzg();
                int iZze2 = zzerVar2.zze();
                while (true) {
                    if (iZzg2 >= iZze2) {
                        break;
                    }
                    if (zzerVar2.zzi()[iZzg2] == 71) {
                        long jZzb2 = zzaqd.zzb(zzerVar2, iZzg2, i);
                        if (jZzb2 != -9223372036854775807L) {
                            j2 = jZzb2;
                            break;
                        }
                    }
                    iZzg2++;
                }
                this.zzf = j2;
                this.zzd = true;
                return 0;
            }
        }
        zzafvVar.zza = j;
        return 1;
    }

    public final long zzc() {
        return this.zzh;
    }

    public final zzfg zzd() {
        return this.zza;
    }
}
