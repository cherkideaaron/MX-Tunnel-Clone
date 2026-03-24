package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: vD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC3531vD implements Executor {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ExecutorC3531vD(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                ((Executor) this.b).execute(new RunnableC3477uD(runnable, 0));
                break;
            default:
                ((Handler) ((D3) this.b).c).post(runnable);
                break;
        }
    }
}
