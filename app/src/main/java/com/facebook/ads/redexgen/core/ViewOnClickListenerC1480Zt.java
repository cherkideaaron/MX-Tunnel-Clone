package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1480Zt implements View.OnClickListener {
    public final /* synthetic */ C1482Zv A00;

    public ViewOnClickListenerC1480Zt(C1482Zv c1482Zv) {
        this.A00 = c1482Zv;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A02.A9c();
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
