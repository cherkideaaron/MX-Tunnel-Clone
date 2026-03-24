package defpackage;

import android.os.Looper;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: f4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2649f4 implements Runnable {
    public static final ThreadPoolExecutor o;
    public static HandlerC3458tv p;
    public final CallableC3297qv a;
    public final C3350rv b;
    public volatile int c = 1;
    public final AtomicBoolean d = new AtomicBoolean();
    public final AtomicBoolean e = new AtomicBoolean();
    public final CountDownLatch f;
    public boolean m;
    public final /* synthetic */ AbstractC2704g4 n;

    static {
        ThreadFactoryC2843ig threadFactoryC2843ig = new ThreadFactoryC2843ig(1);
        o = new ThreadPoolExecutor(5, UserVerificationMethods.USER_VERIFY_PATTERN, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(10), threadFactoryC2843ig);
    }

    public RunnableC2649f4(AbstractC2704g4 abstractC2704g4) {
        this.n = abstractC2704g4;
        CallableC3297qv callableC3297qv = new CallableC3297qv(this);
        this.a = callableC3297qv;
        this.b = new C3350rv(this, callableC3297qv);
        this.f = new CountDownLatch(1);
    }

    public final void a(Object obj) {
        HandlerC3458tv handlerC3458tv;
        synchronized (RunnableC2649f4.class) {
            try {
                if (p == null) {
                    p = new HandlerC3458tv(Looper.getMainLooper());
                }
                handlerC3458tv = p;
            } catch (Throwable th) {
                throw th;
            }
        }
        handlerC3458tv.obtainMessage(1, new C3404sv(this, obj)).sendToTarget();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.m = false;
        this.n.executePendingTask();
    }
}
