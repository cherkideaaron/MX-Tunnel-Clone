package defpackage;

import java.util.Collections;

/* renamed from: uj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3500uj {
    public static volatile C3500uj a;
    public static final C3500uj b;

    static {
        C3500uj c3500uj = new C3500uj();
        Collections.emptyMap();
        b = c3500uj;
    }

    public static C3500uj a() {
        C2928kA c2928kA = C2928kA.c;
        C3500uj c3500uj = a;
        if (c3500uj == null) {
            synchronized (C3500uj.class) {
                try {
                    c3500uj = a;
                    if (c3500uj == null) {
                        Class cls = AbstractC3446tj.a;
                        C3500uj c3500uj2 = null;
                        if (cls != null) {
                            try {
                                c3500uj2 = (C3500uj) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (c3500uj2 == null) {
                            c3500uj2 = b;
                        }
                        a = c3500uj2;
                        c3500uj = c3500uj2;
                    }
                } finally {
                }
            }
        }
        return c3500uj;
    }
}
