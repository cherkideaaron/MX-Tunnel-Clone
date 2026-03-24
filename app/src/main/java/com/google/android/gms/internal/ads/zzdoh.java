package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.As;
import defpackage.WF;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzdoh {
    private int zza;
    private com.google.android.gms.ads.internal.client.zzed zzb;
    private zzbkl zzc;
    private View zzd;
    private List zze;
    private com.google.android.gms.ads.internal.client.zzez zzg;
    private Bundle zzh;
    private zzcjl zzi;
    private zzcjl zzj;
    private zzcjl zzk;
    private zzekb zzl;
    private As zzm;
    private zzcen zzn;
    private View zzo;
    private View zzp;
    private IObjectWrapper zzq;
    private double zzr;
    private zzbks zzs;
    private zzbks zzt;
    private String zzu;
    private float zzx;
    private String zzy;
    private final WF zzv = new WF();
    private final WF zzw = new WF();
    private List zzf = Collections.emptyList();

    public static zzdoh zzaf(zzbui zzbuiVar) {
        try {
            return zzak(zzam(zzbuiVar.zzn(), zzbuiVar), zzbuiVar.zzo(), (View) zzal(zzbuiVar.zzp()), zzbuiVar.zze(), zzbuiVar.zzf(), zzbuiVar.zzg(), zzbuiVar.zzs(), zzbuiVar.zzi(), (View) zzal(zzbuiVar.zzq()), zzbuiVar.zzr(), zzbuiVar.zzl(), zzbuiVar.zzm(), zzbuiVar.zzk(), zzbuiVar.zzh(), zzbuiVar.zzj(), zzbuiVar.zzz());
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    public static zzdoh zzag(zzbuf zzbufVar) {
        try {
            zzdog zzdogVarZzam = zzam(zzbufVar.zzs(), null);
            zzbkl zzbklVarZzt = zzbufVar.zzt();
            View view = (View) zzal(zzbufVar.zzr());
            String strZze = zzbufVar.zze();
            List listZzf = zzbufVar.zzf();
            String strZzg = zzbufVar.zzg();
            Bundle bundleZzp = zzbufVar.zzp();
            String strZzi = zzbufVar.zzi();
            View view2 = (View) zzal(zzbufVar.zzu());
            IObjectWrapper iObjectWrapperZzv = zzbufVar.zzv();
            String strZzj = zzbufVar.zzj();
            zzbks zzbksVarZzh = zzbufVar.zzh();
            zzdoh zzdohVar = new zzdoh();
            zzdohVar.zza = 1;
            zzdohVar.zzb = zzdogVarZzam;
            zzdohVar.zzc = zzbklVarZzt;
            zzdohVar.zzd = view;
            zzdohVar.zzs("headline", strZze);
            zzdohVar.zze = listZzf;
            zzdohVar.zzs("body", strZzg);
            zzdohVar.zzh = bundleZzp;
            zzdohVar.zzs("call_to_action", strZzi);
            zzdohVar.zzo = view2;
            zzdohVar.zzq = iObjectWrapperZzv;
            zzdohVar.zzs("advertiser", strZzj);
            zzdohVar.zzt = zzbksVarZzh;
            return zzdohVar;
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    public static zzdoh zzah(zzbue zzbueVar) {
        try {
            zzdog zzdogVarZzam = zzam(zzbueVar.zzt(), null);
            zzbkl zzbklVarZzv = zzbueVar.zzv();
            View view = (View) zzal(zzbueVar.zzu());
            String strZze = zzbueVar.zze();
            List listZzf = zzbueVar.zzf();
            String strZzg = zzbueVar.zzg();
            Bundle bundleZzr = zzbueVar.zzr();
            String strZzi = zzbueVar.zzi();
            View view2 = (View) zzal(zzbueVar.zzw());
            IObjectWrapper iObjectWrapperZzx = zzbueVar.zzx();
            String strZzk = zzbueVar.zzk();
            String strZzl = zzbueVar.zzl();
            double dZzj = zzbueVar.zzj();
            zzbks zzbksVarZzh = zzbueVar.zzh();
            zzdoh zzdohVar = new zzdoh();
            zzdohVar.zza = 2;
            zzdohVar.zzb = zzdogVarZzam;
            zzdohVar.zzc = zzbklVarZzv;
            zzdohVar.zzd = view;
            zzdohVar.zzs("headline", strZze);
            zzdohVar.zze = listZzf;
            zzdohVar.zzs("body", strZzg);
            zzdohVar.zzh = bundleZzr;
            zzdohVar.zzs("call_to_action", strZzi);
            zzdohVar.zzo = view2;
            zzdohVar.zzq = iObjectWrapperZzx;
            zzdohVar.zzs("store", strZzk);
            zzdohVar.zzs("price", strZzl);
            zzdohVar.zzr = dZzj;
            zzdohVar.zzs = zzbksVarZzh;
            return zzdohVar;
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad from app install ad mapper", e);
            return null;
        }
    }

    public static zzdoh zzai(zzbue zzbueVar) {
        try {
            return zzak(zzam(zzbueVar.zzt(), null), zzbueVar.zzv(), (View) zzal(zzbueVar.zzu()), zzbueVar.zze(), zzbueVar.zzf(), zzbueVar.zzg(), zzbueVar.zzr(), zzbueVar.zzi(), (View) zzal(zzbueVar.zzw()), zzbueVar.zzx(), zzbueVar.zzk(), zzbueVar.zzl(), zzbueVar.zzj(), zzbueVar.zzh(), null, 0.0f);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    public static zzdoh zzaj(zzbuf zzbufVar) {
        try {
            return zzak(zzam(zzbufVar.zzs(), null), zzbufVar.zzt(), (View) zzal(zzbufVar.zzr()), zzbufVar.zze(), zzbufVar.zzf(), zzbufVar.zzg(), zzbufVar.zzp(), zzbufVar.zzi(), (View) zzal(zzbufVar.zzu()), zzbufVar.zzv(), null, null, -1.0d, zzbufVar.zzh(), zzbufVar.zzj(), 0.0f);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    private static zzdoh zzak(com.google.android.gms.ads.internal.client.zzed zzedVar, zzbkl zzbklVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d, zzbks zzbksVar, String str6, float f) {
        zzdoh zzdohVar = new zzdoh();
        zzdohVar.zza = 6;
        zzdohVar.zzb = zzedVar;
        zzdohVar.zzc = zzbklVar;
        zzdohVar.zzd = view;
        zzdohVar.zzs("headline", str);
        zzdohVar.zze = list;
        zzdohVar.zzs("body", str2);
        zzdohVar.zzh = bundle;
        zzdohVar.zzs("call_to_action", str3);
        zzdohVar.zzo = view2;
        zzdohVar.zzq = iObjectWrapper;
        zzdohVar.zzs("store", str4);
        zzdohVar.zzs("price", str5);
        zzdohVar.zzr = d;
        zzdohVar.zzs = zzbksVar;
        zzdohVar.zzs("advertiser", str6);
        zzdohVar.zzu(f);
        return zzdohVar;
    }

    private static Object zzal(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.unwrap(iObjectWrapper);
    }

    private static zzdog zzam(com.google.android.gms.ads.internal.client.zzed zzedVar, zzbui zzbuiVar) {
        if (zzedVar == null) {
            return null;
        }
        return new zzdog(zzedVar, zzbuiVar);
    }

    public final synchronized View zzA() {
        return this.zzd;
    }

    public final synchronized String zzB() {
        return zzw("headline");
    }

    public final synchronized List zzC() {
        return this.zze;
    }

    public final zzbks zzD() {
        List list = this.zze;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.zze.get(0);
        if (obj instanceof IBinder) {
            return zzbkr.zzh((IBinder) obj);
        }
        return null;
    }

    public final synchronized List zzE() {
        return this.zzf;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzez zzF() {
        return this.zzg;
    }

    public final synchronized String zzG() {
        return zzw("body");
    }

    public final synchronized Bundle zzH() {
        try {
            if (this.zzh == null) {
                this.zzh = new Bundle();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zzh;
    }

    public final synchronized String zzI() {
        return zzw("call_to_action");
    }

    public final synchronized View zzJ() {
        return this.zzo;
    }

    public final synchronized View zzK() {
        return this.zzp;
    }

    public final synchronized IObjectWrapper zzL() {
        return this.zzq;
    }

    public final synchronized String zzM() {
        return zzw("store");
    }

    public final synchronized String zzN() {
        return zzw("price");
    }

    public final synchronized double zzO() {
        return this.zzr;
    }

    public final synchronized zzbks zzP() {
        return this.zzs;
    }

    public final synchronized String zzQ() {
        return zzw("advertiser");
    }

    public final synchronized zzbks zzR() {
        return this.zzt;
    }

    public final synchronized String zzS() {
        return this.zzu;
    }

    public final synchronized zzcjl zzT() {
        return this.zzi;
    }

    public final synchronized zzcjl zzU() {
        return this.zzj;
    }

    public final synchronized boolean zzV() {
        return this.zzj != null;
    }

    public final synchronized zzcjl zzW() {
        return this.zzk;
    }

    public final synchronized As zzX() {
        return this.zzm;
    }

    public final synchronized zzcen zzY() {
        return this.zzn;
    }

    public final synchronized zzekb zzZ() {
        return this.zzl;
    }

    public final synchronized void zza(int i) {
        this.zza = i;
    }

    public final synchronized WF zzaa() {
        return this.zzv;
    }

    public final synchronized float zzab() {
        return this.zzx;
    }

    public final synchronized String zzac() {
        return this.zzy;
    }

    public final synchronized WF zzad() {
        return this.zzw;
    }

    public final synchronized void zzae() {
        try {
            zzcjl zzcjlVar = this.zzi;
            if (zzcjlVar != null) {
                zzcjlVar.destroy();
                this.zzi = null;
            }
            zzcjl zzcjlVar2 = this.zzj;
            if (zzcjlVar2 != null) {
                zzcjlVar2.destroy();
                this.zzj = null;
            }
            zzcjl zzcjlVar3 = this.zzk;
            if (zzcjlVar3 != null) {
                zzcjlVar3.destroy();
                this.zzk = null;
            }
            As as = this.zzm;
            if (as != null) {
                as.cancel(false);
                this.zzm = null;
            }
            zzcen zzcenVar = this.zzn;
            if (zzcenVar != null) {
                zzcenVar.cancel(false);
                this.zzn = null;
            }
            this.zzl = null;
            this.zzv.clear();
            this.zzw.clear();
            this.zzb = null;
            this.zzc = null;
            this.zzd = null;
            this.zze = null;
            this.zzh = null;
            this.zzo = null;
            this.zzp = null;
            this.zzq = null;
            this.zzs = null;
            this.zzt = null;
            this.zzu = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb(com.google.android.gms.ads.internal.client.zzed zzedVar) {
        this.zzb = zzedVar;
    }

    public final synchronized void zzc(zzbkl zzbklVar) {
        this.zzc = zzbklVar;
    }

    public final synchronized void zzd(List list) {
        this.zze = list;
    }

    public final synchronized void zze(List list) {
        this.zzf = list;
    }

    public final synchronized void zzf(com.google.android.gms.ads.internal.client.zzez zzezVar) {
        this.zzg = zzezVar;
    }

    public final synchronized void zzg(View view) {
        this.zzo = view;
    }

    public final synchronized void zzh(View view) {
        this.zzp = view;
    }

    public final synchronized void zzi(double d) {
        this.zzr = d;
    }

    public final synchronized void zzj(zzbks zzbksVar) {
        this.zzs = zzbksVar;
    }

    public final synchronized void zzk(zzbks zzbksVar) {
        this.zzt = zzbksVar;
    }

    public final synchronized void zzl(String str) {
        this.zzu = str;
    }

    public final synchronized void zzm(zzcjl zzcjlVar) {
        this.zzi = zzcjlVar;
    }

    public final synchronized void zzn(zzcjl zzcjlVar) {
        this.zzj = zzcjlVar;
    }

    public final synchronized void zzo(zzcjl zzcjlVar) {
        this.zzk = zzcjlVar;
    }

    public final synchronized void zzp(As as) {
        this.zzm = as;
    }

    public final synchronized void zzq(zzekb zzekbVar) {
        this.zzl = zzekbVar;
    }

    public final synchronized void zzr(zzcen zzcenVar) {
        this.zzn = zzcenVar;
    }

    public final synchronized void zzs(String str, String str2) {
        if (str2 == null) {
            this.zzw.remove(str);
        } else {
            this.zzw.put(str, str2);
        }
    }

    public final synchronized void zzt(String str, zzbkd zzbkdVar) {
        if (zzbkdVar == null) {
            this.zzv.remove(str);
        } else {
            this.zzv.put(str, zzbkdVar);
        }
    }

    public final synchronized void zzu(float f) {
        this.zzx = f;
    }

    public final synchronized void zzv(String str) {
        this.zzy = str;
    }

    public final synchronized String zzw(String str) {
        return (String) this.zzw.get(str);
    }

    public final synchronized int zzx() {
        return this.zza;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzed zzy() {
        return this.zzb;
    }

    public final synchronized zzbkl zzz() {
        return this.zzc;
    }
}
