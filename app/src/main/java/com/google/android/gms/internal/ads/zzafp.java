package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class zzafp {
    private final zzer zza = new zzer(10);

    private final boolean zzb(zzaev zzaevVar, int i) {
        int i2;
        int i3 = 0;
        do {
            int i4 = i3 % 10;
            if (i4 == 0) {
                if (i3 != 0) {
                    zzer zzerVar = this.zza;
                    System.arraycopy(zzerVar.zzi(), 10, zzerVar.zzi(), 0, 9);
                }
                i2 = 0;
            } else {
                i2 = i4;
            }
            int i5 = i3 != 0 ? 1 : 10;
            try {
                zzer zzerVar2 = this.zza;
                int i6 = i4 + 10;
                zzaevVar.zzi(zzerVar2.zzi(), i6 - i5, i5);
                zzerVar2.zzh(i2);
                zzerVar2.zzf(i6);
                if (zzerVar2.zzq() == 4801587) {
                    return true;
                }
                if (zzafs.zza(zzerVar2.zzr()) != -1) {
                    return false;
                }
                if (i3 == 0) {
                    zzerVar2.zzc(20);
                }
                i3++;
            } catch (EOFException unused) {
            }
        } while (i3 <= i);
        return false;
    }

    public final zzap zza(zzaev zzaevVar, zzaij zzaijVar, int i) {
        zzap zzapVarZza = null;
        int i2 = 0;
        while (zzb(zzaevVar, i)) {
            zzer zzerVar = this.zza;
            int iZzg = zzerVar.zzg();
            zzerVar.zzk(6);
            int iZzG = zzerVar.zzG();
            int i3 = iZzG + 10;
            if (zzapVarZza == null) {
                byte[] bArr = new byte[i3];
                System.arraycopy(zzerVar.zzi(), iZzg, bArr, 0, 10);
                zzaevVar.zzi(bArr, 10, iZzG);
                zzapVarZza = zzaim.zza(bArr, i3, zzaijVar, new zzahw());
            } else {
                zzaevVar.zzk(iZzG);
            }
            i2 += i3;
        }
        zzaevVar.zzl();
        zzaevVar.zzk(i2);
        return zzapVarZza;
    }
}
