package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Et, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0947Et {
    public static String[] A00 = {"94gd2lHaz6driogpt3Nl1tWsjXgriMxS", "VA5F17cuoV6wg6So0a0DluDefxsQAbFW", "BZfou2TK48MMfd1yJcRZTZ4JcnnWlmHT", "ilV1kn3efEuJyycOIV0UyN70TAMLymqY", "v19hT7CAJaCb1rntEZC2LQpyBVrX3IkZ", "rkpPVUKbY", "FKwb9S", "XsKsPoEAnPyrLBiotdeURrQ5Q46xoiIz"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C2416pY A01(C0942Eo c0942Eo, List<? extends InterfaceC0944Eq>[] listArr) {
        C2K c2k = new C2K();
        int i = 0;
        loop0: while (true) {
            boolean z = false;
            if (i >= c0942Eo.A02()) {
                C2291nW c2291nWA06 = c0942Eo.A06();
                for (int i2 = 0; i2 < c2291nWA06.A01; i2++) {
                    C2424pg c2424pgA05 = c2291nWA06.A05(i2);
                    int[] iArr = new int[c2424pgA05.A01];
                    Arrays.fill(iArr, 0);
                    c2k.A04(new C2417pZ(c2424pgA05, false, iArr, new boolean[c2424pgA05.A01]));
                }
                return new C2416pY(c2k.A05());
            }
            C2291nW c2291nWA07 = c0942Eo.A07(i);
            List<? extends InterfaceC0944Eq> list = listArr[i];
            int i3 = 0;
            while (i3 < c2291nWA07.A01) {
                C2424pg c2424pgA052 = c2291nWA07.A05(i3);
                int iA05 = c0942Eo.A05(i, i3, z);
                String[] strArr = A00;
                if (strArr[7].charAt(11) != strArr[0].charAt(11)) {
                    break loop0;
                }
                String[] strArr2 = A00;
                strArr2[7] = "wVGS7RX5kLdrLFKtRIe7uQsNtd1z6IxW";
                strArr2[0] = "7aERijPLyLRrdgSw5lQfoyda5cW2h3c0";
                boolean z2 = iA05 != 0;
                int[] iArr2 = new int[c2424pgA052.A01];
                boolean[] zArr = new boolean[c2424pgA052.A01];
                for (int i4 = 0; i4 < c2424pgA052.A01; i4++) {
                    iArr2[i4] = c0942Eo.A04(i, i3, i4);
                    boolean z3 = false;
                    if (A00[5].length() != 9) {
                        break loop0;
                    }
                    String[] strArr3 = A00;
                    strArr3[2] = "3DHxmUKuGZITV4091m9MLUNqu1ZkNm0q";
                    strArr3[3] = "2BQZhu0LL1SbQMNt9wHOkoks63NLimX3";
                    int i5 = 0;
                    while (true) {
                        if (i5 < list.size()) {
                            InterfaceC0944Eq interfaceC0944Eq = list.get(i5);
                            if (interfaceC0944Eq.A9L().equals(c2424pgA052) && interfaceC0944Eq.AA6(i4) != -1) {
                                z3 = true;
                                break;
                            }
                            i5++;
                        }
                    }
                    zArr[i4] = z3;
                }
                c2k.A04(new C2417pZ(c2424pgA052, z2, iArr2, zArr));
                i3++;
                z = false;
            }
            i++;
        }
        throw new RuntimeException();
    }

    public static C2416pY A00(C0942Eo c0942Eo, InterfaceC0944Eq[] interfaceC0944EqArr) {
        List listA01;
        List[] listArr = new List[interfaceC0944EqArr.length];
        for (int i = 0; i < interfaceC0944EqArr.length; i++) {
            InterfaceC0944Eq interfaceC0944Eq = interfaceC0944EqArr[i];
            if (interfaceC0944Eq != null) {
                listA01 = BP.A04(interfaceC0944Eq);
            } else {
                listA01 = MetaExoPlayerCustomizedCollections.A01();
            }
            listArr[i] = listA01;
        }
        return A01(c0942Eo, listArr);
    }
}
