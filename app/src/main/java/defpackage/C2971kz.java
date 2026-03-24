package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* renamed from: kz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2971kz extends AbstractC3400sr implements InterfaceC0606cn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2971kz(int i, Context context, Object obj) {
        super(0);
        this.a = i;
        this.b = context;
        this.c = obj;
    }

    @Override // defpackage.InterfaceC0606cn
    public final Object invoke() {
        switch (this.a) {
            case 0:
                Context context = this.b;
                AbstractC0500aq.l(context, "applicationContext");
                String str = ((C3026lz) this.c).a;
                AbstractC0500aq.m(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
                return MO.l(context, str.concat(".preferences_pb"));
            default:
                SharedPreferences sharedPreferences = this.b.getSharedPreferences((String) this.c, 0);
                AbstractC0500aq.l(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
                return sharedPreferences;
        }
    }
}
