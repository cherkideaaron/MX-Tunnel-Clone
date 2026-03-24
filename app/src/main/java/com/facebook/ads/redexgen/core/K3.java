package com.facebook.ads.redexgen.core;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network/classes2.dex */
public class K3 implements InterfaceC1557b8 {
    public final /* synthetic */ C1064Ji A00;

    public K3(C1064Ji c1064Ji) {
        this.A00 = c1064Ji;
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
