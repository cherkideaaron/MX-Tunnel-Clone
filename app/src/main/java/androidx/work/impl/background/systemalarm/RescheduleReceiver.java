package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.C0589cO;
import defpackage.C3130nt;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    public static final String a = C3130nt.f("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C3130nt.d().a(a, String.format("Received intent %s", intent), new Throwable[0]);
        try {
            C0589cO c0589cOS = C0589cO.S(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (C0589cO.H) {
                try {
                    c0589cOS.E = pendingResultGoAsync;
                    if (c0589cOS.D) {
                        pendingResultGoAsync.finish();
                        c0589cOS.E = null;
                    }
                } finally {
                }
            }
        } catch (IllegalStateException e) {
            C3130nt.d().b(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
