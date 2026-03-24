package com.facebook.ads.redexgen.core;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC1559bA implements View.OnTouchListener {
    public final /* synthetic */ ViewOnClickListenerC1560bB A00;

    public ViewOnTouchListenerC1559bA(ViewOnClickListenerC1560bB viewOnClickListenerC1560bB) {
        this.A00 = viewOnClickListenerC1560bB;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.A00.A00(motionEvent.getX(), motionEvent.getY());
            return false;
        }
        return false;
    }
}
