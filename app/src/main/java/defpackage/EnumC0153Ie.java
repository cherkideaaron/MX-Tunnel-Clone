package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Ie, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0153Ie implements Mw {
    public static final EnumC0153Ie b;
    public static final EnumC0153Ie c;
    public static final EnumC0153Ie d;
    public static final /* synthetic */ EnumC0153Ie[] e;
    public final int a;

    static {
        EnumC0153Ie enumC0153Ie = new EnumC0153Ie("COLLECTION_UNKNOWN", 0, 0);
        EnumC0153Ie enumC0153Ie2 = new EnumC0153Ie("COLLECTION_SDK_NOT_INSTALLED", 1, 1);
        b = enumC0153Ie2;
        EnumC0153Ie enumC0153Ie3 = new EnumC0153Ie("COLLECTION_ENABLED", 2, 2);
        c = enumC0153Ie3;
        EnumC0153Ie enumC0153Ie4 = new EnumC0153Ie("COLLECTION_DISABLED", 3, 3);
        d = enumC0153Ie4;
        EnumC0153Ie[] enumC0153IeArr = {enumC0153Ie, enumC0153Ie2, enumC0153Ie3, enumC0153Ie4, new EnumC0153Ie("COLLECTION_DISABLED_REMOTE", 4, 4), new EnumC0153Ie("COLLECTION_SAMPLED", 5, 5)};
        e = enumC0153IeArr;
        AbstractC2883jK.t(enumC0153IeArr);
    }

    public EnumC0153Ie(String str, int i, int i2) {
        this.a = i2;
    }

    public static EnumC0153Ie valueOf(String str) {
        return (EnumC0153Ie) Enum.valueOf(EnumC0153Ie.class, str);
    }

    public static EnumC0153Ie[] values() {
        return (EnumC0153Ie[]) e.clone();
    }

    @Override // defpackage.Mw
    public final int a() {
        return this.a;
    }
}
