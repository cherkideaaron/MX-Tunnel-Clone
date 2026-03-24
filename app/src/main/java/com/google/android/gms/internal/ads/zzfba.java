package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import defpackage.AbstractC3598wQ;
import defpackage.As;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzfba {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzfoo zzd;
    private final zzdxz zze;
    private long zzf = 0;
    private int zzg = 0;

    public zzfba(Context context, Executor executor, Set set, zzfoo zzfooVar, zzdxz zzdxzVar) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzfooVar;
        this.zze = zzdxzVar;
    }

    public final As zza(final Object obj, final Bundle bundle, final boolean z) {
        zzfoe zzfoeVarA = AbstractC3598wQ.a(this.zza, 8);
        zzfoeVarA.zza();
        Set<zzfax> set = this.zzb;
        final ArrayList arrayList = new ArrayList(set.size());
        List arrayList2 = new ArrayList();
        zzbgv zzbgvVar = zzbhe.zznh;
        if (!((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).split(","));
        }
        List list = arrayList2;
        this.zzf = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        final Bundle bundle2 = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue() && bundle != null) {
            bundle.putLong((obj instanceof zzdah ? zzdxh.CLIENT_SIGNALS_START : zzdxh.GMS_SIGNALS_START).zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        for (final zzfax zzfaxVar : set) {
            if (!list.contains(String.valueOf(zzfaxVar.zzb()))) {
                final long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
                As asZza = zzfaxVar.zza();
                asZza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfay
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzb(jElapsedRealtime, zzfaxVar, bundle2);
                    }
                }, zzcei.zzg);
                arrayList.add(asZza);
            }
        }
        As asZza2 = zzgzo.zzp(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfaz
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                Object obj2;
                Bundle bundle3;
                String str;
                Iterator it = arrayList.iterator();
                while (true) {
                    obj2 = obj;
                    if (!it.hasNext()) {
                        break;
                    }
                    zzfav zzfavVar = (zzfav) ((As) it.next()).get();
                    if (zzfavVar != null) {
                        boolean z2 = z;
                        zzfavVar.zza(obj2);
                        if (z2) {
                            zzfavVar.zzb(obj2);
                        }
                    }
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue() && (bundle3 = bundle) != null) {
                    Bundle bundle4 = bundle2;
                    long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
                    if (obj2 instanceof zzdah) {
                        bundle3.putLong(zzdxh.CLIENT_SIGNALS_END.zza(), jCurrentTimeMillis);
                        str = "client_sig_latency_key";
                    } else {
                        bundle3.putLong(zzdxh.GMS_SIGNALS_END.zza(), jCurrentTimeMillis);
                        str = "gms_sig_latency_key";
                    }
                    bundle3.putBundle(str, bundle4);
                }
                return obj2;
            }
        }, this.zzc);
        if (zzfor.zza()) {
            zzfon.zzd(asZza2, this.zzd, zzfoeVarA);
        }
        return asZza2;
    }

    public final /* synthetic */ void zzb(long j, zzfax zzfaxVar, Bundle bundle) {
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - j;
        if (((Boolean) zzbjg.zza.zze()).booleanValue()) {
            String strZza = zzgrt.zza(zzfaxVar.getClass().getCanonicalName());
            StringBuilder sb = new StringBuilder(strZza.length() + 25 + String.valueOf(jElapsedRealtime).length());
            sb.append("Signal runtime (ms) : ");
            sb.append(strZza);
            sb.append(" = ");
            sb.append(jElapsedRealtime);
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcQ)).booleanValue()) {
                synchronized (this) {
                    int iZzb = zzfaxVar.zzb();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzb).length() + 3);
                    sb2.append("sig");
                    sb2.append(iZzb);
                    bundle.putLong(sb2.toString(), jElapsedRealtime);
                }
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcI)).booleanValue()) {
            zzdxy zzdxyVarZza = this.zze.zza();
            zzdxyVarZza.zzc("action", "lat_ms");
            zzdxyVarZza.zzc("lat_grp", "sig_lat_grp");
            zzdxyVarZza.zzc("lat_id", String.valueOf(zzfaxVar.zzb()));
            zzdxyVarZza.zzc("clat_ms", String.valueOf(jElapsedRealtime));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcJ)).booleanValue()) {
                synchronized (this) {
                    this.zzg++;
                }
                zzdxyVarZza.zzc("seq_num", com.google.android.gms.ads.internal.zzt.zzh().zzr().zzm());
                synchronized (this) {
                    try {
                        if (this.zzg == this.zzb.size() && this.zzf != 0) {
                            this.zzg = 0;
                            zzdxyVarZza.zzc((zzfaxVar.zzb() <= 39 || zzfaxVar.zzb() >= 52) ? "lat_clsg" : "lat_gmssg", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zzf));
                        }
                    } finally {
                    }
                }
            }
            zzdxyVarZza.zzh();
        }
    }
}
