package defpackage;

import android.content.DialogInterface;
import android.widget.Spinner;
import java.io.Serializable;
import java.util.TreeMap;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.activities.OpenVPNClient;

/* loaded from: classes2.dex */
public final class Wx implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ OpenVPNClient b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Serializable d;

    public /* synthetic */ Wx(OpenVPNClient openVPNClient, Object obj, Serializable serializable, int i) {
        this.a = i;
        this.b = openVPNClient;
        this.c = obj;
        this.d = serializable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0102Fe c0102Fe;
        switch (this.a) {
            case 0:
                if (i == -1 && (c0102Fe = (C0102Fe) this.c) != null) {
                    String str = (String) this.d;
                    if (!c0102Fe.b(str)) {
                        ((TreeMap) c0102Fe.e).remove(str);
                        c0102Fe.f(null);
                        c0102Fe.a = true;
                    }
                    c0102Fe.e();
                    this.b.l(false);
                    break;
                }
                break;
            default:
                int selectedItemPosition = ((Spinner) this.c).getSelectedItemPosition();
                String str2 = ((String[]) this.d)[selectedItemPosition];
                OpenVPNClient openVPNClient = this.b;
                XD xd = openVPNClient.g0.b;
                xd.putString(Deobfuscator$MHRTUNNELVPN$app.getString(-169551776150458L), str2);
                xd.apply();
                XD xd2 = openVPNClient.g0.b;
                xd2.putInt(Deobfuscator$MHRTUNNELVPN$app.getString(-169723574842298L), selectedItemPosition);
                xd2.apply();
                break;
        }
    }
}
