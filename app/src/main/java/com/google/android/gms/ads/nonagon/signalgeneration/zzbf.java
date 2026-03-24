package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzcdh;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzdaj;
import com.google.android.gms.internal.ads.zzdak;
import com.google.android.gms.internal.ads.zzdaw;
import com.google.android.gms.internal.ads.zzdkb;
import com.google.android.gms.internal.ads.zzdxh;
import com.google.android.gms.internal.ads.zzfno;
import com.google.android.gms.internal.ads.zzfnu;
import com.google.android.gms.internal.ads.zzgzo;
import com.google.android.gms.internal.ads.zzikg;
import com.google.android.gms.internal.ads.zziko;
import com.google.android.gms.internal.ads.zzikp;
import defpackage.As;
import defpackage.Vs;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class zzbf implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;
    private final zzikp zzd;
    private final zzikp zze;
    private final zzikp zzf;
    private final zzikp zzg;
    private final zzikp zzh;
    private final zzikp zzi;

    private zzbf(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5, zzikp zzikpVar6, zzikp zzikpVar7, zzikp zzikpVar8, zzikp zzikpVar9) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar3;
        this.zzd = zzikpVar4;
        this.zze = zzikpVar5;
        this.zzf = zzikpVar6;
        this.zzg = zzikpVar7;
        this.zzh = zzikpVar8;
        this.zzi = zzikpVar9;
    }

    public static zzbf zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4, zzikp zzikpVar5, zzikp zzikpVar6, zzikp zzikpVar7, zzikp zzikpVar8, zzikp zzikpVar9) {
        return new zzbf(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4, zzikpVar5, zzikpVar6, zzikpVar7, zzikpVar8, zzikpVar9);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() throws JSONException {
        As asZzi;
        zzau zzauVar = (zzau) this.zza.zzb();
        zzfnu zzfnuVar = (zzfnu) this.zzb.zzb();
        zzbh zzbhVarZzb = ((zzbi) this.zzc).zzb();
        zzdaj zzdajVarZzb = ((zzdak) this.zzd).zzb();
        zzdkb zzdkbVar = (zzdkb) this.zze.zzb();
        zzb zzbVar = (zzb) this.zzf.zzb();
        zzcdh zzcdhVar = (zzcdh) this.zzg.zzb();
        int iIntValue = ((Integer) this.zzh.zzb()).intValue();
        Bundle bundle = ((zzdaw) this.zzi).zza().zzt;
        zzbj zzbjVarZzb = null;
        if (iIntValue == 1 && zzcdhVar != null) {
            Vs.s(bundle, zzdxh.READ_FROM_DISK_START.zza());
            zzbjVarZzb = zzbVar.zzb(zzcdhVar, zzauVar, bundle);
            Vs.s(bundle, zzdxh.READ_FROM_DISK_END.zza());
        }
        if (zzbjVarZzb != null) {
            zzdkbVar.zza(zzbjVarZzb);
            asZzi = zzgzo.zza(zzbjVarZzb);
        } else {
            asZzi = zzfnuVar.zza(zzfno.GENERATE_SIGNALS, zzdajVarZzb.zzb()).zzc(zzbhVarZzb).zzh(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgC)).intValue(), TimeUnit.SECONDS).zzi();
            zzgzo.zzr(asZzi, new zzaw(zzdkbVar), zzcei.zza);
        }
        zziko.zzb(asZzi);
        return asZzi;
    }
}
