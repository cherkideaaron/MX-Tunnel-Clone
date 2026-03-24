package defpackage;

import android.widget.CompoundButton;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.activities.AppListActivity;

/* loaded from: classes2.dex */
public final class Mx implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ Mx(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.a) {
            case 0:
                String[] strArr = (String[]) this.b;
                if (!z) {
                    strArr[0] = Deobfuscator$MHRTUNNELVPN$app.getString(-18626625369018L);
                    break;
                } else {
                    strArr[0] = Deobfuscator$MHRTUNNELVPN$app.getString(-18605150532538L);
                    break;
                }
            case 1:
                String[] strArr2 = (String[]) this.b;
                if (!z) {
                    strArr2[0] = Deobfuscator$MHRTUNNELVPN$app.getString(-18673870009274L);
                    break;
                } else {
                    strArr2[0] = Deobfuscator$MHRTUNNELVPN$app.getString(-18652395172794L);
                    break;
                }
            default:
                XD xd = ((AppListActivity) this.b).a.b;
                xd.putBoolean(Deobfuscator$MHRTUNNELVPN$app.getString(-169203883799482L), z);
                xd.apply();
                break;
        }
    }
}
