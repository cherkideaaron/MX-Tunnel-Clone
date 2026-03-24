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
final class zzeb extends WH implements InterfaceC3396sn {
    int zza;
    final /* synthetic */ zzec zzb;
    final /* synthetic */ InterfaceC0149Ia zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeb(zzec zzecVar, InterfaceC0149Ia interfaceC0149Ia, long j, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.zzb = zzecVar;
        this.zzc = interfaceC0149Ia;
        this.zzd = j;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        return new zzeb(this.zzb, this.zzc, this.zzd, interfaceC3493uc);
    }

    @Override // defpackage.InterfaceC3396sn
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzeb) create((InterfaceC0304Rc) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) throws Exception {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        try {
            if (this.zza != 0) {
                AbstractC0115Ga.U(obj);
            } else {
                AbstractC0115Ga.U(obj);
                zzbq zzbqVar = zzbq.zza;
                zzdz zzdzVar = new zzdz(this.zzb);
                zzea zzeaVar = new zzea(this.zzb, this.zzd, this.zzc, null);
                this.zza = 1;
                obj = zzbqVar.zza(zzdzVar, 100L, 1000L, 2.0d, zzeaVar, this);
                if (obj == enumC0321Sc) {
                    return enumC0321Sc;
                }
            }
            ((Boolean) obj).getClass();
        } catch (zzbd e) {
            this.zzb.zzf = zzcm.zzd;
            ((C0166Ja) this.zzc).S(e);
        }
        return DK.a;
    }
}
