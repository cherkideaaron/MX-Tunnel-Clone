package com.google.android.gms.internal.measurement;

import defpackage.JH;
import defpackage.NH;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* loaded from: classes2.dex */
public final class zzow implements JH {
    private static final zzow zza = new zzow();
    private final JH zzb = new NH(new zzoy());

    @SideEffectFree
    public static boolean zza() {
        return zza.get().zza();
    }

    @Override // defpackage.JH
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzox get() {
        return (zzox) this.zzb.get();
    }
}
