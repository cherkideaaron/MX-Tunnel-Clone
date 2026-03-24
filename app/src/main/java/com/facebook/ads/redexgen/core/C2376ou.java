package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ou, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2376ou implements InterfaceC07847t {
    public static byte[] A05;
    public EP A00;
    public final int A01;
    public final long A02;
    public final Context A03;
    public final A6 A04;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 82);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-77, -44, -43, -48, -28, -37, -29, -63, -44, -35, -45, -44, -31, -44, -31, -30, -75, -48, -46, -29, -34, -31, -24, -95, -50, -50, -53, -50, 124, -59, -54, -49, -48, -67, -54, -48, -59, -67, -48, -59, -54, -61, 124, -94, -94, -55, -52, -63, -61, 124, -63, -44, -48, -63, -54, -49, -59, -53, -54, -70, -25, -25, -28, -25, -107, -34, -29, -24, -23, -42, -29, -23, -34, -42, -23, -34, -29, -36, -107, -69, -63, -74, -72, -107, -38, -19, -23, -38, -29, -24, -34, -28, -29, -12, 33, 33, 30, 33, -49, 24, 29, 34, 35, 16, 29, 35, 24, 16, 35, 24, 29, 22, -49, -2, 31, 36, 34, -49, 20, 39, 35, 20, 29, 34, 24, 30, 29, 6, 51, 51, 48, 51, -31, 42, 47, 52, 53, 34, 47, 53, 42, 34, 53, 42, 47, 40, -31, 23, 17, -6, -31, 38, 57, 53, 38, 47, 52, 42, 48, 47, 16, 51, 37, 40, 41, 40, -28, 10, 42, 49, 52, 41, 43, 5, 57, 40, 45, 51, 22, 41, 50, 40, 41, 54, 41, 54, -14, 14, 49, 35, 38, 39, 38, -30, 14, 43, 36, 40, 46, 35, 37, 3, 55, 38, 43, 49, 20, 39, 48, 38, 39, 52, 39, 52, -16, 6, 41, 27, 30, 31, 30, -38, 6, 35, 28, 41, 42, 47, 45, -5, 47, 30, 35, 41, 12, 31, 40, 30, 31, 44, 31, 44, -24, 4, 39, 25, 28, 29, 28, -40, 4, 33, 26, 46, 40, 48, 14, 33, 28, 29, 39, 10, 29, 38, 28, 29, 42, 29, 42, -26, -7, 5, 3, -60, -4, -9, -7, -5, -8, 5, 5, 1, -60, -9, -6, 9, -60, -9, 4, -6, 8, 5, -1, -6, 14, -60, 3, -5, -6, -1, -9, -55, -60, -5, 14, 5, 6, 2, -9, 15, -5, 8, -60, -5, 14, 10, -60, -4, -4, 3, 6, -5, -3, -60, -36, -4, 3, 6, -5, -3, -41, 11, -6, -1, 5, -24, -5, 4, -6, -5, 8, -5, 8, 27, 39, 37, -26, 30, 25, 27, 29, 26, 39, 39, 35, -26, 25, 28, 43, -26, 25, 38, 28, 42, 39, 33, 28, 48, -26, 37, 29, 28, 33, 25, -21, -26, 29, 48, 39, 40, 36, 25, 49, 29, 42, -26, 29, 48, 44, -26, 30, 36, 25, 27, -26, 4, 33, 26, 30, 36, 25, 27, -7, 45, 28, 33, 39, 10, 29, 38, 28, 29, 42, 29, 42, -56, -44, -46, -109, -53, -58, -56, -54, -57, -44, -44, -48, -109, -58, -55, -40, -109, -58, -45, -55, -41, -44, -50, -55, -35, -109, -46, -54, -55, -50, -58, -104, -109, -54, -35, -44, -43, -47, -58, -34, -54, -41, -109, -54, -35, -39, -109, -44, -43, -38, -40, -109, -79, -50, -57, -44, -43, -38, -40, -90, -38, -55, -50, -44, -73, -54, -45, -55, -54, -41, -54, -41, 35, 47, 45, -18, 38, 33, 35, 37, 34, 47, 47, 43, -18, 33, 36, 51, -18, 33, 46, 36, 50, 47, 41, 36, 56, -18, 45, 37, 36, 41, 33, -13, -18, 37, 56, 47, 48, 44, 33, 57, 37, 50, -18, 37, 56, 52, -18, 54, 48, -7, -18, 12, 41, 34, 54, 48, 56, 22, 41, 36, 37, 47, 18, 37, 46, 36, 37, 50, 37, 50};
    }

    public C2376ou(Context context) {
        this(context, 0);
    }

    public C2376ou(Context context, int i) {
        this(context, null, i, 5000L);
    }

    @Deprecated
    public C2376ou(Context context, A6 a6, int i, long j) {
        this.A00 = new C2377ov(this);
        this.A03 = context;
        this.A01 = i;
        this.A02 = j;
        this.A04 = a6;
    }

    private final void A02(Context context, A6 a6, long j, Handler handler, GQ gq, int extensionRendererIndex, ArrayList<InterfaceC2370oo> arrayList) throws Exception {
        arrayList.add(new AnonymousClass10(context, C2057jQ.A0T, new MediaCodecRendererMetaParameters(null, false), BT.A00, j, a6, false, false, handler, gq, 50, 5, 0, 0, 0));
        if (extensionRendererIndex == 0) {
            return;
        }
        int size = arrayList.size();
        if (extensionRendererIndex == 2) {
            size--;
        }
        try {
            try {
                Class<?> cls = Class.forName(A00(487, 70, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD));
                Class<?> clazz = Boolean.TYPE;
                Class<?> clazz2 = Long.TYPE;
                Class<?> clazz3 = Integer.TYPE;
                try {
                    arrayList.add(size, (InterfaceC2370oo) cls.getConstructor(clazz, clazz2, Handler.class, GQ.class, clazz3, clazz3).newInstance(true, Long.valueOf(j), handler, gq, 50, 5));
                    Log.i(A00(0, 23, 29), A00(243, 27, FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH));
                } catch (Exception e) {
                    e = e;
                    throw new RuntimeException(A00(127, 33, FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION), e);
                }
            } catch (ClassNotFoundException unused) {
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:5|(1:7)|8|(2:44|9)|(2:42|10)|46|18|48|19|(5:38|27|40|28|34)) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00da, code lost:
    
        r3 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00dc, code lost:
    
        r3 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ec, code lost:
    
        throw new java.lang.RuntimeException(A00(59, 34, 35), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ed, code lost:
    
        r7 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ee, code lost:
    
        r6 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A03(android.content.Context r24, com.facebook.ads.redexgen.core.A6 r25, com.facebook.ads.redexgen.core.InterfaceC06713k[] r26, android.os.Handler r27, com.facebook.ads.redexgen.core.InterfaceC08058p r28, int r29, java.util.ArrayList<com.facebook.ads.redexgen.core.InterfaceC2370oo> r30) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2376ou.A03(android.content.Context, com.facebook.ads.redexgen.X.A6, com.facebook.ads.redexgen.X.3k[], android.os.Handler, com.facebook.ads.redexgen.X.8p, int, java.util.ArrayList):void");
    }

    private final void A04(Context context, InterfaceC0858Bf interfaceC0858Bf, Looper looper, int i, ArrayList<InterfaceC2370oo> arrayList) {
        arrayList.add(new C06181f(interfaceC0858Bf, looper));
    }

    private final void A05(Context context, ES es, Looper looper, int i, ArrayList<InterfaceC2370oo> arrayList) {
        arrayList.add(new C06141b(es, looper, this.A00));
    }

    private final InterfaceC06713k[] A06() {
        return new InterfaceC06713k[0];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC07847t
    public final InterfaceC2370oo[] A5Y(Handler handler, GQ gq, InterfaceC08058p interfaceC08058p, ES es, InterfaceC0858Bf interfaceC0858Bf, A6 a6) throws Exception {
        A6 a62 = a6;
        if (a62 == null) {
            a62 = this.A04;
        }
        ArrayList<InterfaceC2370oo> arrayList = new ArrayList<>();
        A02(this.A03, a62, this.A02, handler, gq, this.A01, arrayList);
        A03(this.A03, a62, A06(), handler, interfaceC08058p, this.A01, arrayList);
        A05(this.A03, es, handler.getLooper(), this.A01, arrayList);
        A04(this.A03, interfaceC0858Bf, handler.getLooper(), this.A01, arrayList);
        return (InterfaceC2370oo[]) arrayList.toArray(new InterfaceC2370oo[arrayList.size()]);
    }
}
