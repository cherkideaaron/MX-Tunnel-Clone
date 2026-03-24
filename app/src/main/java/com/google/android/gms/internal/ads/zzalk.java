package com.google.android.gms.internal.ads;

import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: classes.dex */
final class zzalk extends zzalt {
    private zzafh zza;
    private zzalj zzb;

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    public final void zza(boolean z) {
        super.zza(z);
        if (z) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    public final long zzb(zzer zzerVar) {
        if (!zzd(zzerVar.zzi())) {
            return -1L;
        }
        int i = (zzerVar.zzi()[2] & 255) >> 4;
        if (i == 6) {
            zzerVar.zzk(4);
            zzerVar.zzO();
        } else if (i == 7) {
            i = 7;
            zzerVar.zzk(4);
            zzerVar.zzO();
        }
        int iZzc = zzafc.zzc(zzerVar, i);
        zzerVar.zzh(0);
        return iZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean zzc(zzer zzerVar, long j, zzalr zzalrVar) {
        byte[] bArrZzi = zzerVar.zzi();
        zzafh zzafhVar = this.zza;
        if (zzafhVar == null) {
            zzafh zzafhVar2 = new zzafh(bArrZzi, 17);
            this.zza = zzafhVar2;
            zzt zztVarZza = zzafhVar2.zzc(Arrays.copyOfRange(bArrZzi, 9, zzerVar.zze()), null).zza();
            zztVarZza.zzl("audio/ogg");
            zzalrVar.zza = zztVarZza.zzM();
            return true;
        }
        if ((bArrZzi[0] & 127) == 3) {
            zzafg zzafgVarZzc = zzafe.zzc(zzerVar);
            zzafh zzafhVarZze = zzafhVar.zze(zzafgVarZzc);
            this.zza = zzafhVarZze;
            this.zzb = new zzalj(zzafhVarZze, zzafgVarZzc);
            return true;
        }
        if (!zzd(bArrZzi)) {
            return true;
        }
        zzalj zzaljVar = this.zzb;
        if (zzaljVar != null) {
            zzaljVar.zzd(j);
            zzalrVar.zzb = this.zzb;
        }
        zzalrVar.zza.getClass();
        return false;
    }
}
