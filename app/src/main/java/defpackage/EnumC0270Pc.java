package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Pc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0270Pc {
    public static final EnumC0270Pc a;
    public static final EnumC0270Pc b;
    public static final EnumC0270Pc c;
    public static final EnumC0270Pc d;
    public static final EnumC0270Pc e;
    public static final /* synthetic */ EnumC0270Pc[] f;

    static {
        EnumC0270Pc enumC0270Pc = new EnumC0270Pc("CPU_ACQUIRED", 0);
        a = enumC0270Pc;
        EnumC0270Pc enumC0270Pc2 = new EnumC0270Pc("BLOCKING", 1);
        b = enumC0270Pc2;
        EnumC0270Pc enumC0270Pc3 = new EnumC0270Pc("PARKING", 2);
        c = enumC0270Pc3;
        EnumC0270Pc enumC0270Pc4 = new EnumC0270Pc("DORMANT", 3);
        d = enumC0270Pc4;
        EnumC0270Pc enumC0270Pc5 = new EnumC0270Pc("TERMINATED", 4);
        e = enumC0270Pc5;
        EnumC0270Pc[] enumC0270PcArr = {enumC0270Pc, enumC0270Pc2, enumC0270Pc3, enumC0270Pc4, enumC0270Pc5};
        f = enumC0270PcArr;
        AbstractC2883jK.t(enumC0270PcArr);
    }

    public static EnumC0270Pc valueOf(String str) {
        return (EnumC0270Pc) Enum.valueOf(EnumC0270Pc.class, str);
    }

    public static EnumC0270Pc[] values() {
        return (EnumC0270Pc[]) f.clone();
    }
}
