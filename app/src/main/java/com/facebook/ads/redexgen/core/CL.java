package com.facebook.ads.redexgen.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class CL implements InterfaceC1895gc {
    public final C0879Cb A00;
    public final EnumC1900gh A01;

    public CL(C0879Cb c0879Cb, EnumC1900gh enumC1900gh) {
        this.A00 = c0879Cb;
        this.A01 = enumC1900gh;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1895gc
    public void A4D(Map<InterfaceC1877gK, EnumC1900gh> map, Map<SyncModifiableBundle, EnumC1887gU> map2) {
        map.put(this.A00, this.A01);
    }
}
