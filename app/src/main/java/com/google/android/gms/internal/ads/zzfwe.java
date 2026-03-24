package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzfwe {
    public static boolean zza(zzbch zzbchVar) {
        int iOrdinal = zzbchVar.ordinal();
        return iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.google.android.gms.internal.ads.zzbch zzb(android.content.Context r8, com.google.android.gms.internal.ads.zzfvh r9) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfwe.zzb(android.content.Context, com.google.android.gms.internal.ads.zzfvh):com.google.android.gms.internal.ads.zzbch");
    }

    private static final void zzc(byte[] bArr, String str, Context context, zzfvh zzfvhVar) {
        if (zzfvhVar == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("os.arch:");
        sb.append(zzgrs.OS_ARCH.zza());
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            sb.append("dbg:");
            sb.append(str);
            sb.append(";");
        }
        zzfvhVar.zze(4007, sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0047 A[PHI: r2
      0x0047: PHI (r2v1 'e' java.lang.Exception) = (r2v0 'e' java.lang.Exception), (r2v2 'e' java.lang.Exception) binds: [B:21:0x004b, B:19:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.lang.String zzd(android.content.Context r4, com.google.android.gms.internal.ads.zzfvh r5) {
        /*
            java.util.HashSet r4 = new java.util.HashSet
            java.lang.String r0 = "armv71"
            java.lang.String r1 = "i686"
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            java.util.List r0 = java.util.Arrays.asList(r0)
            r4.<init>(r0)
            com.google.android.gms.internal.ads.zzgrs r0 = com.google.android.gms.internal.ads.zzgrs.OS_ARCH
            java.lang.String r0 = r0.zza()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L25
            boolean r4 = r4.contains(r0)
            if (r4 != 0) goto L24
            goto L25
        L24:
            return r0
        L25:
            r0 = 0
            r4 = 2024(0x7e8, float:2.836E-42)
            java.lang.Class<android.os.Build> r2 = android.os.Build.class
            java.lang.String r3 = "SUPPORTED_ABIS"
            java.lang.reflect.Field r2 = r2.getField(r3)     // Catch: java.lang.IllegalAccessException -> L41 java.lang.NoSuchFieldException -> L43
            r3 = 0
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.IllegalAccessException -> L41 java.lang.NoSuchFieldException -> L43
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch: java.lang.IllegalAccessException -> L41 java.lang.NoSuchFieldException -> L43
            if (r2 == 0) goto L4e
            int r3 = r2.length     // Catch: java.lang.IllegalAccessException -> L41 java.lang.NoSuchFieldException -> L43
            if (r3 <= 0) goto L4e
            r3 = 0
            r4 = r2[r3]     // Catch: java.lang.IllegalAccessException -> L41 java.lang.NoSuchFieldException -> L43
            return r4
        L41:
            r2 = move-exception
            goto L45
        L43:
            r2 = move-exception
            goto L4b
        L45:
            if (r5 == 0) goto L4e
        L47:
            r5.zzc(r4, r0, r2)
            goto L4e
        L4b:
            if (r5 == 0) goto L4e
            goto L47
        L4e:
            java.lang.String r4 = android.os.Build.CPU_ABI
            if (r4 == 0) goto L53
            return r4
        L53:
            java.lang.String r4 = android.os.Build.CPU_ABI2
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfwe.zzd(android.content.Context, com.google.android.gms.internal.ads.zzfvh):java.lang.String");
    }
}
