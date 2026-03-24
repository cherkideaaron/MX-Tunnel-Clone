package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import defpackage.AbstractC0115Ga;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@KeepForSdk
/* loaded from: classes.dex */
public class WorkSourceUtil {
    private static final int zza = Process.myUid();
    private static final Method zzb;
    private static final Method zzc;
    private static final Method zzd;
    private static final Method zze;
    private static final Method zzf;
    private static final Method zzg;
    private static final Method zzh;
    private static final Method zzi;
    private static Boolean zzj;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Method method7;
        Method method8;
        try {
            method = WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception unused) {
            method = null;
        }
        zzb = method;
        try {
            method2 = WorkSource.class.getMethod("add", Integer.TYPE, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        zzc = method2;
        try {
            method3 = WorkSource.class.getMethod("size", null);
        } catch (Exception unused3) {
            method3 = null;
        }
        zzd = method3;
        try {
            method4 = WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception unused4) {
            method4 = null;
        }
        zze = method4;
        try {
            method5 = WorkSource.class.getMethod("getName", Integer.TYPE);
        } catch (Exception unused5) {
            method5 = null;
        }
        zzf = method5;
        if (PlatformVersion.isAtLeastP()) {
            try {
                method6 = WorkSource.class.getMethod("createWorkChain", null);
            } catch (Exception e) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e);
            }
        } else {
            method6 = null;
        }
        zzg = method6;
        if (PlatformVersion.isAtLeastP()) {
            try {
                method7 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
            } catch (Exception e2) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e2);
            }
        } else {
            method7 = null;
        }
        zzh = method7;
        if (PlatformVersion.isAtLeastP()) {
            try {
                method8 = WorkSource.class.getMethod("isEmpty", null);
                try {
                    method8.setAccessible(true);
                } catch (Exception unused6) {
                }
            } catch (Exception unused7) {
            }
        } else {
            method8 = null;
        }
        zzi = method8;
        zzj = null;
    }

    private WorkSourceUtil() {
    }

    @KeepForSdk
    public static void add(WorkSource workSource, int i, String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = zzc;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i), str);
                return;
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                return;
            }
        }
        Method method2 = zzb;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i));
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
        }
    }

    @KeepForSdk
    public static WorkSource fromPackage(Context context, String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String str2;
        ApplicationInfo applicationInfo;
        if (context == null || context.getPackageManager() == null || str == null) {
            return null;
        }
        try {
            applicationInfo = Wrappers.packageManager(context).getApplicationInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "Could not find package: ";
        }
        if (applicationInfo == null) {
            str2 = "Could not get applicationInfo from package: ";
            Log.e("WorkSourceUtil", str2.concat(str));
            return null;
        }
        int i = applicationInfo.uid;
        WorkSource workSource = new WorkSource();
        add(workSource, i, str);
        return workSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    @com.google.android.gms.common.annotation.KeepForSdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.os.WorkSource fromPackageAndModuleExperimentalPi(android.content.Context r9, java.lang.String r10, java.lang.String r11) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r0 = 1
            r1 = 2
            r2 = 0
            r3 = 0
            java.lang.String r4 = "WorkSourceUtil"
            if (r9 == 0) goto L6f
            android.content.pm.PackageManager r5 = r9.getPackageManager()
            if (r5 == 0) goto L6f
            if (r11 == 0) goto L6f
            if (r10 != 0) goto L13
            goto L6f
        L13:
            r5 = -1
            com.google.android.gms.common.wrappers.PackageManagerWrapper r9 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2b
            android.content.pm.ApplicationInfo r9 = r9.getApplicationInfo(r10, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2b
            if (r9 != 0) goto L28
            java.lang.String r9 = "Could not get applicationInfo from package: "
        L20:
            java.lang.String r9 = r9.concat(r10)
            android.util.Log.e(r4, r9)
            goto L2e
        L28:
            int r5 = r9.uid
            goto L2e
        L2b:
            java.lang.String r9 = "Could not find package: "
            goto L20
        L2e:
            if (r5 >= 0) goto L31
            return r3
        L31:
            android.os.WorkSource r9 = new android.os.WorkSource
            r9.<init>()
            java.lang.reflect.Method r6 = com.google.android.gms.common.util.WorkSourceUtil.zzg
            if (r6 == 0) goto L6b
            java.lang.reflect.Method r7 = com.google.android.gms.common.util.WorkSourceUtil.zzh
            if (r7 != 0) goto L3f
            goto L6b
        L3f:
            java.lang.Object r3 = r6.invoke(r9, r3)     // Catch: java.lang.Exception -> L55
            int r6 = com.google.android.gms.common.util.WorkSourceUtil.zza     // Catch: java.lang.Exception -> L55
            if (r5 == r6) goto L57
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L55
            java.lang.Object[] r8 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L55
            r8[r2] = r5     // Catch: java.lang.Exception -> L55
            r8[r0] = r10     // Catch: java.lang.Exception -> L55
            r7.invoke(r3, r8)     // Catch: java.lang.Exception -> L55
            goto L57
        L55:
            r10 = move-exception
            goto L65
        L57:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L55
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L55
            r1[r2] = r10     // Catch: java.lang.Exception -> L55
            r1[r0] = r11     // Catch: java.lang.Exception -> L55
            r7.invoke(r3, r1)     // Catch: java.lang.Exception -> L55
            goto L6e
        L65:
            java.lang.String r11 = "Unable to assign chained blame through WorkSource"
            android.util.Log.w(r4, r11, r10)
            goto L6e
        L6b:
            add(r9, r5, r10)
        L6e:
            return r9
        L6f:
            java.lang.String r9 = "Unexpected null arguments"
            android.util.Log.w(r4, r9)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.WorkSourceUtil.fromPackageAndModuleExperimentalPi(android.content.Context, java.lang.String, java.lang.String):android.os.WorkSource");
    }

    @KeepForSdk
    public static int get(WorkSource workSource, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = zze;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(workSource, Integer.valueOf(i));
                Preconditions.checkNotNull(objInvoke);
                return ((Integer) objInvoke).intValue();
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return 0;
    }

    @KeepForSdk
    public static String getName(WorkSource workSource, int i) {
        Method method = zzf;
        if (method == null) {
            return null;
        }
        try {
            return (String) method.invoke(workSource, Integer.valueOf(i));
        } catch (Exception e) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            return null;
        }
    }

    @KeepForSdk
    public static List<String> getNames(WorkSource workSource) {
        ArrayList arrayList = new ArrayList();
        int size = workSource == null ? 0 : size(workSource);
        if (size != 0) {
            for (int i = 0; i < size; i++) {
                String name = getName(workSource, i);
                if (!Strings.isEmptyOrWhitespace(name)) {
                    Preconditions.checkNotNull(name);
                    arrayList.add(name);
                }
            }
        }
        return arrayList;
    }

    @KeepForSdk
    public static synchronized boolean hasWorkSourcePermission(Context context) {
        Boolean bool = zzj;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context == null) {
            return false;
        }
        boolean z = AbstractC0115Ga.l(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
        zzj = Boolean.valueOf(z);
        return z;
    }

    @KeepForSdk
    public static boolean isEmpty(WorkSource workSource) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = zzi;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(workSource, null);
                Preconditions.checkNotNull(objInvoke);
                return ((Boolean) objInvoke).booleanValue();
            } catch (Exception e) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e);
            }
        }
        return size(workSource) == 0;
    }

    @KeepForSdk
    public static int size(WorkSource workSource) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = zzd;
        if (method == null) {
            return 0;
        }
        try {
            Object objInvoke = method.invoke(workSource, null);
            Preconditions.checkNotNull(objInvoke);
            return ((Integer) objInvoke).intValue();
        } catch (Exception e) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            return 0;
        }
    }
}
