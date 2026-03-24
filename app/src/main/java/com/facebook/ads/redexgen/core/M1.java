package com.facebook.ads.redexgen.core;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* loaded from: assets/audience_network/classes2.dex */
public final class M1 extends AbstractC1249Qq<C0969Fq> {
    public int A00;
    public int A01;
    public int A02;
    public InterfaceC1442Yh A03;
    public C1846fp A04;
    public String A05;
    public List<C1739e5> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AbstractC2066jd A08;
    public final C1307Sx A09;
    public final C1901gi A0A;
    public final VA A0B;
    public final UK A0C;
    public final Y2 A0D;
    public final C6X A0E;
    public final DZ A0F;

    public M1(C1901gi c1901gi, List<C1739e5> list, AbstractC2066jd abstractC2066jd, VA va, UK uk, InterfaceC1442Yh interfaceC1442Yh, String str, C6X c6x, DZ dz) {
        this.A0A = c1901gi;
        this.A0B = va;
        this.A0C = uk;
        this.A09 = uk.A14();
        this.A04 = uk.A1G();
        this.A0D = uk.A1E();
        this.A03 = interfaceC1442Yh;
        this.A08 = abstractC2066jd;
        this.A06 = list;
        this.A05 = str;
        this.A0E = c6x;
        this.A0F = dz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC1249Qq
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C0969Fq A0F(ViewGroup viewGroup, int i) {
        return new C0969Fq(AbstractC1581bW.A00(new C1617c6(this.A0A, this.A0B, this.A03, this.A08, null, this.A04, this.A0D).A0R(this.A0F).A0N(this.A0C).A0U(), this.A0C, this.A05, this.A0E), this.A07, this.A04, this.A06.size(), this.A0A, this.A08.A2A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC1249Qq
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void A0K(C0969Fq c0969Fq, int i) {
        C1739e5 c1739e5 = this.A06.get(i);
        c0969Fq.A0q(this.A04);
        c0969Fq.A0p(c1739e5, this.A0B, this.A09, this.A0D, this.A05, this.A00, this.A02, this.A01);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1249Qq
    public final int A0B() {
        return this.A06.size();
    }

    public final void A0O(int i, int i2, int i3) {
        boolean needsUpdate = i != this.A00;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
        if (needsUpdate) {
            A0G();
        }
    }

    public final void A0P(C1846fp c1846fp) {
        this.A04 = c1846fp;
    }
}
