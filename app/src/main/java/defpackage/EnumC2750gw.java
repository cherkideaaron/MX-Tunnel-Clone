package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: gw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2750gw {
    public static final SparseArray a;
    public static final /* synthetic */ EnumC2750gw[] b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2750gw EF5;

    static {
        EnumC2750gw enumC2750gw = new EnumC2750gw("UNKNOWN_MOBILE_SUBTYPE", 0);
        EnumC2750gw enumC2750gw2 = new EnumC2750gw("GPRS", 1);
        EnumC2750gw enumC2750gw3 = new EnumC2750gw("EDGE", 2);
        EnumC2750gw enumC2750gw4 = new EnumC2750gw("UMTS", 3);
        EnumC2750gw enumC2750gw5 = new EnumC2750gw("CDMA", 4);
        EnumC2750gw enumC2750gw6 = new EnumC2750gw("EVDO_0", 5);
        EnumC2750gw enumC2750gw7 = new EnumC2750gw("EVDO_A", 6);
        EnumC2750gw enumC2750gw8 = new EnumC2750gw("RTT", 7);
        EnumC2750gw enumC2750gw9 = new EnumC2750gw("HSDPA", 8);
        EnumC2750gw enumC2750gw10 = new EnumC2750gw("HSUPA", 9);
        EnumC2750gw enumC2750gw11 = new EnumC2750gw("HSPA", 10);
        EnumC2750gw enumC2750gw12 = new EnumC2750gw("IDEN", 11);
        EnumC2750gw enumC2750gw13 = new EnumC2750gw("EVDO_B", 12);
        EnumC2750gw enumC2750gw14 = new EnumC2750gw("LTE", 13);
        EnumC2750gw enumC2750gw15 = new EnumC2750gw("EHRPD", 14);
        EnumC2750gw enumC2750gw16 = new EnumC2750gw("HSPAP", 15);
        EnumC2750gw enumC2750gw17 = new EnumC2750gw("GSM", 16);
        EnumC2750gw enumC2750gw18 = new EnumC2750gw("TD_SCDMA", 17);
        EnumC2750gw enumC2750gw19 = new EnumC2750gw("IWLAN", 18);
        EnumC2750gw enumC2750gw20 = new EnumC2750gw("LTE_CA", 19);
        b = new EnumC2750gw[]{enumC2750gw, enumC2750gw2, enumC2750gw3, enumC2750gw4, enumC2750gw5, enumC2750gw6, enumC2750gw7, enumC2750gw8, enumC2750gw9, enumC2750gw10, enumC2750gw11, enumC2750gw12, enumC2750gw13, enumC2750gw14, enumC2750gw15, enumC2750gw16, enumC2750gw17, enumC2750gw18, enumC2750gw19, enumC2750gw20, new EnumC2750gw("COMBINED", 20)};
        SparseArray sparseArray = new SparseArray();
        a = sparseArray;
        sparseArray.put(0, enumC2750gw);
        sparseArray.put(1, enumC2750gw2);
        sparseArray.put(2, enumC2750gw3);
        sparseArray.put(3, enumC2750gw4);
        sparseArray.put(4, enumC2750gw5);
        sparseArray.put(5, enumC2750gw6);
        sparseArray.put(6, enumC2750gw7);
        sparseArray.put(7, enumC2750gw8);
        sparseArray.put(8, enumC2750gw9);
        sparseArray.put(9, enumC2750gw10);
        sparseArray.put(10, enumC2750gw11);
        sparseArray.put(11, enumC2750gw12);
        sparseArray.put(12, enumC2750gw13);
        sparseArray.put(13, enumC2750gw14);
        sparseArray.put(14, enumC2750gw15);
        sparseArray.put(15, enumC2750gw16);
        sparseArray.put(16, enumC2750gw17);
        sparseArray.put(17, enumC2750gw18);
        sparseArray.put(18, enumC2750gw19);
        sparseArray.put(19, enumC2750gw20);
    }

    public static EnumC2750gw valueOf(String str) {
        return (EnumC2750gw) Enum.valueOf(EnumC2750gw.class, str);
    }

    public static EnumC2750gw[] values() {
        return (EnumC2750gw[]) b.clone();
    }
}
