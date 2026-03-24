package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.mt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2253mt implements InterfaceC1008Hd {
    public final byte[] A00 = new byte[4096];

    @Override // com.facebook.ads.redexgen.core.InterfaceC1008Hd
    public final /* synthetic */ int AIp(InterfaceC06412c interfaceC06412c, int i, boolean z) {
        return AbstractC1005Ha.A00(this, interfaceC06412c, i, z);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1008Hd
    public final /* synthetic */ void AIr(C07084v c07084v, int i) {
        AbstractC1005Ha.A01(this, c07084v, i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1008Hd
    public final void A6e(C2461qI c2461qI) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1008Hd
    public final int AIq(InterfaceC06412c interfaceC06412c, int i, boolean z, int i2) throws IOException {
        int bytesSkipped = interfaceC06412c.read(this.A00, 0, Math.min(this.A00.length, i));
        if (bytesSkipped == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return bytesSkipped;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1008Hd
    public final void AIs(C07084v c07084v, int i, int i2) {
        c07084v.A0g(i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1008Hd
    public final void AIu(long j, int i, int i2, int i3, C1006Hb c1006Hb) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1008Hd
    @MetaExoPlayerCustomization("New API added for Meta")
    public final void AKf(Uri uri) {
    }
}
