package com.google.android.gms.internal.measurement;

import defpackage.JH;
import defpackage.NH;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* loaded from: classes2.dex */
public final class zzpr implements JH {
    private static final zzpr zza = new zzpr();
    private final JH zzb = new NH(new zzpt());

    @SideEffectFree
    public static boolean zza() {
        zza.get().zza();
        return true;
    }

    @SideEffectFree
    public static boolean zzb() {
        return zza.get().zzb();
    }

    @SideEffectFree
    public static boolean zzc() {
        return zza.get().zzc();
    }

    @Override // defpackage.JH
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzps get() {
        return (zzps) this.zzb.get();
    }
}
