package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Rl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnLongClickListenerC1270Rl implements View.OnLongClickListener {
    public final /* synthetic */ C1941hM A00;
    public final /* synthetic */ C1555b6 A01;

    public ViewOnLongClickListenerC1270Rl(C1941hM c1941hM, C1555b6 c1555b6) {
        this.A00 = c1941hM;
        this.A01 = c1555b6;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.A00.A00 != null) {
            this.A01.setBounds(0, 0, this.A00.A00.getWidth(), this.A00.A00.getHeight());
            this.A01.A0D(!this.A01.A0E());
        }
        return true;
    }
}
