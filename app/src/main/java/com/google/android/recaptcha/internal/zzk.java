package com.google.android.recaptcha.internal;

import android.content.pm.PackageManager;
import defpackage.AbstractC0115Ga;
import defpackage.AbstractC0136He;
import defpackage.DK;
import defpackage.EnumC0321Sc;
import defpackage.HC;
import defpackage.IC;
import defpackage.InterfaceC0304Rc;
import defpackage.InterfaceC3117ng;
import defpackage.InterfaceC3396sn;
import defpackage.InterfaceC3493uc;
import defpackage.MO;
import defpackage.WH;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.MissingResourceException;

/* loaded from: classes2.dex */
final class zzk extends WH implements InterfaceC3396sn {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ zzek zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzsc zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzk(zzl zzlVar, zzek zzekVar, long j, zzsc zzscVar, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.zzb = zzlVar;
        this.zzc = zzekVar;
        this.zzd = j;
        this.zze = zzscVar;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        zzk zzkVar = new zzk(this.zzb, this.zzc, this.zzd, this.zze, interfaceC3493uc);
        zzkVar.zzf = obj;
        return zzkVar;
    }

    @Override // defpackage.InterfaceC3396sn
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzk) create((InterfaceC0304Rc) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) throws PackageManager.NameNotFoundException, MissingResourceException {
        zzen zzenVar;
        Object objN;
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        if (this.zza != 0) {
            zzenVar = (zzen) this.zzf;
            AbstractC0115Ga.U(obj);
        } else {
            AbstractC0115Ga.U(obj);
            InterfaceC0304Rc interfaceC0304Rc = (InterfaceC0304Rc) this.zzf;
            this.zzb.zzb = this.zzc;
            zzek zzekVar = this.zzc;
            zzekVar.zzc(zzekVar.zzd());
            zzen zzenVarZzf = zzekVar.zzf(30);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzd().iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC0136He.c(interfaceC0304Rc, new zzj((zze) it.next(), this.zzd, this.zze, null)));
            }
            InterfaceC3117ng[] interfaceC3117ngArr = (InterfaceC3117ng[]) arrayList.toArray(new InterfaceC3117ng[0]);
            InterfaceC3117ng[] interfaceC3117ngArr2 = (InterfaceC3117ng[]) Arrays.copyOf(interfaceC3117ngArr, interfaceC3117ngArr.length);
            this.zzf = zzenVarZzf;
            this.zza = 1;
            obj = MO.c(interfaceC3117ngArr2, this);
            if (obj == enumC0321Sc) {
                return enumC0321Sc;
            }
            zzenVar = zzenVarZzf;
        }
        List list = (List) obj;
        if ((list instanceof Collection) && list.isEmpty()) {
            zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzY, null);
            zzenVar.zzb(zzbdVar);
            objN = AbstractC0115Ga.n(zzbdVar);
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!(((IC) it2.next()).a instanceof HC)) {
                    zzenVar.zza();
                    objN = DK.a;
                    break;
                }
            }
            zzbd zzbdVar2 = new zzbd(zzbb.zzb, zzba.zzY, null);
            zzenVar.zzb(zzbdVar2);
            objN = AbstractC0115Ga.n(zzbdVar2);
        }
        return new IC(objN);
    }
}
