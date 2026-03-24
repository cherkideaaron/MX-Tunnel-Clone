package defpackage;

import android.app.Application;
import android.content.Intent;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import com.mxtunnel.pro.R;
import java.util.Arrays;
import org.json.JSONException;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.activities.OpenVPNApplication;
import rased.vpn.app.activities.OpenVPNClient;
import rased.vpn.app.activities.SplashActivity;

/* loaded from: classes2.dex */
public final class Ux extends CountDownTimer {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractActivityC2592e2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ux(OpenVPNClient openVPNClient, int i) {
        super(10000L, 1000L);
        this.a = i;
        switch (i) {
            case 1:
                this.b = openVPNClient;
                super(5000L, 1000L);
                break;
            default:
                this.b = openVPNClient;
                break;
        }
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() throws JSONException {
        Intent intent;
        AbstractActivityC2592e2 abstractActivityC2592e2 = this.b;
        switch (this.a) {
            case 0:
                OpenVPNClient openVPNClient = (OpenVPNClient) abstractActivityC2592e2;
                if (Arrays.asList(Deobfuscator$MHRTUNNELVPN$app.getString(-29866554782650L)).contains(openVPNClient.y0)) {
                    openVPNClient.h0();
                    new Handler().postDelayed(new Lx(openVPNClient, 3), 2000L);
                    if (!openVPNClient.Q0) {
                        new Handler(Looper.getMainLooper()).post(new RunnableC2666fL(openVPNClient.getApplicationContext(), Deobfuscator$MHRTUNNELVPN$app.getString(-29900914521018L), 1));
                        openVPNClient.Q0 = true;
                    }
                }
                openVPNClient.x0.cancel();
                break;
            case 1:
                OpenVPNClient openVPNClient2 = (OpenVPNClient) abstractActivityC2592e2;
                if (Arrays.asList(openVPNClient2.getString(R.string.wait), openVPNClient2.getString(R.string.unknown)).contains(openVPNClient2.y0)) {
                    openVPNClient2.h0();
                    openVPNClient2.e0();
                    if (!openVPNClient2.Q0) {
                        new Handler(Looper.getMainLooper()).post(new RunnableC2666fL(openVPNClient2.getApplicationContext(), Deobfuscator$MHRTUNNELVPN$app.getString(-30248806871994L), 1));
                        openVPNClient2.Q0 = true;
                    }
                }
                openVPNClient2.x0.cancel();
                break;
            default:
                SplashActivity splashActivity = (SplashActivity) abstractActivityC2592e2;
                C3492ub c3492ub = splashActivity.b;
                c3492ub.getClass();
                if (!c3492ub.a.getBoolean(Deobfuscator$MHRTUNNELVPN$app.getString(-169388567393210L), true)) {
                    Application application = splashActivity.getApplication();
                    if (application instanceof OpenVPNApplication) {
                        C2524cp c2524cp = new C2524cp(this, 24);
                        C3460tx c3460tx = ((OpenVPNApplication) application).a;
                        int i = C3460tx.e;
                        c3460tx.b(splashActivity, c2524cp);
                        break;
                    } else {
                        intent = new Intent(splashActivity, (Class<?>) OpenVPNClient.class);
                    }
                } else {
                    intent = new Intent(splashActivity, (Class<?>) OpenVPNClient.class);
                }
                splashActivity.startActivity(intent);
                splashActivity.finish();
                break;
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        switch (this.a) {
            case 1:
                String str = OpenVPNClient.Y0;
                ((OpenVPNClient) this.b).getClass();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ux(SplashActivity splashActivity, long j) {
        super(j, 1000L);
        this.a = 2;
        this.b = splashActivity;
    }

    private final void a(long j) {
    }

    private final void b(long j) {
    }
}
