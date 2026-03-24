package com.facebook.ads.redexgen.core;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Fp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0968Fp extends AbstractC1249Qq<FY> {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AbstractC1436Yb A04;
    public InterfaceC1442Yh A05;
    public String A06;
    public List<C1739e5> A07;
    public boolean A08;
    public final SparseBooleanArray A09 = new SparseBooleanArray();
    public final AbstractC2066jd A0A;
    public final C1307Sx A0B;
    public final C1901gi A0C;
    public final VA A0D;
    public final Y2 A0E;
    public final C0977Fy A0F;
    public final C1846fp A0G;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C0968Fp(C1901gi c1901gi, List<C1739e5> list, AbstractC2066jd abstractC2066jd, VA va, C1307Sx c1307Sx, C1846fp c1846fp, Y2 y2, InterfaceC1442Yh interfaceC1442Yh, String str, int i, int i2, int i3, int i4, C0977Fy c0977Fy, AbstractC1436Yb abstractC1436Yb) {
        this.A0C = c1901gi;
        this.A0D = va;
        this.A0B = c1307Sx;
        this.A0G = c1846fp;
        this.A0E = y2;
        this.A05 = interfaceC1442Yh;
        this.A0A = abstractC2066jd;
        this.A07 = list;
        this.A00 = i;
        this.A03 = i4;
        this.A06 = str;
        this.A01 = i3;
        this.A02 = i2;
        this.A0F = c0977Fy;
        this.A04 = abstractC1436Yb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC1249Qq
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final FY A0F(ViewGroup viewGroup, int i) {
        return new FY(AbstractC1671cy.A00(new C1617c6(this.A0C, this.A0D, this.A05, this.A0A, null, this.A0G, this.A0E).A0P(this.A04).A0U(), this.A03, this.A06, this.A0F), this.A09, this.A0G, this.A00, this.A01, this.A02, this.A07.size(), this.A0C, this.A0A.A2A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC1249Qq
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void A0K(FY fy, int i) {
        fy.A0q(this.A07.get(i), this.A0D, this.A0B, this.A0E, this.A06);
        if (!this.A08 && i == 0) {
            fy.AJF();
            this.A08 = true;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1249Qq
    public final int A0B() {
        return this.A07.size();
    }
}
