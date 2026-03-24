package defpackage;

/* renamed from: Kf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0188Kf {
    public static final InterfaceC3227pg a;

    static {
        String property;
        C3125no c3125no;
        int i = AbstractC3101nI.a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            C0545bg c0545bg = AbstractC0600ch.a;
            C3125no c3125no2 = AbstractC3564vt.a;
            C3125no c3125no3 = c3125no2.f;
            c3125no = !(c3125no2 instanceof InterfaceC3227pg) ? RunnableC0171Jf.p : c3125no2;
        } else {
            c3125no = RunnableC0171Jf.p;
        }
        a = c3125no;
    }
}
