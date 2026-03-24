package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import defpackage.C0589cO;
import defpackage.C3130nt;
import defpackage.D3;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String a = C3130nt.f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String str = a;
        C3130nt.d().a(str, "Requesting diagnostics", new Throwable[0]);
        try {
            C0589cO.S(context).n(new D3(DiagnosticsWorker.class).i());
        } catch (IllegalStateException e) {
            C3130nt.d().b(str, "WorkManager is not initialized", e);
        }
    }
}
