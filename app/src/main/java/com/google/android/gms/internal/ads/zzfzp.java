package com.google.android.gms.internal.ads;

import defpackage.AbstractC3547vc;
import defpackage.InterfaceC3493uc;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
final class zzfzp extends AbstractC3547vc {
    Object zza;
    long zzb;
    /* synthetic */ Object zzc;
    final /* synthetic */ zzgaf zzd;
    int zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfzp(zzgaf zzgafVar, InterfaceC3493uc interfaceC3493uc) {
        super(interfaceC3493uc);
        this.zzd = zzgafVar;
    }

    @Override // defpackage.AbstractC2543d7
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.zzc = obj;
        this.zze |= Integer.MIN_VALUE;
        return this.zzd.zzj(this);
    }
}
