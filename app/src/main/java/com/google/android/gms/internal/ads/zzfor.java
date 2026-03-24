package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzfor implements Runnable {
    public static Boolean zzb;
    private final Context zze;
    private final VersionInfoParcel zzf;
    private int zzi;
    private final zzdvm zzj;
    private final List zzk;
    private final zzclx zzl;
    private final zzcac zzn;
    public static final Object zza = new Object();
    private static final Object zzc = new Object();
    private static final Object zzd = new Object();
    private final zzfov zzg = zzfoy.zzb();
    private String zzh = "";
    private boolean zzm = false;

    public zzfor(Context context, VersionInfoParcel versionInfoParcel, zzdvm zzdvmVar, zzehb zzehbVar, zzcac zzcacVar, zzclx zzclxVar) {
        this.zze = context;
        this.zzf = versionInfoParcel;
        this.zzj = zzdvmVar;
        this.zzn = zzcacVar;
        this.zzl = zzclxVar;
        this.zzk = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkg)).booleanValue() ? com.google.android.gms.ads.internal.util.zzs.zzk() : zzguf.zzi();
    }

    public static boolean zza() {
        boolean zBooleanValue;
        Boolean boolValueOf;
        synchronized (zza) {
            try {
                if (zzb == null) {
                    if (((Boolean) zzbix.zzb.zze()).booleanValue()) {
                        boolValueOf = Boolean.valueOf(Math.random() < ((Double) zzbix.zza.zze()).doubleValue());
                    } else {
                        boolValueOf = Boolean.FALSE;
                    }
                    zzb = boolValueOf;
                }
                zBooleanValue = zzb.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrZzaN;
        if (zza()) {
            Object obj = zzc;
            synchronized (obj) {
                try {
                    if (this.zzg.zza() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            zzfov zzfovVar = this.zzg;
                            bArrZzaN = ((zzfoy) zzfovVar.zzbu()).zzaN();
                            zzfovVar.zzc();
                        }
                        new zzeha(this.zze, this.zzf.afmaVersion, this.zzn, Binder.getCallingUid(), null).zza(new zzegy((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzka), 60000, new HashMap(), bArrZzaN, "application/x-protobuf", false));
                    } catch (Exception e) {
                        if ((e instanceof zzecr) && ((zzecr) e).zza() == 3) {
                            return;
                        }
                        com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "CuiMonitor.sendCuiPing");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void zzb(final zzfoh zzfohVar) {
        zzcei.zza.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfoq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc(zzfohVar);
            }
        });
    }

    public final /* synthetic */ void zzc(zzfoh zzfohVar) {
        synchronized (zzd) {
            try {
                if (!this.zzm) {
                    this.zzm = true;
                    if (zza()) {
                        try {
                            com.google.android.gms.ads.internal.zzt.zzc();
                            this.zzh = com.google.android.gms.ads.internal.util.zzs.zzt(this.zze);
                        } catch (RemoteException | RuntimeException e) {
                            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "CuiMonitor.gettingAppIdFromManifest");
                        }
                        this.zzi = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze);
                        int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkb)).intValue();
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznp)).booleanValue()) {
                            long j = iIntValue;
                            zzcei.zzd.scheduleWithFixedDelay(this, j, j, TimeUnit.MILLISECONDS);
                        } else {
                            long j2 = iIntValue;
                            zzcei.zzd.scheduleAtFixedRate(this, j2, j2, TimeUnit.MILLISECONDS);
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkh)).booleanValue()) {
                            this.zzl.zza();
                        }
                    }
                }
            } finally {
            }
        }
        if (zza() && zzfohVar != null) {
            synchronized (zzc) {
                try {
                    zzfov zzfovVar = this.zzg;
                    if (zzfovVar.zza() >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkc)).intValue()) {
                        return;
                    }
                    zzfos zzfosVarZza = zzfou.zza();
                    zzfosVarZza.zzv(zzfohVar.zzm());
                    zzfosVarZza.zza(zzfohVar.zzb());
                    zzfosVarZza.zzb(zzfohVar.zza());
                    zzfosVarZza.zzw(3);
                    zzfosVarZza.zzd(this.zzf.afmaVersion);
                    zzfosVarZza.zze(this.zzh);
                    zzfosVarZza.zzf(Build.VERSION.RELEASE);
                    zzfosVarZza.zzg(Build.VERSION.SDK_INT);
                    zzfosVarZza.zzx(zzfohVar.zzo());
                    zzfosVarZza.zzi(zzfohVar.zzc());
                    zzfosVarZza.zzj(this.zzi);
                    zzfosVarZza.zzy(zzfohVar.zzn());
                    zzfosVarZza.zzk(zzfohVar.zzd());
                    zzfosVarZza.zzl(zzfohVar.zze());
                    zzfosVarZza.zzm(zzfohVar.zzf());
                    zzfosVarZza.zzn(this.zzj.zzd(zzfohVar.zzf()));
                    zzfosVarZza.zzo(zzfohVar.zzg());
                    zzfosVarZza.zzs(zzfohVar.zzh());
                    zzfosVarZza.zzr(zzfohVar.zzk());
                    zzfosVarZza.zzp(zzfohVar.zzi());
                    zzfosVarZza.zzq(zzfohVar.zzj());
                    zzfosVarZza.zzc(zzfohVar.zzl());
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkg)).booleanValue()) {
                        zzfosVarZza.zzh(this.zzk);
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkh)).booleanValue()) {
                        zzclx zzclxVar = this.zzl;
                        zziff zziffVarZzd = zzclxVar.zzd();
                        String strZzc = zzclxVar.zzc();
                        if (zziffVarZzd != null) {
                            zzfosVarZza.zzt(zziffVarZzd);
                        }
                        if (strZzc != null) {
                            zzfosVarZza.zzu(strZzc);
                        }
                    }
                    zzfow zzfowVarZza = zzfox.zza();
                    zzfowVarZza.zza(zzfosVarZza);
                    zzfovVar.zzb(zzfowVarZza);
                } finally {
                }
            }
        }
    }
}
