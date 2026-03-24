package defpackage;

/* renamed from: eC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2602eC implements InterfaceC2660fF {
    public static final int g;
    public static final RB h;
    public final YI a;
    public final InterfaceC0227Mk b;
    public final O3 c;
    public final C2712gC d;
    public final C2551dF e;
    public final Vv f;

    static {
        int i = C0139Hh.d;
        g = (int) C0139Hh.e(AbstractC2883jK.Q(24, EnumC0173Jh.f), EnumC0173Jh.d);
        h = new RB("/");
    }

    public C2602eC(YI yi, InterfaceC0227Mk interfaceC0227Mk, O3 o3, C2712gC c2712gC, C2551dF c2551dF) {
        AbstractC0500aq.m(yi, "timeProvider");
        AbstractC0500aq.m(interfaceC0227Mk, "firebaseInstallationsApi");
        AbstractC0500aq.m(o3, "appInfo");
        AbstractC0500aq.m(c2712gC, "configsFetcher");
        AbstractC0500aq.m(c2551dF, "settingsCache");
        this.a = yi;
        this.b = interfaceC0227Mk;
        this.c = o3;
        this.d = c2712gC;
        this.e = c2551dF;
        this.f = AbstractC0069Df.a();
    }

    public static String e(String str) {
        RB rb = h;
        rb.getClass();
        AbstractC0500aq.m(str, "input");
        String strReplaceAll = rb.a.matcher(str).replaceAll("");
        AbstractC0500aq.l(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1 A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {all -> 0x0050, blocks: (B:21:0x004c, B:43:0x00a5, B:45:0x00b1, B:48:0x00bc, B:35:0x0081, B:37:0x0089, B:40:0x0094), top: B:59:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bc A[Catch: all -> 0x0050, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0050, blocks: (B:21:0x004c, B:43:0x00a5, B:45:0x00b1, B:48:0x00bc, B:35:0x0081, B:37:0x0089, B:40:0x0094), top: B:59:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Type inference failed for: r7v0, types: [int] */
    @Override // defpackage.InterfaceC2660fF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.InterfaceC3493uc r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2602eC.a(uc):java.lang.Object");
    }

    @Override // defpackage.InterfaceC2660fF
    public final Boolean b() {
        return this.e.a().a;
    }

    @Override // defpackage.InterfaceC2660fF
    public final C0139Hh c() {
        Integer num = this.e.a().c;
        if (num == null) {
            return null;
        }
        int i = C0139Hh.d;
        return new C0139Hh(AbstractC2883jK.Q(num.intValue(), EnumC0173Jh.d));
    }

    @Override // defpackage.InterfaceC2660fF
    public final Double d() {
        return this.e.a().b;
    }
}
