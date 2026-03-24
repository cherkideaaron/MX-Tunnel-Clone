package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzbbb extends zzbby {
    private final long zzh;

    public zzbbb(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, long j, int i, int i2) {
        super(zzbakVar, "KS95o7MbZWIdKuBkGY5EucArwEmarpDzvrPJlr4r6NTEwXHZ52g0Gof8SUaYNmWh", "sZhcPfATNezp7ZcisFX7I2sqsKQPBRrUcm6y3tpw6ig=", zzawgVar, i, 25);
        this.zzh = j;
    }

    @Override // com.google.android.gms.internal.ads.zzbby
    public final void zza() {
        long jLongValue = ((Long) this.zze.invoke(null, null)).longValue();
        zzawg zzawgVar = this.zzd;
        synchronized (zzawgVar) {
            try {
                zzawgVar.zzac(jLongValue);
                long j = this.zzh;
                if (j != 0) {
                    zzawgVar.zzk(jLongValue - j);
                    zzawgVar.zzn(j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
