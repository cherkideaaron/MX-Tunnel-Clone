package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class OE {
    public static final OE a;
    public static final OE b;
    public static final /* synthetic */ OE[] c;

    static {
        OE oe = new OE("CRASHLYTICS", 0);
        a = oe;
        OE oe2 = new OE("PERFORMANCE", 1);
        b = oe2;
        OE[] oeArr = {oe, oe2, new OE("MATT_SAYS_HI", 2)};
        c = oeArr;
        AbstractC2883jK.t(oeArr);
    }

    public static OE valueOf(String str) {
        return (OE) Enum.valueOf(OE.class, str);
    }

    public static OE[] values() {
        return (OE[]) c.clone();
    }
}
