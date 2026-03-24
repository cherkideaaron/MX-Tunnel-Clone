package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* loaded from: classes2.dex */
final class zzaba implements zzafv<zzaik> {
    private final /* synthetic */ zzail zza;
    private final /* synthetic */ zzahk zzb;
    private final /* synthetic */ zzael zzc;
    private final /* synthetic */ zzahv zzd;
    private final /* synthetic */ zzafs zze;
    private final /* synthetic */ zzaar zzf;

    public zzaba(zzaar zzaarVar, zzail zzailVar, zzahk zzahkVar, zzael zzaelVar, zzahv zzahvVar, zzafs zzafsVar) {
        this.zza = zzailVar;
        this.zzb = zzahkVar;
        this.zzc = zzaelVar;
        this.zzd = zzahvVar;
        this.zze = zzafsVar;
        Objects.requireNonNull(zzaarVar);
        this.zzf = zzaarVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void zza(com.google.android.gms.internal.p002firebaseauthapi.zzaik r7) {
        /*
            r6 = this;
            com.google.android.gms.internal.firebase-auth-api.zzaik r7 = (com.google.android.gms.internal.p002firebaseauthapi.zzaik) r7
            com.google.android.gms.internal.firebase-auth-api.zzail r0 = r6.zza
            java.lang.String r1 = "EMAIL"
            boolean r0 = r0.zzi(r1)
            r1 = 0
            if (r0 == 0) goto L13
            com.google.android.gms.internal.firebase-auth-api.zzahk r0 = r6.zzb
            r0.zzb(r1)
            goto L26
        L13:
            com.google.android.gms.internal.firebase-auth-api.zzail r0 = r6.zza
            java.lang.String r0 = r0.zzc()
            if (r0 == 0) goto L26
            com.google.android.gms.internal.firebase-auth-api.zzahk r0 = r6.zzb
            com.google.android.gms.internal.firebase-auth-api.zzail r2 = r6.zza
            java.lang.String r2 = r2.zzc()
            r0.zzb(r2)
        L26:
            com.google.android.gms.internal.firebase-auth-api.zzail r0 = r6.zza
            java.lang.String r2 = "DISPLAY_NAME"
            boolean r0 = r0.zzi(r2)
            if (r0 == 0) goto L36
            com.google.android.gms.internal.firebase-auth-api.zzahk r0 = r6.zzb
            r0.zza(r1)
            goto L49
        L36:
            com.google.android.gms.internal.firebase-auth-api.zzail r0 = r6.zza
            java.lang.String r0 = r0.zzb()
            if (r0 == 0) goto L49
            com.google.android.gms.internal.firebase-auth-api.zzahk r0 = r6.zzb
            com.google.android.gms.internal.firebase-auth-api.zzail r2 = r6.zza
            java.lang.String r2 = r2.zzb()
            r0.zza(r2)
        L49:
            com.google.android.gms.internal.firebase-auth-api.zzail r0 = r6.zza
            java.lang.String r2 = "PHOTO_URL"
            boolean r0 = r0.zzi(r2)
            if (r0 == 0) goto L59
            com.google.android.gms.internal.firebase-auth-api.zzahk r0 = r6.zzb
        L55:
            r0.zzc(r1)
            goto L6a
        L59:
            com.google.android.gms.internal.firebase-auth-api.zzail r0 = r6.zza
            java.lang.String r0 = r0.zze()
            if (r0 == 0) goto L6a
            com.google.android.gms.internal.firebase-auth-api.zzahk r0 = r6.zzb
            com.google.android.gms.internal.firebase-auth-api.zzail r1 = r6.zza
            java.lang.String r1 = r1.zze()
            goto L55
        L6a:
            com.google.android.gms.internal.firebase-auth-api.zzail r0 = r6.zza
            java.lang.String r0 = r0.zzd()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L83
            java.lang.String r0 = "redacted"
            byte[] r0 = r0.getBytes()
            java.lang.String r0 = com.google.android.gms.common.util.Base64Utils.encode(r0)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r0)
        L83:
            com.google.android.gms.internal.firebase-auth-api.zzail r0 = r6.zza
            java.lang.String r1 = "delete_passkey"
            boolean r0 = r0.zzi(r1)
            if (r0 == 0) goto L96
            com.google.android.gms.internal.firebase-auth-api.zzahk r0 = r6.zzb
            com.google.android.gms.internal.firebase-auth-api.zzah r1 = com.google.android.gms.internal.p002firebaseauthapi.zzah.zzg()
            r0.zza(r1)
        L96:
            java.util.List r0 = r7.zze()
            if (r0 == 0) goto L9d
            goto La2
        L9d:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        La2:
            com.google.android.gms.internal.firebase-auth-api.zzahk r1 = r6.zzb
            r1.zza(r0)
            com.google.android.gms.internal.firebase-auth-api.zzael r0 = r6.zzc
            com.google.android.gms.internal.firebase-auth-api.zzahv r1 = r6.zzd
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)
            java.lang.String r2 = r7.zzc()
            java.lang.String r3 = r7.zzd()
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto Ld7
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto Ld7
            long r4 = r7.zza()
            com.google.android.gms.internal.firebase-auth-api.zzahv r7 = new com.google.android.gms.internal.firebase-auth-api.zzahv
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r1 = r1.zze()
            r7.<init>(r3, r2, r4, r1)
            r1 = r7
        Ld7:
            com.google.android.gms.internal.firebase-auth-api.zzahk r7 = r6.zzb
            r0.zza(r1, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzaba.zza(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zza(String str) {
        this.zze.zza(str);
    }
}
