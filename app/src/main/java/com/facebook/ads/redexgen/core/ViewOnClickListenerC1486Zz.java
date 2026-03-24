package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1486Zz implements View.OnClickListener {
    public final /* synthetic */ C1468Zh A00;
    public final /* synthetic */ MC A01;

    public ViewOnClickListenerC1486Zz(MC mc, C1468Zh c1468Zh) {
        this.A01 = mc;
        this.A00 = c1468Zh;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0D.AAq();
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
