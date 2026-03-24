package com.facebook.ads.redexgen.core;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.view.View;
import android.widget.RelativeLayout;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.6K, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C6K extends AbstractC1082Ka {
    public static byte[] A09;
    public float A00;
    public C1762eS A01;
    public boolean A02;
    public final Handler A03;
    public final View A04;
    public final RelativeLayout A05;
    public final RelativeLayout A06;
    public final AbstractC1436Yb A07;
    public final InterfaceC1442Yh A08;

    static {
        A06();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ FacebookMediationAdapter.ERROR_WRONG_NATIVE_TYPE);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A09 = new byte[]{112, 116, 120, 126, 124};
    }

    public C6K(C1618c7 c1618c7) {
        super(c1618c7, true);
        this.A03 = new Handler(Looper.getMainLooper());
        this.A02 = false;
        this.A08 = c1618c7.A0C();
        this.A07 = c1618c7.A0B();
        this.A06 = new RelativeLayout(c1618c7.A06());
        this.A05 = new RelativeLayout(c1618c7.A06());
        YB.A0K(this.A05);
        YB.A0K(this.A06);
        this.A04 = c1618c7.A02();
        A04();
        this.A06.addView(this.A05, new RelativeLayout.LayoutParams(-2, -2));
        addView(this.A06, new RelativeLayout.LayoutParams(-1, -1));
        AbstractC1602br.A00(c1618c7.A06(), this.A06, getAdInfo().A0H().A08());
        A03();
        ((AbstractC1614c3) this).A07.A06().A0F().AKh(XL.A00(this.A00), getResources().getConfiguration().orientation, false, false, AbstractC1153Mt.A0C(((AbstractC1614c3) this).A07.A04()));
    }

    private void A02() {
        YB.A0d(this.A07, getAdDetailsView(), getCtaButton());
        this.A01 = new C1762eS(((AbstractC1614c3) this).A07.A06(), getAdDataBundle(), this.A08, getCtaButton(), this.A03, ((AbstractC1614c3) this).A07.A08());
        addView(this.A01.A0W(), new RelativeLayout.LayoutParams(-1, -1));
    }

    private void A03() {
        YB.A0J(getAdDetailsView());
        addView(getAdDetailsView(), new RelativeLayout.LayoutParams(-1, -1));
        getAdDetailsView().setVisibility(0);
        A07(getResources().getConfiguration().orientation);
        if (getAdDetailsView() instanceof LK) {
            ((LK) getAdDetailsView()).A0u(getResources().getConfiguration().orientation);
        }
    }

    private void A04() {
        if (this.A04 == null) {
            return;
        }
        this.A05.addView(this.A04, new RelativeLayout.LayoutParams(-2, -2));
        YB.A0K(this.A04);
        XR xrA02 = super.A08.A02(getAdDataBundle());
        ((AbstractC1614c3) this).A07.A06().A0H().A00(xrA02.A01);
        getCtaButton().setCreativeAsCtaLoggingHelper(super.A08);
        if (xrA02.A00) {
            this.A04.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.c1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.A00.A1X(view);
                }
            });
        } else {
            if (!C1351Up.A1J(getAdContextWrapper())) {
                return;
            }
            AbstractC1561bC.A00(this.A04, C1351Up.A1K(getAdContextWrapper()), new ViewOnClickListenerC1613c2(this));
        }
    }

    private void A05() {
        this.A09.set(true);
        YB.A0W(this);
        int i = 2;
        YB.A0d(this.A05, getAdDetailsView());
        YB.A0L(this.A07);
        A02();
        if (getAdInfo().A0K().A00() >= 0) {
            this.A02 = true;
            if (this.A07 != null) {
                AbstractC1436Yb abstractC1436Yb = this.A07;
                if (getAdDataBundle().A2P()) {
                    i = 8;
                }
                abstractC1436Yb.setToolbarActionMode(i);
                this.A07.setProgressImmediate(0.0f);
            }
            new XO((int) getAdInfo().A0K().A00(), 20.0f, 20L, new Handler(Looper.getMainLooper()), new KY(this)).A07();
        }
    }

    private void A07(int i) {
        A08(i);
        A1V(i, this.A06, this.A05);
    }

    private void A08(int i) {
        if (this.A04 == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A04.getLayoutParams();
        layoutParams.removeRule(13);
        layoutParams.removeRule(10);
        layoutParams.removeRule(9);
        if (i == 1) {
            layoutParams.width = -1;
            layoutParams.height = -2;
            layoutParams.addRule(10);
        } else {
            layoutParams.width = -2;
            layoutParams.height = -1;
            if (XL.A05(this.A00)) {
                layoutParams.addRule(13);
                RelativeLayout.LayoutParams containerLayoutParam = (RelativeLayout.LayoutParams) this.A05.getLayoutParams();
                containerLayoutParam.addRule(14);
                this.A05.setLayoutParams(containerLayoutParam);
            } else {
                layoutParams.addRule(9);
            }
        }
        this.A04.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1614c3
    public final boolean A0A() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1614c3
    public final boolean A0B() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1082Ka, com.facebook.ads.redexgen.core.AbstractC1614c3
    public final void A1C() throws RemoteException {
        super.A1C();
        this.A03.removeCallbacksAndMessages(null);
        getAdDetailsView().A0j();
        if (this.A01 != null) {
            this.A01.A0Y();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1082Ka, com.facebook.ads.redexgen.core.AbstractC1614c3
    public final void A1H(NR nr, String str, double d, Bundle bundle) {
        super.A1H(nr, str, d, bundle);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1614c3
    public final void A1L(boolean z) {
        super.A1L(z);
        getAdDetailsView().A0m(z);
        if (this.A01 != null) {
            this.A01.A0e(z);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1614c3
    public final boolean A1M() {
        return getAdInfo().A0V();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1614c3
    public final boolean A1O() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1614c3
    public final boolean A1P(boolean z) {
        if (getAdInfo().A0V() && !this.A09.get()) {
            A05();
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1082Ka
    public final AbstractC1564bF A1R(C1618c7 c1618c7, NR nr, String str) {
        this.A00 = new C1307Sx(c1618c7.A06()).A0M(nr.A0H().A08());
        return new C1603bs(this.A00, str, c1618c7.A06(), getColors(), c1618c7.A05(), c1618c7.A0C(), getCtaButton(), AbstractC1082Ka.A0G, false, c1618c7.A07(), c1618c7.A0F(), c1618c7.A0A(), c1618c7.A0E(), c1618c7.A08(), false).A03();
    }

    public final /* synthetic */ void A1X(View view) {
        getCtaButton().A0E(A01(0, 5, 115));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1614c3
    public int getCloseButtonStyle() {
        if (this.A02) {
            if (getAdDataBundle().A2P()) {
                return 8;
            }
            return 2;
        }
        if (A1M() && !this.A09.get()) {
            return 1;
        }
        return super.getCloseButtonStyle();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1082Ka, com.facebook.ads.redexgen.core.AbstractC1614c3, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A01 != null && this.A09.get()) {
            this.A01.A0a(configuration.orientation);
        } else {
            A07(configuration.orientation);
        }
    }
}
