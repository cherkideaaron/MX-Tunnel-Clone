package defpackage;

/* renamed from: v4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3522v4 implements Pw {
    public static final C3522v4 a = new C3522v4();
    public static final C0430Yj b = C0430Yj.a("pid");
    public static final C0430Yj c = C0430Yj.a("processName");
    public static final C0430Yj d = C0430Yj.a("reasonCode");
    public static final C0430Yj e = C0430Yj.a("importance");
    public static final C0430Yj f = C0430Yj.a("pss");
    public static final C0430Yj g = C0430Yj.a("rss");
    public static final C0430Yj h = C0430Yj.a("timestamp");
    public static final C0430Yj i = C0430Yj.a("traceFile");
    public static final C0430Yj j = C0430Yj.a("buildIdMappingForArch");

    @Override // defpackage.InterfaceC0140Hi
    public final void a(Object obj, Object obj2) {
        Qw qw = (Qw) obj2;
        C3631x5 c3631x5 = (C3631x5) ((AbstractC3059md) obj);
        qw.e(b, c3631x5.a);
        qw.a(c, c3631x5.b);
        qw.e(d, c3631x5.c);
        qw.e(e, c3631x5.d);
        qw.g(f, c3631x5.e);
        qw.g(g, c3631x5.f);
        qw.g(h, c3631x5.g);
        qw.a(i, c3631x5.h);
        qw.a(j, c3631x5.i);
    }
}
