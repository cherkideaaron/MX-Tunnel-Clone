package defpackage;

import android.os.Handler;
import com.mxtunnel.pro.R;
import java.util.TimerTask;
import rased.vpn.app.service.OpenVPNService;

/* renamed from: ky, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2970ky extends TimerTask {
    public final /* synthetic */ C3300qy a;
    public final /* synthetic */ OpenVPNService b;

    public C2970ky(OpenVPNService openVPNService, C3300qy c3300qy) {
        this.b = openVPNService;
        this.a = c3300qy;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        Handler handler;
        if (this.a.i == R.string.connected) {
            OpenVPNService openVPNService = this.b;
            if (openVPNService.r == null || (handler = openVPNService.q) == null) {
                return;
            }
            handler.sendEmptyMessage(99);
        }
    }
}
