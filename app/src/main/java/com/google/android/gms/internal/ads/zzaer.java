package com.google.android.gms.internal.ads;

import defpackage.DP;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class zzaer implements zzagh {
    private final byte[] zza = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzagh
    public final /* synthetic */ void zzN(long j) {
        DP.a(this, j);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final /* synthetic */ int zza(zzj zzjVar, int i, boolean z) {
        return DP.b(this, zzjVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int zzb(zzj zzjVar, int i, boolean z, int i2) throws EOFException {
        int iZza = zzjVar.zza(this.zza, 0, Math.min(4096, i));
        if (iZza != -1) {
            return iZza;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final /* synthetic */ void zzc(zzer zzerVar, int i) {
        DP.c(this, zzerVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzd(zzer zzerVar, int i, int i2) {
        zzerVar.zzk(i);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zze(long j, int i, int i2, int i3, zzagg zzaggVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzz(zzv zzvVar) {
    }
}
