package defpackage;

import rased.vpn.app.service.XRayDNSService;
import rased.vpn.app.service.vpn.logger.SkStatus;

/* loaded from: classes2.dex */
public final class CO implements Runnable {
    public final /* synthetic */ XRayDNSService a;

    public CO(XRayDNSService xRayDNSService) {
        this.a = xRayDNSService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        XRayDNSService xRayDNSService = this.a;
        xRayDNSService.stopForeground(true);
        xRayDNSService.stopSelf();
        SkStatus.removeStateListener(xRayDNSService);
    }
}
