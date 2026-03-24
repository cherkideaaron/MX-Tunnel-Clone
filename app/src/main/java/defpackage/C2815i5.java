package defpackage;

/* renamed from: i5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2815i5 implements Pw {
    public static final C2815i5 a = new C2815i5();
    public static final C0430Yj b = C0430Yj.a("appId");
    public static final C0430Yj c = C0430Yj.a("deviceModel");
    public static final C0430Yj d = C0430Yj.a("sessionSdkVersion");
    public static final C0430Yj e = C0430Yj.a("osVersion");
    public static final C0430Yj f = C0430Yj.a("logEnvironment");
    public static final C0430Yj g = C0430Yj.a("androidAppInfo");

    @Override // defpackage.InterfaceC0140Hi
    public final void a(Object obj, Object obj2) {
        O3 o3 = (O3) obj;
        Qw qw = (Qw) obj2;
        qw.a(b, o3.a);
        qw.a(c, o3.b);
        qw.a(d, "3.0.4");
        qw.a(e, o3.c);
        qw.a(f, EnumC2692ft.b);
        qw.a(g, o3.d);
    }
}
