package com.facebook.ads.redexgen.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class CM implements InterfaceC1895gc {
    public final EnumC1887gU A00;
    public final AbstractC06422d A01;

    public CM(AbstractC06422d abstractC06422d, EnumC1887gU enumC1887gU) {
        this.A01 = abstractC06422d;
        this.A00 = enumC1887gU;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1895gc
    public void A4D(Map<InterfaceC1877gK, EnumC1900gh> map, Map<SyncModifiableBundle, EnumC1887gU> map2) {
        map2.put(null, this.A00);
    }
}
