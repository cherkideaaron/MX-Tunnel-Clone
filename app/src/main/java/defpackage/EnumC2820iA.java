package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: iA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC2820iA {
    public static final EnumC2820iA a;
    public static final /* synthetic */ EnumC2820iA[] b;

    static {
        EnumC2820iA enumC2820iA = new EnumC2820iA("DEFAULT", 0);
        a = enumC2820iA;
        b = new EnumC2820iA[]{enumC2820iA, new EnumC2820iA("SIGNED", 1), new EnumC2820iA("FIXED", 2)};
    }

    public static EnumC2820iA valueOf(String str) {
        return (EnumC2820iA) Enum.valueOf(EnumC2820iA.class, str);
    }

    public static EnumC2820iA[] values() {
        return (EnumC2820iA[]) b.clone();
    }
}
