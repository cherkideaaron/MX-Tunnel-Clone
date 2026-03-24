package com.google.android.gms.internal.measurement;

import defpackage.JH;
import defpackage.NH;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* loaded from: classes2.dex */
public final class zzpi implements JH {
    private static final zzpi zza = new zzpi();
    private final JH zzb = new NH(new zzpk());

    @SideEffectFree
    public static boolean zza() {
        return zza.get().zza();
    }

    @SideEffectFree
    public static boolean zzb() {
        return zza.get().zzb();
    }

    @Override // defpackage.JH
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzpj get() {
        return (zzpj) this.zzb.get();
    }
}
