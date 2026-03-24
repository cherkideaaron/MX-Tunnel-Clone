package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.ch, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1654ch implements Runnable {
    public final /* synthetic */ C1064Ji A00;

    public RunnableC1654ch(C1064Ji c1064Ji) {
        this.A00 = c1064Ji;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            if (this.A00.A09 != null && this.A00.getResources().getConfiguration().orientation == 1) {
                this.A00.A09.A0A();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
