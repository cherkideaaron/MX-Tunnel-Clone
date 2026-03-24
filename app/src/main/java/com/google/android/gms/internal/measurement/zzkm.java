package com.google.android.gms.internal.measurement;

import defpackage.AbstractC0115Ga;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class zzkm {
    public static final /* synthetic */ int zzc = 0;
    private static final Object zzd = new Object();
    private static volatile zzkh zze = null;
    private static volatile boolean zzf = false;
    private static final AtomicInteger zzh;
    final zzkg zza;
    final String zzb;
    private Object zzg;
    private volatile int zzi = -1;
    private volatile Object zzj;
    private volatile boolean zzk;

    static {
        new AtomicReference();
        AbstractC0115Ga.i(zzkk.zza, "BuildInfo must be non-null");
        zzh = new AtomicInteger();
    }

    public /* synthetic */ zzkm(zzkg zzkgVar, String str, Object obj, boolean z, byte[] bArr) {
        if (zzkgVar.zza == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.zza = zzkgVar;
        this.zzb = str;
        this.zzg = obj;
        this.zzk = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x005f, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0064, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void zzb(final android.content.Context r3) {
        /*
            com.google.android.gms.internal.measurement.zzkh r0 = com.google.android.gms.internal.measurement.zzkm.zze
            if (r0 != 0) goto L65
            if (r3 != 0) goto L7
            goto L65
        L7:
            java.lang.Object r0 = com.google.android.gms.internal.measurement.zzkm.zzd
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkm.zze     // Catch: java.lang.Throwable -> L5f
            if (r1 != 0) goto L61
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L5f
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkm.zze     // Catch: java.lang.Throwable -> L21
            android.content.Context r2 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L18
            r3 = r2
        L18:
            if (r1 == 0) goto L23
            android.content.Context r2 = r1.zza()     // Catch: java.lang.Throwable -> L21
            if (r2 == r3) goto L5b
            goto L23
        L21:
            r3 = move-exception
            goto L5d
        L23:
            if (r1 == 0) goto L2e
            com.google.android.gms.internal.measurement.zzjr.zzd()     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.zzko.zzb()     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.zzjy.zzc()     // Catch: java.lang.Throwable -> L21
        L2e:
            com.google.android.gms.internal.measurement.zzkl r1 = new com.google.android.gms.internal.measurement.zzkl     // Catch: java.lang.Throwable -> L21
            r1.<init>()     // Catch: java.lang.Throwable -> L21
            boolean r2 = r1 instanceof defpackage.MH     // Catch: java.lang.Throwable -> L21
            if (r2 != 0) goto L4f
            boolean r2 = r1 instanceof defpackage.KH     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L3c
            goto L4f
        L3c:
            boolean r2 = r1 instanceof java.io.Serializable     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L47
            KH r2 = new KH     // Catch: java.lang.Throwable -> L21
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L21
        L45:
            r1 = r2
            goto L4f
        L47:
            MH r2 = new MH     // Catch: java.lang.Throwable -> L21
            r2.<init>()     // Catch: java.lang.Throwable -> L21
            r2.a = r1     // Catch: java.lang.Throwable -> L21
            goto L45
        L4f:
            com.google.android.gms.internal.measurement.zzjn r2 = new com.google.android.gms.internal.measurement.zzjn     // Catch: java.lang.Throwable -> L21
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.zzkm.zze = r2     // Catch: java.lang.Throwable -> L21
            java.util.concurrent.atomic.AtomicInteger r3 = com.google.android.gms.internal.measurement.zzkm.zzh     // Catch: java.lang.Throwable -> L21
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L21
        L5b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            goto L61
        L5d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r3     // Catch: java.lang.Throwable -> L5f
        L5f:
            r3 = move-exception
            goto L63
        L61:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5f
            return
        L63:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5f
            throw r3
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzkm.zzb(android.content.Context):void");
    }

    public static void zzc() {
        zzh.incrementAndGet();
    }

    public abstract Object zza(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045 A[PHI: r2
      0x0045: PHI (r2v1 Cy) = (r2v0 Cy), (r2v0 Cy), (r2v5 Cy) binds: [B:8:0x0014, B:10:0x001a, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x001c, B:13:0x002f, B:22:0x004f, B:24:0x0055, B:26:0x005f, B:29:0x0071, B:31:0x0079, B:43:0x00a0, B:46:0x00a8, B:47:0x00ab, B:48:0x00af, B:35:0x0082, B:37:0x0086, B:39:0x0096, B:41:0x009c, B:49:0x00b4, B:50:0x00b7, B:51:0x00b8, B:52:0x00bd, B:53:0x00be), top: B:59:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b8 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x001c, B:13:0x002f, B:22:0x004f, B:24:0x0055, B:26:0x005f, B:29:0x0071, B:31:0x0079, B:43:0x00a0, B:46:0x00a8, B:47:0x00ab, B:48:0x00af, B:35:0x0082, B:37:0x0086, B:39:0x0096, B:41:0x009c, B:49:0x00b4, B:50:0x00b7, B:51:0x00b8, B:52:0x00bd, B:53:0x00be), top: B:59:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzd() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = com.google.android.gms.internal.measurement.zzkm.zzh
            int r0 = r0.get()
            int r1 = r9.zzi
            if (r1 >= r0) goto Lc2
            monitor-enter(r9)
            int r1 = r9.zzi     // Catch: java.lang.Throwable -> L42
            if (r1 >= r0) goto Lbe
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkm.zze     // Catch: java.lang.Throwable -> L42
            g r2 = defpackage.C2699g.a     // Catch: java.lang.Throwable -> L42
            r3 = 0
            if (r1 == 0) goto L45
            JH r4 = r1.zzb()     // Catch: java.lang.Throwable -> L42
            if (r4 == 0) goto L45
            JH r2 = r1.zzb()     // Catch: java.lang.Throwable -> L42
            r2.getClass()     // Catch: java.lang.Throwable -> L42
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L42
            Cy r2 = (defpackage.Cy) r2     // Catch: java.lang.Throwable -> L42
            boolean r4 = r2.b()     // Catch: java.lang.Throwable -> L42
            if (r4 == 0) goto L45
            java.lang.Object r4 = r2.a()     // Catch: java.lang.Throwable -> L42
            com.google.android.gms.internal.measurement.zzjt r4 = (com.google.android.gms.internal.measurement.zzjt) r4     // Catch: java.lang.Throwable -> L42
            com.google.android.gms.internal.measurement.zzkg r5 = r9.zza     // Catch: java.lang.Throwable -> L42
            android.net.Uri r6 = r5.zza     // Catch: java.lang.Throwable -> L42
            java.lang.String r5 = r5.zzc     // Catch: java.lang.Throwable -> L42
            java.lang.String r7 = r9.zzb     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = r4.zza(r6, r3, r5, r7)     // Catch: java.lang.Throwable -> L42
            goto L46
        L42:
            r0 = move-exception
            goto Lc0
        L45:
            r4 = r3
        L46:
            if (r1 == 0) goto L4a
            r5 = 1
            goto L4b
        L4a:
            r5 = 0
        L4b:
            java.lang.String r6 = "Must call PhenotypeFlagInitializer.maybeInit() first"
            if (r5 == 0) goto Lb8
            com.google.android.gms.internal.measurement.zzkg r5 = r9.zza     // Catch: java.lang.Throwable -> L42
            android.net.Uri r6 = r5.zza     // Catch: java.lang.Throwable -> L42
            if (r6 == 0) goto Lb4
            android.content.Context r7 = r1.zza()     // Catch: java.lang.Throwable -> L42
            boolean r7 = com.google.android.gms.internal.measurement.zzka.zza(r7, r6)     // Catch: java.lang.Throwable -> L42
            if (r7 == 0) goto L6e
            android.content.Context r7 = r1.zza()     // Catch: java.lang.Throwable -> L42
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch: java.lang.Throwable -> L42
            com.google.android.gms.internal.measurement.zzkj r8 = com.google.android.gms.internal.measurement.zzkj.zza     // Catch: java.lang.Throwable -> L42
            com.google.android.gms.internal.measurement.zzjr r6 = com.google.android.gms.internal.measurement.zzjr.zza(r7, r6, r8)     // Catch: java.lang.Throwable -> L42
            goto L6f
        L6e:
            r6 = r3
        L6f:
            if (r6 == 0) goto L7e
            java.lang.String r7 = r9.zzb     // Catch: java.lang.Throwable -> L42
            java.lang.Object r6 = r6.zze(r7)     // Catch: java.lang.Throwable -> L42
            if (r6 == 0) goto L7e
            java.lang.Object r6 = r9.zza(r6)     // Catch: java.lang.Throwable -> L42
            goto L7f
        L7e:
            r6 = r3
        L7f:
            if (r6 == 0) goto L82
            goto La0
        L82:
            boolean r5 = r5.zzd     // Catch: java.lang.Throwable -> L42
            if (r5 != 0) goto L9a
            android.content.Context r1 = r1.zza()     // Catch: java.lang.Throwable -> L42
            com.google.android.gms.internal.measurement.zzjy r1 = com.google.android.gms.internal.measurement.zzjy.zza(r1)     // Catch: java.lang.Throwable -> L42
            java.lang.String r5 = r9.zzb     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r1.zze(r5)     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L9a
            java.lang.Object r3 = r9.zza(r1)     // Catch: java.lang.Throwable -> L42
        L9a:
            if (r3 != 0) goto L9f
            java.lang.Object r6 = r9.zzg     // Catch: java.lang.Throwable -> L42
            goto La0
        L9f:
            r6 = r3
        La0:
            boolean r1 = r2.b()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto Laf
            if (r4 != 0) goto Lab
            java.lang.Object r6 = r9.zzg     // Catch: java.lang.Throwable -> L42
            goto Laf
        Lab:
            java.lang.Object r6 = r9.zza(r4)     // Catch: java.lang.Throwable -> L42
        Laf:
            r9.zzj = r6     // Catch: java.lang.Throwable -> L42
            r9.zzi = r0     // Catch: java.lang.Throwable -> L42
            goto Lbe
        Lb4:
            r1.zza()     // Catch: java.lang.Throwable -> L42
            throw r3     // Catch: java.lang.Throwable -> L42
        Lb8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L42
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L42
            throw r0     // Catch: java.lang.Throwable -> L42
        Lbe:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L42
            goto Lc2
        Lc0:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L42
            throw r0
        Lc2:
            java.lang.Object r0 = r9.zzj
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzkm.zzd():java.lang.Object");
    }
}
