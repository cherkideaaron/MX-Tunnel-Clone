package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class zzabj {
    private static final Comparator zza = zzabi.zza;
    private static final Comparator zzb = zzabh.zza;
    private int zzf;
    private int zzg;
    private int zzh;
    private final zzabg[] zzd = new zzabg[5];
    private final ArrayList zzc = new ArrayList();
    private int zze = -1;

    public zzabj(int i) {
    }

    public final void zza() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }

    public final void zzb(int i, float f) {
        zzabg zzabgVar;
        int i2;
        zzabg zzabgVar2;
        int i3;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i4 = this.zzh;
        if (i4 > 0) {
            zzabg[] zzabgVarArr = this.zzd;
            int i5 = i4 - 1;
            this.zzh = i5;
            zzabgVar = zzabgVarArr[i5];
        } else {
            zzabgVar = new zzabg(null);
        }
        int i6 = this.zzf;
        this.zzf = i6 + 1;
        zzabgVar.zza = i6;
        zzabgVar.zzb = i;
        zzabgVar.zzc = f;
        ArrayList arrayList = this.zzc;
        arrayList.add(zzabgVar);
        int i7 = this.zzg + i;
        while (true) {
            this.zzg = i7;
            while (true) {
                int i8 = this.zzg;
                if (i8 <= 2000) {
                    return;
                }
                i2 = i8 - 2000;
                zzabgVar2 = (zzabg) arrayList.get(0);
                i3 = zzabgVar2.zzb;
                if (i3 <= i2) {
                    this.zzg -= i3;
                    arrayList.remove(0);
                    int i9 = this.zzh;
                    if (i9 < 5) {
                        zzabg[] zzabgVarArr2 = this.zzd;
                        this.zzh = i9 + 1;
                        zzabgVarArr2[i9] = zzabgVar2;
                    }
                }
            }
            zzabgVar2.zzb = i3 - i2;
            i7 = this.zzg - i2;
        }
    }

    public final float zzc(float f) {
        int i = 0;
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f2 = this.zzg;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.zzc;
            if (i >= arrayList.size()) {
                if (arrayList.isEmpty()) {
                    return Float.NaN;
                }
                return ((zzabg) arrayList.get(arrayList.size() - 1)).zzc;
            }
            float f3 = 0.5f * f2;
            zzabg zzabgVar = (zzabg) arrayList.get(i);
            i2 += zzabgVar.zzb;
            if (i2 >= f3) {
                return zzabgVar.zzc;
            }
            i++;
        }
    }
}
