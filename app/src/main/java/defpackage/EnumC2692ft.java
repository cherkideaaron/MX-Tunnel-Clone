package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ft, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC2692ft implements Mw {
    public static final EnumC2692ft b;
    public static final /* synthetic */ EnumC2692ft[] c;
    public final int a;

    static {
        EnumC2692ft enumC2692ft = new EnumC2692ft("LOG_ENVIRONMENT_UNKNOWN", 0, 0);
        EnumC2692ft enumC2692ft2 = new EnumC2692ft("LOG_ENVIRONMENT_AUTOPUSH", 1, 1);
        EnumC2692ft enumC2692ft3 = new EnumC2692ft("LOG_ENVIRONMENT_STAGING", 2, 2);
        EnumC2692ft enumC2692ft4 = new EnumC2692ft("LOG_ENVIRONMENT_PROD", 3, 3);
        b = enumC2692ft4;
        EnumC2692ft[] enumC2692ftArr = {enumC2692ft, enumC2692ft2, enumC2692ft3, enumC2692ft4};
        c = enumC2692ftArr;
        AbstractC2883jK.t(enumC2692ftArr);
    }

    public EnumC2692ft(String str, int i, int i2) {
        this.a = i2;
    }

    public static EnumC2692ft valueOf(String str) {
        return (EnumC2692ft) Enum.valueOf(EnumC2692ft.class, str);
    }

    public static EnumC2692ft[] values() {
        return (EnumC2692ft[]) c.clone();
    }

    @Override // defpackage.Mw
    public final int a() {
        return this.a;
    }
}
