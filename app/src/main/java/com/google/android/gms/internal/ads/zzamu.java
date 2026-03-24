package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzamu {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;

    private zzamu(int i, int i2, int i3, int i4, int i5, int i6) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = i5;
        this.zzf = i6;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzamu zza(java.lang.String r14) {
        /*
            java.lang.String r0 = "Format:"
            boolean r0 = r14.startsWith(r0)
            com.google.android.gms.internal.ads.zzgrc.zza(r0)
            r0 = 7
            java.lang.String r14 = r14.substring(r0)
            java.lang.String r0 = ","
            java.lang.String[] r14 = android.text.TextUtils.split(r14, r0)
            r0 = 0
            r1 = -1
            r2 = r0
            r4 = r1
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
        L1c:
            int r9 = r14.length
            if (r2 >= r9) goto L7f
            r3 = r14[r2]
            java.lang.String r3 = r3.trim()
            java.lang.String r3 = com.google.android.gms.internal.ads.zzgql.zza(r3)
            int r9 = r3.hashCode()
            r10 = 2
            r11 = 4
            r12 = 3
            r13 = 1
            switch(r9) {
                case 100571: goto L5d;
                case 3556653: goto L53;
                case 102749521: goto L49;
                case 109757538: goto L3f;
                case 109780401: goto L35;
                default: goto L34;
            }
        L34:
            goto L67
        L35:
            java.lang.String r9 = "style"
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto L67
            r3 = r12
            goto L68
        L3f:
            java.lang.String r9 = "start"
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto L67
            r3 = r13
            goto L68
        L49:
            java.lang.String r9 = "layer"
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto L67
            r3 = r0
            goto L68
        L53:
            java.lang.String r9 = "text"
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto L67
            r3 = r11
            goto L68
        L5d:
            java.lang.String r9 = "end"
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto L67
            r3 = r10
            goto L68
        L67:
            r3 = r1
        L68:
            if (r3 == 0) goto L7b
            if (r3 == r13) goto L79
            if (r3 == r10) goto L77
            if (r3 == r12) goto L75
            if (r3 == r11) goto L73
            goto L7c
        L73:
            r8 = r2
            goto L7c
        L75:
            r7 = r2
            goto L7c
        L77:
            r6 = r2
            goto L7c
        L79:
            r5 = r2
            goto L7c
        L7b:
            r4 = r2
        L7c:
            int r2 = r2 + 1
            goto L1c
        L7f:
            if (r5 == r1) goto L8c
            if (r6 == r1) goto L8c
            if (r8 == r1) goto L8c
            com.google.android.gms.internal.ads.zzamu r14 = new com.google.android.gms.internal.ads.zzamu
            r3 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r14
        L8c:
            r14 = 0
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamu.zza(java.lang.String):com.google.android.gms.internal.ads.zzamu");
    }
}
