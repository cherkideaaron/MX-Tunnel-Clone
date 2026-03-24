package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ba, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0539ba {
    public static final EnumC0539ba a;
    public static final /* synthetic */ EnumC0539ba[] b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0539ba EF2;

    static {
        EnumC0539ba enumC0539ba = new EnumC0539ba("UNKNOWN", 0);
        EnumC0539ba enumC0539ba2 = new EnumC0539ba("ANDROID_FIREBASE", 1);
        a = enumC0539ba2;
        b = new EnumC0539ba[]{enumC0539ba, enumC0539ba2};
    }

    public static EnumC0539ba valueOf(String str) {
        return (EnumC0539ba) Enum.valueOf(EnumC0539ba.class, str);
    }

    public static EnumC0539ba[] values() {
        return (EnumC0539ba[]) b.clone();
    }
}
