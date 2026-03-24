package defpackage;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.mxtunnel.pro.R;
import rased.vpn.app.activities.OpenVPNClient;

/* loaded from: classes2.dex */
public final class Qx implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ OpenVPNClient b;

    public /* synthetic */ Qx(OpenVPNClient openVPNClient, int i) {
        this.a = i;
        this.b = openVPNClient;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        OpenVPNClient openVPNClient = this.b;
        switch (this.a) {
            case 0:
                C0332Sn c0332Sn = new C0332Sn();
                c0332Sn.a = openVPNClient;
                DialogInterfaceOnCancelListenerC0298Qn dialogInterfaceOnCancelListenerC0298Qn = new DialogInterfaceOnCancelListenerC0298Qn();
                dialogInterfaceOnCancelListenerC0298Qn.d = openVPNClient;
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(openVPNClient);
                dialogInterfaceOnCancelListenerC0298Qn.f = defaultSharedPreferences;
                dialogInterfaceOnCancelListenerC0298Qn.m = defaultSharedPreferences.edit();
                View viewInflate = LayoutInflater.from(openVPNClient).inflate(R.layout.generator_main, (ViewGroup) null);
                dialogInterfaceOnCancelListenerC0298Qn.n = (EditText) viewInflate.findViewById(R.id.url_host);
                dialogInterfaceOnCancelListenerC0298Qn.b = (RadioGroup) viewInflate.findViewById(R.id.split_group);
                dialogInterfaceOnCancelListenerC0298Qn.o = (Spinner) viewInflate.findViewById(R.id.request_method);
                dialogInterfaceOnCancelListenerC0298Qn.p = (Spinner) viewInflate.findViewById(R.id.inject_method);
                dialogInterfaceOnCancelListenerC0298Qn.q = (RadioGroup) viewInflate.findViewById(R.id.query_mode);
                dialogInterfaceOnCancelListenerC0298Qn.r = (CheckBox) viewInflate.findViewById(R.id.online_host);
                dialogInterfaceOnCancelListenerC0298Qn.s = (CheckBox) viewInflate.findViewById(R.id.forward_host);
                dialogInterfaceOnCancelListenerC0298Qn.t = (CheckBox) viewInflate.findViewById(R.id.reverse_proxy);
                dialogInterfaceOnCancelListenerC0298Qn.u = (CheckBox) viewInflate.findViewById(R.id.keep_alive);
                dialogInterfaceOnCancelListenerC0298Qn.v = (CheckBox) viewInflate.findViewById(R.id.paygen_proxy_auth);
                dialogInterfaceOnCancelListenerC0298Qn.w = (CheckBox) viewInflate.findViewById(R.id.dual_connect);
                dialogInterfaceOnCancelListenerC0298Qn.x = (Button) viewInflate.findViewById(R.id.generate_payload);
                dialogInterfaceOnCancelListenerC0298Qn.a = viewInflate.findViewById(R.id.close_generator_dialog);
                dialogInterfaceOnCancelListenerC0298Qn.o.setAdapter((SpinnerAdapter) new ArrayAdapter(openVPNClient, R.layout.spinner_item, new String[]{"CONNECT", "GET", "POST", "HEAD", "PUT", "PATCH", "DELETE"}));
                dialogInterfaceOnCancelListenerC0298Qn.p.setAdapter((SpinnerAdapter) new ArrayAdapter(openVPNClient, R.layout.spinner_item, new String[]{"Normal", "Front Inject", "Back Inject"}));
                ((RadioButton) dialogInterfaceOnCancelListenerC0298Qn.q.getChildAt(dialogInterfaceOnCancelListenerC0298Qn.f.getInt("QUERY_MODE", 0))).setChecked(true);
                ((RadioButton) dialogInterfaceOnCancelListenerC0298Qn.b.getChildAt(dialogInterfaceOnCancelListenerC0298Qn.f.getInt("Split", 2))).setChecked(true);
                dialogInterfaceOnCancelListenerC0298Qn.n.setText(dialogInterfaceOnCancelListenerC0298Qn.f.getString("URL_HOST", ""));
                dialogInterfaceOnCancelListenerC0298Qn.o.setSelection(dialogInterfaceOnCancelListenerC0298Qn.f.getInt("SELECTED_REQUEST_METHOD", 0), false);
                dialogInterfaceOnCancelListenerC0298Qn.p.setSelection(dialogInterfaceOnCancelListenerC0298Qn.f.getInt("SELECTED_INJECT_METHOD", 0), false);
                dialogInterfaceOnCancelListenerC0298Qn.r.setChecked(dialogInterfaceOnCancelListenerC0298Qn.f.getBoolean("ONLINE_HOST", false));
                dialogInterfaceOnCancelListenerC0298Qn.s.setChecked(dialogInterfaceOnCancelListenerC0298Qn.f.getBoolean("FORWARD_HOST", false));
                dialogInterfaceOnCancelListenerC0298Qn.t.setChecked(dialogInterfaceOnCancelListenerC0298Qn.f.getBoolean("REVERSE_PROXY", false));
                dialogInterfaceOnCancelListenerC0298Qn.u.setChecked(dialogInterfaceOnCancelListenerC0298Qn.f.getBoolean("KEEP_ALIVE", false));
                dialogInterfaceOnCancelListenerC0298Qn.v.setChecked(dialogInterfaceOnCancelListenerC0298Qn.f.getBoolean("PROXY_AUTH", false));
                dialogInterfaceOnCancelListenerC0298Qn.w.setChecked(dialogInterfaceOnCancelListenerC0298Qn.f.getBoolean("DUAL_CONNECT", false));
                dialogInterfaceOnCancelListenerC0298Qn.b.setOnCheckedChangeListener(dialogInterfaceOnCancelListenerC0298Qn);
                dialogInterfaceOnCancelListenerC0298Qn.o.setOnItemSelectedListener(dialogInterfaceOnCancelListenerC0298Qn);
                dialogInterfaceOnCancelListenerC0298Qn.p.setOnItemSelectedListener(dialogInterfaceOnCancelListenerC0298Qn);
                dialogInterfaceOnCancelListenerC0298Qn.q.setOnCheckedChangeListener(dialogInterfaceOnCancelListenerC0298Qn);
                dialogInterfaceOnCancelListenerC0298Qn.x.setOnClickListener(dialogInterfaceOnCancelListenerC0298Qn);
                dialogInterfaceOnCancelListenerC0298Qn.a.setOnClickListener(dialogInterfaceOnCancelListenerC0298Qn);
                DialogInterfaceC3303r1 dialogInterfaceC3303r1A = new C3249q1(openVPNClient).a();
                dialogInterfaceOnCancelListenerC0298Qn.c = dialogInterfaceC3303r1A;
                C3194p1 c3194p1 = dialogInterfaceC3303r1A.f;
                c3194p1.h = viewInflate;
                c3194p1.i = 0;
                c3194p1.j = false;
                dialogInterfaceC3303r1A.setOnCancelListener(dialogInterfaceOnCancelListenerC0298Qn);
                dialogInterfaceOnCancelListenerC0298Qn.e = c0332Sn;
                dialogInterfaceOnCancelListenerC0298Qn.c.show();
                break;
            default:
                String str = OpenVPNClient.Y0;
                openVPNClient.getClass();
                PopupMenu popupMenu = new PopupMenu(openVPNClient.getApplicationContext(), view);
                popupMenu.getMenuInflater().inflate(R.menu.item_menu, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new Jx(openVPNClient));
                popupMenu.show();
                break;
        }
    }
}
