package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Oa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0251Oa {
    public static final EnumC0251Oa a;
    public static final /* synthetic */ EnumC0251Oa[] b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0251Oa EF2;

    static {
        EnumC0251Oa enumC0251Oa = new EnumC0251Oa("NOT_SET", 0);
        EnumC0251Oa enumC0251Oa2 = new EnumC0251Oa("EVENT_OVERRIDE", 1);
        a = enumC0251Oa2;
        b = new EnumC0251Oa[]{enumC0251Oa, enumC0251Oa2};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, enumC0251Oa);
        sparseArray.put(5, enumC0251Oa2);
    }

    public static EnumC0251Oa valueOf(String str) {
        return (EnumC0251Oa) Enum.valueOf(EnumC0251Oa.class, str);
    }

    public static EnumC0251Oa[] values() {
        return (EnumC0251Oa[]) b.clone();
    }
}
