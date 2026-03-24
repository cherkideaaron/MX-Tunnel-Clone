package defpackage;

/* loaded from: classes.dex */
public final class Fr {
    public static Hr a(Ir ir) {
        AbstractC0500aq.m(ir, "state");
        int iOrdinal = ir.ordinal();
        if (iOrdinal == 2) {
            return Hr.ON_DESTROY;
        }
        if (iOrdinal == 3) {
            return Hr.ON_STOP;
        }
        if (iOrdinal != 4) {
            return null;
        }
        return Hr.ON_PAUSE;
    }

    public static Hr b(Ir ir) {
        AbstractC0500aq.m(ir, "state");
        int iOrdinal = ir.ordinal();
        if (iOrdinal == 1) {
            return Hr.ON_CREATE;
        }
        if (iOrdinal == 2) {
            return Hr.ON_START;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return Hr.ON_RESUME;
    }
}
