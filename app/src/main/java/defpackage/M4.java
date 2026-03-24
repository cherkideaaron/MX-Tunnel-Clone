package defpackage;

/* loaded from: classes2.dex */
public final class M4 implements Pw {
    public static final M4 a = new M4();
    public static final C0430Yj b = C0430Yj.a("batteryLevel");
    public static final C0430Yj c = C0430Yj.a("batteryVelocity");
    public static final C0430Yj d = C0430Yj.a("proximityOn");
    public static final C0430Yj e = C0430Yj.a("orientation");
    public static final C0430Yj f = C0430Yj.a("ramUsed");
    public static final C0430Yj g = C0430Yj.a("diskUsed");

    @Override // defpackage.InterfaceC0140Hi
    public final void a(Object obj, Object obj2) {
        Qw qw = (Qw) obj2;
        V5 v5 = (V5) ((AbstractC0033Bd) obj);
        qw.a(b, v5.a);
        qw.e(c, v5.b);
        qw.d(d, v5.c);
        qw.e(e, v5.d);
        qw.g(f, v5.e);
        qw.g(g, v5.f);
    }
}
