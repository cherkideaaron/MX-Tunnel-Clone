package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.AbstractC3598wQ;
import defpackage.As;
import defpackage.Vs;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzegw extends zzbzg {
    private final Context zza;
    private final zzgzy zzb;
    private final zzehe zzc;
    private final zzcqi zzd;
    private final ArrayDeque zze;
    private final zzfor zzf;
    private final zzcac zzg;

    public zzegw(Context context, zzgzy zzgzyVar, zzcac zzcacVar, zzcqi zzcqiVar, zzehe zzeheVar, ArrayDeque arrayDeque, zzehb zzehbVar, zzfor zzforVar) {
        zzbhe.zza(context);
        this.zza = context;
        this.zzb = zzgzyVar;
        this.zzg = zzcacVar;
        this.zzc = zzeheVar;
        this.zzd = zzcqiVar;
        this.zze = arrayDeque;
        this.zzf = zzforVar;
    }

    private static As zzm(final zzbzu zzbzuVar, zzfnu zzfnuVar, final zzfbz zzfbzVar) {
        zzgyw zzgywVar = new zzgyw() { // from class: com.google.android.gms.internal.ads.zzegk
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ As zza(Object obj) {
                return zzfbzVar.zzc().zza(com.google.android.gms.ads.internal.client.zzbb.zza().zzm((Bundle) obj), zzbzuVar.zzm, false);
            }
        };
        return zzfnuVar.zza(zzfno.GMS_SIGNALS, zzgzo.zza(zzbzuVar.zza)).zzc(zzgywVar).zzb(zzegl.zza).zzi();
    }

    private static As zzn(As as, zzfnu zzfnuVar, zzbsz zzbszVar, zzfoo zzfooVar, zzfoe zzfoeVar) {
        zzbsp zzbspVarZza = zzbszVar.zza("AFMA_getAdDictionary", zzbsw.zza, zzegq.zza);
        zzfon.zzb(as, zzfoeVar);
        zzfnb zzfnbVarZzi = zzfnuVar.zza(zzfno.BUILD_URL, as).zzc(zzbspVarZza).zzi();
        zzfon.zzf(zzfnbVarZzi, zzfooVar, zzfoeVar);
        return zzfnbVarZzi;
    }

    private final void zzo(As as, zzbzl zzbzlVar, zzbzu zzbzuVar) {
        zzgzo.zzr(zzgzo.zzj(as, new zzgyw(this) { // from class: com.google.android.gms.internal.ads.zzego
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ As zza(Object obj) {
                return zzgzo.zza(zzfkl.zza((InputStream) obj));
            }
        }, zzcei.zza), new zzegh(this, zzbzuVar, zzbzlVar), zzcei.zzg);
    }

    private final synchronized void zzp() {
        int iIntValue = ((Long) zzbjl.zzb.zze()).intValue();
        while (true) {
            ArrayDeque arrayDeque = this.zze;
            if (arrayDeque.size() >= iIntValue) {
                arrayDeque.removeFirst();
            }
        }
    }

    private final synchronized void zzq(zzegr zzegrVar) {
        zzp();
        this.zze.addLast(zzegrVar);
    }

    private final synchronized zzegr zzr(String str) {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            zzegr zzegrVar = (zzegr) it.next();
            if (zzegrVar.zzc.equals(str)) {
                it.remove();
                return zzegrVar;
            }
        }
        return null;
    }

    public final As zzb(final zzbzu zzbzuVar, int i) {
        zzegr zzegrVarZzr;
        String str;
        zzfnl zzfnlVarZza;
        zzbsq zzbsqVarZzr = com.google.android.gms.ads.internal.zzt.zzr();
        Context context = this.zza;
        zzbsz zzbszVarZza = zzbsqVarZzr.zza(context, VersionInfoParcel.forPackage(), this.zzf);
        zzfbz zzfbzVarZzy = this.zzd.zzy(zzbzuVar, i);
        zzbsp zzbspVarZza = zzbszVarZza.zza("google.afma.response.normalize", zzegt.zzd, zzbsw.zzb);
        if (((Boolean) zzbjl.zza.zze()).booleanValue()) {
            zzegrVarZzr = zzr(zzbzuVar.zzh);
            if (zzegrVarZzr == null) {
                str = "Request contained a PoolKey but no matching parameters were found.";
                com.google.android.gms.ads.internal.util.zze.zza(str);
            }
        } else {
            String str2 = zzbzuVar.zzj;
            zzegrVarZzr = null;
            if (str2 != null && !str2.isEmpty()) {
                str = "Request contained a PoolKey but split request is disabled.";
                com.google.android.gms.ads.internal.util.zze.zza(str);
            }
        }
        zzegr zzegrVar = zzegrVarZzr;
        zzfoe zzfoeVarA = zzegrVar == null ? AbstractC3598wQ.a(context, 9) : zzegrVar.zzd;
        zzfoo zzfooVarZzf = zzfbzVarZzy.zzf();
        zzfooVarZzf.zzb(zzbzuVar.zza.getStringArrayList("ad_types"));
        zzehd zzehdVar = new zzehd(zzbzuVar.zzg, zzfooVarZzf, zzfoeVarA);
        zzeha zzehaVar = new zzeha(context, zzbzuVar.zzb.afmaVersion, this.zzg, i, null);
        zzfnu zzfnuVarZze = zzfbzVarZzy.zze();
        zzfoe zzfoeVarA2 = AbstractC3598wQ.a(context, 11);
        if (zzegrVar == null) {
            final As asZzm = zzm(zzbzuVar, zzfnuVarZze, zzfbzVarZzy);
            final As asZzn = zzn(asZzm, zzfnuVarZze, zzbszVarZza, zzfooVarZzf, zzfoeVarA);
            zzfoe zzfoeVarA3 = AbstractC3598wQ.a(context, 10);
            final zzfnb zzfnbVarZzi = zzfnuVarZze.zzb(zzfno.HTTP, asZzn, asZzm).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzegp
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    Bundle bundle;
                    zzbzw zzbzwVar = (zzbzw) asZzn.get();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue() && (bundle = zzbzuVar.zzm) != null) {
                        bundle.putLong(zzdxh.GET_AD_DICTIONARY_SDKCORE_START.zza(), zzbzwVar.zzj());
                        bundle.putLong(zzdxh.GET_AD_DICTIONARY_SDKCORE_END.zza(), zzbzwVar.zzk());
                    }
                    return new zzehc((JSONObject) asZzm.get(), zzbzwVar);
                }
            }).zzb(zzehdVar).zzb(zzfon.zzc(zzfoeVarA3)).zzb(zzehaVar).zzi();
            zzfon.zzd(zzfnbVarZzi, zzfooVarZzf, zzfoeVarA3);
            zzfon.zzb(zzfnbVarZzi, zzfoeVarA2);
            zzfnlVarZza = zzfnuVarZze.zzb(zzfno.PRE_PROCESS, asZzm, asZzn, zzfnbVarZzi).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzegi
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    Bundle bundle;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue() && (bundle = zzbzuVar.zzm) != null) {
                        Vs.s(bundle, zzdxh.HTTP_RESPONSE_READY.zza());
                    }
                    return new zzegt((zzegz) zzfnbVarZzi.get(), (JSONObject) asZzm.get(), (zzbzw) asZzn.get());
                }
            });
        } else {
            zzehc zzehcVar = new zzehc(zzegrVar.zzb, zzegrVar.zza);
            zzfoe zzfoeVarA4 = AbstractC3598wQ.a(context, 10);
            final zzfnb zzfnbVarZzi2 = zzfnuVarZze.zza(zzfno.HTTP, zzgzo.zza(zzehcVar)).zzb(zzehdVar).zzb(zzfon.zzc(zzfoeVarA4)).zzb(zzehaVar).zzi();
            zzfon.zzd(zzfnbVarZzi2, zzfooVarZzf, zzfoeVarA4);
            final As asZza = zzgzo.zza(zzegrVar);
            zzfon.zzb(zzfnbVarZzi2, zzfoeVarA2);
            zzfnlVarZza = zzfnuVarZze.zzb(zzfno.PRE_PROCESS, zzfnbVarZzi2, asZza).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzegj
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    zzegz zzegzVar = (zzegz) zzfnbVarZzi2.get();
                    As as = asZza;
                    return new zzegt(zzegzVar, ((zzegr) as.get()).zzb, ((zzegr) as.get()).zza);
                }
            });
        }
        zzfnb zzfnbVarZzi3 = zzfnlVarZza.zzc(zzbspVarZza).zzi();
        zzfon.zzd(zzfnbVarZzi3, zzfooVarZzf, zzfoeVarA2);
        return zzfnbVarZzi3;
    }

    public final As zzc(final zzbzu zzbzuVar, int i) {
        if (!((Boolean) zzbjl.zza.zze()).booleanValue()) {
            return zzgzo.zzc(new Exception("Split request is disabled."));
        }
        zzflg zzflgVar = zzbzuVar.zzi;
        if (zzflgVar == null) {
            return zzgzo.zzc(new Exception("Pool configuration missing from request."));
        }
        if (zzflgVar.zzc == 0 || zzflgVar.zzd == 0) {
            return zzgzo.zzc(new Exception("Caching is disabled."));
        }
        Context context = this.zza;
        zzbsz zzbszVarZza = com.google.android.gms.ads.internal.zzt.zzr().zza(context, VersionInfoParcel.forPackage(), this.zzf);
        zzfbz zzfbzVarZzy = this.zzd.zzy(zzbzuVar, i);
        zzfnu zzfnuVarZze = zzfbzVarZzy.zze();
        final As asZzm = zzm(zzbzuVar, zzfnuVarZze, zzfbzVarZzy);
        zzfoo zzfooVarZzf = zzfbzVarZzy.zzf();
        final zzfoe zzfoeVarA = AbstractC3598wQ.a(context, 9);
        final As asZzn = zzn(asZzm, zzfnuVarZze, zzbszVarZza, zzfooVarZzf, zzfoeVarA);
        return zzfnuVarZze.zzb(zzfno.GET_URL_AND_CACHE_KEY, asZzm, asZzn).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzegm
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzl(asZzn, asZzm, zzbzuVar, zzfoeVarA);
            }
        }).zzi();
    }

    public final As zzd(String str) {
        if (((Boolean) zzbjl.zza.zze()).booleanValue()) {
            return zzr(str) == null ? zzgzo.zzc(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : zzgzo.zza(new zzegg(this));
        }
        return zzgzo.zzc(new Exception("Split request is disabled."));
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zze(zzbzu zzbzuVar, zzbzl zzbzlVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue() && (bundle = zzbzuVar.zzm) != null) {
            Vs.s(bundle, zzdxh.SERVICE_CONNECTED.zza());
        }
        As asZzb = zzb(zzbzuVar, Binder.getCallingUid());
        zzo(asZzb, zzbzlVar, zzbzuVar);
        if (((Boolean) zzbje.zzi.zze()).booleanValue()) {
            final zzehe zzeheVar = this.zzc;
            Objects.requireNonNull(zzeheVar);
            asZzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzeheVar.zza();
                }
            }, this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzf(zzbzu zzbzuVar, zzbzl zzbzlVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue() && (bundle = zzbzuVar.zzm) != null) {
            Vs.s(bundle, zzdxh.SERVICE_CONNECTED.zza());
        }
        zzo(zzk(zzbzuVar, Binder.getCallingUid()), zzbzlVar, zzbzuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzg(zzbzu zzbzuVar, zzbzl zzbzlVar) {
        zzo(zzc(zzbzuVar, Binder.getCallingUid()), zzbzlVar, zzbzuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzh(String str, zzbzl zzbzlVar) {
        zzo(zzd(str), zzbzlVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzi(String str) {
        int callingUid = Binder.getCallingUid();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpz)).booleanValue()) {
            String str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpA);
            if (str2.isEmpty()) {
                return;
            }
            Iterable<String> iterableZzd = zzgrr.zza(zzgqq.zzc(',')).zzd(str2);
            com.google.android.gms.ads.internal.util.zze.zza("AdRequestServiceImpl: Preconnecting");
            for (String str3 : iterableZzd) {
                Context context = this.zza;
                zzeha zzehaVar = new zzeha(context, str, this.zzg, callingUid, "HEAD");
                HashMap map = new HashMap();
                map.put("User-Agent", com.google.android.gms.ads.internal.zzt.zzc().zze(context, str));
                try {
                    zzegz zzegzVarZzb = zzehaVar.zza(new zzegy(str3, 30000, map, new byte[0], "", false));
                    if (zzegzVarZzb.zza != 200) {
                        int i = zzegzVarZzb.zza;
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 32);
                        sb.append("Unexpected preconnect response: ");
                        sb.append(i);
                        throw new RemoteException(sb.toString());
                    }
                } catch (Exception e) {
                    throw new RemoteException(e.getMessage());
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zzj(zzbzd zzbzdVar, zzbzm zzbzmVar) {
        if (((Boolean) zzbjt.zza.zze()).booleanValue()) {
            this.zzd.zzF();
            String str = zzbzdVar.zza;
            zzgzo.zzr(zzgzo.zza(null), new zzegf(this, zzbzmVar, zzbzdVar), zzcei.zzg);
        } else {
            try {
                zzbzmVar.zze("", zzbzdVar);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e);
            }
        }
    }

    public final As zzk(final zzbzu zzbzuVar, int i) {
        zzbsq zzbsqVarZzr = com.google.android.gms.ads.internal.zzt.zzr();
        Context context = this.zza;
        zzbsz zzbszVarZza = zzbsqVarZzr.zza(context, VersionInfoParcel.forPackage(), this.zzf);
        if (!((Boolean) zzbjr.zza.zze()).booleanValue()) {
            return zzgzo.zzc(new Exception("Signal collection disabled."));
        }
        zzfbz zzfbzVarZzy = this.zzd.zzy(zzbzuVar, i);
        final zzfba zzfbaVarZzd = zzfbzVarZzy.zzd();
        zzbsp zzbspVarZza = zzbszVarZza.zza("google.afma.request.getSignals", zzbsw.zza, zzbsw.zzb);
        zzfoe zzfoeVarA = AbstractC3598wQ.a(context, 22);
        zzfnu zzfnuVarZze = zzfbzVarZzy.zze();
        zzfno zzfnoVar = zzfno.GET_SIGNALS;
        Bundle bundle = zzbzuVar.zza;
        zzfnb zzfnbVarZzi = zzfnuVarZze.zza(zzfnoVar, zzgzo.zza(bundle)).zzb(zzfon.zzc(zzfoeVarA)).zzc(new zzgyw() { // from class: com.google.android.gms.internal.ads.zzegn
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ As zza(Object obj) throws JSONException {
                return zzfbaVarZzd.zza(com.google.android.gms.ads.internal.client.zzbb.zza().zzm((Bundle) obj), zzbzuVar.zzm, false);
            }
        }).zzj(zzfno.JS_SIGNALS).zzc(zzbspVarZza).zzi();
        zzfoo zzfooVarZzf = zzfbzVarZzy.zzf();
        zzfooVarZzf.zzb(bundle.getStringArrayList("ad_types"));
        zzfooVarZzf.zzd(bundle.getBundle("extras"));
        zzfon.zze(zzfnbVarZzi, zzfooVarZzf, zzfoeVarA);
        if (((Boolean) zzbje.zzj.zze()).booleanValue()) {
            final zzehe zzeheVar = this.zzc;
            Objects.requireNonNull(zzeheVar);
            zzfnbVarZzi.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzeheVar.zza();
                }
            }, this.zzb);
        }
        return zzfnbVarZzi;
    }

    public final /* synthetic */ InputStream zzl(As as, As as2, zzbzu zzbzuVar, zzfoe zzfoeVar) {
        String strZzi = ((zzbzw) as.get()).zzi();
        zzq(new zzegr((zzbzw) as.get(), (JSONObject) as2.get(), zzbzuVar.zzh, strZzi, zzfoeVar));
        return new ByteArrayInputStream(strZzi.getBytes(StandardCharsets.UTF_8));
    }
}
