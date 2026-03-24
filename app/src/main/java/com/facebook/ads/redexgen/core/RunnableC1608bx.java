package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.bx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1608bx implements Runnable {
    public final /* synthetic */ C1084Kc A00;

    public RunnableC1608bx(C1084Kc c1084Kc) {
        this.A00 = c1084Kc;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A03 = true;
            if (((AbstractC1614c3) this.A00).A07.A0D() != null) {
                ((AbstractC1614c3) this.A00).A07.A0D().AFw(true);
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
