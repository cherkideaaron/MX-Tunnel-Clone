package com.google.android.recaptcha.internal;

import defpackage.AbstractC0115Ga;
import defpackage.C0166Ja;
import defpackage.DK;
import defpackage.EnumC0321Sc;
import defpackage.InterfaceC0149Ia;
import defpackage.InterfaceC0304Rc;
import defpackage.InterfaceC3396sn;
import defpackage.InterfaceC3493uc;
import defpackage.WH;

/* loaded from: classes2.dex */
final class zzdx extends WH implements InterfaceC3396sn {
    int zza;
    final /* synthetic */ zzec zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdx(zzec zzecVar, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.zzb = zzecVar;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        return new zzdx(this.zzb, interfaceC3493uc);
    }

    @Override // defpackage.InterfaceC3396sn
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdx) create((InterfaceC0304Rc) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        int i = this.zza;
        AbstractC0115Ga.U(obj);
        if (i == 0) {
            InterfaceC0149Ia interfaceC0149Ia = this.zzb.zzc;
            this.zza = 1;
            if (((C0166Ja) interfaceC0149Ia).l(this) == enumC0321Sc) {
                return enumC0321Sc;
            }
        }
        return DK.a;
    }
}
