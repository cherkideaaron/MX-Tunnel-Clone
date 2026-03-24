package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.AbstractC3598wQ;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class zzbsl {
    private final Context zzb;
    private final String zzc;
    private final VersionInfoParcel zzd;
    private final zzfor zze;
    private final com.google.android.gms.ads.internal.util.zzbc zzf;
    private final com.google.android.gms.ads.internal.util.zzbc zzg;
    private zzbsk zzh;
    private final Object zza = new Object();
    private int zzi = 1;

    public zzbsl(Context context, VersionInfoParcel versionInfoParcel, String str, com.google.android.gms.ads.internal.util.zzbc zzbcVar, com.google.android.gms.ads.internal.util.zzbc zzbcVar2, zzfor zzforVar) {
        this.zzc = str;
        this.zzb = context.getApplicationContext();
        this.zzd = versionInfoParcel;
        this.zze = zzforVar;
        this.zzf = zzbcVar;
        this.zzg = zzbcVar2;
    }

    public final zzbsk zza(zzazh zzazhVar) {
        zzfoe zzfoeVarA = AbstractC3598wQ.a(this.zzb, 6);
        zzfoeVarA.zza();
        final zzbsk zzbskVar = new zzbsk(this.zzg);
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        final zzazh zzazhVar2 = null;
        zzcei.zzf.execute(new Runnable(zzazhVar2, zzbskVar) { // from class: com.google.android.gms.internal.ads.zzbsb
            private final /* synthetic */ zzbsk zzb;

            {
                this.zzb = zzbskVar;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd(null, this.zzb);
            }
        });
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine: Promise created");
        zzbskVar.zze(new zzbru(this, zzbskVar, zzfoeVarA), new zzbrv(this, zzbskVar, zzfoeVarA));
        return zzbskVar;
    }

    public final zzbsf zzb(zzazh zzazhVar) {
        com.google.android.gms.ads.internal.util.zze.zza("getEngine: Trying to acquire lock");
        Object obj = this.zza;
        synchronized (obj) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("getEngine: Lock acquired");
                com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Trying to acquire lock");
                synchronized (obj) {
                    try {
                        com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Lock acquired");
                        zzbsk zzbskVar = this.zzh;
                        if (zzbskVar != null && this.zzi == 0) {
                            zzbskVar.zze(new zzcer() { // from class: com.google.android.gms.internal.ads.zzbrx
                                @Override // com.google.android.gms.internal.ads.zzcer
                                public final /* synthetic */ void zza(Object obj2) {
                                    this.zza.zze((zzbrg) obj2);
                                }
                            }, zzbry.zza);
                        }
                    } finally {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Lock released");
        zzbsk zzbskVar2 = this.zzh;
        if (zzbskVar2 != null && zzbskVar2.zzi() != -1) {
            int i = this.zzi;
            if (i == 0) {
                com.google.android.gms.ads.internal.util.zze.zza("getEngine (NO_UPDATE): Lock released");
                return this.zzh.zza();
            }
            if (i != 1) {
                com.google.android.gms.ads.internal.util.zze.zza("getEngine (UPDATING): Lock released");
                return this.zzh.zza();
            }
            this.zzi = 2;
            zza(null);
            com.google.android.gms.ads.internal.util.zze.zza("getEngine (PENDING_UPDATE): Lock released");
            return this.zzh.zza();
        }
        this.zzi = 2;
        this.zzh = zza(null);
        com.google.android.gms.ads.internal.util.zze.zza("getEngine (NULL or REJECTED): Lock released");
        return this.zzh.zza();
    }

    public final void zzc() {
        zzbsk zzbskVar = this.zzh;
        if (zzbskVar != null) {
            zzbskVar.zzc();
            this.zzh = null;
        }
    }

    public final /* synthetic */ void zzd(zzazh zzazhVar, final zzbsk zzbskVar) {
        String str;
        final long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        final ArrayList arrayList = new ArrayList();
        try {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before createJavascriptEngine");
            final zzbro zzbroVar = new zzbro(this.zzb, this.zzd, null, null);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After createJavascriptEngine");
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before setting new engine loaded listener");
            zzbroVar.zzi(new zzbrf() { // from class: com.google.android.gms.internal.ads.zzbrz
                @Override // com.google.android.gms.internal.ads.zzbrf
                public final /* synthetic */ void zza() {
                    long jCurrentTimeMillis2 = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
                    final long j = jCurrentTimeMillis;
                    final ArrayList arrayList2 = arrayList;
                    arrayList2.add(Long.valueOf(jCurrentTimeMillis2 - j));
                    String strValueOf = String.valueOf(arrayList2.get(0));
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 52);
                    sb.append("LoadNewJavascriptEngine(onEngLoaded) latency is ");
                    sb.append(strValueOf);
                    sb.append(" ms.");
                    com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                    zzfyn zzfynVar = com.google.android.gms.ads.internal.util.zzs.zza;
                    final zzbsl zzbslVar = this.zza;
                    final zzbsk zzbskVar2 = zzbskVar;
                    final zzbrg zzbrgVar = zzbroVar;
                    zzfynVar.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbsa
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzbslVar.zzf(zzbskVar2, zzbrgVar, arrayList2, j);
                        }
                    }, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzd)).intValue());
                }
            });
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
            zzbroVar.zzm("/jsLoaded", new zzbrq(this, jCurrentTimeMillis, zzbskVar, zzbroVar));
            com.google.android.gms.ads.internal.util.zzbv zzbvVar = new com.google.android.gms.ads.internal.util.zzbv();
            zzbrr zzbrrVar = new zzbrr(this, null, zzbroVar, zzbvVar);
            zzbvVar.zzb(zzbrrVar);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
            if (!((Boolean) zzbje.zzd.zze()).booleanValue() || TextUtils.equals(this.zzb.getPackageName(), "com.google.android.gms")) {
                zzbroVar.zzm("/requestReload", zzbrrVar);
            }
            String str2 = this.zzc;
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(str2)));
            if (str2.endsWith(".js")) {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadJavascript");
                zzbroVar.zzf(str2);
                str = "loadJavascriptEngine > After newEngine.loadJavascript";
            } else if (str2.startsWith("<html>")) {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadHtml");
                zzbroVar.zzh(str2);
                str = "loadJavascriptEngine > After newEngine.loadHtml";
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                zzbroVar.zzg(str2);
                str = "loadJavascriptEngine > After newEngine.loadHtmlWrapper";
            }
            com.google.android.gms.ads.internal.util.zze.zza(str);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new zzbrt(this, zzbskVar, zzbroVar, arrayList, jCurrentTimeMillis), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zze)).intValue());
        } catch (Throwable th) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error creating webview.", th);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziK)).booleanValue()) {
                zzbskVar.zzh(th, "SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine");
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziM)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbskVar.zzg();
            } else {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbskVar.zzg();
            }
        }
    }

    public final /* synthetic */ void zze(zzbrg zzbrgVar) {
        if (zzbrgVar.zzk()) {
            this.zzi = 1;
        }
    }

    public final /* synthetic */ void zzf(zzbsk zzbskVar, final zzbrg zzbrgVar, ArrayList arrayList, long j) {
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
        synchronized (this.zza) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
                if (zzbskVar.zzi() != -1 && zzbskVar.zzi() != 1) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziK)).booleanValue()) {
                        zzbskVar.zzh(new TimeoutException("Unable to receive /jsLoaded GMSG."), "SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener");
                    } else {
                        zzbskVar.zzg();
                    }
                    zzgzy zzgzyVar = zzcei.zzf;
                    Objects.requireNonNull(zzbrgVar);
                    zzgzyVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbrw
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzbrgVar.zzj();
                        }
                    });
                    String strValueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzd));
                    int iZzi = zzbskVar.zzi();
                    int i = this.zzi;
                    String strValueOf2 = String.valueOf(arrayList.get(0));
                    long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - j;
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 94 + String.valueOf(iZzi).length() + 39 + String.valueOf(i).length() + 57 + strValueOf2.length() + 42 + String.valueOf(jCurrentTimeMillis).length() + 15);
                    sb.append("Could not receive /jsLoaded in ");
                    sb.append(strValueOf);
                    sb.append(" ms. JS engine session reference status(onEngLoadedTimeout) is ");
                    sb.append(iZzi);
                    sb.append(". Update status(onEngLoadedTimeout) is ");
                    sb.append(i);
                    sb.append(". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is ");
                    sb.append(strValueOf2);
                    sb.append(" ms. Total latency(onEngLoadedTimeout) is ");
                    sb.append(jCurrentTimeMillis);
                    sb.append(" ms. Rejecting.");
                    com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                    com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                    return;
                }
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ Object zzg() {
        return this.zza;
    }

    public final /* synthetic */ zzfor zzh() {
        return this.zze;
    }

    public final /* synthetic */ zzbsk zzi() {
        return this.zzh;
    }

    public final /* synthetic */ void zzj(zzbsk zzbskVar) {
        this.zzh = zzbskVar;
    }

    public final /* synthetic */ int zzk() {
        return this.zzi;
    }

    public final /* synthetic */ void zzl(int i) {
        this.zzi = i;
    }
}
