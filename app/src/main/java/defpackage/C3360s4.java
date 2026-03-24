package defpackage;

/* renamed from: s4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3360s4 implements Pw {
    public static final C3360s4 a = new C3360s4();
    public static final C0430Yj b = C0430Yj.a("requestTimeMs");
    public static final C0430Yj c = C0430Yj.a("requestUptimeMs");
    public static final C0430Yj d = C0430Yj.a("clientInfo");
    public static final C0430Yj e = C0430Yj.a("logSource");
    public static final C0430Yj f = C0430Yj.a("logSourceName");
    public static final C0430Yj g = C0430Yj.a("logEvent");
    public static final C0430Yj h = C0430Yj.a("qosTier");

    @Override // defpackage.InterfaceC0140Hi
    public final void a(Object obj, Object obj2) {
        Qw qw = (Qw) obj2;
        C3416t6 c3416t6 = (C3416t6) ((AbstractC2965kt) obj);
        qw.g(b, c3416t6.a);
        qw.g(c, c3416t6.b);
        qw.a(d, c3416t6.c);
        qw.a(e, c3416t6.d);
        qw.a(f, c3416t6.e);
        qw.a(g, c3416t6.f);
        qw.a(h, c3416t6.g);
    }
}
