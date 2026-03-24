package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.3c, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C06653c extends AbstractC0921Dt {
    public final /* synthetic */ C0909Dh A00;

    public C06653c(C0909Dh c0909Dh) {
        this.A00 = c0909Dh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.UN
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C0922Du c0922Du) {
        if (this.A00.A01 == null || c0922Du.A00().getAction() != 0) {
            return;
        }
        this.A00.A04.removeCallbacksAndMessages(null);
        this.A00.A07(new C1802f7(this));
    }
}
