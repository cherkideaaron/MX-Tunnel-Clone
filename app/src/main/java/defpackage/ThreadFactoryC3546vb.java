package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: vb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC3546vb implements ThreadFactory {
    public final AtomicInteger a = new AtomicInteger(0);
    public final /* synthetic */ boolean b;

    public ThreadFactoryC3546vb(boolean z) {
        this.b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        StringBuilder sbN = AbstractC3264qG.n(this.b ? "WM.task-" : "androidx.work-");
        sbN.append(this.a.incrementAndGet());
        return new Thread(runnable, sbN.toString());
    }
}
