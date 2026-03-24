package defpackage;

import rased.vpn.app.service.SocksDNSService;
import rased.vpn.app.service.vpn.logger.SkStatus;

/* renamed from: mG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3044mG implements Runnable {
    public final /* synthetic */ SocksDNSService a;

    public RunnableC3044mG(SocksDNSService socksDNSService) {
        this.a = socksDNSService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SocksDNSService.t = false;
        SocksDNSService socksDNSService = this.a;
        socksDNSService.stopForeground(true);
        socksDNSService.stopSelf();
        SkStatus.removeStateListener(socksDNSService);
    }
}
