package com.google.android.gms.internal.ads;

import defpackage.As;
import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes.dex */
public final class zzfkj {
    private final Deque zza = new LinkedBlockingDeque();
    private final Callable zzb;
    private final zzgzy zzc;

    public zzfkj(Callable callable, zzgzy zzgzyVar) {
        this.zzb = callable;
        this.zzc = zzgzyVar;
    }

    public final synchronized void zza(int i) {
        Deque deque = this.zza;
        int size = i - deque.size();
        for (int i2 = 0; i2 < size; i2++) {
            deque.add(this.zzc.zzc(this.zzb));
        }
    }

    public final synchronized As zzb() {
        zza(1);
        return (As) this.zza.poll();
    }

    public final synchronized void zzc(As as) {
        this.zza.addFirst(as);
    }
}
