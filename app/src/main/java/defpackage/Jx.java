package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.PopupMenu;
import com.mxtunnel.pro.R;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.activities.AppListActivity;
import rased.vpn.app.activities.IPHunterActivity;
import rased.vpn.app.activities.OpenVPNClient;
import rased.vpn.app.activities.VPNTetherActivity;
import xyz.hasnat.sweettoast.SweetToast;

/* loaded from: classes2.dex */
public final class Jx implements PopupMenu.OnMenuItemClickListener {
    public final /* synthetic */ OpenVPNClient a;

    public Jx(OpenVPNClient openVPNClient) {
        this.a = openVPNClient;
    }

    @Override // android.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Intent intent;
        int itemId = menuItem.getItemId();
        final OpenVPNClient openVPNClient = this.a;
        if (itemId == R.id.menu_update) {
            openVPNClient.h0 = true;
            SweetToast.info(openVPNClient.getApplicationContext(), Deobfuscator$MHRTUNNELVPN$app.getString(-18162768901050L));
            openVPNClient.z();
        } else {
            if (menuItem.getItemId() == R.id.menu_tg) {
                intent = new Intent(Deobfuscator$MHRTUNNELVPN$app.getString(-18235783345082L), Uri.parse(Deobfuscator$MHRTUNNELVPN$app.getString(-18351747462074L)));
            } else if (menuItem.getItemId() == R.id.menu_tweak) {
                openVPNClient.getClass();
                C3249q1 c3249q1 = new C3249q1(openVPNClient, R.style.MyDialogTheme);
                String string = Deobfuscator$MHRTUNNELVPN$app.getString(-53085147984826L);
                C3084n1 c3084n1 = (C3084n1) c3249q1.c;
                c3084n1.e = string;
                c3084n1.g = Deobfuscator$MHRTUNNELVPN$app.getString(-53110917788602L) + openVPNClient.O0 + Deobfuscator$MHRTUNNELVPN$app.getString(-53239766807482L);
                c3249q1.f(Deobfuscator$MHRTUNNELVPN$app.getString(-53540414518202L), new DialogInterfaceOnClickListenerC3568vx(0));
                String string2 = Deobfuscator$MHRTUNNELVPN$app.getString(-53570479289274L);
                DialogInterfaceOnClickListenerC3568vx dialogInterfaceOnClickListenerC3568vx = new DialogInterfaceOnClickListenerC3568vx(1);
                c3084n1.l = string2;
                c3084n1.m = dialogInterfaceOnClickListenerC3568vx;
                c3249q1.h(Deobfuscator$MHRTUNNELVPN$app.getString(-53600544060346L), null);
                final DialogInterfaceC3303r1 dialogInterfaceC3303r1A = c3249q1.a();
                dialogInterfaceC3303r1A.setOnShowListener(new DialogInterface.OnShowListener() { // from class: wx
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        String str = OpenVPNClient.Y0;
                        OpenVPNClient openVPNClient2 = openVPNClient;
                        openVPNClient2.getClass();
                        DialogInterfaceC3303r1 dialogInterfaceC3303r1 = dialogInterfaceC3303r1A;
                        Button buttonD = dialogInterfaceC3303r1.d(-1);
                        Button buttonD2 = dialogInterfaceC3303r1.d(-3);
                        buttonD.setOnClickListener(new ViewOnClickListenerC3676xx(0, openVPNClient2, dialogInterfaceC3303r1));
                        buttonD2.setOnClickListener(new ViewOnClickListenerC3676xx(1, openVPNClient2, dialogInterfaceC3303r1));
                    }
                });
                dialogInterfaceC3303r1A.show();
            } else if (menuItem.getItemId() == R.id.menu_tether) {
                intent = new Intent(openVPNClient.getApplicationContext(), (Class<?>) VPNTetherActivity.class);
            } else if (menuItem.getItemId() == R.id.menu_proxy) {
                intent = new Intent(openVPNClient.getApplicationContext(), (Class<?>) AppListActivity.class);
            } else if (menuItem.getItemId() == R.id.menu_hunter) {
                intent = new Intent(openVPNClient.getApplicationContext(), (Class<?>) IPHunterActivity.class);
            } else if (menuItem.getItemId() == R.id.menu_hwid) {
                String str = OpenVPNClient.Y0;
                openVPNClient.getClass();
                C3249q1 c3249q12 = new C3249q1(openVPNClient, R.style.MyDialogTheme);
                String string3 = Deobfuscator$MHRTUNNELVPN$app.getString(-56207589209018L);
                C3084n1 c3084n12 = (C3084n1) c3249q12.c;
                c3084n12.e = string3;
                c3084n12.g = OpenVPNClient.F();
                c3084n12.n = true;
                c3249q12.h(Deobfuscator$MHRTUNNELVPN$app.getString(-56229064045498L), new Ix(openVPNClient, 6));
                c3249q12.f(Deobfuscator$MHRTUNNELVPN$app.getString(-56250538881978L), null);
                c3249q12.i();
            } else if (menuItem.getItemId() == R.id.menu_exit) {
                String str2 = OpenVPNClient.Y0;
                openVPNClient.getClass();
                C3249q1 c3249q13 = new C3249q1(openVPNClient, R.style.MyDialogTheme);
                C3084n1 c3084n13 = (C3084n1) c3249q13.c;
                c3084n13.n = true;
                c3084n13.g = Deobfuscator$MHRTUNNELVPN$app.getString(-34015493190586L);
                c3249q13.h(Deobfuscator$MHRTUNNELVPN$app.getString(-34157227111354L), new Ix(openVPNClient, 1));
                c3249q13.f(Deobfuscator$MHRTUNNELVPN$app.getString(-34178701947834L), new DialogInterfaceOnClickListenerC0603ck(3));
                String string4 = Deobfuscator$MHRTUNNELVPN$app.getString(-34208766718906L);
                Ix ix = new Ix(openVPNClient, 2);
                c3084n13.l = string4;
                c3084n13.m = ix;
                c3249q13.i();
            }
            openVPNClient.startActivity(intent);
        }
        return true;
    }
}
