package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzbbp extends zzbby {
    private final boolean zzh;

    public zzbbp(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i, int i2) {
        super(zzbakVar, "bor0O3H3y0qG5UIppgg8bI1z9WuHvZ9oSRl8MpYl5RU5HMZyWKOlyAU+eSAgxME2", "IUDkN9+rDzK4GSONwoR6w/25ruQD7QnRgetY7oPkg7w=", zzawgVar, i, 61);
        this.zzh = zzbakVar.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbby
    public final void zza() {
        long jLongValue = ((Long) this.zze.invoke(null, this.zza.zzb(), Boolean.valueOf(this.zzh))).longValue();
        zzawg zzawgVar = this.zzd;
        synchronized (zzawgVar) {
            zzawgVar.zzQ(jLongValue);
        }
    }
}
