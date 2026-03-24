package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ex, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0951Ex {
    public static String[] A05 = {"LpJTwMN2G", "VgMO4aUKUhad1vQS8qeWccWG6TZwybQB", "ACcLkDhyx", "Vz4L8Yk2qa8xi00BpA99exXw347yn2OW", "M93qmyVYUpuFuHp", "Ixo", "WCFkueysi57ip8GEP7BFiSRGMX4T5ofH", "LFY6A3GYQmBEHARGrOHSwwc2jPi1aXj0"};
    public final int A00;
    public final C2416pY A01;
    public final Object A02;
    public final C07837s[] A03;
    public final InterfaceC2273nE[] A04;

    public C0951Ex(C07837s[] c07837sArr, InterfaceC2273nE[] interfaceC2273nEArr, C2416pY c2416pY, Object obj) {
        this.A03 = c07837sArr;
        this.A04 = (InterfaceC2273nE[]) interfaceC2273nEArr.clone();
        this.A01 = c2416pY;
        this.A02 = obj;
        this.A00 = c07837sArr.length;
    }

    public final boolean A00(int i) {
        return this.A03[i] != null;
    }

    public final boolean A01(C0951Ex c0951Ex, int i) {
        if (c0951Ex == null) {
            return false;
        }
        C07837s[] c07837sArr = this.A03;
        if (A05[5].length() == 3) {
            A05[1] = "2a41zxf8OUQisEdMYeAN8aC4JNcLEgEy";
            if (!C5C.A1E(c07837sArr[i], c0951Ex.A03[i])) {
                return false;
            }
            InterfaceC2273nE interfaceC2273nE = this.A04[i];
            InterfaceC2273nE interfaceC2273nE2 = c0951Ex.A04[i];
            String[] strArr = A05;
            if (strArr[2].length() == strArr[0].length()) {
                A05[4] = "ShAZgc6gkhlm9OR";
                return C5C.A1E(interfaceC2273nE, interfaceC2273nE2);
            }
        }
        throw new RuntimeException();
    }
}
