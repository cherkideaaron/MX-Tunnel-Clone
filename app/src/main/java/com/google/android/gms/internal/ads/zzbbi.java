package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzbbi extends zzbby {
    private final zzbac zzh;

    public zzbbi(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i, int i2, zzbac zzbacVar) {
        super(zzbakVar, "mt+WJZ1rsk0A64GmF9v+ldp/SXHcK6tYIctDM1+NeYG+QzoGvdHV21P9oFWIcCVk", "JGpzBcqG4jzyQyzoEbT5NvLNZXRWAW3o2QUKET83n6Q=", zzawgVar, i, 94);
        this.zzh = zzbacVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbby
    public final void zza() {
        int iIntValue = ((Integer) this.zze.invoke(null, this.zzh.zzb())).intValue();
        zzawg zzawgVar = this.zzd;
        synchronized (zzawgVar) {
            zzawgVar.zzaj(zzawu.zza(iIntValue));
        }
    }
}
