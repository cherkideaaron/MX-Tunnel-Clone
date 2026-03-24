package com.google.android.gms.internal.ads;

import defpackage.AbstractC0069Df;
import defpackage.AbstractC0136He;
import defpackage.AbstractC0500aq;
import defpackage.InterfaceC0272Pe;
import defpackage.InterfaceC0304Rc;
import defpackage.Tv;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class zzgaf implements zzfyv {

    @NotNull
    private final InterfaceC0304Rc zza;

    @NotNull
    private final Tv zzb;

    @NotNull
    private final Tv zzc;

    @NotNull
    private final Tv zzd;
    private boolean zze;
    private zzfyt zzf;
    private boolean zzg;

    @NotNull
    private final InterfaceC0272Pe zzh;

    @NotNull
    private final zzdvj zzi;

    public zzgaf(@NotNull InterfaceC0272Pe interfaceC0272Pe, @NotNull zzfzh zzfzhVar, @NotNull zzdvj zzdvjVar, @NotNull zzfze zzfzeVar) {
        AbstractC0500aq.m(interfaceC0272Pe, "adQualityDataStore");
        AbstractC0500aq.m(zzfzhVar, "coroutineScopeProvider");
        AbstractC0500aq.m(zzdvjVar, "dataPinger");
        AbstractC0500aq.m(zzfzeVar, "clock");
        this.zzi = zzdvjVar;
        this.zza = zzfzhVar.zza();
        this.zzb = AbstractC0069Df.a();
        this.zzc = AbstractC0069Df.a();
        this.zzd = AbstractC0069Df.a();
        this.zzh = interfaceC0272Pe;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v13, types: [Tv] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzs(java.lang.String r8, defpackage.InterfaceC3493uc r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.google.android.gms.internal.ads.zzfzk
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.gms.internal.ads.zzfzk r0 = (com.google.android.gms.internal.ads.zzfzk) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfzk r0 = new com.google.android.gms.internal.ads.zzfzk
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.zzc
            Sc r1 = defpackage.EnumC0321Sc.a
            int r2 = r0.zze
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r8 = r0.zza
            Tv r8 = (defpackage.Tv) r8
            defpackage.AbstractC0115Ga.U(r9)     // Catch: java.lang.Throwable -> L2f
            goto L70
        L2f:
            r9 = move-exception
            goto L7e
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            java.lang.Object r8 = r0.zzb
            Tv r8 = (defpackage.Tv) r8
            java.lang.Object r2 = r0.zza
            java.lang.String r2 = (java.lang.String) r2
            defpackage.AbstractC0115Ga.U(r9)
            r9 = r8
            r8 = r2
            goto L5a
        L47:
            defpackage.AbstractC0115Ga.U(r9)
            Tv r9 = r7.zzd
            r0.zza = r8
            r0.zzb = r9
            r0.zze = r4
            Vv r9 = (defpackage.Vv) r9
            java.lang.Object r2 = r9.d(r0)
            if (r2 == r1) goto L84
        L5a:
            Pe r2 = r7.zzh     // Catch: java.lang.Throwable -> L7a
            com.google.android.gms.internal.ads.zzfzl r4 = new com.google.android.gms.internal.ads.zzfzl     // Catch: java.lang.Throwable -> L7a
            r4.<init>(r8, r5)     // Catch: java.lang.Throwable -> L7a
            r0.zza = r9     // Catch: java.lang.Throwable -> L7a
            r0.zzb = r5     // Catch: java.lang.Throwable -> L7a
            r0.zze = r3     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r8 = r2.a(r4, r0)     // Catch: java.lang.Throwable -> L7a
            if (r8 == r1) goto L84
            r6 = r9
            r9 = r8
            r8 = r6
        L70:
            com.google.android.gms.internal.ads.zzfyy r9 = (com.google.android.gms.internal.ads.zzfyy) r9     // Catch: java.lang.Throwable -> L2f
            Vv r8 = (defpackage.Vv) r8
            r8.f(r5)
            DK r8 = defpackage.DK.a
            return r8
        L7a:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L7e:
            Vv r8 = (defpackage.Vv) r8
            r8.f(r5)
            throw r9
        L84:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgaf.zzs(java.lang.String, uc):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v4, types: [Tv] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzt(defpackage.InterfaceC3493uc r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zzfzn
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.internal.ads.zzfzn r0 = (com.google.android.gms.internal.ads.zzfzn) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfzn r0 = new com.google.android.gms.internal.ads.zzfzn
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.zzb
            Sc r1 = defpackage.EnumC0321Sc.a
            int r2 = r0.zzd
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L42
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r0 = r0.zza
            Tv r0 = (defpackage.Tv) r0
            defpackage.AbstractC0115Ga.U(r8)     // Catch: java.lang.Throwable -> L2f
            goto L67
        L2f:
            r8 = move-exception
            goto L75
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L39:
            java.lang.Object r2 = r0.zza
            Tv r2 = (defpackage.Tv) r2
            defpackage.AbstractC0115Ga.U(r8)
            r8 = r2
            goto L53
        L42:
            defpackage.AbstractC0115Ga.U(r8)
            Tv r8 = r7.zzd
            r0.zza = r8
            r0.zzd = r4
            Vv r8 = (defpackage.Vv) r8
            java.lang.Object r2 = r8.d(r0)
            if (r2 == r1) goto L7b
        L53:
            Pe r2 = r7.zzh     // Catch: java.lang.Throwable -> L71
            com.google.android.gms.internal.ads.zzfzo r4 = new com.google.android.gms.internal.ads.zzfzo     // Catch: java.lang.Throwable -> L71
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L71
            r0.zza = r8     // Catch: java.lang.Throwable -> L71
            r0.zzd = r3     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r2.a(r4, r0)     // Catch: java.lang.Throwable -> L71
            if (r0 == r1) goto L7b
            r6 = r0
            r0 = r8
            r8 = r6
        L67:
            com.google.android.gms.internal.ads.zzfyy r8 = (com.google.android.gms.internal.ads.zzfyy) r8     // Catch: java.lang.Throwable -> L2f
            Vv r0 = (defpackage.Vv) r0
            r0.f(r5)
            DK r8 = defpackage.DK.a
            return r8
        L71:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L75:
            Vv r0 = (defpackage.Vv) r0
            r0.f(r5)
            throw r8
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgaf.zzt(uc):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzu(long r6, defpackage.InterfaceC3493uc r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zzfzm
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.internal.ads.zzfzm r0 = (com.google.android.gms.internal.ads.zzfzm) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfzm r0 = new com.google.android.gms.internal.ads.zzfzm
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.zzc
            Sc r1 = defpackage.EnumC0321Sc.a
            int r2 = r0.zze
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r6 = r0.zza
            java.lang.Object r0 = r0.zzb
            Tv r0 = (defpackage.Tv) r0
            defpackage.AbstractC0115Ga.U(r8)
            goto L49
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            defpackage.AbstractC0115Ga.U(r8)
            Tv r8 = r5.zzb
            r0.zzb = r8
            r0.zza = r6
            r0.zze = r3
            Vv r8 = (defpackage.Vv) r8
            java.lang.Object r0 = r8.d(r0)
            if (r0 == r1) goto L79
            r0 = r8
        L49:
            r8 = 0
            com.google.android.gms.internal.ads.zzfyt r1 = r5.zzf     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "adQualityDataBuilder"
            if (r1 == 0) goto L6f
            long r3 = r1.zzi()     // Catch: java.lang.Throwable -> L69
            long r6 = r6 - r3
            com.google.android.gms.internal.ads.zzfyt r3 = r5.zzf     // Catch: java.lang.Throwable -> L69
            if (r3 == 0) goto L6b
            long r2 = r3.zzg()     // Catch: java.lang.Throwable -> L69
            long r6 = r6 - r2
            r1.zzb(r6)     // Catch: java.lang.Throwable -> L69
            Vv r0 = (defpackage.Vv) r0
            r0.f(r8)
            DK r6 = defpackage.DK.a
            return r6
        L69:
            r6 = move-exception
            goto L73
        L6b:
            defpackage.AbstractC0500aq.d0(r2)     // Catch: java.lang.Throwable -> L69
            throw r8     // Catch: java.lang.Throwable -> L69
        L6f:
            defpackage.AbstractC0500aq.d0(r2)     // Catch: java.lang.Throwable -> L69
            throw r8     // Catch: java.lang.Throwable -> L69
        L73:
            Vv r0 = (defpackage.Vv) r0
            r0.f(r8)
            throw r6
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgaf.zzu(long, uc):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzv(defpackage.InterfaceC3493uc r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zzfzr
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.internal.ads.zzfzr r0 = (com.google.android.gms.internal.ads.zzfzr) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfzr r0 = new com.google.android.gms.internal.ads.zzfzr
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.zzc
            Sc r1 = defpackage.EnumC0321Sc.a
            int r2 = r0.zze
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L51
            if (r2 == r6) goto L49
            if (r2 == r5) goto L3d
            if (r2 != r4) goto L35
            java.lang.Object r0 = r0.zza
            Tv r0 = (defpackage.Tv) r0
            defpackage.AbstractC0115Ga.U(r8)     // Catch: java.lang.Throwable -> L32
            goto L9a
        L32:
            r8 = move-exception
            goto La6
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3d:
            java.lang.Object r2 = r0.zzb
            Tv r2 = (defpackage.Tv) r2
            java.lang.Object r5 = r0.zza
            com.google.android.gms.internal.ads.zzfyu r5 = (com.google.android.gms.internal.ads.zzfyu) r5
            defpackage.AbstractC0115Ga.U(r8)
            goto L86
        L49:
            java.lang.Object r2 = r0.zza
            Tv r2 = (defpackage.Tv) r2
            defpackage.AbstractC0115Ga.U(r8)
            goto L63
        L51:
            defpackage.AbstractC0115Ga.U(r8)
            Tv r8 = r7.zzb
            r0.zza = r8
            r0.zze = r6
            r2 = r8
            Vv r2 = (defpackage.Vv) r2
            java.lang.Object r8 = r2.d(r0)
            if (r8 == r1) goto Lba
        L63:
            com.google.android.gms.internal.ads.zzfyt r8 = r7.zzf     // Catch: java.lang.Throwable -> Lac
            if (r8 == 0) goto Lae
            com.google.android.gms.internal.ads.zzibr r8 = r8.zzbu()     // Catch: java.lang.Throwable -> Lac
            com.google.android.gms.internal.ads.zzfyu r8 = (com.google.android.gms.internal.ads.zzfyu) r8     // Catch: java.lang.Throwable -> Lac
            Vv r2 = (defpackage.Vv) r2
            r2.f(r3)
            defpackage.AbstractC0500aq.j(r8)
            Tv r2 = r7.zzd
            r0.zza = r8
            r0.zzb = r2
            r0.zze = r5
            Vv r2 = (defpackage.Vv) r2
            java.lang.Object r5 = r2.d(r0)
            if (r5 == r1) goto Lba
            r5 = r8
        L86:
            Pe r8 = r7.zzh     // Catch: java.lang.Throwable -> La4
            com.google.android.gms.internal.ads.zzfzs r6 = new com.google.android.gms.internal.ads.zzfzs     // Catch: java.lang.Throwable -> La4
            r6.<init>(r5, r3)     // Catch: java.lang.Throwable -> La4
            r0.zza = r2     // Catch: java.lang.Throwable -> La4
            r0.zzb = r3     // Catch: java.lang.Throwable -> La4
            r0.zze = r4     // Catch: java.lang.Throwable -> La4
            java.lang.Object r8 = r8.a(r6, r0)     // Catch: java.lang.Throwable -> La4
            if (r8 == r1) goto Lba
            r0 = r2
        L9a:
            com.google.android.gms.internal.ads.zzfyy r8 = (com.google.android.gms.internal.ads.zzfyy) r8     // Catch: java.lang.Throwable -> L32
            Vv r0 = (defpackage.Vv) r0
            r0.f(r3)
            DK r8 = defpackage.DK.a
            return r8
        La4:
            r8 = move-exception
            r0 = r2
        La6:
            Vv r0 = (defpackage.Vv) r0
            r0.f(r3)
            throw r8
        Lac:
            r8 = move-exception
            goto Lb4
        Lae:
            java.lang.String r8 = "adQualityDataBuilder"
            defpackage.AbstractC0500aq.d0(r8)     // Catch: java.lang.Throwable -> Lac
            throw r3     // Catch: java.lang.Throwable -> Lac
        Lb4:
            Vv r2 = (defpackage.Vv) r2
            r2.f(r3)
            throw r8
        Lba:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgaf.zzv(uc):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean zzw(com.google.android.gms.internal.ads.zzfyu r9) {
        /*
            java.util.List r0 = r9.zzk()
            if (r0 == 0) goto Ld
            java.lang.Object r0 = defpackage.AbstractC3383sa.e0(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            goto Le
        Ld:
            r0 = 0
        Le:
            int r1 = r9.zzl()
            int r2 = r9.zzm()
            r3 = 1
            r4 = 0
            if (r1 <= r2) goto L22
            boolean r1 = r9.zzd()
            if (r1 != 0) goto L22
            r1 = r3
            goto L23
        L22:
            r1 = r4
        L23:
            if (r0 == 0) goto L36
            long r5 = r0.longValue()
            long r7 = r9.zzi()
            long r7 = r7 - r5
            r5 = 5000(0x1388, double:2.4703E-320)
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 <= 0) goto L36
            r9 = r3
            goto L37
        L36:
            r9 = r4
        L37:
            if (r1 != 0) goto L3d
            if (r9 == 0) goto L3c
            goto L3d
        L3c:
            return r4
        L3d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgaf.zzw(com.google.android.gms.internal.ads.zzfyu):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zza() {
        AbstractC0136He.y(this.zza, new zzgaa(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zzb(@NotNull String str) {
        AbstractC0500aq.m(str, "gwsQueryId");
        AbstractC0136He.y(this.zza, new zzfzu(this, str, null));
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zzc() {
        AbstractC0136He.y(this.zza, new zzfzq(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zzd() {
        AbstractC0136He.y(this.zza, new zzgae(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zze() {
        AbstractC0136He.y(this.zza, new zzfzy(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zzf() {
        AbstractC0136He.y(this.zza, new zzgac(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zzg() {
        AbstractC0136He.y(this.zza, new zzfzw(this, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.android.gms.internal.ads.zzgaf] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzh(@org.jetbrains.annotations.NotNull defpackage.InterfaceC3493uc r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.google.android.gms.internal.ads.zzfzz
            if (r0 == 0) goto L13
            r0 = r10
            com.google.android.gms.internal.ads.zzfzz r0 = (com.google.android.gms.internal.ads.zzfzz) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfzz r0 = new com.google.android.gms.internal.ads.zzfzz
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.zzb
            Sc r1 = defpackage.EnumC0321Sc.a
            int r2 = r0.zzd
            DK r3 = defpackage.DK.a
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4c
            if (r2 == r6) goto L44
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            defpackage.AbstractC0115Ga.U(r10)
            goto Ld7
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L39:
            java.lang.Object r2 = r0.zza
            Tv r2 = (defpackage.Tv) r2
            defpackage.AbstractC0115Ga.U(r10)     // Catch: java.lang.Throwable -> L41
            goto L6e
        L41:
            r10 = move-exception
            goto Ld8
        L44:
            java.lang.Object r2 = r0.zza
            Tv r2 = (defpackage.Tv) r2
            defpackage.AbstractC0115Ga.U(r10)
            goto L5e
        L4c:
            defpackage.AbstractC0115Ga.U(r10)
            Tv r10 = r9.zzd
            r0.zza = r10
            r0.zzd = r6
            Vv r10 = (defpackage.Vv) r10
            java.lang.Object r2 = r10.d(r0)
            if (r2 == r1) goto Lde
            r2 = r10
        L5e:
            Pe r10 = r9.zzh     // Catch: java.lang.Throwable -> L41
            ml r10 = r10.getData()     // Catch: java.lang.Throwable -> L41
            r0.zza = r2     // Catch: java.lang.Throwable -> L41
            r0.zzd = r5     // Catch: java.lang.Throwable -> L41
            java.lang.Object r10 = defpackage.AbstractC0069Df.r(r10, r0)     // Catch: java.lang.Throwable -> L41
            if (r10 == r1) goto Lde
        L6e:
            com.google.android.gms.internal.ads.zzfyy r10 = (com.google.android.gms.internal.ads.zzfyy) r10     // Catch: java.lang.Throwable -> L41
            Vv r2 = (defpackage.Vv) r2
            r2.f(r7)
            if (r10 == 0) goto Ld7
            int r2 = r10.zza()
            if (r2 != 0) goto L7e
            goto Ld7
        L7e:
            java.util.Map r10 = r10.zzb()
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L8a:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto Lcc
            java.lang.Object r2 = r10.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r5 = r2.getValue()
            com.google.android.gms.internal.ads.zzfyu r5 = (com.google.android.gms.internal.ads.zzfyu) r5
            com.google.android.gms.internal.ads.zzibl r5 = r5.zzcc()
            java.lang.String r8 = "toBuilder(...)"
            defpackage.AbstractC0500aq.l(r5, r8)
            com.google.android.gms.internal.ads.zzfyt r5 = (com.google.android.gms.internal.ads.zzfyt) r5
            java.lang.Object r2 = r2.getValue()
            java.lang.String r8 = "<get-value>(...)"
            defpackage.AbstractC0500aq.l(r2, r8)
            com.google.android.gms.internal.ads.zzfyu r2 = (com.google.android.gms.internal.ads.zzfyu) r2
            boolean r2 = zzw(r2)
            if (r2 == 0) goto Lbb
            r5.zzf(r6)
        Lbb:
            com.google.android.gms.internal.ads.zzdvj r2 = r9.zzi
            com.google.android.gms.internal.ads.zzibr r5 = r5.zzbu()
            java.lang.String r8 = "build(...)"
            defpackage.AbstractC0500aq.l(r5, r8)
            com.google.android.gms.internal.ads.zzfyu r5 = (com.google.android.gms.internal.ads.zzfyu) r5
            r2.zza(r5)
            goto L8a
        Lcc:
            r0.zza = r7
            r0.zzd = r4
            java.lang.Object r10 = r9.zzt(r0)
            if (r10 != r1) goto Ld7
            goto Lde
        Ld7:
            return r3
        Ld8:
            Vv r2 = (defpackage.Vv) r2
            r2.f(r7)
            throw r10
        Lde:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgaf.zzh(uc):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzi(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull defpackage.InterfaceC3493uc r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.zzfzt
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.gms.internal.ads.zzfzt r0 = (com.google.android.gms.internal.ads.zzfzt) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfzt r0 = new com.google.android.gms.internal.ads.zzfzt
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.zzc
            Sc r1 = defpackage.EnumC0321Sc.a
            int r2 = r0.zze
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            long r1 = r0.zzb
            java.lang.Object r7 = r0.zza
            Tv r7 = (defpackage.Tv) r7
            java.lang.String r0 = r0.zzf
            defpackage.AbstractC0115Ga.U(r8)
            goto L53
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            defpackage.AbstractC0115Ga.U(r8)
            Tv r8 = r6.zzb
            long r4 = java.lang.System.currentTimeMillis()
            r0.zzf = r7
            r0.zza = r8
            r0.zzb = r4
            r0.zze = r3
            Vv r8 = (defpackage.Vv) r8
            java.lang.Object r0 = r8.d(r0)
            if (r0 == r1) goto L81
            r0 = r7
            r7 = r8
            r1 = r4
        L53:
            r8 = 0
            boolean r4 = r6.zze     // Catch: java.lang.Throwable -> L7a
            DK r5 = defpackage.DK.a
            if (r4 == 0) goto L60
        L5a:
            Vv r7 = (defpackage.Vv) r7
            r7.f(r8)
            return r5
        L60:
            r6.zze = r3     // Catch: java.lang.Throwable -> L7a
            com.google.android.gms.internal.ads.zzfyu r3 = com.google.android.gms.internal.ads.zzfyu.zzp()     // Catch: java.lang.Throwable -> L7a
            com.google.android.gms.internal.ads.zzibl r3 = r3.zzcc()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r4 = "toBuilder(...)"
            defpackage.AbstractC0500aq.l(r3, r4)     // Catch: java.lang.Throwable -> L7a
            com.google.android.gms.internal.ads.zzfyt r3 = (com.google.android.gms.internal.ads.zzfyt) r3     // Catch: java.lang.Throwable -> L7a
            r6.zzf = r3     // Catch: java.lang.Throwable -> L7a
            r3.zza(r0)     // Catch: java.lang.Throwable -> L7a
            r3.zzj(r1)     // Catch: java.lang.Throwable -> L7a
            goto L5a
        L7a:
            r0 = move-exception
            Vv r7 = (defpackage.Vv) r7
            r7.f(r8)
            throw r0
        L81:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgaf.zzi(java.lang.String, uc):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008f A[Catch: all -> 0x00ab, TRY_LEAVE, TryCatch #1 {all -> 0x00ab, blocks: (B:30:0x008b, B:32:0x008f, B:41:0x00ad, B:42:0x00b2), top: B:51:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ad A[Catch: all -> 0x00ab, TRY_ENTER, TryCatch #1 {all -> 0x00ab, blocks: (B:30:0x008b, B:32:0x008f, B:41:0x00ad, B:42:0x00b2), top: B:51:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzj(@org.jetbrains.annotations.NotNull defpackage.InterfaceC3493uc r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.google.android.gms.internal.ads.zzfzp
            if (r0 == 0) goto L13
            r0 = r11
            com.google.android.gms.internal.ads.zzfzp r0 = (com.google.android.gms.internal.ads.zzfzp) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfzp r0 = new com.google.android.gms.internal.ads.zzfzp
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.zzc
            Sc r1 = defpackage.EnumC0321Sc.a
            int r2 = r0.zze
            DK r3 = defpackage.DK.a
            r4 = 0
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r2 == 0) goto L52
            if (r2 == r8) goto L4a
            if (r2 == r7) goto L40
            if (r2 == r6) goto L3c
            if (r2 != r5) goto L34
            defpackage.AbstractC0115Ga.U(r11)
            goto Laa
        L34:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3c:
            defpackage.AbstractC0115Ga.U(r11)
            goto La1
        L40:
            long r7 = r0.zzb
            java.lang.Object r2 = r0.zza
            Tv r2 = (defpackage.Tv) r2
            defpackage.AbstractC0115Ga.U(r11)
            goto L8b
        L4a:
            java.lang.Object r2 = r0.zza
            Tv r2 = (defpackage.Tv) r2
            defpackage.AbstractC0115Ga.U(r11)
            goto L64
        L52:
            defpackage.AbstractC0115Ga.U(r11)
            Tv r11 = r10.zzc
            r0.zza = r11
            r0.zze = r8
            r2 = r11
            Vv r2 = (defpackage.Vv) r2
            java.lang.Object r11 = r2.d(r0)
            if (r11 == r1) goto Lc0
        L64:
            boolean r11 = r10.zzg     // Catch: java.lang.Throwable -> Lb9
            if (r11 == 0) goto L6e
            Vv r2 = (defpackage.Vv) r2
            r2.f(r4)
            return r3
        L6e:
            r10.zzg = r8     // Catch: java.lang.Throwable -> Lb9
            Vv r2 = (defpackage.Vv) r2
            r2.f(r4)
            Tv r11 = r10.zzb
            long r8 = java.lang.System.currentTimeMillis()
            r0.zza = r11
            r0.zzb = r8
            r0.zze = r7
            r2 = r11
            Vv r2 = (defpackage.Vv) r2
            java.lang.Object r11 = r2.d(r0)
            if (r11 == r1) goto Lc0
            r7 = r8
        L8b:
            com.google.android.gms.internal.ads.zzfyt r11 = r10.zzf     // Catch: java.lang.Throwable -> Lab
            if (r11 == 0) goto Lad
            r11.zzo(r7)     // Catch: java.lang.Throwable -> Lab
            Vv r2 = (defpackage.Vv) r2
            r2.f(r4)
            r0.zza = r4
            r0.zze = r6
            java.lang.Object r11 = r10.zzu(r7, r0)
            if (r11 == r1) goto Lc0
        La1:
            r0.zze = r5
            java.lang.Object r11 = r10.zzv(r0)
            if (r11 != r1) goto Laa
            goto Lc0
        Laa:
            return r3
        Lab:
            r11 = move-exception
            goto Lb3
        Lad:
            java.lang.String r11 = "adQualityDataBuilder"
            defpackage.AbstractC0500aq.d0(r11)     // Catch: java.lang.Throwable -> Lab
            throw r4     // Catch: java.lang.Throwable -> Lab
        Lb3:
            Vv r2 = (defpackage.Vv) r2
            r2.f(r4)
            throw r11
        Lb9:
            r11 = move-exception
            Vv r2 = (defpackage.Vv) r2
            r2.f(r4)
            throw r11
        Lc0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgaf.zzj(uc):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0083 A[Catch: all -> 0x00c1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00c1, blocks: (B:27:0x007d, B:30:0x0083, B:33:0x008b, B:35:0x008f, B:37:0x00ab, B:39:0x00b4, B:41:0x00b8, B:44:0x00c3, B:45:0x00c6, B:46:0x00c7, B:47:0x00ca, B:48:0x00cb, B:49:0x00ce, B:50:0x00cf, B:52:0x00d3, B:54:0x00d9, B:56:0x00dd, B:58:0x00f9, B:59:0x0102, B:60:0x0105, B:61:0x0106, B:62:0x0109, B:63:0x010a, B:65:0x010e, B:68:0x0117, B:69:0x011a, B:70:0x011b, B:71:0x011e, B:72:0x011f, B:73:0x0122), top: B:80:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011f A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:27:0x007d, B:30:0x0083, B:33:0x008b, B:35:0x008f, B:37:0x00ab, B:39:0x00b4, B:41:0x00b8, B:44:0x00c3, B:45:0x00c6, B:46:0x00c7, B:47:0x00ca, B:48:0x00cb, B:49:0x00ce, B:50:0x00cf, B:52:0x00d3, B:54:0x00d9, B:56:0x00dd, B:58:0x00f9, B:59:0x0102, B:60:0x0105, B:61:0x0106, B:62:0x0109, B:63:0x010a, B:65:0x010e, B:68:0x0117, B:69:0x011a, B:70:0x011b, B:71:0x011e, B:72:0x011f, B:73:0x0122), top: B:80:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzk(@org.jetbrains.annotations.NotNull defpackage.InterfaceC3493uc r13) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgaf.zzk(uc):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0097 A[Catch: all -> 0x00ea, TRY_ENTER, TryCatch #1 {all -> 0x00ea, blocks: (B:31:0x0091, B:34:0x0097, B:36:0x00a1, B:38:0x00ad, B:40:0x00b4, B:52:0x00ec, B:53:0x00ef, B:54:0x00f0, B:55:0x00f3, B:56:0x00f4, B:57:0x00f7, B:58:0x00f8, B:59:0x00fb), top: B:68:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f8 A[Catch: all -> 0x00ea, TryCatch #1 {all -> 0x00ea, blocks: (B:31:0x0091, B:34:0x0097, B:36:0x00a1, B:38:0x00ad, B:40:0x00b4, B:52:0x00ec, B:53:0x00ef, B:54:0x00f0, B:55:0x00f3, B:56:0x00f4, B:57:0x00f7, B:58:0x00f8, B:59:0x00fb), top: B:68:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzl(@org.jetbrains.annotations.NotNull defpackage.InterfaceC3493uc r15) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgaf.zzl(uc):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009a A[Catch: all -> 0x00f4, TRY_ENTER, TryCatch #1 {all -> 0x00f4, blocks: (B:30:0x0094, B:33:0x009a, B:35:0x00a4, B:37:0x00b0, B:39:0x00b7, B:41:0x00be, B:53:0x00f6, B:54:0x00f9, B:55:0x00fa, B:56:0x00fd, B:57:0x00fe, B:58:0x0101, B:59:0x0102, B:60:0x0105, B:61:0x0106, B:62:0x0109), top: B:71:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0106 A[Catch: all -> 0x00f4, TryCatch #1 {all -> 0x00f4, blocks: (B:30:0x0094, B:33:0x009a, B:35:0x00a4, B:37:0x00b0, B:39:0x00b7, B:41:0x00be, B:53:0x00f6, B:54:0x00f9, B:55:0x00fa, B:56:0x00fd, B:57:0x00fe, B:58:0x0101, B:59:0x0102, B:60:0x0105, B:61:0x0106, B:62:0x0109), top: B:71:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzm(@org.jetbrains.annotations.NotNull defpackage.InterfaceC3493uc r18) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgaf.zzm(uc):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzn(@org.jetbrains.annotations.NotNull defpackage.InterfaceC3493uc r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.gms.internal.ads.zzfzv
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.gms.internal.ads.zzfzv r0 = (com.google.android.gms.internal.ads.zzfzv) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzfzv r0 = new com.google.android.gms.internal.ads.zzfzv
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.zzc
            Sc r1 = defpackage.EnumC0321Sc.a
            int r2 = r0.zze
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r1 = r0.zza
            java.lang.Object r0 = r0.zzb
            Tv r0 = (defpackage.Tv) r0
            defpackage.AbstractC0115Ga.U(r7)
            goto L4e
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            defpackage.AbstractC0115Ga.U(r7)
            Tv r7 = r6.zzb
            long r4 = java.lang.System.currentTimeMillis()
            r0.zzb = r7
            r0.zza = r4
            r0.zze = r3
            Vv r7 = (defpackage.Vv) r7
            java.lang.Object r0 = r7.d(r0)
            if (r0 == r1) goto L6c
            r0 = r7
            r1 = r4
        L4e:
            r7 = 0
            com.google.android.gms.internal.ads.zzfyt r3 = r6.zzf     // Catch: java.lang.Throwable -> L5e
            if (r3 == 0) goto L60
            r3.zzs(r1)     // Catch: java.lang.Throwable -> L5e
            Vv r0 = (defpackage.Vv) r0
            r0.f(r7)
            DK r7 = defpackage.DK.a
            return r7
        L5e:
            r1 = move-exception
            goto L66
        L60:
            java.lang.String r1 = "adQualityDataBuilder"
            defpackage.AbstractC0500aq.d0(r1)     // Catch: java.lang.Throwable -> L5e
            throw r7     // Catch: java.lang.Throwable -> L5e
        L66:
            Vv r0 = (defpackage.Vv) r0
            r0.f(r7)
            throw r1
        L6c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgaf.zzn(uc):java.lang.Object");
    }
}
