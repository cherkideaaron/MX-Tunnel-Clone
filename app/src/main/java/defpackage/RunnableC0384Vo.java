package defpackage;

import java.util.ArrayList;
import rased.vpn.app.activities.IPHunterActivity;

/* renamed from: Vo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0384Vo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ IPHunterActivity b;
    public final /* synthetic */ String c;

    public /* synthetic */ RunnableC0384Vo(IPHunterActivity iPHunterActivity, String str, int i) {
        this.a = i;
        this.b = iPHunterActivity;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                IPHunterActivity iPHunterActivity = this.b;
                ArrayList arrayList = iPHunterActivity.f;
                arrayList.add("Local IP: " + iPHunterActivity.a());
                arrayList.add(this.c);
                iPHunterActivity.m.notifyDataSetChanged();
                iPHunterActivity.d.setText("Current Local IP: " + iPHunterActivity.a());
                break;
            case 1:
                IPHunterActivity iPHunterActivity2 = this.b;
                ArrayList arrayList2 = iPHunterActivity2.f;
                arrayList2.add("Local IP: " + iPHunterActivity2.a());
                arrayList2.add(this.c);
                iPHunterActivity2.m.notifyDataSetChanged();
                iPHunterActivity2.d.setText("Current Local IP: " + iPHunterActivity2.a());
                break;
            default:
                IPHunterActivity iPHunterActivity3 = this.b;
                ArrayList arrayList3 = iPHunterActivity3.f;
                arrayList3.add("Local IP: " + iPHunterActivity3.a());
                arrayList3.add(this.c);
                iPHunterActivity3.m.notifyDataSetChanged();
                iPHunterActivity3.d.setText("Current Local IP: " + iPHunterActivity3.a());
                break;
        }
    }
}
