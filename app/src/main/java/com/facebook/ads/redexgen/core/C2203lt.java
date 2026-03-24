package com.facebook.ads.redexgen.core;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: com.facebook.ads.redexgen.X.lt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2203lt extends AbstractC1057Jb {
    public static byte[] A05;
    public static String[] A06 = {"uV3egKqPt", "vbtXlOI", "gip2ILD7nBGTUOP5yb7zSULibNYEk", "ypzju5tbq0Qdtgd67o3qNaulkzBfCJSX", "gCa1Tkio4U0hXnRqOcWVPONwWAtrpMS5", "m", "OXoEHzgO5FTzqO33f", "i"};
    public int A00;
    public C1012Hh A01;
    public C1014Hj A02;
    public C1058Jc A03;
    public boolean A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final C1058Jc A02(C07084v c07084v) throws IOException {
        if (this.A02 == null) {
            this.A02 = AbstractC1015Hk.A06(c07084v);
            return null;
        }
        if (this.A01 == null) {
            this.A01 = AbstractC1015Hk.A04(c07084v);
            return null;
        }
        C1014Hj c1014Hj = this.A02;
        C1012Hh c1012Hh = this.A01;
        byte[] bArr = new byte[c07084v.A0A()];
        System.arraycopy(c07084v.A0l(), 0, bArr, 0, c07084v.A0A());
        return new C1058Jc(c1014Hj, c1012Hh, bArr, AbstractC1015Hk.A0D(c07084v, c1014Hj.A05), AbstractC1015Hk.A00(r6.length - 1));
    }

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 29);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{-108, -88, -105, -100, -94, 98, -87, -94, -91, -107, -100, -90};
    }

    static {
        A04();
    }

    public static int A00(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    public static int A01(byte b, C1058Jc c1058Jc) {
        if (!c1058Jc.A04[A00(b, c1058Jc.A00, 1)].A03) {
            int modeNumber = c1058Jc.A02.A03;
            return modeNumber;
        }
        int modeNumber2 = c1058Jc.A02.A04;
        return modeNumber2;
    }

    public static void A05(C07084v c07084v, long j) {
        if (c07084v.A08() < c07084v.A0A() + 4) {
            c07084v.A0i(Arrays.copyOf(c07084v.A0l(), c07084v.A0A() + 4));
        } else {
            c07084v.A0e(c07084v.A0A() + 4);
        }
        byte[] bArrA0l = c07084v.A0l();
        bArrA0l[c07084v.A0A() - 4] = (byte) (j & 255);
        bArrA0l[c07084v.A0A() - 3] = (byte) ((j >>> 8) & 255);
        bArrA0l[c07084v.A0A() - 2] = (byte) ((j >>> 16) & 255);
        bArrA0l[c07084v.A0A() - 1] = (byte) (255 & (j >>> 24));
    }

    public static boolean A06(C07084v c07084v) {
        try {
            return AbstractC1015Hk.A0C(1, c07084v, true);
        } catch (C3K unused) {
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1057Jb
    public final long A09(C07084v c07084v) {
        int i = 0;
        if ((c07084v.A0l()[0] & 1) == 1) {
            return -1L;
        }
        byte b = c07084v.A0l()[0];
        if (A06[4].charAt(1) != 'C') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[0] = "17tCp0Qcd";
        strArr[6] = "uqZ30DdcDRhFwj0kQ";
        int samplesInPacket = A01(b, (C1058Jc) AbstractC06853y.A02(this.A03));
        if (this.A04) {
            int packetBlockSize = this.A00;
            i = (packetBlockSize + samplesInPacket) / 4;
        }
        A05(c07084v, i);
        this.A04 = true;
        this.A00 = samplesInPacket;
        return i;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1057Jb
    public final void A0A(long j) {
        super.A0A(j);
        this.A04 = j != 0;
        this.A00 = this.A02 != null ? this.A02.A03 : 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1057Jb
    public final void A0B(boolean z) {
        super.A0B(z);
        if (z) {
            this.A03 = null;
            this.A02 = null;
            this.A01 = null;
        }
        this.A00 = 0;
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1057Jb
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean A0C(C07084v c07084v, long j, C1056Ja c1056Ja) throws IOException {
        if (this.A03 != null) {
            AbstractC06853y.A01(c1056Ja.A00);
            return false;
        }
        this.A03 = A02(c07084v);
        if (this.A03 == null) {
            return true;
        }
        C1058Jc c1058Jc = this.A03;
        C1014Hj c1014Hj = c1058Jc.A02;
        ArrayList<byte[]> codecInitializationData = new ArrayList<>();
        codecInitializationData.add(c1014Hj.A09);
        codecInitializationData.add(c1058Jc.A03);
        c1056Ja.A00 = new C06522p().A11(A03(0, 12, 22)).A0a(c1014Hj.A02).A0j(c1014Hj.A00).A0b(c1014Hj.A05).A0m(c1014Hj.A06).A12(codecInitializationData).A0v(AbstractC1015Hk.A02(MetaExoPlayerCustomizedCollections.A02(c1058Jc.A01.A02))).A14();
        return true;
    }
}
