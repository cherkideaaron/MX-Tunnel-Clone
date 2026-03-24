package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zzaag extends zzaaj {
    public abstract Pair zzh(zzaaf zzaafVar, int[][][] iArr, int[] iArr2, zzwk zzwkVar, zzbf zzbfVar);

    @Override // com.google.android.gms.internal.ads.zzaaj
    public final void zzp(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzaaj
    public final zzaak zzq(zzmn[] zzmnVarArr, zzyn zzynVar, zzwk zzwkVar, zzbf zzbfVar) {
        List[] listArr;
        boolean z;
        int[] iArr;
        int[] iArr2 = new int[3];
        zzbg[][] zzbgVarArr = new zzbg[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i2 = zzynVar.zzb;
            zzbgVarArr[i] = new zzbg[i2];
            iArr3[i] = new int[i2][];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            iArr4[i4] = zzmnVarArr[i4].zzu();
        }
        int i5 = 0;
        while (i5 < zzynVar.zzb) {
            zzbg zzbgVarZza = zzynVar.zza(i5);
            int i6 = zzbgVarZza.zzc;
            int i7 = i3;
            int i8 = 0;
            int i9 = 0;
            boolean z2 = true;
            while (i8 < i3) {
                zzmn zzmnVar = zzmnVarArr[i8];
                int iMax = 0;
                for (int i10 = 0; i10 < zzbgVarZza.zza; i10++) {
                    iMax = Math.max(iMax, zzmnVar.zzab(zzbgVarZza.zza(i10)) & 7);
                }
                boolean z3 = iArr2[i8] == 0;
                if (iMax > i9) {
                    z2 = z3;
                    i7 = i8;
                    i9 = iMax;
                } else if (iMax == i9 && i6 == 5 && !z2 && z3) {
                    i7 = i8;
                    i9 = iMax;
                    z2 = true;
                }
                i8++;
                i3 = 2;
            }
            if (i7 == i3) {
                iArr = new int[zzbgVarZza.zza];
            } else {
                zzmn zzmnVar2 = zzmnVarArr[i7];
                int i11 = zzbgVarZza.zza;
                int[] iArr5 = new int[i11];
                for (int i12 = 0; i12 < i11; i12++) {
                    iArr5[i12] = zzmnVar2.zzab(zzbgVarZza.zza(i12));
                }
                iArr = iArr5;
            }
            int i13 = iArr2[i7];
            zzbgVarArr[i7][i13] = zzbgVarZza;
            iArr3[i7][i13] = iArr;
            iArr2[i7] = i13 + 1;
            i5++;
            i3 = 2;
        }
        int i14 = i3;
        boolean z4 = true;
        zzyn[] zzynVarArr = new zzyn[i14];
        String[] strArr = new String[i14];
        int[] iArr6 = new int[i14];
        int i15 = 0;
        while (i15 < i14) {
            int i16 = iArr2[i15];
            zzynVarArr[i15] = new zzyn((zzbg[]) zzfj.zzb(zzbgVarArr[i15], i16));
            iArr3[i15] = (int[][]) zzfj.zzb(iArr3[i15], i16);
            strArr[i15] = zzmnVarArr[i15].zzS();
            iArr6[i15] = zzmnVarArr[i15].zza();
            i15++;
            i14 = 2;
        }
        int i17 = i14;
        zzaaf zzaafVar = new zzaaf(strArr, iArr6, zzynVarArr, iArr4, iArr3, new zzyn((zzbg[]) zzfj.zzb(zzbgVarArr[i17], iArr2[i17])));
        Pair pairZzh = zzh(zzaafVar, iArr3, iArr4, zzwkVar, zzbfVar);
        zzaah[] zzaahVarArr = (zzaah[]) pairZzh.second;
        List[] listArr2 = new List[zzaahVarArr.length];
        for (int i18 = 0; i18 < zzaahVarArr.length; i18++) {
            zzaah zzaahVar = zzaahVarArr[i18];
            listArr2[i18] = zzaahVar != null ? zzguf.zzj(zzaahVar) : zzguf.zzi();
        }
        zzguc zzgucVar = new zzguc();
        int i19 = 0;
        for (int i20 = 2; i19 < i20; i20 = 2) {
            zzyn zzynVarZzb = zzaafVar.zzb(i19);
            List list = listArr2[i19];
            int i21 = 0;
            while (i21 < zzynVarZzb.zzb) {
                zzbg zzbgVarZza2 = zzynVarZzb.zza(i21);
                boolean z5 = zzaafVar.zzd(i19, i21, false) != 0 ? z4 : false;
                int i22 = zzbgVarZza2.zza;
                int[] iArr7 = new int[i22];
                boolean[] zArr = new boolean[i22];
                int i23 = 0;
                while (i23 < i22) {
                    iArr7[i23] = zzaafVar.zzc(i19, i21, i23) & 7;
                    int i24 = 0;
                    while (true) {
                        if (i24 >= list.size()) {
                            listArr = listArr2;
                            z = false;
                            break;
                        }
                        zzaah zzaahVar2 = (zzaah) list.get(i24);
                        listArr = listArr2;
                        if (zzaahVar2.zza().equals(zzbgVarZza2) && zzaahVar2.zzg(i23) != -1) {
                            z = true;
                            break;
                        }
                        i24++;
                        listArr2 = listArr;
                    }
                    zArr[i23] = z;
                    i23++;
                    listArr2 = listArr;
                }
                zzgucVar.zzf(new zzbm(zzbgVarZza2, z5, iArr7, zArr));
                i21++;
                z4 = true;
            }
            i19++;
            z4 = true;
        }
        zzyn zzynVarZze = zzaafVar.zze();
        for (int i25 = 0; i25 < zzynVarZze.zzb; i25++) {
            zzbg zzbgVarZza3 = zzynVarZze.zza(i25);
            int i26 = zzbgVarZza3.zza;
            int[] iArr8 = new int[i26];
            Arrays.fill(iArr8, 0);
            zzgucVar.zzf(new zzbm(zzbgVarZza3, false, iArr8, new boolean[i26]));
        }
        return new zzaak((zzmo[]) pairZzh.first, (zzaac[]) pairZzh.second, new zzbn(zzgucVar.zzi()), zzaafVar);
    }
}
