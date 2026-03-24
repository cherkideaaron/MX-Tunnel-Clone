package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class zzxg extends zzafk {
    private final zzyb zza;
    private final zzaer zzb;
    private final AtomicReference zzc;

    public zzxg(zzyb zzybVar) {
        super(zzybVar);
        this.zza = zzybVar;
        this.zzb = new zzaer();
        this.zzc = new AtomicReference(zzxf.PASS_THROUGH);
    }

    private final zzagh zzh() {
        return this.zzc.get() == zzxf.DISCARDING ? this.zzb : this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafk, com.google.android.gms.internal.ads.zzagh
    public final int zza(zzj zzjVar, int i, boolean z) {
        return zzh().zza(zzjVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzafk, com.google.android.gms.internal.ads.zzagh
    public final int zzb(zzj zzjVar, int i, boolean z, int i2) {
        return zzh().zzb(zzjVar, i, z, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzafk, com.google.android.gms.internal.ads.zzagh
    public final void zzc(zzer zzerVar, int i) {
        zzh().zzc(zzerVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzafk, com.google.android.gms.internal.ads.zzagh
    public final void zzd(zzer zzerVar, int i, int i2) {
        zzh().zzd(zzerVar, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzafk, com.google.android.gms.internal.ads.zzagh
    public final void zze(long j, int i, int i2, int i3, zzagg zzaggVar) {
        zzh().zze(j, i, i2, i3, zzaggVar);
        AtomicReference atomicReference = this.zzc;
        if (atomicReference.get() == zzxf.DISCARD_AFTER_NEXT_SAMPLE_METADATA) {
            this.zza.zzg(false);
            atomicReference.set(zzxf.DISCARDING);
        }
    }

    public final boolean zzf() {
        return this.zzc.get() == zzxf.PASS_THROUGH;
    }
}
