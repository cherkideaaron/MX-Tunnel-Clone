package com.google.android.gms.internal.measurement;

import defpackage.JH;
import defpackage.NH;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* loaded from: classes2.dex */
public final class zzrq implements JH {
    private static final zzrq zza = new zzrq();
    private final JH zzb = new NH(new zzrs());

    @SideEffectFree
    public static boolean zza() {
        return zza.get().zza();
    }

    @Override // defpackage.JH
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzrr get() {
        return (zzrr) this.zzb.get();
    }
}
