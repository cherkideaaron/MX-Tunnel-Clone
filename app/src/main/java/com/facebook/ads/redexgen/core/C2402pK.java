package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.facebook.ads.redexgen.X.pK, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2402pK implements C4W {
    public Message A00;
    public C2401pJ A01;

    public C2402pK() {
    }

    private void A00() {
        this.A00 = null;
        this.A01 = null;
        C2401pJ.A01(this);
    }

    public final C2402pK A01(Message message, C2401pJ c2401pJ) {
        this.A00 = message;
        this.A01 = c2401pJ;
        return this;
    }

    public final void A02() {
        ((Message) AbstractC06853y.A01(this.A00)).sendToTarget();
        A00();
    }

    public final boolean A03(Handler handler) {
        boolean success = handler.sendMessageAtFrontOfQueue((Message) AbstractC06853y.A01(this.A00));
        A00();
        return success;
    }
}
