package com.google.android.gms.internal.ads;

import defpackage.VQ;

/* loaded from: classes.dex */
final class zzzq extends zzzs implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;

    public zzzq(int i, zzbg zzbgVar, int i2, zzzl zzzlVar, int i3, String str, String str2) {
        int iZzj;
        super(i, zzbgVar, i2);
        int i4 = 0;
        this.zzf = VQ.c(i3, false);
        int i5 = this.zzd.zze;
        int i6 = zzzlVar.zzC;
        this.zzg = 1 == (i5 & 1);
        this.zzh = (i5 & 2) != 0;
        zzguf zzgufVarZzj = str2 != null ? zzguf.zzj(str2) : zzzlVar.zzy.isEmpty() ? zzguf.zzj("") : zzzlVar.zzy;
        int i7 = 0;
        while (true) {
            if (i7 >= zzgufVarZzj.size()) {
                iZzj = 0;
                i7 = Integer.MAX_VALUE;
                break;
            } else {
                iZzj = zzaaa.zzj(this.zzd, (String) zzgufVarZzj.get(i7), false);
                if (iZzj > 0) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        this.zzi = i7;
        this.zzj = iZzj;
        int iZzm = zzaaa.zzm(this.zzd.zzf, str2 != null ? 1088 : 0);
        this.zzk = iZzm;
        zzv zzvVar = this.zzd;
        this.zzn = (1088 & zzvVar.zzf) != 0;
        int iZzn = zzaaa.zzn(zzvVar, zzzlVar.zzz);
        this.zzl = iZzn;
        int iZzj2 = zzaaa.zzj(this.zzd, str, zzaaa.zzi(str) == null);
        this.zzm = iZzj2;
        boolean z = iZzj > 0 || (zzzlVar.zzy.isEmpty() && iZzm > 0) || ((zzzlVar.zzy.isEmpty() && iZzn != Integer.MAX_VALUE) || this.zzg || (this.zzh && iZzj2 > 0));
        if (VQ.c(i3, zzzlVar.zzV) && z) {
            i4 = 1;
        }
        this.zze = i4;
    }

    @Override // com.google.android.gms.internal.ads.zzzs
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzzq zzzqVar) {
        zzgts zzgtsVarZza = zzgts.zzg().zzd(this.zzf, zzzqVar.zzf).zza(Integer.valueOf(this.zzi), Integer.valueOf(zzzqVar.zzi), zzgvz.zzb().zza());
        int i = this.zzj;
        zzgts zzgtsVarZzb = zzgtsVarZza.zzb(i, zzzqVar.zzj);
        int i2 = this.zzk;
        zzgts zzgtsVarZzb2 = zzgtsVarZzb.zzb(i2, zzzqVar.zzk).zza(Integer.valueOf(this.zzl), Integer.valueOf(zzzqVar.zzl), zzgvz.zzb().zza()).zzd(this.zzg, zzzqVar.zzg).zza(Boolean.valueOf(this.zzh), Boolean.valueOf(zzzqVar.zzh), i == 0 ? zzgvz.zzb() : zzgvz.zzb().zza()).zzb(this.zzm, zzzqVar.zzm);
        if (i2 == 0) {
            zzgtsVarZzb2 = zzgtsVarZzb2.zzc(this.zzn, zzzqVar.zzn);
        }
        return zzgtsVarZzb2.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzzs
    public final /* bridge */ /* synthetic */ boolean zzc(zzzs zzzsVar) {
        return false;
    }
}
