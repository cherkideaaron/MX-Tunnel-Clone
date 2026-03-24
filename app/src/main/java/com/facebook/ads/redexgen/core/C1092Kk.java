package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Kk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1092Kk implements Comparable<C1092Kk> {
    public final int A00;
    public final C1083Kb A01;

    public C1092Kk(int i, C1083Kb c1083Kb) {
        this.A00 = i;
        this.A01 = c1083Kb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C1092Kk c1092Kk) {
        return Integer.compare(this.A00, c1092Kk.A00);
    }
}
