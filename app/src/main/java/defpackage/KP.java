package defpackage;

import android.os.HandlerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.p002firebaseauthapi.zze;

/* loaded from: classes2.dex */
public final class KP {
    public static final Logger e = new Logger("TokenRefresher", "FirebaseAuth:");
    public volatile long a;
    public volatile long b;
    public final zze c;
    public final RunnableC3680y0 d;

    public KP(C3663xk c3663xk) {
        e.v("Initializing TokenRefresher", new Object[0]);
        C3663xk c3663xk2 = (C3663xk) Preconditions.checkNotNull(c3663xk);
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        handlerThread.start();
        this.c = new zze(handlerThread.getLooper());
        c3663xk2.a();
        this.d = new RunnableC3680y0(this, c3663xk2.b);
    }
}
