package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class zzaaq {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzaar zzaarVar) {
        zzb(zzaarVar);
        this.zza.add(new zzaap(handler, zzaarVar));
    }

    public final void zzb(zzaar zzaarVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.zza;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            zzaap zzaapVar = (zzaap) it.next();
            if (zzaapVar.zzc() == zzaarVar) {
                zzaapVar.zza();
                copyOnWriteArrayList.remove(zzaapVar);
            }
        }
    }

    public final void zzc(final int i, final long j, final long j2) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            final zzaap zzaapVar = (zzaap) it.next();
            if (!zzaapVar.zzd()) {
                zzaapVar.zzb().post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaao
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzaapVar.zzc().zzX(i, j, j2);
                    }
                });
            }
        }
    }
}
