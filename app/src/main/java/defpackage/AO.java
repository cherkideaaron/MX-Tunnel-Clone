package defpackage;

import android.net.NetworkInfo;
import com.mxtunnel.pro.R;
import rased.vpn.app.service.XRayDNSService;
import rased.vpn.app.service.vpn.TunnelManagerThread;
import rased.vpn.app.service.vpn.TunnelUtils;
import rased.vpn.app.service.vpn.logger.SkStatus;

/* loaded from: classes2.dex */
public final class AO implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ AO(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                XRayDNSService xRayDNSService = (XRayDNSService) this.b;
                synchronized (xRayDNSService) {
                    SkStatus.updateStateString(SkStatus.SSH_STARTING, xRayDNSService.getString(R.string.starting_service_ssh));
                    xRayDNSService.d();
                    NetworkInfo activeNetworkInfo = xRayDNSService.c.getActiveNetworkInfo();
                    SkStatus.logInfo("Local IP: " + ((activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) ? "Indisponivel" : TunnelUtils.getLocalIpAddress()));
                    try {
                        GO go2 = new GO();
                        go2.p = false;
                        go2.q = false;
                        go2.a = xRayDNSService;
                        go2.d = C3492ub.c(xRayDNSService);
                        xRayDNSService.e = go2;
                        go2.start();
                        TunnelManagerThread tunnelManagerThread = new TunnelManagerThread(xRayDNSService.b, xRayDNSService);
                        XRayDNSService.s = tunnelManagerThread;
                        tunnelManagerThread.setOnStopClienteListener(new BO(xRayDNSService));
                    } catch (Exception e) {
                        SkStatus.logException(e);
                        xRayDNSService.b.post(new CO(xRayDNSService));
                    }
                }
                return;
            default:
                ((WL) this.b).p(0);
                return;
        }
    }
}
