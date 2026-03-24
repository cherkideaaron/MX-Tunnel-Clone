package com.facebook.ads.redexgen.core;

import java.io.IOException;

/* loaded from: assets/audience_network/classes2.dex */
public final class LO {
    public final int A00;
    public final long A01;

    public LO(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public static LO A00(InterfaceC2252ms interfaceC2252ms, C07084v c07084v) throws IOException {
        interfaceC2252ms.AGt(c07084v.A0l(), 0, 8);
        c07084v.A0f(0);
        int iA0C = c07084v.A0C();
        long size = c07084v.A0O();
        return new LO(iA0C, size);
    }
}
