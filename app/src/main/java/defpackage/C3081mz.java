package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* renamed from: mz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3081mz {
    public final String a;

    public C3081mz(String str) {
        AbstractC0500aq.m(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3081mz)) {
            return false;
        }
        return AbstractC0500aq.b(this.a, ((C3081mz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
