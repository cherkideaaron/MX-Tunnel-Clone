package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.AbstractC3264qG;
import defpackage.C0589cO;
import defpackage.C3130nt;
import defpackage.D3;
import defpackage.RunnableC0354Ub;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    public static final String a = C3130nt.f("ConstrntProxyUpdtRecvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            C3130nt.d().a(a, AbstractC3264qG.w("Ignoring unknown action ", action), new Throwable[0]);
        } else {
            ((D3) C0589cO.S(context).z).t(new RunnableC0354Ub(intent, context, goAsync(), 0));
        }
    }
}
