package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zziax implements zzieu {
    private final zziaw zza;

    private zziax(zziaw zziawVar) {
        zzice.zza(zziawVar, "output");
        this.zza = zziawVar;
        zziawVar.zze = this;
    }

    public static zziax zza(zziaw zziawVar) {
        Object obj = zziawVar.zze;
        return obj != null ? (zziax) obj : new zziax(zziawVar);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzA(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzicq)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            zziawVar.zzs(i3);
            while (i2 < list.size()) {
                zziawVar.zzv(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzicq zzicqVar = (zzicq) list;
        if (!z) {
            while (i2 < zzicqVar.size()) {
                this.zza.zzh(i, zzicqVar.zzc(i2));
                i2++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzicqVar.size(); i6++) {
            zzicqVar.zzc(i6);
            i5 += 8;
        }
        zziawVar2.zzs(i5);
        while (i2 < zzicqVar.size()) {
            zziawVar2.zzv(zzicqVar.zzc(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzB(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzibi)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzK(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                i3 += 4;
            }
            zziawVar.zzs(i3);
            while (i2 < list.size()) {
                zziawVar.zzt(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        zzibi zzibiVar = (zzibi) list;
        if (!z) {
            while (i2 < zzibiVar.size()) {
                this.zza.zzK(i, Float.floatToRawIntBits(zzibiVar.zzf(i2)));
                i2++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzibiVar.size(); i6++) {
            zzibiVar.zzf(i6);
            i5 += 4;
        }
        zziawVar2.zzs(i5);
        while (i2 < zzibiVar.size()) {
            zziawVar2.zzt(Float.floatToRawIntBits(zzibiVar.zzf(i2)));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzC(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zziay)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).getClass();
                i3 += 8;
            }
            zziawVar.zzs(i3);
            while (i2 < list.size()) {
                zziawVar.zzv(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        zziay zziayVar = (zziay) list;
        if (!z) {
            while (i2 < zziayVar.size()) {
                this.zza.zzh(i, Double.doubleToRawLongBits(zziayVar.zzf(i2)));
                i2++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zziayVar.size(); i6++) {
            zziayVar.zzf(i6);
            i5 += 8;
        }
        zziawVar2.zzs(i5);
        while (i2 < zziayVar.size()) {
            zziawVar2.zzv(Double.doubleToRawLongBits(zziayVar.zzf(i2)));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzD(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzibs)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzI(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i, 2);
            int iZzB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzB += zziaw.zzB(((Integer) list.get(i3)).intValue());
            }
            zziawVar.zzs(iZzB);
            while (i2 < list.size()) {
                zziawVar.zzr(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzibs zzibsVar = (zzibs) list;
        if (!z) {
            while (i2 < zzibsVar.size()) {
                this.zza.zzI(i, zzibsVar.zzf(i2));
                i2++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i, 2);
        int iZzB2 = 0;
        for (int i4 = 0; i4 < zzibsVar.size(); i4++) {
            iZzB2 += zziaw.zzB(zzibsVar.zzf(i4));
        }
        zziawVar2.zzs(iZzB2);
        while (i2 < zzibsVar.size()) {
            zziawVar2.zzr(zzibsVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzE(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zziad)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzi(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).getClass();
                i3++;
            }
            zziawVar.zzs(i3);
            while (i2 < list.size()) {
                zziawVar.zzq(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        zziad zziadVar = (zziad) list;
        if (!z) {
            while (i2 < zziadVar.size()) {
                this.zza.zzi(i, zziadVar.zzf(i2));
                i2++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zziadVar.size(); i6++) {
            zziadVar.zzf(i6);
            i5++;
        }
        zziawVar2.zzs(i5);
        while (i2 < zziadVar.size()) {
            zziawVar2.zzq(zziadVar.zzf(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzF(int i, List list) {
        int i2 = 0;
        if (!(list instanceof zzicn)) {
            while (i2 < list.size()) {
                this.zza.zzj(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        zzicn zzicnVar = (zzicn) list;
        while (i2 < list.size()) {
            Object objZzc = zzicnVar.zzc();
            if (objZzc instanceof String) {
                this.zza.zzj(i, (String) objZzc);
            } else {
                this.zza.zzk(i, (zzian) objZzc);
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzG(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zzk(i, (zzian) list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzH(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzibs)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzJ(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i, 2);
            int iZzA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzA += zziaw.zzA(((Integer) list.get(i3)).intValue());
            }
            zziawVar.zzs(iZzA);
            while (i2 < list.size()) {
                zziawVar.zzs(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzibs zzibsVar = (zzibs) list;
        if (!z) {
            while (i2 < zzibsVar.size()) {
                this.zza.zzJ(i, zzibsVar.zzf(i2));
                i2++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i, 2);
        int iZzA2 = 0;
        for (int i4 = 0; i4 < zzibsVar.size(); i4++) {
            iZzA2 += zziaw.zzA(zzibsVar.zzf(i4));
        }
        zziawVar2.zzs(iZzA2);
        while (i2 < zzibsVar.size()) {
            zziawVar2.zzs(zzibsVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzI(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzibs)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzK(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            zziawVar.zzs(i3);
            while (i2 < list.size()) {
                zziawVar.zzt(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzibs zzibsVar = (zzibs) list;
        if (!z) {
            while (i2 < zzibsVar.size()) {
                this.zza.zzK(i, zzibsVar.zzf(i2));
                i2++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzibsVar.size(); i6++) {
            zzibsVar.zzf(i6);
            i5 += 4;
        }
        zziawVar2.zzs(i5);
        while (i2 < zzibsVar.size()) {
            zziawVar2.zzt(zzibsVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzJ(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzicq)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            zziawVar.zzs(i3);
            while (i2 < list.size()) {
                zziawVar.zzv(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzicq zzicqVar = (zzicq) list;
        if (!z) {
            while (i2 < zzicqVar.size()) {
                this.zza.zzh(i, zzicqVar.zzc(i2));
                i2++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzicqVar.size(); i6++) {
            zzicqVar.zzc(i6);
            i5 += 8;
        }
        zziawVar2.zzs(i5);
        while (i2 < zzicqVar.size()) {
            zziawVar2.zzv(zzicqVar.zzc(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzK(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzibs)) {
            if (!z) {
                while (i2 < list.size()) {
                    zziaw zziawVar = this.zza;
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    zziawVar.zzJ(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            zziaw zziawVar2 = this.zza;
            zziawVar2.zzH(i, 2);
            int iZzA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iZzA += zziaw.zzA((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            zziawVar2.zzs(iZzA);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                zziawVar2.zzs((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        zzibs zzibsVar = (zzibs) list;
        if (!z) {
            while (i2 < zzibsVar.size()) {
                zziaw zziawVar3 = this.zza;
                int iZzf = zzibsVar.zzf(i2);
                zziawVar3.zzJ(i, (iZzf >> 31) ^ (iZzf + iZzf));
                i2++;
            }
            return;
        }
        zziaw zziawVar4 = this.zza;
        zziawVar4.zzH(i, 2);
        int iZzA2 = 0;
        for (int i4 = 0; i4 < zzibsVar.size(); i4++) {
            int iZzf2 = zzibsVar.zzf(i4);
            iZzA2 += zziaw.zzA((iZzf2 >> 31) ^ (iZzf2 + iZzf2));
        }
        zziawVar4.zzs(iZzA2);
        while (i2 < zzibsVar.size()) {
            int iZzf3 = zzibsVar.zzf(i2);
            zziawVar4.zzs((iZzf3 >> 31) ^ (iZzf3 + iZzf3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzL(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzicq)) {
            if (!z) {
                while (i2 < list.size()) {
                    zziaw zziawVar = this.zza;
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    zziawVar.zzL(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i2++;
                }
                return;
            }
            zziaw zziawVar2 = this.zza;
            zziawVar2.zzH(i, 2);
            int iZzB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iZzB += zziaw.zzB((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            zziawVar2.zzs(iZzB);
            while (i2 < list.size()) {
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                zziawVar2.zzu((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i2++;
            }
            return;
        }
        zzicq zzicqVar = (zzicq) list;
        if (!z) {
            while (i2 < zzicqVar.size()) {
                zziaw zziawVar3 = this.zza;
                long jZzc = zzicqVar.zzc(i2);
                zziawVar3.zzL(i, (jZzc >> 63) ^ (jZzc + jZzc));
                i2++;
            }
            return;
        }
        zziaw zziawVar4 = this.zza;
        zziawVar4.zzH(i, 2);
        int iZzB2 = 0;
        for (int i4 = 0; i4 < zzicqVar.size(); i4++) {
            long jZzc2 = zzicqVar.zzc(i4);
            iZzB2 += zziaw.zzB((jZzc2 >> 63) ^ (jZzc2 + jZzc2));
        }
        zziawVar4.zzs(iZzB2);
        while (i2 < zzicqVar.size()) {
            long jZzc3 = zzicqVar.zzc(i2);
            zziawVar4.zzu((jZzc3 >> 63) ^ (jZzc3 + jZzc3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzM(int i, zzicu zzicuVar, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i, 2);
            zziawVar.zzs(zzicv.zzc(zzicuVar, entry.getKey(), entry.getValue()));
            zzicv.zzb(zziawVar, zzicuVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzb(int i, int i2) {
        this.zza.zzK(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzc(int i, long j) {
        this.zza.zzL(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzd(int i, long j) {
        this.zza.zzh(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zze(int i, float f) {
        this.zza.zzK(i, Float.floatToRawIntBits(f));
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzf(int i, double d) {
        this.zza.zzh(i, Double.doubleToRawLongBits(d));
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzg(int i, int i2) {
        this.zza.zzI(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzh(int i, long j) {
        this.zza.zzL(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzi(int i, int i2) {
        this.zza.zzI(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzj(int i, long j) {
        this.zza.zzh(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzk(int i, int i2) {
        this.zza.zzK(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzl(int i, boolean z) {
        this.zza.zzi(i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzm(int i, String str) {
        this.zza.zzj(i, str);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzn(int i, zzian zzianVar) {
        this.zza.zzk(i, zzianVar);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzo(int i, int i2) {
        this.zza.zzJ(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzp(int i, int i2) {
        this.zza.zzJ(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzq(int i, long j) {
        this.zza.zzL(i, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzr(int i, Object obj, zzidu zziduVar) {
        zziaw zziawVar = this.zza;
        zzhzw zzhzwVar = (zzhzw) obj;
        zziawVar.zzH(i, 2);
        zziawVar.zzs(zzhzwVar.zzaT(zziduVar));
        zziduVar.zzf(zzhzwVar, this);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzs(int i, Object obj, zzidu zziduVar) {
        zziaw zziawVar = this.zza;
        zziawVar.zzH(i, 3);
        zziduVar.zzf((zzhzw) obj, this);
        zziawVar.zzH(i, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    @Deprecated
    public final void zzt(int i) {
        this.zza.zzH(i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    @Deprecated
    public final void zzu(int i) {
        this.zza.zzH(i, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzv(int i, Object obj) {
        if (obj instanceof zzian) {
            this.zza.zzo(i, (zzian) obj);
        } else {
            this.zza.zzn(i, (zzidc) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzw(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzibs)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzI(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i, 2);
            int iZzB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzB += zziaw.zzB(((Integer) list.get(i3)).intValue());
            }
            zziawVar.zzs(iZzB);
            while (i2 < list.size()) {
                zziawVar.zzr(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzibs zzibsVar = (zzibs) list;
        if (!z) {
            while (i2 < zzibsVar.size()) {
                this.zza.zzI(i, zzibsVar.zzf(i2));
                i2++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i, 2);
        int iZzB2 = 0;
        for (int i4 = 0; i4 < zzibsVar.size(); i4++) {
            iZzB2 += zziaw.zzB(zzibsVar.zzf(i4));
        }
        zziawVar2.zzs(iZzB2);
        while (i2 < zzibsVar.size()) {
            zziawVar2.zzr(zzibsVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzx(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzibs)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzK(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            zziawVar.zzs(i3);
            while (i2 < list.size()) {
                zziawVar.zzt(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzibs zzibsVar = (zzibs) list;
        if (!z) {
            while (i2 < zzibsVar.size()) {
                this.zza.zzK(i, zzibsVar.zzf(i2));
                i2++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzibsVar.size(); i6++) {
            zzibsVar.zzf(i6);
            i5 += 4;
        }
        zziawVar2.zzs(i5);
        while (i2 < zzibsVar.size()) {
            zziawVar2.zzt(zzibsVar.zzf(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzy(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzicq)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzL(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i, 2);
            int iZzB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzB += zziaw.zzB(((Long) list.get(i3)).longValue());
            }
            zziawVar.zzs(iZzB);
            while (i2 < list.size()) {
                zziawVar.zzu(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzicq zzicqVar = (zzicq) list;
        if (!z) {
            while (i2 < zzicqVar.size()) {
                this.zza.zzL(i, zzicqVar.zzc(i2));
                i2++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i, 2);
        int iZzB2 = 0;
        for (int i4 = 0; i4 < zzicqVar.size(); i4++) {
            iZzB2 += zziaw.zzB(zzicqVar.zzc(i4));
        }
        zziawVar2.zzs(iZzB2);
        while (i2 < zzicqVar.size()) {
            zziawVar2.zzu(zzicqVar.zzc(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzieu
    public final void zzz(int i, List list, boolean z) {
        int i2 = 0;
        if (!(list instanceof zzicq)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzL(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            zziaw zziawVar = this.zza;
            zziawVar.zzH(i, 2);
            int iZzB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzB += zziaw.zzB(((Long) list.get(i3)).longValue());
            }
            zziawVar.zzs(iZzB);
            while (i2 < list.size()) {
                zziawVar.zzu(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzicq zzicqVar = (zzicq) list;
        if (!z) {
            while (i2 < zzicqVar.size()) {
                this.zza.zzL(i, zzicqVar.zzc(i2));
                i2++;
            }
            return;
        }
        zziaw zziawVar2 = this.zza;
        zziawVar2.zzH(i, 2);
        int iZzB2 = 0;
        for (int i4 = 0; i4 < zzicqVar.size(); i4++) {
            iZzB2 += zziaw.zzB(zzicqVar.zzc(i4));
        }
        zziawVar2.zzs(iZzB2);
        while (i2 < zzicqVar.size()) {
            zziawVar2.zzu(zzicqVar.zzc(i2));
            i2++;
        }
    }
}
