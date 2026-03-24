package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class AE implements InterfaceC2370oo, InterfaceC07807p {
    public int A00;
    public int A01;
    public long A02;
    public long A04;
    public C07837s A05;
    public C8O A06;
    public DT A07;
    public boolean A08;
    public boolean A09;
    public C2461qI[] A0A;
    public final int A0C;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "D18870411: Adding start stall debug reason")
    public EnumC2027ir A0B = EnumC2027ir.A09;
    public final C07646z A0D = new C07646z();
    public long A03 = Long.MIN_VALUE;

    public abstract void A1Z();

    public abstract void A1a(long j, boolean z) throws AD;

    public abstract void A1c(C2461qI[] c2461qIArr, long j, long j2) throws AD;

    public AE(int i) {
        this.A0C = i;
    }

    private final int A1O() {
        return this.A00;
    }

    private void A1P(long j, boolean z) throws AD {
        this.A08 = false;
        this.A02 = j;
        this.A03 = j;
        A1a(j, z);
    }

    public final int A1Q(long j) {
        return ((DT) AbstractC06853y.A01(this.A07)).AK2(j - this.A04);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Keep track of the non-adjusted timestamp")
    public final int A1R(C07646z c07646z, C2382p0 c2382p0, int i) {
        int iAHP = ((DT) AbstractC06853y.A01(this.A07)).AHP(c07646z, c2382p0, i);
        if (iAHP == -4) {
            if (c2382p0.A05()) {
                this.A03 = Long.MIN_VALUE;
                return this.A08 ? -4 : -3;
            }
            c2382p0.A00 = c2382p0.A01;
            c2382p0.A01 += this.A04;
            this.A03 = Math.max(this.A03, c2382p0.A01);
        } else if (iAHP == -5) {
            C2461qI c2461qI = (C2461qI) AbstractC06853y.A01(c07646z.A00);
            if (c2461qI.A0M != Long.MAX_VALUE) {
                c07646z.A00 = c2461qI.A07().A0s(c2461qI.A0M + this.A04).A14();
            }
        }
        return iAHP;
    }

    public final AD A1S(Throwable th, C2461qI c2461qI, int i) {
        return A1T(th, c2461qI, false, i);
    }

    public final AD A1T(Throwable th, C2461qI c2461qI, boolean z, int i) {
        int iA03 = 4;
        if (c2461qI != null && !this.A09) {
            this.A09 = true;
            try {
                int formatSupport = AKM(c2461qI);
                iA03 = AbstractC07737i.A03(formatSupport);
            } catch (AD unused) {
            } catch (Throwable th2) {
                this.A09 = false;
                throw th2;
            }
            this.A09 = false;
        }
        return AD.A04(th, getName(), A1O(), c2461qI, iA03, z, i);
    }

    public final C07646z A1U() {
        this.A0D.A00();
        return this.A0D;
    }

    public final C07837s A1V() {
        return (C07837s) AbstractC06853y.A01(this.A05);
    }

    public final C8O A1W() {
        return (C8O) AbstractC06853y.A01(this.A06);
    }

    public void A1X() throws AD {
    }

    public void A1Y() {
    }

    public void A1b(boolean z, boolean z2) throws AD {
    }

    public final boolean A1d() {
        return A9p() ? this.A08 : ((DT) AbstractC06853y.A01(this.A07)).AAe();
    }

    public final C2461qI[] A1e() {
        return (C2461qI[]) AbstractC06853y.A01(this.A0A);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2370oo
    public final void A5x() {
        AbstractC06853y.A08(this.A01 == 1);
        this.A0D.A00();
        this.A01 = 0;
        this.A07 = null;
        this.A0A = null;
        this.A08 = false;
        A1Z();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2370oo
    public final void A6L(C07837s c07837s, C2461qI[] c2461qIArr, DT dt, long j, boolean z, boolean z2, long j2, long j3) throws AD {
        AbstractC06853y.A08(this.A01 == 0);
        this.A05 = c07837s;
        this.A01 = 1;
        A1b(z, z2);
        AIa(c2461qIArr, dt, j2, j3);
        A1P(j, z);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2370oo
    public final InterfaceC07807p A7D() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2370oo
    public AnonymousClass78 A8T() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2370oo
    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "D18870411: Adding start stall debug reason")
    public final EnumC2027ir A99() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2370oo
    public final int A9A() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2370oo
    public final DT A9D() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2370oo, com.facebook.ads.redexgen.core.InterfaceC07807p
    public final int A9N() {
        return this.A0C;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC07677c
    public void A9i(int i, Object obj) throws AD {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2370oo
    public final boolean A9p() {
        return this.A03 == Long.MIN_VALUE;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2370oo
    public final void AA9(int i, C8O c8o) {
        this.A00 = i;
        this.A06 = c8o;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2370oo
    public final boolean AAN() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2370oo
    public final void ACU() throws IOException {
        ((DT) AbstractC06853y.A01(this.A07)).ACR();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2370oo
    public final void AIa(C2461qI[] c2461qIArr, DT dt, long j, long j2) throws AD {
        AbstractC06853y.A08(!this.A08);
        this.A07 = dt;
        if (this.A03 == Long.MIN_VALUE) {
            this.A03 = j;
        }
        this.A0A = c2461qIArr;
        this.A04 = j2;
        A1c(c2461qIArr, j, j2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2370oo
    public final void AIm(long j) throws AD {
        A1P(j, false);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2370oo
    public final void AJN() {
        this.A08 = true;
    }

    public int AKO() throws AD {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2370oo
    public final void start() throws AD {
        AbstractC06853y.A08(this.A01 == 1);
        this.A01 = 2;
        A1X();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2370oo
    public final void stop() {
        AbstractC06853y.A08(this.A01 == 2);
        this.A01 = 1;
        A1Y();
    }
}
