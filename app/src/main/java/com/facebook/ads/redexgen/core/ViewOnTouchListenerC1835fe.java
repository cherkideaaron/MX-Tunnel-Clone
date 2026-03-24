package com.facebook.ads.redexgen.core;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.fe, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC1835fe implements View.OnTouchListener {
    public final /* synthetic */ TextureViewSurfaceTextureListenerC0901Cz A00;

    public ViewOnTouchListenerC1835fe(TextureViewSurfaceTextureListenerC0901Cz textureViewSurfaceTextureListenerC0901Cz) {
        this.A00 = textureViewSurfaceTextureListenerC0901Cz;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.A00.A09 != null && motionEvent.getAction() == 1) {
            if (this.A00.A09.isShowing()) {
                this.A00.A09.hide();
            } else {
                this.A00.A09.show();
            }
        }
        return true;
    }
}
