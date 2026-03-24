package com.google.android.gms.security;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class ProviderInstaller {
    public static final String PROVIDER_NAME = "GmsCore_OpenSSL";
    private static final GoogleApiAvailabilityLight zza = GoogleApiAvailabilityLight.getInstance();
    private static final Object zzb = new Object();
    private static Method zzc = null;
    private static boolean zzd = false;

    public interface ProviderInstallListener {
        void onProviderInstallFailed(int i, Intent intent);

        void onProviderInstalled();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0015, B:7:0x001c, B:14:0x0041, B:15:0x0046, B:12:0x002d, B:17:0x0048, B:28:0x0092, B:29:0x0097, B:31:0x0099, B:32:0x00a7, B:20:0x0054, B:22:0x0058, B:25:0x0082), top: B:37:0x0015, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092 A[Catch: all -> 0x0029, TryCatch #1 {, blocks: (B:4:0x0015, B:7:0x001c, B:14:0x0041, B:15:0x0046, B:12:0x002d, B:17:0x0048, B:28:0x0092, B:29:0x0097, B:31:0x0099, B:32:0x00a7, B:20:0x0054, B:22:0x0058, B:25:0x0082), top: B:37:0x0015, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099 A[Catch: all -> 0x0029, TryCatch #1 {, blocks: (B:4:0x0015, B:7:0x001c, B:14:0x0041, B:15:0x0046, B:12:0x002d, B:17:0x0048, B:28:0x0092, B:29:0x0097, B:31:0x0099, B:32:0x00a7, B:20:0x0054, B:22:0x0058, B:25:0x0082), top: B:37:0x0015, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void installIfNeeded(android.content.Context r12) {
        /*
            r0 = 1
            java.lang.String r1 = "Context must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r12, r1)
            com.google.android.gms.common.GoogleApiAvailabilityLight r1 = com.google.android.gms.security.ProviderInstaller.zza
            r2 = 11925000(0xb5f608, float:1.6710484E-38)
            r1.verifyGooglePlayServicesIsAvailable(r12, r2)
            long r1 = android.os.SystemClock.uptimeMillis()
            java.lang.Object r3 = com.google.android.gms.security.ProviderInstaller.zzb
            monitor-enter(r3)
            boolean r4 = com.google.android.gms.security.ProviderInstaller.zzd     // Catch: java.lang.Throwable -> L29
            r5 = 0
            if (r4 != 0) goto L48
            java.lang.String r4 = "Failed to load providerinstaller module: "
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy r6 = com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING     // Catch: java.lang.Throwable -> L29 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L2c
            java.lang.String r7 = "com.google.android.gms.providerinstaller.dynamite"
            com.google.android.gms.dynamite.DynamiteModule r6 = com.google.android.gms.dynamite.DynamiteModule.load(r12, r6, r7)     // Catch: java.lang.Throwable -> L29 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L2c
            android.content.Context r4 = r6.getModuleContext()     // Catch: java.lang.Throwable -> L29 com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L2c
            goto L3f
        L29:
            r12 = move-exception
            goto La8
        L2c:
            r6 = move-exception
            java.lang.String r7 = "ProviderInstaller"
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> L29
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L29
            java.lang.String r4 = r4.concat(r6)     // Catch: java.lang.Throwable -> L29
            android.util.Log.w(r7, r4)     // Catch: java.lang.Throwable -> L29
            r4 = r5
        L3f:
            if (r4 == 0) goto L48
            java.lang.String r0 = "com.google.android.gms.providerinstaller.ProviderInstallerImpl"
            zzb(r4, r12, r0)     // Catch: java.lang.Throwable -> L29
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L29
            return
        L48:
            boolean r4 = com.google.android.gms.security.ProviderInstaller.zzd     // Catch: java.lang.Throwable -> L29
            r4 = r4 ^ r0
            java.lang.String r6 = "Failed to report request stats: "
            android.content.Context r7 = com.google.android.gms.common.GooglePlayServicesUtilLight.getRemoteContext(r12)     // Catch: java.lang.Throwable -> L29
            if (r7 != 0) goto L54
            goto L90
        L54:
            com.google.android.gms.security.ProviderInstaller.zzd = r0     // Catch: java.lang.Throwable -> L29
            if (r4 == 0) goto L8f
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L81
            java.lang.String r8 = "com.google.android.gms.common.security.ProviderInstallerImpl"
            java.lang.String r9 = "reportRequestStats2"
            java.lang.ClassLoader r10 = r7.getClassLoader()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L81
            java.lang.Class<android.content.Context> r11 = android.content.Context.class
            com.google.android.gms.internal.common.zzi r11 = com.google.android.gms.internal.common.zzi.zzb(r11, r12)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L81
            com.google.android.gms.internal.common.zzh r1 = com.google.android.gms.internal.common.zzh.zza(r1)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L81
            com.google.android.gms.internal.common.zzh r2 = com.google.android.gms.internal.common.zzh.zza(r4)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L81
            r4 = 3
            com.google.android.gms.internal.common.zzi[] r4 = new com.google.android.gms.internal.common.zzi[r4]     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L81
            r5 = 0
            r4[r5] = r11     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L81
            r4[r0] = r1     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L81
            r0 = 2
            r4[r0] = r2     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L81
            com.google.android.gms.internal.common.zzj.zzb(r8, r9, r10, r4)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L81
            goto L8f
        L81:
            r0 = move-exception
            java.lang.String r1 = "ProviderInstaller"
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L29
            java.lang.String r0 = r6.concat(r0)     // Catch: java.lang.Throwable -> L29
            android.util.Log.w(r1, r0)     // Catch: java.lang.Throwable -> L29
        L8f:
            r5 = r7
        L90:
            if (r5 == 0) goto L99
            java.lang.String r0 = "com.google.android.gms.common.security.ProviderInstallerImpl"
            zzb(r5, r12, r0)     // Catch: java.lang.Throwable -> L29
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L29
            return
        L99:
            java.lang.String r12 = "ProviderInstaller"
            java.lang.String r0 = "Failed to get remote context"
            android.util.Log.e(r12, r0)     // Catch: java.lang.Throwable -> L29
            com.google.android.gms.common.GooglePlayServicesNotAvailableException r12 = new com.google.android.gms.common.GooglePlayServicesNotAvailableException     // Catch: java.lang.Throwable -> L29
            r0 = 8
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L29
            throw r12     // Catch: java.lang.Throwable -> L29
        La8:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L29
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.security.ProviderInstaller.installIfNeeded(android.content.Context):void");
    }

    public static void installIfNeededAsync(Context context, ProviderInstallListener providerInstallListener) {
        Preconditions.checkNotNull(context, "Context must not be null");
        Preconditions.checkNotNull(providerInstallListener, "Listener must not be null");
        Preconditions.checkMainThread("Must be called on the UI thread");
        new zza(context, providerInstallListener).execute(new Void[0]);
    }

    private static void zzb(Context context, Context context2, String str) throws IllegalAccessException, GooglePlayServicesNotAvailableException, IllegalArgumentException, InvocationTargetException {
        try {
            if (zzc == null) {
                zzc = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            zzc.invoke(null, context);
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e.toString() : cause.toString())));
            }
            throw new GooglePlayServicesNotAvailableException(8);
        }
    }
}
