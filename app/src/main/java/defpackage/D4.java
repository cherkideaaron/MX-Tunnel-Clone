package defpackage;

/* loaded from: classes2.dex */
public final class D4 implements Pw {
    public static final D4 a = new D4();
    public static final C0430Yj b = C0430Yj.a("generator");
    public static final C0430Yj c = C0430Yj.a("identifier");
    public static final C0430Yj d = C0430Yj.a("appQualitySessionId");
    public static final C0430Yj e = C0430Yj.a("startedAt");
    public static final C0430Yj f = C0430Yj.a("endedAt");
    public static final C0430Yj g = C0430Yj.a("crashed");
    public static final C0430Yj h = C0430Yj.a("app");
    public static final C0430Yj i = C0430Yj.a("user");
    public static final C0430Yj j = C0430Yj.a("os");
    public static final C0430Yj k = C0430Yj.a("device");
    public static final C0430Yj l = C0430Yj.a("events");
    public static final C0430Yj m = C0430Yj.a("generatorType");

    @Override // defpackage.InterfaceC0140Hi
    public final void a(Object obj, Object obj2) {
        Qw qw = (Qw) obj2;
        D5 d5 = (D5) ((AbstractC0169Jd) obj);
        qw.a(b, d5.a);
        qw.a(c, d5.b.getBytes(AbstractC0186Kd.a));
        qw.a(d, d5.c);
        qw.g(e, d5.d);
        qw.a(f, d5.e);
        qw.d(g, d5.f);
        qw.a(h, d5.g);
        qw.a(i, d5.h);
        qw.a(j, d5.i);
        qw.a(k, d5.j);
        qw.a(l, d5.k);
        qw.e(m, d5.l);
    }
}
