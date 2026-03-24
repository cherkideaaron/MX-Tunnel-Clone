package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.animation.AlphaAnimation;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.settings.AdInternalSettings;

/* renamed from: com.facebook.ads.redexgen.X.2j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C06462j extends Q9<C1846fp> implements T4 {
    public C1901gi A00;
    public boolean A01;

    public C06462j(C1846fp c1846fp, C1901gi c1901gi) {
        super(c1846fp);
        this.A00 = c1901gi;
        this.A01 = false;
    }

    private void A00(int i) {
        if (!this.A01) {
            this.A00.A0F().A3v(i);
        }
        this.A01 = true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1388Wc
    public final void A07() {
        C1846fp c1846fpA08 = A08();
        int iIntValue = 0;
        if (c1846fpA08 == null) {
            A00(0);
            return;
        }
        View view = c1846fpA08.A0C;
        AbstractC1845fo abstractC1845fo = (AbstractC1845fo) c1846fpA08.A0E.get();
        int i = 1;
        boolean z = view == null;
        if (!z && abstractC1845fo != null) {
            C1847fq c1847fqA0E = C1846fp.A0E(view, c1846fpA08.A0A, this.A00);
            if (c1847fqA0E.A04()) {
                C1846fp.A05(c1846fpA08);
            } else {
                c1846fpA08.A00 = 0;
            }
            boolean z2 = c1846fpA08.A00 > c1846fpA08.A09;
            boolean wasViewable = c1846fpA08.A05 != null && c1846fpA08.A05.A04();
            if (z2 || !c1847fqA0E.A04()) {
                c1846fpA08.A05 = c1847fqA0E;
            }
            String strValueOf = String.valueOf(c1847fqA0E.A01());
            synchronized (c1846fpA08) {
                if (c1846fpA08.A06.containsKey(strValueOf)) {
                    iIntValue = ((Integer) c1846fpA08.A06.get(strValueOf)).intValue();
                }
                c1846fpA08.A06.put(strValueOf, Integer.valueOf(iIntValue + 1));
            }
            if (z2 && !wasViewable) {
                this.A01 = true;
                c1846fpA08.A03 = System.currentTimeMillis();
                if (c1846fpA08.A07) {
                    this.A00.A0F().A3w();
                }
                abstractC1845fo.A03();
                if (BuildConfigApi.isDebug() && AdInternalSettings.isVisibleAnimation()) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation.setDuration(500L);
                    view.startAnimation(alphaAnimation);
                }
                if (!c1846fpA08.A0F) {
                    return;
                }
            } else if (!z2 && wasViewable) {
                this.A01 = true;
                if (c1846fpA08.A07) {
                    this.A00.A0F().A3S(c1847fqA0E.A02());
                }
                abstractC1845fo.A00();
            } else {
                abstractC1845fo.A02();
                if (!this.A01 && c1846fpA08.A07) {
                    this.A00.A0F().A3u(c1847fqA0E.A02());
                }
                this.A01 = true;
            }
            if (!c1846fpA08.A08 && c1846fpA08.A04 != null) {
                c1846fpA08.A0B.postDelayed(c1846fpA08.A04, c1846fpA08.A02);
                return;
            }
            return;
        }
        if (c1846fpA08.A07) {
            if (!z) {
                i = 2;
            }
            A00(i);
        }
    }

    @Override // com.facebook.ads.redexgen.core.T4
    public final C1901gi A6m() {
        return this.A00;
    }
}
