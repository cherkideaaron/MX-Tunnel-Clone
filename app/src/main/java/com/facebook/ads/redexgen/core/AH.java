package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public final class AH implements InterfaceC2397pF {
    public static byte[] A03;
    public final int A00;
    public final AbstractC06663d A01;
    public final InterfaceC2397pF A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 41);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{1, 3, 0, -12, -10, -10, -11, -32, 3, -27, -7, 3, 0, 8};
    }

    public AH(InterfaceC2397pF interfaceC2397pF, AbstractC06663d abstractC06663d, int i) {
        this.A02 = (InterfaceC2397pF) AbstractC06853y.A01(interfaceC2397pF);
        AbstractC06853y.A01(abstractC06663d);
        this.A01 = null;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2397pF
    public final void A43(InterfaceC07325t interfaceC07325t) {
        AbstractC06853y.A01(interfaceC07325t);
        this.A02.A43(interfaceC07325t);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2397pF
    public final Map<String, List<String>> A8t() {
        return this.A02.A8t();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2397pF
    public final Uri A9P() {
        return this.A02.A9P();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2397pF
    public final long AGi(C07215i c07215i) throws IOException {
        throw new NullPointerException(A00(0, 14, FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2397pF
    public final void close() throws IOException {
        this.A02.close();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC06412c
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        throw new NullPointerException(A00(0, 14, FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION));
    }
}
