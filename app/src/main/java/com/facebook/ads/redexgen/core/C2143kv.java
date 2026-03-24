package com.facebook.ads.redexgen.core;

import java.io.File;

/* renamed from: com.facebook.ads.redexgen.X.kv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2143kv implements LU<String> {
    @Override // com.facebook.ads.redexgen.core.LU
    public final LT<String> A3x(File file, InterfaceC1120Lm interfaceC1120Lm) {
        String strA05 = AbstractC1121Ln.A05(file);
        return new LT<>(strA05 != null, strA05);
    }

    @Override // com.facebook.ads.redexgen.core.LU
    public final void A5D(File file, InterfaceC1120Lm interfaceC1120Lm) {
    }
}
