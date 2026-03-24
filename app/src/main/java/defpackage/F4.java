package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes2.dex */
public final class F4 implements Pw {
    public static final F4 a = new F4();
    public static final C0430Yj b = C0430Yj.a("baseAddress");
    public static final C0430Yj c = C0430Yj.a("size");
    public static final C0430Yj d = C0430Yj.a(AppMeasurementSdk.ConditionalUserProperty.NAME);
    public static final C0430Yj e = C0430Yj.a("uuid");

    @Override // defpackage.InterfaceC0140Hi
    public final void a(Object obj, Object obj2) {
        Qw qw = (Qw) obj2;
        M5 m5 = (M5) ((AbstractC3440td) obj);
        qw.g(b, m5.a);
        qw.g(c, m5.b);
        qw.a(d, m5.c);
        String str = m5.d;
        qw.a(e, str != null ? str.getBytes(AbstractC0186Kd.a) : null);
    }
}
