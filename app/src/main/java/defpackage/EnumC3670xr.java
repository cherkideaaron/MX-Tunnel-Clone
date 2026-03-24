package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: xr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC3670xr {
    public static final /* synthetic */ EnumC3670xr[] a;

    static {
        EnumC3670xr[] enumC3670xrArr = {new EnumC3670xr("SYNCHRONIZED", 0), new EnumC3670xr("PUBLICATION", 1), new EnumC3670xr("NONE", 2)};
        a = enumC3670xrArr;
        AbstractC2883jK.t(enumC3670xrArr);
    }

    public static EnumC3670xr valueOf(String str) {
        return (EnumC3670xr) Enum.valueOf(EnumC3670xr.class, str);
    }

    public static EnumC3670xr[] values() {
        return (EnumC3670xr[]) a.clone();
    }
}
