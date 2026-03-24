package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Cj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0886Cj implements InterfaceC1888gV {
    @Override // com.facebook.ads.redexgen.core.InterfaceC1888gV
    public final long A5m() {
        return System.nanoTime();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1888gV
    public final void AK4(Object obj, long j) throws InterruptedException {
        obj.wait(j);
    }
}
