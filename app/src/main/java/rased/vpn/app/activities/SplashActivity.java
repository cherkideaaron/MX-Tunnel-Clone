package rased.vpn.app.activities;

import android.os.Bundle;
import android.widget.TextView;
import com.mxtunnel.pro.R;
import defpackage.AbstractActivityC2592e2;
import defpackage.AbstractC3162oO;
import defpackage.AbstractC3264qG;
import defpackage.C3178om;
import defpackage.C3373sH;
import defpackage.C3492ub;
import defpackage.C3588wG;
import defpackage.Ux;
import java.util.Locale;
import java.util.Random;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.utils.PUtils;

/* loaded from: classes2.dex */
public class SplashActivity extends AbstractActivityC2592e2 {
    public C3492ub b;
    public TextView c;

    @Override // androidx.fragment.app.q, defpackage.AbstractActivityC2619eb, defpackage.AbstractActivityC2565db, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.splash);
        this.b = C3492ub.c(getApplicationContext());
        this.c = (TextView) findViewById(R.id.first_time_use);
        C3492ub c3492ub = this.b;
        c3492ub.getClass();
        if (c3492ub.a.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-166897486361530L), Deobfuscator$MHRTUNNELVPN$app.getString(-166936141067194L)).isEmpty()) {
            C3492ub c3492ub2 = this.b;
            c3492ub2.getClass();
            if (c3492ub2.a.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-166940436034490L), Deobfuscator$MHRTUNNELVPN$app.getString(-166979090740154L)).isEmpty()) {
                Random random = new Random();
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < 15; i++) {
                    sb.append("abcdefghijklmnopqrstuvwxyz0123456789".charAt(random.nextInt(36)));
                }
                Locale locale = Locale.ENGLISH;
                StringBuilder sb2 = new StringBuilder();
                sb2.append((Object) sb);
                String string = sb2.toString();
                AbstractC3162oO.f(this).a(new C3373sH(AbstractC3264qG.w("https://rasedpanel.xyz/api/douser.php?deviceid=", PUtils.pEncrypt(getApplicationContext(), string)), new C3178om(this, string, 13, false), new C3588wG(this)));
                this.c.setVisibility(0);
                return;
            }
        }
        new Ux(this, 3000L).start();
        this.c.setVisibility(8);
    }
}
