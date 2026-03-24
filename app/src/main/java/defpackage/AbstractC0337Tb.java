package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* renamed from: Tb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0337Tb extends BroadcastReceiver {
    public static final String a = C3130nt.f("ConstraintProxy");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C3130nt.d().a(a, String.format("onReceive : %s", intent), new Throwable[0]);
        String str = C0064Da.d;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
        context.startService(intent2);
    }
}
