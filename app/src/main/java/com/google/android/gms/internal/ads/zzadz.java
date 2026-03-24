package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzadz {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final float zzk;
    public final String zzl;

    private zzadz(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.zza = list;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = i5;
        this.zzg = i6;
        this.zzh = i7;
        this.zzi = i8;
        this.zzj = i9;
        this.zzk = f;
        this.zzl = str;
    }

    public static zzadz zza(zzer zzerVar) throws zzat {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        String strZza;
        float f;
        try {
            zzerVar.zzk(4);
            int iZzs = (zzerVar.zzs() & 3) + 1;
            if (iZzs == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iZzs2 = zzerVar.zzs() & 31;
            for (int i9 = 0; i9 < iZzs2; i9++) {
                arrayList.add(zzb(zzerVar));
            }
            int iZzs3 = zzerVar.zzs();
            for (int i10 = 0; i10 < iZzs3; i10++) {
                arrayList.add(zzb(zzerVar));
            }
            if (iZzs2 > 0) {
                zzgl zzglVarZze = zzgm.zze((byte[]) arrayList.get(0), 5, ((byte[]) arrayList.get(0)).length);
                int i11 = zzglVarZze.zze;
                int i12 = zzglVarZze.zzf;
                int i13 = zzglVarZze.zzh + 8;
                int i14 = zzglVarZze.zzi + 8;
                int i15 = zzglVarZze.zzj;
                int i16 = zzglVarZze.zzk;
                int i17 = zzglVarZze.zzl;
                int i18 = zzglVarZze.zzm;
                float f2 = zzglVarZze.zzg;
                strZza = zzdo.zza(zzglVarZze.zza, zzglVarZze.zzb, zzglVarZze.zzc);
                i7 = i17;
                i8 = i18;
                f = f2;
                i4 = i14;
                i5 = i15;
                i6 = i16;
                i = i11;
                i2 = i12;
                i3 = i13;
            } else {
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = -1;
                i7 = -1;
                i8 = 16;
                strZza = null;
                f = 1.0f;
            }
            return new zzadz(arrayList, iZzs, i, i2, i3, i4, i5, i6, i7, i8, f, strZza);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzat.zzb("Error parsing AVC config", e);
        }
    }

    private static byte[] zzb(zzer zzerVar) {
        int iZzt = zzerVar.zzt();
        int iZzg = zzerVar.zzg();
        zzerVar.zzk(iZzt);
        return zzdo.zzf(zzerVar.zzi(), iZzg, iZzt);
    }
}
