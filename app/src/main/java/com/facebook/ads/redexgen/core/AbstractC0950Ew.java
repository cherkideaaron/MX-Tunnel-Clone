package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Timeline;

/* renamed from: com.facebook.ads.redexgen.X.Ew, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0950Ew {
    public InterfaceC0949Ev A00;
    public F6 A01;

    public abstract boolean A0Y();

    public abstract C0951Ex A0b(InterfaceC07807p[] interfaceC07807pArr, C2291nW c2291nW, C2309no c2309no, Timeline timeline) throws AD;

    public abstract void A0c(Object obj);

    public final F6 A00() {
        return (F6) AbstractC06853y.A02(this.A01);
    }

    public final void A01() {
        if (this.A00 != null) {
            this.A00.AGD();
        }
    }

    public final void A02(InterfaceC0949Ev interfaceC0949Ev, F6 f6) {
        this.A00 = interfaceC0949Ev;
        this.A01 = f6;
    }
}
