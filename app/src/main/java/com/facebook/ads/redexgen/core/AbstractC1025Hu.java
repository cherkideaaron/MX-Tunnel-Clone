package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Hu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1025Hu {
    public final InterfaceC1008Hd A00;

    public abstract boolean A0B(C07084v c07084v) throws C3K;

    public abstract boolean A0C(C07084v c07084v, long j) throws C3K;

    public AbstractC1025Hu(InterfaceC1008Hd interfaceC1008Hd) {
        this.A00 = interfaceC1008Hd;
    }

    public final boolean A00(C07084v c07084v, long j) throws C3K {
        return A0B(c07084v) && A0C(c07084v, j);
    }
}
