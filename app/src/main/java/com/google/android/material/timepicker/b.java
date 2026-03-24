package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes2.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClockFaceView a;

    public b(ClockFaceView clockFaceView) {
        this.a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.B.d) - clockFaceView.J;
        if (height != clockFaceView.z) {
            clockFaceView.z = height;
            clockFaceView.m();
            int i = clockFaceView.z;
            ClockHandView clockHandView = clockFaceView.B;
            clockHandView.r = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
