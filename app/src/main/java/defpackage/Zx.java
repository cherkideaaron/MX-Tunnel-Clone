package defpackage;

import android.content.DialogInterface;
import androidx.fragment.app.g;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.activities.OpenVPNClient;

/* loaded from: classes2.dex */
public final class Zx implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ Zx(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                OpenVPNClient openVPNClient = (OpenVPNClient) this.b;
                openVPNClient.D0.setChecked(false);
                openVPNClient.L0 = Deobfuscator$MHRTUNNELVPN$app.getString(-31228059415482L);
                break;
            case 1:
                OpenVPNClient openVPNClient2 = (OpenVPNClient) this.b;
                openVPNClient2.D0.setChecked(false);
                openVPNClient2.L0 = Deobfuscator$MHRTUNNELVPN$app.getString(-31236649350074L);
                break;
            default:
                g gVar = (g) this.b;
                if (gVar.mDialog != null) {
                    gVar.onCancel(gVar.mDialog);
                    break;
                }
                break;
        }
    }
}
