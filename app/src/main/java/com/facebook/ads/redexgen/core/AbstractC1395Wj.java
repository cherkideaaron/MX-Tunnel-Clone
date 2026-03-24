package com.facebook.ads.redexgen.core;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.Wj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1395Wj {
    public static final AtomicReference<InterfaceC1394Wi> A00 = new AtomicReference<>(null);

    public static InterfaceC1394Wi A00() {
        InterfaceC1394Wi errorLogger = A00.get();
        if (errorLogger == null) {
            return new R1();
        }
        return errorLogger;
    }

    public static void A01(InterfaceC1394Wi interfaceC1394Wi) {
        A00.set(interfaceC1394Wi);
    }
}
