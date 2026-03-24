package defpackage;

import rased.vpn.app.service.XRayDNSService;
import rased.vpn.app.service.vpn.TunnelManagerThread;

/* loaded from: classes2.dex */
public final class BO implements TunnelManagerThread.OnStopCliente {
    public final /* synthetic */ XRayDNSService a;

    public BO(XRayDNSService xRayDNSService) {
        this.a = xRayDNSService;
    }

    @Override // rased.vpn.app.service.vpn.TunnelManagerThread.OnStopCliente
    public final void onStop() {
        XRayDNSService xRayDNSService = this.a;
        xRayDNSService.b.post(new CO(xRayDNSService));
    }
}
