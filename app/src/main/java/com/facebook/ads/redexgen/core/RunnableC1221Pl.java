package com.facebook.ads.redexgen.core;

import android.content.res.Resources;

/* renamed from: com.facebook.ads.redexgen.X.Pl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1221Pl implements Runnable {
    public final /* synthetic */ Pv A00;

    public RunnableC1221Pl(Pv pv) {
        this.A00 = pv;
    }

    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        this.A00.setScrollState(0);
        this.A00.A0f();
    }
}
