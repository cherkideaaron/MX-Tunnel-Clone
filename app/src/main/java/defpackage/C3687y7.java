package defpackage;

import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: y7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3687y7 extends M7 {
    public static final String i = C3130nt.f("BatteryNotLowTracker");

    @Override // defpackage.AbstractC0595cc
    public final Object a() {
        Intent intentRegisterReceiver = this.b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(intentRegisterReceiver.getIntExtra("status", -1) == 1 || ((float) intentRegisterReceiver.getIntExtra("level", -1)) / ((float) intentRegisterReceiver.getIntExtra("scale", -1)) > 0.15f);
        }
        C3130nt.d().b(i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }

    @Override // defpackage.M7
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // defpackage.M7
    public final void g(Intent intent) {
        Boolean bool;
        if (intent.getAction() == null) {
            return;
        }
        C3130nt.d().a(i, AbstractC3264qG.w("Received ", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            bool = Boolean.TRUE;
        } else if (!action.equals("android.intent.action.BATTERY_LOW")) {
            return;
        } else {
            bool = Boolean.FALSE;
        }
        c(bool);
    }
}
