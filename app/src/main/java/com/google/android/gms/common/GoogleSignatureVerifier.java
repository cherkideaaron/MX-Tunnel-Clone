package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.Set;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes.dex */
public class GoogleSignatureVerifier {
    private static GoogleSignatureVerifier zza;
    private static volatile Set zzd;
    private static volatile Set zze;
    private final Context zzb;
    private volatile String zzc;

    public GoogleSignatureVerifier(Context context) {
        this.zzb = context.getApplicationContext();
    }

    @KeepForSdk
    public static GoogleSignatureVerifier getInstance(Context context) {
        Preconditions.checkNotNull(context);
        synchronized (GoogleSignatureVerifier.class) {
            try {
                if (zza == null) {
                    zzo.zza(context);
                    zza = new GoogleSignatureVerifier(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zza;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b8, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a A[Catch: IllegalArgumentException -> 0x00c4, TryCatch #0 {IllegalArgumentException -> 0x00c4, blocks: (B:17:0x002a, B:19:0x002f, B:21:0x0035, B:23:0x003a, B:25:0x003d, B:27:0x0045, B:43:0x0088, B:45:0x008e, B:47:0x0099, B:48:0x00a3, B:50:0x00ab, B:56:0x00bc, B:57:0x00c3, B:28:0x004a, B:32:0x0054, B:34:0x005d, B:36:0x0063, B:39:0x006a, B:41:0x0079, B:42:0x0084, B:18:0x002d), top: B:65:0x0028 }] */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean zza(android.content.pm.PackageInfo r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleSignatureVerifier.zza(android.content.pm.PackageInfo, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r8v6, types: [int] */
    private final zzy zzb(String str, boolean z, boolean z2) throws PackageManager.NameNotFoundException {
        zzy zzyVarZzc;
        ApplicationInfo applicationInfo;
        String str2 = "null pkg";
        if (str == null) {
            return zzy.zzc("null pkg");
        }
        if (str.equals(this.zzc)) {
            return zzy.zzb();
        }
        int i = zzo.zzh;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                zzo.zzb();
            } catch (RemoteException | DynamiteModule.LoadingException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
            if (zzo.zzg.zzg()) {
                zzv zzvVar = new zzv(null);
                zzvVar.zza(str);
                zzvVar.zzb(GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb));
                zzvVar.zzc(true);
                zzyVarZzc = zzo.zzc(zzvVar.zzd());
            } else {
                threadPolicyAllowThreadDiskReads = Build.VERSION.SDK_INT;
                try {
                    PackageInfo packageInfo = this.zzb.getPackageManager().getPackageInfo(str, threadPolicyAllowThreadDiskReads >= 28 ? 134217792 : 64);
                    boolean zHonorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb);
                    if (packageInfo != null) {
                        Signature[] signatureArr = packageInfo.signatures;
                        if (signatureArr == null || signatureArr.length != 1) {
                            str2 = "single cert required";
                        } else {
                            zzk zzkVar = new zzk(packageInfo.signatures[0].toByteArray());
                            String str3 = packageInfo.packageName;
                            zzy zzyVarZzd = zzo.zzd(str3, zzkVar, zHonorsDebugCertificates, false);
                            if (!zzyVarZzd.zza || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !zzo.zzd(str3, zzkVar, false, true).zza) {
                                zzyVarZzc = zzyVarZzd;
                            } else {
                                str2 = "debuggable release cert app rejected";
                            }
                        }
                        zzyVarZzc = zzy.zzc(str2);
                    } else {
                        zzyVarZzc = zzy.zzc(str2);
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    return zzy.zzd("no pkg ".concat(str), e2);
                }
            }
            if (zzyVarZzc.zza) {
                this.zzc = str;
            }
            return zzyVarZzc;
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    private static zzj zzc(PackageInfo packageInfo, zzj... zzjVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            zzk zzkVar = new zzk(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < zzjVarArr.length; i++) {
                if (zzjVarArr[i].equals(zzkVar)) {
                    return zzjVarArr[i];
                }
            }
        }
        return null;
    }

    @KeepForSdk
    public boolean isGooglePublicSignedPackage(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (zza(packageInfo, false)) {
            return true;
        }
        if (zza(packageInfo, true)) {
            if (GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isPackageGoogleSigned(String str) throws PackageManager.NameNotFoundException {
        zzy zzyVarZzb = zzb(str, false, false);
        zzyVarZzb.zze();
        return zzyVarZzb.zza;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isUidGoogleSigned(int i) throws PackageManager.NameNotFoundException {
        zzy zzyVarZzc;
        int length;
        String[] packagesForUid = this.zzb.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            zzyVarZzc = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    Preconditions.checkNotNull(zzyVarZzc);
                    break;
                }
                zzyVarZzc = zzb(packagesForUid[i2], false, false);
                if (zzyVarZzc.zza) {
                    break;
                }
                i2++;
            }
        } else {
            zzyVarZzc = zzy.zzc("no pkgs");
        }
        zzyVarZzc.zze();
        return zzyVarZzc.zza;
    }
}
