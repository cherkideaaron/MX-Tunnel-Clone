package defpackage;

import android.app.Application;
import android.content.Context;
import android.util.Log;

/* renamed from: Wk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0397Wk {
    public final C3663xk a;
    public final SE b;

    public C0397Wk(C3663xk c3663xk, SE se, InterfaceC0168Jc interfaceC0168Jc, QE qe) {
        AbstractC0500aq.m(c3663xk, "firebaseApp");
        AbstractC0500aq.m(se, "settings");
        AbstractC0500aq.m(interfaceC0168Jc, "backgroundDispatcher");
        AbstractC0500aq.m(qe, "sessionsActivityLifecycleCallbacks");
        this.a = c3663xk;
        this.b = se;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions 3.0.4.");
        c3663xk.a();
        Context applicationContext = c3663xk.a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(qe);
            AbstractC0136He.y(AbstractC0136He.a(interfaceC0168Jc), new C0380Vk(this, qe, null));
        } else {
            Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}
