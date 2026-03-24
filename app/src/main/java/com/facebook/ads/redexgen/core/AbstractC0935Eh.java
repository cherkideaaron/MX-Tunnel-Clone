package com.facebook.ads.redexgen.core;

import com.facebook.ads.redexgen.core.AbstractC0935Eh;

/* renamed from: com.facebook.ads.redexgen.X.Eh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0935Eh<T extends AbstractC0935Eh<T>> {
    public final int A00;
    public final int A01;
    public final C2461qI A02;
    public final C2424pg A03;

    public abstract int A08();

    public abstract boolean A09(T t);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Eh != com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TrackInfo<T extends com.facebook.ads.redexgen.X.Eh<T>> */
    public AbstractC0935Eh(int i, C2424pg c2424pg, int i2) {
        this.A00 = i;
        this.A03 = c2424pg;
        this.A01 = i2;
        this.A02 = c2424pg.A08(i2);
    }
}
