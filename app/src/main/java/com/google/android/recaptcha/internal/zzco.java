package com.google.android.recaptcha.internal;

import android.app.Application;
import defpackage.AbstractC0115Ga;
import defpackage.DK;
import defpackage.EnumC0321Sc;
import defpackage.InterfaceC0304Rc;
import defpackage.InterfaceC3396sn;
import defpackage.InterfaceC3493uc;
import defpackage.WH;

/* loaded from: classes2.dex */
final class zzco extends WH implements InterfaceC3396sn {
    int zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzco(Application application, String str, long j, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.zzb = application;
        this.zzc = str;
        this.zzd = j;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        return new zzco(this.zzb, this.zzc, this.zzd, interfaceC3493uc);
    }

    @Override // defpackage.InterfaceC3396sn
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzco) create((InterfaceC0304Rc) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        int i = this.zza;
        AbstractC0115Ga.U(obj);
        if (i == 0) {
            Application application = this.zzb;
            String str = this.zzc;
            long j = this.zzd;
            this.zza = 1;
            obj = zzcq.zzb(application, str, j, this);
            if (obj == enumC0321Sc) {
                return enumC0321Sc;
            }
        }
        return obj;
    }
}
