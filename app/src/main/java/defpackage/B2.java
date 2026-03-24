package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import rased.vpn.app.service.PsiphonDNSService;
import rased.vpn.app.service.SocksDNSService;
import rased.vpn.app.service.XRayDNSService;

/* loaded from: classes.dex */
public final class B2 extends BroadcastReceiver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ B2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.a) {
            case 0:
                ((C2) this.b).g();
                break;
            case 1:
                if (intent != null) {
                    ((M7) this.b).g(intent);
                    break;
                }
                break;
            case 2:
                if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                    C3130nt.d().a(C3298qw.j, "Network broadcast received", new Throwable[0]);
                    C3298qw c3298qw = (C3298qw) this.b;
                    c3298qw.c(c3298qw.f());
                    break;
                }
                break;
            case 3:
                String action = intent.getAction();
                if (action != null) {
                    if (!action.equals(PsiphonDNSService.t)) {
                        if (action.equals(PsiphonDNSService.u)) {
                            PsiphonDNSService psiphonDNSService = (PsiphonDNSService) this.b;
                            psiphonDNSService.b.post(new RunnableC3636xA(psiphonDNSService));
                            break;
                        }
                    } else {
                        new Thread(new RunnableC2899ji(3)).start();
                        break;
                    }
                }
                break;
            case 4:
                String action2 = intent.getAction();
                if (action2 != null) {
                    if (!action2.equals(SocksDNSService.v)) {
                        if (action2.equals(SocksDNSService.w)) {
                            SocksDNSService socksDNSService = (SocksDNSService) this.b;
                            socksDNSService.b.post(new RunnableC3044mG(socksDNSService));
                            break;
                        }
                    } else {
                        new Thread(new RunnableC2899ji(4)).start();
                        break;
                    }
                }
                break;
            default:
                String action3 = intent.getAction();
                if (action3 != null) {
                    if (!action3.equals(XRayDNSService.u)) {
                        if (action3.equals(XRayDNSService.v)) {
                            XRayDNSService xRayDNSService = (XRayDNSService) this.b;
                            xRayDNSService.b.post(new CO(xRayDNSService));
                            break;
                        }
                    } else {
                        new Thread(new RunnableC2899ji(5)).start();
                        break;
                    }
                }
                break;
        }
    }
}
