package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: kO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC2942kO implements ThreadFactory {
    public int a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
        threadNewThread.setName("WorkManager-WorkTimer-thread-" + this.a);
        this.a = this.a + 1;
        return threadNewThread;
    }
}
