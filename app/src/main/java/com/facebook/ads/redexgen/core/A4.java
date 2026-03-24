package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class A4 implements InterfaceC06723l {
    public final C08289y A00;
    public final C2339oJ A01;
    public final InterfaceC06713k[] A02;

    public A4(InterfaceC06713k... interfaceC06713kArr) {
        this(interfaceC06713kArr, new C08289y(), new C2339oJ());
    }

    public A4(InterfaceC06713k[] interfaceC06713kArr, C08289y c08289y, C2339oJ c2339oJ) {
        this.A02 = new InterfaceC06713k[interfaceC06713kArr.length + 2];
        System.arraycopy(interfaceC06713kArr, 0, this.A02, 0, interfaceC06713kArr.length);
        this.A00 = c08289y;
        this.A01 = c2339oJ;
        this.A02[interfaceC06713kArr.length] = c08289y;
        this.A02[interfaceC06713kArr.length + 1] = c2339oJ;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC06723l
    public final C2440px A4F(C2440px c2440px) {
        this.A01.A02(c2440px.A01);
        this.A01.A01(c2440px.A00);
        return c2440px;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC06723l
    public final boolean A4G(boolean z) {
        this.A00.A0D(z);
        return z;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC06723l
    public final InterfaceC06713k[] A6z() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC06723l
    public final long A8U(long j) {
        return this.A01.A00(j);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC06723l
    public final long A98() {
        return this.A00.A0C();
    }
}
