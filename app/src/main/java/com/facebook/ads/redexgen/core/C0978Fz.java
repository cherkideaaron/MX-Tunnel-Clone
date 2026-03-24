package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Fz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0978Fz implements InterfaceC1665cs {
    public final /* synthetic */ C0977Fy A00;

    public C0978Fz(C0977Fy c0977Fy) {
        this.A00 = c0977Fy;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1665cs
    public final void AGW(View view) {
        if (this.A00.A09) {
            this.A00.A07 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1665cs
    public final void AGY(View view) {
        AbstractC1062Jg abstractC1062Jg = (AbstractC1062Jg) view;
        abstractC1062Jg.A1T();
        if (this.A00.A09) {
            this.A00.A07 = true;
        }
        if (this.A00.A04.A0Z() && ((Integer) abstractC1062Jg.getTag(-1593835536)).intValue() == 0) {
            this.A00.A04.A0U();
        }
    }
}
