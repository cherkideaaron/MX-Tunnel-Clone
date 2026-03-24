package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.r5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2493r5 {
    public static C2493r5 A03;
    public static InterfaceC2516rX A04;
    public static byte[] A05;
    public static String[] A06 = {"5DKKU3xZINN65fryyoBt5QQPLIMTkohn", "LFzimA69beWaSFXyztzupLxdNfHOQ", "XSuolM5aqTyza3oApgyv2R2QmsMDCJc3", "zWK24MgLV", "4", "qJClZMWv8", "0fmkfxUqb1vnRdlz6H0UDHtVT1WIbpOa", "oRXxD"};
    public final ViewpointQeConfig A00;
    public final ViewpointRegistry A01;
    public final C2503rF A02;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = bArrCopyOfRange[i4];
            if (A06[4].length() == 19) {
                throw new RuntimeException();
            }
            A06[6] = "At1Zr1oMV19x7NxsOWFoG9shzyjt72Ks";
            bArrCopyOfRange[i4] = (byte) ((b - i3) - 7);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{-89, -74, -87, -91, -72, -87};
    }

    static {
        A03();
        A03 = null;
        A04 = null;
    }

    public C2493r5(ViewpointQeConfig viewpointQeConfig, AbstractC2508rL abstractC2508rL, C2503rF c2503rF, ViewpointRegistry viewpointRegistry) {
        this.A00 = viewpointQeConfig;
        this.A01 = viewpointRegistry;
        this.A02 = c2503rF;
        abstractC2508rL.A03(new C0838Aj(c2503rF));
    }

    public static ScanDelayController A00(int i) {
        if (0 == 0) {
            return null;
        }
        throw new NullPointerException(A02(0, 6, 61));
    }

    public static C2493r5 A01(ViewpointQeConfig viewpointQeConfig, AbstractC2508rL abstractC2508rL, InterfaceC2513rQ interfaceC2513rQ, InterfaceC0839Al interfaceC0839Al, ViewpointAutoOcclusion viewpointAutoOcclusion) {
        C2493r5 c2493r5 = A03;
        if (c2493r5 != null) {
            return c2493r5;
        }
        ViewpointRegistry viewpointRegistry = new ViewpointRegistry(viewpointQeConfig);
        CK ck = CK.A00;
        Handler handler = new Handler(Looper.getMainLooper());
        A00(100);
        return new C2493r5(viewpointQeConfig, abstractC2508rL, new C2503rF(viewpointQeConfig, interfaceC2513rQ, ck, interfaceC0839Al, viewpointRegistry, viewpointAutoOcclusion, handler, null), viewpointRegistry);
    }

    public final void A04(InterfaceC2507rK interfaceC2507rK) {
        this.A02.A0H(interfaceC2507rK);
    }

    public final void A05(InterfaceC2505rI interfaceC2505rI) {
        this.A02.A0I(interfaceC2505rI);
    }

    public final void A06(DspViewableNode dspViewableNode) {
        A07(dspViewableNode, null);
    }

    public final void A07(DspViewableNode dspViewableNode, C2514rU c2514rU) {
        if (this.A00.A00 && c2514rU != null) {
            this.A01.A06(dspViewableNode, c2514rU);
        } else {
            this.A01.A05(dspViewableNode);
        }
    }

    public final void A08(DspViewableNode dspViewableNode, C2514rU c2514rU, C2510rN c2510rN) {
        if (this.A00.A00 && c2514rU != null) {
            this.A01.A07(dspViewableNode, c2514rU, c2510rN);
        } else {
            this.A01.A08(dspViewableNode, c2510rN);
        }
    }

    public final void A09(DspViewableNode dspViewableNode, C2510rN c2510rN) {
        A08(dspViewableNode, null, c2510rN);
    }
}
