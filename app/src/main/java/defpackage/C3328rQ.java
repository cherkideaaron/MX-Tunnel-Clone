package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashSet;

/* renamed from: rQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3328rQ {
    public final HashSet a;
    public final R2 b;

    public C3328rQ(AppMeasurementSdk appMeasurementSdk, R2 r2) {
        this.b = r2;
        appMeasurementSdk.registerOnMeasurementEventListener(new C2999lQ(this));
        this.a = new HashSet();
    }
}
