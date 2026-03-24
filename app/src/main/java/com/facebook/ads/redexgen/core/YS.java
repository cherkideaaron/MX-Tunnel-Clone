package com.facebook.ads.redexgen.core;

import java.util.concurrent.Executor;

/* loaded from: assets/audience_network/classes2.dex */
public final class YS {
    public static YS A02;
    public final C1224Pp A00;
    public final YU A01;

    public YS(C1901gi c1901gi, Executor executor, C1332Tw c1332Tw) {
        this.A01 = new YU(c1901gi);
        this.A00 = new C1224Pp(executor, c1332Tw, c1901gi);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(C1901gi c1901gi, Executor executor, C1332Tw c1332Tw) {
        if (!C1351Up.A1c(c1901gi)) {
            return;
        }
        if (A02 == null) {
            A02 = new YS(c1901gi, executor, c1332Tw);
            A02.A00();
        } else {
            A02.A02(c1332Tw);
        }
    }

    private void A02(C1332Tw c1332Tw) {
        this.A00.A07(c1332Tw);
    }
}
