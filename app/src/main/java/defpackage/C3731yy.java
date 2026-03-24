package defpackage;

import android.net.VpnService;
import android.util.Log;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.service.OpenVPNService;

/* renamed from: yy, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3731yy extends VpnService.Builder {
    public final /* synthetic */ OpenVPNService a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3731yy(OpenVPNService openVPNService) {
        super(openVPNService);
        this.a = openVPNService;
    }

    public static void a(String str, Exception exc) {
        Log.d(Deobfuscator$MHRTUNNELVPN$app.getString(-79954463388602L), String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-80018887898042L), str, exc.toString()));
    }
}
