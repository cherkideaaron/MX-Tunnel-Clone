package com.facebook.ads.redexgen.core;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.f6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1801f6 implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ C06783r A00;

    public C1801f6(C06783r c06783r) {
        this.A00 = c06783r;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        new Handler(Looper.getMainLooper()).post(new C0913Dl(this, i));
    }
}
