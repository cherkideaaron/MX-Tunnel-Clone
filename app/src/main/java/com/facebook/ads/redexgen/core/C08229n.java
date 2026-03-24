package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.os.Looper;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* renamed from: com.facebook.ads.redexgen.X.9n, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C08229n extends AbstractC2316nv implements DI {
    public long A00;
    public InterfaceC07325t A01;
    public InterfaceC2142ku<InterfaceExecutorC0955Fb> A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final AnonymousClass32 A07;
    public final C2450q7 A08;
    public final C5Y A09;
    public final A6 A0A;
    public final DC A0B;
    public final FF A0C;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ku != com.google.common.base.Supplier<com.facebook.ads.androidx.media3.exoplayer.util.ReleasableExecutor> */
    @MetaExoPlayerCustomization("Allow for passing a new drmSessionManager")
    public C08229n(C2450q7 c2450q7, C5Y c5y, DC dc, A6 a6, FF ff, int i, InterfaceC2142ku<InterfaceExecutorC0955Fb> interfaceC2142ku) {
        this.A07 = (AnonymousClass32) AbstractC06853y.A01(c2450q7.A03);
        this.A08 = c2450q7;
        this.A09 = c5y;
        this.A0B = dc;
        this.A0A = a6 == null ? A6.A00 : a6;
        this.A0C = ff;
        this.A06 = i;
        this.A04 = true;
        this.A00 = -9223372036854775807L;
        this.A02 = interfaceC2142ku;
    }

    private void A00() {
        final Timeline c08219m = new C08219m(this.A00, this.A05, false, this.A03, null, this.A08);
        if (this.A04) {
            Timeline timeline = new C9t(c08219m) { // from class: com.facebook.ads.redexgen.X.1e
                @Override // com.facebook.ads.redexgen.core.C9t, com.facebook.ads.androidx.media3.common.Timeline
                public final C2428pl A0I(int i, C2428pl c2428pl, boolean z) {
                    super.A0I(i, c2428pl, z);
                    c2428pl.A05 = true;
                    return c2428pl;
                }

                @Override // com.facebook.ads.redexgen.core.C9t, com.facebook.ads.androidx.media3.common.Timeline
                public final C2426pj A0L(int i, C2426pj c2426pj, long j) {
                    super.A0L(i, c2426pj, j);
                    c2426pj.A0F = true;
                    return c2426pj;
                }
            };
            c08219m = timeline;
        }
        A05(c08219m);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2316nv
    public final void A09() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2316nv
    public final void A0A(InterfaceC07325t interfaceC07325t) {
        this.A01 = interfaceC07325t;
        this.A0A.AH4();
        this.A0A.AJe((Looper) AbstractC06853y.A01(Looper.myLooper()), A00());
        A00();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0899Cx
    @MetaExoPlayerCustomization("PlayerId needs to be set")
    public final InterfaceC2310np A5W(C2309no c2309no, F0 f0, long j) {
        InterfaceExecutorC0955Fb interfaceExecutorC0955Fb;
        InterfaceC2397pF interfaceC2397pFA5I = this.A09.A5I();
        if (this.A01 != null) {
            interfaceC2397pFA5I.A43(this.A01);
        }
        Uri uri = this.A07.A00;
        DD ddA5X = this.A0B.A5X(C8O.A03);
        A6 a6 = this.A0A;
        A1 a1A01 = A01(c2309no);
        FF ff = this.A0C;
        D8 d8A02 = A02(c2309no);
        String str = this.A07.A04;
        int i = this.A06;
        if (this.A02 != null) {
            interfaceExecutorC0955Fb = this.A02.get();
        } else {
            interfaceExecutorC0955Fb = null;
        }
        return new C08249p(uri, interfaceC2397pFA5I, ddA5X, a6, a1A01, ff, d8A02, this, f0, str, i, interfaceExecutorC0955Fb);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0899Cx
    public final void ACT() {
    }

    @Override // com.facebook.ads.redexgen.core.DI
    public final void AG0(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.A00;
        }
        if (!this.A04 && this.A00 == j && this.A05 == z && this.A03 == z2) {
            return;
        }
        this.A00 = j;
        this.A05 = z;
        this.A03 = z2;
        this.A04 = false;
        A00();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0899Cx
    public final void AHk(InterfaceC2310np interfaceC2310np) {
        ((C08249p) interfaceC2310np).A0a();
    }
}
