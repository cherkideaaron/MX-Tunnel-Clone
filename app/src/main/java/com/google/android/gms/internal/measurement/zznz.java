package com.google.android.gms.internal.measurement;

import defpackage.AbstractC3219pQ;
import java.util.List;

/* loaded from: classes2.dex */
final class zznz {
    public static final /* synthetic */ int zza = 0;
    private static final zzoi zzb;

    static {
        int i = zznu.zza;
        zzb = new zzok();
    }

    public static zzoi zzA() {
        return zzb;
    }

    public static boolean zzB(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void zzC(zzls zzlsVar, Object obj, Object obj2) {
        if (((zzmc) obj2).zzb.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    public static void zzD(zzoi zzoiVar, Object obj, Object obj2) {
        zzmf zzmfVar = (zzmf) obj;
        zzoj zzojVarZzc = zzmfVar.zzc;
        zzoj zzojVar = ((zzmf) obj2).zzc;
        if (!zzoj.zza().equals(zzojVar)) {
            if (zzoj.zza().equals(zzojVarZzc)) {
                zzojVarZzc = zzoj.zzc(zzojVarZzc, zzojVar);
            } else {
                zzojVarZzc.zzl(zzojVar);
            }
        }
        zzmfVar.zzc = zzojVarZzc;
    }

    public static Object zzE(Object obj, int i, int i2, Object obj2, zzoi zzoiVar) {
        if (obj2 == null) {
            obj2 = zzoiVar.zza(obj);
        }
        ((zzoj) obj2).zzk(i << 3, Long.valueOf(i2));
        return obj2;
    }

    public static void zza(int i, List list, zzov zzovVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzC(i, list, z);
    }

    public static void zzb(int i, List list, zzov zzovVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzB(i, list, z);
    }

    public static void zzc(int i, List list, zzov zzovVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzy(i, list, z);
    }

    public static void zzd(int i, List list, zzov zzovVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzz(i, list, z);
    }

    public static void zze(int i, List list, zzov zzovVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzL(i, list, z);
    }

    public static void zzf(int i, List list, zzov zzovVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzA(i, list, z);
    }

    public static void zzg(int i, List list, zzov zzovVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzJ(i, list, z);
    }

    public static void zzh(int i, List list, zzov zzovVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzw(i, list, z);
    }

    public static void zzi(int i, List list, zzov zzovVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzH(i, list, z);
    }

    public static void zzj(int i, List list, zzov zzovVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzK(i, list, z);
    }

    public static void zzk(int i, List list, zzov zzovVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzx(i, list, z);
    }

    public static void zzl(int i, List list, zzov zzovVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzI(i, list, z);
    }

    public static void zzm(int i, List list, zzov zzovVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzD(i, list, z);
    }

    public static void zzn(int i, List list, zzov zzovVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzovVar.zzE(i, list, z);
    }

    public static int zzo(List list) {
        int iZzA;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzna) {
            zzna zznaVar = (zzna) list;
            iZzA = 0;
            while (i < size) {
                iZzA += zzlm.zzA(zznaVar.zzc(i));
                i++;
            }
        } else {
            iZzA = 0;
            while (i < size) {
                iZzA += zzlm.zzA(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iZzA;
    }

    public static int zzp(List list) {
        int iZzA;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzna) {
            zzna zznaVar = (zzna) list;
            iZzA = 0;
            while (i < size) {
                iZzA += zzlm.zzA(zznaVar.zzc(i));
                i++;
            }
        } else {
            iZzA = 0;
            while (i < size) {
                iZzA += zzlm.zzA(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iZzA;
    }

    public static int zzq(List list) {
        int iZzA;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzna) {
            zzna zznaVar = (zzna) list;
            iZzA = 0;
            while (i < size) {
                long jZzc = zznaVar.zzc(i);
                iZzA += zzlm.zzA((jZzc >> 63) ^ (jZzc + jZzc));
                i++;
            }
        } else {
            iZzA = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iZzA += zzlm.zzA((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
        }
        return iZzA;
    }

    public static int zzr(List list) {
        int iZzA;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzmg) {
            zzmg zzmgVar = (zzmg) list;
            iZzA = 0;
            while (i < size) {
                iZzA += zzlm.zzA(zzmgVar.zzf(i));
                i++;
            }
        } else {
            iZzA = 0;
            while (i < size) {
                iZzA += zzlm.zzA(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzA;
    }

    public static int zzs(List list) {
        int iZzA;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzmg) {
            zzmg zzmgVar = (zzmg) list;
            iZzA = 0;
            while (i < size) {
                iZzA += zzlm.zzA(zzmgVar.zzf(i));
                i++;
            }
        } else {
            iZzA = 0;
            while (i < size) {
                iZzA += zzlm.zzA(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzA;
    }

    public static int zzt(List list) {
        int iZzz;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzmg) {
            zzmg zzmgVar = (zzmg) list;
            iZzz = 0;
            while (i < size) {
                iZzz += zzlm.zzz(zzmgVar.zzf(i));
                i++;
            }
        } else {
            iZzz = 0;
            while (i < size) {
                iZzz += zzlm.zzz(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzz;
    }

    public static int zzu(List list) {
        int iZzz;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzmg) {
            zzmg zzmgVar = (zzmg) list;
            iZzz = 0;
            while (i < size) {
                int iZzf = zzmgVar.zzf(i);
                iZzz += zzlm.zzz((iZzf >> 31) ^ (iZzf + iZzf));
                i++;
            }
        } else {
            iZzz = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iZzz += zzlm.zzz((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
        }
        return iZzz;
    }

    public static int zzv(List list) {
        return list.size() * 4;
    }

    public static int zzw(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzlm.zzz(i << 3) + 4) * size;
    }

    public static int zzx(List list) {
        return list.size() * 8;
    }

    public static int zzy(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzlm.zzz(i << 3) + 8) * size;
    }

    public static int zzz(int i, Object obj, zznx zznxVar) {
        int i2 = i << 3;
        if (!(obj instanceof zzmw)) {
            return zzlm.zzD((zznm) obj, zznxVar) + zzlm.zzz(i2);
        }
        int iZzz = zzlm.zzz(i2);
        int iZzb = ((zzmw) obj).zzb();
        return AbstractC3219pQ.h(iZzb, iZzb, iZzz);
    }
}
