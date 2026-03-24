package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: wO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC3596wO {
    public static final EnumC3596wO c;
    public static final EnumC3596wO d;
    public static final EnumC3596wO e;
    public static final EnumC3596wO f;
    public static final /* synthetic */ EnumC3596wO[] m;
    public static final /* synthetic */ C0361Ui n;
    public final char a;
    public final char b;

    static {
        EnumC3596wO enumC3596wO = new EnumC3596wO("OBJ", 0, '{', '}');
        c = enumC3596wO;
        EnumC3596wO enumC3596wO2 = new EnumC3596wO("LIST", 1, '[', ']');
        d = enumC3596wO2;
        EnumC3596wO enumC3596wO3 = new EnumC3596wO("MAP", 2, '{', '}');
        e = enumC3596wO3;
        EnumC3596wO enumC3596wO4 = new EnumC3596wO("POLY_OBJ", 3, '[', ']');
        f = enumC3596wO4;
        EnumC3596wO[] enumC3596wOArr = {enumC3596wO, enumC3596wO2, enumC3596wO3, enumC3596wO4};
        m = enumC3596wOArr;
        n = AbstractC2883jK.t(enumC3596wOArr);
    }

    public EnumC3596wO(String str, int i, char c2, char c3) {
        this.a = c2;
        this.b = c3;
    }

    public static EnumC3596wO valueOf(String str) {
        return (EnumC3596wO) Enum.valueOf(EnumC3596wO.class, str);
    }

    public static EnumC3596wO[] values() {
        return (EnumC3596wO[]) m.clone();
    }
}
