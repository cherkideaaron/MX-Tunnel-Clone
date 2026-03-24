package defpackage;

import android.widget.EditText;
import rased.vpn.app.activities.OpenVPNClient;

/* renamed from: Sn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0332Sn implements InterfaceC0281Pn {
    public InterfaceC0315Rn a;

    @Override // defpackage.InterfaceC0281Pn
    public final void d(String str) {
        EditText editText = ((OpenVPNClient) this.a).p0;
        if (editText == null) {
            return;
        }
        editText.setText(str);
    }

    @Override // defpackage.InterfaceC0281Pn
    public final void e() {
        this.a.getClass();
    }
}
