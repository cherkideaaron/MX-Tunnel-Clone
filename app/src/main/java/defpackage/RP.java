package defpackage;

import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.p002firebaseauthapi.zzaao;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class RP {
    public static final Logger a = new Logger("GetTokenResultFactory", new String[0]);

    public static C2827iH a(String str) {
        Object map;
        try {
            map = QP.c(str);
        } catch (zzaao e) {
            a.e("Error parsing token claims", e, new Object[0]);
            map = new HashMap();
        }
        C2827iH c2827iH = new C2827iH(17, (byte) 0);
        c2827iH.b = map;
        return c2827iH;
    }
}
