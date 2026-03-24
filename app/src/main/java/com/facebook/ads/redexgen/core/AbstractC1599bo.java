package com.facebook.ads.redexgen.core;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.bo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1599bo implements TB {
    public final T8 A00;

    public AbstractC1599bo(T8 t8) {
        this.A00 = t8;
    }

    @Override // com.facebook.ads.redexgen.core.TB
    public final Map<String, String> A5a() {
        return U8.A01(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.TB
    public final Map<String, String> A6w() {
        return C1323Tn.A02();
    }

    @Override // com.facebook.ads.redexgen.core.TB
    public final String A8L() {
        return C1323Tn.A00();
    }

    @Override // com.facebook.ads.redexgen.core.TB
    public final String A8N() {
        return SZ.A00().A03();
    }

    @Override // com.facebook.ads.redexgen.core.TB
    public final boolean AAU() {
        return X0.A00().A03();
    }
}
