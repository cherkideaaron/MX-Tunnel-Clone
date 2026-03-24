package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzalb {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static zzagc zza(zzaev zzaevVar) {
        return zzc(zzaevVar, true, false);
    }

    public static zzagc zzb(zzaev zzaevVar, boolean z) {
        return zzc(zzaevVar, false, z);
    }

    private static zzagc zzc(zzaev zzaevVar, boolean z, boolean z2) {
        zzer zzerVar;
        int i;
        long j;
        zzer zzerVar2;
        int i2;
        boolean z3;
        int[] iArr;
        long jZzo = zzaevVar.zzo();
        long j2 = -1;
        long j3 = 4096;
        if (jZzo != -1 && jZzo <= 4096) {
            j3 = jZzo;
        }
        zzer zzerVar3 = new zzer(64);
        int i3 = (int) j3;
        int i4 = 0;
        int i5 = 0;
        boolean z4 = false;
        while (i5 < i3) {
            zzerVar3.zza(8);
            if (!zzaevVar.zzh(zzerVar3.zzi(), i4, 8, true)) {
                break;
            }
            long jZzz = zzerVar3.zzz();
            int iZzB = zzerVar3.zzB();
            if (jZzz == 1) {
                zzaevVar.zzi(zzerVar3.zzi(), 8, 8);
                i = 16;
                zzerVar3.zzf(16);
                jZzz = zzerVar3.zzD();
                zzerVar = zzerVar3;
            } else {
                if (jZzz == 0) {
                    long jZzo2 = zzaevVar.zzo();
                    if (jZzo2 != j2) {
                        jZzz = (jZzo2 - zzaevVar.zzm()) + 8;
                    }
                }
                zzerVar = zzerVar3;
                i = 8;
            }
            long j4 = jZzz;
            long j5 = i;
            if (j4 < j5) {
                if (iZzB == 1718773093) {
                    iZzB = 1718773093;
                    if (i == 8) {
                        j4 = 8;
                    }
                }
                return new zzajv(iZzB, j4, i);
            }
            i5 += i;
            if (iZzB == 1836019574) {
                i3 += (int) j4;
                if (jZzo != -1 && i3 > jZzo) {
                    i3 = (int) jZzo;
                }
                zzerVar3 = zzerVar;
                j2 = -1;
                i4 = 0;
            } else {
                if (iZzB == 1953653099 || iZzB == 1835297121 || iZzB == 1835626086) {
                    j = jZzo;
                    zzerVar2 = zzerVar;
                    i2 = 0;
                } else {
                    if (iZzB == 1836019558 || iZzB == 1836475768) {
                        i4 = 1;
                        break;
                    }
                    z4 |= !(iZzB != 1835295092);
                    if (iZzB == 1937007212) {
                        if (j4 > 1000000) {
                            i4 = 0;
                            break;
                        }
                        iZzB = 1937007212;
                    }
                    j = jZzo;
                    if ((i5 + j4) - j5 >= i3) {
                        i4 = 0;
                        break;
                    }
                    int i6 = (int) (j4 - j5);
                    i5 += i6;
                    if (iZzB != 1718909296) {
                        zzerVar2 = zzerVar;
                        i2 = 0;
                        if (i6 != 0) {
                            zzaevVar.zzk(i6);
                        }
                    } else {
                        if (i6 < 8) {
                            return new zzajv(1718909296, i6, 8);
                        }
                        zzerVar2 = zzerVar;
                        zzerVar2.zza(i6);
                        i2 = 0;
                        zzaevVar.zzi(zzerVar2.zzi(), 0, i6);
                        int iZzB2 = zzerVar2.zzB();
                        boolean zZzd = zzd(iZzB2, z2) | z4;
                        zzerVar2.zzk(4);
                        int iZzd = zzerVar2.zzd() / 4;
                        if (!zZzd && iZzd > 0) {
                            iArr = new int[iZzd];
                            int i7 = 0;
                            while (true) {
                                if (i7 >= iZzd) {
                                    z3 = zZzd;
                                    break;
                                }
                                int iZzB3 = zzerVar2.zzB();
                                iArr[i7] = iZzB3;
                                if (zzd(iZzB3, z2)) {
                                    z3 = true;
                                    break;
                                }
                                i7++;
                            }
                        } else {
                            z3 = zZzd;
                            iArr = null;
                        }
                        if (!z3) {
                            return new zzalg(iZzB2, iArr);
                        }
                        z4 = z3;
                    }
                }
                zzerVar3 = zzerVar2;
                i4 = i2;
                jZzo = j;
                j2 = -1;
            }
        }
        if (!z4) {
            return zzakx.zza;
        }
        if (z != i4) {
            return i4 != 0 ? zzakp.zza : zzakp.zzb;
        }
        return null;
    }

    private static boolean zzd(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579) {
            if (z) {
                return true;
            }
            i = 1751476579;
        }
        int[] iArr = zza;
        for (int i2 = 0; i2 < 29; i2++) {
            if (iArr[i2] == i) {
                return true;
            }
        }
        return false;
    }
}
