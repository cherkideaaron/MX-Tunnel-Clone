package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.12, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass12 extends AbstractC06191g implements AnonymousClass78 {
    public static byte[] A0J;
    public static String[] A0K = {"77C8vP87Fd7b4BP9SQRJBzWPVk4TewQg", "oQ2qsKrmaNuyaLFB2ph9zkmGtpzAonXt", "MDqZPLCoXCzEQwxPxYtAKuxbh2tAcx1k", "aWPkhw6gWy0BTxYknUchyjQmABWF", "ais5GYfL5LR1KEYd6HRi1BBd2kmjCeGs", "pdewp8MC9mt7vaqV0Zkeu3U5mw150Zm9", "qv2CVs2gAdpJ8ZKBYAbfHfBiBdoePlCI", "lcPZgHPLbCISPmjsMn5qIGSBsvlpomMq"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public MediaFormat A06;
    public C2461qI A07;
    public InterfaceC07727h A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final Context A0E;
    public final C08048o A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final InterfaceC08128z A0I;

    public static String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0J, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = bArrCopyOfRange[i4];
            if (A0K[3].length() != 28) {
                throw new RuntimeException();
            }
            String[] strArr = A0K;
            strArr[4] = "GcWDzLLiTAl0tD46XyRRBcNodd92JrSP";
            strArr[0] = "GhxldHXMoVDog6OAV5RKTarDpyl0kviC";
            bArrCopyOfRange[i4] = (byte) ((b - i3) - 65);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A0J = new byte[]{-103, -79, -80, -75, -83, -113, -69, -80, -79, -81, -115, -63, -80, -75, -69, -98, -79, -70, -80, -79, -66, -79, -66, -77, -79, -68, -110, -73, -87, -89, -110, -59, -59, -57, -110, -56, -55, -57, -36, -38, -27, -69, -12, -4, -4, -12, -7, -14, -69, -1, -18, 4, -69, -15, -14, -16, -4, -15, -14, -1, -17, -17, -15, -69, -14, 0, -15, -69, -13, -12, -12, -13, -15, 2, -69, 2, 7, -2, -13, -51, -51, -49, -103, -32, -51, -34, -45, -47, -32, -103, -34, -47, -46, -103, -40, -47, -30, -47, -40, 7, 27, 10, 15, 21, -43, 24, 7, 29, 20, 25, 18, 31, 31, 22, 29, -34, 20, 32, 38, 31, 37, -85, -88, -75, -78, -81, -73, -88, -31, -34, -21, -24, -22, -27, -19, -34, -54, -66, -43, -118, -58, -53, -51, -46, -47, -118, -48, -58, -41, -62, -39, -43, -39, -47, -68, -65, -125, -80, 125, -125, 127, 125, -125, -127, -64, -62, -71, -65, -62, -71, -60, -55, -65, -83, -71, -68, -72, -79, 121, -66, -83, -64, -79, -27, -45, -33, -27, -25, -32, -39, -47, -68, -55, -58, -67, -61, -53, -68};
    }

    static {
        A09();
    }

    public AnonymousClass12(Context context, C2057jQ c2057jQ, MediaCodecRendererMetaParameters mediaCodecRendererMetaParameters, BT bt, A6 a6, boolean z, boolean z2, boolean z3, Handler handler, InterfaceC08058p interfaceC08058p, C8R c8r, InterfaceC06713k... interfaceC06713kArr) {
        this(context, c2057jQ, mediaCodecRendererMetaParameters, bt, a6, z, z2, z3, handler, interfaceC08058p, new C2342oM(c8r, interfaceC06713kArr));
    }

    public AnonymousClass12(Context context, C2057jQ c2057jQ, MediaCodecRendererMetaParameters mediaCodecRendererMetaParameters, BT bt, A6 a6, boolean z, boolean z2, boolean z3, Handler handler, InterfaceC08058p interfaceC08058p, InterfaceC08128z interfaceC08128z) {
        super(1, c2057jQ, mediaCodecRendererMetaParameters, bt, a6, z, false, 0, 0);
        this.A01 = 0;
        this.A02 = 0;
        this.A05 = 0L;
        this.A0E = context.getApplicationContext();
        this.A0I = interfaceC08128z;
        this.A0G = z2;
        this.A0H = z3;
        this.A0F = new C08048o(handler, interfaceC08058p);
        interfaceC08128z.AJV(new C2340oK(this));
        interfaceC08128z.AJQ(c2057jQ.A0D);
    }

    @MetaExoPlayerCustomization("Added in D36293647 for DRC")
    private int A00() {
        int i = this.A0z.A09;
        if (this.A0z.A0F) {
            int i2 = this.A0z.A03;
            int i3 = this.A0z.A04;
            int xHEAACEffectType = this.A0z.A05;
            return ContextAwareXHEAACDRCTypeUtil.A00(i2, i3, xHEAACEffectType);
        }
        return i;
    }

    public static int A01(C2461qI c2461qI) {
        if (A07(99, 9, FacebookMediationAdapter.ERROR_INVALID_SERVER_PARAMETERS).equals(c2461qI.A0W)) {
            return c2461qI.A0C;
        }
        return 2;
    }

    private int A02(B3 b3, C2461qI c2461qI) {
        if (A07(38, 22, 76).equals(b3.A03) && C5C.A02 < 24) {
            int i = C5C.A02;
            String[] strArr = A0K;
            if (strArr[2].charAt(3) != strArr[7].charAt(3)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[2] = "s8yZpZp8nIrL7EQY3mPJ1kqCekDwsY6i";
            strArr2[7] = "yd2Z0BEEocl53iuZqAxtcOKT0DXRknsH";
            if (i != 23 || !C5C.A18(this.A0E)) {
                String[] strArr3 = A0K;
                if (strArr3[4].charAt(18) != strArr3[0].charAt(18)) {
                    throw new RuntimeException();
                }
                A0K[3] = "9QHOUbokymVnxuZO6z7rLJCC2XoG";
                return -1;
            }
        }
        int i2 = c2461qI.A0B;
        String[] strArr4 = A0K;
        if (strArr4[2].charAt(3) != strArr4[7].charAt(3)) {
            return i2;
        }
        String[] strArr5 = A0K;
        strArr5[2] = "bWiZaXhFQHkoAXZnJ4ncaGOlncM6vz1V";
        strArr5[7] = "kg6ZwO8ePPrkJPsuoAADu0ZS0U6OWo96";
        return i2;
    }

    private final int A03(B3 b3, C2461qI c2461qI, C2461qI[] c2461qIArr) {
        int maxInputSize = A02(b3, c2461qI);
        return maxInputSize;
    }

    private final MediaFormat A04(C2461qI c2461qI, String str, int i) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(A07(150, 4, 43), str);
        mediaFormat.setInteger(A07(FacebookMediationAdapter.ERROR_MAPPING_NATIVE_ASSETS, 13, 112), c2461qI.A06);
        mediaFormat.setInteger(A07(172, 11, 11), c2461qI.A0G);
        AbstractC06954i.A06(mediaFormat, c2461qI.A0X);
        AbstractC06954i.A04(mediaFormat, A07(136, 14, 28), i);
        if (C5C.A02 >= 23) {
            String strA07 = A07(164, 8, 15);
            String[] strArr = A0K;
            if (strArr[4].charAt(18) != strArr[0].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[1] = "w8gjBPJzE632nZpBrlzwe1tLIvq8CsOY";
            strArr2[6] = "ag3DPBWcd6fSOrmBwunkDpt77Nl4HY4l";
            mediaFormat.setInteger(strA07, 0);
        }
        if (c2461qI.A0R != null && c2461qI.A0R.equals(A07(154, 10, 14)) && this.A0z.A0G) {
            mediaFormat.setInteger(A07(60, 19, 77), A00());
            mediaFormat.setInteger(A07(79, 20, 43), this.A0z.A0A);
        }
        return mediaFormat;
    }

    public static /* synthetic */ InterfaceC07727h A05(AnonymousClass12 anonymousClass12) {
        return null;
    }

    private void A08() {
        long jA7f = this.A0I.A7f(AAP());
        if (jA7f != Long.MIN_VALUE) {
            if (!this.A0A) {
                long j = this.A04;
                String[] strArr = A0K;
                if (strArr[2].charAt(3) != strArr[7].charAt(3)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0K;
                strArr2[4] = "nIJcPeFAtvuDBzBlXMRw0HpU2OMpTIMr";
                strArr2[0] = "dapTBdH8hqStbvnLCARUyCc0T0ChI3T8";
                jA7f = Math.max(j, jA7f);
            }
            this.A04 = jA7f;
            this.A0A = false;
        }
    }

    private boolean A0A(C2461qI c2461qI) {
        String str = c2461qI.A0W;
        String mimeType = A07(99, 9, FacebookMediationAdapter.ERROR_INVALID_SERVER_PARAMETERS);
        if (!mimeType.equals(str)) {
            return this.A0I.AKN(c2461qI);
        }
        String[] strArr = A0K;
        if (strArr[2].charAt(3) != strArr[7].charAt(3)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0K;
        strArr2[4] = "mDVewdn3RvQYeqn2qaR7zJPFTyK9zqzw";
        strArr2[0] = "a0e3mP5dmYOn07QMhHRhkP7lbfukdIg9";
        return false;
    }

    public static boolean A0B(String str) {
        if (C5C.A02 < 24 && A07(23, 15, 35).equals(str)) {
            if (A07(183, 7, 49).equals(C5C.A05) && (C5C.A03.startsWith(A07(190, 8, 22)) || C5C.A03.startsWith(A07(121, 7, 2)) || C5C.A03.startsWith(A07(UserVerificationMethods.USER_VERIFY_PATTERN, 8, 56)))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC06191g, com.facebook.ads.redexgen.core.AE
    public final void A1X() {
        super.A1X();
        this.A0I.AH0();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC06191g, com.facebook.ads.redexgen.core.AE
    public final void A1Y() {
        A08();
        this.A0I.pause();
        super.A1Y();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC06191g, com.facebook.ads.redexgen.core.AE
    public final void A1Z() {
        try {
            this.A0I.flush();
            try {
                super.A1Z();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.A1Z();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC06191g, com.facebook.ads.redexgen.core.AE
    public final void A1a(long j, boolean z) throws AD {
        super.A1a(j, z);
        if (this.A0C) {
            this.A0I.A6T();
        } else {
            this.A0I.flush();
        }
        this.A04 = j;
        this.A09 = true;
        this.A0A = true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC06191g, com.facebook.ads.redexgen.core.AE
    public final void A1b(boolean z, boolean z2) throws AD {
        super.A1b(z, z2);
        this.A0F.A08(this.A0h);
        if (A1V().A00) {
            this.A0I.A6M();
        } else {
            this.A0I.A5z();
        }
        this.A0I.AJg(A1W());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC06191g
    public final int A1g(B0 b0, B3 b3, C2461qI c2461qI, C2461qI c2461qI2) {
        if (this.A0z.A0O && A02(b3, c2461qI2) <= this.A00 && b3.A0U(c2461qI, c2461qI2, true) && c2461qI.A08 == 0 && c2461qI.A09 == 0 && c2461qI2.A08 == 0 && c2461qI2.A09 == 0) {
            return 1;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    @Override // com.facebook.ads.redexgen.core.AbstractC06191g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A1h(com.facebook.ads.redexgen.core.BT r10, com.facebook.ads.redexgen.core.A6 r11, com.facebook.ads.redexgen.core.C2461qI r12) throws com.facebook.ads.redexgen.core.BX {
        /*
            r9 = this;
            java.lang.String r4 = r12.A0W
            boolean r0 = com.facebook.ads.redexgen.core.C3J.A0C(r4)
            r3 = 0
            if (r0 != 0) goto La
            return r3
        La:
            int r0 = com.facebook.ads.redexgen.core.C5C.A02
            r5 = 21
            if (r0 < r5) goto L29
            r8 = 32
        L12:
            boolean r7 = com.facebook.ads.redexgen.core.AbstractC06191g.A1G(r12)
            r6 = 4
            if (r7 == 0) goto L2b
            boolean r0 = r9.A0A(r12)
            if (r0 == 0) goto L2b
            com.facebook.ads.redexgen.X.B3 r0 = com.facebook.ads.redexgen.core.C0853Ba.A0I()
            if (r0 == 0) goto L2b
            r0 = r8 | 8
            r0 = r0 | r6
            return r0
        L29:
            r8 = 0
            goto L12
        L2b:
            r2 = 99
            r1 = 9
            r0 = 101(0x65, float:1.42E-43)
            java.lang.String r0 = A07(r2, r1, r0)
            boolean r0 = r0.equals(r4)
            r4 = 1
            if (r0 == 0) goto L48
            com.facebook.ads.redexgen.X.8z r2 = r9.A0I
            int r1 = r12.A06
            int r0 = r12.A0C
            boolean r0 = r2.AKP(r1, r0)
            if (r0 == 0) goto L53
        L48:
            com.facebook.ads.redexgen.X.8z r1 = r9.A0I
            int r0 = r12.A06
            r2 = 2
            boolean r0 = r1.AKP(r0, r2)
            if (r0 != 0) goto L54
        L53:
            return r4
        L54:
            java.util.List r1 = r9.A1l(r10, r12, r3)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L63
            int r0 = com.facebook.ads.redexgen.core.AbstractC07737i.A00(r4)
            return r0
        L63:
            if (r7 != 0) goto L6a
            int r0 = com.facebook.ads.redexgen.core.AbstractC07737i.A00(r2)
            return r0
        L6a:
            java.lang.Object r4 = r1.get(r3)
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.AnonymousClass12.A0K
            r0 = 5
            r1 = r1[r0]
            r0 = 0
            char r1 = r1.charAt(r0)
            r0 = 112(0x70, float:1.57E-43)
            if (r1 == r0) goto L82
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L82:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.AnonymousClass12.A0K
            java.lang.String r1 = "n12bmxDOOVBzqYYOQBRjqp0moJyAYtSu"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "BaglFChNOdaklTSyUQRitIBwXJJTR14H"
            r0 = 0
            r2[r0] = r1
            com.facebook.ads.redexgen.X.B3 r4 = (com.facebook.ads.redexgen.core.B3) r4
            int r0 = com.facebook.ads.redexgen.core.C5C.A02
            if (r0 < r5) goto Lad
            int r0 = r12.A0G
            r1 = -1
            if (r0 == r1) goto La1
            int r0 = r12.A0G
            boolean r0 = r4.A0Q(r0)
            if (r0 == 0) goto Lae
        La1:
            int r0 = r12.A06
            if (r0 == r1) goto Lad
            int r0 = r12.A06
            boolean r0 = r4.A0P(r0)
            if (r0 == 0) goto Lae
        Lad:
            r3 = 1
        Lae:
            if (r3 == 0) goto Lbf
            boolean r0 = r4.A0T(r12)
            if (r0 == 0) goto Lbf
            r0 = 16
        Lb8:
            if (r3 == 0) goto Lbd
        Lba:
            r0 = r0 | r8
            r0 = r0 | r6
            return r0
        Lbd:
            r6 = 3
            goto Lba
        Lbf:
            r0 = 8
            goto Lb8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AnonymousClass12.A1h(com.facebook.ads.redexgen.X.BT, com.facebook.ads.redexgen.X.A6, com.facebook.ads.redexgen.X.qI):int");
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC06191g
    public final List<B3> A1l(BT bt, C2461qI c2461qI, boolean z) throws BX {
        B3 b3A0I;
        String mimeType = c2461qI.A0W;
        if (mimeType == null) {
            return Collections.emptyList();
        }
        if (A0A(c2461qI) && (b3A0I = C0853Ba.A0I()) != null) {
            List<B3> listSingletonList = Collections.singletonList(b3A0I);
            String[] strArr = A0K;
            if (strArr[1].charAt(15) != strArr[6].charAt(15)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[4] = "VH1rG9jH3WXhHTxnLXRxhYBKNNIMNlpD";
            strArr2[0] = "4dJInhYjvnfEcXSyIbRNEiIfORerumv3";
            return listSingletonList;
        }
        return Collections.unmodifiableList(bt.A7o(c2461qI.A0W, z, false));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC06191g
    public final void A1o() throws AD {
        try {
            this.A0I.AH2();
        } catch (C08118y e) {
            throw A1T(e, e.A01, e.A02, 5002);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC06191g
    public final void A1s(C2461qI c2461qI) throws AD {
        super.A1s(c2461qI);
        this.A07 = c2461qI;
        this.A0F.A05(this.A07, null);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC06191g
    public final void A1u(C2382p0 c2382p0) {
        if (this.A09 && !c2382p0.A04()) {
            if (Math.abs(c2382p0.A01 - this.A04) > 500000) {
                this.A04 = c2382p0.A01;
            }
            this.A09 = false;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:22:0x0099 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    @Override // com.facebook.ads.redexgen.core.AbstractC06191g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1v(com.facebook.ads.redexgen.core.B0 r9, android.media.MediaFormat r10) throws com.facebook.ads.redexgen.core.AD {
        /*
            r8 = this;
            android.media.MediaFormat r0 = r8.A06
            if (r0 == 0) goto L45
            android.media.MediaFormat r3 = r8.A06
            r2 = 150(0x96, float:2.1E-43)
            r1 = 4
            r0 = 43
            java.lang.String r0 = A07(r2, r1, r0)
            java.lang.String r0 = r3.getString(r0)
            int r5 = com.facebook.ads.redexgen.core.C3J.A00(r0)
            android.media.MediaFormat r7 = r8.A06
        L19:
            r2 = 108(0x6c, float:1.51E-43)
            r1 = 13
            r0 = 112(0x70, float:1.57E-43)
            java.lang.String r4 = A07(r2, r1, r0)
            int r6 = r7.getInteger(r4)
            r2 = 172(0xac, float:2.41E-43)
            r1 = 11
            r0 = 11
            java.lang.String r3 = A07(r2, r1, r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.AnonymousClass12.A0K
            r0 = 5
            r1 = r1[r0]
            r0 = 0
            char r1 = r1.charAt(r0)
            r0 = 112(0x70, float:1.57E-43)
            if (r1 == r0) goto L4d
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L45:
            com.facebook.ads.redexgen.X.qI r0 = r8.A07
            int r5 = A01(r0)
            r7 = r10
            goto L19
        L4d:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.AnonymousClass12.A0K
            java.lang.String r1 = "oVYorWwiJ9QuTT6BmhgOhsdn4ih9katO"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "s4BjQ2RFQmOrQGZBZgzfkwBc6WQlVCBr"
            r0 = 6
            r2[r0] = r1
            int r0 = r7.getInteger(r3)
            int r0 = r0 * r6
            r8.A03 = r0
            boolean r0 = r8.A0B
            if (r0 == 0) goto La0
            r7 = 6
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.AnonymousClass12.A0K
            r0 = 1
            r1 = r2[r0]
            r0 = 6
            r2 = r2[r0]
            r0 = 15
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L7f
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L7f:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.AnonymousClass12.A0K
            java.lang.String r1 = "pG08ZDLF1Nwa7YWNReZn10nEeTPXXDD5"
            r0 = 5
            r2[r0] = r1
            if (r6 != r7) goto La0
            com.facebook.ads.redexgen.X.qI r0 = r8.A07
            int r0 = r0.A06
            if (r0 >= r7) goto La0
            com.facebook.ads.redexgen.X.qI r0 = r8.A07
            int r0 = r0.A06
            int[] r6 = new int[r0]
            r1 = 0
        L95:
            com.facebook.ads.redexgen.X.qI r0 = r8.A07
            int r0 = r0.A06
            if (r1 >= r0) goto La1
            r6[r1] = r1
            int r1 = r1 + 1
            goto L95
        La0:
            r6 = 0
        La1:
            com.facebook.ads.redexgen.X.2p r7 = new com.facebook.ads.redexgen.X.2p
            r7.<init>()
            r2 = 99
            r1 = 9
            r0 = 101(0x65, float:1.42E-43)
            java.lang.String r0 = A07(r2, r1, r0)
            com.facebook.ads.redexgen.X.2p r0 = r7.A11(r0)
            com.facebook.ads.redexgen.X.2p r1 = r0.A0i(r5)
            int r0 = r10.getInteger(r4)
            com.facebook.ads.redexgen.X.2p r1 = r1.A0b(r0)
            int r0 = r10.getInteger(r3)
            com.facebook.ads.redexgen.X.2p r0 = r1.A0m(r0)
            com.facebook.ads.redexgen.X.qI r2 = r0.A14()
            com.facebook.ads.redexgen.X.8z r1 = r8.A0I     // Catch: com.facebook.ads.redexgen.core.C08078s -> Ld3
            r0 = 0
            r1.A59(r2, r0, r6)     // Catch: com.facebook.ads.redexgen.core.C08078s -> Ld3
            return
        Ld3:
            r2 = move-exception
            com.facebook.ads.redexgen.X.qI r1 = r2.A00
            r0 = 5001(0x1389, float:7.008E-42)
            com.facebook.ads.redexgen.X.AD r0 = r8.A1S(r2, r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AnonymousClass12.A1v(com.facebook.ads.redexgen.X.B0, android.media.MediaFormat):void");
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC06191g
    public final void A1w(B3 b3, B0 b0, C2461qI c2461qI, MediaCrypto mediaCrypto) {
        this.A00 = A03(b3, c2461qI, A1e());
        this.A0B = A0B(b3.A03);
        String str = b3.A02;
        String strA07 = A07(99, 9, FacebookMediationAdapter.ERROR_INVALID_SERVER_PARAMETERS);
        this.A0D = strA07.equals(str) && !strA07.equals(c2461qI.A0W);
        MediaFormat mediaFormatA04 = A04(c2461qI, b3.A01, this.A00);
        b0.A58(mediaFormatA04, null, mediaCrypto, 0, null);
        if (this.A0D) {
            this.A06 = mediaFormatA04;
            this.A06.setString(A07(150, 4, 43), c2461qI.A0W);
        } else {
            this.A06 = null;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC06191g
    @MetaExoPlayerCustomization("D45988204: [FBLite][Video] Add Codec Hooks for Logging")
    public final void A1x(String str) {
        this.A0F.A0F(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC06191g
    public final void A1y(String str, long j, long j2) {
        this.A0F.A0G(str, j, j2);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC06191g
    @MetaExoPlayerCustomization("Added in D6142814")
    public final boolean A22() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC06191g
    public final boolean A23(long j, long j2, B0 b0, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z, boolean z2) throws AD {
        if (this.A0D) {
            int i3 = i2 & 2;
            if (A0K[3].length() != 28) {
                throw new RuntimeException();
            }
            String[] strArr = A0K;
            strArr[2] = "qFTZlqBsfbROWjHKIBaS9ttrRfnfHc6a";
            strArr[7] = "sZoZRvagNjZKK9rko7XS8oWwcuS8hqha";
            if (i3 != 0) {
                b0.AHi(i, false);
                return true;
            }
        }
        if (z) {
            b0.AHi(i, false);
            if (A0K[5].charAt(0) != 'p') {
                String[] strArr2 = A0K;
                strArr2[4] = "i4U0xdeb2kJYTtTzacReJ5RV5axgIdhD";
                strArr2[0] = "rrPeATHc6C5SnSGUS9RZuIpTT0sGFjMh";
                this.A0h.A0B++;
                this.A0I.A9h();
                return true;
            }
            String[] strArr3 = A0K;
            strArr3[1] = "GzmR5b8Z6T6If0UBPoEMKvf6QjFSlvzk";
            strArr3[6] = "qLQdQ1juS6S8x5RB3mUlKTK412OZk0qd";
            this.A0h.A0B++;
            this.A0I.A9h();
            return true;
        }
        if (this.A0H && A01(this.A07) == 2 && i2 == 0 && this.A03 > 0 && byteBuffer.limit() - byteBuffer.position() >= 12) {
            int iPosition = byteBuffer.position();
            int iLimit = byteBuffer.limit();
            byteBuffer.position(10);
            short s = byteBuffer.getShort();
            byteBuffer.position(iPosition);
            byteBuffer.limit(iLimit);
            int i4 = this.A01;
            int iLimit2 = byteBuffer.limit();
            int originalPosition = byteBuffer.position();
            this.A01 = i4 + (iLimit2 - originalPosition);
            int i5 = this.A02;
            String[] strArr4 = A0K;
            String str = strArr4[4];
            String str2 = strArr4[0];
            int iCharAt = str.charAt(18);
            int originalPosition2 = str2.charAt(18);
            if (iCharAt != originalPosition2) {
                throw new RuntimeException();
            }
            String[] strArr5 = A0K;
            strArr5[1] = "MwudhWWmLfAHxFUBWVuNAQ0R1ppnonhu";
            strArr5[6] = "h4oByFchRKdWl7IBcc7CSq20vr2fgRzF";
            this.A02 = i5 + 1;
            long j4 = this.A05;
            int originalPosition3 = Math.abs((int) s);
            this.A05 = j4 + originalPosition3;
            int i6 = this.A01;
            int originalPosition4 = this.A03;
            if (i6 >= originalPosition4 * 2) {
                this.A0F.A00((int) (this.A05 / this.A02));
                this.A01 = 0;
                this.A02 = 0;
                this.A05 = 0L;
            }
        }
        if (this.A0G) {
            int iLimit3 = byteBuffer.limit();
            int originalPosition5 = byteBuffer.position();
            if (iLimit3 > originalPosition5) {
                int iPosition2 = byteBuffer.position();
                int iLimit4 = byteBuffer.limit();
                int originalPosition6 = iLimit4 - iPosition2;
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(originalPosition6);
                byteBufferAllocate.put(byteBuffer);
                byteBufferAllocate.flip();
                byteBuffer.position(iPosition2);
                byteBuffer.limit(iLimit4);
                this.A0F.A0K(byteBufferAllocate.array(), j3 / 1000);
            }
        }
        try {
            if (!this.A0I.A9e(byteBuffer, j3, 1)) {
                return false;
            }
            b0.AHi(i, false);
            this.A0h.A09++;
            return true;
        } catch (C08088t e) {
            throw A1T(e, this.A07, e.A02, 5001);
        } catch (C08118y e2) {
            throw A1T(e2, this.A0g, e2.A02, 5002);
        }
    }

    public final void A26() {
        this.A0A = true;
    }

    @Override // com.facebook.ads.redexgen.core.AE, com.facebook.ads.redexgen.core.InterfaceC2370oo
    public final AnonymousClass78 A8T() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass78
    public final C2440px A8m() {
        return this.A0I.A8m();
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass78
    public final long A8p() {
        if (A9A() == 2) {
            A08();
        }
        long j = this.A04;
        String[] strArr = A0K;
        if (strArr[1].charAt(15) != strArr[6].charAt(15)) {
            throw new RuntimeException();
        }
        A0K[5] = "p6YKYNxicnjzLIFANgsfPKErY7h8fvSp";
        return j;
    }

    @Override // com.facebook.ads.redexgen.core.AE, com.facebook.ads.redexgen.core.InterfaceC07677c
    public final void A9i(int i, Object obj) throws AD {
        switch (i) {
            case 2:
                this.A0I.setVolume(((Float) obj).floatValue());
                return;
            case 3:
                this.A0I.AJG((C2467qQ) obj);
                return;
            case 4:
            case 5:
            case 7:
            case 8:
            default:
                super.A9i(i, obj);
                return;
            case 6:
                this.A0I.AJI((AnonymousClass21) obj);
                return;
            case 9:
                this.A0I.AJo(((Boolean) obj).booleanValue());
                return;
            case 10:
                this.A0I.AJH(((Integer) obj).intValue());
                return;
            case 11:
                this.A08 = null;
                return;
            case 12:
                if (C5C.A02 < 23) {
                    return;
                }
                InterfaceC08128z interfaceC08128z = this.A0I;
                if (A0K[3].length() != 28) {
                    throw new RuntimeException();
                }
                A0K[3] = "XCf3J2AEJJ1Zd2j3qAi6tezJ2mG7";
                C9S.A00(interfaceC08128z, obj);
                return;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC06191g, com.facebook.ads.redexgen.core.InterfaceC2370oo
    public final boolean AAP() {
        return super.AAP() && this.A0I.AAP();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC06191g, com.facebook.ads.redexgen.core.InterfaceC2370oo
    public final boolean AAe() {
        if (!this.A0I.A9o()) {
            boolean zAAe = super.AAe();
            if (A0K[5].charAt(0) != 'p') {
                throw new RuntimeException();
            }
            A0K[3] = "YZui0KIXZR8KzjI1EkPC1GaIUT4y";
            if (!zAAe) {
                return false;
            }
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass78
    public final void AJd(C2440px c2440px) {
        this.A0I.AJd(c2440px);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2370oo, com.facebook.ads.redexgen.core.InterfaceC07807p
    public final String getName() {
        return A07(0, 23, 11);
    }
}
