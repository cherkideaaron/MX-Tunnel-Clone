package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.bF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1564bF extends LinearLayout {
    public static byte[] A0A;
    public static final LinearLayout.LayoutParams A0B;
    public LinearLayout A00;
    public TextView A01;
    public String A02;
    public boolean A03;
    public final int A04;
    public final View.OnClickListener A05;
    public final RelativeLayout A06;
    public final C1901gi A07;
    public final ViewOnClickListenerC1099Kr A08;
    public final C1595bk A09;

    public static String A0h(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 11);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0i() {
        A0A = new byte[]{-96, -93, -93, -92, -77, -96, -88, -85, -78};
    }

    public abstract void A0l(int i);

    static {
        A0i();
        A0B = new LinearLayout.LayoutParams(-2, -2);
    }

    public AbstractC1564bF(C1901gi c1901gi, ViewOnClickListenerC1099Kr viewOnClickListenerC1099Kr, int i, C1159Na c1159Na, boolean z, String str, VA va, InterfaceC1442Yh interfaceC1442Yh, C1846fp c1846fp, Y2 y2, C1165Ng c1165Ng, boolean z2, String str2) {
        super(c1901gi);
        this.A02 = A0h(0, 0, 37);
        YB.A0K(this);
        this.A07 = c1901gi;
        this.A04 = i;
        this.A03 = z2;
        this.A02 = str2;
        this.A09 = new C1595bk(c1901gi);
        YB.A0N(this.A09, 0);
        YB.A0K(this.A09);
        if (z2) {
            this.A00 = new LinearLayout(c1901gi);
            this.A01 = new TextView(c1901gi);
            YB.A0K(this.A01);
        }
        if (viewOnClickListenerC1099Kr == null) {
            this.A08 = new ViewOnClickListenerC1099Kr(c1901gi, str, c1159Na, z, va, interfaceC1442Yh, c1846fp, y2, c1165Ng);
        } else {
            this.A08 = viewOnClickListenerC1099Kr;
        }
        YB.A0G(1001, this.A08);
        this.A05 = AbstractC1605bu.A03(this.A08, A0h(0, 9, 52));
        this.A06 = new RelativeLayout(c1901gi);
        this.A06.setLayoutParams(A0B);
        YB.A0K(this.A06);
    }

    public void A0j() {
    }

    public void A0k() {
        this.A09.setOnClickListener(this.A05);
    }

    public void A0m(boolean z) {
    }

    public final ViewOnClickListenerC1099Kr getCTAButton() {
        return this.A08;
    }

    public View getExpandableLayout() {
        return null;
    }

    public final ImageView getIconView() {
        return this.A09;
    }

    public void setInfo(NY ny, C1161Nc c1161Nc, String str, String str2, InterfaceC1416Xh interfaceC1416Xh, InterfaceC1579bU interfaceC1579bU) {
        this.A08.setCta(c1161Nc, str, new HashMap(), interfaceC1416Xh, interfaceC1579bU);
        new LM(this.A09, this.A07).A05(this.A04, this.A04).A07(str2);
    }

    public void setTitleMaxLines(int i) {
    }
}
