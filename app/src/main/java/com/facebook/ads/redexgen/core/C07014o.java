package com.facebook.ads.redexgen.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.facebook.ads.redexgen.X.4o, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C07014o extends BroadcastReceiver {
    public final /* synthetic */ C07024p A00;

    public C07014o(C07024p c07024p) {
        this.A00 = c07024p;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int iA00 = C07024p.A00(context);
        if (C5C.A02 >= 31 && iA00 == 5) {
            C06994m.A02(context, this.A00);
        } else {
            this.A00.A07(iA00);
        }
    }
}
