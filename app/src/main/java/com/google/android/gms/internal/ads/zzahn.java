package com.google.android.gms.internal.ads;

import defpackage.AbstractC3264qG;

/* loaded from: classes.dex */
final class zzahn extends zzahm {
    private final zzer zzb;
    private final zzer zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzahn(zzagh zzaghVar) {
        super(zzaghVar);
        this.zzb = new zzer(zzgm.zza);
        this.zzc = new zzer(4);
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    public final boolean zza(zzer zzerVar) throws zzahl {
        int iZzs = zzerVar.zzs();
        int i = iZzs >> 4;
        int i2 = iZzs & 15;
        if (i2 != 7) {
            throw new zzahl(AbstractC3264qG.k(new StringBuilder(String.valueOf(i2).length() + 28), "Video format not supported: ", i2));
        }
        this.zzg = i;
        return i != 5;
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    public final boolean zzb(zzer zzerVar, long j) throws zzat {
        int i;
        int iZzs = zzerVar.zzs();
        long jZzy = zzerVar.zzy();
        if (iZzs == 0) {
            if (!this.zze) {
                zzer zzerVar2 = new zzer(new byte[zzerVar.zzd()]);
                zzerVar.zzm(zzerVar2.zzi(), 0, zzerVar.zzd());
                zzadz zzadzVarZza = zzadz.zza(zzerVar2);
                this.zzd = zzadzVarZza.zzb;
                zzt zztVar = new zzt();
                zztVar.zzl("video/x-flv");
                zztVar.zzm("video/avc");
                zztVar.zzj(zzadzVarZza.zzl);
                zztVar.zzt(zzadzVarZza.zzc);
                zztVar.zzu(zzadzVarZza.zzd);
                zztVar.zzz(zzadzVarZza.zzk);
                zztVar.zzp(zzadzVarZza.zza);
                this.zza.zzz(zztVar.zzM());
                this.zze = true;
                return false;
            }
        } else if (iZzs == 1 && this.zze) {
            int i2 = this.zzg == 1 ? 1 : 0;
            if (this.zzf) {
                i = i2;
            } else if (i2 != 0) {
                i = 1;
            }
            zzer zzerVar3 = this.zzc;
            byte[] bArrZzi = zzerVar3.zzi();
            bArrZzi[0] = 0;
            bArrZzi[1] = 0;
            bArrZzi[2] = 0;
            int i3 = 4 - this.zzd;
            int i4 = 0;
            while (zzerVar.zzd() > 0) {
                zzerVar.zzm(zzerVar3.zzi(), i3, this.zzd);
                zzerVar3.zzh(0);
                zzer zzerVar4 = this.zzb;
                int iZzH = zzerVar3.zzH();
                zzerVar4.zzh(0);
                zzagh zzaghVar = this.zza;
                zzaghVar.zzc(zzerVar4, 4);
                zzaghVar.zzc(zzerVar, iZzH);
                i4 = i4 + 4 + iZzH;
            }
            this.zza.zze((jZzy * 1000) + j, i, i4, 0, null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}
