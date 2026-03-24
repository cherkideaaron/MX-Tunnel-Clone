package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Sc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0321Sc {
    public static final EnumC0321Sc a;
    public static final /* synthetic */ EnumC0321Sc[] b;

    static {
        EnumC0321Sc enumC0321Sc = new EnumC0321Sc("COROUTINE_SUSPENDED", 0);
        a = enumC0321Sc;
        EnumC0321Sc[] enumC0321ScArr = {enumC0321Sc, new EnumC0321Sc("UNDECIDED", 1), new EnumC0321Sc("RESUMED", 2)};
        b = enumC0321ScArr;
        AbstractC2883jK.t(enumC0321ScArr);
    }

    public static EnumC0321Sc valueOf(String str) {
        return (EnumC0321Sc) Enum.valueOf(EnumC0321Sc.class, str);
    }

    public static EnumC0321Sc[] values() {
        return (EnumC0321Sc[]) b.clone();
    }
}
