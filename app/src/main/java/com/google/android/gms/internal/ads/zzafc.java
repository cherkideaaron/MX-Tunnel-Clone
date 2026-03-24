package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* loaded from: classes.dex */
public final class zzafc {
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean zza(com.google.android.gms.internal.ads.zzer r24, com.google.android.gms.internal.ads.zzafh r25, int r26, com.google.android.gms.internal.ads.zzafb r27) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafc.zza(com.google.android.gms.internal.ads.zzer, com.google.android.gms.internal.ads.zzafh, int, com.google.android.gms.internal.ads.zzafb):boolean");
    }

    public static long zzb(zzaev zzaevVar, zzafh zzafhVar) throws zzat {
        zzaevVar.zzl();
        zzaevVar.zzk(1);
        byte[] bArr = new byte[1];
        zzaevVar.zzi(bArr, 0, 1);
        int i = bArr[0] & 1;
        boolean z = 1 == i;
        zzaevVar.zzk(2);
        int i2 = 1 != i ? 6 : 7;
        zzer zzerVar = new zzer(i2);
        zzerVar.zzf(zzaey.zzb(zzaevVar, zzerVar.zzi(), 0, i2));
        zzaevVar.zzl();
        zzafb zzafbVar = new zzafb();
        if (zzd(zzerVar, zzafhVar, z, zzafbVar)) {
            return zzafbVar.zza;
        }
        throw zzat.zzb(null, null);
    }

    public static int zzc(zzer zzerVar, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return zzerVar.zzs() + 1;
            case 7:
                return zzerVar.zzt() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return UserVerificationMethods.USER_VERIFY_HANDPRINT << (i - 8);
            default:
                return -1;
        }
    }

    private static boolean zzd(zzer zzerVar, zzafh zzafhVar, boolean z, zzafb zzafbVar) {
        try {
            long jZzO = zzerVar.zzO();
            if (!z) {
                jZzO *= zzafhVar.zzb;
            }
            long j = zzafhVar.zzj;
            if (j != 0 && jZzO > j) {
                return false;
            }
            zzafbVar.zza = jZzO;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
