package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.jl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2074jl extends N3 {
    public static byte[] A06;
    public static final String A07;
    public C2076jn A00;
    public EnumC1375Vp A01;
    public boolean A02;
    public final C1901gi A03;
    public final VA A04;
    public final AbstractC1547ay A05;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 53);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{-55, -56, -43, -43, -52, -39};
    }

    static {
        A05();
        A07 = C2074jl.class.getSimpleName();
    }

    public C2074jl(C1901gi c1901gi, VA va, AbstractC1547ay abstractC1547ay, C1846fp c1846fp, N4 n4, EnumC1375Vp enumC1375Vp) {
        super(c1901gi, n4, c1846fp);
        this.A04 = va;
        this.A05 = abstractC1547ay;
        this.A03 = c1901gi;
        this.A01 = enumC1375Vp;
    }

    @Override // com.facebook.ads.redexgen.core.N3
    public final void A08(Map<String, String> map) {
        String string;
        if (this.A00 != null && !TextUtils.isEmpty(this.A00.A7O())) {
            this.A03.A0F().A3L();
            AbstractC1185Oa.A02(this.A00.A05(), AbstractC1421Xm.A00(A04(0, 6, 50)));
            this.A04.ABJ(this.A00.A7O(), map);
            if (C1351Up.A1A(this.A03)) {
                if (this.A01 == EnumC1375Vp.A09) {
                    string = AdPlacementType.MEDIUM_RECTANGLE.toString();
                } else {
                    string = AdPlacementType.BANNER.toString();
                }
                C1397Wl c1397WlA00 = C1397Wl.A00(this.A03);
                String placementType = this.A00.A7O();
                c1397WlA00.A0E(string, placementType);
            }
        }
    }

    public final synchronized void A09() {
        if (!this.A02 && this.A00 != null) {
            this.A02 = true;
            if (!TextUtils.isEmpty(this.A00.A03())) {
                Y4.A00(new C2075jm(this));
            }
        }
    }

    public final void A0A(C2076jn c2076jn) {
        this.A00 = c2076jn;
    }
}
