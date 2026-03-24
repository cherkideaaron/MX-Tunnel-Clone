package com.google.android.recaptcha.internal;

import defpackage.AbstractC0115Ga;
import defpackage.DK;
import defpackage.EnumC0321Sc;
import defpackage.InterfaceC0304Rc;
import defpackage.InterfaceC3396sn;
import defpackage.InterfaceC3493uc;
import defpackage.WH;

/* loaded from: classes2.dex */
final class zzfb extends WH implements InterfaceC3396sn {
    final /* synthetic */ zzff zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzto zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfb(zzff zzffVar, String str, zzto zztoVar, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.zza = zzffVar;
        this.zzb = str;
        this.zzc = zztoVar;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        return new zzfb(this.zza, this.zzb, this.zzc, interfaceC3493uc);
    }

    @Override // defpackage.InterfaceC3396sn
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfb) create((InterfaceC0304Rc) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) throws zzbd {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        AbstractC0115Ga.U(obj);
        try {
            if (zzff.zzb(this.zza).zzb(this.zzb)) {
                return this.zza.zzg().zza(this.zzb, this.zzc);
            }
            throw new zzbd(zzbb.zzc, zzba.zzQ, null);
        } catch (zzbd e) {
            throw e;
        } catch (Exception e2) {
            throw new zzbd(zzbb.zzb, zzba.zzaw, e2.getMessage());
        }
    }
}
