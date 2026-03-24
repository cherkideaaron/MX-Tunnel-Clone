package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.az, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1548az implements Runnable {
    public final /* synthetic */ C1549b0 A00;
    public final /* synthetic */ InterfaceC1550b1 A01;

    public RunnableC1548az(C1549b0 c1549b0, InterfaceC1550b1 interfaceC1550b1) {
        this.A00 = c1549b0;
        this.A01 = interfaceC1550b1;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A01.ACz();
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
