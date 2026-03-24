package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: hj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC2792hj implements Mw {
    public static final EnumC2792hj b;
    public static final /* synthetic */ EnumC2792hj[] c;
    public final int a;

    static {
        EnumC2792hj enumC2792hj = new EnumC2792hj("EVENT_TYPE_UNKNOWN", 0, 0);
        EnumC2792hj enumC2792hj2 = new EnumC2792hj("SESSION_START", 1, 1);
        b = enumC2792hj2;
        EnumC2792hj[] enumC2792hjArr = {enumC2792hj, enumC2792hj2};
        c = enumC2792hjArr;
        AbstractC2883jK.t(enumC2792hjArr);
    }

    public EnumC2792hj(String str, int i, int i2) {
        this.a = i2;
    }

    public static EnumC2792hj valueOf(String str) {
        return (EnumC2792hj) Enum.valueOf(EnumC2792hj.class, str);
    }

    public static EnumC2792hj[] values() {
        return (EnumC2792hj[]) c.clone();
    }

    @Override // defpackage.Mw
    public final int a() {
        return this.a;
    }
}
