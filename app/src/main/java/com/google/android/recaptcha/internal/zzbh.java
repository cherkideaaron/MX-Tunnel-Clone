package com.google.android.recaptcha.internal;

import defpackage.AbstractC0115Ga;
import defpackage.DK;
import defpackage.EnumC0321Sc;
import defpackage.InterfaceC0304Rc;
import defpackage.InterfaceC3396sn;
import defpackage.InterfaceC3493uc;
import defpackage.WH;

/* loaded from: classes2.dex */
final class zzbh extends WH implements InterfaceC3396sn {
    public zzbh(InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        return new zzbh(interfaceC3493uc);
    }

    @Override // defpackage.InterfaceC3396sn
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbh) create((InterfaceC0304Rc) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        AbstractC0115Ga.U(obj);
        Thread.currentThread().setPriority(8);
        return DK.a;
    }
}
