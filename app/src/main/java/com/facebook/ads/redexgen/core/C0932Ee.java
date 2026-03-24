package com.facebook.ads.redexgen.core;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* renamed from: com.facebook.ads.redexgen.X.Ee, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0932Ee implements Spatializer$OnSpatializerStateChangedListener {
    public final /* synthetic */ C0933Ef A00;
    public final /* synthetic */ C08189h A01;

    public C0932Ee(C0933Ef c0933Ef, C08189h c08189h) {
        this.A00 = c0933Ef;
        this.A01 = c08189h;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.A01.A0L();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.A01.A0L();
    }
}
