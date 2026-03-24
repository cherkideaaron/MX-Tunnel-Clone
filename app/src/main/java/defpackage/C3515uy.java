package defpackage;

import android.os.SystemClock;
import android.util.Log;
import com.mxtunnel.pro.R;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import net.openvpn.ovpn3.ClientAPI_EvalConfig;
import net.openvpn.ovpn3.ClientAPI_ServerEntry;
import net.openvpn.ovpn3.ClientAPI_ServerEntryVector;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.service.OpenVPNService;

/* renamed from: uy, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3515uy {
    public final boolean a;
    public final boolean b;
    public C3135ny c;
    public final boolean d;
    public String e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public C3623wy j;
    public final C2524cp k;
    public final C3025ly l;
    public final String m;
    public final /* synthetic */ OpenVPNService n;

    public C3515uy(OpenVPNService openVPNService, String str, String str2, boolean z, ClientAPI_EvalConfig clientAPI_EvalConfig) {
        this.n = openVPNService;
        this.f = str;
        this.h = str2;
        if (z) {
            this.g = str2;
            if (AbstractC0136He.w(str2)) {
                this.g = (str2 == null || !AbstractC0136He.w(str2)) ? str2 : str2.substring(0, str2.length() - 5);
            }
            try {
                this.g = URLDecoder.decode(this.g, Deobfuscator$MHRTUNNELVPN$app.getString(-73357393621946L));
            } catch (UnsupportedEncodingException e) {
                Log.e(Deobfuscator$MHRTUNNELVPN$app.getString(-73383163425722L), Deobfuscator$MHRTUNNELVPN$app.getString(-73447587935162L), e);
            }
        } else {
            this.g = str2;
        }
        if (clientAPI_EvalConfig.getError()) {
            clientAPI_EvalConfig.getMessage();
            return;
        }
        this.m = clientAPI_EvalConfig.getUserlockedUsername();
        boolean autologin = clientAPI_EvalConfig.getAutologin();
        this.b = autologin;
        this.d = clientAPI_EvalConfig.getExternalPki();
        this.i = clientAPI_EvalConfig.getPrivateKeyPasswordRequired();
        this.a = clientAPI_EvalConfig.getAllowPasswordSave();
        String staticChallenge = clientAPI_EvalConfig.getStaticChallenge();
        boolean z2 = true;
        if (staticChallenge.length() > 0) {
            C3025ly c3025ly = new C3025ly();
            c3025ly.a = staticChallenge;
            c3025ly.b = clientAPI_EvalConfig.getStaticChallengeEcho();
            c3025ly.c = true;
            this.l = c3025ly;
        }
        if (!z) {
            String profileName = clientAPI_EvalConfig.getProfileName();
            String friendlyName = clientAPI_EvalConfig.getFriendlyName();
            String str3 = this.f;
            if (str3 != null) {
                str3.equals(Deobfuscator$MHRTUNNELVPN$app.getString(-73705285972922L));
            }
            if (friendlyName.length() > 0) {
                profileName = friendlyName;
            } else {
                z2 = false;
            }
            if (str2 != null && str2.equalsIgnoreCase(Deobfuscator$MHRTUNNELVPN$app.getString(-73743940678586L))) {
                str2 = null;
            }
            if (AbstractC0136He.w(str2) && str2 != null && AbstractC0136He.w(str2)) {
                str2 = str2.substring(0, str2.length() - 5);
            }
            String str4 = (str2 == null || profileName == null || !str2.equals(profileName)) ? str2 : null;
            StringBuffer stringBuffer = new StringBuffer();
            if (autologin && !z2 && str4 == null) {
                stringBuffer.append(openVPNService.getText(R.string.autologin_suffix).toString());
            }
            if (str4 != null) {
                stringBuffer.append(str4);
            }
            this.g = stringBuffer.toString();
        }
        C2524cp c2524cp = new C2524cp(20, false);
        c2524cp.b = new ArrayList();
        this.k = c2524cp;
        ClientAPI_ServerEntryVector serverList = clientAPI_EvalConfig.getServerList();
        int size = serverList.size();
        for (int i = 0; i < size; i++) {
            ClientAPI_ServerEntry clientAPI_ServerEntry = serverList.get(i);
            C3677xy c3677xy = new C3677xy();
            c3677xy.b = clientAPI_ServerEntry.getServer();
            c3677xy.a = clientAPI_ServerEntry.getFriendlyName();
            ((ArrayList) this.k.b).add(c3677xy);
        }
        this.e = openVPNService.t.w(this.g, Deobfuscator$MHRTUNNELVPN$app.getString(-73795480286138L));
    }

    public final void a() {
        C3135ny c3135ny = this.c;
        if (c3135ny != null) {
            c3135ny.getClass();
            if (SystemClock.elapsedRealtime() > c3135ny.c) {
                this.c = null;
            }
        }
    }

    public final String b() {
        String strO;
        String str = this.h;
        String str2 = this.f;
        return ((str2 == null || !str2.equals(Deobfuscator$MHRTUNNELVPN$app.getString(-73842724926394L))) && (strO = AbstractC0136He.o(this.g)) != null) ? strO : str;
    }

    public final C3623wy c(boolean z) {
        C3623wy c3623wy = this.j;
        if (c3623wy != null && (c3623wy.a == 0 || SystemClock.elapsedRealtime() <= c3623wy.a)) {
            return this.j;
        }
        this.j = z ? new C3623wy() : null;
        return this.j;
    }

    public final String toString() {
        String string = Deobfuscator$MHRTUNNELVPN$app.getString(-74053178323898L);
        Boolean boolValueOf = Boolean.valueOf(this.b);
        Boolean boolValueOf2 = Boolean.valueOf(this.d);
        String str = this.e;
        String string2 = this.k.toString();
        C3025ly c3025ly = this.l;
        String string3 = c3025ly != null ? c3025ly.toString() : Deobfuscator$MHRTUNNELVPN$app.getString(-74379595838394L);
        C3135ny c3135ny = this.c;
        return String.format(string, this.g, this.h, this.m, boolValueOf, boolValueOf2, str, string2, string3, c3135ny != null ? c3135ny.toString() : Deobfuscator$MHRTUNNELVPN$app.getString(-74401070674874L));
    }
}
