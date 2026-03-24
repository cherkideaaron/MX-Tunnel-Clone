package defpackage;

import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.activities.AppListActivity;

/* loaded from: classes2.dex */
public final class F3 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ SwitchCompat a;
    public final /* synthetic */ AppListActivity b;

    public F3(AppListActivity appListActivity, SwitchCompat switchCompat) {
        this.b = appListActivity;
        this.a = switchCompat;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        XD xd = this.b.a.b;
        xd.putBoolean(Deobfuscator$MHRTUNNELVPN$app.getString(-169328437851066L), z);
        xd.apply();
        this.a.setText(z ? "VPN is used for all apps except selected" : "VPN is used only for selected apps");
    }
}
