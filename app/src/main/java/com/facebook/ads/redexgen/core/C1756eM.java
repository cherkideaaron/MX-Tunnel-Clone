package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: com.facebook.ads.redexgen.X.eM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1756eM {
    public ViewOnClickListenerC1099Kr A00;
    public final NN A01;
    public final NY A02;
    public final C1162Nd A03;
    public final C1171Nm A04;
    public final C1901gi A05;
    public final VI A06;
    public static final int A09 = (int) (XX.A02 * 4.0f);
    public static final int A07 = (int) (XX.A02 * 72.0f);
    public static final int A08 = (int) (XX.A02 * 8.0f);

    public C1756eM(C1901gi c1901gi, VA va, AbstractC2066jd abstractC2066jd) {
        this.A05 = c1901gi;
        this.A06 = new VI(abstractC2066jd.A2E(), va);
        this.A01 = abstractC2066jd.A28();
        this.A02 = abstractC2066jd.A29().A0I();
        this.A04 = abstractC2066jd.A2C();
        this.A03 = abstractC2066jd.A29().A0K();
    }

    private View A00(ViewOnClickListenerC1099Kr viewOnClickListenerC1099Kr) {
        C1601bq c1601bq = new C1601bq(this.A05, this.A01.A01(), true, false, false);
        c1601bq.A04(this.A02.A0G(), this.A02.A04(), null, false, true);
        c1601bq.setAlignment(17);
        C1595bk c1595bk = new C1595bk(this.A05);
        YB.A0N(c1595bk, 0);
        c1595bk.setRadius(50);
        new LM(c1595bk, this.A05).A04().A07(this.A04.A01());
        LinearLayout linearLayout = new LinearLayout(this.A05);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(c1595bk, new LinearLayout.LayoutParams(A07, A07));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A08, 0, A08);
        linearLayout.addView(c1601bq, layoutParams);
        if (viewOnClickListenerC1099Kr != null) {
            YB.A0J(viewOnClickListenerC1099Kr);
            linearLayout.addView(viewOnClickListenerC1099Kr, layoutParams);
            viewOnClickListenerC1099Kr.setPadding(XV.A0Z, 0, XV.A0Z, 0);
            if (TextUtils.isEmpty(viewOnClickListenerC1099Kr.getText())) {
                YB.A0H(viewOnClickListenerC1099Kr);
            }
        }
        return linearLayout;
    }

    private C7M A01() {
        C7M c7m = new C7M(this.A05);
        c7m.setLayoutManager(new C1971hr(this.A05, 0, false));
        c7m.setAdapter(new FH(this.A05, this.A03.A02(), A09, this.A00));
        return c7m;
    }

    private final EnumC1755eL A02() {
        if (!this.A03.A02().isEmpty()) {
            return EnumC1755eL.A03;
        }
        return EnumC1755eL.A02;
    }

    public final Pair<EnumC1755eL, View> A03(ViewOnClickListenerC1099Kr viewOnClickListenerC1099Kr) {
        View viewA01;
        this.A00 = viewOnClickListenerC1099Kr;
        EnumC1755eL enumC1755eLA02 = A02();
        switch (enumC1755eLA02) {
            case A03:
                viewA01 = A01();
                break;
            default:
                viewA01 = A00(this.A00);
                break;
        }
        VK.A04(viewA01, this.A06, VH.A0S);
        return new Pair<>(enumC1755eLA02, viewA01);
    }
}
