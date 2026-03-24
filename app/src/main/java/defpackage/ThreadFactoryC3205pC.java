package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: pC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC3205pC implements ThreadFactory {
    public String a;
    public int b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new C3150oC(runnable, this.a, this.b);
    }
}
