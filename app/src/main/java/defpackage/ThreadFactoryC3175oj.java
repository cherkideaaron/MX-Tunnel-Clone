package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: oj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ThreadFactoryC3175oj implements ThreadFactory {
    public final /* synthetic */ String a = "awaitEvenIfOnMainThread task continuation executor";
    public final /* synthetic */ AtomicLong b;

    public ThreadFactoryC3175oj(AtomicLong atomicLong) {
        this.b = atomicLong;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = Executors.defaultThreadFactory().newThread(new C3120nj(runnable));
        threadNewThread.setName(this.a + this.b.getAndIncrement());
        return threadNewThread;
    }
}
