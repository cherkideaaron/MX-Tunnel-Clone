package com.google.android.gms.internal.ads;

import defpackage.Vs;

/* loaded from: classes.dex */
public final class zzapg implements zzaqc {
    private final zzaon zza;
    private final zzeq zzb = new zzeq(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzfg zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzapg(zzaon zzaonVar) {
        this.zza = zzaonVar;
    }

    private final void zze(int i) {
        this.zzc = i;
        this.zzd = 0;
    }

    private final boolean zzf(zzer zzerVar, byte[] bArr, int i) {
        int iMin = Math.min(zzerVar.zzd(), i - this.zzd);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            zzerVar.zzk(iMin);
        } else {
            zzerVar.zzm(bArr, this.zzd, iMin);
        }
        int i2 = this.zzd + iMin;
        this.zzd = i2;
        return i2 == i;
    }

    @Override // com.google.android.gms.internal.ads.zzaqc
    public final void zza(zzfg zzfgVar, zzaex zzaexVar, zzaqb zzaqbVar) {
        this.zze = zzfgVar;
        this.zza.zzb(zzaexVar, zzaqbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaqc
    public final void zzb() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zza();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [com.google.android.gms.internal.ads.zzeq] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r9v7, types: [com.google.android.gms.internal.ads.zzaon] */
    @Override // com.google.android.gms.internal.ads.zzaqc
    public final void zzc(zzer zzerVar, int i) {
        int i2;
        int i3;
        boolean z;
        zzer zzerVar2;
        int i4;
        int i5;
        int i6;
        long jZze;
        char c;
        zzer zzerVar3 = zzerVar;
        this.zze.getClass();
        int i7 = -1;
        int i8 = 2;
        ?? r6 = 0;
        if ((i & 1) != 0) {
            int i9 = this.zzc;
            if (i9 != 0 && i9 != 1) {
                if (i9 != 2) {
                    int i10 = this.zzj;
                    if (i10 != -1) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 48);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i10);
                        sb.append(" more bytes");
                        zzee.zzc("PesReader", sb.toString());
                    }
                    this.zza.zze(zzerVar.zze() == 0);
                } else {
                    zzee.zzc("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zze(1);
        }
        int i11 = i;
        while (zzerVar.zzd() > 0) {
            int i12 = this.zzc;
            if (i12 == 0) {
                i2 = i11;
                i3 = i8;
                z = r6;
                zzerVar2 = zzerVar3;
                i4 = i7;
                zzerVar2.zzk(zzerVar.zzd());
            } else if (i12 == 1) {
                i2 = i11;
                zzeq zzeqVar = this.zzb;
                zzerVar2 = zzerVar;
                if (zzf(zzerVar2, zzeqVar.zza, 9)) {
                    z = false;
                    zzeqVar.zzf(0);
                    int iZzj = zzeqVar.zzj(24);
                    if (iZzj != 1) {
                        Vs.w(new StringBuilder(String.valueOf(iZzj).length() + 30), "Unexpected start code prefix: ", iZzj, "PesReader");
                        i4 = -1;
                        this.zzj = -1;
                        i5 = 0;
                        i3 = 2;
                    } else {
                        zzeqVar.zzh(8);
                        int iZzj2 = zzeqVar.zzj(16);
                        zzeqVar.zzh(5);
                        this.zzk = zzeqVar.zzi();
                        i3 = 2;
                        zzeqVar.zzh(2);
                        this.zzf = zzeqVar.zzi();
                        this.zzg = zzeqVar.zzi();
                        zzeqVar.zzh(6);
                        int iZzj3 = zzeqVar.zzj(8);
                        this.zzi = iZzj3;
                        if (iZzj2 == 0) {
                            this.zzj = -1;
                            i4 = -1;
                        } else {
                            int i13 = (iZzj2 - 3) - iZzj3;
                            this.zzj = i13;
                            if (i13 < 0) {
                                Vs.w(new StringBuilder(String.valueOf(i13).length() + 36), "Found negative packet payload size: ", i13, "PesReader");
                                i4 = -1;
                                this.zzj = -1;
                            } else {
                                i4 = -1;
                            }
                        }
                        i5 = 2;
                    }
                    zze(i5);
                } else {
                    i4 = -1;
                    z = false;
                    i3 = 2;
                }
            } else if (i12 != i8) {
                int iZzd = zzerVar.zzd();
                int i14 = this.zzj;
                int i15 = i14 == i7 ? r6 : iZzd - i14;
                if (i15 > 0) {
                    iZzd -= i15;
                    zzerVar3.zzf(zzerVar.zzg() + iZzd);
                }
                ?? r9 = this.zza;
                r9.zzd(zzerVar3);
                int i16 = this.zzj;
                if (i16 != i7) {
                    int i17 = i16 - iZzd;
                    this.zzj = i17;
                    if (i17 == 0) {
                        r9.zze(r6);
                        zze(1);
                    }
                }
                i2 = i11;
                i3 = i8;
                z = r6;
                zzerVar2 = zzerVar3;
                i4 = i7;
            } else {
                int iMin = Math.min(10, this.zzi);
                ?? r10 = this.zzb;
                if (zzf(zzerVar3, r10.zza, iMin) && zzf(zzerVar3, null, this.zzi)) {
                    r10.zzf(r6);
                    if (this.zzf) {
                        r10.zzh(4);
                        long jZzj = r10.zzj(3);
                        r10.zzh(1);
                        int iZzj4 = r10.zzj(15) << 15;
                        r10.zzh(1);
                        long jZzj2 = r10.zzj(15);
                        r10.zzh(1);
                        if (this.zzh || !this.zzg) {
                            i6 = i11;
                            c = 30;
                        } else {
                            r10.zzh(4);
                            r10.zzh(1);
                            int iZzj5 = r10.zzj(15) << 15;
                            r10.zzh(1);
                            i6 = i11;
                            long jZzj3 = r10.zzj(15);
                            r10.zzh(1);
                            this.zze.zze(jZzj3 | iZzj5 | (r10.zzj(3) << 30));
                            this.zzh = true;
                            c = 30;
                        }
                        jZze = this.zze.zze((jZzj << c) | iZzj4 | jZzj2);
                    } else {
                        i6 = i11;
                        jZze = -9223372036854775807L;
                    }
                    int i18 = i6 | (true != this.zzk ? 0 : 4);
                    this.zza.zzc(jZze, i18);
                    zze(3);
                    zzerVar3 = zzerVar;
                    i11 = i18;
                    i7 = -1;
                    i8 = 2;
                    r6 = 0;
                } else {
                    i2 = i11;
                    i4 = i7;
                    i3 = i8;
                    z = r6;
                    zzerVar2 = zzerVar;
                }
            }
            i7 = i4;
            r6 = z;
            zzerVar3 = zzerVar2;
            i8 = i3;
            i11 = i2;
        }
    }

    public final boolean zzd(boolean z) {
        return this.zzc == 3 && this.zzj == -1;
    }
}
