package com.google.android.recaptcha.internal;

import defpackage.AbstractC3547vc;
import defpackage.InterfaceC3493uc;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
final class zzdj extends AbstractC3547vc {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzdt zzc;
    int zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdj(zzdt zzdtVar, InterfaceC3493uc interfaceC3493uc) {
        super(interfaceC3493uc);
        this.zzc = zzdtVar;
    }

    @Override // defpackage.AbstractC2543d7
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zzv(null, 0L, this);
    }
}
