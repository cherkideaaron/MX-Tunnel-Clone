package defpackage;

/* renamed from: h5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2760h5 implements Pw {
    public static final C2760h5 a = new C2760h5();
    public static final C0430Yj b = C0430Yj.a("packageName");
    public static final C0430Yj c = C0430Yj.a("versionName");
    public static final C0430Yj d = C0430Yj.a("appBuildVersion");
    public static final C0430Yj e = C0430Yj.a("deviceManufacturer");
    public static final C0430Yj f = C0430Yj.a("currentProcessDetails");
    public static final C0430Yj g = C0430Yj.a("appProcessDetails");

    @Override // defpackage.InterfaceC0140Hi
    public final void a(Object obj, Object obj2) {
        A1 a1 = (A1) obj;
        Qw qw = (Qw) obj2;
        qw.a(b, a1.a);
        qw.a(c, a1.b);
        qw.a(d, a1.c);
        qw.a(e, a1.d);
        qw.a(f, a1.e);
        qw.a(g, a1.f);
    }
}
