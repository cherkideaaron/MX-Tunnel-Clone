package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.os.Build;
import android.widget.RelativeLayout;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;
import org.achartengine.renderer.DefaultRenderer;

/* renamed from: com.facebook.ads.redexgen.X.Rj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1268Rj {
    public static byte[] A04;
    public static String[] A05 = {"MJXAzUwyiLvMzZCrP1QJf8uMs9b", "sHuNTXgsBnW3HGqskl7KH5QkikNWpABj", "q8u9vKEVkpk3dMxroB1EFzM5kwDKfJOq", "eyGwnlQBA4bCraIcft5FxvFgN7f8TC5N", "FmmRYKiwjJl3dX1FB2pV6kIWJpsNLC6h", "flBitaWG3wpDSjkerYNuTkR3r5UhRox3", "xkUQOvOGGj42jMnQjSDdoLzQvdQiYUba", "XqZ9VL6XKZ5Y"};
    public final Intent A00;
    public final C1263Re A01;
    public final C1901gi A02;
    public final VA A03;

    public static String A0K(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 59);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0L() {
        A04 = new byte[]{99, 127, 4, 1, 58, 1, 4, 17, 4, 58, 7, 16, 11, 1, 9, 0, 43, 41, 36, 36, 45, 58, 28, 49, 56, 45, 119, 124, 117, 125, 122, 113, 112, 85, 112, 80, 117, 96, 117, 86, 97, 122, 112, 120, 113, 35, 44, 41, 49, 32, 55, 32, 33, 26, 38, 41, 44, 38, 46, 26, 33, 32, 41, 36, 60, 26, 40, 54, 123, 97, 77, 100, 32, 77, 118, 119, 97, 123, 117, 124, 116, 123, 110, 115, 108, 127, 91, 126, 94, 123, 110, 123, 88, 111, 116, 126, 118, 127, 32, 55, 37, 51, 32, 54, 55, 54, 4, 59, 54, 55, 61, 19, 54, 22, 51, 38, 51, 16, 39, 60, 54, 62, 55, 22, 9, 4, 5, 15, 63, 20, 9, 13, 5, 63, 16, 15, 12, 12, 9, 14, 7, 63, 9, 14, 20, 5, 18, 22, 1, 12};
    }

    static {
        A0L();
    }

    public C1268Rj(C1263Re c1263Re, Intent intent, VA va, C1901gi c1901gi) {
        this.A01 = c1263Re;
        this.A00 = intent;
        this.A03 = va;
        this.A02 = c1901gi;
    }

    private AbstractC2066jd A00() {
        int i = Build.VERSION.SDK_INT;
        String strA0K = A0K(80, 18, 33);
        if (i >= 33) {
            return (AbstractC2066jd) this.A00.getSerializableExtra(strA0K, AbstractC2066jd.class);
        }
        Intent intent = this.A00;
        String[] strArr = A05;
        if (strArr[6].charAt(13) != strArr[2].charAt(13)) {
            throw new RuntimeException();
        }
        A05[1] = "LmjecX6z1NXmevkMdudhCsYVgseeBlBL";
        return (AbstractC2066jd) intent.getSerializableExtra(strA0K);
    }

    private C2060jT A01() {
        int i = Build.VERSION.SDK_INT;
        String strA0K = A0K(26, 19, 47);
        if (i >= 33) {
            return (C2060jT) this.A00.getSerializableExtra(strA0K, C2060jT.class);
        }
        return (C2060jT) this.A00.getSerializableExtra(strA0K);
    }

    private C07787n A02() {
        int i = Build.VERSION.SDK_INT;
        String strA0K = A0K(2, 14, 94);
        if (i >= 33) {
            return (C07787n) this.A00.getSerializableExtra(strA0K, C07787n.class);
        }
        return (C07787n) this.A00.getSerializableExtra(strA0K);
    }

    private C07767l A03() {
        int i = Build.VERSION.SDK_INT;
        String strA0K = A0K(98, 25, FacebookMediationAdapter.ERROR_REQUIRES_UNIFIED_NATIVE_ADS);
        if (i >= 33) {
            return (C07767l) this.A00.getSerializableExtra(strA0K, C07767l.class);
        }
        return (C07767l) this.A00.getSerializableExtra(strA0K);
    }

    private InterfaceC1443Yi A05() throws NumberFormatException {
        boolean booleanExtra = this.A00.getBooleanExtra(A0K(68, 12, 41), false);
        boolean isV2Design = C1351Up.A2w(this.A02);
        if (isV2Design) {
            String stringExtra = this.A00.getStringExtra(A0K(45, 23, 126));
            C1263Re c1263Re = this.A01;
            C1901gi c1901gi = this.A02;
            VA va = this.A03;
            C1947hS c1947hS = new C1947hS(this.A01);
            String stringExtra2 = this.A00.getStringExtra(A0K(16, 10, 115));
            if (stringExtra == null) {
                stringExtra = A0K(0, 2, 117);
            }
            int i = Integer.parseInt(stringExtra);
            String clickDelayMs = A05[5];
            if (clickDelayMs.charAt(3) != 'i') {
                throw new RuntimeException();
            }
            A05[4] = "YY09SF1W0j6b6KfCSgRusx8TJPca7HgC";
            return new ViewOnClickListenerC07626x(c1263Re, c1901gi, va, c1947hS, stringExtra2, i);
        }
        return new PZ(this.A01, this.A02, this.A03, new C1947hS(this.A01), booleanExtra);
    }

    private InterfaceC1443Yi A06() {
        C07787n c07787nA02 = A02();
        if (c07787nA02 == null) {
            return null;
        }
        return A08(new AnonymousClass77(this.A01), c07787nA02, c07787nA02.A1G(), new MH());
    }

    private InterfaceC1443Yi A07() {
        C07767l c07767lA03 = A03();
        if (c07767lA03 == null) {
            return null;
        }
        return A08(new AnonymousClass77(this.A01), c07767lA03, c07767lA03.A1G(), new MG());
    }

    private InterfaceC1443Yi A08(InterfaceC1442Yh interfaceC1442Yh, AbstractC2066jd abstractC2066jd, String str, ZU zu) {
        if (abstractC2066jd.A29().A0H().A07() != null) {
            C1173No c1173NoA07 = abstractC2066jd.A29().A0H().A07();
            if (abstractC2066jd.A1n()) {
                return new MW(this.A02, this.A03, interfaceC1442Yh, abstractC2066jd, c1173NoA07, str, zu);
            }
            return new NO(this.A02, this.A03, interfaceC1442Yh, abstractC2066jd, str, zu);
        }
        interfaceC1442Yh.A4j(zu.A81());
        interfaceC1442Yh.A4j(zu.A7w());
        return null;
    }

    private PJ A09(WK wk) {
        AbstractC2066jd abstractC2066jdA02;
        if (wk == WK.A0G) {
            abstractC2066jdA02 = A03();
            String[] strArr = A05;
            if (strArr[6].charAt(13) != strArr[2].charAt(13)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[6] = "BHjTvXd0Vicw2MzqRZQvpavg35ntNS6w";
            strArr2[2] = "NWBwsXtlP0iXXM4o1NBUiSzzY7vvtUxs";
            if (abstractC2066jdA02 == null) {
                return null;
            }
        } else if (wk != WK.A0A || (abstractC2066jdA02 = A02()) == null) {
            return null;
        }
        abstractC2066jdA02.A1L(this.A01.A08());
        if (abstractC2066jdA02.A1a()) {
            return new C4U(this.A02, this.A03, new C1307Sx(this.A02), new C1947hS(this.A01), abstractC2066jdA02);
        }
        return new C4T(this.A02, this.A03, new C1307Sx(this.A02), new C1947hS(this.A01), abstractC2066jdA02);
    }

    private final MT A0A() {
        return new MT(this.A02, this.A01);
    }

    private MI A0B(RelativeLayout relativeLayout) {
        MI mi = new MI(this.A02, new C1946hR(this), this.A03, new C1947hS(this.A01));
        mi.A05(relativeLayout);
        mi.A04(this.A00.getIntExtra(A0K(123, 27, 91), 200));
        YB.A0N(relativeLayout, DefaultRenderer.BACKGROUND_COLOR);
        return mi;
    }

    private AnonymousClass66 A0C() {
        C07787n c07787nA02 = A02();
        if (c07787nA02 == null) {
            return null;
        }
        return new AnonymousClass66(this.A02, this.A03, new C1947hS(this.A01), c07787nA02, new MH(), 1);
    }

    private AnonymousClass66 A0D() {
        C07767l c07767lA03 = A03();
        if (c07767lA03 == null) {
            return null;
        }
        return new AnonymousClass66(this.A02, this.A03, new C1947hS(this.A01), c07767lA03, new MG(), 0);
    }

    private JD A0E() {
        C1685dC c1685dCA02;
        AbstractC2066jd abstractC2066jdA00 = A00();
        if (abstractC2066jdA00 == null || (c1685dCA02 = AbstractC1686dD.A02(abstractC2066jdA00.A1D())) == null) {
            return null;
        }
        return new JD(this.A02, new C1947hS(this.A01), c1685dCA02, abstractC2066jdA00.A2E());
    }

    private C0983Ge A0F(WK wk) {
        ZU mg;
        InterfaceC1442Yh anonymousClass77;
        C2060jT c2060jTA01 = A01();
        if (c2060jTA01 == null) {
            return null;
        }
        if (wk == WK.A04) {
            mg = new MH();
            anonymousClass77 = new C1947hS(this.A01);
        } else {
            mg = new MG();
            anonymousClass77 = new AnonymousClass77(this.A01);
        }
        return new C0983Ge(this.A02, mg, this.A03, c2060jTA01, new C1307Sx(this.A02), anonymousClass77);
    }

    private C07104x A0G() {
        C07787n c07787nA02 = A02();
        if (c07787nA02 != null) {
            return new C07104x(this.A02, new MH(), this.A03, c07787nA02, new C1307Sx(this.A02), new C1947hS(this.A01));
        }
        if (A05[1].charAt(5) != 'X') {
            throw new RuntimeException();
        }
        A05[3] = "TvLwsmu9uaa0faVP4fF8b7PGg31O8U7I";
        return null;
    }

    private C4V A0H() {
        C07787n c07787nA02 = A02();
        if (c07787nA02 == null) {
            return null;
        }
        return new C4V(this.A02, new MH(), this.A03, c07787nA02, new C1307Sx(this.A02), new C1947hS(this.A01));
    }

    private C4V A0I() {
        C07767l c07767lA03 = A03();
        if (c07767lA03 == null) {
            return null;
        }
        return new C4V(this.A02, new MG(), this.A03, c07767lA03, new C1307Sx(this.A02), new AnonymousClass77(this.A01));
    }

    private GB A0J(WK wk) {
        AbstractC2066jd abstractC2066jdA02;
        AbstractC2066jd abstractC2066jdA022;
        if (wk == WK.A0J) {
            abstractC2066jdA02 = A03();
            if (abstractC2066jdA02 == null || (abstractC2066jdA022 = A03()) == null) {
                return null;
            }
        } else if (wk != WK.A0E || (abstractC2066jdA02 = A02()) == null || (abstractC2066jdA022 = A02()) == null) {
            return null;
        }
        return new GB(this.A02, this.A03, abstractC2066jdA02, abstractC2066jdA022, new AnonymousClass77(this.A01), this.A01, wk);
    }

    public final InterfaceC1443Yi A0M(WK wk, RelativeLayout relativeLayout) throws NumberFormatException {
        if (wk == null) {
            return null;
        }
        switch (C1267Ri.A00[wk.ordinal()]) {
            case 1:
                if (relativeLayout != null) {
                    return A0B(relativeLayout);
                }
                return null;
            case 2:
            case 3:
                return A09(wk);
            case 4:
                return A0I();
            case 5:
                return A07();
            case 6:
                InterfaceC1443Yi interfaceC1443YiA05 = A05();
                if (A05[4].charAt(13) != '3') {
                    A05[1] = "IIJ0HXviRARge0yizoGTY0JUA2Nzjczv";
                    return interfaceC1443YiA05;
                }
                String[] strArr = A05;
                strArr[6] = "UHMFNKnwuKHYyMbevaCPtufG1H9dhH1t";
                strArr[2] = "s6UgSHR7PtydXMVItCKPjBxPhDp7nABU";
                return interfaceC1443YiA05;
            case 7:
                return A0H();
            case 8:
                return A0G();
            case 9:
                return A06();
            case 10:
                return A0E();
            case 11:
                AnonymousClass66 anonymousClass66A0C = A0C();
                if (A05[5].charAt(3) != 'i') {
                    throw new RuntimeException();
                }
                A05[3] = "7AQwH6OZkLua7JLoKEhUfmskdEmJStMK";
                return anonymousClass66A0C;
            case 12:
                return A0D();
            case 13:
            case 14:
                return A0F(wk);
            case 15:
                return A0A();
            case 16:
            case 17:
                return A0J(wk);
            default:
                return null;
        }
    }
}
