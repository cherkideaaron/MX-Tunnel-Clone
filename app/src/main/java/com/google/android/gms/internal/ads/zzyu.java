package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class zzyu extends zzyw {
    public zzyu(zzbg zzbgVar, int[] iArr, int i, zzaas zzaasVar, long j, long j2, long j3, int i2, int i3, float f, float f2, List list, zzdn zzdnVar) {
        super(zzbgVar, iArr, 0);
        zzguf.zzq(list);
    }

    public static /* synthetic */ zzguf zzd(zzaab[] zzaabVarArr) {
        int i;
        int[] iArr;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= 2) {
                break;
            }
            zzaab zzaabVar = zzaabVarArr[i3];
            if (zzaabVar == null || zzaabVar.zzb.length <= 1) {
                arrayList.add(null);
            } else {
                int i4 = zzguf.zzd;
                zzguc zzgucVar = new zzguc();
                zzgucVar.zzf(new zzys(0L, 0L));
                arrayList.add(zzgucVar);
            }
            i3++;
        }
        long[][] jArr = new long[2][];
        for (int i5 = 0; i5 < 2; i5++) {
            zzaab zzaabVar2 = zzaabVarArr[i5];
            if (zzaabVar2 == null) {
                jArr[i5] = new long[0];
            } else {
                int[] iArr2 = zzaabVar2.zzb;
                jArr[i5] = new long[iArr2.length];
                for (int i6 = 0; i6 < iArr2.length; i6++) {
                    long j = zzaabVar2.zza.zza(iArr2[i6]).zzj;
                    long[] jArr2 = jArr[i5];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i6] = j;
                }
                Arrays.sort(jArr[i5]);
            }
        }
        int[] iArr3 = new int[2];
        long[] jArr3 = new long[2];
        for (int i7 = 0; i7 < 2; i7++) {
            long[] jArr4 = jArr[i7];
            jArr3[i7] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        zzi(arrayList, jArr3);
        zzgva zzgvaVarZza = zzgvu.zzc(zzgvz.zzb()).zzb(2).zza();
        int i8 = 0;
        for (i = 2; i8 < i; i = 2) {
            int length = jArr[i8].length;
            if (length <= 1) {
                iArr = iArr3;
            } else {
                double[] dArr = new double[length];
                int i9 = i2;
                while (true) {
                    long[] jArr5 = jArr[i8];
                    double dLog = 0.0d;
                    iArr = iArr3;
                    if (i9 >= jArr5.length) {
                        break;
                    }
                    long j2 = jArr5[i9];
                    if (j2 != -1) {
                        dLog = Math.log(j2);
                    }
                    dArr[i9] = dLog;
                    i9++;
                    iArr3 = iArr;
                }
                int i10 = length - 1;
                double d = dArr[i10] - dArr[i2];
                int i11 = i2;
                while (i11 < i10) {
                    double d2 = dArr[i11];
                    i11++;
                    zzgvaVarZza.zze(Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i11]) * 0.5d) - dArr[i2]) / d), Integer.valueOf(i8));
                    i2 = 0;
                }
            }
            i8++;
            iArr3 = iArr;
            i2 = 0;
        }
        int[] iArr4 = iArr3;
        zzguf zzgufVarZzq = zzguf.zzq(zzgvaVarZza.zzt());
        for (int i12 = 0; i12 < zzgufVarZzq.size(); i12++) {
            int iIntValue = ((Integer) zzgufVarZzq.get(i12)).intValue();
            int i13 = iArr4[iIntValue] + 1;
            iArr4[iIntValue] = i13;
            jArr3[iIntValue] = jArr[iIntValue][i13];
            zzi(arrayList, jArr3);
        }
        for (int i14 = 0; i14 < 2; i14++) {
            if (arrayList.get(i14) != null) {
                long j3 = jArr3[i14];
                jArr3[i14] = j3 + j3;
            }
        }
        zzi(arrayList, jArr3);
        zzguc zzgucVar2 = new zzguc();
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            zzguc zzgucVar3 = (zzguc) arrayList.get(i15);
            zzgucVar2.zzf(zzgucVar3 == null ? zzguf.zzi() : zzgucVar3.zzi());
        }
        return zzgucVar2.zzi();
    }

    private static void zzi(List list, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzguc zzgucVar = (zzguc) list.get(i2);
            if (zzgucVar != null) {
                zzgucVar.zzf(new zzys(j, jArr[i2]));
            }
        }
    }
}
