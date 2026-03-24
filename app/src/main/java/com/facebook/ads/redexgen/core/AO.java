package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class AO implements C5Y {
    public InterfaceC07325t A02;
    public InterfaceC2132kj<String> A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public final C07275o A07 = new C07275o();
    public int A00 = 8000;
    public int A01 = 8000;

    public final AO A00(InterfaceC07325t interfaceC07325t) {
        this.A02 = interfaceC07325t;
        return this;
    }

    public final AO A01(String str) {
        this.A04 = str;
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.C5Y
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final C06231k A5I() {
        C06231k c06231k = new C06231k(this.A04, this.A00, this.A01, this.A05, this.A07, this.A03, this.A06);
        if (this.A02 != null) {
            c06231k.A43(this.A02);
        }
        return c06231k;
    }
}
