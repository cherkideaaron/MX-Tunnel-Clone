package com.google.android.recaptcha.internal;

import defpackage.AbstractC0115Ga;
import defpackage.AbstractC0136He;
import defpackage.DK;
import defpackage.EnumC0321Sc;
import defpackage.IC;
import defpackage.InterfaceC0029Aq;
import defpackage.InterfaceC0304Rc;
import defpackage.InterfaceC3396sn;
import defpackage.InterfaceC3493uc;
import defpackage.MO;
import defpackage.WH;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
final class zzs extends WH implements InterfaceC3396sn {
    int zza;
    final /* synthetic */ zzv zzb;
    final /* synthetic */ String zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzv zzvVar, String str, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.zzb = zzvVar;
        this.zzc = str;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        zzs zzsVar = new zzs(this.zzb, this.zzc, interfaceC3493uc);
        zzsVar.zzd = obj;
        return zzsVar;
    }

    @Override // defpackage.InterfaceC3396sn
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzs) create((InterfaceC0304Rc) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        int i = this.zza;
        AbstractC0115Ga.U(obj);
        if (i == 0) {
            InterfaceC0304Rc interfaceC0304Rc = (InterfaceC0304Rc) this.zzd;
            ArrayList arrayList = new ArrayList();
            zzv zzvVar = this.zzb;
            zzvVar.zzo().put(this.zzc, arrayList);
            ArrayList arrayList2 = new ArrayList();
            List list = this.zzb.zzb;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (((zzy) obj2).zzf()) {
                    arrayList3.add(obj2);
                }
            }
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList2.add(AbstractC0136He.y(interfaceC0304Rc, new zzr((zzy) it.next(), this.zzc, arrayList, null)));
            }
            InterfaceC0029Aq[] interfaceC0029AqArr = (InterfaceC0029Aq[]) arrayList2.toArray(new InterfaceC0029Aq[0]);
            InterfaceC0029Aq[] interfaceC0029AqArr2 = (InterfaceC0029Aq[]) Arrays.copyOf(interfaceC0029AqArr, interfaceC0029AqArr.length);
            this.zza = 1;
            if (MO.x(interfaceC0029AqArr2, this) == enumC0321Sc) {
                return enumC0321Sc;
            }
        }
        return new IC(this.zzb.zzq(this.zzc));
    }
}
