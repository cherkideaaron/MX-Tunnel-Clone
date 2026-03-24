package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzjm;
import java.util.Objects;

/* renamed from: lQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2999lQ implements AppMeasurementSdk.OnEventListener {
    public final /* synthetic */ C3328rQ a;

    public C2999lQ(C3328rQ c3328rQ) {
        Objects.requireNonNull(c3328rQ);
        this.a = c3328rQ;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzjq
    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        C3328rQ c3328rQ = this.a;
        if (c3328rQ.a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            AbstractC3071mp abstractC3071mp = ZP.a;
            String strZza = zzjm.zza(str2);
            if (strZza != null) {
                str2 = strZza;
            }
            bundle2.putString("events", str2);
            c3328rQ.b.w(2, bundle2);
        }
    }
}
