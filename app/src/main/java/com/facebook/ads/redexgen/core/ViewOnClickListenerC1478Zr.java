package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1478Zr implements View.OnClickListener {
    public final /* synthetic */ C1195Ok A00;
    public final /* synthetic */ C1468Zh A01;
    public final /* synthetic */ MD A02;

    public ViewOnClickListenerC1478Zr(MD md, C1468Zh c1468Zh, C1195Ok c1195Ok) {
        this.A02 = md;
        this.A01 = c1468Zh;
        this.A00 = c1195Ok;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            this.A02.A0D.AF4(this.A00);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
