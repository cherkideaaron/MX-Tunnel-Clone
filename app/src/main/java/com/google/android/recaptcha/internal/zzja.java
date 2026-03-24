package com.google.android.recaptcha.internal;

import android.app.Application;
import android.content.pm.PackageManager;
import android.webkit.WebView;
import defpackage.AbstractC0069Df;
import defpackage.AbstractC0136He;
import defpackage.AbstractC0500aq;
import defpackage.AbstractC3383sa;
import defpackage.C0166Ja;
import defpackage.C0530bJ;
import defpackage.DK;
import defpackage.EnumC0321Sc;
import defpackage.InterfaceC0149Ia;
import defpackage.InterfaceC3493uc;
import defpackage.InterfaceC3508ur;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.MissingResourceException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class zzja extends zze {
    public InterfaceC0149Ia zza;
    public zzfo zzb;

    @NotNull
    private final zzek zzc;
    private zzsc zzf;

    @NotNull
    private final zzek zzj;

    @NotNull
    private final InterfaceC3508ur zzk;

    @NotNull
    private final InterfaceC3508ur zzl;

    @NotNull
    private final InterfaceC3508ur zzm;

    @NotNull
    private final InterfaceC3508ur zzn;

    @NotNull
    private final InterfaceC3508ur zzo;

    @Nullable
    private zzen zzp;

    @NotNull
    private final zzbi zzq;

    @NotNull
    private final Map zzd = zzjb.zza();

    @NotNull
    private final Map zze = new LinkedHashMap();

    @NotNull
    private final zzcb zzg = new zzcb(zzje.zza);

    @NotNull
    private final zzjh zzh = zzjh.zzc();

    @NotNull
    private final zzij zzi = new zzij(this);

    public zzja(@NotNull zzek zzekVar, @NotNull zzbi zzbiVar) {
        this.zzc = zzekVar;
        this.zzq = zzbiVar;
        zzek zzekVarZza = zzekVar.zza();
        zzekVarZza.zzc(zzekVar.zzd());
        this.zzj = zzekVarZza;
        int i = zzav.zza;
        this.zzk = AbstractC0069Df.G(zzis.zza);
        this.zzl = AbstractC0069Df.G(zzit.zza);
        this.zzm = AbstractC0069Df.G(zziu.zza);
        this.zzn = AbstractC0069Df.G(zziv.zza);
        this.zzo = AbstractC0069Df.G(zziw.zza);
    }

    private final Application zzD() {
        return (Application) this.zzo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzE(com.google.android.recaptcha.internal.zzsc r5, defpackage.InterfaceC3493uc r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzim
            if (r0 == 0) goto L13
            r0 = r6
            com.google.android.recaptcha.internal.zzim r0 = (com.google.android.recaptcha.internal.zzim) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzim r0 = new com.google.android.recaptcha.internal.zzim
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.zza
            Sc r1 = defpackage.EnumC0321Sc.a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.google.android.recaptcha.internal.zzja r5 = r0.zzd
            defpackage.AbstractC0115Ga.U(r6)     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            goto L4c
        L29:
            r6 = move-exception
            goto L61
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.AbstractC0115Ga.U(r6)
            ur r6 = r4.zzn     // Catch: com.google.android.recaptcha.internal.zzbd -> L5e
            java.lang.Object r6 = r6.getValue()     // Catch: com.google.android.recaptcha.internal.zzbd -> L5e
            com.google.android.recaptcha.internal.zzff r6 = (com.google.android.recaptcha.internal.zzff) r6     // Catch: com.google.android.recaptcha.internal.zzbd -> L5e
            com.google.android.recaptcha.internal.zzek r2 = r4.zzj     // Catch: com.google.android.recaptcha.internal.zzbd -> L5e
            r0.zzd = r4     // Catch: com.google.android.recaptcha.internal.zzbd -> L5e
            r0.zzc = r3     // Catch: com.google.android.recaptcha.internal.zzbd -> L5e
            java.lang.Object r6 = r6.zzd(r5, r2, r0)     // Catch: com.google.android.recaptcha.internal.zzbd -> L5e
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r5 = r4
        L4c:
            java.lang.String r6 = (java.lang.String) r6     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            com.google.android.recaptcha.internal.zzbi r0 = r5.zzq     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            Rc r0 = r0.zzb()     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            com.google.android.recaptcha.internal.zzin r1 = new com.google.android.recaptcha.internal.zzin     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            r2 = 0
            r1.<init>(r5, r6, r2)     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            defpackage.AbstractC0136He.y(r0, r1)     // Catch: com.google.android.recaptcha.internal.zzbd -> L29
            goto L6a
        L5e:
            r5 = move-exception
            r6 = r5
            r5 = r4
        L61:
            Ia r5 = r5.zzA()
            Ja r5 = (defpackage.C0166Ja) r5
            r5.S(r6)
        L6a:
            DK r5 = defpackage.DK.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzE(com.google.android.recaptcha.internal.zzsc, uc):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzF(java.lang.String r9, defpackage.InterfaceC3493uc r10) throws android.content.pm.PackageManager.NameNotFoundException, java.util.MissingResourceException {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.google.android.recaptcha.internal.zzio
            if (r0 == 0) goto L13
            r0 = r10
            com.google.android.recaptcha.internal.zzio r0 = (com.google.android.recaptcha.internal.zzio) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzio r0 = new com.google.android.recaptcha.internal.zzio
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.zza
            Sc r1 = defpackage.EnumC0321Sc.a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.String r9 = r0.zzf
            java.lang.String r1 = r0.zze
            com.google.android.recaptcha.internal.zzja r0 = r0.zzd
            defpackage.AbstractC0115Ga.U(r10)     // Catch: java.lang.Exception -> L2f
            r3 = r9
            r4 = r1
            goto L64
        L2f:
            r9 = move-exception
            goto L73
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            defpackage.AbstractC0115Ga.U(r10)
            com.google.android.recaptcha.internal.zzek r10 = r8.zzj
            r2 = 26
            com.google.android.recaptcha.internal.zzen r10 = r10.zzf(r2)
            r8.zzp = r10
            ur r10 = r8.zzl     // Catch: java.lang.Exception -> L71
            java.lang.Object r10 = r10.getValue()     // Catch: java.lang.Exception -> L71
            com.google.android.recaptcha.internal.zzbr r10 = (com.google.android.recaptcha.internal.zzbr) r10     // Catch: java.lang.Exception -> L71
            java.lang.String r10 = r10.zza()     // Catch: java.lang.Exception -> L71
            r0.zzd = r8     // Catch: java.lang.Exception -> L71
            r0.zze = r9     // Catch: java.lang.Exception -> L71
            r0.zzf = r10     // Catch: java.lang.Exception -> L71
            r0.zzc = r3     // Catch: java.lang.Exception -> L71
            java.lang.Object r0 = r8.zzw(r0)     // Catch: java.lang.Exception -> L71
            if (r0 == r1) goto L70
            r4 = r9
            r3 = r10
            r10 = r0
            r0 = r8
        L64:
            r2 = r10
            android.webkit.WebView r2 = (android.webkit.WebView) r2     // Catch: java.lang.Exception -> L2f
            java.lang.String r5 = "text/html"
            java.lang.String r6 = "utf-8"
            r7 = 0
            r2.loadDataWithBaseURL(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L2f
            goto L93
        L70:
            return r1
        L71:
            r9 = move-exception
            r0 = r8
        L73:
            com.google.android.recaptcha.internal.zzbd r10 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r1 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r2 = com.google.android.recaptcha.internal.zzba.zzU
            java.lang.String r9 = r9.getMessage()
            r10.<init>(r1, r2, r9)
            com.google.android.recaptcha.internal.zzen r9 = r0.zzp
            if (r9 == 0) goto L87
            r9.zzb(r10)
        L87:
            r9 = 0
            r0.zzp = r9
            Ia r9 = r0.zzA()
            Ja r9 = (defpackage.C0166Ja) r9
            r9.S(r10)
        L93:
            DK r9 = defpackage.DK.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzF(java.lang.String, uc):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
    
        if (r10.zzc(r4, r2) == r3) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzG(java.lang.String r9, defpackage.InterfaceC3493uc r10) {
        /*
            r8 = this;
            r0 = 1
            r1 = 2
            boolean r2 = r10 instanceof com.google.android.recaptcha.internal.zzix
            if (r2 == 0) goto L15
            r2 = r10
            com.google.android.recaptcha.internal.zzix r2 = (com.google.android.recaptcha.internal.zzix) r2
            int r3 = r2.zzc
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L15
            int r3 = r3 - r4
            r2.zzc = r3
            goto L1a
        L15:
            com.google.android.recaptcha.internal.zzix r2 = new com.google.android.recaptcha.internal.zzix
            r2.<init>(r8, r10)
        L1a:
            java.lang.Object r10 = r2.zza
            Sc r3 = defpackage.EnumC0321Sc.a
            int r4 = r2.zzc
            DK r5 = defpackage.DK.a
            if (r4 == 0) goto L40
            if (r4 == r0) goto L38
            if (r4 != r1) goto L30
            java.lang.String r9 = r2.zze
            com.google.android.recaptcha.internal.zzja r0 = r2.zzd
            defpackage.AbstractC0115Ga.U(r10)
            goto L7c
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            java.lang.String r9 = r2.zze
            com.google.android.recaptcha.internal.zzja r0 = r2.zzd
            defpackage.AbstractC0115Ga.U(r10)
            goto L62
        L40:
            defpackage.AbstractC0115Ga.U(r10)
            com.google.android.recaptcha.internal.zzcb r10 = r8.zzg
            r4 = 3
            com.google.android.recaptcha.internal.zzje[] r4 = new com.google.android.recaptcha.internal.zzje[r4]
            com.google.android.recaptcha.internal.zzje r6 = com.google.android.recaptcha.internal.zzje.zzd
            r7 = 0
            r4[r7] = r6
            com.google.android.recaptcha.internal.zzje r6 = com.google.android.recaptcha.internal.zzje.zzc
            r4[r0] = r6
            com.google.android.recaptcha.internal.zzje r6 = com.google.android.recaptcha.internal.zzje.zzb
            r4[r1] = r6
            r2.zzd = r8
            r2.zze = r9
            r2.zzc = r0
            java.lang.Object r10 = r10.zzb(r4, r2)
            if (r10 == r3) goto L9d
            r0 = r8
        L62:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L6b
            return r5
        L6b:
            com.google.android.recaptcha.internal.zzcb r10 = r0.zzg
            com.google.android.recaptcha.internal.zzje r4 = com.google.android.recaptcha.internal.zzje.zzb
            r2.zzd = r0
            r2.zze = r9
            r2.zzc = r1
            java.lang.Object r10 = r10.zzc(r4, r2)
            if (r10 != r3) goto L7c
            goto L9d
        L7c:
            Ja r10 = defpackage.AbstractC3279qd.a()
            r0.zza = r10
            com.google.android.recaptcha.internal.zzek r10 = r0.zzj
            r10.zzc(r9)
            r9 = 42
            com.google.android.recaptcha.internal.zzen r9 = r10.zzf(r9)
            com.google.android.recaptcha.internal.zzbi r10 = r0.zzq
            Rc r10 = r10.zza()
            com.google.android.recaptcha.internal.zziz r1 = new com.google.android.recaptcha.internal.zziz
            r2 = 0
            r1.<init>(r0, r9, r2)
            defpackage.AbstractC0136He.y(r10, r1)
            return r5
        L9d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzG(java.lang.String, uc):java.lang.Object");
    }

    public static final /* synthetic */ zzfk zzp(zzja zzjaVar) {
        return (zzfk) zzjaVar.zzm.getValue();
    }

    @NotNull
    public final InterfaceC0149Ia zzA() {
        InterfaceC0149Ia interfaceC0149Ia = this.zza;
        if (interfaceC0149Ia != null) {
            return interfaceC0149Ia;
        }
        return null;
    }

    @NotNull
    public final zzft zzC(@NotNull zzsc zzscVar, @NotNull zzcg zzcgVar, @NotNull WebView webView) {
        zzfw zzfwVar = new zzfw(webView, this.zzq.zzb());
        zzhy zzhyVar = new zzhy();
        zzhyVar.zzb(AbstractC3383sa.k0(zzscVar.zzP()));
        zzgf zzgfVar = new zzgf(zzfwVar, zzcgVar, new zzbo());
        zzhz zzhzVar = new zzhz(zzhyVar, new zzhw());
        zzgfVar.zze(3, zzD());
        zzgfVar.zze(5, zzig.zza());
        zzgfVar.zze(6, new zzia(zzD()));
        zzgfVar.zze(7, new zzic());
        zzgfVar.zze(8, new zzii(zzD()));
        zzgfVar.zze(9, new zzid(zzD()));
        zzgfVar.zze(10, new zzib(zzD()));
        return new zzft(this.zzq.zzd(), zzgfVar, zzhzVar, zzfn.zza());
    }

    @Override // com.google.android.recaptcha.internal.zze
    @NotNull
    public final zzen zza(@NotNull String str) {
        zzek zzekVar = this.zzc;
        zzekVar.zzc(str);
        return zzekVar.zzf(33);
    }

    @Override // com.google.android.recaptcha.internal.zze
    @NotNull
    public final zzen zzb() {
        zzek zzekVar = this.zzc;
        zzekVar.zzc(zzekVar.zzd());
        return zzekVar.zzf(32);
    }

    @Override // com.google.android.recaptcha.internal.zze
    @Nullable
    public final Object zzd(@NotNull String str, @NotNull InterfaceC3493uc interfaceC3493uc) {
        zzsh zzshVarZzf = zzsi.zzf();
        zzshVarZzf.zze(str);
        return zzshVarZzf.zzk();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
    
        if (r11 != r1) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb A[Catch: Exception -> 0x004d, PHI: r2 r10
      0x00cb: PHI (r2v8 ??) = (r2v15 ??), (r2v16 ??) binds: [B:46:0x00c9, B:23:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x00cb: PHI (r10v12 java.lang.String) = (r10v11 java.lang.String), (r10v19 java.lang.String) binds: [B:46:0x00c9, B:23:0x0048] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {Exception -> 0x004d, blocks: (B:23:0x0048, B:47:0x00cb, B:45:0x00b9), top: B:59:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.google.android.recaptcha.internal.zzja] */
    @Override // com.google.android.recaptcha.internal.zze
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzf(@org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.NotNull defpackage.InterfaceC3493uc r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzf(java.lang.String, uc):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.internal.zze
    @Nullable
    public final Object zzg(@NotNull zzbd zzbdVar, @NotNull InterfaceC3493uc interfaceC3493uc) throws PackageManager.NameNotFoundException, MissingResourceException {
        if (AbstractC0500aq.b(zzbdVar.zza(), zzba.zzb)) {
            zzen zzenVar = this.zzp;
            if (zzenVar != null) {
                zzenVar.zzb(zzbdVar);
            }
            this.zzp = null;
        }
        return DK.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        if (zzG(r6, r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        if (r6.zzc(r7, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zze
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzh(@org.jetbrains.annotations.NotNull com.google.android.recaptcha.internal.zzsc r6, @org.jetbrains.annotations.NotNull defpackage.InterfaceC3493uc r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzir
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.recaptcha.internal.zzir r0 = (com.google.android.recaptcha.internal.zzir) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzir r0 = new com.google.android.recaptcha.internal.zzir
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.zza
            Sc r1 = defpackage.EnumC0321Sc.a
            int r2 = r0.zzc
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.AbstractC0115Ga.U(r7)
            goto L5c
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.AbstractC0115Ga.U(r7)
            goto L6c
        L36:
            defpackage.AbstractC0115Ga.U(r7)
            boolean r7 = r6.zzT()
            if (r7 == 0) goto L5f
            boolean r7 = r6.zzR()
            if (r7 == 0) goto L5f
            boolean r7 = r6.zzQ()
            if (r7 != 0) goto L4c
            goto L5f
        L4c:
            r5.zzf = r6
            com.google.android.recaptcha.internal.zzek r6 = r5.zzc
            java.lang.String r6 = r6.zzd()
            r0.zzc = r3
            java.lang.Object r6 = r5.zzG(r6, r0)
            if (r6 == r1) goto L6b
        L5c:
            DK r6 = defpackage.DK.a
            return r6
        L5f:
            com.google.android.recaptcha.internal.zzcb r6 = r5.zzg
            com.google.android.recaptcha.internal.zzje r7 = com.google.android.recaptcha.internal.zzje.zzd
            r0.zzc = r4
            java.lang.Object r6 = r6.zzc(r7, r0)
            if (r6 != r1) goto L6c
        L6b:
            return r1
        L6c:
            com.google.android.recaptcha.internal.zzbd r6 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r7 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r0 = com.google.android.recaptcha.internal.zzba.zzav
            r1 = 0
            r6.<init>(r7, r0, r1)
            HC r6 = defpackage.AbstractC0115Ga.n(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzh(com.google.android.recaptcha.internal.zzsc, uc):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.internal.zze
    @Nullable
    public final Object zzi(@NotNull String str, long j, @NotNull Exception exc, @NotNull InterfaceC3493uc interfaceC3493uc) {
        exc.getMessage();
        InterfaceC0149Ia interfaceC0149Ia = (InterfaceC0149Ia) this.zze.remove(str);
        if (interfaceC0149Ia != null) {
            ((C0166Ja) interfaceC0149Ia).S(exc);
        }
        return DK.a;
    }

    @Override // com.google.android.recaptcha.internal.zze
    @Nullable
    public final Object zzj(@NotNull Exception exc, @NotNull InterfaceC3493uc interfaceC3493uc) {
        return ((exc instanceof C0530bJ) && this.zzi.zza() == null) ? new zzbd(zzbb.zzc, zzba.zzH, null) : zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzV, exc.getMessage()));
    }

    @NotNull
    public final zzcb zzm() {
        return this.zzg;
    }

    @NotNull
    public final zzij zzq() {
        return this.zzi;
    }

    @Nullable
    public final Object zzw(@NotNull InterfaceC3493uc interfaceC3493uc) {
        return AbstractC0136He.S(this.zzq.zzb().g(), new zzjc((zzjd) this.zzk.getValue(), zzD(), null), interfaceC3493uc);
    }

    @Nullable
    public final Object zzx(@NotNull InterfaceC3493uc interfaceC3493uc) throws Throwable {
        Object objS = AbstractC0136He.S(this.zzq.zzb().g(), new zzil(this, null), interfaceC3493uc);
        return objS == EnumC0321Sc.a ? objS : DK.a;
    }
}
