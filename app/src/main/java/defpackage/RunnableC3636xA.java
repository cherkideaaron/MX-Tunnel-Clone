package defpackage;

import rased.vpn.app.service.PsiphonDNSService;
import rased.vpn.app.service.vpn.logger.SkStatus;

/* renamed from: xA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3636xA implements Runnable {
    public final /* synthetic */ PsiphonDNSService a;

    public RunnableC3636xA(PsiphonDNSService psiphonDNSService) {
        this.a = psiphonDNSService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PsiphonDNSService psiphonDNSService = this.a;
        psiphonDNSService.stopForeground(true);
        psiphonDNSService.stopSelf();
        SkStatus.removeStateListener(psiphonDNSService);
    }
}
