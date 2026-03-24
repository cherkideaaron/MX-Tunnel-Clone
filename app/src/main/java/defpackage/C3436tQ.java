package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Objects;

/* renamed from: tQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3436tQ implements AppMeasurementSdk.OnEventListener {
    public final /* synthetic */ C3706yQ a;

    public C3436tQ(C3706yQ c3706yQ) {
        Objects.requireNonNull(c3706yQ);
        this.a = c3706yQ;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzjq
    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        if (str == null || !(!ZP.a.contains(str2))) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, str2);
        bundle2.putLong("timestampInMillis", j);
        bundle2.putBundle("params", bundle);
        this.a.a.w(3, bundle2);
    }
}
