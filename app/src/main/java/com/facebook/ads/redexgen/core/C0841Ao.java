package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* renamed from: com.facebook.ads.redexgen.X.Ao, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0841Ao implements SharedViewpointManager {
    public static boolean A07;
    public static byte[] A08;
    public InterfaceC2517rY A00;
    public InterfaceC2505rI A01;
    public C2493r5 A02;
    public final InterfaceC2506rJ A04;
    public final ViewpointQeConfig A05;
    public final LinkedHashMap<Integer, Runnable> A06 = new LinkedHashMap<>();
    public final InterfaceC2505rI A03 = new C0842Ap(this);

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 106);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A08 = new byte[]{-28};
    }

    static {
        A04();
        A07 = false;
    }

    public C0841Ao(ViewpointQeConfig viewpointQeConfig, InterfaceC2517rY interfaceC2517rY, InterfaceC2506rJ interfaceC2506rJ) {
        this.A05 = viewpointQeConfig;
        this.A00 = interfaceC2517rY;
        this.A04 = interfaceC2506rJ;
    }

    public static C0841Ao A01() {
        return new C0841Ao(new ViewpointQeConfig(), new C0844Ar(), null);
    }

    private void A05(AbstractC2508rL abstractC2508rL, InterfaceC2513rQ interfaceC2513rQ, InterfaceC0839Al interfaceC0839Al, ViewpointAutoOcclusion viewpointAutoOcclusion) {
        this.A02 = C2493r5.A01(this.A05, abstractC2508rL, interfaceC2513rQ, interfaceC0839Al, viewpointAutoOcclusion);
        if (0 != 0) {
            this.A02.A04(null);
        }
        this.A02.A05(this.A03);
    }

    private void A06(DspViewableNode dspViewableNode, C2514rU c2514rU) {
        C2493r5 c2493r5 = this.A02;
        if (c2493r5 != null && dspViewableNode != null) {
            if (this.A05.A00 && c2514rU != null) {
                c2493r5.A07(dspViewableNode, c2514rU);
            } else {
                c2493r5.A06(dspViewableNode);
            }
        }
    }

    private void A07(DspViewableNode dspViewableNode, C2514rU c2514rU, C2510rN c2510rN) {
        C2493r5 c2493r5 = this.A02;
        if (c2493r5 != null && dspViewableNode != null && c2510rN != null) {
            if (this.A05.A00 && c2514rU != null) {
                c2510rN.A02 = dspViewableNode.hashCode() + A02(0, 1, 27) + c2510rN.A08 + c2514rU;
                c2493r5.A08(dspViewableNode, c2514rU, c2510rN);
            } else {
                c2493r5.A09(dspViewableNode, c2510rN);
            }
        }
    }

    public final void A08(View view) {
        A06(view != null ? ViewpointViewNode.A00(view) : null, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    public final void A09(View view, C2510rN<?, ?> c2510rN) {
        A07(view != null ? ViewpointViewNode.A00(view) : null, null, c2510rN);
    }

    public final void A0A(AbstractC2508rL abstractC2508rL, View view) {
        if (abstractC2508rL != null && view != null) {
            A05(abstractC2508rL, new C0843Aq(view, this.A00), new C06331u(null), null);
        }
    }
}
