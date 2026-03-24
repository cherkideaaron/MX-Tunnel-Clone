package com.google.android.recaptcha.internal;

import defpackage.AbstractC3547vc;
import defpackage.InterfaceC3493uc;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
final class zzbp extends AbstractC3547vc {
    Object zza;
    Object zzb;
    long zzc;
    long zzd;
    double zze;
    /* synthetic */ Object zzf;
    final /* synthetic */ zzbq zzg;
    int zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbp(zzbq zzbqVar, InterfaceC3493uc interfaceC3493uc) {
        super(interfaceC3493uc);
        this.zzg = zzbqVar;
    }

    @Override // defpackage.AbstractC2543d7
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.zzf = obj;
        this.zzh |= Integer.MIN_VALUE;
        return this.zzg.zza(null, 0L, 0L, 0.0d, null, this);
    }
}
