package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.Comparator;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.ns, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2313ns {
    public static final AbstractC2313ns A00 = new C0857Be();
    public static final AbstractC2313ns A02 = new C0855Bc(-1);
    public static final AbstractC2313ns A01 = new C0855Bc(1);

    public abstract int A05();

    public abstract AbstractC2313ns A06(int left, int right);

    public abstract AbstractC2313ns A07(long left, long right);

    public abstract <T> AbstractC2313ns A08(@ParametricNullness T left, @ParametricNullness T right, Comparator<T> comparator);

    public abstract AbstractC2313ns A09(boolean left, boolean right);

    public abstract AbstractC2313ns A0A(boolean left, boolean right);

    public AbstractC2313ns() {
    }

    public /* synthetic */ AbstractC2313ns(C0857Be c0857Be) {
        this();
    }

    public static AbstractC2313ns A01() {
        return A00;
    }
}
