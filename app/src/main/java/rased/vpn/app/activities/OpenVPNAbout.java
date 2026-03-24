package rased.vpn.app.activities;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import com.mxtunnel.pro.R;
import defpackage.AbstractC3279qd;
import java.io.IOException;
import net.openvpn.ovpn3.ClientAPI_OpenVPNClient;
import rased.vpn.app.service.OpenVPNService;

/* loaded from: classes2.dex */
public class OpenVPNAbout extends a {
    @Override // rased.vpn.app.activities.a, androidx.fragment.app.q, defpackage.AbstractActivityC2619eb, defpackage.AbstractActivityC2565db, android.app.Activity
    public final void onCreate(Bundle bundle) throws PackageManager.NameNotFoundException {
        int i;
        super.onCreate(bundle);
        setContentView(R.layout.about);
        String str = "0.0";
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
            str = packageInfo.versionName;
            i = packageInfo.versionCode;
        } catch (Exception e) {
            Log.e("OpenVPNAbout", "cannot obtain version info", e);
            i = 0;
        }
        ((TextView) findViewById(R.id.about_text)).setText(String.format(s(R.string.about_text), str, Integer.valueOf(i)));
        TextView textView = (TextView) findViewById(R.id.core_text);
        int i2 = OpenVPNService.E;
        textView.setText(ClientAPI_OpenVPNClient.platform());
        try {
            ((TextView) findViewById(R.id.about_textview)).setText(AbstractC3279qd.Y(this, "about.txt"));
        } catch (IOException e2) {
            Log.e("OpenVPNAbout", "Error opening about.txt", e2);
        }
    }
}
