package rased.vpn.app.activities;

import android.app.Activity;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.mxtunnel.pro.R;
import defpackage.ViewOnClickListenerC0401Wo;
import java.util.ArrayList;
import rased.vpn.app.service.vpn.TunnelUtils;

/* loaded from: classes2.dex */
public class IPHunterActivity extends Activity {
    public static final /* synthetic */ int p = 0;
    public Button a;
    public ImageView b;
    public EditText c;
    public TextView d;
    public ListView e;
    public ArrayAdapter m;
    public Thread o;
    public final ArrayList f = new ArrayList();
    public boolean n = false;

    public final String a() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
        return (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) ? "192.168.1.1" : TunnelUtils.getLocalIpAddress();
    }

    public final void b() {
        Thread thread = this.o;
        if (thread != null) {
            thread.interrupt();
        }
        this.o = null;
        this.a.setText("START IP HUNT");
        this.n = false;
        this.f.add("IP hunting stopped.");
        this.m.notifyDataSetChanged();
        this.c.setEnabled(true);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.iphunter_drawer);
        this.a = (Button) findViewById(R.id.toggleAirplaneModeButton);
        this.b = (ImageView) findViewById(R.id.backButton);
        this.c = (EditText) findViewById(R.id.ipInputEditText);
        this.d = (TextView) findViewById(R.id.currentIPTxt);
        this.e = (ListView) findViewById(R.id.logListView);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, this.f);
        this.m = arrayAdapter;
        this.e.setAdapter((ListAdapter) arrayAdapter);
        this.a.setOnClickListener(new ViewOnClickListenerC0401Wo(this, 0));
        this.b.setOnClickListener(new ViewOnClickListenerC0401Wo(this, 1));
        this.d.setText("Current Local IP: " + a());
    }

    @Override // android.app.Activity
    public final void onResume() {
        this.d.setText("Current Local IP: " + a());
        super.onResume();
    }
}
