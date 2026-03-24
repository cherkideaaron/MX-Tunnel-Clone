package com.google.android.gms.internal.ads;

import defpackage.DQ;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class zzgt implements zzhb {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;
    private zzhf zzd;

    public zzgt(boolean z) {
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zze(zzhz zzhzVar) {
        zzhzVar.getClass();
        ArrayList arrayList = this.zzb;
        if (arrayList.contains(zzhzVar)) {
            return;
        }
        arrayList.add(zzhzVar);
        this.zzc++;
    }

    public final void zzf(zzhf zzhfVar) {
        for (int i = 0; i < this.zzc; i++) {
            ((zzhz) this.zzb.get(i)).zza(this, zzhfVar, this.zza);
        }
    }

    public final void zzg(zzhf zzhfVar) {
        this.zzd = zzhfVar;
        for (int i = 0; i < this.zzc; i++) {
            ((zzhz) this.zzb.get(i)).zzb(this, zzhfVar, this.zza);
        }
    }

    public final void zzh(int i) {
        zzhf zzhfVar = this.zzd;
        String str = zzfj.zza;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            ((zzhz) this.zzb.get(i2)).zzc(this, zzhfVar, this.zza, i);
        }
    }

    public final void zzi() {
        zzhf zzhfVar = this.zzd;
        String str = zzfj.zza;
        for (int i = 0; i < this.zzc; i++) {
            ((zzhz) this.zzb.get(i)).zzd(this, zzhfVar, this.zza);
        }
        this.zzd = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public /* synthetic */ Map zzj() {
        return DQ.a(this);
    }
}
