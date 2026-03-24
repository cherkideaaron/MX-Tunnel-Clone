package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzgcn implements zzgcl {
    private final Executor zza;
    private final Queue zzb = new PriorityQueue();

    public zzgcn(Executor executor, zzgao zzgaoVar) {
        this.zza = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzgcl
    public final void zza(Runnable runnable, long j) {
        if (j <= 0) {
            this.zza.execute(runnable);
            return;
        }
        zzgcp zzgcpVar = new zzgcp(runnable, System.currentTimeMillis() + j);
        Queue queue = this.zzb;
        synchronized (queue) {
            queue.add(zzgcpVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcl
    public final void zzb() {
        Queue queue = this.zzb;
        synchronized (queue) {
            try {
                if (queue.isEmpty()) {
                    return;
                }
                PriorityQueue priorityQueue = new PriorityQueue();
                long jCurrentTimeMillis = System.currentTimeMillis();
                Object objPeek = queue.peek();
                while (true) {
                    zzgcp zzgcpVar = (zzgcp) objPeek;
                    if (zzgcpVar == null || zzgcpVar.zzb > jCurrentTimeMillis) {
                        break;
                    }
                    priorityQueue.add(zzgcpVar);
                    objPeek = queue.peek();
                }
                Iterator it = priorityQueue.iterator();
                while (it.hasNext()) {
                    try {
                        this.zza.execute(((zzgcp) it.next()).zza);
                    } catch (RuntimeException unused) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
