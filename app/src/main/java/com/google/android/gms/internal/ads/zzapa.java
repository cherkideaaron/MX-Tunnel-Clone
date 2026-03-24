package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzapa implements zzaon {
    private String zzf;
    private zzagh zzg;
    private boolean zzj;
    private int zzl;
    private int zzm;
    private int zzo;
    private int zzp;
    private int zzt;
    private boolean zzv;
    private final String zza = "video/mp2t";
    private int zze = 0;
    private final zzer zzb = new zzer(new byte[15], 2);
    private final zzeq zzc = new zzeq();
    private final zzer zzd = new zzer();
    private final zzapb zzq = new zzapb();
    private int zzr = -2147483647;
    private int zzs = -1;
    private long zzu = -1;
    private boolean zzk = true;
    private boolean zzn = true;
    private double zzh = -9.223372036854776E18d;
    private double zzi = -9.223372036854776E18d;

    public zzapa(String str) {
    }

    private static final void zzf(zzer zzerVar, zzer zzerVar2, boolean z) {
        int iZzg = zzerVar.zzg();
        int iMin = Math.min(zzerVar.zzd(), zzerVar2.zzd());
        zzerVar.zzm(zzerVar2.zzi(), zzerVar2.zzg(), iMin);
        zzerVar2.zzk(iMin);
        if (z) {
            zzerVar.zzh(iZzg);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zza() {
        this.zze = 0;
        this.zzm = 0;
        this.zzb.zza(2);
        this.zzo = 0;
        this.zzp = 0;
        this.zzr = -2147483647;
        this.zzs = -1;
        this.zzt = 0;
        this.zzu = -1L;
        this.zzv = false;
        this.zzj = false;
        this.zzn = true;
        this.zzk = true;
        this.zzh = -9.223372036854776E18d;
        this.zzi = -9.223372036854776E18d;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzb(zzaex zzaexVar, zzaqb zzaqbVar) {
        zzaqbVar.zza();
        this.zzf = zzaqbVar.zzc();
        this.zzg = zzaexVar.zzu(zzaqbVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzc(long j, int i) {
        this.zzl = i;
        if (!this.zzk && (this.zzp != 0 || !this.zzn)) {
            this.zzj = true;
        }
        if (j != -9223372036854775807L) {
            double d = j;
            if (this.zzj) {
                this.zzi = d;
            } else {
                this.zzh = d;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzd(zzer zzerVar) throws zzat {
        int i;
        double d;
        int iZzj;
        this.zzg.getClass();
        while (zzerVar.zzd() > 0) {
            int i2 = this.zze;
            if (i2 == 0) {
                int i3 = this.zzl;
                if ((i3 & 2) != 0) {
                    if ((i3 & 4) == 0) {
                        while (zzerVar.zzd() > 0) {
                            int i4 = this.zzm << 8;
                            this.zzm = i4;
                            int iZzs = i4 | zzerVar.zzs();
                            this.zzm = iZzs;
                            if ((iZzs & 16777215) == 12583333) {
                                zzerVar.zzh(zzerVar.zzg() - 3);
                                this.zzm = 0;
                            }
                        }
                    }
                    this.zze = 1;
                    break;
                    break;
                }
                zzerVar.zzh(zzerVar.zze());
            } else if (i2 != 1) {
                zzapb zzapbVar = this.zzq;
                int i5 = zzapbVar.zza;
                if (i5 == 1 || i5 == 17) {
                    zzf(zzerVar, this.zzd, true);
                }
                int iMin = Math.min(zzerVar.zzd(), zzapbVar.zzc - this.zzo);
                this.zzg.zzc(zzerVar, iMin);
                int i6 = this.zzo + iMin;
                this.zzo = i6;
                if (i6 == zzapbVar.zzc) {
                    int i7 = zzapbVar.zza;
                    if (i7 == 1) {
                        byte[] bArrZzi = this.zzd.zzi();
                        zzapc zzapcVarZzb = zzapd.zzb(new zzeq(bArrZzi, bArrZzi.length));
                        this.zzr = zzapcVarZzb.zzb;
                        this.zzs = zzapcVarZzb.zzc;
                        long j = this.zzu;
                        long j2 = zzapbVar.zzb;
                        if (j != j2) {
                            this.zzu = j2;
                            int i8 = zzapcVarZzb.zza;
                            String strConcat = i8 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(i8))) : "mhm1";
                            byte[] bArr = zzapcVarZzb.zzd;
                            zzguf zzgufVarZzk = null;
                            if (bArr != null && bArr.length > 0) {
                                zzgufVarZzk = zzguf.zzk(zzfj.zzb, bArr);
                            }
                            zzt zztVar = new zzt();
                            zztVar.zza(this.zzf);
                            zztVar.zzl(this.zza);
                            zztVar.zzm("audio/mhm1");
                            zztVar.zzF(this.zzr);
                            zztVar.zzj(strConcat);
                            zztVar.zzp(zzgufVarZzk);
                            this.zzg.zzz(zztVar.zzM());
                        }
                        this.zzv = true;
                    } else if (i7 == 17) {
                        byte[] bArrZzi2 = this.zzd.zzi();
                        zzeq zzeqVar = new zzeq(bArrZzi2, bArrZzi2.length);
                        if (zzeqVar.zzi()) {
                            zzeqVar.zzh(2);
                            iZzj = zzeqVar.zzj(13);
                        } else {
                            iZzj = 0;
                        }
                        this.zzt = iZzj;
                    } else if (i7 == 2) {
                        if (this.zzv) {
                            this.zzk = false;
                            i = 1;
                        } else {
                            i = 0;
                        }
                        int i9 = this.zzs - this.zzt;
                        double d2 = this.zzr;
                        long jRound = Math.round(this.zzh);
                        if (this.zzj) {
                            this.zzj = false;
                            d = this.zzi;
                        } else {
                            d = this.zzh + ((i9 * 1000000.0d) / d2);
                        }
                        this.zzh = d;
                        this.zzg.zze(jRound, i, this.zzp, 0, null);
                        this.zzv = false;
                        this.zzt = 0;
                        this.zzp = 0;
                    }
                    this.zze = 1;
                    break;
                }
            } else {
                zzer zzerVar2 = this.zzb;
                zzf(zzerVar, zzerVar2, false);
                if (zzerVar2.zzd() == 0) {
                    zzeq zzeqVar2 = this.zzc;
                    int iZze = zzerVar2.zze();
                    zzeqVar2.zzb(zzerVar2.zzi(), iZze);
                    zzapb zzapbVar2 = this.zzq;
                    if (zzapd.zza(zzeqVar2, zzapbVar2)) {
                        this.zzo = 0;
                        this.zzp = zzapbVar2.zzc + iZze + this.zzp;
                        zzerVar2.zzh(0);
                        this.zzg.zzc(zzerVar2, zzerVar2.zze());
                        zzerVar2.zza(2);
                        this.zzd.zza(zzapbVar2.zzc);
                        this.zzn = true;
                        this.zze = 2;
                    } else if (zzerVar2.zze() < 15) {
                        zzerVar2.zzf(zzerVar2.zze() + 1);
                    }
                }
                this.zzn = false;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zze(boolean z) {
    }
}
