package rased.vpn.app.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.C3492ub;
import rased.vpn.app.service.PsiphonDNSService;
import rased.vpn.app.service.SocksDNSService;
import rased.vpn.app.service.XRayDNSService;
import rased.vpn.app.service.vpn.TunnelManagerHelper;

/* loaded from: classes2.dex */
public class MainReceiver extends BroadcastReceiver {
    public C3492ub a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a = C3492ub.c(context);
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        if (!action.equals("sshtunnelservicestop")) {
            if (action.equals("sshTunnelServiceRestsrt")) {
                context.sendBroadcast(this.a.o().booleanValue() ? new Intent(PsiphonDNSService.t) : this.a.q().booleanValue() ? new Intent(XRayDNSService.u) : new Intent(SocksDNSService.v));
            }
        } else if (this.a.o().booleanValue()) {
            TunnelManagerHelper.stopPsiphon(context);
        } else if (this.a.q().booleanValue()) {
            TunnelManagerHelper.stopXRay(context);
        } else {
            TunnelManagerHelper.stopSocksHttp(context);
        }
    }
}
