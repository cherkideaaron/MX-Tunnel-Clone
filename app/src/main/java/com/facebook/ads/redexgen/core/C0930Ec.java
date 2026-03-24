package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ec, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0930Ec implements Comparable<C0930Ec> {
    public final boolean A00;
    public final boolean A01;

    public C0930Ec(C2461qI c2461qI, int i) {
        this.A00 = (c2461qI.A0H & 1) != 0;
        this.A01 = C08189h.A0S(i, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0930Ec c0930Ec) {
        return AbstractC2313ns.A01().A09(this.A01, c0930Ec.A01).A09(this.A00, c0930Ec.A00).A05();
    }
}
