package com.facebook.ads.redexgen.core;

import java.util.Collection;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.kJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2107kJ implements InterfaceC1156Mw {
    public final /* synthetic */ C1901gi A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ JSONObject A02;

    public C2107kJ(JSONObject jSONObject, C1901gi c1901gi, String str) {
        this.A02 = jSONObject;
        this.A00 = c1901gi;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1156Mw
    public final String A7O() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1156Mw
    public final Collection<String> A7p() {
        return AbstractC1157Mx.A03(this.A00, this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1156Mw
    public final EnumC1155Mv A8K() {
        return AbstractC1157Mx.A00(this.A02);
    }
}
