package com.google.android.gms.internal.measurement;

import defpackage.JH;
import defpackage.NH;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* loaded from: classes2.dex */
public final class zzrh implements JH {
    private static final zzrh zza = new zzrh();
    private final JH zzb = new NH(new zzrj());

    @SideEffectFree
    public static boolean zza() {
        return zza.get().zza();
    }

    @Override // defpackage.JH
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzri get() {
        return (zzri) this.zzb.get();
    }
}
