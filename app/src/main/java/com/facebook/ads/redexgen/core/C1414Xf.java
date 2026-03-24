package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Xf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1414Xf implements ViewpointAction<C1358Uw, V1> {
    public XM A00;

    public C1414Xf(XM xm) {
        this.A00 = xm;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.facebook.ads.redexgen.core.ViewpointAction
    public final void A6R(C2510rN<C1358Uw, V1> c2510rN, InterfaceC2501rD interfaceC2501rD) {
        switch (interfaceC2501rD.A9U(c2510rN)) {
            case A02:
            case A04:
                this.A00.A02(c2510rN, interfaceC2501rD);
                break;
        }
    }
}
