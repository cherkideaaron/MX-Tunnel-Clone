package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import rased.vpn.app.tethering.ProxyService;

/* renamed from: uA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3474uA extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null || !action.equals(ProxyService.n) || ProxyService.m == null) {
            return;
        }
        ProxyService.m.a();
    }
}
