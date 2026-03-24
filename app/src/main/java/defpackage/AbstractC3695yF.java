package defpackage;

import android.content.Context;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.jetbrains.annotations.NotNull;

/* renamed from: yF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3695yF {
    public static final boolean a(@NotNull Context context, @NotNull String str) {
        AbstractC0500aq.m(context, "context");
        AbstractC0500aq.m(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        return context.deleteSharedPreferences(str);
    }
}
