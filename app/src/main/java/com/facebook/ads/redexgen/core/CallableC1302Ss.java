package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.facebook.ads.redexgen.X.Ss, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class CallableC1302Ss implements Callable<Boolean> {
    public final BlockingQueue<Boolean> A00 = new LinkedBlockingQueue();
    public final /* synthetic */ C1307Sx A01;

    public CallableC1302Ss(C1307Sx c1307Sx, C1303St c1303St) {
        this.A01 = c1307Sx;
        new Handler(Looper.getMainLooper()).post(new C1904gl(this, c1307Sx, c1303St));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Boolean call() throws Exception {
        return this.A00.take();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(C1303St c1303St) throws SecurityException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1832fb c1832fbA06 = C1832fb.A06(this.A01.A04.A02());
        Uri uriA00 = XB.A00(c1303St.A08);
        long jA0S = c1303St.A00;
        if (jA0S == -1) {
            jA0S = C1351Up.A0S(this.A01.A04);
        }
        c1832fbA06.A0I(uriA00, new C1903gk(this, c1303St, jA0S, jCurrentTimeMillis), jA0S);
    }
}
