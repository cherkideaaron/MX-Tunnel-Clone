package com.google.android.recaptcha;

import defpackage.AbstractC3547vc;
import defpackage.EnumC0321Sc;
import defpackage.IC;
import defpackage.InterfaceC3493uc;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class Recaptcha$getClient$1 extends AbstractC3547vc {
    /* synthetic */ Object zza;
    final /* synthetic */ Recaptcha zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recaptcha$getClient$1(Recaptcha recaptcha, InterfaceC3493uc interfaceC3493uc) {
        super(interfaceC3493uc);
        this.zzb = recaptcha;
    }

    @Override // defpackage.AbstractC2543d7
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objM2getClientBWLJW6A = this.zzb.m2getClientBWLJW6A(null, null, 0L, this);
        return objM2getClientBWLJW6A == EnumC0321Sc.a ? objM2getClientBWLJW6A : new IC(objM2getClientBWLJW6A);
    }
}
