package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzbbg extends zzbby {
    private static volatile Long zzh;
    private static final Object zzi = new Object();

    public zzbbg(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i, int i2) {
        super(zzbakVar, "iVzH00FGTIijHIZ0HS5SItMsN9AyuHOn1xXwzbhHf6Eq/l9FiFSlfrw2j7G806j4", "RyZVSwEZZgeTR1V/DRrjgM5Yqk49vWkiFPpVljbz9Uo=", zzawgVar, i, 22);
    }

    @Override // com.google.android.gms.internal.ads.zzbby
    public final void zza() {
        if (zzh == null) {
            synchronized (zzi) {
                try {
                    if (zzh == null) {
                        zzh = (Long) this.zze.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        zzawg zzawgVar = this.zzd;
        synchronized (zzawgVar) {
            zzawgVar.zzm(zzh.longValue());
        }
    }
}
