package rased.vpn.app.activities;

import android.app.Activity;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.widget.SwitchCompat;
import com.mxtunnel.pro.R;
import defpackage.C3492ub;
import defpackage.F3;
import defpackage.G3;
import defpackage.H3;
import defpackage.I3;
import defpackage.J3;
import defpackage.Mx;
import defpackage.ViewOnClickListenerC0510b;
import defpackage.XD;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.activities.AppListActivity;

/* loaded from: classes2.dex */
public class AppListActivity extends Activity {
    public static final /* synthetic */ int d = 0;
    public C3492ub a;
    public I3 b;
    public boolean c = false;

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        String[] strArr;
        super.onCreate(bundle);
        setContentView(R.layout.split_tunnel_drawer);
        this.a = new C3492ub(getApplicationContext());
        final ListView listView = (ListView) findViewById(R.id.app_list_view);
        ImageView imageView = (ImageView) findViewById(R.id.backButton);
        SwitchCompat switchCompat = (SwitchCompat) findViewById(R.id.splitTunnelSwitch);
        SwitchCompat switchCompat2 = (SwitchCompat) findViewById(R.id.bypassModeSwitch);
        imageView.setOnClickListener(new ViewOnClickListenerC0510b(this, 3));
        C3492ub c3492ub = this.a;
        c3492ub.getClass();
        switchCompat.setChecked(c3492ub.a.getBoolean(Deobfuscator$MHRTUNNELVPN$app.getString(-169139459290042L), false));
        switchCompat.setOnCheckedChangeListener(new Mx(this, 2));
        switchCompat2.setChecked(this.a.b());
        switchCompat2.setText(this.a.b() ? "VPN is used for all apps except selected" : "VPN is used only for selected apps");
        switchCompat2.setOnCheckedChangeListener(new F3(this, switchCompat2));
        Set setA = this.a.a();
        PackageManager packageManager = getPackageManager();
        this.b = new I3(this);
        for (PackageInfo packageInfo : packageManager.getInstalledPackages(4096)) {
            if (!packageInfo.packageName.equals(getPackageName()) && (strArr = packageInfo.requestedPermissions) != null && Arrays.asList(strArr).contains("android.permission.INTERNET")) {
                boolean zContains = setA.contains(packageInfo.packageName);
                String string = packageInfo.applicationInfo.loadLabel(packageManager).toString();
                J3 j3 = new J3();
                j3.a = packageInfo;
                j3.b = zContains;
                j3.c = string;
                this.b.add(j3);
            }
        }
        EditText editText = new EditText(this);
        editText.setHint("Search");
        int i = (int) (getResources().getDisplayMetrics().density * 8.0f);
        editText.setPadding(i, i, i, i);
        listView.addHeaderView(editText, null, false);
        this.b.sort(new G3(0));
        listView.setAdapter((ListAdapter) this.b);
        editText.addTextChangedListener(new H3(this, 0));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: E3
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
                int i3 = AppListActivity.d;
                AppListActivity appListActivity = this.a;
                appListActivity.getClass();
                ListView listView2 = listView;
                if (i2 >= listView2.getHeaderViewsCount()) {
                    J3 j32 = (J3) appListActivity.b.b.get(i2 - listView2.getHeaderViewsCount());
                    j32.b = !j32.b;
                    CheckBox checkBox = (CheckBox) view.findViewById(R.id.checked);
                    if (checkBox != null) {
                        checkBox.setChecked(j32.b);
                    }
                    appListActivity.c = true;
                }
            }
        });
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        if (this.c) {
            HashSet hashSet = new HashSet();
            Iterator it = this.b.a.iterator();
            while (it.hasNext()) {
                J3 j3 = (J3) it.next();
                if (j3.b) {
                    hashSet.add(j3.a.packageName);
                }
            }
            XD xd = this.a.b;
            xd.putStringSet(Deobfuscator$MHRTUNNELVPN$app.getString(-169062149878714L), hashSet);
            xd.apply();
        }
        super.onDestroy();
    }
}
