package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: hw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2805hw {
    public static final SparseArray a;
    public static final /* synthetic */ EnumC2805hw[] b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2805hw EF3;

    static {
        EnumC2805hw enumC2805hw = new EnumC2805hw("MOBILE", 0);
        EnumC2805hw enumC2805hw2 = new EnumC2805hw("WIFI", 1);
        EnumC2805hw enumC2805hw3 = new EnumC2805hw("MOBILE_MMS", 2);
        EnumC2805hw enumC2805hw4 = new EnumC2805hw("MOBILE_SUPL", 3);
        EnumC2805hw enumC2805hw5 = new EnumC2805hw("MOBILE_DUN", 4);
        EnumC2805hw enumC2805hw6 = new EnumC2805hw("MOBILE_HIPRI", 5);
        EnumC2805hw enumC2805hw7 = new EnumC2805hw("WIMAX", 6);
        EnumC2805hw enumC2805hw8 = new EnumC2805hw("BLUETOOTH", 7);
        EnumC2805hw enumC2805hw9 = new EnumC2805hw("DUMMY", 8);
        EnumC2805hw enumC2805hw10 = new EnumC2805hw("ETHERNET", 9);
        EnumC2805hw enumC2805hw11 = new EnumC2805hw("MOBILE_FOTA", 10);
        EnumC2805hw enumC2805hw12 = new EnumC2805hw("MOBILE_IMS", 11);
        EnumC2805hw enumC2805hw13 = new EnumC2805hw("MOBILE_CBS", 12);
        EnumC2805hw enumC2805hw14 = new EnumC2805hw("WIFI_P2P", 13);
        EnumC2805hw enumC2805hw15 = new EnumC2805hw("MOBILE_IA", 14);
        EnumC2805hw enumC2805hw16 = new EnumC2805hw("MOBILE_EMERGENCY", 15);
        EnumC2805hw enumC2805hw17 = new EnumC2805hw("PROXY", 16);
        EnumC2805hw enumC2805hw18 = new EnumC2805hw("VPN", 17);
        EnumC2805hw enumC2805hw19 = new EnumC2805hw("NONE", 18);
        b = new EnumC2805hw[]{enumC2805hw, enumC2805hw2, enumC2805hw3, enumC2805hw4, enumC2805hw5, enumC2805hw6, enumC2805hw7, enumC2805hw8, enumC2805hw9, enumC2805hw10, enumC2805hw11, enumC2805hw12, enumC2805hw13, enumC2805hw14, enumC2805hw15, enumC2805hw16, enumC2805hw17, enumC2805hw18, enumC2805hw19};
        SparseArray sparseArray = new SparseArray();
        a = sparseArray;
        sparseArray.put(0, enumC2805hw);
        sparseArray.put(1, enumC2805hw2);
        sparseArray.put(2, enumC2805hw3);
        sparseArray.put(3, enumC2805hw4);
        sparseArray.put(4, enumC2805hw5);
        sparseArray.put(5, enumC2805hw6);
        sparseArray.put(6, enumC2805hw7);
        sparseArray.put(7, enumC2805hw8);
        sparseArray.put(8, enumC2805hw9);
        sparseArray.put(9, enumC2805hw10);
        sparseArray.put(10, enumC2805hw11);
        sparseArray.put(11, enumC2805hw12);
        sparseArray.put(12, enumC2805hw13);
        sparseArray.put(13, enumC2805hw14);
        sparseArray.put(14, enumC2805hw15);
        sparseArray.put(15, enumC2805hw16);
        sparseArray.put(16, enumC2805hw17);
        sparseArray.put(17, enumC2805hw18);
        sparseArray.put(-1, enumC2805hw19);
    }

    public static EnumC2805hw valueOf(String str) {
        return (EnumC2805hw) Enum.valueOf(EnumC2805hw.class, str);
    }

    public static EnumC2805hw[] values() {
        return (EnumC2805hw[]) b.clone();
    }
}
