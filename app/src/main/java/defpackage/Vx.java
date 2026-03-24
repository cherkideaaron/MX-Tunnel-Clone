package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import android.widget.EditText;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.activities.OpenVPNClient;
import rased.vpn.app.service.OpenVPNService;

/* loaded from: classes2.dex */
public final class Vx implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ EditText c;
    public final /* synthetic */ OpenVPNClient d;

    public /* synthetic */ Vx(OpenVPNClient openVPNClient, String str, EditText editText, int i) {
        this.a = i;
        this.d = openVPNClient;
        this.b = str;
        this.c = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                if (i == -1) {
                    this.c.getText().toString();
                    OpenVPNClient openVPNClient = this.d;
                    openVPNClient.getClass();
                    new Intent(openVPNClient, (Class<?>) OpenVPNClient.class).addFlags(8388608).setAction(Deobfuscator$MHRTUNNELVPN$app.getString(-64080264262586L)).putExtra(Deobfuscator$MHRTUNNELVPN$app.getString(-64191933412282L), this.b);
                    break;
                }
                break;
            default:
                if (i == -1) {
                    String string = this.c.getText().toString();
                    OpenVPNClient openVPNClient2 = this.d;
                    openVPNClient2.getClass();
                    String string2 = Deobfuscator$MHRTUNNELVPN$app.getString(-63766731649978L);
                    Intent action = new Intent(openVPNClient2, (Class<?>) OpenVPNService.class).setAction(Deobfuscator$MHRTUNNELVPN$app.getString(-63844041061306L));
                    StringBuilder sbN = AbstractC3264qG.n(string2);
                    sbN.append(Deobfuscator$MHRTUNNELVPN$app.getString(-63985774982074L));
                    Intent intentPutExtra = action.putExtra(sbN.toString(), this.b);
                    StringBuilder sbN2 = AbstractC3264qG.n(string2);
                    sbN2.append(Deobfuscator$MHRTUNNELVPN$app.getString(-64024429687738L));
                    openVPNClient2.startService(intentPutExtra.putExtra(sbN2.toString(), string));
                    break;
                }
                break;
        }
    }
}
