package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* loaded from: classes2.dex */
public final class Ss implements InterfaceC2660fF {
    public final Bundle a;

    public Ss(Context context) {
        AbstractC0500aq.m(context, "appContext");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN).metaData;
        this.a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // defpackage.InterfaceC2660fF
    public final Object a(InterfaceC3493uc interfaceC3493uc) {
        return DK.a;
    }

    @Override // defpackage.InterfaceC2660fF
    public final Boolean b() {
        Bundle bundle = this.a;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // defpackage.InterfaceC2660fF
    public final C0139Hh c() {
        Bundle bundle = this.a;
        if (bundle.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return new C0139Hh(AbstractC2883jK.Q(bundle.getInt("firebase_sessions_sessions_restart_timeout"), EnumC0173Jh.d));
        }
        return null;
    }

    @Override // defpackage.InterfaceC2660fF
    public final Double d() {
        Bundle bundle = this.a;
        if (bundle.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }
}
