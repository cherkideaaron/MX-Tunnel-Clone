package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes2.dex */
public final class J4 implements Pw {
    public static final J4 a = new J4();
    public static final C0430Yj b = C0430Yj.a(AppMeasurementSdk.ConditionalUserProperty.NAME);
    public static final C0430Yj c = C0430Yj.a("importance");
    public static final C0430Yj d = C0430Yj.a("frames");

    @Override // defpackage.InterfaceC0140Hi
    public final void a(Object obj, Object obj2) {
        Qw qw = (Qw) obj2;
        P5 p5 = (P5) ((AbstractC3656xd) obj);
        qw.a(b, p5.a);
        qw.e(c, p5.b);
        qw.a(d, p5.c);
    }
}
