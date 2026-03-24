package com.facebook.ads.redexgen.core;

import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.HashMap;
import java.util.Locale;
import org.achartengine.renderer.DefaultRenderer;

/* renamed from: com.facebook.ads.redexgen.X.cd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1650cd extends FrameLayout {
    public final int A00;
    public final RelativeLayout A01;
    public final ViewOnClickListenerC1099Kr A02;
    public static final int A05 = (int) (XX.A02 * 36.0f);
    public static final int A06 = (int) (XX.A02 * 36.0f);
    public static final int A03 = (int) (XX.A02 * 23.0f);
    public static final int A04 = (int) (XX.A02 * 3.0f);
    public static final int A07 = (int) (XX.A02 * 4.0f);

    public C1650cd(C1901gi c1901gi, ViewOnClickListenerC1099Kr viewOnClickListenerC1099Kr, AbstractC2066jd abstractC2066jd, VA va, InterfaceC1442Yh interfaceC1442Yh, C1846fp c1846fp, Y2 y2, C1159Na c1159Na, InterfaceC1579bU interfaceC1579bU) {
        super(c1901gi);
        this.A00 = c1159Na.A09(true);
        this.A01 = new RelativeLayout(c1901gi);
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
        this.A01.setClickable(false);
        A01(c1901gi, abstractC2066jd.A29().A0J().A04());
        if (viewOnClickListenerC1099Kr == null) {
            this.A02 = new ViewOnClickListenerC1099Kr(c1901gi, abstractC2066jd.A0w(), (C1159Na) null, va, interfaceC1442Yh, c1846fp, y2, abstractC2066jd.A2A());
        } else {
            this.A02 = viewOnClickListenerC1099Kr;
        }
        A03();
        this.A02.setCta(abstractC2066jd.A29().A0J(), abstractC2066jd.A2E(), new HashMap(), interfaceC1579bU);
        this.A02.setIsInAppBrowser(true);
        FrameLayout.LayoutParams ctaButtonParams = new FrameLayout.LayoutParams(-1, -1);
        addView(this.A02, ctaButtonParams);
    }

    private void A00(C1901gi c1901gi, View view) {
        ImageView imageView = new ImageView(c1901gi);
        imageView.setImageBitmap(YN.A01(YM.MINIMIZE_ARROW));
        imageView.setRotation(180.0f);
        imageView.setClickable(false);
        imageView.setColorFilter(this.A00);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A03, A03);
        imageView.setPadding(A04, A04, A04, A04);
        layoutParams.addRule(2, view.getId());
        layoutParams.addRule(14);
        this.A01.addView(imageView, layoutParams);
    }

    private void A01(C1901gi c1901gi, String str) {
        Button button = new Button(c1901gi);
        YB.A0K(button);
        button.setPadding(A06, 0, A06, 0);
        button.setText(str.toUpperCase(Locale.getDefault()));
        button.setTextSize(14.0f);
        button.setTypeface(Typeface.defaultFromStyle(1));
        YB.A0Q(button, this.A00, A07);
        button.setTextColor(DefaultRenderer.BACKGROUND_COLOR);
        RelativeLayout.LayoutParams ctaParams = new RelativeLayout.LayoutParams(-2, A05);
        ctaParams.addRule(12);
        ctaParams.addRule(14);
        this.A01.addView(button, ctaParams);
        A00(c1901gi, button);
    }

    public final EnumC1150Mq A02(String str) {
        return this.A02.A0E(str);
    }

    public final void A03() {
        this.A02.setBackgroundColor(0);
        this.A02.setTextColor(0);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return this.A02.performClick();
    }

    public void setAutoClickTime(AbstractC2066jd abstractC2066jd, AbstractC1436Yb abstractC1436Yb) {
        this.A02.A0F(abstractC2066jd, abstractC1436Yb);
    }

    public void setCta(C1161Nc c1161Nc, String str, HashMap<String, String> extras, InterfaceC1579bU interfaceC1579bU) {
        this.A02.setCta(c1161Nc, str, extras, interfaceC1579bU);
    }
}
