package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.facebook.ads.redexgen.X.2y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C06612y {
    public final Uri A00;
    public final List<Integer> A01;

    @Deprecated
    public final List<Integer> A02;
    public final Map<String, String> A03;

    @Deprecated
    public final Map<String, String> A04;
    public final UUID A05;

    @Deprecated
    public final UUID A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final byte[] A0A;

    public C06612y(C06602x c06602x) {
        byte[] bArrCopyOf;
        AbstractC06853y.A08((c06602x.A04 && c06602x.A00 == null) ? false : true);
        this.A05 = (UUID) AbstractC06853y.A01(c06602x.A03);
        this.A06 = this.A05;
        this.A00 = c06602x.A00;
        this.A04 = c06602x.A02;
        this.A03 = c06602x.A02;
        this.A08 = c06602x.A05;
        this.A07 = c06602x.A04;
        this.A09 = c06602x.A06;
        this.A02 = c06602x.A01;
        this.A01 = c06602x.A01;
        if (c06602x.A07 != null) {
            bArrCopyOf = Arrays.copyOf(c06602x.A07, c06602x.A07.length);
        } else {
            bArrCopyOf = null;
        }
        this.A0A = bArrCopyOf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C06612y)) {
            return false;
        }
        C06612y c06612y = (C06612y) obj;
        if (this.A05.equals(c06612y.A05) && C5C.A1E(this.A00, c06612y.A00) && C5C.A1E(this.A03, c06612y.A03) && this.A08 == c06612y.A08 && this.A07 == c06612y.A07 && this.A09 == c06612y.A09 && this.A01.equals(c06612y.A01) && Arrays.equals(this.A0A, c06612y.A0A)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((this.A05.hashCode() * 31) + (this.A00 != null ? this.A00.hashCode() : 0)) * 31) + this.A03.hashCode()) * 31) + (this.A08 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + (this.A09 ? 1 : 0)) * 31) + this.A01.hashCode()) * 31) + Arrays.hashCode(this.A0A);
    }
}
