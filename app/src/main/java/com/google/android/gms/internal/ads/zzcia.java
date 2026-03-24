package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import defpackage.AbstractC3264qG;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzcia extends zzchr implements zzcfu {
    public static final /* synthetic */ int zzd = 0;
    private zzcfv zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzchj zzi;
    private long zzj;
    private long zzk;

    public zzcia(zzcge zzcgeVar, zzcgd zzcgdVar) {
        super(zzcgeVar);
        zzcit zzcitVar = new zzcit(zzcgeVar.getContext(), zzcgdVar, (zzcge) this.zzc.get(), null);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("ExoPlayerAdapter initialized.");
        this.zze = zzcitVar;
        zzcitVar.zzs(this);
    }

    public static final String zzc(String str) {
        return "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzf(str)));
    }

    private final void zzd(long j) {
        com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchy
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws Throwable {
                this.zza.zzb();
            }
        }, j);
    }

    private static String zzx(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        AbstractC3264qG.v(sb, str, "/", canonicalName, ":");
        sb.append(message);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzchr, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzcfv zzcfvVar = this.zze;
        if (zzcfvVar != null) {
            zzcfvVar.zzs(null);
            this.zze.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzD() {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Precache onRenderedFirstFrame");
    }

    public final zzcfv zza() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzs(null);
        zzcfv zzcfvVar = this.zze;
        this.zze = null;
        return zzcfvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void zzb() throws Throwable {
        String str;
        zzcia zzciaVar;
        zzcia zzciaVar2;
        long jLongValue;
        long jIntValue;
        boolean zBooleanValue;
        zzcia zzciaVar3;
        long j;
        long j2;
        String str2;
        zzcia zzciaVar4;
        long j3;
        String strZzc = zzc(this.zzf);
        try {
            jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzah)).longValue() * 1000;
            jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzw)).intValue();
            zzbgv zzbgvVar = zzbhe.zzcw;
            zzbhc zzbhcVarZzc = com.google.android.gms.ads.internal.client.zzbd.zzc();
            zBooleanValue = ((Boolean) zzbhcVarZzc.zzd(zzbgvVar)).booleanValue();
            try {
            } catch (Throwable th) {
                th = th;
                zzciaVar = zBooleanValue;
                str = zzbhcVarZzc;
            }
        } catch (Exception e) {
            e = e;
            str = strZzc;
            zzciaVar = this;
        }
        synchronized (this) {
            try {
                if (com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzj > jLongValue) {
                    StringBuilder sb = new StringBuilder(String.valueOf(jLongValue).length() + 27);
                    sb.append("Timeout reached. Limit: ");
                    sb.append(jLongValue);
                    sb.append(" ms");
                    throw new IOException(sb.toString());
                }
                if (this.zzg) {
                    throw new IOException("Abort requested before buffering finished. ");
                }
                if (!this.zzh) {
                    if (!this.zze.zzB()) {
                        throw new IOException("ExoPlayer was released during preloading.");
                    }
                    long jZzH = this.zze.zzH();
                    if (jZzH > 0) {
                        long jZzN = this.zze.zzN();
                        if (jZzN != this.zzk) {
                            try {
                                j2 = jIntValue;
                                str2 = strZzc;
                                try {
                                    zzm(this.zzf, strZzc, jZzN, jZzH, jZzN > 0, zBooleanValue != 0 ? this.zze.zzI() : -1L, zBooleanValue != 0 ? this.zze.zzJ() : -1L, zBooleanValue != 0 ? this.zze.zzK() : -1L, zzcfv.zzP(), zzcfv.zzQ());
                                    zzciaVar4 = this;
                                    j = jZzN;
                                } catch (Throwable th2) {
                                    th = th2;
                                    zzciaVar4 = this;
                                    str = str2;
                                    zzciaVar = zzciaVar4;
                                    try {
                                        throw th;
                                    } catch (Exception e2) {
                                        e = e2;
                                        String str3 = zzciaVar.zzf;
                                        String message = e.getMessage();
                                        String strM = AbstractC3264qG.m(new StringBuilder(String.valueOf(str3).length() + 34 + String.valueOf(message).length()), "Failed to preload url ", str3, " Exception: ", message);
                                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                                        com.google.android.gms.ads.internal.util.client.zzo.zzi(strM);
                                        com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "VideoStreamExoPlayerCache.preload");
                                        release();
                                        zzciaVar.zzq(zzciaVar.zzf, str, "error", zzx("error", e));
                                        zzciaVar2 = zzciaVar;
                                        com.google.android.gms.ads.internal.zzt.zzB().zzd(zzciaVar2.zzi);
                                    }
                                }
                                try {
                                    zzciaVar4.zzk = j;
                                    j3 = jZzH;
                                    zzciaVar4 = zzciaVar4;
                                } catch (Throwable th3) {
                                    th = th3;
                                    str = str2;
                                    zzciaVar = zzciaVar4;
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                str2 = strZzc;
                                zzciaVar4 = this;
                            }
                        } else {
                            j = jZzN;
                            j2 = jIntValue;
                            str2 = strZzc;
                            zzciaVar4 = this;
                            j3 = jZzH;
                        }
                        if (j >= j3) {
                            zzciaVar4.zzp(zzciaVar4.zzf, str2, j3);
                        } else {
                            long jZzO = zzciaVar4.zze.zzO();
                            zzciaVar3 = zzciaVar4;
                            if (jZzO >= j2) {
                                zzciaVar3 = zzciaVar4;
                                if (j > 0) {
                                }
                            }
                        }
                        zzciaVar2 = zzciaVar4;
                    } else {
                        zzciaVar3 = this;
                    }
                    zzciaVar3.zzd(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzai)).longValue());
                    return;
                }
                zzciaVar2 = this;
                com.google.android.gms.ads.internal.zzt.zzB().zzd(zzciaVar2.zzi);
            } catch (Throwable th5) {
                th = th5;
                str = strZzc;
                zzciaVar = this;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final boolean zze(String str) {
        return zzf(str, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [int] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v3, types: [long] */
    @Override // com.google.android.gms.internal.ads.zzchr
    public final boolean zzf(String str, String[] strArr) throws Throwable {
        String str2;
        String str3;
        zzcia zzciaVar;
        Clock clock;
        long j;
        long j2;
        String str4;
        ?? r5;
        String str5;
        String str6;
        long j3;
        long j4;
        String str7;
        long j5;
        long j6;
        zzcia zzciaVar2 = this;
        String str8 = str;
        zzciaVar2.zzf = str8;
        String strZzc = zzc(str);
        String str9 = " ms";
        String str10 = "Timeout reached. Limit: ";
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            zzciaVar2.zze.zzq(uriArr, zzciaVar2.zzb);
            zzcge zzcgeVar = (zzcge) zzciaVar2.zzc.get();
            if (zzcgeVar != null) {
                zzcgeVar.zzt(strZzc, zzciaVar2);
            }
            Clock clockZzk = com.google.android.gms.ads.internal.zzt.zzk();
            long jCurrentTimeMillis = clockZzk.currentTimeMillis();
            long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzai)).longValue();
            long jLongValue2 = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzah)).longValue() * 1000;
            long jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzw)).intValue();
            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcw)).booleanValue();
            long j7 = -1;
            ?? r6 = jLongValue2;
            while (true) {
                synchronized (this) {
                    try {
                        if (clockZzk.currentTimeMillis() - jCurrentTimeMillis > r6) {
                            long j8 = r6;
                            StringBuilder sb = new StringBuilder(String.valueOf(j8).length() + 27);
                            sb.append(str10);
                            sb.append(j8);
                            sb.append(str9);
                            throw new IOException(sb.toString());
                        }
                        if (zzciaVar2.zzg) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (zzciaVar2.zzh) {
                            break;
                        }
                        if (!zzciaVar2.zze.zzB()) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        String str11 = str9;
                        String str12 = str10;
                        long jZzH = zzciaVar2.zze.zzH();
                        if (jZzH > 0) {
                            long jZzN = zzciaVar2.zze.zzN();
                            if (jZzN != j7) {
                                try {
                                    j = jIntValue;
                                    j2 = r6;
                                    j6 = jZzH;
                                    j4 = jLongValue;
                                    clock = clockZzk;
                                    str5 = str12;
                                    str6 = str11;
                                    str7 = strZzc;
                                } catch (Throwable th) {
                                    th = th;
                                    str7 = strZzc;
                                }
                                try {
                                    zzm(str, strZzc, jZzN, j6, jZzN > 0, zBooleanValue ? zzciaVar2.zze.zzI() : -1L, zBooleanValue ? zzciaVar2.zze.zzJ() : -1L, zBooleanValue ? zzciaVar2.zze.zzK() : -1L, zzcfv.zzP(), zzcfv.zzQ());
                                    j7 = jZzN;
                                    j5 = jZzH;
                                    str4 = j6;
                                } catch (Throwable th2) {
                                    th = th2;
                                    zzciaVar = this;
                                    str2 = str;
                                    str3 = str7;
                                    try {
                                        throw th;
                                    } catch (Exception e) {
                                        e = e;
                                        String message = e.getMessage();
                                        String strM = AbstractC3264qG.m(new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length()), "Failed to preload url ", str2, " Exception: ", message);
                                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                                        com.google.android.gms.ads.internal.util.client.zzo.zzi(strM);
                                        com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "VideoStreamExoPlayerCache.preload");
                                        release();
                                        zzciaVar.zzq(str2, str3, "error", zzx("error", e));
                                        return false;
                                    }
                                }
                            } else {
                                clock = clockZzk;
                                j = jIntValue;
                                j2 = r6;
                                j4 = jLongValue;
                                str7 = strZzc;
                                str5 = str12;
                                str6 = str11;
                                j5 = jZzH;
                                str4 = r6;
                            }
                            r5 = (jZzN > j5 ? 1 : (jZzN == j5 ? 0 : -1));
                            if (r5 >= 0) {
                                zzp(str, str7, j5);
                                break;
                            }
                            try {
                                zzcia zzciaVar3 = this;
                                str4 = str;
                                str3 = str7;
                                if (zzciaVar3.zze.zzO() >= j && jZzN > 0) {
                                    break;
                                }
                                j3 = j4;
                                r5 = zzciaVar3;
                            } catch (Throwable th3) {
                                th = th3;
                                zzciaVar = r5;
                                str2 = str4;
                                throw th;
                            }
                        } else {
                            clock = clockZzk;
                            j = jIntValue;
                            j2 = r6;
                            str4 = str8;
                            str3 = strZzc;
                            r5 = zzciaVar2;
                            str5 = str12;
                            str6 = str11;
                            j3 = jLongValue;
                        }
                        try {
                            r5.wait(j3);
                        } catch (InterruptedException unused) {
                            throw new IOException("Wait interrupted.");
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        str2 = str8;
                        str3 = strZzc;
                        zzciaVar = zzciaVar2;
                    }
                }
                str10 = str5;
                jLongValue = j3;
                zzciaVar2 = r5;
                str8 = str4;
                strZzc = str3;
                str9 = str6;
                jIntValue = j;
                r6 = j2;
                clockZzk = clock;
            }
            return true;
        } catch (Exception e2) {
            e = e2;
            str2 = str8;
            str3 = strZzc;
            zzciaVar = zzciaVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final boolean zzg(String str, String[] strArr, zzchj zzchjVar) {
        this.zzf = str;
        this.zzi = zzchjVar;
        String strZzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.zze.zzq(uriArr, this.zzb);
            zzcge zzcgeVar = (zzcge) this.zzc.get();
            if (zzcgeVar != null) {
                zzcgeVar.zzt(strZzc, this);
            }
            this.zzj = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            this.zzk = -1L;
            zzd(0L);
            return true;
        } catch (Exception e) {
            String message = e.getMessage();
            String strM = AbstractC3264qG.m(new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length()), "Failed to preload url ", str, " Exception: ", message);
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(strM);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "VideoStreamExoPlayerCache.preload");
            release();
            zzq(str, strZzc, "error", zzx("error", e));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzh(int i) {
        this.zze.zzG(i);
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzi(int i) {
        this.zze.zzF(i);
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzj(int i) {
        this.zze.zzy(i);
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzk(int i) {
        this.zze.zzz(i);
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzl() {
        synchronized (this) {
            this.zzg = true;
            notify();
            release();
        }
        String str = this.zzf;
        if (str != null) {
            zzq(this.zzf, zzc(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzr(final boolean z, final long j) {
        final zzcge zzcgeVar = (zzcge) this.zzc.get();
        if (zzcgeVar != null) {
            zzcei.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcgeVar.zzu(z, j);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzs(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzt(int i, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzu(String str, Exception exc) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Precache error", exc);
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcfu
    public final void zzv(String str, Exception exc) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Precache exception", exc);
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "VideoStreamExoPlayerCache.onException");
    }
}
