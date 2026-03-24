package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.a2, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1489a2 implements Runnable {
    public final /* synthetic */ C1491a4 A00;

    public RunnableC1489a2(C1491a4 c1491a4) {
        this.A00 = c1491a4;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A02.getVisibility() == 0) {
                this.A00.A07(8);
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
