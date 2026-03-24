package com.google.android.recaptcha.internal;

import android.content.Context;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import defpackage.AbstractC0069Df;
import defpackage.DK;
import defpackage.InterfaceC0149Ia;
import defpackage.InterfaceC0304Rc;
import defpackage.InterfaceC3493uc;
import defpackage.Tv;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class zzan {
    public InterfaceC0149Ia zza;

    @NotNull
    private final InterfaceC0304Rc zzb;

    @NotNull
    private final zzek zzc;

    @NotNull
    private final StandardIntegrityManager zzd;
    private long zzf;
    private boolean zzh;

    @NotNull
    private zzao zze = zzao.zza;

    @NotNull
    private final Tv zzg = AbstractC0069Df.a();

    public zzan(@NotNull Context context, @NotNull InterfaceC0304Rc interfaceC0304Rc, @NotNull zzek zzekVar, @NotNull StandardIntegrityManager standardIntegrityManager, long j) {
        this.zzb = interfaceC0304Rc;
        this.zzc = zzekVar;
        this.zzd = standardIntegrityManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzi(defpackage.InterfaceC3493uc r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzag
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.recaptcha.internal.zzag r0 = (com.google.android.recaptcha.internal.zzag) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzag r0 = new com.google.android.recaptcha.internal.zzag
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.zza
            Sc r1 = defpackage.EnumC0321Sc.a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.AbstractC0115Ga.U(r7)
            goto L53
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            defpackage.AbstractC0115Ga.U(r7)
            com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder r7 = com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.builder()
            long r4 = r6.zzf
            com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder r7 = r7.setCloudProjectNumber(r4)
            com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest r7 = r7.build()
            com.google.android.play.core.integrity.StandardIntegrityManager r2 = r6.zzd
            com.google.android.gms.tasks.Task r7 = r2.prepareIntegrityToken(r7)
            ng r7 = com.google.android.recaptcha.internal.zzbx.zza(r7)
            r0.zzc = r3
            java.lang.Object r7 = r7.await(r0)
            if (r7 != r1) goto L53
            return r1
        L53:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zzi(uc):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzj(java.lang.String r6, defpackage.InterfaceC3493uc r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzah
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.recaptcha.internal.zzah r0 = (com.google.android.recaptcha.internal.zzah) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzah r0 = new com.google.android.recaptcha.internal.zzah
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.zza
            Sc r1 = defpackage.EnumC0321Sc.a
            int r2 = r0.zzc
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.AbstractC0115Ga.U(r7)
            goto L6d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r6 = r0.zzd
            defpackage.AbstractC0115Ga.U(r7)
            goto L4b
        L38:
            defpackage.AbstractC0115Ga.U(r7)
            Ia r7 = r5.zzf()
            r0.zzd = r6
            r0.zzc = r4
            Ja r7 = (defpackage.C0166Ja) r7
            java.lang.Object r7 = r7.l(r0)
            if (r7 == r1) goto L74
        L4b:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenProvider r7 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider) r7
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder r2 = com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.builder()
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder r6 = r2.setRequestHash(r6)
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest r6 = r6.build()
            com.google.android.gms.tasks.Task r6 = r7.request(r6)
            ng r6 = com.google.android.recaptcha.internal.zzbx.zza(r6)
            r7 = 0
            r0.zzd = r7
            r0.zzc = r3
            java.lang.Object r7 = r6.await(r0)
            if (r7 != r1) goto L6d
            goto L74
        L6d:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityToken r7 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken) r7
            java.lang.String r6 = r7.token()
            return r6
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zzj(java.lang.String, uc):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzc(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull defpackage.InterfaceC3493uc r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.recaptcha.internal.zzaf
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.recaptcha.internal.zzaf r0 = (com.google.android.recaptcha.internal.zzaf) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzaf r0 = new com.google.android.recaptcha.internal.zzaf
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.zza
            Sc r1 = defpackage.EnumC0321Sc.a
            int r2 = r0.zzc
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.AbstractC0115Ga.U(r8)
            goto L74
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.String r7 = r0.zze
            com.google.android.recaptcha.internal.zzan r2 = r0.zzd
            defpackage.AbstractC0115Ga.U(r8)
            goto L67
        L3d:
            java.lang.String r7 = r0.zze
            com.google.android.recaptcha.internal.zzan r2 = r0.zzd
            defpackage.AbstractC0115Ga.U(r8)     // Catch: java.lang.Exception -> L5a
            goto L56
        L45:
            defpackage.AbstractC0115Ga.U(r8)
            r0.zzd = r6     // Catch: java.lang.Exception -> L59
            r0.zze = r7     // Catch: java.lang.Exception -> L59
            r0.zzc = r5     // Catch: java.lang.Exception -> L59
            java.lang.Object r8 = r6.zzj(r7, r0)     // Catch: java.lang.Exception -> L59
            if (r8 != r1) goto L55
            return r1
        L55:
            r2 = r6
        L56:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L5a
            goto L76
        L59:
            r2 = r6
        L5a:
            r0.zzd = r2
            r0.zze = r7
            r0.zzc = r4
            java.lang.Object r8 = r2.zze(r0)
            if (r8 != r1) goto L67
            return r1
        L67:
            r8 = 0
            r0.zzd = r8
            r0.zze = r8
            r0.zzc = r3
            java.lang.Object r8 = r2.zzj(r7, r0)
            if (r8 == r1) goto L77
        L74:
            java.lang.String r8 = (java.lang.String) r8
        L76:
            return r8
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zzc(java.lang.String, uc):java.lang.Object");
    }

    @Nullable
    public final Object zzd(long j, @NotNull InterfaceC3493uc interfaceC3493uc) {
        this.zzf = j;
        return DK.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zze(@org.jetbrains.annotations.NotNull defpackage.InterfaceC3493uc r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.google.android.recaptcha.internal.zzak
            if (r0 == 0) goto L13
            r0 = r14
            com.google.android.recaptcha.internal.zzak r0 = (com.google.android.recaptcha.internal.zzak) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzak r0 = new com.google.android.recaptcha.internal.zzak
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.zzb
            Sc r1 = defpackage.EnumC0321Sc.a
            int r2 = r0.zzd
            DK r3 = defpackage.DK.a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            defpackage.AbstractC0115Ga.U(r14)
            goto Lb0
        L2d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L35:
            java.lang.Object r2 = r0.zza
            Tv r2 = (defpackage.Tv) r2
            com.google.android.recaptcha.internal.zzan r6 = r0.zze
            defpackage.AbstractC0115Ga.U(r14)
            goto L54
        L3f:
            defpackage.AbstractC0115Ga.U(r14)
            Tv r14 = r13.zzg
            r0.zze = r13
            r0.zza = r14
            r0.zzd = r5
            r2 = r14
            Vv r2 = (defpackage.Vv) r2
            java.lang.Object r14 = r2.d(r0)
            if (r14 == r1) goto Lb8
            r6 = r13
        L54:
            r14 = 0
            com.google.android.recaptcha.internal.zzao r7 = r6.zze     // Catch: java.lang.Throwable -> Lb1
            com.google.android.recaptcha.internal.zzao r8 = com.google.android.recaptcha.internal.zzao.zza     // Catch: java.lang.Throwable -> Lb1
            boolean r7 = defpackage.AbstractC0500aq.b(r7, r8)     // Catch: java.lang.Throwable -> Lb1
            if (r7 != 0) goto L65
            Vv r2 = (defpackage.Vv) r2
            r2.f(r14)
            return r3
        L65:
            com.google.android.recaptcha.internal.zzao r7 = com.google.android.recaptcha.internal.zzao.zzb     // Catch: java.lang.Throwable -> Lb1
            r6.zze = r7     // Catch: java.lang.Throwable -> Lb1
            Vv r2 = (defpackage.Vv) r2
            r2.f(r14)
            com.google.android.recaptcha.internal.zzek r2 = r6.zzc
            java.lang.String r7 = r2.zzd()
            r2.zzc(r7)
            r2.zzb(r4)
            r7 = 38
            com.google.android.recaptcha.internal.zzen r2 = r2.zzf(r7)
            Ja r7 = defpackage.AbstractC3279qd.a()
            r6.zza = r7
            Rc r7 = r6.zzb
            com.google.android.recaptcha.internal.zzam r8 = new com.google.android.recaptcha.internal.zzam
            r8.<init>(r6, r2, r14)
            defpackage.AbstractC0136He.y(r7, r8)
            r0.zze = r14
            r0.zza = r14
            r0.zzd = r4
            boolean r14 = r6.zzh
            if (r14 != 0) goto Lad
            java.util.Timer r7 = new java.util.Timer
            r7.<init>()
            com.google.android.recaptcha.internal.zzai r8 = new com.google.android.recaptcha.internal.zzai
            r8.<init>(r6)
            r11 = 28800000(0x1b77400, double:1.42290906E-316)
            r9 = r11
            r7.schedule(r8, r9, r11)
            r6.zzh = r5
        Lad:
            if (r3 != r1) goto Lb0
            goto Lb8
        Lb0:
            return r3
        Lb1:
            r0 = move-exception
            Vv r2 = (defpackage.Vv) r2
            r2.f(r14)
            throw r0
        Lb8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zze(uc):java.lang.Object");
    }

    @NotNull
    public final InterfaceC0149Ia zzf() {
        InterfaceC0149Ia interfaceC0149Ia = this.zza;
        if (interfaceC0149Ia != null) {
            return interfaceC0149Ia;
        }
        return null;
    }
}
