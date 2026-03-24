package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.CountDownLatch;

/* renamed from: tv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC3458tv extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        CountDownLatch countDownLatch;
        C3404sv c3404sv = (C3404sv) message.obj;
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            c3404sv.a.getClass();
            return;
        }
        RunnableC2649f4 runnableC2649f4 = c3404sv.a;
        Object obj = c3404sv.b[0];
        if (runnableC2649f4.d.get()) {
            countDownLatch = runnableC2649f4.f;
            try {
                runnableC2649f4.n.dispatchOnCancelled(runnableC2649f4, obj);
                countDownLatch.countDown();
            } finally {
            }
        } else {
            countDownLatch = runnableC2649f4.f;
            try {
                runnableC2649f4.n.dispatchOnLoadComplete(runnableC2649f4, obj);
            } finally {
            }
        }
        runnableC2649f4.c = 3;
    }
}
