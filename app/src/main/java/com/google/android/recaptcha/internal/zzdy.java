package com.google.android.recaptcha.internal;

import defpackage.AbstractC0115Ga;
import defpackage.AbstractC2883jK;
import defpackage.DK;
import defpackage.EnumC0321Sc;
import defpackage.InterfaceC2631en;
import defpackage.InterfaceC3493uc;
import defpackage.WH;

/* loaded from: classes2.dex */
final class zzdy extends WH implements InterfaceC2631en {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzec zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdy(long j, zzec zzecVar, InterfaceC3493uc interfaceC3493uc) {
        super(1, interfaceC3493uc);
        this.zzb = j;
        this.zzc = zzecVar;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(InterfaceC3493uc interfaceC3493uc) {
        return new zzdy(this.zzb, this.zzc, interfaceC3493uc);
    }

    @Override // defpackage.InterfaceC2631en
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzdy) create((InterfaceC3493uc) obj)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        int i = this.zza;
        AbstractC0115Ga.U(obj);
        if (i == 0) {
            long j = this.zzb;
            zzdx zzdxVar = new zzdx(this.zzc, null);
            this.zza = 1;
            if (AbstractC2883jK.T(j, zzdxVar, this) == enumC0321Sc) {
                return enumC0321Sc;
            }
        }
        return DK.a;
    }
}
