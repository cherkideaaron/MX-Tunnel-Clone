package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF6' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: ak, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0494ak {
    public static final EnumC0494ak b;
    public static final EnumC0494ak c;
    public static final EnumC0494ak[] d;
    public static final /* synthetic */ EnumC0494ak[] e;
    public final int a;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0494ak EF6;

    static {
        EnumC3777zq enumC3777zq = EnumC3777zq.DOUBLE;
        EnumC0494ak enumC0494ak = new EnumC0494ak("DOUBLE", 0, 0, 1, enumC3777zq);
        EnumC3777zq enumC3777zq2 = EnumC3777zq.FLOAT;
        EnumC0494ak enumC0494ak2 = new EnumC0494ak("FLOAT", 1, 1, 1, enumC3777zq2);
        EnumC3777zq enumC3777zq3 = EnumC3777zq.LONG;
        EnumC0494ak enumC0494ak3 = new EnumC0494ak("INT64", 2, 2, 1, enumC3777zq3);
        EnumC0494ak enumC0494ak4 = new EnumC0494ak("UINT64", 3, 3, 1, enumC3777zq3);
        EnumC3777zq enumC3777zq4 = EnumC3777zq.INT;
        EnumC0494ak enumC0494ak5 = new EnumC0494ak("INT32", 4, 4, 1, enumC3777zq4);
        EnumC0494ak enumC0494ak6 = new EnumC0494ak("FIXED64", 5, 5, 1, enumC3777zq3);
        EnumC0494ak enumC0494ak7 = new EnumC0494ak("FIXED32", 6, 6, 1, enumC3777zq4);
        EnumC3777zq enumC3777zq5 = EnumC3777zq.BOOLEAN;
        EnumC0494ak enumC0494ak8 = new EnumC0494ak("BOOL", 7, 7, 1, enumC3777zq5);
        EnumC3777zq enumC3777zq6 = EnumC3777zq.STRING;
        EnumC0494ak enumC0494ak9 = new EnumC0494ak("STRING", 8, 8, 1, enumC3777zq6);
        EnumC3777zq enumC3777zq7 = EnumC3777zq.MESSAGE;
        EnumC0494ak enumC0494ak10 = new EnumC0494ak("MESSAGE", 9, 9, 1, enumC3777zq7);
        EnumC3777zq enumC3777zq8 = EnumC3777zq.BYTE_STRING;
        EnumC0494ak enumC0494ak11 = new EnumC0494ak("BYTES", 10, 10, 1, enumC3777zq8);
        EnumC0494ak enumC0494ak12 = new EnumC0494ak("UINT32", 11, 11, 1, enumC3777zq4);
        EnumC3777zq enumC3777zq9 = EnumC3777zq.ENUM;
        EnumC0494ak enumC0494ak13 = new EnumC0494ak("ENUM", 12, 12, 1, enumC3777zq9);
        EnumC0494ak enumC0494ak14 = new EnumC0494ak("SFIXED32", 13, 13, 1, enumC3777zq4);
        EnumC0494ak enumC0494ak15 = new EnumC0494ak("SFIXED64", 14, 14, 1, enumC3777zq3);
        EnumC0494ak enumC0494ak16 = new EnumC0494ak("SINT32", 15, 15, 1, enumC3777zq4);
        EnumC0494ak enumC0494ak17 = new EnumC0494ak("SINT64", 16, 16, 1, enumC3777zq3);
        EnumC0494ak enumC0494ak18 = new EnumC0494ak("GROUP", 17, 17, 1, enumC3777zq7);
        EnumC0494ak enumC0494ak19 = new EnumC0494ak("DOUBLE_LIST", 18, 18, 2, enumC3777zq);
        EnumC0494ak enumC0494ak20 = new EnumC0494ak("FLOAT_LIST", 19, 19, 2, enumC3777zq2);
        EnumC0494ak enumC0494ak21 = new EnumC0494ak("INT64_LIST", 20, 20, 2, enumC3777zq3);
        EnumC0494ak enumC0494ak22 = new EnumC0494ak("UINT64_LIST", 21, 21, 2, enumC3777zq3);
        EnumC0494ak enumC0494ak23 = new EnumC0494ak("INT32_LIST", 22, 22, 2, enumC3777zq4);
        EnumC0494ak enumC0494ak24 = new EnumC0494ak("FIXED64_LIST", 23, 23, 2, enumC3777zq3);
        EnumC0494ak enumC0494ak25 = new EnumC0494ak("FIXED32_LIST", 24, 24, 2, enumC3777zq4);
        EnumC0494ak enumC0494ak26 = new EnumC0494ak("BOOL_LIST", 25, 25, 2, enumC3777zq5);
        EnumC0494ak enumC0494ak27 = new EnumC0494ak("STRING_LIST", 26, 26, 2, enumC3777zq6);
        EnumC0494ak enumC0494ak28 = new EnumC0494ak("MESSAGE_LIST", 27, 27, 2, enumC3777zq7);
        EnumC0494ak enumC0494ak29 = new EnumC0494ak("BYTES_LIST", 28, 28, 2, enumC3777zq8);
        EnumC0494ak enumC0494ak30 = new EnumC0494ak("UINT32_LIST", 29, 29, 2, enumC3777zq4);
        EnumC0494ak enumC0494ak31 = new EnumC0494ak("ENUM_LIST", 30, 30, 2, enumC3777zq9);
        EnumC0494ak enumC0494ak32 = new EnumC0494ak("SFIXED32_LIST", 31, 31, 2, enumC3777zq4);
        EnumC0494ak enumC0494ak33 = new EnumC0494ak("SFIXED64_LIST", 32, 32, 2, enumC3777zq3);
        EnumC0494ak enumC0494ak34 = new EnumC0494ak("SINT32_LIST", 33, 33, 2, enumC3777zq4);
        EnumC0494ak enumC0494ak35 = new EnumC0494ak("SINT64_LIST", 34, 34, 2, enumC3777zq3);
        EnumC0494ak enumC0494ak36 = new EnumC0494ak("DOUBLE_LIST_PACKED", 35, 35, 3, enumC3777zq);
        b = enumC0494ak36;
        EnumC0494ak enumC0494ak37 = new EnumC0494ak("FLOAT_LIST_PACKED", 36, 36, 3, enumC3777zq2);
        EnumC0494ak enumC0494ak38 = new EnumC0494ak("INT64_LIST_PACKED", 37, 37, 3, enumC3777zq3);
        EnumC0494ak enumC0494ak39 = new EnumC0494ak("UINT64_LIST_PACKED", 38, 38, 3, enumC3777zq3);
        EnumC0494ak enumC0494ak40 = new EnumC0494ak("INT32_LIST_PACKED", 39, 39, 3, enumC3777zq4);
        EnumC0494ak enumC0494ak41 = new EnumC0494ak("FIXED64_LIST_PACKED", 40, 40, 3, enumC3777zq3);
        EnumC0494ak enumC0494ak42 = new EnumC0494ak("FIXED32_LIST_PACKED", 41, 41, 3, enumC3777zq4);
        EnumC0494ak enumC0494ak43 = new EnumC0494ak("BOOL_LIST_PACKED", 42, 42, 3, enumC3777zq5);
        EnumC0494ak enumC0494ak44 = new EnumC0494ak("UINT32_LIST_PACKED", 43, 43, 3, enumC3777zq4);
        EnumC0494ak enumC0494ak45 = new EnumC0494ak("ENUM_LIST_PACKED", 44, 44, 3, enumC3777zq9);
        EnumC0494ak enumC0494ak46 = new EnumC0494ak("SFIXED32_LIST_PACKED", 45, 45, 3, enumC3777zq4);
        EnumC0494ak enumC0494ak47 = new EnumC0494ak("SFIXED64_LIST_PACKED", 46, 46, 3, enumC3777zq3);
        EnumC0494ak enumC0494ak48 = new EnumC0494ak("SINT32_LIST_PACKED", 47, 47, 3, enumC3777zq4);
        EnumC0494ak enumC0494ak49 = new EnumC0494ak("SINT64_LIST_PACKED", 48, 48, 3, enumC3777zq3);
        c = enumC0494ak49;
        e = new EnumC0494ak[]{enumC0494ak, enumC0494ak2, enumC0494ak3, enumC0494ak4, enumC0494ak5, enumC0494ak6, enumC0494ak7, enumC0494ak8, enumC0494ak9, enumC0494ak10, enumC0494ak11, enumC0494ak12, enumC0494ak13, enumC0494ak14, enumC0494ak15, enumC0494ak16, enumC0494ak17, enumC0494ak18, enumC0494ak19, enumC0494ak20, enumC0494ak21, enumC0494ak22, enumC0494ak23, enumC0494ak24, enumC0494ak25, enumC0494ak26, enumC0494ak27, enumC0494ak28, enumC0494ak29, enumC0494ak30, enumC0494ak31, enumC0494ak32, enumC0494ak33, enumC0494ak34, enumC0494ak35, enumC0494ak36, enumC0494ak37, enumC0494ak38, enumC0494ak39, enumC0494ak40, enumC0494ak41, enumC0494ak42, enumC0494ak43, enumC0494ak44, enumC0494ak45, enumC0494ak46, enumC0494ak47, enumC0494ak48, enumC0494ak49, new EnumC0494ak("GROUP_LIST", 49, 49, 2, enumC3777zq7), new EnumC0494ak("MAP", 50, 50, 4, EnumC3777zq.VOID)};
        EnumC0494ak[] enumC0494akArrValues = values();
        d = new EnumC0494ak[enumC0494akArrValues.length];
        for (EnumC0494ak enumC0494ak50 : enumC0494akArrValues) {
            d[enumC0494ak50.a] = enumC0494ak50;
        }
    }

    public EnumC0494ak(String str, int i, int i2, int i3, EnumC3777zq enumC3777zq) {
        this.a = i2;
        int iA = AbstractC3264qG.A(i3);
        if (iA == 1 || iA == 3) {
            enumC3777zq.getClass();
        }
        if (i3 == 1) {
            enumC3777zq.ordinal();
        }
    }

    public static EnumC0494ak valueOf(String str) {
        return (EnumC0494ak) Enum.valueOf(EnumC0494ak.class, str);
    }

    public static EnumC0494ak[] values() {
        return (EnumC0494ak[]) e.clone();
    }

    public final int a() {
        return this.a;
    }
}
