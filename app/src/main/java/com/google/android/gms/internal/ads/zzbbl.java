package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzbbl extends zzbby {
    private static volatile String zzh;
    private static final Object zzi = new Object();

    public zzbbl(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i, int i2) {
        super(zzbakVar, "yZXKjkpxohkfNrA4/dntjy5UGv8pEqMsOsdSv+5n+sZgEYNlImB4QjlGv7rNs0BZ", "qPvuYJ0m6OwVM7zFkNMQ820WzknyvHgBl013Si7b8nM=", zzawgVar, i, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzbby
    public final void zza() {
        this.zzd.zza("E");
        if (zzh == null) {
            synchronized (zzi) {
                try {
                    if (zzh == null) {
                        zzh = (String) this.zze.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        zzawg zzawgVar = this.zzd;
        synchronized (zzawgVar) {
            zzawgVar.zza(zzh);
        }
    }
}
