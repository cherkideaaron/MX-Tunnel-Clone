package com.facebook.ads.redexgen.core;

import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class OP {

    @Nullable
    public static OO A00;
    public static final AtomicBoolean A01 = new AtomicBoolean();

    public static OO A00(C1897ge c1897ge) {
        if (A00 == null) {
            A00 = new OO(c1897ge);
        }
        return A00;
    }

    public static void A01(C1897ge c1897ge) {
        if (AbstractC1354Us.A0F(c1897ge)) {
            A03(c1897ge);
        }
    }

    public static void A02(C1897ge c1897ge) {
        if (AbstractC1354Us.A0E(c1897ge)) {
            A03(c1897ge);
        }
    }

    public static void A03(C1897ge c1897ge) {
        if (A01.compareAndSet(false, true)) {
            Y4.A01.execute(new C2000iN(c1897ge));
        }
    }
}
