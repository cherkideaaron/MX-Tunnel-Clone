package com.facebook.ads.redexgen.core;

import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Timeline;

/* renamed from: com.facebook.ads.redexgen.X.nD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2272nD extends AbstractC0950Ew {
    public static String[] A01 = {"LN1kZ6lR3vZBqqrviA4uTSOzBGS9o2bO", "mUQPITaRnEXTrG2Wr7xIAnPzPHhU6DS3", "avW0I4bwWNzzQZleeOInYpLZY9PTle7", "LGUT8ZIo3joumZn9NybI7JCchk0DSCTG", "S4WFRdtC0lcE2afHWARgiwpUU5tNPmtd", "SbOYlLigHNVPkFHrMvYK7wwtNeL", "2fmBOvz22OTh8nUuYBKjoVDFU", "lR30iWlIbuozJgbVtB9O9DOed4NJenPq"};
    public C0942Eo A00;

    public abstract Pair<C07837s[], InterfaceC2273nE[]> A0d(C0942Eo c0942Eo, int[][][] iArr, int[] iArr2, C2309no c2309no, Timeline timeline) throws AD;

    /* JADX WARN: Incorrect condition in loop: B:4:0x0005 */
    /* JADX WARN: Incorrect condition in loop: B:7:0x000d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A0Y(com.facebook.ads.redexgen.core.InterfaceC07807p[] r8, com.facebook.ads.redexgen.core.C2424pg r9, int[] r10, boolean r11) throws com.facebook.ads.redexgen.core.AD {
        /*
            int r6 = r8.length
            r5 = 0
            r7 = 1
            r4 = 0
        L4:
            int r0 = r8.length
            if (r4 >= r0) goto L39
            r3 = r8[r4]
            r2 = 0
            r1 = 0
        Lb:
            int r0 = r9.A01
            if (r1 >= r0) goto L22
            com.facebook.ads.redexgen.X.qI r0 = r9.A08(r1)
            int r0 = r3.AKM(r0)
            int r0 = com.facebook.ads.redexgen.core.AbstractC07737i.A03(r0)
            int r2 = java.lang.Math.max(r2, r0)
            int r1 = r1 + 1
            goto Lb
        L22:
            r0 = r10[r4]
            if (r0 != 0) goto L37
            r0 = 1
        L27:
            if (r2 > r5) goto L31
            if (r2 != r5) goto L34
            if (r11 == 0) goto L34
            if (r7 != 0) goto L34
            if (r0 == 0) goto L34
        L31:
            r6 = r4
            r5 = r2
            r7 = r0
        L34:
            int r4 = r4 + 1
            goto L4
        L37:
            r0 = 0
            goto L27
        L39:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AbstractC2272nD.A0Y(com.facebook.ads.redexgen.X.7p[], com.facebook.ads.redexgen.X.pg, int[], boolean):int");
    }

    public static int[] A0Z(InterfaceC07807p interfaceC07807p, C2424pg c2424pg) throws AD {
        int[] iArr = new int[c2424pg.A01];
        for (int i = 0; i < c2424pg.A01; i++) {
            iArr[i] = interfaceC07807p.AKM(c2424pg.A08(i));
        }
        return iArr;
    }

    public static int[] A0a(InterfaceC07807p[] interfaceC07807pArr) throws AD {
        int[] iArr = new int[interfaceC07807pArr.length];
        for (int i = 0; i < iArr.length; i++) {
            int iAKO = interfaceC07807pArr[i].AKO();
            String[] strArr = A01;
            String str = strArr[4];
            String str2 = strArr[1];
            int i2 = str.charAt(23);
            if (i2 == str2.charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "1ViYEGUZxGRCVXLKV1NACncyCaxKGcLE";
            strArr2[1] = "WZkUCc71MckdncxFpAml539B1oxWjr0A";
            iArr[i] = iAKO;
        }
        return iArr;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0950Ew
    public final C0951Ex A0b(InterfaceC07807p[] interfaceC07807pArr, C2291nW c2291nW, C2309no c2309no, Timeline timeline) throws AD {
        int[] rendererTrackGroupCounts;
        int[] iArr = new int[interfaceC07807pArr.length + 1];
        C2424pg[][] c2424pgArr = new C2424pg[interfaceC07807pArr.length + 1][];
        int[][][] iArr2 = new int[interfaceC07807pArr.length + 1][][];
        for (int i = 0; i < c2424pgArr.length; i++) {
            c2424pgArr[i] = new C2424pg[c2291nW.A01];
            iArr2[i] = new int[c2291nW.A01][];
        }
        int[] iArrA0a = A0a(interfaceC07807pArr);
        for (int i2 = 0; i2 < c2291nW.A01; i2++) {
            C2424pg c2424pgA05 = c2291nW.A05(i2);
            int groupIndex = A0Y(interfaceC07807pArr, c2424pgA05, iArr, c2424pgA05.A02 == 5);
            if (groupIndex == interfaceC07807pArr.length) {
                rendererTrackGroupCounts = new int[c2424pgA05.A01];
            } else {
                rendererTrackGroupCounts = A0Z(interfaceC07807pArr[groupIndex], c2424pgA05);
            }
            int i3 = iArr[groupIndex];
            c2424pgArr[groupIndex][i3] = c2424pgA05;
            iArr2[groupIndex][i3] = rendererTrackGroupCounts;
            iArr[groupIndex] = iArr[groupIndex] + 1;
        }
        C2291nW[] c2291nWArr = new C2291nW[interfaceC07807pArr.length];
        String[] strArr = new String[interfaceC07807pArr.length];
        int[] iArr3 = new int[interfaceC07807pArr.length];
        int i4 = 0;
        while (true) {
            int length = interfaceC07807pArr.length;
            String[] strArr2 = A01;
            if (strArr2[4].charAt(23) == strArr2[1].charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr3 = A01;
            strArr3[4] = "hppY0P6sht5kF7is4RCKyMBKsFUVAoRB";
            strArr3[1] = "XeHPWbHBeoBDFVDQc4DbmKa9NYqMdrJh";
            if (i4 < length) {
                int i5 = iArr[i4];
                c2291nWArr[i4] = new C2291nW((C2424pg[]) C5C.A1I(c2424pgArr[i4], i5));
                iArr2[i4] = (int[][]) C5C.A1I(iArr2[i4], i5);
                strArr[i4] = interfaceC07807pArr[i4].getName();
                iArr3[i4] = interfaceC07807pArr[i4].A9N();
                i4++;
            } else {
                C0942Eo c0942Eo = new C0942Eo(strArr, iArr3, c2291nWArr, iArrA0a, iArr2, new C2291nW((C2424pg[]) C5C.A1I(c2424pgArr[interfaceC07807pArr.length], iArr[interfaceC07807pArr.length])));
                Pair<C07837s[], InterfaceC2273nE[]> pairA0d = A0d(c0942Eo, iArr2, iArrA0a, c2309no, timeline);
                return new C0951Ex((C07837s[]) pairA0d.first, (InterfaceC2273nE[]) pairA0d.second, AbstractC0947Et.A00(c0942Eo, (InterfaceC0944Eq[]) pairA0d.second), c0942Eo);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0950Ew
    public final void A0c(Object obj) {
        this.A00 = (C0942Eo) obj;
    }
}
