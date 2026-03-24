package com.google.android.recaptcha.internal;

import defpackage.AbstractC3547vc;
import defpackage.EnumC0321Sc;
import defpackage.IC;
import defpackage.InterfaceC3493uc;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
final class zzi extends AbstractC3547vc {
    /* synthetic */ Object zza;
    final /* synthetic */ zzl zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzi(zzl zzlVar, InterfaceC3493uc interfaceC3493uc) {
        super(interfaceC3493uc);
        this.zzb = zzlVar;
    }

    @Override // defpackage.AbstractC2543d7
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objZzc = this.zzb.zzc(0L, null, null, this);
        return objZzc == EnumC0321Sc.a ? objZzc : new IC(objZzc);
    }
}
