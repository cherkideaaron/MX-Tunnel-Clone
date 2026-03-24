package defpackage;

import android.content.Intent;
import android.os.Build;
import android.view.View;
import rased.vpn.app.activities.VPNTetherActivity;
import rased.vpn.app.tethering.ProxyService;

/* renamed from: kL, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC2939kL implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ VPNTetherActivity b;

    public /* synthetic */ ViewOnClickListenerC2939kL(VPNTetherActivity vPNTetherActivity, int i) {
        this.a = i;
        this.b = vPNTetherActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VPNTetherActivity vPNTetherActivity = this.b;
        switch (this.a) {
            case 0:
                int i = VPNTetherActivity.f;
                vPNTetherActivity.getClass();
                Intent intent = new Intent();
                intent.setClassName("com.android.settings", "com.android.settings.TetherSettings");
                vPNTetherActivity.startActivity(intent);
                break;
            case 1:
                Intent intent2 = new Intent(vPNTetherActivity.getApplicationContext(), (Class<?>) ProxyService.class);
                if (Build.VERSION.SDK_INT >= 26) {
                    vPNTetherActivity.getApplicationContext().startForegroundService(intent2);
                } else {
                    vPNTetherActivity.getApplicationContext().startService(intent2);
                }
                vPNTetherActivity.b.setVisibility(8);
                vPNTetherActivity.c.setVisibility(0);
                vPNTetherActivity.a.setText(String.format("Proxy IP: ".concat(VPNTetherActivity.a()), new Object[0]).concat(" Proxy Port: 8964"));
                AbstractC3279qd.i0(vPNTetherActivity.getApplicationContext(), "VPNTether Started!");
                break;
            case 2:
                vPNTetherActivity.b.setVisibility(0);
                vPNTetherActivity.c.setVisibility(8);
                vPNTetherActivity.getApplicationContext().sendBroadcast(new Intent(ProxyService.n));
                vPNTetherActivity.a.setText("NOT YET RUNNING");
                AbstractC3279qd.i0(vPNTetherActivity.getApplicationContext(), "VPNTether Stopped!");
                break;
            default:
                vPNTetherActivity.finish();
                break;
        }
    }
}
