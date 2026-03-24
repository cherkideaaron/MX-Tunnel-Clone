package com.google.android.gms.internal.ads;

import defpackage.AbstractC3219pQ;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzidw {
    public static final /* synthetic */ int zza = 0;
    private static final zzief zzb;

    static {
        int i = zziaa.zza;
        zzb = new zzieh();
    }

    public static int zzA(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zziaw.zzA(i << 3) + 4) * size;
    }

    public static int zzB(List list) {
        return list.size() * 8;
    }

    public static int zzC(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zziaw.zzA(i << 3) + 8) * size;
    }

    public static int zzD(int i, Object obj, zzidu zziduVar) {
        int iZzA;
        int iZzaT;
        int i2 = i << 3;
        if (obj instanceof zzicm) {
            iZzA = zziaw.zzA(i2);
            iZzaT = ((zzicm) obj).zzb();
        } else {
            iZzA = zziaw.zzA(i2);
            iZzaT = ((zzhzw) obj).zzaT(zziduVar);
        }
        return AbstractC3219pQ.b(iZzaT, iZzaT, iZzA);
    }

    @Deprecated
    public static int zzE(int i, zzidc zzidcVar, zzidu zziduVar) {
        int iZzA = zziaw.zzA(i << 3);
        return ((zzhzw) zzidcVar).zzaT(zziduVar) + iZzA + iZzA;
    }

    public static zzief zzF() {
        return zzb;
    }

    public static boolean zzG(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void zzH(zzibc zzibcVar, Object obj, Object obj2) {
        if (((zzibn) obj2).zza.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    public static void zzI(zzief zziefVar, Object obj, Object obj2) {
        zzibr zzibrVar = (zzibr) obj;
        zzieg zziegVarZzc = zzibrVar.zzt;
        zzieg zziegVar = ((zzibr) obj2).zzt;
        if (!zzieg.zza().equals(zziegVar)) {
            if (zzieg.zza().equals(zziegVarZzc)) {
                zziegVarZzc = zzieg.zzc(zziegVarZzc, zziegVar);
            } else {
                zziegVarZzc.zzm(zziegVar);
            }
        }
        zzibrVar.zzt = zziegVarZzc;
    }

    public static Object zzJ(Object obj, int i, List list, zzibx zzibxVar, Object obj2, zzief zziefVar) {
        if (zzibxVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = (Integer) list.get(i3);
                int iIntValue = num.intValue();
                if (zzibxVar.zza(iIntValue)) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    obj2 = zzK(obj, i, iIntValue, obj2, zziefVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (!zzibxVar.zza(iIntValue2)) {
                    obj2 = zzK(obj, i, iIntValue2, obj2, zziefVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static Object zzK(Object obj, int i, int i2, Object obj2, zzief zziefVar) {
        if (obj2 == null) {
            obj2 = zziefVar.zzh(obj);
        }
        zziefVar.zza(obj2, i, i2);
        return obj2;
    }

    public static void zza(int i, List list, zzieu zzieuVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzC(i, list, z);
    }

    public static void zzb(int i, List list, zzieu zzieuVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzB(i, list, z);
    }

    public static void zzc(int i, List list, zzieu zzieuVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzy(i, list, z);
    }

    public static void zzd(int i, List list, zzieu zzieuVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzz(i, list, z);
    }

    public static void zze(int i, List list, zzieu zzieuVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzL(i, list, z);
    }

    public static void zzf(int i, List list, zzieu zzieuVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzA(i, list, z);
    }

    public static void zzg(int i, List list, zzieu zzieuVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzJ(i, list, z);
    }

    public static void zzh(int i, List list, zzieu zzieuVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzw(i, list, z);
    }

    public static void zzi(int i, List list, zzieu zzieuVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzH(i, list, z);
    }

    public static void zzj(int i, List list, zzieu zzieuVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzK(i, list, z);
    }

    public static void zzk(int i, List list, zzieu zzieuVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzx(i, list, z);
    }

    public static void zzl(int i, List list, zzieu zzieuVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzI(i, list, z);
    }

    public static void zzm(int i, List list, zzieu zzieuVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzD(i, list, z);
    }

    public static void zzn(int i, List list, zzieu zzieuVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzE(i, list, z);
    }

    public static void zzo(int i, List list, zzieu zzieuVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzF(i, list);
    }

    public static void zzp(int i, List list, zzieu zzieuVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzG(i, list);
    }

    public static void zzq(int i, List list, zzieu zzieuVar, zzidu zziduVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((zziax) zzieuVar).zzr(i, list.get(i2), zziduVar);
        }
    }

    public static void zzr(int i, List list, zzieu zzieuVar, zzidu zziduVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((zziax) zzieuVar).zzs(i, list.get(i2), zziduVar);
        }
    }

    public static int zzs(List list) {
        int iZzB;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzicq) {
            zzicq zzicqVar = (zzicq) list;
            iZzB = 0;
            while (i < size) {
                iZzB += zziaw.zzB(zzicqVar.zzc(i));
                i++;
            }
        } else {
            iZzB = 0;
            while (i < size) {
                iZzB += zziaw.zzB(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iZzB;
    }

    public static int zzt(List list) {
        int iZzB;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzicq) {
            zzicq zzicqVar = (zzicq) list;
            iZzB = 0;
            while (i < size) {
                iZzB += zziaw.zzB(zzicqVar.zzc(i));
                i++;
            }
        } else {
            iZzB = 0;
            while (i < size) {
                iZzB += zziaw.zzB(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iZzB;
    }

    public static int zzu(List list) {
        int iZzB;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzicq) {
            zzicq zzicqVar = (zzicq) list;
            iZzB = 0;
            while (i < size) {
                long jZzc = zzicqVar.zzc(i);
                iZzB += zziaw.zzB((jZzc >> 63) ^ (jZzc + jZzc));
                i++;
            }
        } else {
            iZzB = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iZzB += zziaw.zzB((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
        }
        return iZzB;
    }

    public static int zzv(List list) {
        int iZzB;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzibs) {
            zzibs zzibsVar = (zzibs) list;
            iZzB = 0;
            while (i < size) {
                iZzB += zziaw.zzB(zzibsVar.zzf(i));
                i++;
            }
        } else {
            iZzB = 0;
            while (i < size) {
                iZzB += zziaw.zzB(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzB;
    }

    public static int zzw(List list) {
        int iZzB;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzibs) {
            zzibs zzibsVar = (zzibs) list;
            iZzB = 0;
            while (i < size) {
                iZzB += zziaw.zzB(zzibsVar.zzf(i));
                i++;
            }
        } else {
            iZzB = 0;
            while (i < size) {
                iZzB += zziaw.zzB(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzB;
    }

    public static int zzx(List list) {
        int iZzA;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzibs) {
            zzibs zzibsVar = (zzibs) list;
            iZzA = 0;
            while (i < size) {
                iZzA += zziaw.zzA(zzibsVar.zzf(i));
                i++;
            }
        } else {
            iZzA = 0;
            while (i < size) {
                iZzA += zziaw.zzA(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzA;
    }

    public static int zzy(List list) {
        int iZzA;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzibs) {
            zzibs zzibsVar = (zzibs) list;
            iZzA = 0;
            while (i < size) {
                int iZzf = zzibsVar.zzf(i);
                iZzA += zziaw.zzA((iZzf >> 31) ^ (iZzf + iZzf));
                i++;
            }
        } else {
            iZzA = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iZzA += zziaw.zzA((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
        }
        return iZzA;
    }

    public static int zzz(List list) {
        return list.size() * 4;
    }
}
