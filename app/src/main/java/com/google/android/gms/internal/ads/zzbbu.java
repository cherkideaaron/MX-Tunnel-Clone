package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzbbu extends zzbby {
    public zzbbu(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i, int i2) {
        super(zzbakVar, "WAcniJw/GaiqIp9OLpCOBQZL84JUYDjTztoPXXS1J2Z88XAmBTXkRw892qBHqVl7", "XsRFkPGR/9DtQdRlTgBn2CYNiaiyrwSr5Bve6m5X61U=", zzawgVar, i, 48);
    }

    @Override // com.google.android.gms.internal.ads.zzbby
    public final void zza() {
        zzawg zzawgVar = this.zzd;
        zzawgVar.zzae(3);
        boolean zBooleanValue = ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue();
        synchronized (zzawgVar) {
            try {
                if (zBooleanValue) {
                    zzawgVar.zzae(2);
                } else {
                    zzawgVar.zzae(1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
