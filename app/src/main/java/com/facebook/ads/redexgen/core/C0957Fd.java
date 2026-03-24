package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Fd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0957Fd implements InterfaceC1269Rk {
    public final /* synthetic */ C1263Re A00;
    public final /* synthetic */ C4T A01;

    public C0957Fd(C4T c4t, C1263Re c1263Re) {
        this.A01 = c4t;
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
