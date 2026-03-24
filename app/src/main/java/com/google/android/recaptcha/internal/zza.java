package com.google.android.recaptcha.internal;

import defpackage.AbstractC3547vc;
import defpackage.EnumC0321Sc;
import defpackage.IC;
import defpackage.InterfaceC3493uc;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
final class zza extends AbstractC3547vc {
    Object zza;
    long zzb;
    /* synthetic */ Object zzc;
    final /* synthetic */ zze zzd;
    int zze;
    String zzf;
    zzen zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(zze zzeVar, InterfaceC3493uc interfaceC3493uc) {
        super(interfaceC3493uc);
        this.zzd = zzeVar;
    }

    @Override // defpackage.AbstractC2543d7
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.zzc = obj;
        this.zze |= Integer.MIN_VALUE;
        Object objZzc = this.zzd.zzc(null, 0L, this);
        return objZzc == EnumC0321Sc.a ? objZzc : new IC(objZzc);
    }
}
