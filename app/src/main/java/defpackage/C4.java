package defpackage;

/* loaded from: classes2.dex */
public final class C4 implements Pw {
    public static final C4 a = new C4();
    public static final C0430Yj b = C0430Yj.a("arch");
    public static final C0430Yj c = C0430Yj.a("model");
    public static final C0430Yj d = C0430Yj.a("cores");
    public static final C0430Yj e = C0430Yj.a("ram");
    public static final C0430Yj f = C0430Yj.a("diskSpace");
    public static final C0430Yj g = C0430Yj.a("simulator");
    public static final C0430Yj h = C0430Yj.a("state");
    public static final C0430Yj i = C0430Yj.a("manufacturer");
    public static final C0430Yj j = C0430Yj.a("modelClass");

    @Override // defpackage.InterfaceC0140Hi
    public final void a(Object obj, Object obj2) {
        Qw qw = (Qw) obj2;
        H5 h5 = (H5) ((AbstractC3386sd) obj);
        qw.e(b, h5.a);
        qw.a(c, h5.b);
        qw.e(d, h5.c);
        qw.g(e, h5.d);
        qw.g(f, h5.e);
        qw.d(g, h5.f);
        qw.e(h, h5.g);
        qw.a(i, h5.h);
        qw.a(j, h5.i);
    }
}
