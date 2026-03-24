package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: mr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC3073mr {
    public static final /* synthetic */ EnumC3073mr[] a;

    static {
        EnumC3073mr[] enumC3073mrArr = {new EnumC3073mr("PUBLIC", 0), new EnumC3073mr("PROTECTED", 1), new EnumC3073mr("INTERNAL", 2), new EnumC3073mr("PRIVATE", 3)};
        a = enumC3073mrArr;
        AbstractC2883jK.t(enumC3073mrArr);
    }

    public static EnumC3073mr valueOf(String str) {
        return (EnumC3073mr) Enum.valueOf(EnumC3073mr.class, str);
    }

    public static EnumC3073mr[] values() {
        return (EnumC3073mr[]) a.clone();
    }
}
