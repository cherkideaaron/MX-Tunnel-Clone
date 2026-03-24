package defpackage;

/* renamed from: m5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3033m5 implements Pw {
    public static final C3033m5 a = new C3033m5();
    public static final C0430Yj b = C0430Yj.a("sessionId");
    public static final C0430Yj c = C0430Yj.a("firstSessionId");
    public static final C0430Yj d = C0430Yj.a("sessionIndex");
    public static final C0430Yj e = C0430Yj.a("eventTimestampUs");
    public static final C0430Yj f = C0430Yj.a("dataCollectionStatus");
    public static final C0430Yj g = C0430Yj.a("firebaseInstallationId");
    public static final C0430Yj h = C0430Yj.a("firebaseAuthenticationToken");

    @Override // defpackage.InterfaceC0140Hi
    public final void a(Object obj, Object obj2) {
        NE ne = (NE) obj;
        Qw qw = (Qw) obj2;
        qw.a(b, ne.a);
        qw.a(c, ne.b);
        qw.e(d, ne.c);
        qw.g(e, ne.d);
        qw.a(f, ne.e);
        qw.a(g, ne.f);
        qw.a(h, ne.g);
    }
}
