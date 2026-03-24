package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Uc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0355Uc {
    public static final EnumC0355Uc a;
    public static final EnumC0355Uc b;
    public static final /* synthetic */ EnumC0355Uc[] c;

    static {
        EnumC0355Uc enumC0355Uc = new EnumC0355Uc("DEFAULT", 0);
        a = enumC0355Uc;
        EnumC0355Uc enumC0355Uc2 = new EnumC0355Uc("LAZY", 1);
        EnumC0355Uc enumC0355Uc3 = new EnumC0355Uc("ATOMIC", 2);
        b = enumC0355Uc3;
        EnumC0355Uc[] enumC0355UcArr = {enumC0355Uc, enumC0355Uc2, enumC0355Uc3, new EnumC0355Uc("UNDISPATCHED", 3)};
        c = enumC0355UcArr;
        AbstractC2883jK.t(enumC0355UcArr);
    }

    public static EnumC0355Uc valueOf(String str) {
        return (EnumC0355Uc) Enum.valueOf(EnumC0355Uc.class, str);
    }

    public static EnumC0355Uc[] values() {
        return (EnumC0355Uc[]) c.clone();
    }
}
