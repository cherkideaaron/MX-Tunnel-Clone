package defpackage;

/* renamed from: r4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3306r4 implements Pw {
    public static final C3306r4 a = new C3306r4();
    public static final C0430Yj b = C0430Yj.a("eventTimeMs");
    public static final C0430Yj c = C0430Yj.a("eventCode");
    public static final C0430Yj d = C0430Yj.a("complianceData");
    public static final C0430Yj e = C0430Yj.a("eventUptimeMs");
    public static final C0430Yj f = C0430Yj.a("sourceExtension");
    public static final C0430Yj g = C0430Yj.a("sourceExtensionJsonProto3");
    public static final C0430Yj h = C0430Yj.a("timezoneOffsetSeconds");
    public static final C0430Yj i = C0430Yj.a("networkConnectionInfo");
    public static final C0430Yj j = C0430Yj.a("experimentIds");

    @Override // defpackage.InterfaceC0140Hi
    public final void a(Object obj, Object obj2) {
        Qw qw = (Qw) obj2;
        C3362s6 c3362s6 = (C3362s6) ((AbstractC2747gt) obj);
        qw.g(b, c3362s6.a);
        qw.a(c, c3362s6.b);
        qw.a(d, c3362s6.c);
        qw.g(e, c3362s6.d);
        qw.a(f, c3362s6.e);
        qw.a(g, c3362s6.f);
        qw.g(h, c3362s6.g);
        qw.a(i, c3362s6.h);
        qw.a(j, c3362s6.i);
    }
}
