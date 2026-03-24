package com.facebook.ads.redexgen.core;

import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;

/* renamed from: com.facebook.ads.redexgen.X.6y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C07636y implements InterfaceC1331Tv {
    public NativeAdBase A00;
    public NativeAdListener A01;

    public C07636y(NativeAdListener nativeAdListener, NativeAdBase nativeAdBase) {
        this.A01 = nativeAdListener;
        this.A00 = nativeAdBase;
    }

    @Override // com.facebook.ads.redexgen.core.VP
    public final void ACm() {
        WT.A00(new C1326Tq(this));
    }

    @Override // com.facebook.ads.redexgen.core.VP
    public final void ACq() {
        WT.A00(new C1327Tr(this));
    }

    @Override // com.facebook.ads.redexgen.core.VP
    public final void ADp(C1373Vm c1373Vm) {
        WT.A00(new C1329Tt(this, c1373Vm));
    }

    @Override // com.facebook.ads.redexgen.core.VP
    public final void AEl() {
        WT.A00(new C1325Tp(this));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1331Tv
    public final void AEq() {
        WT.A00(new C1328Ts(this));
    }
}
