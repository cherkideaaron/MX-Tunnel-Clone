package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.f0, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1795f0 implements InterfaceC1312Tc {
    public final T8 A00;

    public C1795f0(T8 t8) {
        this.A00 = t8;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1312Tc
    public final void A4I(Throwable th) {
        TX.A0E(th);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1312Tc
    public final void AA3(String str) {
        VL.A08(this.A00, str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1312Tc
    public final void AA4(String str) {
        VL.A09(this.A00, str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1312Tc
    public final void ABC(String str, int i, C1314Te c1314Te) {
        TX.A06(this.A00, str, i, c1314Te);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1312Tc
    public final void ABD(String str, int i, C1314Te c1314Te) {
        TX.A06(this.A00, str, i, c1314Te);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1312Tc
    public final void ABo(long j, long j2, long j3, long j4, int i, Exception exc) {
        AbstractC1318Ti.A03(this.A00, j, j2, j3, j4, i, exc);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1312Tc
    public final void ABz(String str, int i, C1314Te c1314Te) {
        TX.A07(this.A00, str, i, c1314Te);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1312Tc
    public final void ACA(String str, int i, C1314Te c1314Te) {
        TX.A08(this.A00, str, i, c1314Te);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1312Tc
    public final void ACP() {
        this.A00.A04().ACP();
    }
}
