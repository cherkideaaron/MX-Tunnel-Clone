package defpackage;

import rased.vpn.app.service.SocksDNSService;
import rased.vpn.app.service.vpn.TunnelManagerThread;

/* renamed from: lG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2989lG implements TunnelManagerThread.OnStopCliente {
    public final /* synthetic */ SocksDNSService a;

    public C2989lG(SocksDNSService socksDNSService) {
        this.a = socksDNSService;
    }

    @Override // rased.vpn.app.service.vpn.TunnelManagerThread.OnStopCliente
    public final void onStop() {
        SocksDNSService socksDNSService = this.a;
        socksDNSService.b.post(new RunnableC3044mG(socksDNSService));
    }
}
