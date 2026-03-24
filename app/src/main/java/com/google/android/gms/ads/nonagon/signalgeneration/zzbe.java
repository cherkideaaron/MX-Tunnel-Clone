package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdje;
import com.google.android.gms.internal.ads.zzdjy;
import com.google.android.gms.internal.ads.zzfmk;
import com.google.android.gms.internal.ads.zzgzy;
import com.google.android.gms.internal.ads.zzikg;
import com.google.android.gms.internal.ads.zzikp;

/* loaded from: classes.dex */
public final class zzbe implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;

    private zzbe(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar4;
    }

    public static zzbe zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        return new zzbe(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdjy zzdjyVar = (zzw) this.zza.zzb();
        zzdjy zzdjyVar2 = (zzbl) this.zzb.zzb();
        zzgzy zzgzyVarZzc = zzfmk.zzc();
        if (((Integer) this.zzc.zzb()).intValue() == 2) {
            zzdjyVar = zzdjyVar2;
        }
        return new zzdje(zzdjyVar, zzgzyVarZzc);
    }
}
