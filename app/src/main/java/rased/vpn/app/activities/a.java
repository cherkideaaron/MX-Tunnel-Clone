package rased.vpn.app.activities;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.widget.Toast;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.mxtunnel.pro.R;
import defpackage.AbstractActivityC2592e2;
import defpackage.AbstractC0309Rh;
import defpackage.AbstractC3279qd;
import defpackage.C3084n1;
import defpackage.C3249q1;
import defpackage.C3300qy;
import defpackage.C3461ty;
import defpackage.DialogInterfaceOnClickListenerC0418Xo;
import defpackage.InterfaceC3353ry;
import defpackage.InterfaceC3722yp;
import defpackage.RunnableC3680y0;
import defpackage.ServiceConnectionC2697fy;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import org.json.JSONArray;
import org.json.JSONObject;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.service.InjectorService;
import rased.vpn.app.service.OpenVPNService;

/* loaded from: classes2.dex */
public abstract class a extends AbstractActivityC2592e2 implements InterfaceC3722yp, InterfaceC3353ry {
    public static final /* synthetic */ int f = 0;
    public InjectorService d;
    public OpenVPNService b = null;
    public final ServiceConnectionC2697fy c = new ServiceConnectionC2697fy(this, 0);
    public final ServiceConnectionC2697fy e = new ServiceConnectionC2697fy(this, 1);

    static {
        Deobfuscator$MHRTUNNELVPN$app.getString(-67280014898106L);
    }

    public PendingIntent c(int i) {
        return null;
    }

    public void f() {
    }

    public final void k() {
        Log.d(Deobfuscator$MHRTUNNELVPN$app.getString(-60030110102458L), Deobfuscator$MHRTUNNELVPN$app.getString(-60107419513786L));
        OpenVPNService openVPNService = this.b;
        if (openVPNService != null) {
            ArrayDeque arrayDeque = openVPNService.b;
            arrayDeque.remove(this);
            Log.d(Deobfuscator$MHRTUNNELVPN$app.getString(-96155080029114L), String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-96219504538554L), Integer.valueOf(arrayDeque.size())));
            unbindService(this.c);
            this.b = null;
        }
    }

    public final void l(boolean z) {
        OpenVPNService openVPNService = this.b;
        if (openVPNService != null) {
            openVPNService.f(z ? 16 : 0, Deobfuscator$MHRTUNNELVPN$app.getString(-96932469109690L), null, null, this);
        }
    }

    public final JSONObject m() {
        String strC;
        String strC2;
        File file = new File(getFilesDir().getAbsolutePath() + Deobfuscator$MHRTUNNELVPN$app.getString(-59690807686074L));
        try {
            if (!file.exists()) {
                try {
                    strC = AbstractC0309Rh.c(AbstractC3279qd.Y(getApplicationContext(), Deobfuscator$MHRTUNNELVPN$app.getString(-59750937228218L)), AbstractC0309Rh.a);
                } catch (Exception unused) {
                    strC = null;
                }
                return new JSONObject(strC);
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            StringBuilder sb = new StringBuilder();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                char[] cArr = new char[UserVerificationMethods.USER_VERIFY_ALL];
                while (true) {
                    int i = bufferedReader.read(cArr, 0, UserVerificationMethods.USER_VERIFY_ALL);
                    if (i <= 0) {
                        break;
                    }
                    sb.append(cArr, 0, i);
                }
            } catch (Exception unused2) {
            }
            try {
                strC2 = AbstractC0309Rh.c(sb.toString(), AbstractC0309Rh.a);
            } catch (Exception unused3) {
                strC2 = null;
            }
            return new JSONObject(strC2);
        } catch (Exception e) {
            t(Deobfuscator$MHRTUNNELVPN$app.getString(-59806771803066L) + e.getMessage());
            return null;
        }
    }

    public final JSONArray n() {
        try {
            return m().getJSONArray(Deobfuscator$MHRTUNNELVPN$app.getString(-59836836574138L));
        } catch (Exception unused) {
            return null;
        }
    }

    public final boolean o() {
        OpenVPNService openVPNService = this.b;
        return openVPNService != null && openVPNService.a;
    }

    @Override // androidx.fragment.app.q, defpackage.AbstractActivityC2619eb, defpackage.AbstractActivityC2565db, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public final void p(String str, String str2, RunnableC3680y0 runnableC3680y0) {
        C3249q1 c3249q1 = new C3249q1(this);
        C3084n1 c3084n1 = (C3084n1) c3249q1.c;
        c3084n1.g = str2;
        c3249q1.g(R.string.ok, new DialogInterfaceOnClickListenerC0418Xo(runnableC3680y0, 2));
        if (str != null) {
            c3084n1.e = str;
        }
        c3249q1.i();
    }

    public void q() {
    }

    public final void r(int i, int i2) {
        startActivityForResult(new Intent(this, (Class<?>) FileDialog.class).putExtra(Deobfuscator$MHRTUNNELVPN$app.getString(-64827588572090L), Environment.getExternalStorageDirectory().getAbsolutePath()).putExtra(Deobfuscator$MHRTUNNELVPN$app.getString(-64874833212346L), false).putExtra(Deobfuscator$MHRTUNNELVPN$app.getString(-64939257721786L), 1).putExtra(Deobfuscator$MHRTUNNELVPN$app.getString(-65003682231226L), false).putExtra(Deobfuscator$MHRTUNNELVPN$app.getString(-65106761446330L), s(i2)), i);
    }

    public final String s(int i) {
        return getResources().getString(i);
    }

    public void t(String str) {
        Toast.makeText(this, str, 1).show();
    }

    public final void u(boolean z) {
        Log.d(Deobfuscator$MHRTUNNELVPN$app.getString(-62658630087610L), Deobfuscator$MHRTUNNELVPN$app.getString(-62735939498938L));
        startService(new Intent(this, (Class<?>) OpenVPNService.class).setAction(Deobfuscator$MHRTUNNELVPN$app.getString(-62435291788218L)).putExtra(Deobfuscator$MHRTUNNELVPN$app.getString(-62559845839802L), z));
    }

    public void a(C3461ty c3461ty) {
    }

    public void b(C3300qy c3300qy) {
    }
}
