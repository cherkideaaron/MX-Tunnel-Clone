package com.facebook.ads.redexgen.core;

import java.io.ByteArrayInputStream;

/* renamed from: com.facebook.ads.redexgen.X.kq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2139kq implements InterfaceC1119Ll {
    public ByteArrayInputStream A00;
    public final byte[] A01;

    public C2139kq(byte[] bArr) {
        this.A01 = bArr;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1119Ll
    public final void AGj(int i) throws C2136kn {
        this.A00 = new ByteArrayInputStream(this.A01);
        this.A00.skip(i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1119Ll
    public final void close() throws C2136kn {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1119Ll
    public final int length() throws C2136kn {
        return this.A01.length;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1119Ll
    public final int read(byte[] bArr) throws C2136kn {
        return this.A00.read(bArr, 0, bArr.length);
    }
}
