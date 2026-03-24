package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzagu implements zzagq {
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzagu(int i, int i2, int i3, int i4) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    public static zzagu zzb(zzer zzerVar) {
        int iZzC = zzerVar.zzC();
        zzerVar.zzk(8);
        int iZzC2 = zzerVar.zzC();
        int iZzC3 = zzerVar.zzC();
        zzerVar.zzk(4);
        int iZzC4 = zzerVar.zzC();
        zzerVar.zzk(12);
        return new zzagu(iZzC, iZzC2, iZzC3, iZzC4);
    }

    @Override // com.google.android.gms.internal.ads.zzagq
    public final int zza() {
        return 1751742049;
    }
}
