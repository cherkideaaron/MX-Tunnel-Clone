package defpackage;

/* renamed from: a4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0460a4 {
    public static final int a;

    static {
        Object objN;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            AbstractC0500aq.l(property, "getProperty(...)");
            objN = BH.V(property);
        } catch (Throwable th) {
            objN = AbstractC0115Ga.n(th);
        }
        if (objN instanceof HC) {
            objN = null;
        }
        Integer num = (Integer) objN;
        a = num != null ? num.intValue() : 2097152;
    }
}
