package defpackage;

/* loaded from: classes2.dex */
public final class LE implements IE {
    public static final double f = Math.random();
    public static final /* synthetic */ int g = 0;
    public final C3663xk a;
    public final InterfaceC0227Mk b;
    public final SE c;
    public final C0395Wi d;
    public final InterfaceC0168Jc e;

    public LE(C3663xk c3663xk, InterfaceC0227Mk interfaceC0227Mk, SE se, C0395Wi c0395Wi, InterfaceC0168Jc interfaceC0168Jc) {
        AbstractC0500aq.m(c3663xk, "firebaseApp");
        AbstractC0500aq.m(interfaceC0227Mk, "firebaseInstallations");
        AbstractC0500aq.m(se, "sessionSettings");
        AbstractC0500aq.m(c0395Wi, "eventGDTLogger");
        AbstractC0500aq.m(interfaceC0168Jc, "backgroundDispatcher");
        this.a = c3663xk;
        this.b = interfaceC0227Mk;
        this.c = se;
        this.d = c0395Wi;
        this.e = interfaceC0168Jc;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.LE r6, defpackage.InterfaceC3493uc r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof defpackage.KE
            if (r0 == 0) goto L16
            r0 = r7
            KE r0 = (defpackage.KE) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.d = r1
            goto L1b
        L16:
            KE r0 = new KE
            r0.<init>(r6, r7)
        L1b:
            java.lang.Object r7 = r0.b
            Sc r1 = defpackage.EnumC0321Sc.a
            int r2 = r0.d
            r3 = 1
            r4 = 2
            java.lang.String r5 = "FirebaseSessions"
            if (r2 == 0) goto L3f
            if (r2 == r3) goto L39
            if (r2 != r4) goto L31
            LE r6 = r0.a
            defpackage.AbstractC0115Ga.U(r7)
            goto L86
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            LE r6 = r0.a
            defpackage.AbstractC0115Ga.U(r7)
            goto L50
        L3f:
            defpackage.AbstractC0115Ga.U(r7)
            dl r7 = defpackage.C2575dl.a
            r0.a = r6
            r0.d = r3
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L50
            goto Lc0
        L50:
            java.util.Map r7 = (java.util.Map) r7
            java.util.Collection r7 = r7.values()
            boolean r2 = r7 instanceof java.util.Collection
            if (r2 == 0) goto L61
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto L61
            goto Lbd
        L61:
            java.util.Iterator r7 = r7.iterator()
        L65:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto Lbd
            java.lang.Object r2 = r7.next()
            ad r2 = (defpackage.C0487ad) r2
            Fe r2 = r2.a
            boolean r2 = r2.a()
            if (r2 == 0) goto L65
            SE r7 = r6.c
            r0.a = r6
            r0.d = r4
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L86
            goto Lc0
        L86:
            SE r7 = r6.c
            fF r0 = r7.a
            java.lang.Boolean r0 = r0.b()
            if (r0 == 0) goto L95
            boolean r3 = r0.booleanValue()
            goto La1
        L95:
            fF r7 = r7.b
            java.lang.Boolean r7 = r7.b()
            if (r7 == 0) goto La1
            boolean r3 = r7.booleanValue()
        La1:
            if (r3 != 0) goto Lab
            java.lang.String r6 = "Sessions SDK disabled through settings API. Events will not be sent."
        La5:
            android.util.Log.d(r5, r6)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto Lc0
        Lab:
            SE r6 = r6.c
            double r6 = r6.a()
            double r0 = defpackage.LE.f
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto Lba
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            goto Lc0
        Lba:
            java.lang.String r6 = "Sessions SDK has dropped this session due to sampling."
            goto La5
        Lbd:
            java.lang.String r6 = "Sessions SDK disabled through data collection. Events will not be sent."
            goto La5
        Lc0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.LE.a(LE, uc):java.lang.Object");
    }
}
