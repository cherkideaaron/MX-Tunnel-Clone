package com.google.android.gms.internal.consent_sdk;

import defpackage.EnumC0082Eb;

/* loaded from: classes.dex */
final class zzy {
    private final zzz zza;
    private final zzcl zzb;
    private int zzc = 0;
    private EnumC0082Eb zzd = EnumC0082Eb.a;

    public zzy(zzz zzzVar, zzcl zzclVar) {
        this.zza = zzzVar;
        this.zzb = zzclVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.consent_sdk.zzab zza() {
        /*
            r12 = this;
            r0 = 0
            com.google.android.gms.internal.consent_sdk.zzcl r1 = r12.zzb
            int r2 = r1.zzf
            r3 = 8
            r4 = 1
            if (r2 != r3) goto Lc
            r3 = r4
            goto Ld
        Lc:
            r3 = r0
        Ld:
            com.google.android.gms.internal.consent_sdk.zzz r5 = r12.zza
            com.google.android.gms.internal.consent_sdk.zzaq r6 = com.google.android.gms.internal.consent_sdk.zzz.zzc(r5)
            r6.zzh(r3)
            int r3 = r2 + (-1)
            r6 = 0
            if (r2 == 0) goto Lcc
            r2 = 3
            java.lang.String r7 = "Invalid response from server."
            r8 = 2
            switch(r3) {
                case 1: goto L52;
                case 2: goto L52;
                case 3: goto L52;
                case 4: goto L4f;
                case 5: goto L4c;
                case 6: goto L3a;
                case 7: goto L28;
                default: goto L22;
            }
        L22:
            com.google.android.gms.internal.consent_sdk.zzg r0 = new com.google.android.gms.internal.consent_sdk.zzg
            r0.<init>(r4, r7)
            throw r0
        L28:
            com.google.android.gms.internal.consent_sdk.zzg r0 = new com.google.android.gms.internal.consent_sdk.zzg
            java.lang.String r1 = r1.zzc
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "Publisher misconfiguration: "
            java.lang.String r1 = r3.concat(r1)
            r0.<init>(r2, r1)
            throw r0
        L3a:
            com.google.android.gms.internal.consent_sdk.zzg r0 = new com.google.android.gms.internal.consent_sdk.zzg
            java.lang.String r1 = r1.zzc
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Invalid response from server: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r4, r1)
            throw r0
        L4c:
            r12.zzc = r4
            goto L54
        L4f:
            r12.zzc = r8
            goto L54
        L52:
            r12.zzc = r2
        L54:
            int r2 = r1.zzg
            int r3 = r2 + (-1)
            if (r2 == 0) goto Lcb
            if (r3 == r4) goto L69
            if (r3 != r8) goto L63
            Eb r2 = defpackage.EnumC0082Eb.b
        L60:
            r12.zzd = r2
            goto L6c
        L63:
            com.google.android.gms.internal.consent_sdk.zzg r0 = new com.google.android.gms.internal.consent_sdk.zzg
            r0.<init>(r4, r7)
            throw r0
        L69:
            Eb r2 = defpackage.EnumC0082Eb.c
            goto L60
        L6c:
            java.lang.String r2 = r1.zza
            if (r2 != 0) goto L72
            r3 = r6
            goto L79
        L72:
            com.google.android.gms.internal.consent_sdk.zzbq r3 = new com.google.android.gms.internal.consent_sdk.zzbq
            java.lang.String r7 = r1.zzb
            r3.<init>(r7, r2)
        L79:
            com.google.android.gms.internal.consent_sdk.zzaq r2 = com.google.android.gms.internal.consent_sdk.zzz.zzc(r5)
            java.util.HashSet r7 = new java.util.HashSet
            java.util.List r9 = r1.zzd
            r7.<init>(r9)
            r2.zzj(r7)
            java.util.List r1 = r1.zze
            java.util.Iterator r1 = r1.iterator()
        L8d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lc1
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.consent_sdk.zzck r2 = (com.google.android.gms.internal.consent_sdk.zzck) r2
            int r7 = r2.zzb
            int r9 = r7 + (-1)
            if (r7 == 0) goto Lc0
            if (r9 == 0) goto La5
            if (r9 == r4) goto Laa
            if (r9 == r8) goto La7
        La5:
            r7 = r6
            goto Lac
        La7:
            java.lang.String r7 = "clear"
            goto Lac
        Laa:
            java.lang.String r7 = "write"
        Lac:
            if (r7 == 0) goto L8d
            com.google.android.gms.internal.consent_sdk.zze r9 = com.google.android.gms.internal.consent_sdk.zzz.zza(r5)
            java.lang.String r2 = r2.zza
            com.google.android.gms.internal.consent_sdk.zzao r10 = com.google.android.gms.internal.consent_sdk.zzz.zzb(r5)
            com.google.android.gms.internal.consent_sdk.zzd[] r11 = new com.google.android.gms.internal.consent_sdk.zzd[r4]
            r11[r0] = r10
            r9.zzb(r7, r2, r11)
            goto L8d
        Lc0:
            throw r6
        Lc1:
            com.google.android.gms.internal.consent_sdk.zzab r0 = new com.google.android.gms.internal.consent_sdk.zzab
            int r1 = r12.zzc
            Eb r2 = r12.zzd
            r0.<init>(r1, r2, r3, r6)
            return r0
        Lcb:
            throw r6
        Lcc:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.zzy.zza():com.google.android.gms.internal.consent_sdk.zzab");
    }
}
