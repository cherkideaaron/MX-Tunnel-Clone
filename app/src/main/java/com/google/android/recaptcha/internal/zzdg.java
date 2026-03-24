package com.google.android.recaptcha.internal;

import defpackage.AbstractC0115Ga;
import defpackage.AbstractC2883jK;
import defpackage.C0530bJ;
import defpackage.DK;
import defpackage.EnumC0321Sc;
import defpackage.InterfaceC0304Rc;
import defpackage.InterfaceC3396sn;
import defpackage.InterfaceC3493uc;
import defpackage.WH;

/* loaded from: classes2.dex */
final class zzdg extends WH implements InterfaceC3396sn {
    Object zza;
    int zzb;
    final /* synthetic */ zzdt zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzsp zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdg(zzdt zzdtVar, String str, long j, zzsp zzspVar, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.zzc = zzdtVar;
        this.zzd = str;
        this.zze = j;
        this.zzf = zzspVar;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        return new zzdg(this.zzc, this.zzd, this.zze, this.zzf, interfaceC3493uc);
    }

    @Override // defpackage.InterfaceC3396sn
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdg) create((InterfaceC0304Rc) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) throws Throwable {
        zzen zzenVar;
        Exception e;
        zzbd e2;
        C0530bJ e3;
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        if (this.zzb != 0) {
            zzenVar = (zzen) this.zza;
            try {
                AbstractC0115Ga.U(obj);
            } catch (C0530bJ e4) {
                e3 = e4;
                zzbd zzbdVarZzs = this.zzc.zzs(e3, new zzbd(zzbb.zzc, zzba.zzb, e3.getMessage()));
                zzenVar.zzb(zzbdVarZzs);
                throw zzbdVarZzs;
            } catch (zzbd e5) {
                e2 = e5;
                zzbd zzbdVarZzs2 = this.zzc.zzs(e2, e2);
                zzenVar.zzb(zzbdVarZzs2);
                throw zzbdVarZzs2;
            } catch (Exception e6) {
                e = e6;
                zzbd zzbdVarZzs3 = this.zzc.zzs(e, new zzbd(zzbb.zzc, zzba.zzZ, e.getMessage()));
                zzenVar.zzb(zzbdVarZzs3);
                throw zzbdVarZzs3;
            }
        } else {
            AbstractC0115Ga.U(obj);
            zzen zzenVarZzf = this.zzc.zzu(this.zzd).zzf(28);
            try {
                long j = this.zze;
                zzdf zzdfVar = new zzdf(this.zzc, this.zzf, zzenVarZzf, null);
                this.zza = zzenVarZzf;
                this.zzb = 1;
                Object objT = AbstractC2883jK.T(j, zzdfVar, this);
                if (objT == enumC0321Sc) {
                    return enumC0321Sc;
                }
                zzenVar = zzenVarZzf;
                obj = objT;
            } catch (C0530bJ e7) {
                zzenVar = zzenVarZzf;
                e3 = e7;
                zzbd zzbdVarZzs4 = this.zzc.zzs(e3, new zzbd(zzbb.zzc, zzba.zzb, e3.getMessage()));
                zzenVar.zzb(zzbdVarZzs4);
                throw zzbdVarZzs4;
            } catch (zzbd e8) {
                zzenVar = zzenVarZzf;
                e2 = e8;
                zzbd zzbdVarZzs22 = this.zzc.zzs(e2, e2);
                zzenVar.zzb(zzbdVarZzs22);
                throw zzbdVarZzs22;
            } catch (Exception e9) {
                zzenVar = zzenVarZzf;
                e = e9;
                zzbd zzbdVarZzs32 = this.zzc.zzs(e, new zzbd(zzbb.zzc, zzba.zzZ, e.getMessage()));
                zzenVar.zzb(zzbdVarZzs32);
                throw zzbdVarZzs32;
            }
        }
        return (zzsr) obj;
    }
}
