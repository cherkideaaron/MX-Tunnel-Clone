package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1561bC {
    public static void A00(View view, boolean z, View.OnClickListener onClickListener) {
        if (!z) {
            view.setOnClickListener(onClickListener);
        } else {
            if (!z) {
                return;
            }
            ViewOnClickListenerC1560bB viewOnClickListenerC1560bB = new ViewOnClickListenerC1560bB(onClickListener);
            view.setOnClickListener(viewOnClickListenerC1560bB);
            view.setOnTouchListener(new ViewOnTouchListenerC1559bA(viewOnClickListenerC1560bB));
        }
    }
}
