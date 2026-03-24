package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.kZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2123kZ implements InterfaceC1131Lx {
    public final InterfaceC1128Lu A00;

    public C2123kZ(InterfaceC1128Lu interfaceC1128Lu) {
        this.A00 = interfaceC1128Lu;
    }

    public final InterfaceC1128Lu A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1131Lx
    public final C8J ACL() {
        return new C8J(this);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1131Lx
    public final C2127kd ACM() {
        return new C2127kd(this);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1131Lx
    public final C2127kd ACN(String str) {
        return new C2127kd(this, str);
    }
}
