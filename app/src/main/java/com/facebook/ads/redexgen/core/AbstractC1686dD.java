package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.dD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1686dD {
    public static String[] A00 = {"M7M7680JiQXMJzeuHBUdBK3CqcsunIE3", "7YJQc0MEUr6fNb1HoLhvfznehf2fNPi1", "fqXve0BGHc", "EJDyhBK8ScH8NN0H4G45MCvGKFSIU6i3", "lE5hsHUrpnTpaSUAUiDOdKdDJm2EXpBt", "fXhWa5fzMs", "jGMjXmbPjJmsUXbAj46daPhZmilD9JtA", "gy7nSuWAyo"};
    public static final Map<String, WeakReference<C1685dC>> A01 = new HashMap();

    public static int A00() {
        Map<String, WeakReference<C1685dC>> map = A01;
        if (A00[4].charAt(3) != 'h') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[3] = "KcOG1rzwVGm5OqslsWQoAqhkYEC7FRij";
        strArr[1] = "Dhj4Lprngz6YVn4AutwbBiUWJOZdaDii";
        return map.size();
    }

    public static C1685dC A01(C1901gi c1901gi, AbstractC2066jd abstractC2066jd, int i, InterfaceC1683dA interfaceC1683dA) throws JSONException {
        C1685dC c1685dC = new C1685dC(c1901gi, abstractC2066jd, c1901gi.A02().A0A(), i);
        c1685dC.A0b(interfaceC1683dA);
        c1685dC.A0X();
        A01.put(abstractC2066jd.A1D(), new WeakReference<>(c1685dC));
        return c1685dC;
    }

    public static C1685dC A02(String str) {
        WeakReference<C1685dC> weakReference = A01.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void A03(AbstractC2066jd abstractC2066jd, C1685dC c1685dC) {
        A01.put(abstractC2066jd.A1D(), new WeakReference<>(c1685dC));
    }

    public static void A04(String str) {
        A01.remove(str);
    }
}
