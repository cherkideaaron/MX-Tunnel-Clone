package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;

/* loaded from: classes2.dex */
public final class YH extends BroadcastReceiver {
    public RunnableC3095nC a;
    public Context b;

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        RunnableC3095nC runnableC3095nC = this.a;
        if (runnableC3095nC != null) {
            Context context = ((FirebaseMessaging) runnableC3095nC.d).b;
            this.b = context;
            context.registerReceiver(this, intentFilter);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        RunnableC3095nC runnableC3095nC = this.a;
        if (runnableC3095nC != null && runnableC3095nC.a()) {
            if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            RunnableC3095nC runnableC3095nC2 = this.a;
            ((FirebaseMessaging) runnableC3095nC2.d).getClass();
            FirebaseMessaging.b(runnableC3095nC2, 0L);
            Context context2 = this.b;
            if (context2 != null) {
                context2.unregisterReceiver(this);
            }
            this.a = null;
        }
    }
}
