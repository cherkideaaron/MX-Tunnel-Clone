package com.facebook.ads.redexgen.core;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.Hc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1007Hc implements InterfaceC1557b8 {
    public final /* synthetic */ AnonymousClass55 A00;

    public C1007Hc(AnonymousClass55 anonymousClass55) {
        this.A00 = anonymousClass55;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1557b8
    public final void AE7(C1556b7 c1556b7) {
        if (this.A00.A02 != null && c1556b7.A00() != null) {
            this.A00.A02.setImageBitmap(c1556b7.A00());
            this.A00.A02.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.A00.A02.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        }
    }
}
