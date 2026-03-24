package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.activities.OpenVPNClient;
import rased.vpn.app.activities.a;
import rased.vpn.app.service.OpenVPNService;
import xyz.hasnat.sweettoast.SweetToast;

/* renamed from: c1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DialogInterfaceOnClickListenerC0566c1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;

    public /* synthetic */ DialogInterfaceOnClickListenerC0566c1(String str, int i, Object obj) {
        this.a = i;
        this.c = obj;
        this.b = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) throws JSONException, IOException {
        switch (this.a) {
            case 0:
                C2646f1 c2646f1 = (C2646f1) this.c;
                OpenVPNClient openVPNClient = c2646f1.d;
                String str = this.b;
                openVPNClient.getClass();
                try {
                    JSONObject jSONObjectM = openVPNClient.m();
                    JSONArray jSONArray = jSONObjectM.getJSONArray(Deobfuscator$MHRTUNNELVPN$app.getString(-52848924783546L));
                    jSONArray.remove(OpenVPNClient.D(jSONArray, str));
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(openVPNClient.getFilesDir().getAbsolutePath() + Deobfuscator$MHRTUNNELVPN$app.getString(-52887579489210L)));
                        fileOutputStream.write(AbstractC3279qd.u(jSONObjectM.toString(2)).getBytes());
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    } catch (IOException e) {
                        SweetToast.error(openVPNClient.getApplicationContext(), Deobfuscator$MHRTUNNELVPN$app.getString(-52947709031354L) + e.getMessage());
                    }
                    SweetToast.success(openVPNClient.getApplicationContext(), Deobfuscator$MHRTUNNELVPN$app.getString(-53012133540794L) + str);
                } catch (JSONException unused) {
                }
                openVPNClient.N();
                int iF = openVPNClient.g0.f();
                openVPNClient.r0.setSelection(iF == 0 ? 1 : 0);
                if (iF >= openVPNClient.I().length()) {
                    iF = 0;
                }
                openVPNClient.r0.postDelayed(new Cx(openVPNClient, iF, 2), 100L);
                ArrayList arrayList = c2646f1.c;
                arrayList.clear();
                arrayList.addAll(c2646f1.a);
                c2646f1.notifyDataSetChanged();
                break;
            default:
                if (i == -1) {
                    a aVar = (a) this.c;
                    aVar.getClass();
                    aVar.startService(new Intent(aVar, (Class<?>) OpenVPNService.class).setAction(Deobfuscator$MHRTUNNELVPN$app.getString(-63513328579514L)).putExtra(Deobfuscator$MHRTUNNELVPN$app.getString(-63655062500282L), this.b));
                    break;
                }
                break;
        }
    }
}
