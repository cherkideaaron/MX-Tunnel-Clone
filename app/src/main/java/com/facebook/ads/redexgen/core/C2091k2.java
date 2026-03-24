package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.k2, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2091k2 implements InterfaceC1674d1 {
    public final /* synthetic */ AnonymousClass81 A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1674d1
    public final void AAn() {
        String strA00 = this.A00.A03.A2C().A00();
        if (TextUtils.isEmpty(strA00)) {
            return;
        }
        X6.A0O(new X6(), this.A00.A04, XB.A00(strA00), this.A00.A7O());
    }

    public C2091k2(AnonymousClass81 anonymousClass81) {
        this.A00 = anonymousClass81;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1674d1
    public final void ADm(AnonymousClass62 anonymousClass62) {
        new Handler(Looper.getMainLooper()).postDelayed(new C2092k3(this, anonymousClass62), 1L);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1674d1
    public final void AE2() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1674d1
    public final void AGC(View view, MotionEvent motionEvent) {
    }
}
