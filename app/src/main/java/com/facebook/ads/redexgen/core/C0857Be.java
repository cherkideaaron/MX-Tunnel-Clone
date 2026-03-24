package com.facebook.ads.redexgen.core;

import com.google.common.collect.ParametricNullness;
import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.Be, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0857Be extends AbstractC2313ns {
    public C0857Be() {
        super(null);
    }

    private final AbstractC2313ns A00(int result) {
        if (result < 0) {
            return AbstractC2313ns.A02;
        }
        if (result > 0) {
            return AbstractC2313ns.A01;
        }
        return AbstractC2313ns.A00;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2313ns
    public final int A05() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2313ns
    public final AbstractC2313ns A06(int left, int right) {
        return A00(Integer.compare(left, right));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2313ns
    public final AbstractC2313ns A07(long left, long right) {
        return A00(Long.compare(left, right));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2313ns
    public final <T> AbstractC2313ns A08(@ParametricNullness T left, @ParametricNullness T right, Comparator<T> comparator) {
        return A00(comparator.compare(left, right));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2313ns
    public final AbstractC2313ns A09(boolean left, boolean right) {
        return A00(Boolean.compare(left, right));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2313ns
    public final AbstractC2313ns A0A(boolean left, boolean right) {
        return A00(Boolean.compare(right, left));
    }
}
