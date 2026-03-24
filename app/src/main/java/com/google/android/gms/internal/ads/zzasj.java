package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class zzasj {
    public static final boolean zza = zzask.zzb;
    private final List zzb = new ArrayList();
    private boolean zzc = false;

    public final void finalize() {
        if (this.zzc) {
            return;
        }
        zzb("Request on the loose");
        zzask.zzc("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }

    public final synchronized void zza(String str, long j) {
        if (this.zzc) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.zzb.add(new zzasi(str, j, SystemClock.elapsedRealtime()));
    }

    public final synchronized void zzb(String str) {
        this.zzc = true;
        List<zzasi> list = this.zzb;
        long j = list.size() == 0 ? 0L : ((zzasi) list.get(list.size() - 1)).zzc - ((zzasi) list.get(0)).zzc;
        if (j > 0) {
            long j2 = ((zzasi) list.get(0)).zzc;
            zzask.zzb("(%-4d ms) %s", Long.valueOf(j), str);
            for (zzasi zzasiVar : list) {
                long j3 = zzasiVar.zzc;
                zzask.zzb("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(zzasiVar.zzb), zzasiVar.zza);
                j2 = j3;
            }
        }
    }
}
