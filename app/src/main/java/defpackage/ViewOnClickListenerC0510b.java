package defpackage;

import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.github.angads25.filepicker.widget.MaterialCheckbox;
import com.mxtunnel.pro.R;
import rased.vpn.app.activities.AboutActivity;
import rased.vpn.app.activities.AppListActivity;

/* renamed from: b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC0510b implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ViewOnClickListenerC0510b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        RecyclerView recyclerView;
        int i;
        switch (this.a) {
            case 0:
                ((AboutActivity) this.b).finish();
                return;
            case 1:
                ((F0) this.b).a();
                return;
            case 2:
                C3194p1 c3194p1 = (C3194p1) this.b;
                Message messageObtain = ((view != c3194p1.k || (message2 = c3194p1.m) == null) && (view != c3194p1.o || (message2 = c3194p1.q) == null)) ? (view != c3194p1.s || (message = c3194p1.u) == null) ? null : Message.obtain(message) : Message.obtain(message2);
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                c3194p1.K.obtainMessage(1, c3194p1.b).sendToTarget();
                return;
            case 3:
                ((AppListActivity) this.b).finish();
                return;
            case 4:
                ((C3236pp) this.b).b.completeUpdate();
                return;
            case 5:
                Ut ut = (Ut) this.b;
                int i2 = ut.e;
                if (i2 == 2) {
                    ut.g(1);
                    recyclerView = ut.n;
                    i = R.string.mtrl_picker_toggled_to_day_selection;
                } else {
                    if (i2 != 1) {
                        return;
                    }
                    ut.g(2);
                    recyclerView = ut.m;
                    i = R.string.mtrl_picker_toggled_to_year_selection;
                }
                recyclerView.announceForAccessibility(ut.getString(i));
                return;
            case 6:
                MaterialCheckbox materialCheckbox = (MaterialCheckbox) this.b;
                materialCheckbox.setChecked(!materialCheckbox.e);
                materialCheckbox.getClass();
                boolean z = materialCheckbox.e;
                throw null;
            default:
                C2937kJ c2937kJ = ((Toolbar) this.b).R;
                Cu cu = c2937kJ == null ? null : c2937kJ.b;
                if (cu != null) {
                    cu.collapseActionView();
                    return;
                }
                return;
        }
    }
}
