package androidx.work;

import android.content.Context;
import defpackage.C0589cO;
import defpackage.C2770hF;
import defpackage.C3130nt;
import defpackage.C3397so;
import defpackage.InterfaceC3614wp;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements InterfaceC3614wp {
    public static final String a = C3130nt.f("WrkMgrInitializer");

    @Override // defpackage.InterfaceC3614wp
    public final List a() {
        return Collections.emptyList();
    }

    @Override // defpackage.InterfaceC3614wp
    public final Object create(Context context) {
        C3130nt.d().a(a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        C0589cO.T(context, new C2770hF(new C3397so(10)));
        return C0589cO.S(context);
    }
}
