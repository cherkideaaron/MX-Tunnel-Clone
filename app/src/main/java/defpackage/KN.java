package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF12' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public class KN {
    public static final GN c;
    public static final HN d;
    public static final IN e;
    public static final /* synthetic */ KN[] f;
    public final LN a;
    public final int b;

    /* JADX INFO: Fake field, exist only in values array */
    KN EF10;

    /* JADX INFO: Fake field, exist only in values array */
    KN EF11;

    /* JADX INFO: Fake field, exist only in values array */
    KN EF12;

    static {
        KN kn = new KN("DOUBLE", 0, LN.DOUBLE, 1);
        KN kn2 = new KN("FLOAT", 1, LN.FLOAT, 5);
        LN ln = LN.LONG;
        KN kn3 = new KN("INT64", 2, ln, 0);
        KN kn4 = new KN("UINT64", 3, ln, 0);
        LN ln2 = LN.INT;
        KN kn5 = new KN("INT32", 4, ln2, 0);
        KN kn6 = new KN("FIXED64", 5, ln, 1);
        KN kn7 = new KN("FIXED32", 6, ln2, 5);
        KN kn8 = new KN("BOOL", 7, LN.BOOLEAN, 0);
        GN gn = new GN("STRING", 8, LN.STRING, 2);
        c = gn;
        LN ln3 = LN.MESSAGE;
        HN hn = new HN("GROUP", 9, ln3, 3);
        d = hn;
        IN in = new IN("MESSAGE", 10, ln3, 2);
        e = in;
        f = new KN[]{kn, kn2, kn3, kn4, kn5, kn6, kn7, kn8, gn, hn, in, new JN("BYTES", 11, LN.BYTE_STRING, 2), new KN("UINT32", 12, ln2, 0), new KN("ENUM", 13, LN.ENUM, 0), new KN("SFIXED32", 14, ln2, 5), new KN("SFIXED64", 15, ln, 1), new KN("SINT32", 16, ln2, 0), new KN("SINT64", 17, ln, 0)};
    }

    public KN(String str, int i, LN ln, int i2) {
        this.a = ln;
        this.b = i2;
    }

    public static KN valueOf(String str) {
        return (KN) Enum.valueOf(KN.class, str);
    }

    public static KN[] values() {
        return (KN[]) f.clone();
    }
}
