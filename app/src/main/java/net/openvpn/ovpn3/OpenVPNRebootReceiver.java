package net.openvpn.ovpn3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import defpackage.C2827iH;
import defpackage.YD;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.activities.OpenVPNClient;
import rased.vpn.app.activities.a;

/* loaded from: classes2.dex */
public class OpenVPNRebootReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i = a.f;
        C2827iH c2827iH = new C2827iH(new YD(context), 22);
        String strV = c2827iH.v(Deobfuscator$MHRTUNNELVPN$app.getString(-61773866824634L));
        if (strV != null) {
            c2827iH.f(Deobfuscator$MHRTUNNELVPN$app.getString(-61872651072442L));
            if (c2827iH.t(Deobfuscator$MHRTUNNELVPN$app.getString(-61971435320250L))) {
                Intent intentPutExtra = new Intent(context, (Class<?>) OpenVPNClient.class).addFlags(276824064).putExtra(Deobfuscator$MHRTUNNELVPN$app.getString(-62014384993210L), strV);
                context.startActivity(intentPutExtra);
                Log.d(Deobfuscator$MHRTUNNELVPN$app.getString(-62190478652346L), Deobfuscator$MHRTUNNELVPN$app.getString(-62267788063674L) + strV + Deobfuscator$MHRTUNNELVPN$app.getString(-62392342115258L) + intentPutExtra.toString());
            }
        }
    }
}
