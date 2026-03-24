package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class zzmz {
    private final zzs zza;
    private final SparseArray zzb;

    public zzmz(zzs zzsVar, SparseArray sparseArray) {
        this.zza = zzsVar;
        SparseArray sparseArray2 = new SparseArray(zzsVar.zzb());
        for (int i = 0; i < zzsVar.zzb(); i++) {
            int iZzc = zzsVar.zzc(i);
            zzmy zzmyVar = (zzmy) sparseArray.get(iZzc);
            zzmyVar.getClass();
            sparseArray2.append(iZzc, zzmyVar);
        }
        this.zzb = sparseArray2;
    }

    public final zzmy zza(int i) {
        zzmy zzmyVar = (zzmy) this.zzb.get(i);
        zzmyVar.getClass();
        return zzmyVar;
    }

    public final boolean zzb(int i) {
        return this.zza.zza(i);
    }

    public final int zzc() {
        return this.zza.zzb();
    }

    public final int zzd(int i) {
        return this.zza.zzc(i);
    }
}
