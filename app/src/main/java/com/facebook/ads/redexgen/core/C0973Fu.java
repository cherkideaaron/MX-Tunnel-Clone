package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Fu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0973Fu implements InterfaceC1269Rk {
    public final /* synthetic */ C1263Re A00;
    public final /* synthetic */ C4U A01;

    public C0973Fu(C4U c4u, C1263Re c1263Re) {
        this.A01 = c4u;
        this.A00 = c1263Re;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1269Rk
    public final boolean AAI() {
        if (!this.A01.A0i()) {
            if (this.A01.A0j()) {
                return true;
            }
            return this.A01.A0k();
        }
        this.A01.A0h(this.A00);
        return true;
    }
}
