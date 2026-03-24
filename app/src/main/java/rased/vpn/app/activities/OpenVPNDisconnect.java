package rased.vpn.app.activities;

import android.os.Bundle;
import android.util.Log;

/* loaded from: classes2.dex */
public class OpenVPNDisconnect extends a {
    @Override // rased.vpn.app.activities.a, androidx.fragment.app.q, defpackage.AbstractActivityC2619eb, defpackage.AbstractActivityC2565db, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.d("OpenVPNDisconnect", "disconnect");
        u(false);
        finish();
    }
}
