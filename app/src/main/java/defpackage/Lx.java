package defpackage;

import android.net.TrafficStats;
import android.os.CountDownTimer;
import android.os.Handler;
import android.widget.TextView;
import com.mxtunnel.pro.R;
import org.json.JSONException;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.activities.OpenVPNClient;
import rased.vpn.app.service.PsiphonDNSService;
import rased.vpn.app.service.SocksDNSService;
import rased.vpn.app.service.XRayDNSService;

/* loaded from: classes2.dex */
public final class Lx implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ OpenVPNClient b;

    public /* synthetic */ Lx(OpenVPNClient openVPNClient, int i) {
        this.a = i;
        this.b = openVPNClient;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        TextView textView;
        StringBuilder sb;
        String strC;
        long j;
        switch (this.a) {
            case 0:
                String str = OpenVPNClient.Y0;
                OpenVPNClient openVPNClient = this.b;
                openVPNClient.b0();
                openVPNClient.W.removeCallbacks(openVPNClient.X);
                openVPNClient.W.postDelayed(openVPNClient.X, 1000L);
                return;
            case 1:
                OpenVPNClient openVPNClient2 = this.b;
                if (openVPNClient2.o()) {
                    return;
                }
                openVPNClient2.k0(65536, null, false);
                return;
            case 2:
                OpenVPNClient openVPNClient3 = this.b;
                if (openVPNClient3.y != EnumC2587dy.a) {
                    openVPNClient3.finish();
                    return;
                }
                return;
            case 3:
                OpenVPNClient openVPNClient4 = this.b;
                if (!openVPNClient4.g0.p().booleanValue() || SocksDNSService.t) {
                    return;
                }
                openVPNClient4.e0();
                return;
            case 4:
                OpenVPNClient openVPNClient5 = this.b;
                if (!openVPNClient5.g0.p().booleanValue() || SocksDNSService.t) {
                    return;
                }
                openVPNClient5.f0();
                return;
            case 5:
                OpenVPNClient openVPNClient6 = this.b;
                CountDownTimer countDownTimer = openVPNClient6.x0;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                }
                openVPNClient6.i0();
                openVPNClient6.getClass();
                new Handler().postDelayed(new Lx(openVPNClient6, 4), 2000L);
                return;
            case 6:
                String str2 = OpenVPNClient.Y0;
                OpenVPNClient openVPNClient7 = this.b;
                openVPNClient7.C(true);
                openVPNClient7.i0();
                openVPNClient7.j0();
                return;
            case 7:
                if (this.b.g0.o().booleanValue()) {
                    textView = this.b.x;
                    sb = new StringBuilder();
                    sb.append(this.b.getString(R.string.duration_three));
                    strC = PsiphonDNSService.c();
                } else if (this.b.g0.p().booleanValue()) {
                    textView = this.b.x;
                    sb = new StringBuilder();
                    sb.append(this.b.getString(R.string.duration_three));
                    strC = SocksDNSService.c();
                } else {
                    textView = this.b.x;
                    sb = new StringBuilder();
                    sb.append(this.b.getString(R.string.duration_three));
                    strC = XRayDNSService.c();
                }
                sb.append(strC);
                textView.setText(sb.toString());
                C2772hH c2772hHR = C2827iH.s().r();
                synchronized (c2772hHR) {
                    long totalRxBytes = TrafficStats.getTotalRxBytes();
                    j = totalRxBytes - c2772hHR.b;
                    c2772hHR.b = totalRxBytes;
                }
                C3492ub c3492ub = this.b.g0;
                c3492ub.getClass();
                long j2 = c3492ub.a.getLong(Deobfuscator$MHRTUNNELVPN$app.getString(-168353480274874L), 0L) + j;
                XD xd = c3492ub.b;
                xd.putLong(Deobfuscator$MHRTUNNELVPN$app.getString(-168319120536506L), j2);
                xd.apply();
                long jB = C2827iH.s().r().b();
                C3492ub c3492ub2 = this.b.g0;
                c3492ub2.getClass();
                long j3 = c3492ub2.a.getLong(Deobfuscator$MHRTUNNELVPN$app.getString(-168426494718906L), 0L) + jB;
                XD xd2 = c3492ub2.b;
                xd2.putLong(Deobfuscator$MHRTUNNELVPN$app.getString(-168387840013242L), j3);
                xd2.apply();
                OpenVPNClient openVPNClient8 = this.b;
                TextView textView2 = openVPNClient8.o;
                C3492ub c3492ub3 = openVPNClient8.g0;
                c3492ub3.getClass();
                textView2.setText(OpenVPNClient.T(c3492ub3.a.getLong(Deobfuscator$MHRTUNNELVPN$app.getString(-168353480274874L), 0L)));
                OpenVPNClient openVPNClient9 = this.b;
                TextView textView3 = openVPNClient9.p;
                C3492ub c3492ub4 = openVPNClient9.g0;
                c3492ub4.getClass();
                textView3.setText(OpenVPNClient.T(c3492ub4.a.getLong(Deobfuscator$MHRTUNNELVPN$app.getString(-168426494718906L), 0L)));
                return;
            default:
                OpenVPNClient openVPNClient10 = this.b;
                if (openVPNClient10.g0.n().booleanValue()) {
                    return;
                }
                openVPNClient10.W();
                XD xd3 = openVPNClient10.g0.b;
                xd3.putLong(Deobfuscator$MHRTUNNELVPN$app.getString(-168319120536506L), 0L);
                xd3.apply();
                XD xd4 = openVPNClient10.g0.b;
                xd4.putLong(Deobfuscator$MHRTUNNELVPN$app.getString(-168387840013242L), 0L);
                xd4.apply();
                return;
        }
    }
}
