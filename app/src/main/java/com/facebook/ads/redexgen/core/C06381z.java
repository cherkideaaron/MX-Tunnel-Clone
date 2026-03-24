package com.facebook.ads.redexgen.core;

import android.media.AudioAttributes;

/* renamed from: com.facebook.ads.redexgen.X.1z, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C06381z {
    public final AudioAttributes A00;

    public C06381z(C2467qQ c2467qQ) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c2467qQ.A02).setFlags(c2467qQ.A03).setUsage(c2467qQ.A05);
        if (C5C.A02 >= 29) {
            C06361x.A00(usage, c2467qQ.A01);
        }
        if (C5C.A02 >= 32) {
            C06371y.A00(usage, c2467qQ.A04);
        }
        this.A00 = usage.build();
    }
}
