package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.hn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1967hn implements RR {
    public final /* synthetic */ C7M A00;

    public C1967hn(C7M c7m) {
        this.A00 = c7m;
    }

    @Override // com.facebook.ads.redexgen.core.RR
    public final void AH9(RK rk, C1256Qx c1256Qx, C1256Qx c1256Qx2) {
        this.A00.A1l(rk, c1256Qx, c1256Qx2);
    }

    @Override // com.facebook.ads.redexgen.core.RR
    public final void AHB(RK rk, C1256Qx c1256Qx, C1256Qx c1256Qx2) {
        this.A00.A0r.A0Y(rk);
        this.A00.A1m(rk, c1256Qx, c1256Qx2);
    }

    @Override // com.facebook.ads.redexgen.core.RR
    public final void AHD(RK rk, C1256Qx c1256Qx, C1256Qx c1256Qx2) {
        rk.A0d(false);
        if (this.A00.A0C) {
            if (this.A00.A05.A0R(rk, rk, c1256Qx, c1256Qx2)) {
                this.A00.A1O();
            }
        } else {
            if (!this.A00.A05.A0Q(rk, c1256Qx, c1256Qx2)) {
                return;
            }
            this.A00.A1O();
        }
    }

    @Override // com.facebook.ads.redexgen.core.RR
    public final void AKZ(RK rk) {
        this.A00.A06.A1F(rk.A0H, this.A00.A0r);
    }
}
