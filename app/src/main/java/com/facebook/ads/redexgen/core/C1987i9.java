package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.i9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1987i9 implements InterfaceC1205Ou {
    private C1206Ov A00(InterfaceC1204Ot interfaceC1204Ot) {
        return (C1206Ov) interfaceC1204Ot.A7E();
    }

    public final void A01(InterfaceC1204Ot interfaceC1204Ot) {
        if (!interfaceC1204Ot.A9R()) {
            interfaceC1204Ot.AJl(0, 0, 0, 0);
            return;
        }
        float fA8S = A8S(interfaceC1204Ot);
        float fA8r = A8r(interfaceC1204Ot);
        float elevation = AbstractC1208Ox.A00(fA8S, fA8r, interfaceC1204Ot.A8q());
        int vPadding = (int) Math.ceil(elevation);
        float elevation2 = AbstractC1208Ox.A01(fA8S, fA8r, interfaceC1204Ot.A8q());
        int iCeil = (int) Math.ceil(elevation2);
        interfaceC1204Ot.AJl(vPadding, iCeil, vPadding, iCeil);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1205Ou
    public final ColorStateList A71(InterfaceC1204Ot interfaceC1204Ot) {
        return A00(interfaceC1204Ot).A05();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1205Ou
    public final float A7v(InterfaceC1204Ot interfaceC1204Ot) {
        return interfaceC1204Ot.A7F().getElevation();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1205Ou
    public final float A8S(InterfaceC1204Ot interfaceC1204Ot) {
        return A00(interfaceC1204Ot).A03();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1205Ou
    public final float A8X(InterfaceC1204Ot interfaceC1204Ot) {
        return A8r(interfaceC1204Ot) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1205Ou
    public final float A8Y(InterfaceC1204Ot interfaceC1204Ot) {
        return A8r(interfaceC1204Ot) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1205Ou
    public final float A8r(InterfaceC1204Ot interfaceC1204Ot) {
        return A00(interfaceC1204Ot).A04();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1205Ou
    public final void AAE() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1205Ou
    public final void AAG(InterfaceC1204Ot interfaceC1204Ot, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C1206Ov background = new C1206Ov(colorStateList, f);
        interfaceC1204Ot.AJK(background);
        View view = interfaceC1204Ot.A7F();
        view.setClipToOutline(true);
        view.setElevation(f2);
        AJX(interfaceC1204Ot, f3);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1205Ou
    public final void ADP(InterfaceC1204Ot interfaceC1204Ot) {
        AJX(interfaceC1204Ot, A8S(interfaceC1204Ot));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1205Ou
    public final void AFT(InterfaceC1204Ot interfaceC1204Ot) {
        AJX(interfaceC1204Ot, A8S(interfaceC1204Ot));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1205Ou
    public final void AJJ(InterfaceC1204Ot interfaceC1204Ot, ColorStateList colorStateList) {
        A00(interfaceC1204Ot).A08(colorStateList);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1205Ou
    public final void AJP(InterfaceC1204Ot interfaceC1204Ot, float f) {
        interfaceC1204Ot.A7F().setElevation(f);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1205Ou
    public final void AJX(InterfaceC1204Ot interfaceC1204Ot, float f) {
        A00(interfaceC1204Ot).A07(f, interfaceC1204Ot.A9R(), interfaceC1204Ot.A8q());
        A01(interfaceC1204Ot);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1205Ou
    public final void AJj(InterfaceC1204Ot interfaceC1204Ot, float f) {
        A00(interfaceC1204Ot).A06(f);
    }
}
