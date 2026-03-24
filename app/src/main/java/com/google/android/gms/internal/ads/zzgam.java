package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzgam extends zzgak {
    private static zzgam zzd;

    private zzgam(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final zzgam zzh(Context context) {
        zzgam zzgamVar;
        synchronized (zzgam.class) {
            try {
                if (zzd == null) {
                    zzd = new zzgam(context);
                }
                zzgamVar = zzd;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzgamVar;
    }

    public final zzgah zzi(long j, boolean z) {
        synchronized (zzgam.class) {
            try {
                if (this.zzc.zzc()) {
                    return zza(null, null, j, z);
                }
                return new zzgah();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzj() {
        synchronized (zzgam.class) {
            try {
                if (zzg(false)) {
                    zzc(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
