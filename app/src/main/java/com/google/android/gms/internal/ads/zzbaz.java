package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzbaz extends zzbby {
    public zzbaz(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i, int i2) {
        super(zzbakVar, "1zgOnWB50YTfrYi7hohk1+6dBIPxt34hX6y8yjUFyxGuxbHgbh6iUx1TaFIrLKll", "2AwwIe7av6W3pdyOMr9aVntj24MOb2beINimmdYpluE=", zzawgVar, i, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzbby
    public final void zza() {
        zzawg zzawgVar = this.zzd;
        zzawgVar.zzd(-1L);
        zzawgVar.zze(-1L);
        int[] iArr = (int[]) this.zze.invoke(null, this.zza.zzb());
        synchronized (zzawgVar) {
            try {
                zzawgVar.zzd(iArr[0]);
                zzawgVar.zze(iArr[1]);
                int i = iArr[2];
                if (i != Integer.MIN_VALUE) {
                    zzawgVar.zzO(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
