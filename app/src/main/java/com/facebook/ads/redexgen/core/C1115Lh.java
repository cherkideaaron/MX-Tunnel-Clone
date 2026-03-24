package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Lh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1115Lh extends AbstractRunnableC1388Wc {
    public final WeakReference<C1846fp> A00;

    public C1115Lh(C1846fp c1846fp) {
        this.A00 = new WeakReference<>(c1846fp);
    }

    public C1115Lh(WeakReference<C1846fp> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1388Wc
    public final void A07() {
        C1846fp viewabilityChecker = this.A00.get();
        if (viewabilityChecker != null) {
            viewabilityChecker.A0U();
        }
    }
}
