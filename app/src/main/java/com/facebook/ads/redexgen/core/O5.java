package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class O5 {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 115);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{11, 77, 81, 72, 73, 93, 90, 64, 81, 70, 71, 64, 93, 64, 93, 85, 88};
    }

    public static void A02(C1901gi c1901gi, AbstractC2066jd abstractC2066jd, boolean z, O3 o3) {
        if (!C1351Up.A2E(c1901gi)) {
            C1307Sx c1307Sx = new C1307Sx(c1901gi);
            C1173No c1173NoA07 = abstractC2066jd.A29().A0H().A07();
            c1307Sx.A0e(new VI(abstractC2066jd.A2E(), c1901gi.A0A()));
            if (c1173NoA07 == null) {
                o3.AFF(AdError.CACHE_ERROR);
                return;
            }
            if (c1173NoA07.A0Y()) {
                o3.AFG();
                return;
            }
            C1303St c1303St = new C1303St(c1173NoA07.A0L(), abstractC2066jd.A1D(), abstractC2066jd.A10());
            c1303St.A04 = true;
            c1303St.A03 = A00(0, 5, 86);
            switch (O2.A00[c1173NoA07.A0G().ordinal()]) {
                case 1:
                case 2:
                    c1307Sx.A0Y(c1303St);
                    break;
            }
            c1307Sx.A0c(new C1305Sv(abstractC2066jd.A2C().A01(), -1, -1, abstractC2066jd.A1D(), abstractC2066jd.A10()));
            c1307Sx.A0c(new C1305Sv(c1173NoA07.A0K(), -1, -1, abstractC2066jd.A1D(), abstractC2066jd.A10()));
            O0.A00(abstractC2066jd, c1307Sx, A00(5, 12, 71));
            c1307Sx.A0X(new C2044jA(c1901gi, o3, c1307Sx, c1173NoA07, z), new C1300Sq(abstractC2066jd.A1D(), abstractC2066jd.A10()));
            return;
        }
        o3.AFG();
    }
}
