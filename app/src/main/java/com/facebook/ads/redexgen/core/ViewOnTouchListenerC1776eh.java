package com.facebook.ads.redexgen.core;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.eh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC1776eh implements View.OnTouchListener {
    public final /* synthetic */ C0938Ek A00;

    public ViewOnTouchListenerC1776eh(C0938Ek c0938Ek) {
        this.A00 = c0938Ek;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.A00.A0C.A02(new C0922Du(view, motionEvent));
        return false;
    }
}
