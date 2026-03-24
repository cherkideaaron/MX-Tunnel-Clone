package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import com.mxtunnel.pro.R;
import org.json.JSONException;
import org.json.JSONObject;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.activities.OpenVPNClient;

/* renamed from: Dh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnTouchListenerC0071Dh implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ViewOnTouchListenerC0071Dh(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                C0122Gh c0122Gh = (C0122Gh) obj;
                c0122Gh.getClass();
                if (motionEvent.getAction() == 1) {
                    long jUptimeMillis = SystemClock.uptimeMillis() - c0122Gh.o;
                    if (jUptimeMillis < 0 || jUptimeMillis > 300) {
                        c0122Gh.m = false;
                    }
                    c0122Gh.u();
                    c0122Gh.m = true;
                    c0122Gh.o = SystemClock.uptimeMillis();
                }
                return false;
            default:
                String str = OpenVPNClient.Y0;
                final OpenVPNClient openVPNClient = (OpenVPNClient) obj;
                openVPNClient.getClass();
                if (motionEvent.getAction() == 1) {
                    View viewInflate = openVPNClient.getLayoutInflater().inflate(R.layout.searchable_listview, (ViewGroup) null);
                    C3249q1 c3249q1 = new C3249q1(openVPNClient);
                    C3084n1 c3084n1 = (C3084n1) c3249q1.c;
                    c3084n1.r = viewInflate;
                    c3084n1.n = false;
                    SearchView searchView = (SearchView) viewInflate.findViewById(R.id.search_view);
                    ListView listView = (ListView) viewInflate.findViewById(R.id.list_view);
                    final C2646f1 c2646f1 = new C2646f1(openVPNClient, openVPNClient.U0, true);
                    listView.setAdapter((ListAdapter) c2646f1);
                    searchView.setOnQueryTextListener(new C0508ay(c2646f1));
                    c3249q1.f(Deobfuscator$MHRTUNNELVPN$app.getString(-32623923786682L), new DialogInterfaceOnClickListenerC0418Xo(c2646f1, 1));
                    final DialogInterfaceC3303r1 dialogInterfaceC3303r1A = c3249q1.a();
                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: Ex
                        @Override // android.widget.AdapterView.OnItemClickListener
                        public final void onItemClick(AdapterView adapterView, View view2, int i, long j) {
                            String str2 = OpenVPNClient.Y0;
                            OpenVPNClient openVPNClient2 = openVPNClient;
                            openVPNClient2.getClass();
                            JSONObject jSONObject = (JSONObject) c2646f1.a.get(i);
                            if (jSONObject != null) {
                                try {
                                    int iD = OpenVPNClient.D(new JSONObject(YD.a(openVPNClient2.w0)).getJSONArray(Deobfuscator$MHRTUNNELVPN$app.getString(-58428087301050L)), jSONObject.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-58488216843194L)));
                                    openVPNClient2.N();
                                    openVPNClient2.r0.setSelection(iD);
                                } catch (JSONException unused) {
                                }
                            }
                            dialogInterfaceC3303r1A.dismiss();
                        }
                    });
                    int iF = openVPNClient.g0.f();
                    if (iF >= 0 && iF < c2646f1.a.size()) {
                        listView.setSelection(iF);
                    }
                    dialogInterfaceC3303r1A.show();
                }
                return true;
        }
    }
}
