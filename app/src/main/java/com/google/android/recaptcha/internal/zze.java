package com.google.android.recaptcha.internal;

import defpackage.DK;
import defpackage.InterfaceC3493uc;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public abstract class zze {
    private boolean zza;

    @Nullable
    public zzen zza(@NotNull String str) {
        throw null;
    }

    @Nullable
    public zzen zzb() {
        throw null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(1:(2:13|44)(2:14|15))(3:16|41|(1:43)(1:44)))(4:17|46|18|19))(4:23|48|24|(1:26)(1:33))|50|27|(1:29)|44) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0093, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0094, code lost:
    
        r10 = r0;
        r16 = r3;
        r4 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d3 A[PHI: r0
      0x00d3: PHI (r0v14 java.lang.Object) = (r0v12 java.lang.Object), (r0v12 java.lang.Object), (r0v13 java.lang.Object), (r0v1 java.lang.Object) binds: [B:28:0x008d, B:29:0x008f, B:42:0x00d0, B:13:0x0032] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzc(@org.jetbrains.annotations.NotNull java.lang.String r19, long r20, @org.jetbrains.annotations.NotNull defpackage.InterfaceC3493uc r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zze.zzc(java.lang.String, long, uc):java.lang.Object");
    }

    @Nullable
    public abstract Object zzd(@NotNull String str, @NotNull InterfaceC3493uc interfaceC3493uc);

    /* JADX WARN: Removed duplicated region for block: B:37:0x0099 A[PHI: r10 r11 r13
      0x0099: PHI (r10v8 com.google.android.recaptcha.internal.zzen) = (r10v5 com.google.android.recaptcha.internal.zzen), (r10v14 com.google.android.recaptcha.internal.zzen) binds: [B:36:0x0097, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0099: PHI (r11v5 com.google.android.recaptcha.internal.zze) = (r11v2 com.google.android.recaptcha.internal.zze), (r11v9 com.google.android.recaptcha.internal.zze) binds: [B:36:0x0097, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x0099: PHI (r13v8 java.lang.Object) = (r13v9 java.lang.Object), (r13v10 java.lang.Object) binds: [B:36:0x0097, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zze(long r10, @org.jetbrains.annotations.NotNull com.google.android.recaptcha.internal.zzsc r12, @org.jetbrains.annotations.NotNull defpackage.InterfaceC3493uc r13) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r13 instanceof com.google.android.recaptcha.internal.zzc
            if (r0 == 0) goto L13
            r0 = r13
            com.google.android.recaptcha.internal.zzc r0 = (com.google.android.recaptcha.internal.zzc) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzc r0 = new com.google.android.recaptcha.internal.zzc
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.zzb
            Sc r1 = defpackage.EnumC0321Sc.a
            int r2 = r0.zzd
            DK r3 = defpackage.DK.a
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L53
            if (r2 == r7) goto L47
            if (r2 == r6) goto L3d
            if (r2 != r5) goto L35
            java.lang.Object r10 = r0.zza
            com.google.android.recaptcha.internal.zzbd r10 = (com.google.android.recaptcha.internal.zzbd) r10
            defpackage.AbstractC0115Ga.U(r13)
            goto Lae
        L35:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3d:
            com.google.android.recaptcha.internal.zzen r10 = r0.zze
            java.lang.Object r11 = r0.zza
            com.google.android.recaptcha.internal.zze r11 = (com.google.android.recaptcha.internal.zze) r11
            defpackage.AbstractC0115Ga.U(r13)
            goto L99
        L47:
            com.google.android.recaptcha.internal.zzen r10 = r0.zze
            java.lang.Object r11 = r0.zza
            com.google.android.recaptcha.internal.zze r11 = (com.google.android.recaptcha.internal.zze) r11
            defpackage.AbstractC0115Ga.U(r13)     // Catch: java.lang.Exception -> L51
            goto L77
        L51:
            r12 = move-exception
            goto L8a
        L53:
            defpackage.AbstractC0115Ga.U(r13)
            com.google.android.recaptcha.internal.zzen r13 = r9.zzb()
            boolean r2 = r9.zza
            if (r2 == 0) goto L62
            r13.zza()
            return r3
        L62:
            com.google.android.recaptcha.internal.zzd r2 = new com.google.android.recaptcha.internal.zzd     // Catch: java.lang.Exception -> L86
            r2.<init>(r9, r12, r4)     // Catch: java.lang.Exception -> L86
            r0.zza = r9     // Catch: java.lang.Exception -> L86
            r0.zze = r13     // Catch: java.lang.Exception -> L86
            r0.zzd = r7     // Catch: java.lang.Exception -> L86
            java.lang.Object r10 = defpackage.AbstractC2883jK.T(r10, r2, r0)     // Catch: java.lang.Exception -> L86
            if (r10 == r1) goto Lb3
            r11 = r9
            r8 = r13
            r13 = r10
            r10 = r8
        L77:
            IC r13 = (defpackage.IC) r13     // Catch: java.lang.Exception -> L51
            java.lang.Object r12 = r13.a     // Catch: java.lang.Exception -> L51
            defpackage.AbstractC0115Ga.U(r12)     // Catch: java.lang.Exception -> L51
            r11.zza = r7     // Catch: java.lang.Exception -> L51
            if (r10 == 0) goto L85
            r10.zza()     // Catch: java.lang.Exception -> L51
        L85:
            return r3
        L86:
            r10 = move-exception
            r12 = r10
            r11 = r9
            r10 = r13
        L8a:
            r13 = 0
            r11.zza = r13
            r0.zza = r11
            r0.zze = r10
            r0.zzd = r6
            java.lang.Object r13 = r11.zzj(r12, r0)
            if (r13 == r1) goto Lb3
        L99:
            r12 = r13
            com.google.android.recaptcha.internal.zzbd r12 = (com.google.android.recaptcha.internal.zzbd) r12
            if (r10 == 0) goto La1
            r10.zzb(r12)
        La1:
            r0.zza = r12
            r0.zze = r4
            r0.zzd = r5
            java.lang.Object r10 = r11.zzg(r12, r0)
            if (r10 == r1) goto Lb3
            r10 = r12
        Lae:
            HC r10 = defpackage.AbstractC0115Ga.n(r10)
            return r10
        Lb3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zze.zze(long, com.google.android.recaptcha.internal.zzsc, uc):java.lang.Object");
    }

    @Nullable
    public abstract Object zzf(@NotNull String str, @NotNull InterfaceC3493uc interfaceC3493uc);

    @Nullable
    public Object zzg(@NotNull zzbd zzbdVar, @NotNull InterfaceC3493uc interfaceC3493uc) {
        return DK.a;
    }

    @Nullable
    public abstract Object zzh(@NotNull zzsc zzscVar, @NotNull InterfaceC3493uc interfaceC3493uc);

    @Nullable
    public Object zzi(@NotNull String str, long j, @NotNull Exception exc, @NotNull InterfaceC3493uc interfaceC3493uc) {
        return DK.a;
    }

    @Nullable
    public Object zzj(@NotNull Exception exc, @NotNull InterfaceC3493uc interfaceC3493uc) {
        return zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzap, exc.getMessage()));
    }

    public void zzk(@NotNull zzsr zzsrVar) {
    }

    public final boolean zzl() {
        return this.zza;
    }
}
