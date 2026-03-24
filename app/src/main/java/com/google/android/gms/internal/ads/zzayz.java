package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class zzayz implements zzazc {
    private static zzayz zzb;
    private final Context zzc;
    private final zzfwr zzd;
    private final zzfwy zze;
    private final zzfxa zzf;
    private final zzbae zzg;
    private final zzfvh zzh;
    private final Executor zzi;
    private final zzbch zzj;
    private final zzfwx zzk;
    private final zzbat zzm;
    private final zzbal zzn;
    private final zzbac zzo;
    private volatile boolean zzq;
    private volatile boolean zzr;
    volatile long zza = 0;
    private final Object zzp = new Object();
    private final CountDownLatch zzl = new CountDownLatch(1);

    public zzayz(Context context, zzfvh zzfvhVar, zzfwr zzfwrVar, zzfwy zzfwyVar, zzfxa zzfxaVar, zzbae zzbaeVar, Executor executor, zzfvc zzfvcVar, zzbch zzbchVar, zzbat zzbatVar, zzbal zzbalVar, zzbac zzbacVar) {
        this.zzr = false;
        this.zzc = context;
        this.zzh = zzfvhVar;
        this.zzd = zzfwrVar;
        this.zze = zzfwyVar;
        this.zzf = zzfxaVar;
        this.zzg = zzbaeVar;
        this.zzi = executor;
        this.zzj = zzbchVar;
        this.zzm = zzbatVar;
        this.zzn = zzbalVar;
        this.zzo = zzbacVar;
        this.zzr = false;
        this.zzk = new zzayx(this, zzfvcVar);
    }

    public static synchronized zzayz zza(Context context, zzavi zzaviVar, boolean z) {
        zzfvi zzfviVarZzh;
        zzfviVarZzh = zzfvj.zzh();
        zzfviVarZzh.zza(zzaviVar.zza());
        zzfviVarZzh.zzb(zzaviVar.zzb());
        return zzs(context, Executors.newCachedThreadPool(), zzfviVarZzh.zzh(), z);
    }

    private static synchronized zzayz zzs(Context context, Executor executor, zzfvj zzfvjVar, boolean z) {
        zzfvj zzfvjVar2;
        zzbac zzbacVar;
        try {
            if (zzb == null) {
                zzfvh zzfvhVarZza = zzfvh.zza(context, executor, z);
                zzazn zzaznVarZza = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzej)).booleanValue() ? zzazn.zza(context) : null;
                zzbat zzbatVarZza = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzek)).booleanValue() ? zzbat.zza(context, executor) : null;
                zzbal zzbalVar = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzds)).booleanValue() ? new zzbal() : null;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdB)).booleanValue()) {
                    zzbacVar = new zzbac();
                    zzfvjVar2 = zzfvjVar;
                } else {
                    zzfvjVar2 = zzfvjVar;
                    zzbacVar = null;
                }
                zzfvx zzfvxVarZza = zzfvx.zza(context, executor, zzfvhVarZza, zzfvjVar2);
                zzbad zzbadVar = new zzbad(context);
                zzbae zzbaeVar = new zzbae(zzfvjVar, zzfvxVarZza, new zzbar(context, zzbadVar), zzbadVar, zzaznVarZza, zzbatVarZza, zzbalVar, zzbacVar);
                zzbch zzbchVarZzb = zzfwe.zzb(context, zzfvhVarZza);
                zzfvc zzfvcVar = new zzfvc();
                zzayz zzayzVar = new zzayz(context, zzfvhVarZza, new zzfwr(context, zzbchVarZzb), new zzfwy(context, zzbchVarZzb, new zzayw(zzfvhVarZza), ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdc)).booleanValue()), new zzfxa(context, zzbaeVar, zzfvhVarZza, zzfvcVar, false), zzbaeVar, executor, zzfvcVar, zzbchVarZzb, zzbatVarZza, zzbalVar, zzbacVar);
                zzb = zzayzVar;
                zzayzVar.zzc();
                zzb.zzm();
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzb;
    }

    private final void zzt() {
        zzbat zzbatVar = this.zzm;
        if (zzbatVar != null) {
            zzbatVar.zzb();
        }
    }

    private final zzfwq zzu(int i) {
        if (zzfwe.zza(this.zzj)) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzda)).booleanValue() ? this.zze.zzc(1) : this.zzd.zzb(1);
        }
        return null;
    }

    public final synchronized boolean zzb() {
        return this.zzr;
    }

    public final synchronized void zzc() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzfwq zzfwqVarZzu = zzu(1);
        if (zzfwqVarZzu == null) {
            this.zzh.zzb(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.zzf.zza(zzfwqVarZzu)) {
            this.zzr = true;
            this.zzl.countDown();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final void zzd(MotionEvent motionEvent) {
        zzfvk zzfvkVarZzb = this.zzf.zzb();
        if (zzfvkVarZzb != null) {
            try {
                zzfvkVarZzb.zzd(null, motionEvent);
            } catch (zzfwz e) {
                this.zzh.zzc(e.zza(), -1L, e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final void zze(int i, int i2, int i3) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznu)).booleanValue() || (displayMetrics = this.zzc.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f = i;
        float f2 = displayMetrics.density;
        float f3 = i2;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, f * f2, f3 * f2, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(motionEventObtain);
        motionEventObtain.recycle();
        float f4 = displayMetrics.density;
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 2, f * f4, f3 * f4, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(motionEventObtain2);
        motionEventObtain2.recycle();
        float f5 = displayMetrics.density;
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, i3, 1, f * f5, f3 * f5, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzf(Context context, String str, View view, Activity activity) {
        zzt();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzds)).booleanValue()) {
            this.zzn.zzc();
        }
        zzm();
        zzfvk zzfvkVarZzb = this.zzf.zzb();
        if (zzfvkVarZzb == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzc = zzfvkVarZzb.zzc(context, null, str, view, activity);
        this.zzh.zzd(5000, System.currentTimeMillis() - jCurrentTimeMillis, strZzc, null);
        return strZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzg(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final void zzh(View view) {
        this.zzg.zza(view);
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        zzbac zzbacVar = this.zzo;
        if (zzbacVar != null) {
            zzbacVar.zza(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzj(Context context, View view, Activity activity) {
        zzt();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzds)).booleanValue()) {
            this.zzn.zzb(context, view);
        }
        zzm();
        zzfvk zzfvkVarZzb = this.zzf.zzb();
        if (zzfvkVarZzb == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzb = zzfvkVarZzb.zzb(context, null, view, activity);
        this.zzh.zzd(5002, System.currentTimeMillis() - jCurrentTimeMillis, strZzb, null);
        return strZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzk(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzl(Context context) {
        zzt();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzds)).booleanValue()) {
            this.zzn.zza();
        }
        zzm();
        zzfvk zzfvkVarZzb = this.zzf.zzb();
        if (zzfvkVarZzb == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZza = zzfvkVarZzb.zza(context, null);
        this.zzh.zzd(5001, System.currentTimeMillis() - jCurrentTimeMillis, strZza, null);
        return strZza;
    }

    public final void zzm() {
        if (this.zzq) {
            return;
        }
        synchronized (this.zzp) {
            try {
                if (!this.zzq) {
                    if ((System.currentTimeMillis() / 1000) - this.zza < 3600) {
                        return;
                    }
                    zzfwq zzfwqVarZzc = this.zzf.zzc();
                    if ((zzfwqVarZzc == null || zzfwqVarZzc.zze(3600L)) && zzfwe.zza(this.zzj)) {
                        this.zzi.execute(new zzayy(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void zzn() {
        String str;
        String strZzb;
        int length;
        zzfwq zzfwqVarZzu;
        zzbcp zzbcpVarZza;
        boolean zZza;
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzfwq zzfwqVarZzu2 = zzu(1);
        if (zzfwqVarZzu2 != null) {
            String strZza = zzfwqVarZzu2.zza().zza();
            strZzb = zzfwqVarZzu2.zza().zzb();
            str = strZza;
        } else {
            str = null;
            strZzb = null;
        }
        try {
            try {
                Context context = this.zzc;
                zzbch zzbchVar = this.zzj;
                zzfvh zzfvhVar = this.zzh;
                zzfwv zzfwvVarZza = zzfvq.zza(context, 1, zzbchVar, str, strZzb, "1", zzfvhVar);
                byte[] bArr = zzfwvVarZza.zzb;
                if (bArr == null || (length = bArr.length) == 0) {
                    zzfvhVar.zzb(5009, System.currentTimeMillis() - jCurrentTimeMillis);
                } else {
                    try {
                        zzbcj zzbcjVarZzd = zzbcj.zzd(zzian.zzs(bArr, 0, length), zzibb.zza());
                        if (zzbcjVarZzd.zza().zza().isEmpty() || zzbcjVarZzd.zza().zzb().isEmpty() || zzbcjVarZzd.zzc().zzy().length == 0 || ((zzfwqVarZzu = zzu(1)) != null && (zzbcpVarZza = zzfwqVarZzu.zza()) != null && zzbcjVarZzd.zza().zza().equals(zzbcpVarZza.zza()) && zzbcjVarZzd.zza().zzb().equals(zzbcpVarZza.zzb()))) {
                            this.zzh.zzb(5010, System.currentTimeMillis() - jCurrentTimeMillis);
                        } else {
                            zzfwx zzfwxVar = this.zzk;
                            int i = zzfwvVarZza.zzc;
                            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzda)).booleanValue()) {
                                zZza = this.zzd.zza(zzbcjVarZzd, zzfwxVar);
                            } else if (i == 3) {
                                zZza = this.zze.zzb(zzbcjVarZzd);
                            } else {
                                if (i == 4) {
                                    zZza = this.zze.zza(zzbcjVarZzd, zzfwxVar);
                                }
                                this.zzh.zzb(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                            if (zZza) {
                                zzfwq zzfwqVarZzu3 = zzu(1);
                                if (zzfwqVarZzu3 != null) {
                                    if (this.zzf.zza(zzfwqVarZzu3)) {
                                        this.zzr = true;
                                    }
                                    this.zza = System.currentTimeMillis() / 1000;
                                }
                            } else {
                                this.zzh.zzb(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                        }
                    } catch (NullPointerException unused) {
                        this.zzh.zzb(2030, System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                }
            } catch (zzicg e) {
                this.zzh.zzc(4002, System.currentTimeMillis() - jCurrentTimeMillis, e);
            }
            this.zzl.countDown();
        } catch (Throwable th) {
            this.zzl.countDown();
            throw th;
        }
    }

    public final /* synthetic */ zzfvh zzo() {
        return this.zzh;
    }

    public final /* synthetic */ Object zzp() {
        return this.zzp;
    }

    public final /* synthetic */ boolean zzq() {
        return this.zzq;
    }

    public final /* synthetic */ void zzr(boolean z) {
        this.zzq = z;
    }
}
