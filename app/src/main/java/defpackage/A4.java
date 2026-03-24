package defpackage;

/* loaded from: classes2.dex */
public final class A4 implements Pw {
    public static final A4 a = new A4();
    public static final C0430Yj b = C0430Yj.a("identifier");
    public static final C0430Yj c = C0430Yj.a("version");
    public static final C0430Yj d = C0430Yj.a("displayVersion");
    public static final C0430Yj e = C0430Yj.a("organization");
    public static final C0430Yj f = C0430Yj.a("installationUuid");
    public static final C0430Yj g = C0430Yj.a("developmentPlatform");
    public static final C0430Yj h = C0430Yj.a("developmentPlatformVersion");

    @Override // defpackage.InterfaceC0140Hi
    public final void a(Object obj, Object obj2) {
        Qw qw = (Qw) obj2;
        E5 e5 = (E5) ((AbstractC3332rd) obj);
        qw.a(b, e5.a);
        qw.a(c, e5.b);
        qw.a(d, e5.c);
        qw.a(e, null);
        qw.a(f, e5.d);
        qw.a(g, e5.e);
        qw.a(h, e5.f);
    }
}
