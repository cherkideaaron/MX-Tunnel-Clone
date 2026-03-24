package com.facebook.ads.redexgen.core;

import android.content.Context;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class ZR implements TA {
    public static ZR A07;
    public static byte[] A08;
    public InterfaceC1131Lx A00;
    public T1 A01;
    public T9 A02;
    public TP A03;
    public U7 A04;
    public VM A05;
    public CY A06;

    static {
        A07();
    }

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 118);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A08 = new byte[]{44, 62, 76, 76, 66, 72, 71, -7, 61, 58, 77, 58, -7, 66, 71, 66, 77, 66, 58, 69, 66, 83, 62, 61, 28, -13, -19, 32, 27, -15, 28, 15, 26, 25, 28, 30, -3, 15, 29, 29, 19, 25, 24, -18, 11, 30, 11, -13, 24, 19, 30, 19, 11, 22, 19, 36, 15, 14};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0C(C1897ge c1897ge) {
        if (this.A06 != null) {
            return;
        }
        this.A03 = A01(c1897ge);
        this.A06 = A05(c1897ge, this.A03, A03(c1897ge));
        A09(c1897ge, A00(c1897ge, this.A06));
        A0A(c1897ge, this.A06);
        A0B(c1897ge, this.A06);
        if (this.A06 != null) {
            this.A06.A6d();
        }
    }

    public static SR A00(C1897ge c1897ge, CY cy) {
        if (!C1351Up.A1r(c1897ge) || cy == null) {
            return null;
        }
        return SS.A00().A00(cy);
    }

    public static TP A01(C1897ge c1897ge) {
        return TQ.A00().A00(c1897ge, new C1600bp());
    }

    public static synchronized ZR A02() {
        if (A07 == null) {
            A07 = new ZR();
        }
        return A07;
    }

    public static InterfaceC1852fv A03(C1897ge c1897ge) {
        if (!C1351Up.A1n(c1897ge)) {
            return null;
        }
        return C1870gD.A01(c1897ge);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.TA
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final synchronized CY A9F() {
        return this.A06;
    }

    public static CY A05(C1897ge c1897ge, TP tp, InterfaceC1852fv interfaceC1852fv) {
        if (!C1351Up.A2m(c1897ge) || interfaceC1852fv == null || ProcessUtils.isRemoteRenderingProcess()) {
            return null;
        }
        return AbstractC1893ga.A00().A00(c1897ge, tp, interfaceC1852fv, WI.A04(c1897ge), new ZW(new WA(c1897ge, A06(0, 0, 9), null, EnumC1376Vq.A08, 0, new C1380Vu(), AbstractC1428Xt.A01(C1351Up.A0N(c1897ge)), null, null, new C2020ij()), c1897ge), C1891gY.A00().A00());
    }

    public static void A08() {
        AbstractC1384Vy.A05(A06(30, 28, 52), A06(0, 24, 99), A06(24, 6, 68));
    }

    public static void A09(C1897ge c1897ge, SR sr) {
        if (!C1351Up.A1r(c1897ge) || sr == null) {
            return;
        }
        SP.A00().A00(sr, c1897ge);
    }

    public static void A0A(C1897ge c1897ge, CY cy) {
        if (!C1351Up.A0m(c1897ge) || cy == null) {
            return;
        }
        new C1296Sm(c1897ge, cy, new C1297Sn(), DynamicLoaderImpl.getBidderTokenProviderApi().A00());
    }

    public static void A0B(C1897ge c1897ge, CY cy) {
        if (cy == null) {
            return;
        }
        AbstractC1355Ut.A00(c1897ge, cy);
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final VA A6n(C1897ge c1897ge) {
        return WW.A01(c1897ge);
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized T9 A74(T8 t8) {
        if (this.A02 == null) {
            this.A02 = new C1467Zg(this);
        }
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized T1 A7G() {
        if (this.A01 == null) {
            this.A01 = new C1902gj();
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized TP A7l(T8 t8) {
        if (this.A03 == null) {
            this.A03 = A01(t8.A02());
        }
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized InterfaceC1312Tc A7n(T8 t8) {
        return new C1795f0(t8);
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized TB A7x(final T8 t8) {
        return new AbstractC1599bo(t8) { // from class: com.facebook.ads.redexgen.X.72
            @Override // com.facebook.ads.redexgen.core.TB
            public final boolean A9m() {
                return TextureViewSurfaceTextureListenerC0901Cz.A09();
            }

            @Override // com.facebook.ads.redexgen.core.TB
            public final void ACP() {
                U2.A06(C1274Rp.A09(super.A00));
            }

            @Override // com.facebook.ads.redexgen.core.TB
            public final void ACn() {
                U2.A07(C1274Rp.A09(super.A00));
            }

            @Override // com.facebook.ads.redexgen.core.TB
            public final void ADI(C1897ge c1897ge) {
                OP.A01(c1897ge);
            }
        };
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized InterfaceC1131Lx A8C(T8 t8) {
        if (!C1351Up.A13(t8)) {
            return null;
        }
        if (this.A00 == null) {
            this.A00 = AbstractC1132Ly.A00().A00(new C1563bE(t8));
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized TD A8y(T8 t8) {
        return new C1537ao(t8);
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final C1897ge A8z(Context context) {
        C1897ge sdkContext = T7.A00();
        if (sdkContext == null) {
            C1897ge sdkContext2 = new C1897ge(context, this);
            T7.A01(sdkContext2);
            return sdkContext2;
        }
        return sdkContext;
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized VM A90(C1897ge c1897ge) {
        if (this.A05 == null) {
            this.A05 = new XP(c1897ge);
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.core.TA
    public final synchronized U7 A96() {
        if (this.A04 == null) {
            this.A04 = new U7();
            A08();
        }
        return this.A04;
    }
}
