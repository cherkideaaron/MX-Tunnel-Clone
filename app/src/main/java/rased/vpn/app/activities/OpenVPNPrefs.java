package rased.vpn.app.activities;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import com.mxtunnel.pro.R;

/* loaded from: classes2.dex */
public class OpenVPNPrefs extends PreferenceActivity {
    @Override // android.preference.PreferenceActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i = a.f;
        super.onCreate(bundle);
        addPreferencesFromResource(R.xml.preferences);
    }
}
