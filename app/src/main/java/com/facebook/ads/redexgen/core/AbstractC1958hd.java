package com.facebook.ads.redexgen.core;

import com.facebook.debug.log.BLogLevelCallback;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.hd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1958hd {
    public static volatile InterfaceC1951hW A02 = C2T.A00();
    public static volatile boolean A03 = false;
    public static boolean A00 = false;
    public static final List<BLogLevelCallback> A01 = new ArrayList();

    static {
        A02.AJY(5);
        AbstractC1950hV.A00(A02);
    }

    public static void A00(@Nullable String str, String str2) {
        if (A02.AAY(4)) {
            A02.A9t(str, str2);
        }
    }

    public static void A01(@Nullable String str, String str2, Object obj) {
        if (A02.AAY(4)) {
            A00(str, AbstractC1953hY.A0J(str2, obj));
        }
    }

    public static void A02(@Nullable String str, String str2, Throwable th) {
        if (A02.AAY(4)) {
            A02.A9u(str, str2, th);
        }
    }
}
