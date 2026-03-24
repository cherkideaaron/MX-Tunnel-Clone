package com.google.android.recaptcha.internal;

import defpackage.AbstractC0115Ga;
import defpackage.C0108Fk;
import defpackage.DK;
import defpackage.EnumC0321Sc;
import defpackage.InterfaceC0029Aq;
import defpackage.InterfaceC0304Rc;
import defpackage.InterfaceC3396sn;
import defpackage.InterfaceC3493uc;
import defpackage.PB;
import defpackage.WH;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class zzfr extends WH implements InterfaceC3396sn {
    final /* synthetic */ Exception zza;
    final /* synthetic */ zzgd zzb;
    final /* synthetic */ zzft zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfr(Exception exc, zzgd zzgdVar, zzft zzftVar, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.zza = exc;
        this.zzb = zzgdVar;
        this.zzc = zzftVar;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        zzfr zzfrVar = new zzfr(this.zza, this.zzb, this.zzc, interfaceC3493uc);
        zzfrVar.zzd = obj;
        return zzfrVar;
    }

    @Override // defpackage.InterfaceC3396sn
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfr) create((InterfaceC0304Rc) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        zztd zztdVarZza;
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        AbstractC0115Ga.U(obj);
        InterfaceC0304Rc interfaceC0304Rc = (InterfaceC0304Rc) this.zzd;
        Exception exc = this.zza;
        if (exc instanceof zzce) {
            zztdVarZza = ((zzce) exc).zza();
            zztdVarZza.zze(this.zzb.zza());
        } else {
            zzgd zzgdVar = this.zzb;
            zztd zztdVarZzf = zzte.zzf();
            zztdVarZzf.zze(zzgdVar.zza());
            zztdVarZzf.zzr(2);
            zztdVarZzf.zzq(2);
            zztdVarZza = zztdVarZzf;
        }
        zzte zzteVar = (zzte) zztdVarZza.zzk();
        zzteVar.zzl();
        zzteVar.zzk();
        PB.a(this.zza.getClass()).b();
        this.zza.getMessage();
        zzgd zzgdVar2 = this.zzb;
        zzbn zzbnVarZzb = zzgdVar2.zzb();
        zzbn zzbnVar = zzgdVar2.zza;
        if (zzbnVar == null) {
            zzbnVar = null;
        }
        zzrl zzrlVarZza = zzev.zza(zzbnVarZzb, zzbnVar);
        String strZzd = this.zzb.zzd();
        if (strZzd.length() == 0) {
            strZzd = "recaptcha.m.Main.rge";
        }
        InterfaceC0029Aq interfaceC0029Aq = (InterfaceC0029Aq) interfaceC0304Rc.g().get(C0108Fk.e);
        if (interfaceC0029Aq != null ? interfaceC0029Aq.isActive() : true) {
            zzft zzftVar = this.zzc;
            zzkh zzkhVarZzh = zzkh.zzh();
            byte[] bArrZzd = zzteVar.zzd();
            String strZzi = zzkhVarZzh.zzi(bArrZzd, 0, bArrZzd.length);
            zzkh zzkhVarZzh2 = zzkh.zzh();
            byte[] bArrZzd2 = zzrlVarZza.zzd();
            zzftVar.zzb.zzd().zzb(strZzd, (String[]) Arrays.copyOf(new String[]{strZzi, zzkhVarZzh2.zzi(bArrZzd2, 0, bArrZzd2.length)}, 2));
        }
        return DK.a;
    }
}
