package com.facebook.ads.redexgen.core;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.4x, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C07104x extends AbstractC0988Gj {
    public static byte[] A07;
    public static String[] A08 = {"opNTFb7MfNeLnBf1OFt8H8u3IMVbRu1d", "IWQCWQwp5ID5RPcOdaIzYqbwlbVDrClG", "KvkPuVSJhScWrt17epNc", "F0ODCmRg5uMMagWpVfR8fmvJ1OUGt5pq", "F5r", "wG3QjEZJL94bFBL8PiZK", "A8E1xGSXICDDUeWE8x490gS0hcqgXwJC", "2T9PYA9x4VF1QbksNYikemvLXt0jGXOu"};
    public AbstractC1614c3 A00;
    public DZ A01;
    public final ImageView A02;
    public final InterfaceC1269Rk A03;
    public final AtomicBoolean A04;
    public final AtomicBoolean A05;
    public final AtomicBoolean A06;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 61);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A07 = new byte[]{-17, -25, -27, -20};
    }

    static {
        A07();
    }

    public C07104x(C1901gi c1901gi, ZU zu, VA va, AbstractC2066jd abstractC2066jd, C1307Sx c1307Sx, InterfaceC1442Yh interfaceC1442Yh) {
        super(c1901gi, zu, va, abstractC2066jd, c1307Sx, interfaceC1442Yh);
        this.A03 = new C0981Gc(this);
        this.A05 = new AtomicBoolean(false);
        this.A04 = new AtomicBoolean(false);
        this.A06 = new AtomicBoolean(false);
        this.A02 = new ImageView(getContext());
        if (abstractC2066jd.A29().A0H().A04() > 0) {
            this.A01 = new DZ(c1901gi, abstractC2066jd.A29().A0H().A04() * 1000);
        }
        this.A02.setScaleType(ImageView.ScaleType.CENTER);
        this.A02.setAdjustViewBounds(true);
        new LM(this.A02, super.A05).A05(super.A03.A29().A0H().A00(), super.A03.A29().A0H().A01()).A06(new C0980Gb(this)).A07(super.A03.A29().A0H().A08());
    }

    private AbstractC1614c3 A01(int i) throws SecurityException {
        if (this.A02.getParent() != null) {
            YB.A0J(this.A02);
        }
        C1617c6 c1617c6A0M = new C1617c6(super.A05, super.A06, this.A0A, super.A03, this.A02, this.A0C, this.A08).A0J(this.A09.getToolbarHeight()).A0P(this.A09).A0I(i).A0M(this.A07);
        if (this.A01 != null) {
            c1617c6A0M.A0R(this.A01);
        }
        c1617c6A0M.A0L(C1154Mu.A00(super.A05, super.A06, A03(0, 0, 52), XB.A00(super.A03.A29().A0J().A05()), new HashMap(), super.A03.A2A()));
        C1618c7 params = c1617c6A0M.A0U();
        return AbstractC1615c4.A00(params, null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06() {
        if (this.A05.get() && this.A04.get()) {
            A0e();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A08(int r8) {
        /*
            r7 = this;
            com.facebook.ads.redexgen.X.c3 r0 = r7.A00
            com.facebook.ads.redexgen.core.YB.A0J(r0)
            com.facebook.ads.redexgen.X.c3 r0 = r7.A01(r8)
            r7.A00 = r0
            com.facebook.ads.redexgen.X.c3 r1 = r7.A00
            com.facebook.ads.redexgen.X.Gd r0 = new com.facebook.ads.redexgen.X.Gd
            r0.<init>()
            r1.setAccidentalClickCappingListener(r0)
            com.facebook.ads.redexgen.X.c3 r0 = r7.A00
            com.facebook.ads.redexgen.X.Na r5 = r0.getColors()
            java.lang.Integer r0 = r7.getBackgroundColorForToolbar()
            r4 = 1
            r3 = 0
            if (r0 != 0) goto L55
            com.facebook.ads.redexgen.X.c3 r0 = r7.A00
            if (r0 == 0) goto L7a
            com.facebook.ads.redexgen.X.c3 r0 = r7.A00
            boolean r0 = r0.A1O()
            if (r0 != 0) goto L53
            com.facebook.ads.redexgen.X.c3 r6 = r7.A00
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C07104x.A08
            r0 = 4
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 3
            if (r1 == r0) goto L43
        L3d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L43:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C07104x.A08
            java.lang.String r1 = "fKHhGKaWmtnLqlWg01lC"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "lG6mBbCbmu9ZuvMubYOS"
            r0 = 5
            r2[r0] = r1
            boolean r0 = r6 instanceof com.facebook.ads.redexgen.core.AbstractC1082Ka
            if (r0 == 0) goto L7a
        L53:
            r0 = 1
            goto L7b
        L55:
            int r6 = r0.intValue()
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C07104x.A08
            r0 = 2
            r1 = r2[r0]
            r0 = 5
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L6f
            com.facebook.ads.redexgen.core.YB.A0N(r7, r6)
            goto L82
        L6f:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C07104x.A08
            java.lang.String r1 = "OBMiQo8I4Ts7yjqshk6bkpwsmCqa0sTm"
            r0 = 0
            r2[r0] = r1
            com.facebook.ads.redexgen.core.YB.A0N(r7, r6)
            goto L82
        L7a:
            r0 = 0
        L7b:
            int r0 = r5.A08(r0)
            com.facebook.ads.redexgen.core.YB.A0N(r7, r0)
        L82:
            com.facebook.ads.redexgen.X.Yb r6 = r7.A09
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C07104x.A08
            r0 = 2
            r1 = r2[r0]
            r0 = 5
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L97
            goto L3d
        L97:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C07104x.A08
            java.lang.String r1 = "a7i0pPPxGgijq0ih0stJ"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "yYRdNfPwhLNXT50Mgldr"
            r0 = 5
            r2[r0] = r1
            com.facebook.ads.redexgen.X.c3 r0 = r7.A00
            boolean r0 = r0.A1O()
            r6.setFullscreen(r0)
            com.facebook.ads.redexgen.X.Yb r1 = r7.A09
            com.facebook.ads.redexgen.X.jd r0 = r7.A03
            boolean r0 = com.facebook.ads.redexgen.core.ViewOnClickListenerC1099Kr.A05(r0)
            r1.A0D(r5, r0)
            com.facebook.ads.redexgen.X.c3 r0 = r7.A00
            r7.A0j(r0)
            android.view.ViewGroup r0 = r7.A01
            if (r0 == 0) goto Lc7
            android.view.ViewGroup r1 = r7.A01
            android.widget.RelativeLayout$LayoutParams r0 = com.facebook.ads.redexgen.core.AbstractC0988Gj.A0H
            r7.addView(r1, r3, r0)
        Lc7:
            com.facebook.ads.redexgen.X.c3 r0 = r7.A00
            if (r0 == 0) goto Ld7
            com.facebook.ads.redexgen.X.c3 r0 = r7.A00
            boolean r0 = r0.A1O()
            if (r0 == 0) goto Ld7
        Ld3:
            r7.setUpFullscreenMode(r4)
            return
        Ld7:
            r4 = 0
            goto Ld3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C07104x.A08(int):void");
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0988Gj
    public final AbstractC1436Yb A0c() {
        AbstractC1436Yb abstractC1436YbA0c = super.A0c();
        if (super.A03.A2T()) {
            abstractC1436YbA0c.setOnClickListener(new ViewOnClickListenerC1722dn(this));
        }
        return abstractC1436YbA0c;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0988Gj
    public final void A0g() {
        if (this.A00 != null) {
            this.A07.A04(VH.A0Y, null);
            EnumC1150Mq enumC1150MqA1B = this.A00.A1B(A03(0, 4, 63));
            if (super.A03.A2N()) {
                return;
            }
            EnumC1150Mq actionOutcome = EnumC1150Mq.A09;
            if (enumC1150MqA1B != actionOutcome) {
                EnumC1150Mq actionOutcome2 = EnumC1150Mq.A06;
                if (enumC1150MqA1B != actionOutcome2) {
                    A0f();
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0988Gj
    public final void A0h() {
        YB.A0L(this.A00);
        YB.A0L(this.A09);
        this.A04.set(true);
        A06();
        int iA04 = super.A03.A29().A0H().A04();
        int secondsForNextCta = super.A03.A29().A0H().A02();
        if (iA04 > 0) {
            if (this.A00 != null) {
                this.A00.A1G();
            }
            A0i(iA04, new C0979Ga(this), this.A01);
            if (secondsForNextCta == 0 || secondsForNextCta >= iA04) {
                super.A02 = true;
                this.A09.setToolbarActionMode(8);
                return;
            } else {
                if (secondsForNextCta <= 0) {
                    return;
                }
                this.A09.setProgressSpinnerInvisible(true);
                A0i(secondsForNextCta, new GZ(this), null);
                return;
            }
        }
        this.A06.set(true);
        AbstractC1436Yb abstractC1436Yb = this.A09;
        int unskippableSeconds = getCloseButtonStyle();
        abstractC1436Yb.setToolbarActionMode(unskippableSeconds);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0988Gj
    public final void A0k(C1263Re c1263Re) {
        FrameLayout.LayoutParams layoutParams;
        c1263Re.A0A(this.A03);
        int orientation = c1263Re.A05().getResources().getConfiguration().orientation;
        A08(orientation);
        if (A0m()) {
            YB.A0J(this.A09);
        }
        if (A0m()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
            Rect requestedMargins = this.A09.getRequestedMargins();
            if (requestedMargins == null) {
                layoutParams.setMargins(0, XV.A0r, 0, 0);
            } else {
                int i = requestedMargins.left;
                int i2 = requestedMargins.top;
                int i3 = requestedMargins.right;
                int i4 = requestedMargins.bottom;
                if (A08[4].length() != 3) {
                    throw new RuntimeException();
                }
                A08[0] = "j24x2xTHwZJixq019qlFmxSWfXtsmamW";
                layoutParams.setMargins(i, i2, i3, i4);
            }
        } else {
            int orientation2 = this.A09.getToolbarHeight();
            layoutParams = new FrameLayout.LayoutParams(-1, orientation2);
        }
        addView(this.A09, layoutParams);
        YB.A0H(this.A00);
        YB.A0H(this.A09);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0988Gj
    public final boolean A0l() {
        if (this.A00 == null) {
            return false;
        }
        AbstractC1614c3 abstractC1614c3 = this.A00;
        if (A08[4].length() != 3) {
            throw new RuntimeException();
        }
        A08[4] = "kMg";
        return abstractC1614c3.A1P(false);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0988Gj
    public final boolean A0m() {
        return super.A03.A1j() || super.A03.A1y();
    }

    public final /* synthetic */ void A0n() {
        A0f();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1443Yi
    public final void AFA(boolean z) {
        if (this.A00 != null) {
            this.A00.A1L(z);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1443Yi
    public final void AFi(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCloseButtonStyle() {
        if (this.A00 != null) {
            return this.A00.getCloseButtonStyle();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0988Gj, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!super.A03.A29().A0T() && !A0m()) {
            A08(configuration.orientation);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0988Gj, com.facebook.ads.redexgen.core.InterfaceC1443Yi
    public final void onDestroy() {
        if (C1351Up.A1z(super.A05)) {
            super.A05.A0B().AKU(this.A02);
        }
        if (this.A00 != null) {
            AbstractC1614c3 abstractC1614c3 = this.A00;
            String[] strArr = A08;
            if (strArr[6].charAt(10) != strArr[1].charAt(10)) {
                throw new RuntimeException();
            }
            A08[4] = "hIQ";
            abstractC1614c3.A1C();
        }
        super.onDestroy();
    }
}
