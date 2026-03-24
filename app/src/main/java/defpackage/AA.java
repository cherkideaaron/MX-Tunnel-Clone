package defpackage;

import rased.vpn.app.activities.OpenVPNClient;
import rased.vpn.app.service.PsiphonDNSService;
import rased.vpn.app.service.SocksDNSService;
import rased.vpn.app.service.XRayDNSService;

/* loaded from: classes2.dex */
public final class AA implements Runnable {
    public final /* synthetic */ int a;
    public boolean b;
    public long c;

    public /* synthetic */ AA(int i) {
        this.a = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        switch (this.a) {
            case 0:
                while (!this.b) {
                    try {
                        Thread.sleep(this.c);
                    } catch (InterruptedException unused) {
                    }
                    BA ba = PsiphonDNSService.s;
                    if (ba != null) {
                        OpenVPNClient openVPNClient = (OpenVPNClient) ba;
                        openVPNClient.runOnUiThread(new Lx(openVPNClient, 7));
                    }
                }
                break;
            case 1:
                while (!this.b) {
                    try {
                        Thread.sleep(this.c);
                    } catch (InterruptedException unused2) {
                    }
                    InterfaceC3154oG interfaceC3154oG = SocksDNSService.u;
                    if (interfaceC3154oG != null) {
                        OpenVPNClient openVPNClient2 = (OpenVPNClient) interfaceC3154oG;
                        openVPNClient2.runOnUiThread(new Lx(openVPNClient2, 7));
                    }
                }
                break;
            default:
                while (!this.b) {
                    try {
                        Thread.sleep(this.c);
                    } catch (InterruptedException unused3) {
                    }
                    EO eo = XRayDNSService.t;
                    if (eo != null) {
                        OpenVPNClient openVPNClient3 = (OpenVPNClient) eo;
                        openVPNClient3.runOnUiThread(new Lx(openVPNClient3, 7));
                    }
                }
                break;
        }
    }
}
