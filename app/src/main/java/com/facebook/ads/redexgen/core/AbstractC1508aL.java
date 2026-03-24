package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.aL, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1508aL {
    public static String[] A00 = {"JDSePW2HSG4YeS6gtlV", "82T2GFaLeV3aTbLMJos0KxEKOb8V", "eQCDfbwHDs1I63LCwtRfVvk7aOq68Yi1", "mKAtiPzaErPw2g5AsekgNJUywNJKgzbn", "W6CrCk7jl5WmpSSnHELA9a4ylCy3ZwGN", "yC8I8b2mmbmFe3RpkHIpYdmwx30s8PcH", "t7vLS6XVWI7z", "7V80TKFhnzYK6cwmq9Eavbn4uXT7"};

    public static EnumC1512aP A00(AbstractC2066jd abstractC2066jd) {
        if (abstractC2066jd.A2U()) {
            EnumC1512aP enumC1512aP = EnumC1512aP.A02;
            if (A00[3].charAt(31) != 'n') {
                throw new RuntimeException();
            }
            A00[0] = "myUXVCGo2IYKrTscb4wiG";
            return enumC1512aP;
        }
        return EnumC1512aP.A03;
    }

    public static void A01(C1901gi c1901gi, EnumC1509aM enumC1509aM) {
        c1901gi.A0F().AAz(enumC1509aM.name().toLowerCase(Locale.US));
    }

    public static void A02(C1901gi c1901gi, EnumC1509aM enumC1509aM) {
        c1901gi.A0F().AB9(enumC1509aM.name().toLowerCase(Locale.US));
    }

    public static void A03(C1901gi c1901gi, EnumC1509aM enumC1509aM) {
        c1901gi.A0F().AC7(enumC1509aM.name().toLowerCase(Locale.US));
    }

    public static void A04(C1901gi c1901gi, EnumC1509aM enumC1509aM) {
        A01(c1901gi, enumC1509aM);
    }

    public static void A05(C1901gi c1901gi, EnumC1509aM enumC1509aM) {
        A02(c1901gi, enumC1509aM);
    }

    public static void A06(C1901gi c1901gi, EnumC1509aM enumC1509aM) {
        A03(c1901gi, enumC1509aM);
    }

    public static void A07(VI vi, C1901gi c1901gi, InterfaceC1442Yh interfaceC1442Yh, AbstractC2066jd abstractC2066jd, EnumC1509aM enumC1509aM) {
        if (vi != null) {
            vi.A04(VH.A0A, null);
        }
        if (abstractC2066jd.A2Q()) {
            c1901gi.A0F().AB8(enumC1509aM.name().toLowerCase(Locale.US));
        }
        if (abstractC2066jd.A2U()) {
            c1901gi.A0F().AAy(enumC1509aM.name().toLowerCase(Locale.US));
        }
        C1191Og c1191OgA00 = AbstractC1192Oh.A00(c1901gi.A02());
        C1897ge c1897geA02 = c1901gi.A02();
        if (A00[6].length() != 12) {
            throw new RuntimeException();
        }
        A00[0] = "Fh7";
        if (c1191OgA00.A0O(c1897geA02, true)) {
            if (interfaceC1442Yh != null) {
                interfaceC1442Yh.AAo(abstractC2066jd.A2E(), abstractC2066jd.A2C());
            }
        } else {
            if (TextUtils.isEmpty(abstractC2066jd.A2C().A00())) {
                return;
            }
            X6.A0O(new X6(), c1901gi, XB.A00(abstractC2066jd.A2C().A00()), abstractC2066jd.A2E());
        }
    }
}
