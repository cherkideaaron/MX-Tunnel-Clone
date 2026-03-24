package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class Et {
    public static int a(int i, Object obj, Object obj2) {
        Dt dt = (Dt) obj;
        Ct ct = (Ct) obj2;
        int iY0 = 0;
        if (!dt.isEmpty()) {
            for (Map.Entry entry : dt.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                ct.getClass();
                int iW0 = C3221pa.w0(i);
                int iA = Ct.a(ct.a, key, value);
                iY0 += C3221pa.y0(iA) + iA + iW0;
            }
        }
        return iY0;
    }

    public static Dt b(Object obj, Object obj2) {
        Dt dtC = (Dt) obj;
        Dt dt = (Dt) obj2;
        if (!dt.isEmpty()) {
            if (!dtC.a) {
                dtC = dtC.c();
            }
            dtC.b();
            if (!dt.isEmpty()) {
                dtC.putAll(dt);
            }
        }
        return dtC;
    }

    public static void c(Object obj) {
        ((Dt) obj).a = false;
    }
}
