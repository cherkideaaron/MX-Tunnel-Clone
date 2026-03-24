package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.AbstractC0500aq;
import defpackage.AbstractC2883jK;
import defpackage.C0055Ci;
import defpackage.C3658xf;
import defpackage.InterfaceC0606cn;
import defpackage.MO;

/* loaded from: classes.dex */
public final class zzfzd implements zzikg {
    private final zzikp zza;

    private zzfzd(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
    }

    public static zzfzd zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzfzd(zzikpVar, zzikpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        final Context contextZza = ((zzcmh) this.zza).zza();
        zzfzh zzfzhVarZzc = zzcml.zzc();
        AbstractC0500aq.m(contextZza, "context");
        AbstractC0500aq.m(zzfzhVarZzc, "coroutineScopeProvider");
        C3658xf c3658xfP = AbstractC2883jK.p(zzfzb.zza, null, C0055Ci.a, zzfzhVarZzc.zza(), new InterfaceC0606cn() { // from class: com.google.android.gms.internal.ads.zzfzc
            @Override // defpackage.InterfaceC0606cn
            public final /* synthetic */ Object invoke() {
                return MO.l(contextZza, "ad_quality_data.pb");
            }
        });
        zziko.zzb(c3658xfP);
        return c3658xfP;
    }
}
