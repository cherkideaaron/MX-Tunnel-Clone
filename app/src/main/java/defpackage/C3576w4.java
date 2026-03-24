package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* renamed from: w4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3576w4 implements Pw {
    public static final C3576w4 a = new C3576w4();
    public static final C0430Yj b = C0430Yj.a("key");
    public static final C0430Yj c = C0430Yj.a(AppMeasurementSdk.ConditionalUserProperty.VALUE);

    @Override // defpackage.InterfaceC0140Hi
    public final void a(Object obj, Object obj2) {
        Qw qw = (Qw) obj2;
        C3739z5 c3739z5 = (C3739z5) ((AbstractC3114nd) obj);
        qw.a(b, c3739z5.a);
        qw.a(c, c3739z5.b);
    }
}
