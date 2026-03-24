package com.facebook.ads.redexgen.core;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.lb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2185lb implements InterfaceC1065Jj {
    public static String[] A01 = {"5dk9XJP2wGzKf", "t9Sqq8YLjeTrFPP9jF9lF", "ZSSLQReFK2RnB4Tl20", "6LiPtiUXCvNXZPkDmbiLO", "ML1syn76y5DaiFADQPhnbgz9k8Qidn9e", "l6QdmjZcy6MGH", "", "GeXYkzAGCbUHzEIcx9bq6WN7r3"};
    public static final C2185lb A02 = new C2185lb();
    public final List<C2411pT> A00;

    public C2185lb() {
        this.A00 = Collections.emptyList();
    }

    public C2185lb(C2411pT c2411pT) {
        this.A00 = Collections.singletonList(c2411pT);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1065Jj
    public final List<C2411pT> A7X(long j) {
        return j >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1065Jj
    public final long A83(int i) {
        AbstractC06853y.A07(i == 0);
        if (A01[5].length() != 13) {
            throw new RuntimeException();
        }
        A01[7] = "BSEyCnkUJKVAglTMpAGc69o360";
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1065Jj
    public final int A84() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1065Jj
    public final int A8a(long j) {
        return j < 0 ? 0 : -1;
    }
}
