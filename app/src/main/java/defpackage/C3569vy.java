package defpackage;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import net.openvpn.ovpn3.ClientAPI_Config;
import net.openvpn.ovpn3.ClientAPI_EvalConfig;
import net.openvpn.ovpn3.ClientAPI_OpenVPNClient;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.service.OpenVPNService;

/* renamed from: vy, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3569vy extends ArrayList {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ OpenVPNService a;

    public C3569vy(OpenVPNService openVPNService) {
        this.a = openVPNService;
    }

    public static void a(C3569vy c3569vy, String str) {
        String string;
        String[] strArrFileList;
        boolean z;
        String strF0;
        int i;
        int i2 = 2;
        boolean zEquals = str.equals(Deobfuscator$MHRTUNNELVPN$app.getString(-74847747273658L));
        OpenVPNService openVPNService = c3569vy.a;
        if (zEquals) {
            string = Deobfuscator$MHRTUNNELVPN$app.getString(-74882107012026L);
            strArrFileList = openVPNService.getResources().getAssets().list(Deobfuscator$MHRTUNNELVPN$app.getString(-74912171783098L));
            z = false;
        } else {
            if (!str.equals(Deobfuscator$MHRTUNNELVPN$app.getString(-74916466750394L))) {
                throw new C0234Na();
            }
            string = Deobfuscator$MHRTUNNELVPN$app.getString(-74955121456058L);
            strArrFileList = openVPNService.fileList();
            z = true;
        }
        int length = strArrFileList.length;
        int i3 = 0;
        while (i3 < length) {
            String str2 = strArrFileList[i3];
            if (AbstractC0136He.w(str2)) {
                try {
                    openVPNService.getClass();
                    if (str.equals(Deobfuscator$MHRTUNNELVPN$app.getString(-101893156336570L))) {
                        strF0 = AbstractC3279qd.Y(openVPNService, str2);
                    } else {
                        if (!str.equals(Deobfuscator$MHRTUNNELVPN$app.getString(-101927516074938L))) {
                            throw new C0234Na();
                        }
                        strF0 = AbstractC3279qd.f0(openVPNService.openFileInput(str2), str2);
                    }
                } catch (IOException unused) {
                    String string2 = Deobfuscator$MHRTUNNELVPN$app.getString(-75041020801978L);
                    Object[] objArr = new Object[i2];
                    objArr[0] = str2;
                    objArr[1] = string;
                    Log.i(string2, String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-75105445311418L), objArr));
                    strF0 = null;
                }
                try {
                    ClientAPI_Config clientAPI_Config = new ClientAPI_Config();
                    clientAPI_Config.setContent(strF0);
                    ClientAPI_EvalConfig clientAPI_EvalConfigEval_config_static = ClientAPI_OpenVPNClient.eval_config_static(clientAPI_Config);
                    if (clientAPI_EvalConfigEval_config_static.getError()) {
                        String string3 = Deobfuscator$MHRTUNNELVPN$app.getString(-75251474199482L);
                        String message = clientAPI_EvalConfigEval_config_static.getMessage();
                        Object[] objArr2 = new Object[i2];
                        objArr2[0] = str2;
                        objArr2[1] = message;
                        Log.i(string3, String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-75315898708922L), objArr2));
                        i = i3;
                    } else {
                        i = i3;
                        c3569vy.add(new C3515uy(c3569vy.a, str, str2, z, clientAPI_EvalConfigEval_config_static));
                    }
                } catch (Exception e) {
                    Log.e(Deobfuscator$MHRTUNNELVPN$app.getString(-75457632629690L), Deobfuscator$MHRTUNNELVPN$app.getString(-75522057139130L), e);
                    return;
                }
            } else {
                i = i3;
            }
            i3 = i + 1;
            i2 = 2;
        }
    }

    public final C3515uy b(String str) {
        if (str == null) {
            return null;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            C3515uy c3515uy = (C3515uy) it.next();
            if (str.equals(c3515uy.g)) {
                return c3515uy;
            }
        }
        return null;
    }
}
