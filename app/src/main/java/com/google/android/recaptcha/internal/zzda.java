package com.google.android.recaptcha.internal;

import android.content.pm.PackageManager;
import com.google.android.recaptcha.RecaptchaAction;
import defpackage.AbstractC0115Ga;
import defpackage.DK;
import defpackage.EnumC0321Sc;
import defpackage.IC;
import defpackage.InterfaceC0304Rc;
import defpackage.InterfaceC3396sn;
import defpackage.InterfaceC3493uc;
import defpackage.WH;
import java.util.MissingResourceException;

/* loaded from: classes2.dex */
final class zzda extends WH implements InterfaceC3396sn {
    int zza;
    final /* synthetic */ zzdc zzb;
    final /* synthetic */ RecaptchaAction zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzda(zzdc zzdcVar, RecaptchaAction recaptchaAction, long j, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.zzb = zzdcVar;
        this.zzc = recaptchaAction;
        this.zzd = j;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        return new zzda(this.zzb, this.zzc, this.zzd, interfaceC3493uc);
    }

    @Override // defpackage.InterfaceC3396sn
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzda) create((InterfaceC0304Rc) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) throws PackageManager.NameNotFoundException, MissingResourceException {
        Object objZzf;
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        if (this.zza != 0) {
            AbstractC0115Ga.U(obj);
            objZzf = ((IC) obj).a;
        } else {
            AbstractC0115Ga.U(obj);
            zzdc zzdcVar = this.zzb;
            RecaptchaAction recaptchaAction = this.zzc;
            long j = this.zzd;
            this.zza = 1;
            objZzf = zzdcVar.zzf(recaptchaAction, j, this);
            if (objZzf == enumC0321Sc) {
                return enumC0321Sc;
            }
        }
        AbstractC0115Ga.U(objZzf);
        return objZzf;
    }
}
