package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.cO, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1635cO implements Runnable {
    public final /* synthetic */ KE A00;

    public RunnableC1635cO(KE ke) {
        this.A00 = ke;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A0M) {
                this.A00.A0K();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
