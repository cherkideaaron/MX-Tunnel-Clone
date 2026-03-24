package defpackage;

import java.util.concurrent.Executor;

/* renamed from: Tg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ExecutorC0342Tg implements Executor {
    public static final ExecutorC0342Tg b = new ExecutorC0342Tg(0);
    public static final /* synthetic */ ExecutorC0342Tg c = new ExecutorC0342Tg(2);
    public final /* synthetic */ int a;

    public /* synthetic */ ExecutorC0342Tg(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                runnable.run();
                break;
            case 1:
                new Thread(runnable).start();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
