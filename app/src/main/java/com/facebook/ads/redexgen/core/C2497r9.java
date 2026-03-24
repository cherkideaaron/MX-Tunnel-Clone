package com.facebook.ads.redexgen.core;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.r9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2497r9 {
    public final InterfaceC2501rD A00;
    public final String A01;
    public final Collection<C2510rN> A02;
    public final Collection<C2510rN> A03;
    public final List<Rect> A04;

    public C2497r9(String str, InterfaceC2501rD interfaceC2501rD, List<Rect> rects, Collection<C2510rN> collection, Collection<C2510rN> collection2) {
        this.A01 = str;
        this.A00 = interfaceC2501rD;
        this.A04 = new ArrayList(rects);
        this.A02 = collection;
        this.A03 = collection2;
    }
}
