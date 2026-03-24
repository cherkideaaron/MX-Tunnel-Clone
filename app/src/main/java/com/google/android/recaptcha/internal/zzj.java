package com.google.android.recaptcha.internal;

import defpackage.AbstractC0115Ga;
import defpackage.DK;
import defpackage.EnumC0321Sc;
import defpackage.IC;
import defpackage.InterfaceC0304Rc;
import defpackage.InterfaceC3396sn;
import defpackage.InterfaceC3493uc;
import defpackage.WH;

/* loaded from: classes2.dex */
final class zzj extends WH implements InterfaceC3396sn {
    int zza;
    final /* synthetic */ zze zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzsc zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzj(zze zzeVar, long j, zzsc zzscVar, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.zzb = zzeVar;
        this.zzc = j;
        this.zzd = zzscVar;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        return new zzj(this.zzb, this.zzc, this.zzd, interfaceC3493uc);
    }

    @Override // defpackage.InterfaceC3396sn
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzj) create((InterfaceC0304Rc) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objZze;
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        if (this.zza != 0) {
            AbstractC0115Ga.U(obj);
            objZze = ((IC) obj).a;
        } else {
            AbstractC0115Ga.U(obj);
            zze zzeVar = this.zzb;
            long j = this.zzc;
            zzsc zzscVar = this.zzd;
            this.zza = 1;
            objZze = zzeVar.zze(j, zzscVar, this);
            if (objZze == enumC0321Sc) {
                return enumC0321Sc;
            }
        }
        return new IC(objZze);
    }
}
