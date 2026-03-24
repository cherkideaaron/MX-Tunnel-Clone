package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Nu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1179Nu {
    public static byte[] A05;
    public static String[] A06 = {"SwW", "nKJOmWTx3LjNZvOp7YbBROgXIyGkfXUh", "cNvS8LZQYgXEdOP85dYAvAy4C3J", "ICxq6EmLG0dgZi7UJ5PBV2wBsvrmCfpb", "tKedy3gZYTLe", "bmz0vq", "hvIAQTYE0cdtFIL2", "tj9oqRvQS19ndgZTuA"};
    public C1307Sx A00;
    public EnumC1562bD A01 = EnumC1562bD.A05;
    public ArrayList<C1685dC> A02 = new ArrayList<>();
    public final NQ A03;
    public final InterfaceC1178Nt A04;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 97);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{-35, 23, 35, 28, 27, -66, -29, -23, -38, -25, -29, -42, -31, -107, -70, -25, -25, -28, -25, -107, -89, -91, -91, -85, -107, -20, -34, -23, -35, -28, -22, -23, -107, -42, -107, -21, -42, -31, -34, -39, -107, -74, -39, -66, -29, -37, -28, -93, 21, 24, 19, 24, 21, 40, 21, 19, 22, 41, 34, 24, 32, 25, -29, -14, -21, -36, -31, -38, -30, -25, -40, -23, -38, -21, -38, -26, -20, 18, 23, 16, 24, 29, 20, 19, -16, 19, -13, 16, 35, 16, -15, 36, 29, 19, 27, 20, 63, 68, 74, 59, 72, 73, 74, 63, 74, 63, 55, 66};
    }

    static {
        A06();
    }

    public C1179Nu(C1901gi c1901gi, O8 o8, InterfaceC1178Nt interfaceC1178Nt, String str) {
        JSONObject dataObject = o8.A03();
        this.A03 = A01(c1901gi, o8, str, dataObject);
        this.A04 = interfaceC1178Nt;
    }

    private AdError A00(C1901gi c1901gi, AbstractC2066jd abstractC2066jd) {
        if (abstractC2066jd == null || abstractC2066jd.A2G().isEmpty()) {
            c1901gi.A08().ABC(A04(62, 3, 33), AbstractC1313Td.A0Z, new C1314Te(A04(5, 43, 20)));
            return AdError.internalError(AdError.INTERNAL_ERROR_2006);
        }
        return null;
    }

    public static NQ A01(C1901gi c1901gi, O8 o8, String str, JSONObject jSONObject) {
        NQ nqA00 = null;
        if (jSONObject.has(A04(65, 12, 24))) {
            try {
                nqA00 = C2060jT.A01(jSONObject, c1901gi, true);
                nqA00.A1Q(true);
                nqA00.A1N(A04(96, 12, 117));
            } catch (JSONException unused) {
            }
        }
        if (nqA00 == null) {
            nqA00 = C07787n.A00(jSONObject, c1901gi);
        }
        nqA00.A1M(str);
        C1333Tx c1333TxA01 = o8.A01();
        if (c1333TxA01 != null) {
            nqA00.A1I(c1333TxA01.A06());
        }
        return nqA00;
    }

    private C1307Sx A03(C1901gi c1901gi) {
        return this.A00 != null ? this.A00 : new C1307Sx(c1901gi);
    }

    private void A08(C1901gi c1901gi, C07787n c07787n) {
        C1173No playableData = c07787n.A29().A0H().A07();
        A0B(playableData != null ? playableData.A0H() : EnumC1562bD.A05);
        C2046jC c2046jC = new C2046jC(this);
        C1307Sx c1307Sx = new C1307Sx(c1901gi);
        boolean z = C1351Up.A2H(c1901gi) && SN.A0A(c07787n.A1H());
        if (z) {
            SN unifiedAssetsLoader = new SN(c1307Sx, c07787n.A1H(), c07787n.A10(), c07787n.A1D(), z, new C2045jB(this));
            c1307Sx.A0e(new VI(c07787n.A2E(), c1901gi.A0A()));
            unifiedAssetsLoader.A0B();
            return;
        }
        O5.A02(c1901gi, c07787n, true, c2046jC);
    }

    private void A09(C1901gi c1901gi, EnumSet<CacheFlag> enumSet, AbstractC2066jd abstractC2066jd, int i, InterfaceC1178Nt interfaceC1178Nt) {
        boolean isDSL = abstractC2066jd.A1g();
        C1307Sx c1307SxA03 = A03(c1901gi);
        c1307SxA03.A0e(new VI(abstractC2066jd.A2E(), c1901gi.A0A()));
        boolean z = C1351Up.A2H(c1901gi) && SN.A0A(abstractC2066jd.A1H());
        if (z) {
            new SN(c1307SxA03, abstractC2066jd.A1H(), abstractC2066jd.A10(), abstractC2066jd.A1D(), z, new C2049jF(this, c1901gi, isDSL, abstractC2066jd, interfaceC1178Nt)).A0B();
            return;
        }
        String strA04 = A04(96, 12, 117);
        if (isDSL) {
            C1303St c1303St = new C1303St(abstractC2066jd.A0x(), abstractC2066jd.A1D(), strA04);
            c1303St.A04 = true;
            c1303St.A03 = A04(0, 5, 78);
            c1307SxA03.A0Y(c1303St);
        }
        c1307SxA03.A0d(new C1305Sv(abstractC2066jd.A2C().A01(), C1738e4.A04, C1738e4.A04, abstractC2066jd.A1D(), A04(96, 12, 117)));
        boolean isUnifiedAssetsLoaderEnabled = enumSet.contains(CacheFlag.VIDEO);
        int i2 = 0;
        boolean zA30 = C1351Up.A30(c1901gi, C1828fX.A03());
        for (NR nr : abstractC2066jd.A2G()) {
            C1305Sv c1305Sv = new C1305Sv(nr.A0H().A08(), O1.A00(nr.A0H()), O1.A01(nr.A0H()), abstractC2066jd.A1D(), A04(96, 12, 117));
            if (i2 == 0) {
                c1307SxA03.A0c(c1305Sv);
            } else {
                c1307SxA03.A0d(c1305Sv);
            }
            Iterator<String> it = nr.A0K().A02().iterator();
            while (it.hasNext()) {
                c1307SxA03.A0d(new C1305Sv(it.next(), -1, -1, abstractC2066jd.A1D(), A04(96, 12, 117)));
            }
            if (isUnifiedAssetsLoaderEnabled && !TextUtils.isEmpty(nr.A0H().A09())) {
                C1303St c1303St2 = new C1303St(nr.A0H().A09(), abstractC2066jd.A1D(), A04(96, 12, 117), nr.A0H().A06());
                c1303St2.A04 = false;
                if (i2 == 0) {
                    if (isDSL && !zA30) {
                        c1307SxA03.A0Y(c1303St2);
                    } else {
                        c1307SxA03.A0b(c1303St2);
                    }
                } else if (isDSL && !zA30) {
                    c1307SxA03.A0Z(c1303St2);
                } else {
                    c1307SxA03.A0a(c1303St2);
                }
            }
            i2++;
        }
        if (abstractC2066jd.A1W() && !TextUtils.isEmpty(abstractC2066jd.A11())) {
            c1307SxA03.A0d(new C1305Sv(abstractC2066jd.A11(), C1215Pe.A0A, C1215Pe.A0A, abstractC2066jd.A1D(), A04(96, 12, 117)));
        }
        O0.A00(abstractC2066jd, c1307SxA03, strA04);
        c1307SxA03.A0X(new C2047jD(this, c1901gi, isDSL, abstractC2066jd, interfaceC1178Nt), new C1300Sq(abstractC2066jd.A1D(), strA04, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A(C1901gi c1901gi, EnumSet<CacheFlag> enumSet, C2060jT c2060jT, AbstractC2066jd abstractC2066jd, int i, InterfaceC1178Nt interfaceC1178Nt) {
        A09(c1901gi, enumSet, abstractC2066jd, i, new C2051jH(this, c1901gi, abstractC2066jd, c2060jT, i, interfaceC1178Nt, enumSet));
    }

    private void A0B(EnumC1562bD enumC1562bD) {
        this.A01 = enumC1562bD;
    }

    private boolean A0C(C1901gi c1901gi, AbstractC2066jd abstractC2066jd) {
        AdError adErrorA00 = A00(c1901gi, abstractC2066jd);
        if (adErrorA00 != null) {
            this.A04.ACo(adErrorA00);
            return true;
        }
        return false;
    }

    public final NQ A0D() {
        return this.A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        return com.facebook.ads.redexgen.core.WK.A0C;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.ads.redexgen.core.WK A0E() {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.NQ r0 = r5.A03
            boolean r0 = r0.A1b()
            if (r0 == 0) goto Lb
            com.facebook.ads.redexgen.X.WK r0 = com.facebook.ads.redexgen.core.WK.A04
            return r0
        Lb:
            com.facebook.ads.redexgen.X.NQ r4 = r5.A03
            com.facebook.ads.redexgen.X.jd r4 = (com.facebook.ads.redexgen.core.AbstractC2066jd) r4
            boolean r0 = r4.A1g()
            if (r0 == 0) goto L18
            com.facebook.ads.redexgen.X.WK r0 = com.facebook.ads.redexgen.core.WK.A06
            return r0
        L18:
            java.util.List r0 = r4.A2G()
            int r1 = r0.size()
            r0 = 1
            if (r1 <= r0) goto L26
            com.facebook.ads.redexgen.X.WK r0 = com.facebook.ads.redexgen.core.WK.A0A
            return r0
        L26:
            com.facebook.ads.redexgen.X.NR r0 = r4.A29()
            com.facebook.ads.redexgen.X.NU r0 = r0.A0H()
            com.facebook.ads.redexgen.X.No r3 = r0.A07()
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C1179Nu.A06
            r0 = 4
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 14
            if (r1 == r0) goto L9f
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1179Nu.A06
            java.lang.String r1 = "HO5lN2vl3hawZ3xdOTbB4PXxItmZOFKM"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "QabHGQsenJFHZf5mHftqzVXi6FXcwsQx"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto L7a
            boolean r0 = r4.A1n()
            if (r0 != 0) goto L71
            boolean r3 = r4.A1u()
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C1179Nu.A06
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 2
            if (r1 == r0) goto L74
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1179Nu.A06
            java.lang.String r1 = "iV2CDA2M2IfUZLXvhnmiNr1pV0Sur2CQ"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "GDT4frbvCKvkZrCQcOaJTMqN9T6RIdn0"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto L77
        L71:
            com.facebook.ads.redexgen.X.WK r0 = com.facebook.ads.redexgen.core.WK.A0E
            return r0
        L74:
            if (r3 == 0) goto L77
            goto L71
        L77:
            com.facebook.ads.redexgen.X.WK r0 = com.facebook.ads.redexgen.core.WK.A0C
            return r0
        L7a:
            boolean r3 = r5.A0L(r4)
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C1179Nu.A06
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 2
            if (r1 == r0) goto L99
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1179Nu.A06
            java.lang.String r1 = "iDu"
            r0 = 0
            r2[r0] = r1
            if (r3 == 0) goto L96
            com.facebook.ads.redexgen.X.WK r0 = com.facebook.ads.redexgen.core.WK.A0D
            return r0
        L96:
            com.facebook.ads.redexgen.X.WK r0 = com.facebook.ads.redexgen.core.WK.A0B
            return r0
        L99:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L9f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1179Nu.A0E():com.facebook.ads.redexgen.X.WK");
    }

    public final EnumC1562bD A0F() {
        return this.A01;
    }

    public final String A0G() {
        if (this.A03.A1b()) {
            return ((C2060jT) this.A03).A2A();
        }
        return ((AbstractC2066jd) this.A03).A2E();
    }

    public final void A0H() {
        this.A04.AKX();
    }

    public final void A0I(Intent intent, RewardData rewardData, String str) {
        this.A03.A1K(rewardData);
        this.A03.A1O(str);
        if (A0D().A1b()) {
            intent.putExtra(A04(77, 19, 78), this.A03);
        }
        intent.putExtra(A04(48, 14, 83), this.A03);
    }

    public final void A0J(C1901gi c1901gi, EnumSet<CacheFlag> enumSet) {
        if (A0E() == WK.A04) {
            C2060jT c2060jT = (C2060jT) this.A03;
            AbstractC2066jd abstractC2066jdA26 = c2060jT.A26();
            if (A0C(c1901gi, abstractC2066jdA26) || abstractC2066jdA26 == null) {
                return;
            }
            this.A04.AHY();
            A0A(c1901gi, enumSet, c2060jT, abstractC2066jdA26, 0, this.A04);
            return;
        }
        AbstractC2066jd abstractC2066jd = (AbstractC2066jd) this.A03;
        if (A06[5].length() == 0) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[1] = "h3j4XQE4N9RDZ4AU6tvjsFYKX3e30HKG";
        strArr[3] = "lDhcJ7lgFtqhZjTb781X3zaoWDc2BWUc";
        if (A0C(c1901gi, abstractC2066jd)) {
            return;
        }
        this.A04.AHY();
        if (A0E() == WK.A0C) {
            C07787n c07787n = (C07787n) this.A03;
            String[] strArr2 = A06;
            if (strArr2[2].length() != strArr2[6].length()) {
                A06[7] = "0uVLF1bkkTEn2WeYm46QMmOd1A6";
                A08(c1901gi, c07787n);
                return;
            } else {
                A08(c1901gi, c07787n);
                return;
            }
        }
        A09(c1901gi, enumSet, (C07787n) this.A03, -1, this.A04);
    }

    public final boolean A0K() {
        return this.A03.A1U();
    }

    public final boolean A0L(AbstractC2066jd abstractC2066jd) {
        return !TextUtils.isEmpty(abstractC2066jd.A29().A0H().A09());
    }
}
