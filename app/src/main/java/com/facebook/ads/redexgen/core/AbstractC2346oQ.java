package com.facebook.ads.redexgen.core;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.facebook.ads.redexgen.X.oQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2346oQ implements InterfaceC06713k {
    public boolean A04;
    public ByteBuffer A02 = InterfaceC06713k.A00;
    public ByteBuffer A03 = InterfaceC06713k.A00;
    public C06693i A00 = C06693i.A05;
    public C06693i A01 = C06693i.A05;
    public C06693i A05 = C06693i.A05;
    public C06693i A06 = C06693i.A05;

    public abstract C06693i A09(C06693i c06693i) throws C06703j;

    public final ByteBuffer A00(int i) {
        if (this.A02.capacity() < i) {
            this.A02 = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.A02.clear();
        }
        this.A03 = this.A02;
        return this.A02;
    }

    public final boolean A01() {
        return this.A03.hasRemaining();
    }

    public void A0A() {
    }

    public void A0B() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC06713k
    public final C06693i A57(C06693i c06693i) throws C06703j {
        this.A00 = c06693i;
        this.A01 = A09(c06693i);
        return AAL() ? this.A01 : C06693i.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC06713k
    public ByteBuffer A8d() {
        ByteBuffer byteBuffer = this.A03;
        ByteBuffer outputBuffer = InterfaceC06713k.A00;
        this.A03 = outputBuffer;
        return byteBuffer;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC06713k
    public boolean AAL() {
        return this.A01 != C06693i.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC06713k
    public boolean AAP() {
        return this.A04 && this.A03 == InterfaceC06713k.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC06713k
    public final void AHG() {
        this.A04 = true;
        A0B();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC06713k
    public final void flush() {
        this.A03 = InterfaceC06713k.A00;
        this.A04 = false;
        this.A05 = this.A00;
        this.A06 = this.A01;
        A0A();
    }
}
