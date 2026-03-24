package com.google.android.gms.internal.measurement;

import defpackage.JH;
import defpackage.NH;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* loaded from: classes2.dex */
public final class zzqd implements JH {
    private static final zzqd zza = new zzqd();
    private final JH zzb = new NH(new zzqf());

    @SideEffectFree
    public static boolean zza() {
        return zza.get().zza();
    }

    @Override // defpackage.JH
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzqe get() {
        return (zzqe) this.zzb.get();
    }
}
