package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzbbq extends zzbby {
    private final StackTraceElement[] zzh;

    public zzbbq(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(zzbakVar, "TnO68f+IpvRRkyv0ANYwkK+/mU2YJddrRcZ9TNokdmi5eEzcRJBPehtgPhuxRZAE", "PILFsXLzYdqBxxfwB9b+jT5mnzLC4LU5UXMk7tC1zw8=", zzawgVar, i, 45);
        this.zzh = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzbby
    public final void zza() {
        StackTraceElement[] stackTraceElementArr = this.zzh;
        if (stackTraceElementArr != null) {
            zzbab zzbabVar = new zzbab((String) this.zze.invoke(null, stackTraceElementArr));
            zzawg zzawgVar = this.zzd;
            synchronized (zzawgVar) {
                try {
                    zzawgVar.zzC(zzbabVar.zza.longValue());
                    if (zzbabVar.zzb.booleanValue()) {
                        zzawgVar.zzag(true != zzbabVar.zzc.booleanValue() ? 2 : 1);
                    } else {
                        zzawgVar.zzag(3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
