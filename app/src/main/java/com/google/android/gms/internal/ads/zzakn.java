package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* loaded from: classes.dex */
final class zzakn {
    public final zzagh zza;
    public zzalf zzd;
    public zzaki zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private final zzv zzj;
    private boolean zzm;
    public final zzale zzb = new zzale();
    public final zzer zzc = new zzer();
    private final zzer zzk = new zzer(1);
    private final zzer zzl = new zzer();

    public zzakn(zzagh zzaghVar, zzalf zzalfVar, zzaki zzakiVar, zzv zzvVar) {
        this.zza = zzaghVar;
        this.zzd = zzalfVar;
        this.zze = zzakiVar;
        this.zzj = zzvVar;
        zza(zzalfVar, zzakiVar);
    }

    public final void zza(zzalf zzalfVar, zzaki zzakiVar) {
        this.zzd = zzalfVar;
        this.zze = zzakiVar;
        this.zza.zzz(this.zzj);
        zzc();
    }

    public final void zzb(zzq zzqVar) {
        zzalc zzalcVar = this.zzd.zza;
        zzaki zzakiVar = this.zzb.zza;
        String str = zzfj.zza;
        zzald zzaldVarZza = zzalcVar.zza(zzakiVar.zza);
        zzq zzqVarZzb = zzqVar.zzb(zzaldVarZza != null ? zzaldVarZza.zzb : null);
        zzt zztVarZza = this.zzj.zza();
        zztVarZza.zzq(zzqVarZzb);
        this.zza.zzz(zztVarZza.zzM());
    }

    public final void zzc() {
        zzale zzaleVar = this.zzb;
        zzaleVar.zzd = 0;
        zzaleVar.zzp = 0L;
        zzaleVar.zzq = false;
        zzaleVar.zzk = false;
        zzaleVar.zzo = false;
        zzaleVar.zzm = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzm = false;
    }

    public final long zzd() {
        if (!this.zzm) {
            return this.zzd.zzf[this.zzf];
        }
        zzale zzaleVar = this.zzb;
        return zzaleVar.zzi[this.zzf];
    }

    public final long zze() {
        return !this.zzm ? this.zzd.zzc[this.zzf] : this.zzb.zzf[this.zzh];
    }

    public final int zzf() {
        return !this.zzm ? this.zzd.zzd[this.zzf] : this.zzb.zzh[this.zzf];
    }

    public final int zzg() {
        int i = !this.zzm ? this.zzd.zzg[this.zzf] : this.zzb.zzj[this.zzf] ? 1 : 0;
        return zzj() != null ? i | 1073741824 : i;
    }

    public final boolean zzh() {
        this.zzf++;
        if (!this.zzm) {
            return false;
        }
        int i = this.zzg + 1;
        this.zzg = i;
        int[] iArr = this.zzb.zzg;
        int i2 = this.zzh;
        if (i != iArr[i2]) {
            return true;
        }
        this.zzh = i2 + 1;
        this.zzg = 0;
        return false;
    }

    public final int zzi(int i, int i2) {
        zzer zzerVar;
        zzald zzaldVarZzj = zzj();
        if (zzaldVarZzj == null) {
            return 0;
        }
        int i3 = zzaldVarZzj.zzd;
        if (i3 != 0) {
            zzerVar = this.zzb.zzn;
        } else {
            byte[] bArr = zzaldVarZzj.zze;
            String str = zzfj.zza;
            zzer zzerVar2 = this.zzl;
            int length = bArr.length;
            zzerVar2.zzb(bArr, length);
            zzerVar = zzerVar2;
            i3 = length;
        }
        zzale zzaleVar = this.zzb;
        boolean zZzb = zzaleVar.zzb(this.zzf);
        boolean z = zZzb || i2 != 0;
        zzer zzerVar3 = this.zzk;
        zzerVar3.zzi()[0] = (byte) ((true != z ? 0 : UserVerificationMethods.USER_VERIFY_PATTERN) | i3);
        zzerVar3.zzh(0);
        zzagh zzaghVar = this.zza;
        zzaghVar.zzd(zzerVar3, 1, 1);
        zzaghVar.zzd(zzerVar, i3, 1);
        if (!z) {
            return i3 + 1;
        }
        if (!zZzb) {
            zzer zzerVar4 = this.zzc;
            zzerVar4.zza(8);
            byte[] bArrZzi = zzerVar4.zzi();
            bArrZzi[0] = 0;
            bArrZzi[1] = 1;
            bArrZzi[2] = 0;
            bArrZzi[3] = (byte) i2;
            bArrZzi[4] = (byte) ((i >> 24) & 255);
            bArrZzi[5] = (byte) ((i >> 16) & 255);
            bArrZzi[6] = (byte) ((i >> 8) & 255);
            bArrZzi[7] = (byte) (i & 255);
            zzaghVar.zzd(zzerVar4, 8, 1);
            return i3 + 9;
        }
        int i4 = i3 + 1;
        zzer zzerVar5 = zzaleVar.zzn;
        int iZzt = zzerVar5.zzt();
        zzerVar5.zzk(-2);
        int i5 = (iZzt * 6) + 2;
        if (i2 != 0) {
            zzer zzerVar6 = this.zzc;
            zzerVar6.zza(i5);
            byte[] bArrZzi2 = zzerVar6.zzi();
            zzerVar5.zzm(bArrZzi2, 0, i5);
            int i6 = (((bArrZzi2[2] & 255) << 8) | (bArrZzi2[3] & 255)) + i2;
            bArrZzi2[2] = (byte) ((i6 >> 8) & 255);
            bArrZzi2[3] = (byte) (i6 & 255);
            zzerVar5 = zzerVar6;
        }
        zzaghVar.zzd(zzerVar5, i5, 1);
        return i4 + i5;
    }

    public final zzald zzj() {
        if (!this.zzm) {
            return null;
        }
        zzale zzaleVar = this.zzb;
        zzaki zzakiVar = zzaleVar.zza;
        String str = zzfj.zza;
        int i = zzakiVar.zza;
        zzald zzaldVarZza = zzaleVar.zzm;
        if (zzaldVarZza == null) {
            zzaldVarZza = this.zzd.zza.zza(i);
        }
        if (zzaldVarZza == null || !zzaldVarZza.zza) {
            return null;
        }
        return zzaldVarZza;
    }

    public final /* synthetic */ boolean zzk() {
        return this.zzm;
    }

    public final /* synthetic */ void zzl(boolean z) {
        this.zzm = true;
    }
}
