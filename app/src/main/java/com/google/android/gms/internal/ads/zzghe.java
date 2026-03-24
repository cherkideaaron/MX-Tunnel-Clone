package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes.dex */
final class zzghe extends zzghb {
    private final Map zza;
    private final zzgfx zzb;
    private final DisplayMetrics zzc;

    public zzghe(zzawg zzawgVar, zzgfx zzgfxVar, Map map, DisplayMetrics displayMetrics, zzgoe zzgoeVar) {
        super("HAMf3XP8KIibPGIFc5yJF+oNVlSUbFLkUHSZdrZ2Dhl4Bh9ge4/6z6Usrb+mfprj", "vYv0JfNJ2rw4TIvbzqBhbKW0tXWLxxqXfI+gpZUSK1Y=", zzawgVar, zzgfxVar, zzgoeVar.zza(123));
        this.zzb = zzgfxVar;
        this.zza = map;
        this.zzc = displayMetrics;
    }

    private static long zzb(double d, DisplayMetrics displayMetrics) {
        return Math.round(d / displayMetrics.density);
    }

    private static boolean zzc(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzghb
    public final void zza(Method method, zzawg zzawgVar) {
        Map map = this.zza;
        Object obj = (MotionEvent) map.get("nv");
        DisplayMetrics displayMetrics = this.zzc;
        Object[] objArr = (Object[]) method.invoke("", obj, displayMetrics);
        objArr.getClass();
        zzaxc zzaxcVarZza = zzaxd.zza();
        Object obj2 = objArr[0];
        if (obj2 != null && objArr[1] != null) {
            zzaxcVarZza.zza(((Long) obj2).longValue());
            zzaxcVarZza.zzb(((Long) objArr[1]).longValue());
        }
        Object obj3 = objArr[2];
        if (obj3 != null) {
            zzaxcVarZza.zzh(((Long) obj3).longValue());
        }
        Object obj4 = objArr[3];
        if (obj4 != null) {
            zzaxcVarZza.zzf(((Long) obj4).longValue());
        }
        Object obj5 = objArr[4];
        if (obj5 != null) {
            zzaxcVarZza.zzc(((Long) obj5).longValue());
        }
        Object obj6 = objArr[5];
        if (obj6 != null) {
            zzaxcVarZza.zzs(((Long) obj6).longValue() != 0 ? 2 : 1);
        }
        Object obj7 = objArr[6];
        if (obj7 != null) {
            zzaxcVarZza.zzj(((Long) obj7).longValue());
        }
        Object obj8 = objArr[7];
        if (obj8 != null) {
            zzaxcVarZza.zzi(((Long) obj8).longValue());
        }
        Object obj9 = objArr[8];
        if (obj9 != null) {
            zzaxcVarZza.zzt(((Long) obj9).longValue() != 0 ? 2 : 1);
        }
        synchronized (zzawgVar) {
            try {
                Method methodZzc = this.zzb.zzc("LTqeYOkKjRvgMVLXGWwl9QUpPl0hs86RILvnzsnpkgBkbbANt+0KM6wwB7tA8s8M", "qJFn6bhMeF50E1eku7tYH88ZkNeM8ctWC3me80VkO1s=");
                methodZzc.getClass();
                Object[] objArr2 = (Object[]) methodZzc.invoke("", (MotionEvent) map.get("nv"), displayMetrics);
                objArr2.getClass();
                Object obj10 = objArr2[0];
                if (obj10 != null) {
                    zzawgVar.zzh(((Long) obj10).longValue());
                }
                Object obj11 = objArr2[1];
                if (obj11 != null) {
                    zzawgVar.zzi(((Long) obj11).longValue());
                }
                Object obj12 = objArr2[2];
                if (obj12 != null) {
                    zzawgVar.zzj(((Long) obj12).longValue());
                }
                Object obj13 = objArr2[3];
                if (obj13 != null) {
                    zzawgVar.zzv(((Long) obj13).longValue());
                }
                Object obj14 = objArr2[4];
                if (obj14 != null) {
                    zzawgVar.zzw(((Long) obj14).longValue());
                }
                zzger zzgerVar = (zzger) map.get("oe");
                if (zzgerVar != null) {
                    long j = zzgerVar.zza;
                    if (j > 0) {
                        zzawgVar.zzz(j);
                    }
                    long j2 = zzgerVar.zzb;
                    if (j2 > 0) {
                        zzawgVar.zzy(j2);
                    }
                    long j3 = zzgerVar.zzc;
                    if (j3 > 0) {
                        zzawgVar.zzx(j3);
                    }
                    long j4 = zzgerVar.zzd;
                    if (j4 > 0) {
                        zzawgVar.zzA(j4);
                    }
                }
                zzger zzgerVar2 = (zzger) map.get("oe");
                if (zzgerVar2 != null && zzgerVar2.zza != 0 && zzc(displayMetrics)) {
                    double d = zzgerVar2.zze;
                    displayMetrics.getClass();
                    zzaxcVarZza.zzl(zzb(d, displayMetrics));
                    zzaxcVarZza.zzm(zzb(zzgerVar2.zzh - zzgerVar2.zzf, displayMetrics));
                    zzaxcVarZza.zzn(zzb(zzgerVar2.zzi - zzgerVar2.zzg, displayMetrics));
                    zzaxcVarZza.zzq(zzb(zzgerVar2.zzf, displayMetrics));
                    zzaxcVarZza.zzr(zzb(zzgerVar2.zzg, displayMetrics));
                    if (((MotionEvent) map.get("nv")) != null) {
                        long jZzb = zzb(((zzgerVar2.zzf - zzgerVar2.zzh) + r3.getRawX()) - r3.getX(), displayMetrics);
                        if (jZzb != 0) {
                            zzaxcVarZza.zzo(jZzb);
                        }
                        long jZzb2 = zzb(((zzgerVar2.zzg - zzgerVar2.zzi) + r3.getRawY()) - r3.getY(), displayMetrics);
                        if (jZzb2 != 0) {
                            zzaxcVarZza.zzp(jZzb2);
                        }
                    }
                }
                zzawgVar.zzJ(zzaxcVarZza);
                zzges[] zzgesVarArr = (zzges[]) map.get("ro");
                if (zzgesVarArr != null && zzc(displayMetrics)) {
                    for (int i = 0; i <= zzgesVarArr.length - 2; i++) {
                        zzges zzgesVar = zzgesVarArr[i];
                        zzaxc zzaxcVarZza2 = zzaxd.zza();
                        double d2 = zzgesVar.zza;
                        displayMetrics.getClass();
                        zzaxcVarZza2.zza(zzb(d2, displayMetrics));
                        zzaxcVarZza2.zzb(zzb(zzgesVar.zzb, displayMetrics));
                        zzawgVar.zzK((zzaxd) zzaxcVarZza2.zzbu());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
