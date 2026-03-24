package defpackage;

import android.os.Trace;
import android.util.Log;
import rased.vpn.app.service.PsiphonDNSService;
import rased.vpn.app.service.SocksDNSService;
import rased.vpn.app.service.XRayDNSService;
import rased.vpn.app.service.vpn.PsiphonTunnelManagerThread;
import rased.vpn.app.service.vpn.TunnelManagerThread;

/* renamed from: ji, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2899ji implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ RunnableC2899ji(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        switch (this.a) {
            case 0:
                try {
                    int i = JJ.a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (C2626ei.k != null) {
                        C2626ei.a().c();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    int i2 = JJ.a;
                    Trace.endSection();
                    throw th;
                }
            case 1:
                return;
            case 2:
                break;
            case 3:
                PsiphonTunnelManagerThread psiphonTunnelManagerThread = PsiphonDNSService.r;
                if (psiphonTunnelManagerThread != null) {
                    psiphonTunnelManagerThread.reconnectSSH();
                    return;
                }
                return;
            case 4:
                TunnelManagerThread tunnelManagerThread = SocksDNSService.s;
                if (tunnelManagerThread != null) {
                    tunnelManagerThread.reconnectSSH();
                    return;
                }
                return;
            default:
                TunnelManagerThread tunnelManagerThread2 = XRayDNSService.s;
                if (tunnelManagerThread2 != null) {
                    tunnelManagerThread2.reconnectSSH();
                    return;
                }
                return;
        }
        while (true) {
            try {
                Thread.sleep(500L);
            } catch (Exception e) {
                Log.i("ProxyService", e.toString());
                return;
            }
        }
    }

    private final void a() {
    }
}
