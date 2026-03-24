package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes.dex */
public final class zzaol implements zzaon {
    private final zzer zza;
    private final String zzc;
    private final int zzd;
    private String zzf;
    private zzagh zzg;
    private int zzi;
    private int zzj;
    private long zzk;
    private zzv zzl;
    private int zzm;
    private int zzn;
    private int zzh = 0;
    private long zzq = -9223372036854775807L;
    private final AtomicInteger zzb = new AtomicInteger();
    private int zzo = -1;
    private int zzp = -1;
    private final String zze = "video/mp2t";

    public zzaol(String str, int i, int i2, String str2) {
        this.zza = new zzer(new byte[i2]);
        this.zzc = str;
        this.zzd = i;
    }

    private final boolean zzf(zzer zzerVar, byte[] bArr, int i) {
        int iMin = Math.min(zzerVar.zzd(), i - this.zzi);
        zzerVar.zzm(bArr, this.zzi, iMin);
        int i2 = this.zzi + iMin;
        this.zzi = i2;
        return i2 == i;
    }

    @RequiresNonNull({"output"})
    private final void zzg(zzaes zzaesVar) {
        int i;
        int i2 = zzaesVar.zzb;
        if (i2 == -2147483647 || (i = zzaesVar.zzc) == -1) {
            return;
        }
        zzv zzvVar = this.zzl;
        if (zzvVar != null && i == zzvVar.zzG && i2 == zzvVar.zzH && Objects.equals(zzaesVar.zza, zzvVar.zzo)) {
            return;
        }
        zzv zzvVar2 = this.zzl;
        zzt zztVar = zzvVar2 == null ? new zzt() : zzvVar2.zza();
        zztVar.zza(this.zzf);
        zztVar.zzl(this.zze);
        zztVar.zzm(zzaesVar.zza);
        zztVar.zzE(i);
        zztVar.zzF(i2);
        zztVar.zze(this.zzc);
        zztVar.zzg(this.zzd);
        zzv zzvVarZzM = zztVar.zzM();
        this.zzl = zzvVarZzM;
        this.zzg.zzz(zzvVarZzM);
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zza() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = 0;
        this.zzq = -9223372036854775807L;
        this.zzb.set(0);
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzb(zzaex zzaexVar, zzaqb zzaqbVar) {
        zzaqbVar.zza();
        this.zzf = zzaqbVar.zzc();
        this.zzg = zzaexVar.zzu(zzaqbVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzc(long j, int i) {
        this.zzq = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzd(zzer zzerVar) throws zzat {
        zzer zzerVar2;
        zzagh zzaghVar;
        int i;
        int i2;
        int i3;
        byte b;
        int i4;
        this.zzg.getClass();
        while (zzerVar.zzd() > 0) {
            int i5 = this.zzh;
            if (i5 == 0) {
                while (true) {
                    if (zzerVar.zzd() > 0) {
                        int i6 = this.zzj << 8;
                        this.zzj = i6;
                        int iZzs = i6 | zzerVar.zzs();
                        this.zzj = iZzs;
                        int iZza = zzaet.zza(iZzs);
                        this.zzn = iZza;
                        if (iZza != 0) {
                            byte[] bArrZzi = this.zza.zzi();
                            int i7 = this.zzj;
                            bArrZzi[0] = (byte) ((i7 >> 24) & 255);
                            bArrZzi[1] = (byte) ((i7 >> 16) & 255);
                            bArrZzi[2] = (byte) ((i7 >> 8) & 255);
                            bArrZzi[3] = (byte) (i7 & 255);
                            this.zzi = 4;
                            this.zzj = 0;
                            if (iZza == 3 || iZza == 4) {
                                this.zzh = 4;
                            } else if (iZza == 1) {
                                this.zzh = 1;
                            } else {
                                this.zzh = 2;
                            }
                        }
                    }
                }
            } else if (i5 == 1) {
                zzer zzerVar3 = this.zza;
                if (zzf(zzerVar, zzerVar3.zzi(), 18)) {
                    byte[] bArrZzi2 = zzerVar3.zzi();
                    if (this.zzl == null) {
                        zzv zzvVarZzb = zzaet.zzb(bArrZzi2, this.zzf, this.zzc, this.zzd, this.zze, null);
                        this.zzl = zzvVarZzb;
                        this.zzg.zzz(zzvVarZzb);
                    }
                    this.zzm = zzaet.zzc(bArrZzi2);
                    byte b2 = bArrZzi2[0];
                    if (b2 != -2) {
                        if (b2 == -1) {
                            i3 = (bArrZzi2[4] & 7) << 4;
                            b = bArrZzi2[7];
                        } else if (b2 != 31) {
                            i3 = (bArrZzi2[4] & 1) << 6;
                            i4 = bArrZzi2[5] & 252;
                            i2 = (i4 >> 2) | i3;
                        } else {
                            i3 = (7 & bArrZzi2[5]) << 4;
                            b = bArrZzi2[6];
                        }
                        i4 = b & 60;
                        i2 = (i4 >> 2) | i3;
                    } else {
                        i2 = ((bArrZzi2[4] & 252) >> 2) | ((bArrZzi2[5] & 1) << 6);
                    }
                    this.zzk = zzgxz.zza(zzfj.zzr((i2 + 1) * 32, this.zzl.zzH));
                    zzerVar3.zzh(0);
                    this.zzg.zzc(zzerVar3, 18);
                    this.zzh = 6;
                }
            } else if (i5 != 2) {
                if (i5 == 3) {
                    zzerVar2 = this.zza;
                    if (zzf(zzerVar, zzerVar2.zzi(), this.zzo)) {
                        zzaes zzaesVarZzd = zzaet.zzd(zzerVar2.zzi());
                        zzg(zzaesVarZzd);
                        this.zzm = zzaesVarZzd.zzd;
                        long j = zzaesVarZzd.zze;
                        this.zzk = j != -9223372036854775807L ? j : 0L;
                        zzerVar2.zzh(0);
                        zzaghVar = this.zzg;
                        i = this.zzo;
                        zzaghVar.zzc(zzerVar2, i);
                    }
                } else if (i5 == 4) {
                    zzer zzerVar4 = this.zza;
                    if (zzf(zzerVar, zzerVar4.zzi(), 6)) {
                        int iZzg = zzaet.zzg(zzerVar4.zzi());
                        this.zzp = iZzg;
                        int i8 = this.zzi;
                        if (i8 > iZzg) {
                            int i9 = i8 - iZzg;
                            this.zzi = i8 - i9;
                            zzerVar.zzh(zzerVar.zzg() - i9);
                        }
                        this.zzh = 5;
                    }
                } else if (i5 != 5) {
                    int iMin = Math.min(zzerVar.zzd(), this.zzm - this.zzi);
                    this.zzg.zzc(zzerVar, iMin);
                    int i10 = this.zzi + iMin;
                    this.zzi = i10;
                    if (i10 == this.zzm) {
                        zzgrc.zzi(this.zzq != -9223372036854775807L);
                        this.zzg.zze(this.zzq, this.zzn == 4 ? 0 : 1, this.zzm, 0, null);
                        this.zzq += this.zzk;
                        this.zzh = 0;
                    }
                } else {
                    zzerVar2 = this.zza;
                    if (zzf(zzerVar, zzerVar2.zzi(), this.zzp)) {
                        zzaes zzaesVarZzf = zzaet.zzf(zzerVar2.zzi(), this.zzb);
                        if (this.zzn == 3) {
                            zzg(zzaesVarZzf);
                        }
                        this.zzm = zzaesVarZzf.zzd;
                        long j2 = zzaesVarZzf.zze;
                        this.zzk = j2 != -9223372036854775807L ? j2 : 0L;
                        zzerVar2.zzh(0);
                        zzaghVar = this.zzg;
                        i = this.zzp;
                        zzaghVar.zzc(zzerVar2, i);
                    }
                }
                this.zzh = 6;
            } else {
                zzer zzerVar5 = this.zza;
                if (zzf(zzerVar, zzerVar5.zzi(), 7)) {
                    this.zzo = zzaet.zze(zzerVar5.zzi());
                    this.zzh = 3;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zze(boolean z) {
    }
}
