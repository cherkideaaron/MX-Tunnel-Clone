package com.google.android.gms.internal.measurement;

import defpackage.JH;
import defpackage.NH;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* loaded from: classes2.dex */
public final class zzpf implements JH {
    private static final zzpf zza = new zzpf();
    private final JH zzb = new NH(new zzph());

    @SideEffectFree
    public static long zza() {
        return zza.get().zza();
    }

    @Override // defpackage.JH
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzpg get() {
        return (zzpg) this.zzb.get();
    }
}
