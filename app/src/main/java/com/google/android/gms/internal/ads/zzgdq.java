package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import defpackage.As;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class zzgdq implements zzgdh, zzgdd, zzgdw {
    private static final zzifd zza;
    private final Context zzb;
    private final zzgcl zzc;
    private final ExecutorService zzd;
    private final zzgce zze;
    private final boolean zzf;
    private final String zzg;
    private final long zzh;
    private final long zzi;
    private final double zzj;
    private final String zzk;
    private final long zzl;
    private final AtomicBoolean zzm = new AtomicBoolean(false);
    private final Object zzn = new Object();
    private final Object zzo = new Object();
    private final Object zzp = new Object();
    private final zzavj zzq = zzavk.zza();
    private final List zzr = new ArrayList();
    private boolean zzs = false;
    private final HashMap zzt = new HashMap();

    static {
        zzifc zzifcVarZzc = zzifd.zzc();
        zzifcVarZzc.zza(17);
        zza = (zzifd) zzifcVarZzc.zzbu();
    }

    public zzgdq(Context context, zzgcl zzgclVar, ExecutorService executorService, zzgce zzgceVar, Random random, String str, long j, long j2, double d, String str2, long j3) {
        this.zzb = context;
        this.zzc = zzgclVar;
        this.zzd = executorService;
        this.zze = zzgceVar;
        this.zzg = str;
        this.zzh = j;
        this.zzi = j2;
        this.zzj = d;
        this.zzk = str2;
        this.zzl = j3;
        this.zzf = random.nextDouble() < d;
    }

    @Override // com.google.android.gms.internal.ads.zzgdd
    public final As zza() {
        return zzgzo.zze(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgdo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzf();
            }
        }, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final void zzb(int i, long j, Throwable th, String str) {
        long jLongValue;
        if (this.zzf) {
            synchronized (this.zzo) {
                try {
                    List list = this.zzr;
                    synchronized (this.zzp) {
                        try {
                            HashMap map = this.zzt;
                            Integer numValueOf = Integer.valueOf(i);
                            Long l = (Long) map.get(numValueOf);
                            if (l == null) {
                                l = 0L;
                            }
                            jLongValue = l.longValue() + 1;
                            map.put(numValueOf, Long.valueOf(jLongValue));
                        } finally {
                        }
                    }
                    list.add(new zzgdn(i, j, th, str, jLongValue));
                    if (!this.zzs) {
                        this.zzs = true;
                        this.zzc.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgdp
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() throws IOException {
                                this.zza.zzd();
                            }
                        }, this.zzi);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdw
    public final void zzc(zzgdv zzgdvVar) {
        synchronized (this.zzn) {
            this.zzq.zzj(zzgdvVar.zza());
        }
    }

    public final void zzd() throws IOException {
        zzavj zzavjVar;
        zzguf zzgufVarZzq;
        String string;
        StringWriter stringWriter;
        synchronized (this.zzn) {
            zzavjVar = (zzavj) this.zzq.clone();
        }
        synchronized (this.zzo) {
            List list = this.zzr;
            zzgufVarZzq = zzguf.zzq(list);
            list.clear();
            this.zzs = false;
        }
        int size = zzgufVarZzq.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            zzgdn zzgdnVar = (zzgdn) zzgufVarZzq.get(i);
            if (i2 >= this.zzh) {
                zze((zzavk) zzavjVar.zzbu());
                zzavjVar.zzb();
                i2 = 0;
            }
            zzawb zzawbVarZza = zzawc.zza();
            zzawbVarZza.zza(zzgdnVar.zza);
            zzawbVarZza.zzb(zzgdnVar.zzb);
            zzawbVarZza.zze(zzgdnVar.zze);
            String str = zzgdnVar.zzd;
            if (str != null) {
                zzawbVarZza.zzf(str);
            }
            Throwable th = zzgdnVar.zzc;
            zzawbVarZza.zzg(th == null ? 2 : 3);
            if (th != null) {
                zzawbVarZza.zzc(th.getClass().getName());
                try {
                    stringWriter = new StringWriter();
                } catch (IOException unused) {
                    string = "";
                }
                try {
                    PrintWriter printWriter = new PrintWriter(stringWriter);
                    try {
                        th.printStackTrace(printWriter);
                        string = stringWriter.toString();
                        printWriter.close();
                        stringWriter.close();
                        zzawbVarZza.zzd(string);
                    } catch (Throwable th2) {
                        try {
                            printWriter.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    try {
                        stringWriter.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            }
            zzavjVar.zza((zzawc) zzawbVarZza.zzbu());
            i++;
            i2++;
        }
        if (i2 > 0) {
            zze((zzavk) zzavjVar.zzbu());
            zzavjVar.zzb();
        }
    }

    public final void zze(zzavk zzavkVar) {
        try {
            zzgdl zzgdlVarZza = zzgdm.zza();
            zzgdlVarZza.zzb(zza);
            zzgdj zzgdjVarZza = zzgdk.zza();
            zzgdjVarZza.zza(zzavkVar);
            zzgdlVarZza.zza((zzgdk) zzgdjVarZza.zzbu());
            this.zze.zzb(this.zzg, ((zzgdm) zzgdlVarZza.zzbu()).zzaN(), "application/x-protobuf");
        } catch (RuntimeException unused) {
        }
    }

    public final /* synthetic */ void zzf() {
        int i;
        if (!this.zzf || this.zzm.getAndSet(true)) {
            return;
        }
        Context context = this.zzb;
        String str = this.zzk;
        double d = this.zzj;
        long j = this.zzl;
        Locale locale = Locale.getDefault();
        zzavj zzavjVarZza = zzavk.zza();
        zzavjVarZza.zzc(Build.VERSION.SDK_INT);
        zzavjVarZza.zzd(Build.MODEL);
        zzavjVarZza.zze(locale.getLanguage());
        zzavjVarZza.zzf(locale.getCountry());
        zzavjVarZza.zzi(str);
        zzavjVarZza.zzg(context.getPackageName());
        zzavjVarZza.zzl(j);
        if (d > 0.0d) {
            zzavjVarZza.zzk((int) (1.0d / d));
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            zzavjVarZza.zzh(packageManager.getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (Exception unused) {
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                i = 5;
            } else if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                i = 4;
            } else if (packageManager.hasSystemFeature("android.hardware.type.pc")) {
                i = 7;
            } else {
                UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
                i = (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) ? 2 : 6;
            }
            zzavjVarZza.zzm(i);
        } catch (RuntimeException unused2) {
        }
        zzavk zzavkVar = (zzavk) zzavjVarZza.zzbu();
        synchronized (this.zzn) {
            this.zzq.zzbo(zzavkVar);
        }
    }
}
