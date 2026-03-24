package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.DrmInitData;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* loaded from: assets/audience_network/classes2.dex */
public final class J7 {
    public static String[] A0A = {"EJzHBf6C0sknf46Vq1Osr72lZWU", "EzVPMe4nRAbvxSng0PXVwtyqLeoR1KIv", "OkBxNGbCc3SGP6NNAhHfxcRtiUQBpmsu", "1fihPQnAv3tt3xF1xxV2XjfJNe5jiXUE", "EaQIZLU4UTAcxpaH6Zb3hTUPzu", "nXVDjS3P8WK4na35on8K5ox1mEuGJ9Tn", "34qesDVsFPLU35m5e8V9GlfuLx1oAXXP", "IwUkif7926Fg"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public J1 A04;
    public JO A05;
    public final InterfaceC1008Hd A06;
    public final JQ A07 = new JQ();
    public final C07084v A09 = new C07084v(1);
    public final C07084v A08 = new C07084v();

    public J7(InterfaceC1008Hd interfaceC1008Hd) {
        this.A06 = interfaceC1008Hd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JP A00() {
        JP encryptionBox;
        int i = this.A07.A06.A02;
        if (this.A07.A07 != null) {
            encryptionBox = this.A07.A07;
        } else {
            encryptionBox = this.A05.A00(i);
        }
        if (encryptionBox == null || !encryptionBox.A03) {
            return null;
        }
        return encryptionBox;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        JP jpA00 = A00();
        if (jpA00 == null) {
            return;
        }
        C07084v c07084v = this.A07.A0H;
        if (jpA00.A00 != 0) {
            c07084v.A0g(jpA00.A00);
        }
        if (this.A07.A06(this.A01)) {
            c07084v.A0g(c07084v.A0M() * 6);
        }
    }

    public final int A04() {
        C07084v c07084v;
        int vectorSize;
        JP jpA00 = A00();
        if (jpA00 == null) {
            return 0;
        }
        if (jpA00.A00 != 0) {
            c07084v = this.A07.A0H;
            vectorSize = jpA00.A00;
        } else {
            byte[] initVectorData = jpA00.A04;
            this.A08.A0j(initVectorData, initVectorData.length);
            c07084v = this.A08;
            vectorSize = initVectorData.length;
        }
        boolean zA06 = this.A07.A06(this.A01);
        this.A09.A00[0] = (byte) ((zA06 ? UserVerificationMethods.USER_VERIFY_PATTERN : 0) | vectorSize);
        this.A09.A0f(0);
        InterfaceC1008Hd interfaceC1008Hd = this.A06;
        C07084v initializationVectorData = this.A09;
        interfaceC1008Hd.AIr(initializationVectorData, 1);
        this.A06.AIr(c07084v, vectorSize);
        if (!zA06) {
            int vectorSize2 = vectorSize + 1;
            if (A0A[2].charAt(9) == '1') {
                throw new RuntimeException();
            }
            A0A[3] = "cKav7mEAu9tQ2Y9RA5SJHOCCBpQ48rqR";
            return vectorSize2;
        }
        C07084v c07084v2 = this.A07.A0H;
        int iA0M = c07084v2.A0M();
        c07084v2.A0g(-2);
        int i = (iA0M * 6) + 2;
        this.A06.AIr(c07084v2, i);
        return vectorSize + 1 + i;
    }

    public final void A05() {
        this.A07.A01();
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0006 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A06(long r5) {
        /*
            r4 = this;
            int r3 = r4.A01
        L2:
            com.facebook.ads.redexgen.X.JQ r0 = r4.A07
            int r0 = r0.A00
            if (r3 >= r0) goto L1f
            com.facebook.ads.redexgen.X.JQ r0 = r4.A07
            long r1 = r0.A00(r3)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L1f
            com.facebook.ads.redexgen.X.JQ r0 = r4.A07
            boolean[] r0 = r0.A0G
            boolean r0 = r0[r3]
            if (r0 == 0) goto L1c
            r4.A03 = r3
        L1c:
            int r3 = r3 + 1
            goto L2
        L1f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.J7.A06(long):void");
    }

    public final void A07(DrmInitData drmInitData) {
        JP encryptionBox = this.A05.A00(this.A07.A06.A02);
        this.A06.A6e(this.A05.A07.A09(drmInitData.A01(encryptionBox != null ? encryptionBox.A02 : null)));
    }

    public final void A08(JO jo, J1 j1) {
        this.A05 = (JO) AbstractC06853y.A01(jo);
        this.A04 = (J1) AbstractC06853y.A01(j1);
        this.A06.A6e(jo.A07);
        A05();
    }

    public final boolean A09() {
        this.A01++;
        this.A00++;
        if (this.A00 != this.A07.A0C[this.A02]) {
            return true;
        }
        this.A02++;
        this.A00 = 0;
        return false;
    }
}
