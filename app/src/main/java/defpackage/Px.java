package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.activities.OpenVPNClient;

/* loaded from: classes2.dex */
public final class Px implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ OpenVPNClient b;

    public Px(OpenVPNClient openVPNClient, boolean[] zArr) {
        this.b = openVPNClient;
        this.a = zArr;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        EditText editText;
        long j2;
        boolean[] zArr = this.a;
        OpenVPNClient openVPNClient = this.b;
        if (i == 0) {
            openVPNClient.p0.setText(Deobfuscator$MHRTUNNELVPN$app.getString(-18987402621882L));
            if (!zArr[0]) {
                return;
            }
            editText = openVPNClient.q0;
            j2 = -18991697589178L;
        } else if (i == 1) {
            openVPNClient.p0.setText(Deobfuscator$MHRTUNNELVPN$app.getString(-18995992556474L));
            if (!zArr[0]) {
                return;
            }
            editText = openVPNClient.q0;
            j2 = -19485618828218L;
        } else if (i == 2) {
            openVPNClient.p0.setText(Deobfuscator$MHRTUNNELVPN$app.getString(-19507093664698L));
            if (!zArr[0]) {
                return;
            }
            editText = openVPNClient.q0;
            j2 = -20048259543994L;
        } else {
            openVPNClient.p0.setText(Deobfuscator$MHRTUNNELVPN$app.getString(-20069734380474L));
            if (!zArr[0]) {
                return;
            }
            editText = openVPNClient.q0;
            j2 = -20378972025786L;
        }
        editText.setText(Deobfuscator$MHRTUNNELVPN$app.getString(j2));
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
