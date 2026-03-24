package com.google.android.recaptcha.internal;

import defpackage.AbstractC0115Ga;
import defpackage.AbstractC3279qd;
import defpackage.AbstractC3383sa;
import defpackage.C0108Fk;
import defpackage.DK;
import defpackage.EnumC0321Sc;
import defpackage.InterfaceC0029Aq;
import defpackage.InterfaceC0304Rc;
import defpackage.InterfaceC3396sn;
import defpackage.InterfaceC3493uc;
import defpackage.WH;
import java.util.List;

/* loaded from: classes2.dex */
final class zzfq extends WH implements InterfaceC3396sn {
    int zza;
    final /* synthetic */ zzgd zzb;
    final /* synthetic */ List zzc;
    final /* synthetic */ zzft zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfq(zzgd zzgdVar, List list, zzft zzftVar, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.zzb = zzgdVar;
        this.zzc = list;
        this.zzd = zzftVar;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        zzfq zzfqVar = new zzfq(this.zzb, this.zzc, this.zzd, interfaceC3493uc);
        zzfqVar.zze = obj;
        return zzfqVar;
    }

    @Override // defpackage.InterfaceC3396sn
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfq) create((InterfaceC0304Rc) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        int i = this.zza;
        DK dk = DK.a;
        AbstractC0115Ga.U(obj);
        if (i == 0) {
            InterfaceC0304Rc interfaceC0304Rc = (InterfaceC0304Rc) this.zze;
            while (true) {
                zzgd zzgdVar = this.zzb;
                if (zzgdVar.zza() < 0) {
                    break;
                }
                if (zzgdVar.zza() < this.zzc.size()) {
                    InterfaceC0029Aq interfaceC0029Aq = (InterfaceC0029Aq) interfaceC0304Rc.g().get(C0108Fk.e);
                    if (!(interfaceC0029Aq != null ? interfaceC0029Aq.isActive() : true)) {
                        break;
                    }
                    zzuf zzufVar = (zzuf) this.zzc.get(this.zzb.zza());
                    try {
                        zzft.zzf(this.zzd, zzufVar, this.zzb);
                    } catch (Exception e) {
                        zzufVar.zzk();
                        AbstractC3279qd.c(zzufVar.zzg());
                        AbstractC3383sa.c0(zzufVar.zzj(), null, null, null, new zzfp(this.zzd), 31);
                        zzft zzftVar = this.zzd;
                        zzgd zzgdVar2 = this.zzb;
                        this.zza = 1;
                        if (zzftVar.zzh(e, zzgdVar2, this) == enumC0321Sc) {
                            return enumC0321Sc;
                        }
                    }
                } else {
                    break;
                }
            }
        }
        return dk;
    }
}
