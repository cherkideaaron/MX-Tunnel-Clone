package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class zzamg implements zzaex {
    private final zzaex zzb;
    private final zzamd zzc;
    private final SparseArray zzd = new SparseArray();
    private boolean zze;

    public zzamg(zzaex zzaexVar, zzamd zzamdVar) {
        this.zzb = zzaexVar;
        this.zzc = zzamdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    public final zzagh zzu(int i, int i2) {
        if (i2 != 3) {
            this.zze = true;
            return this.zzb.zzu(i, i2);
        }
        SparseArray sparseArray = this.zzd;
        zzami zzamiVar = (zzami) sparseArray.get(i);
        if (zzamiVar != null) {
            return zzamiVar;
        }
        zzami zzamiVar2 = new zzami(this.zzb.zzu(i, 3), this.zzc);
        sparseArray.put(i, zzamiVar2);
        return zzamiVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    public final void zzv() {
        this.zzb.zzv();
        if (!this.zze) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.zzd;
            if (i >= sparseArray.size()) {
                return;
            }
            ((zzami) sparseArray.valueAt(i)).zzf(true);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    public final void zzw(zzafy zzafyVar) {
        this.zzb.zzw(zzafyVar);
    }
}
