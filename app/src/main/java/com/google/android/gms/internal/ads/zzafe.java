package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzafe {
    public static zzap zza(zzaev zzaevVar, boolean z) {
        zzap zzapVarZza = new zzafp().zza(zzaevVar, z ? null : zzaim.zza, 0);
        if (zzapVarZza == null || zzapVarZza.zza() == 0) {
            return null;
        }
        return zzapVarZza;
    }

    public static boolean zzb(zzaev zzaevVar, zzafd zzafdVar) {
        zzafh zzafhVar;
        zzafh zzafhVarZze;
        zzaevVar.zzl();
        zzeq zzeqVar = new zzeq(new byte[4], 4);
        zzaevVar.zzi(zzeqVar.zza, 0, 4);
        boolean zZzi = zzeqVar.zzi();
        int iZzj = zzeqVar.zzj(7);
        int iZzj2 = zzeqVar.zzj(24) + 4;
        if (iZzj == 0) {
            byte[] bArr = new byte[38];
            zzaevVar.zzc(bArr, 0, 38);
            zzafhVarZze = new zzafh(bArr, 4);
        } else {
            zzafh zzafhVar2 = zzafdVar.zza;
            if (zzafhVar2 == null) {
                throw new IllegalArgumentException();
            }
            if (iZzj != 3) {
                if (iZzj == 4) {
                    zzer zzerVar = new zzer(iZzj2);
                    zzaevVar.zzc(zzerVar.zzi(), 0, iZzj2);
                    zzerVar.zzk(4);
                    zzafhVar = new zzafh(zzafhVar2.zza, zzafhVar2.zzb, zzafhVar2.zzc, zzafhVar2.zzd, zzafhVar2.zze, zzafhVar2.zzg, zzafhVar2.zzh, zzafhVar2.zzj, zzafhVar2.zzk, zzafhVar2.zzd(zzagn.zzc(Arrays.asList(zzagn.zzb(zzerVar, false, false).zza))));
                } else {
                    if (iZzj != 6) {
                        zzaevVar.zzf(iZzj2);
                        return zZzi;
                    }
                    zzer zzerVar2 = new zzer(iZzj2);
                    zzaevVar.zzc(zzerVar2.zzi(), 0, iZzj2);
                    zzerVar2.zzk(4);
                    zzafhVar = new zzafh(zzafhVar2.zza, zzafhVar2.zzb, zzafhVar2.zzc, zzafhVar2.zzd, zzafhVar2.zze, zzafhVar2.zzg, zzafhVar2.zzh, zzafhVar2.zzj, zzafhVar2.zzk, zzafhVar2.zzd(new zzap(zzguf.zzj(zzaia.zzb(zzerVar2)))));
                }
                zzafdVar.zza = zzafhVar;
                return zZzi;
            }
            zzer zzerVar3 = new zzer(iZzj2);
            zzaevVar.zzc(zzerVar3.zzi(), 0, iZzj2);
            zzafhVarZze = zzafhVar2.zze(zzc(zzerVar3));
        }
        zzafdVar.zza = zzafhVarZze;
        return zZzi;
    }

    public static zzafg zzc(zzer zzerVar) {
        zzerVar.zzk(1);
        int iZzx = zzerVar.zzx();
        long jZzg = zzerVar.zzg();
        long j = iZzx;
        int i = iZzx / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long jZzD = zzerVar.zzD();
            if (jZzD == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jZzD;
            jArrCopyOf2[i2] = zzerVar.zzD();
            zzerVar.zzk(2);
            i2++;
        }
        zzerVar.zzk((int) ((jZzg + j) - zzerVar.zzg()));
        return new zzafg(jArrCopyOf, jArrCopyOf2);
    }
}
