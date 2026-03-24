package defpackage;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Fa, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0098Fa {
    public static final EnumC0098Fa a;
    public static final HashMap b;
    public static final /* synthetic */ EnumC0098Fa[] c;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0098Fa EF10;

    static {
        EnumC0098Fa enumC0098Fa = new EnumC0098Fa("X86_32", 0);
        EnumC0098Fa enumC0098Fa2 = new EnumC0098Fa("X86_64", 1);
        EnumC0098Fa enumC0098Fa3 = new EnumC0098Fa("ARM_UNKNOWN", 2);
        EnumC0098Fa enumC0098Fa4 = new EnumC0098Fa("PPC", 3);
        EnumC0098Fa enumC0098Fa5 = new EnumC0098Fa("PPC64", 4);
        EnumC0098Fa enumC0098Fa6 = new EnumC0098Fa("ARMV6", 5);
        EnumC0098Fa enumC0098Fa7 = new EnumC0098Fa("ARMV7", 6);
        EnumC0098Fa enumC0098Fa8 = new EnumC0098Fa("UNKNOWN", 7);
        a = enumC0098Fa8;
        EnumC0098Fa enumC0098Fa9 = new EnumC0098Fa("ARMV7S", 8);
        EnumC0098Fa enumC0098Fa10 = new EnumC0098Fa("ARM64", 9);
        c = new EnumC0098Fa[]{enumC0098Fa, enumC0098Fa2, enumC0098Fa3, enumC0098Fa4, enumC0098Fa5, enumC0098Fa6, enumC0098Fa7, enumC0098Fa8, enumC0098Fa9, enumC0098Fa10};
        HashMap map = new HashMap(4);
        b = map;
        map.put("armeabi-v7a", enumC0098Fa7);
        map.put("armeabi", enumC0098Fa6);
        map.put("arm64-v8a", enumC0098Fa10);
        map.put("x86", enumC0098Fa);
    }

    public static EnumC0098Fa valueOf(String str) {
        return (EnumC0098Fa) Enum.valueOf(EnumC0098Fa.class, str);
    }

    public static EnumC0098Fa[] values() {
        return (EnumC0098Fa[]) c.clone();
    }
}
