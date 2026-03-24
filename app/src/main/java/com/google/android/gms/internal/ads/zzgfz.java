package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
final class zzgfz implements zzgfx {
    ClassLoader zza;
    private final Context zzb;
    private final ExecutorService zzc;
    private final zzgfe zzd;
    private final zzgfw zze;
    private final zzgoe zzf;
    private final Set zzh;
    private final long zzj;
    private final File zzk;
    private boolean zzl;
    private byte[] zzm;
    private final String zzg = "1764808731656";
    private final Map zzi = new HashMap();

    public zzgfz(Context context, ExecutorService executorService, zzgfe zzgfeVar, zzgfw zzgfwVar, File file, zzgoe zzgoeVar, long j, String str, String str2, String str3, Set set) {
        this.zzb = context;
        this.zzc = executorService;
        this.zzd = zzgfeVar;
        this.zze = zzgfwVar;
        this.zzf = zzgoeVar;
        this.zzh = set;
        this.zzk = new File(file, "rbp");
        this.zzj = j;
    }

    private final void zze(File file, String str) throws Throwable {
        FileInputStream fileInputStream;
        if (new File(file.toString().concat("/1764808731656.tmp")).exists()) {
            return;
        }
        File file2 = new File(file.toString().concat("/1764808731656.dex"));
        if (!file2.exists()) {
            return;
        }
        long length = file2.length();
        if (length <= 0) {
            return;
        }
        byte[] bArr = new byte[(int) length];
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file2);
                try {
                } catch (zzgfv e) {
                    e = e;
                    fileInputStream2 = fileInputStream;
                    this.zzf.zzd(301, e);
                    zzh(fileInputStream2);
                    zzf(file2);
                    return;
                } catch (IOException e2) {
                    e = e2;
                    fileInputStream2 = fileInputStream;
                    this.zzf.zzd(301, e);
                    zzh(fileInputStream2);
                    zzf(file2);
                    return;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    zzh(fileInputStream2);
                    zzf(file2);
                    throw th;
                }
            } catch (zzgfv e3) {
                e = e3;
            } catch (IOException e4) {
                e = e4;
            }
            if (fileInputStream.read(bArr) <= 0) {
                zzh(fileInputStream);
                zzf(file2);
                return;
            }
            zzaxj zzaxjVarZzg = zzaxk.zzg();
            byte[] bytes = Build.VERSION.SDK.getBytes();
            zzian zzianVar = zzian.zza;
            zzaxjVarZzg.zzd(zzian.zzs(bytes, 0, bytes.length));
            byte[] bytes2 = "1764808731656".getBytes();
            zzaxjVarZzg.zzc(zzian.zzs(bytes2, 0, bytes2.length));
            throw new zzgfv();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static void zzf(File file) {
        if (file.exists()) {
            file.delete();
        }
    }

    private static void zzg(String str) {
        zzf(new File(str));
    }

    private static void zzh(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x01fb A[Catch: all -> 0x0032, zzgcb -> 0x0035, TryCatch #8 {zzgcb -> 0x0035, blocks: (B:5:0x000c, B:7:0x0011, B:9:0x001a, B:11:0x0029, B:21:0x003e, B:22:0x0040, B:33:0x009c, B:82:0x01d6, B:83:0x01ef, B:84:0x01f5, B:86:0x01fb, B:88:0x0211, B:89:0x0220, B:92:0x0224, B:93:0x023d, B:36:0x00d3, B:47:0x0120, B:66:0x019e, B:67:0x01a1, B:76:0x01b2, B:77:0x01b8, B:79:0x01bb, B:25:0x0078, B:32:0x0099, B:98:0x0246, B:97:0x0243, B:99:0x0247, B:100:0x024c, B:101:0x024d, B:102:0x0252, B:103:0x0253, B:104:0x0258, B:105:0x0259, B:106:0x025e), top: B:125:0x000c, outer: #2 }] */
    @Override // com.google.android.gms.internal.ads.zzgfx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zza() {
        /*
            Method dump skipped, instructions count: 629
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgfz.zza():void");
    }

    @Override // com.google.android.gms.internal.ads.zzgfx
    public final synchronized boolean zzb() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzgfx
    public final Method zzc(String str, String str2) {
        zzgoe zzgoeVar;
        int i;
        Future future = (Future) this.zzi.get(new Pair(str, str2));
        if (future == null) {
            zzgoeVar = this.zzf;
            i = 302;
        } else {
            try {
                return (Method) future.get(this.zzj, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException unused) {
                zzgoeVar = this.zzf;
                i = 304;
            } catch (TimeoutException unused2) {
                zzgoeVar = this.zzf;
                i = 303;
            }
        }
        zzgoeVar.zzb(i);
        return null;
    }

    public final /* synthetic */ Method zzd(zzggb zzggbVar) {
        ClassLoader classLoader = this.zza;
        zzgfw zzgfwVar = this.zze;
        byte[] bArr = this.zzm;
        String str = zzggbVar.zza;
        String str2 = zzggbVar.zzb;
        try {
            return classLoader.loadClass(zzgfwVar.zzb(bArr, str)).getMethod(zzgfwVar.zzb(bArr, str2), zzggbVar.zzc);
        } catch (zzgfv | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException e) {
            throw new IllegalStateException(e);
        }
    }
}
