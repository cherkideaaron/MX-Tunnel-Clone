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
import java.util.Iterator;
import java.util.List;
import java.util.MissingResourceException;

/* loaded from: classes2.dex */
final class zzh extends WH implements InterfaceC3396sn {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzh(zzl zzlVar, String str, long j, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.zzb = zzlVar;
        this.zzc = str;
        this.zzd = j;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        zzh zzhVar = new zzh(this.zzb, this.zzc, this.zzd, interfaceC3493uc);
        zzhVar.zze = obj;
        return zzhVar;
    }

    @Override // defpackage.InterfaceC3396sn
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzh) create((InterfaceC0304Rc) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) throws PackageManager.NameNotFoundException, MissingResourceException {
        zzen zzenVarZzf;
        zzen zzenVar;
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        if (this.zza != 0) {
            zzenVar = (zzen) this.zze;
            AbstractC0115Ga.U(obj);
        } else {
            AbstractC0115Ga.U(obj);
            InterfaceC0304Rc interfaceC0304Rc = (InterfaceC0304Rc) this.zze;
            zzek zzekVar = this.zzb.zzb;
            if (zzekVar != null) {
                zzekVar.zzc(this.zzc);
                zzenVarZzf = zzekVar.zzf(31);
            } else {
                zzenVarZzf = null;
            }
            ArrayList arrayList = new ArrayList();
            for (zze zzeVar : this.zzb.zzd()) {
                if (zzeVar.zzl()) {
                    arrayList.add(AbstractC0136He.c(interfaceC0304Rc, new zzg(zzeVar, this.zzc, this.zzd, null)));
                }
            }
            InterfaceC3117ng[] interfaceC3117ngArr = (InterfaceC3117ng[]) arrayList.toArray(new InterfaceC3117ng[0]);
            InterfaceC3117ng[] interfaceC3117ngArr2 = (InterfaceC3117ng[]) Arrays.copyOf(interfaceC3117ngArr, interfaceC3117ngArr.length);
            this.zze = zzenVarZzf;
            this.zza = 1;
            obj = MO.c(interfaceC3117ngArr2, this);
            if (obj == enumC0321Sc) {
                return enumC0321Sc;
            }
            zzenVar = zzenVarZzf;
        }
        String str = this.zzc;
        zzsh zzshVarZzf = zzsi.zzf();
        zzshVarZzf.zze(str);
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            Object obj2 = ((IC) it.next()).a;
            if (!(obj2 instanceof HC)) {
                zzshVarZzf.zzh((zzsi) obj2);
            }
        }
        zzsi zzsiVar = (zzsi) zzshVarZzf.zzk();
        if (zzenVar != null) {
            zzenVar.zza();
        }
        return zzsiVar;
    }
}
