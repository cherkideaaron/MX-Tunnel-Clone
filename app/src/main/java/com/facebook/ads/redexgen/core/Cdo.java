package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.do, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class Cdo {
    public String A02;
    public String A03;
    public String A04;
    public final NY A06;
    public final C1171Nm A07;
    public final C1901gi A08;
    public C1159Na A01 = C1159Na.A01(null);
    public int A00 = 1000;
    public boolean A05 = false;

    public Cdo(C1901gi c1901gi, NY ny, C1171Nm c1171Nm) {
        this.A08 = c1901gi;
        this.A06 = ny;
        this.A07 = c1171Nm;
    }

    public final Cdo A09(int i) {
        this.A00 = i;
        return this;
    }

    public final Cdo A0A(C1159Na c1159Na) {
        this.A01 = c1159Na;
        return this;
    }

    public final Cdo A0B(String str) {
        this.A04 = str;
        return this;
    }

    public final Cdo A0C(String str) {
        this.A02 = str;
        return this;
    }

    public final Cdo A0D(String str) {
        this.A03 = str;
        return this;
    }

    public final Cdo A0E(boolean z) {
        this.A05 = z;
        return this;
    }

    public final C1724dq A0F() {
        return new C1724dq(this, null);
    }
}
