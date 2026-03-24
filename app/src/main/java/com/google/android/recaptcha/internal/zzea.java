package com.google.android.recaptcha.internal;

import defpackage.AbstractC0115Ga;
import defpackage.C0166Ja;
import defpackage.DK;
import defpackage.EnumC0321Sc;
import defpackage.InterfaceC0149Ia;
import defpackage.InterfaceC2631en;
import defpackage.InterfaceC3493uc;
import defpackage.WH;

/* loaded from: classes2.dex */
final class zzea extends WH implements InterfaceC2631en {
    Object zza;
    int zzb;
    final /* synthetic */ zzec zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ InterfaceC0149Ia zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzea(zzec zzecVar, long j, InterfaceC0149Ia interfaceC0149Ia, InterfaceC3493uc interfaceC3493uc) {
        super(1, interfaceC3493uc);
        this.zzc = zzecVar;
        this.zzd = j;
        this.zze = interfaceC0149Ia;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(InterfaceC3493uc interfaceC3493uc) {
        return new zzea(this.zzc, this.zzd, this.zze, interfaceC3493uc);
    }

    @Override // defpackage.InterfaceC2631en
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzea) create((InterfaceC3493uc) obj)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) throws Throwable {
        zzen zzenVar;
        zzbd e;
        zzen zzenVar2;
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        int i = this.zzb;
        if (i == 0) {
            AbstractC0115Ga.U(obj);
            zzen zzenVarZzf = this.zzc.zzb.zzf(41);
            try {
                zzdt zzdtVar = this.zzc.zza;
                long j = this.zzd;
                this.zza = zzenVarZzf;
                this.zzb = 1;
                Object objZzo = zzdtVar.zzo(j, this);
                if (objZzo != enumC0321Sc) {
                    zzenVar2 = zzenVarZzf;
                    obj = objZzo;
                }
                return enumC0321Sc;
            } catch (zzbd e2) {
                zzenVar = zzenVarZzf;
                e = e2;
                this.zzc.zzd = e;
                zzenVar.zzb(e);
                throw e;
            }
        }
        if (i != 1) {
            zzenVar = (zzen) this.zza;
            try {
                AbstractC0115Ga.U(obj);
                zzenVar.zza();
                this.zzc.zzf = zzcm.zzb;
                return Boolean.valueOf(((C0166Ja) this.zze).E(DK.a));
            } catch (zzbd e3) {
                e = e3;
                this.zzc.zzd = e;
                zzenVar.zzb(e);
                throw e;
            }
        }
        zzenVar2 = (zzen) this.zza;
        try {
            AbstractC0115Ga.U(obj);
        } catch (zzbd e4) {
            e = e4;
            zzenVar = zzenVar2;
            this.zzc.zzd = e;
            zzenVar.zzb(e);
            throw e;
        }
        zzsc zzscVar = (zzsc) obj;
        this.zzc.zze = zzscVar;
        zzdt zzdtVar2 = this.zzc.zza;
        long j2 = this.zzd;
        this.zza = zzenVar2;
        this.zzb = 2;
        if (zzdtVar2.zzn(zzscVar, j2, this) != enumC0321Sc) {
            zzenVar = zzenVar2;
            zzenVar.zza();
            this.zzc.zzf = zzcm.zzb;
            return Boolean.valueOf(((C0166Ja) this.zze).E(DK.a));
        }
        return enumC0321Sc;
    }
}
