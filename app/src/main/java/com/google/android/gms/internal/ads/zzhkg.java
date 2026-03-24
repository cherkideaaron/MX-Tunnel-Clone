package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzhkg {
    private static final zzhkg zza = (zzhkg) zzhlm.zza(zzhkf.zza);
    private final AtomicReference zzb = new AtomicReference(new zzhlk(new zzhlh(), null));

    public static zzhkg zza() {
        return zza;
    }

    public final synchronized void zzb(zzhji zzhjiVar) {
        AtomicReference atomicReference = this.zzb;
        zzhlh zzhlhVar = new zzhlh((zzhlk) atomicReference.get());
        zzhlhVar.zza(zzhjiVar);
        atomicReference.set(new zzhlk(zzhlhVar, null));
    }

    public final synchronized void zzc(zzhjf zzhjfVar) {
        AtomicReference atomicReference = this.zzb;
        zzhlh zzhlhVar = new zzhlh((zzhlk) atomicReference.get());
        zzhlhVar.zzb(zzhjfVar);
        atomicReference.set(new zzhlk(zzhlhVar, null));
    }

    public final synchronized void zzd(zzhkn zzhknVar) {
        AtomicReference atomicReference = this.zzb;
        zzhlh zzhlhVar = new zzhlh((zzhlk) atomicReference.get());
        zzhlhVar.zzc(zzhknVar);
        atomicReference.set(new zzhlk(zzhlhVar, null));
    }

    public final synchronized void zze(zzhkk zzhkkVar) {
        AtomicReference atomicReference = this.zzb;
        zzhlh zzhlhVar = new zzhlh((zzhlk) atomicReference.get());
        zzhlhVar.zzd(zzhkkVar);
        atomicReference.set(new zzhlk(zzhlhVar, null));
    }

    public final boolean zzf(zzhlg zzhlgVar) {
        return ((zzhlk) this.zzb.get()).zza(zzhlgVar);
    }

    public final zzhaz zzg(zzhlg zzhlgVar, zzhbt zzhbtVar) {
        return ((zzhlk) this.zzb.get()).zzb(zzhlgVar, zzhbtVar);
    }

    public final zzhlg zzh(zzhaz zzhazVar, Class cls, zzhbt zzhbtVar) {
        return ((zzhlk) this.zzb.get()).zzc(zzhazVar, cls, zzhbtVar);
    }

    public final boolean zzi(zzhlg zzhlgVar) {
        return ((zzhlk) this.zzb.get()).zzd(zzhlgVar);
    }

    public final zzhbp zzj(zzhlg zzhlgVar) {
        return ((zzhlk) this.zzb.get()).zze(zzhlgVar);
    }

    public final zzhlg zzk(zzhbp zzhbpVar, Class cls) {
        return ((zzhlk) this.zzb.get()).zzf(zzhbpVar, cls);
    }
}
