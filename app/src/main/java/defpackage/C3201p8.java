package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: p8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3201p8 implements As {
    public final WeakReference a;
    public final C3146o8 b = new C3146o8(this);

    public C3201p8(C3036m8 c3036m8) {
        this.a = new WeakReference(c3036m8);
    }

    @Override // defpackage.As
    public final void addListener(Runnable runnable, Executor executor) {
        this.b.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C3036m8 c3036m8 = (C3036m8) this.a.get();
        boolean zCancel = this.b.cancel(z);
        if (zCancel && c3036m8 != null) {
            c3036m8.a = null;
            c3036m8.b = null;
            c3036m8.c.h(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.a instanceof C;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}
