package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes2.dex */
final class zzii implements Runnable {
    final /* synthetic */ zzah zza;
    final /* synthetic */ zzjd zzb;

    public zzii(zzjd zzjdVar, zzah zzahVar) {
        this.zza = zzahVar;
        Objects.requireNonNull(zzjdVar);
        this.zzb = zzjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjd zzjdVar = this.zzb;
        zzjdVar.zzL().zzZ();
        zzah zzahVar = this.zza;
        Object objZza = zzahVar.zzc.zza();
        zzpg zzpgVarZzL = zzjdVar.zzL();
        if (objZza == null) {
            zzpgVarZzL.zzal(zzahVar);
        } else {
            zzpgVarZzL.zzaj(zzahVar);
        }
    }
}
