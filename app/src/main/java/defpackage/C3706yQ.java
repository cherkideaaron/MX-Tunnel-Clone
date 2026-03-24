package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* renamed from: yQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3706yQ {
    public final R2 a;

    public C3706yQ(AppMeasurementSdk appMeasurementSdk, R2 r2) {
        this.a = r2;
        appMeasurementSdk.registerOnMeasurementEventListener(new C3436tQ(this));
    }
}
