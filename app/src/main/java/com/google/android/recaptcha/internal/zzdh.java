package com.google.android.recaptcha.internal;

import android.os.Build;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import defpackage.AbstractC0115Ga;
import defpackage.DK;
import defpackage.EnumC0321Sc;
import defpackage.InterfaceC0304Rc;
import defpackage.InterfaceC3396sn;
import defpackage.InterfaceC3493uc;
import defpackage.WH;

/* loaded from: classes2.dex */
final class zzdh extends WH implements InterfaceC3396sn {
    int zza;
    final /* synthetic */ zzdt zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdh(zzdt zzdtVar, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.zzb = zzdtVar;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        return new zzdh(this.zzb, interfaceC3493uc);
    }

    @Override // defpackage.InterfaceC3396sn
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdh) create((InterfaceC0304Rc) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        int i = this.zza;
        AbstractC0115Ga.U(obj);
        if (i == 0) {
            int iZza = new zzbs(GoogleApiAvailabilityLight.getInstance()).zza(this.zzb.zzr());
            zzdt zzdtVar = this.zzb;
            String str = zzdtVar.zza;
            String packageName = zzdtVar.zzr().getPackageName();
            String strZzd = this.zzb.zzb.zzd();
            zzbf zzbfVarZzt = this.zzb.zzt();
            int i2 = Build.VERSION.SDK_INT;
            String strZza = zzbfVarZzt.zza();
            zztn zztnVarZzf = zzto.zzf();
            zztnVarZzf.zzt(str);
            zztnVarZzf.zzq(packageName);
            zztnVarZzf.zzu(iZza);
            zztnVarZzf.zzr("18.6.1");
            zztnVarZzf.zzs(strZzd);
            zztnVarZzf.zzf(String.valueOf(i2));
            zztnVarZzf.zze(strZza);
            zzto zztoVar = (zzto) zztnVarZzf.zzk();
            zzdt zzdtVar2 = this.zzb;
            zzff zzffVarZzg = zzdt.zzg(zzdtVar2);
            String strZzb = zzdt.zzd(zzdtVar2).zzb();
            this.zza = 1;
            obj = zzffVarZzg.zzc(strZzb, zztoVar, this);
            if (obj == enumC0321Sc) {
                return enumC0321Sc;
            }
        }
        return obj;
    }
}
