package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes2.dex */
public final class I4 implements Pw {
    public static final I4 a = new I4();
    public static final C0430Yj b = C0430Yj.a(AppMeasurementSdk.ConditionalUserProperty.NAME);
    public static final C0430Yj c = C0430Yj.a("code");
    public static final C0430Yj d = C0430Yj.a("address");

    @Override // defpackage.InterfaceC0140Hi
    public final void a(Object obj, Object obj2) {
        Qw qw = (Qw) obj2;
        O5 o5 = (O5) ((AbstractC3548vd) obj);
        qw.a(b, o5.a);
        qw.a(c, o5.b);
        qw.g(d, o5.c);
    }
}
