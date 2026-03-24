package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class K5 {
    public static String[] A09 = {"UUlEJ3Jo50NOk35TUHs6UNRK6svNK9bY", "Rfapb4gOuHxAcdI53hJjgoF3fgUzCf8l", "549CgiYhO6ZoxkZsxucd", "d0g0H9nuc7MFYEKhz8GgPJKXV4KY3uwa", "SvGPJzr3mUIjg4zk3UE0lmEsGQStmHiR", "UIGV6MTRsZPNdj8JuGQraJXbpN7YiCpC", "sPKUkdPP6cbZl7mqg699SGb1Qg8cwcjc", "pSvb9vtzFVNohJw9Yc2pgYHm"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public boolean A06;
    public final C07084v A07 = new C07084v();
    public final int[] A08 = new int[UserVerificationMethods.USER_VERIFY_HANDPRINT];

    /* JADX INFO: Access modifiers changed from: private */
    public void A00(C07084v c07084v, int i) {
        int totalLength;
        if (i < 4) {
            return;
        }
        c07084v.A0g(3);
        int i2 = i - 4;
        if ((c07084v.A0I() & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            if (i2 < 7 || (totalLength = c07084v.A0K()) < 4) {
                return;
            }
            this.A01 = c07084v.A0M();
            this.A00 = c07084v.A0M();
            this.A07.A0d(totalLength - 4);
            i2 -= 7;
        }
        int limit = this.A07.A09();
        int position = this.A07.A0A();
        if (limit < position && i2 > 0) {
            int iMin = Math.min(i2, position - limit);
            c07084v.A0k(this.A07.A0l(), limit, iMin);
            this.A07.A0f(limit + iMin);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01(C07084v c07084v, int i) {
        if (i < 19) {
            return;
        }
        this.A05 = c07084v.A0M();
        this.A04 = c07084v.A0M();
        c07084v.A0g(11);
        this.A02 = c07084v.A0M();
        this.A03 = c07084v.A0M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02(C07084v c07084v, int i) {
        if (i % 5 != 2) {
            return;
        }
        c07084v.A0g(2);
        Arrays.fill(this.A08, 0);
        int i2 = i / 5;
        for (int index = 0; index < i2; index++) {
            int iA0I = c07084v.A0I();
            int a = c07084v.A0I();
            int iA0I2 = c07084v.A0I();
            int iA0I3 = c07084v.A0I();
            int entryCount = iA0I2 - 128;
            int i3 = (int) (a + (entryCount * 1.402d));
            int g = (int) ((a - ((iA0I3 - 128) * 0.34414d)) - ((iA0I2 - 128) * 0.71414d));
            int entryCount2 = c07084v.A0I() << 24;
            this.A08[iA0I] = entryCount2 | (C5C.A07(i3, 0, 255) << 16) | (C5C.A07(g, 0, 255) << 8) | C5C.A07((int) (a + ((iA0I3 - 128) * 1.772d)), 0, 255);
        }
        this.A06 = true;
    }

    public final C2411pT A06() {
        int iA0I;
        if (this.A05 == 0 || this.A04 == 0 || this.A01 == 0 || this.A00 == 0 || this.A07.A0A() == 0 || this.A07.A09() != this.A07.A0A() || !this.A06) {
            return null;
        }
        this.A07.A0f(0);
        int[] iArr = new int[this.A01 * this.A00];
        int runLength = 0;
        while (runLength < iArr.length) {
            int argbBitmapDataIndex = this.A07.A0I();
            if (argbBitmapDataIndex != 0) {
                int[] argbBitmapData = this.A08;
                iArr[runLength] = argbBitmapData[argbBitmapDataIndex];
                runLength++;
            } else {
                int color = this.A07.A0I();
                if (color != 0) {
                    int i = color & 64;
                    String[] strArr = A09;
                    if (strArr[6].charAt(29) == strArr[4].charAt(29)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A09;
                    strArr2[0] = "GtJojiNEMobCnjKA96lXJCCL45Dtio0z";
                    strArr2[1] = "Lfhzohsg2V0yWJPoWAL0pRvwojJGYPpJ";
                    if (i == 0) {
                        iA0I = color & 63;
                    } else {
                        iA0I = ((color & 63) << 8) | this.A07.A0I();
                    }
                    Arrays.fill(iArr, runLength, runLength + iA0I, (color & UserVerificationMethods.USER_VERIFY_PATTERN) == 0 ? 0 : this.A08[this.A07.A0I()]);
                    runLength += iA0I;
                } else {
                    continue;
                }
            }
        }
        return new C06753o().A0D(Bitmap.createBitmap(iArr, this.A01, this.A00, Bitmap.Config.ARGB_8888)).A04(this.A02 / this.A05).A0A(0).A07(this.A03 / this.A04, 0).A09(0).A06(this.A01 / this.A05).A03(this.A00 / this.A04).A0H();
    }

    public final void A07() {
        this.A05 = 0;
        this.A04 = 0;
        this.A02 = 0;
        this.A03 = 0;
        this.A01 = 0;
        this.A00 = 0;
        this.A07.A0d(0);
        this.A06 = false;
    }
}
