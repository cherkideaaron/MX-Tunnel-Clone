package defpackage;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.activities.OpenVPNClient;
import xyz.hasnat.sweettoast.SweetToast;

/* loaded from: classes2.dex */
public final class Tx implements DC, YK {
    public final /* synthetic */ OpenVPNClient a;

    public /* synthetic */ Tx(OpenVPNClient openVPNClient) {
        this.a = openVPNClient;
    }

    @Override // defpackage.DC
    public void b(String str) throws JSONException, IOException {
        String strC;
        OpenVPNClient openVPNClient = this.a;
        try {
            try {
                strC = AbstractC0309Rh.c(str.replace(Deobfuscator$MHRTUNNELVPN$app.getString(-28728388449210L), Deobfuscator$MHRTUNNELVPN$app.getString(-28736978383802L)).replace(Deobfuscator$MHRTUNNELVPN$app.getString(-28741273351098L), Deobfuscator$MHRTUNNELVPN$app.getString(-28749863285690L)), AbstractC0309Rh.a);
            } catch (Exception unused) {
                strC = null;
            }
            JSONObject jSONObject = new JSONObject(strC);
            String string = jSONObject.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-28754158252986L));
            String str2 = OpenVPNClient.Y0;
            if (!OpenVPNClient.w(openVPNClient, string, openVPNClient.E())) {
                if (openVPNClient.h0) {
                    SweetToast.info(openVPNClient.getApplicationContext(), Deobfuscator$MHRTUNNELVPN$app.getString(-28788517991354L));
                    return;
                }
                return;
            }
            JSONArray jSONArray = new JSONArray();
            try {
                JSONArray jSONArray2 = openVPNClient.m().getJSONArray(Deobfuscator$MHRTUNNELVPN$app.getString(-55593408885690L));
                for (int i = 0; i < jSONArray2.length(); i++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i);
                    if (jSONObject2.optString(Deobfuscator$MHRTUNNELVPN$app.getString(-55632063591354L), Deobfuscator$MHRTUNNELVPN$app.getString(-55666423329722L)).startsWith(Deobfuscator$MHRTUNNELVPN$app.getString(-55670718297018L))) {
                        jSONArray.put(jSONObject2);
                    }
                }
            } catch (Exception unused2) {
            }
            JSONArray jSONArray3 = jSONObject.getJSONArray(Deobfuscator$MHRTUNNELVPN$app.getString(-28878712304570L));
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                String strOptString = jSONObject3.optString(Deobfuscator$MHRTUNNELVPN$app.getString(-28917367010234L));
                if (strOptString != null) {
                    for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                        if (strOptString.equalsIgnoreCase(jSONArray3.getJSONObject(i3).optString(Deobfuscator$MHRTUNNELVPN$app.getString(-55726552871866L), Deobfuscator$MHRTUNNELVPN$app.getString(-55786682414010L)))) {
                            break;
                        }
                    }
                }
                jSONArray3.put(jSONObject3);
            }
            FileOutputStream fileOutputStream = new FileOutputStream(new File(openVPNClient.getFilesDir().getAbsolutePath() + Deobfuscator$MHRTUNNELVPN$app.getString(-28977496552378L)));
            fileOutputStream.write(AbstractC3279qd.u(jSONObject.toString(2)).getBytes());
            fileOutputStream.flush();
            fileOutputStream.close();
            SweetToast.success(openVPNClient.getApplicationContext(), Deobfuscator$MHRTUNNELVPN$app.getString(-29037626094522L));
            OpenVPNClient.x(openVPNClient);
        } catch (Exception e) {
            String message = e.getMessage();
            openVPNClient.getClass();
            Log.e(Deobfuscator$MHRTUNNELVPN$app.getString(-38250330944442L), message);
        }
    }

    @Override // defpackage.YK
    public void onConsentFormLoadSuccess(InterfaceC0031Bb interfaceC0031Bb) {
        String str = OpenVPNClient.Y0;
        OpenVPNClient openVPNClient = this.a;
        openVPNClient.getClass();
        if (openVPNClient.W0.getConsentStatus() == 0) {
            interfaceC0031Bb.show(openVPNClient, new C2533cy(this, 0));
        }
        if (openVPNClient.W0.getConsentStatus() == 2) {
            interfaceC0031Bb.show(openVPNClient, new C2533cy(this, 1));
        }
    }
}
