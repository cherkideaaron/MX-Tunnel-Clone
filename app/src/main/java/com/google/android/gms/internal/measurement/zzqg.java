package com.google.android.gms.internal.measurement;

import defpackage.JH;
import defpackage.NH;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* loaded from: classes2.dex */
public final class zzqg implements JH {
    private static final zzqg zza = new zzqg();
    private final JH zzb = new NH(new zzqi());

    @SideEffectFree
    public static boolean zza() {
        return zza.get().zza();
    }

    @Override // defpackage.JH
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzqh get() {
        return (zzqh) this.zzb.get();
    }
}
