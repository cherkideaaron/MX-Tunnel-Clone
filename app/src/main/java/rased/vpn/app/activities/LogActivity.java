package rased.vpn.app.activities;

import android.content.Intent;
import android.os.Bundle;
import android.text.ClipboardManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.mxtunnel.pro.R;
import defpackage.AbstractC3264qG;
import defpackage.C0512b1;
import defpackage.C3461ty;
import defpackage.RunnableC2705g5;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.service.OpenVPNService;

/* loaded from: classes2.dex */
public class LogActivity extends a implements AdapterView.OnItemLongClickListener {
    public ListView m;
    public ArrayList n;
    public C0512b1 o;

    @Override // rased.vpn.app.activities.a, defpackage.InterfaceC3353ry
    public final void a(C3461ty c3461ty) {
        this.n.add(c3461ty);
        this.o.notifyDataSetChanged();
        this.m.post(new RunnableC2705g5(this, 18));
    }

    @Override // rased.vpn.app.activities.a, androidx.fragment.app.q, defpackage.AbstractActivityC2619eb, defpackage.AbstractActivityC2565db, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.log_activity);
        this.m = (ListView) findViewById(R.id.log_list);
        this.n = new ArrayList();
        C0512b1 c0512b1 = new C0512b1(R.layout.log_item, this, this.n);
        this.o = c0512b1;
        this.m.setAdapter((ListAdapter) c0512b1);
        this.m.setOnItemLongClickListener(this);
        bindService(new Intent(this, (Class<?>) OpenVPNService.class).setAction(Deobfuscator$MHRTUNNELVPN$app.getString(-59931325854650L)), this.c, 65);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.log_menu, menu);
        return true;
    }

    @Override // defpackage.AbstractActivityC2592e2, androidx.fragment.app.q, android.app.Activity
    public final void onDestroy() {
        k();
        super.onDestroy();
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        if (this.n.size() <= 0) {
            return true;
        }
        ((ClipboardManager) getSystemService("clipboard")).setText(AbstractC3264qG.l(new StringBuilder(), ((C3461ty) this.n.get(i)).a, "\n"));
        t("Log Copied!");
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menu_copy) {
            StringBuilder sb = new StringBuilder();
            if (this.n.size() > 0) {
                Iterator it = this.n.iterator();
                while (it.hasNext()) {
                    sb.append(((C3461ty) it.next()).a + "\n");
                }
            }
            ((ClipboardManager) getSystemService("clipboard")).setText(sb.toString());
            t("Log Copied!");
        } else if (itemId == R.id.menu_delete && this.n.size() > 0) {
            this.n.clear();
            OpenVPNService openVPNService = this.b;
            ArrayDeque arrayDeque = openVPNService != null ? openVPNService.n : null;
            if (arrayDeque != null) {
                arrayDeque.clear();
            }
            this.o.notifyDataSetChanged();
            t("Log Deleted!");
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // rased.vpn.app.activities.a
    public final void q() {
        OpenVPNService openVPNService = this.b;
        ArrayDeque arrayDeque = openVPNService != null ? openVPNService.n : null;
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                this.n.add((C3461ty) it.next());
                this.o.notifyDataSetChanged();
            }
        }
    }
}
