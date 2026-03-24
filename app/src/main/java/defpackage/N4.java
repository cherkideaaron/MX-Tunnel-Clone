package defpackage;

/* loaded from: classes2.dex */
public final class N4 implements Pw {
    public static final N4 a = new N4();
    public static final C0430Yj b = C0430Yj.a("timestamp");
    public static final C0430Yj c = C0430Yj.a("type");
    public static final C0430Yj d = C0430Yj.a("app");
    public static final C0430Yj e = C0430Yj.a("device");
    public static final C0430Yj f = C0430Yj.a("log");
    public static final C0430Yj g = C0430Yj.a("rollouts");

    @Override // defpackage.InterfaceC0140Hi
    public final void a(Object obj, Object obj2) {
        Qw qw = (Qw) obj2;
        J5 j5 = (J5) ((AbstractC0118Gd) obj);
        qw.g(b, j5.a);
        qw.a(c, j5.b);
        qw.a(d, j5.c);
        qw.a(e, j5.d);
        qw.a(f, j5.e);
        qw.a(g, j5.f);
    }
}
