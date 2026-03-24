package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class E {
    public static final E d = new E(null, null);
    public final Runnable a;
    public final Executor b;
    public E c;

    public E(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
