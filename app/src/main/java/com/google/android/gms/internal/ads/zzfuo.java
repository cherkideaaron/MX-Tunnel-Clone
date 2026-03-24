package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzfuo implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        if (zzfur.zzc != null) {
            zzfur.zzc.post(zzfur.zzk);
            zzfur.zzc.postDelayed(zzfur.zzl, 200L);
        }
    }
}
