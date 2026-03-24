package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.AbstractC3598wQ;
import defpackage.As;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzfqk {
    private final Context zza;
    private final Executor zzb;
    private final zzgzz zzc;
    private final com.google.android.gms.ads.internal.util.client.zzu zzd;
    private final zzfqc zze;
    private final zzfor zzf;
    private final zzclx zzg;

    public zzfqk(Context context, Executor executor, zzgzz zzgzzVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, zzfqc zzfqcVar, zzfor zzforVar, zzclx zzclxVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzgzzVar;
        this.zzd = zzuVar;
        this.zze = zzfqcVar;
        this.zzf = zzforVar;
        this.zzg = zzclxVar;
    }

    public final void zza(List list, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), zzvVar, null, null);
        }
    }

    public final void zzb(final String str, com.google.android.gms.ads.internal.util.client.zzv zzvVar, zzfoo zzfooVar, zzddu zzdduVar) {
        As asZzc;
        zzfoe zzfoeVarA = null;
        if (zzfor.zza() && ((Boolean) zzbix.zzd.zze()).booleanValue()) {
            zzfoeVarA = AbstractC3598wQ.a(this.zza, 14);
            zzfoeVarA.zza();
        }
        if (zzvVar != null) {
            asZzc = new zzfqb(zzvVar.zza(), this.zzd, this.zzc, this.zze, this.zzg).zza(str);
        } else {
            asZzc = this.zzc.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfqj
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzc(str);
                }
            });
        }
        zzgzo.zzr(asZzc, new zzfqi(this, zzfoeVarA, zzfooVar, zzdduVar), this.zzb);
    }

    public final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzt zzc(String str) {
        com.google.android.gms.ads.internal.util.client.zzu zzuVar;
        HashMap map;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkk)).booleanValue() && (com.google.android.gms.ads.internal.zzt.zzc().zzi(str) || com.google.android.gms.ads.internal.zzt.zzc().zzj(str))) {
            String strZzb = this.zzg.zzb();
            map = new HashMap();
            if (strZzb != null) {
                map.put((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkl), strZzb);
            }
            zzuVar = this.zzd;
        } else {
            zzuVar = this.zzd;
            map = null;
        }
        return zzuVar.zzc(str, map);
    }

    public final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzu zzd() {
        return this.zzd;
    }

    public final /* synthetic */ zzfor zze() {
        return this.zzf;
    }
}
