package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
final class zzaji {
    private final zzer zza = new zzer(8);
    private int zzb;

    private final long zzb(zzaev zzaevVar) {
        int i;
        zzer zzerVar = this.zza;
        zzael zzaelVar = (zzael) zzaevVar;
        int i2 = 0;
        zzaelVar.zzh(zzerVar.zzi(), 0, 1, false);
        int i3 = zzerVar.zzi()[0] & 255;
        if (i3 == 0) {
            return Long.MIN_VALUE;
        }
        int i4 = UserVerificationMethods.USER_VERIFY_PATTERN;
        int i5 = 0;
        while (true) {
            i = i5 + 1;
            if ((i3 & i4) != 0) {
                break;
            }
            i4 >>= 1;
            i5 = i;
        }
        int i6 = i3 & (~i4);
        zzaelVar.zzh(zzerVar.zzi(), 1, i5, false);
        while (i2 < i5) {
            i2++;
            i6 = (zzerVar.zzi()[i2] & 255) + (i6 << 8);
        }
        this.zzb += i;
        return i6;
    }

    public final boolean zza(zzaev zzaevVar) throws EOFException, InterruptedIOException {
        long jZzo = zzaevVar.zzo();
        long j = 1024;
        if (jZzo != -1 && jZzo <= 1024) {
            j = jZzo;
        }
        zzer zzerVar = this.zza;
        zzael zzaelVar = (zzael) zzaevVar;
        zzaelVar.zzh(zzerVar.zzi(), 0, 4, false);
        this.zzb = 4;
        for (long jZzz = zzerVar.zzz(); jZzz != 440786851; jZzz = ((jZzz << 8) & (-256)) | (zzerVar.zzi()[0] & 255)) {
            int i = (int) j;
            int i2 = this.zzb + 1;
            this.zzb = i2;
            if (i2 == i) {
                return false;
            }
            zzaelVar.zzh(zzerVar.zzi(), 0, 1, false);
        }
        long jZzb = zzb(zzaevVar);
        long j2 = this.zzb;
        if (jZzb != Long.MIN_VALUE) {
            long j3 = j2 + jZzb;
            if (jZzo == -1 || j3 < jZzo) {
                while (true) {
                    long j4 = this.zzb;
                    if (j4 < j3) {
                        if (zzb(zzaevVar) == Long.MIN_VALUE) {
                            return false;
                        }
                        long jZzb2 = zzb(zzaevVar);
                        if (jZzb2 < 0) {
                            return false;
                        }
                        if (jZzb2 != 0) {
                            int i3 = (int) jZzb2;
                            zzaelVar.zzj(i3, false);
                            this.zzb += i3;
                        }
                    } else if (j4 == j3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
